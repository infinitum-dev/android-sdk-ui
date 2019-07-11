package pt.fyi.infinitum_ui.modules.menu.bottom;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import pt.fyi.infinitum_ui.R;
import pt.fyi.infinitum_ui.modules.menu.MenuEntity;

public class BottomMenuFragment extends Fragment {

    private BottomMenuParams mParams;
    private BottomNavigationView mMenu;
    private int mPrevSelected = -1;

    public static BottomMenuFragment newInstance(BottomMenuParams params) {
        BottomMenuFragment fragment = new BottomMenuFragment();
        fragment.mParams = params;
        return  fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_menu_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int[][] states = new int[][] {
                new int[] { android.R.attr.state_enabled}, // enabled
                new int[] {-android.R.attr.state_enabled}, // disabled
        };

        int[] colors = new int[] {
                mParams.getLayout().titleColor,
                Color.DKGRAY,
        };

        ColorStateList myList = new ColorStateList(states, colors);

        mMenu = view.findViewById(R.id.bottom_bar);
        mMenu.setBackgroundColor(mParams.getLayout().background);
        mMenu.setItemTextColor(myList);
        mMenu.getMenu().clear();
        for (MenuEntity m: mParams.getObjectList()) {
            mMenu.getMenu().add(Menu.NONE, m.id, Menu.NONE, m.title).setIcon(m.image);
        }

        mMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int selectedItem = menuItem.getItemId();
                System.out.println("Item selected: "+selectedItem+" \nPrevious selected: "+mPrevSelected);
                if (selectedItem != mPrevSelected) {
                    mPrevSelected = selectedItem;
                    mParams.getCallback().itemSelected(selectedItem);
                    return true;
                }
                return false;
            }
        });
    }
}
