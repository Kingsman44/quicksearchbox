package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.ViewUtilities */
/* compiled from: PG */
public final class ViewUtilities {
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.utilities.ViewUtilities");

    /* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.ViewUtilities$Direction */
    /* compiled from: PG */
    public enum Direction {
        CLOCKWISE,
        COUNTER_CLOCKWISE
    }

    private ViewUtilities() {
    }

    public static int dpToPx(Context context, int i) {
        return Math.round((((float) i) * context.getResources().getDisplayMetrics().ydpi) / 160.0f);
    }

    public static int getAbsoluteX(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public static int getAbsoluteY(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public static Rect getBoundingRect(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static int getLayoutGravity(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return ((FrameLayout.LayoutParams) layoutParams).gravity;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) layoutParams).gravity;
        }
        ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42391)).mo56389s("Get layout gravity not supported for %s", viewGroup.getClass().getSimpleName());
        return 0;
    }

    public static float getScreenRatio(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (float) (displayMetrics.heightPixels / displayMetrics.widthPixels);
    }

    public static float getVerticalDp(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density;
    }

    public static int pxToDp(Context context, float f) {
        return Math.round((f * 160.0f) / context.getResources().getDisplayMetrics().ydpi);
    }

    public static void reverseOrder(LinearLayout linearLayout) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            arrayList.add(linearLayout.getChildAt(i));
        }
        linearLayout.removeAllViews();
        for (View addView : C58597ky.m90216g(arrayList)) {
            linearLayout.addView(addView);
        }
    }

    public static void rotate(View view, Direction direction) {
        rotate(view, direction, false);
    }

    private static void rotateCentering(RelativeLayout.LayoutParams layoutParams) {
        int[] rules = layoutParams.getRules();
        int i = rules[14];
        int i2 = rules[15];
        if (i != 0) {
            if (i2 == 0) {
                layoutParams.removeRule(14);
                layoutParams.addRule(15);
                return;
            } else if (i != 0) {
                return;
            }
        }
        if (i2 != 0) {
            layoutParams.removeRule(15);
            layoutParams.addRule(14);
        }
    }

    private static void rotateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, Direction direction) {
        if (direction.equals(Direction.CLOCKWISE)) {
            marginLayoutParams.setMargins(marginLayoutParams.bottomMargin, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin, marginLayoutParams.leftMargin);
        }
    }

    private static void rotateParentAlignment(RelativeLayout.LayoutParams layoutParams, Direction direction) {
        int[] rules = layoutParams.getRules();
        int i = rules[3];
        int i2 = rules[0];
        int i3 = rules[2];
        int i4 = rules[1];
        layoutParams.removeRule(3);
        layoutParams.removeRule(0);
        layoutParams.removeRule(2);
        layoutParams.removeRule(1);
        layoutParams.removeRule(16);
        layoutParams.removeRule(17);
        if (i2 != 0) {
            if (direction.equals(Direction.CLOCKWISE)) {
                layoutParams.addRule(2, i2);
            } else {
                layoutParams.addRule(3, i2);
            }
        }
        if (i != 0) {
            if (direction.equals(Direction.CLOCKWISE)) {
                layoutParams.addRule(0, i);
            } else {
                layoutParams.addRule(1, i);
            }
        }
        if (i4 != 0) {
            if (direction.equals(Direction.CLOCKWISE)) {
                layoutParams.addRule(3, i4);
            } else {
                layoutParams.addRule(2, i4);
            }
        }
        if (i3 != 0) {
            if (direction.equals(Direction.CLOCKWISE)) {
                layoutParams.addRule(1, i3);
            } else {
                layoutParams.addRule(0, i3);
            }
        }
        int i5 = rules[12];
        int i6 = rules[10];
        int i7 = rules[9];
        int i8 = rules[11];
        layoutParams.removeRule(12);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        layoutParams.removeRule(11);
        layoutParams.removeRule(20);
        layoutParams.removeRule(21);
        if (i5 != 0) {
            if (direction.equals(Direction.CLOCKWISE)) {
                layoutParams.addRule(9);
            } else {
                layoutParams.addRule(11);
            }
        }
        if (i8 != 0) {
            if (direction.equals(Direction.CLOCKWISE)) {
                layoutParams.addRule(12);
            } else {
                layoutParams.addRule(10);
            }
        }
        if (i6 != 0) {
            if (direction.equals(Direction.CLOCKWISE)) {
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(9);
            }
        }
        if (i7 == 0) {
            return;
        }
        if (direction.equals(Direction.CLOCKWISE)) {
            layoutParams.addRule(10);
        } else {
            layoutParams.addRule(12);
        }
    }

    public static void rotateRecursively(View view, Direction direction) {
        rotate(view, direction, false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                rotateRecursively(viewGroup.getChildAt(i), direction);
            }
        }
    }

    public static void setLayoutGravity(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i;
            viewGroup.setLayoutParams(layoutParams2);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = i;
            viewGroup.setLayoutParams(layoutParams3);
        } else {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42393)).mo56389s("Set layout gravity not supported for %s", viewGroup.getClass().getSimpleName());
        }
    }

    public static void setLayoutWeight(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42394)).mo56386p("View does not have a LinearLayout as its parent.");
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = (float) i;
        view.setLayoutParams(layoutParams2);
    }

    public static void rotate(View view, Direction direction, boolean z) {
        float f;
        float f2;
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            int orientation = linearLayout.getOrientation();
            linearLayout.setOrientation(orientation == 1 ? 0 : 1);
            if ((direction.equals(Direction.COUNTER_CLOCKWISE) && orientation == 0) || (direction.equals(Direction.CLOCKWISE) && orientation == 1)) {
                reverseOrder(linearLayout);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z) {
            if (direction.equals(Direction.CLOCKWISE)) {
                f2 = view.getRotation();
                f = 90.0f;
            } else {
                f2 = view.getRotation();
                f = -90.0f;
            }
            view.setRotation(f2 + f);
        } else {
            int i = layoutParams.width;
            layoutParams.width = layoutParams.height;
            layoutParams.height = i;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            rotateMargins(layoutParams2, direction);
            rotateCentering(layoutParams2);
            rotateParentAlignment(layoutParams2, direction);
            if (z) {
                int width = (view.getWidth() / 2) - (view.getHeight() / 2);
                int rotation = (int) view.getRotation();
                int[] rules = layoutParams2.getRules();
                if (rules[9] != 0) {
                    if (rotation == 0 || rotation == 180) {
                        view.setTranslationY(0.0f);
                    } else {
                        view.setTranslationX((float) (-width));
                    }
                }
                if (rules[10] != 0) {
                    if (rotation == 0 || rotation == 180) {
                        view.setTranslationX(0.0f);
                    } else {
                        view.setTranslationY((float) (-width));
                    }
                }
                if (rules[11] != 0) {
                    if (rotation == 0 || rotation == 180) {
                        view.setTranslationY(0.0f);
                    } else {
                        view.setTranslationX((float) width);
                    }
                }
                if (rules[12] != 0) {
                    if (rotation == 0 || rotation == 180) {
                        view.setTranslationX(0.0f);
                    } else {
                        view.setTranslationY((float) width);
                    }
                }
            }
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            rotateMargins((LinearLayout.LayoutParams) layoutParams, direction);
        } else {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42392)).mo56354G("Rotate clockwise for view %s with layout params %s is not supported.", view.getClass(), layoutParams.getClass());
        }
        view.setLayoutParams(layoutParams);
    }
}
