package pt.fyi.infinitum_ui.modules.object.list;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pt.fyi.infinitum_ui.R;

public class ListFragment extends Fragment {

    private ListParams mParams;
    private RecyclerView mRecyclerView;

    public static ListFragment newInstance(ListParams params) {
        ListFragment fragment = new ListFragment();
        fragment.mParams = params;
        return  fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = view.findViewById(R.id.list_recycler_view);
        mRecyclerView.setBackgroundColor(mParams.getLayout().background);
        mRecyclerView.setHorizontalScrollBarEnabled(false);
        mRecyclerView.setVerticalScrollBarEnabled(false);
        mRecyclerView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(new ListAdapter(mParams));
    }
}
