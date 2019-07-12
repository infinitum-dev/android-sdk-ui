# Infinitum SDK UI for Android

## Installation

The Infinitum SDK UI can be added to the project using gradle.
For that to happen, add the following code in your root build.gradle at the begin of repositories:

```
allprojects {
 repositories {
  maven { url 'https://jitpack.io' }
  ...
 }
}
```

And add the dependency to your build.gradle:

```
dependencies {
 implementation 'com.github.infinitum-dev:android-sdk-ui:Tag'
}

```
The 'Tag' must be replaced with the latest version of the SDK.


## Usage

Infinitum is a library with a great variety of modules that can fit a lot of any application needs.

To use the modules, you must decide where you want to place them on your view, then you can call the Infinitum to get a fragment
for the module you need in your application.

For each submodule present in each module, there is a specific parameter class required for it, this parameters use some specific
layout description, a specific callback among other options specific for each submodule. In this matter, the submodules may require
one object or an array of objects specific for each module.

Example of usage of module List:

```java
  
  ArrayList<ObjectEntity> obj = new ArrayList();
  obj.add(new ObjectEntity(1,
                           "title nr1", 
                           "body text number one",
                            BitmapFactory.decodeResource(getResources(),
                            R.mipmap.teste_image)));
        obj.add(new ObjectEntity(2,
                                 "title nr2",
                                 "body text number one and this one is longer for the sake of testing, i believe this will work just fine and yeeeeet",
                                 BitmapFactory.decodeResource(getResources(),
                                 R.mipmap.teste_image)));
  ListParams params = new ListParams(new ListLayout(Color.RED, Color.YELLOW, Color.WHITE, Color.WHITE),
            listObj, 
            ObjectType.Simple,
            new ListCallback() {
              @Override
              public void onClick(ObjectEntity object) {
                
              }
            });
  Fragment fragment = InfinitumUI.Object.getObjectList(params);

```

And then with Fragment Manager replace your frame with the Fragment returned:

```java

  getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, fragment).commit();

```

## Modules

The Infinitum SDK UI is divided in different modules according to their objectives.

### Object

The object module has the intent of displaying information of one or multiple objects.
For that purpose, in this module we can find a variety of ways to display this information.

 - List
 - Details
 - Slideshow

#### List

In this submodule, given an array of objects, it returns a fragment with a list of all the objects passed.
It is even possible to decide what information will be displayed and how it will be displayed using one of several options on
the enum ObjectType.

#### Detail

Detail submodule has the purpose of displaying the information of a single object with more details.

#### Slideshow

This submodule will display the given information on a slideshow.

----

### Menu

The menu module has the intent of creating a way of navigate in your application.
In that matter, it disposes the following options of menus:

  - Bottom
  
#### Bottom

The purpose of this submodule is to be used as a bottom menu, with an image and a small title so the user can navigate easily
through the application without losing track of where he is and where he can go.
  
