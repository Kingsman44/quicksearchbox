package com.google.android.apps.gsa.shared.util.p7187ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.n */
/* compiled from: PG */
public final class C91115n {
    /* renamed from: a */
    public static float m148869a(float f, float f2, float f3) {
        return f3 >= f ? f3 <= f2 ? f3 : f2 : f;
    }

    /* renamed from: b */
    public static float m148870b(float f, Context context) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static Rect m148871c(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            Display o = m148883o(activity);
            if (o != null) {
                o.getMetrics(displayMetrics);
            }
        } else {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        int[] j = m148878j(activity.getWindow().getDecorView());
        int i = j[0];
        return new Rect(i, j[1], displayMetrics.widthPixels + i, j[1] + displayMetrics.heightPixels);
    }

    /* renamed from: d */
    public static void m148872d(Activity activity) {
        Rect c = m148871c(activity);
        activity.requestWindowFeature(1);
        activity.getWindow().setType(3);
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.width = c.width();
        attributes.height = c.height();
        activity.getWindow().setAttributes(attributes);
    }

    /* renamed from: e */
    public static void m148873e(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        marginLayoutParams.setMargins(i, i2, i3, i4);
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i3);
    }

    /* renamed from: f */
    public static void m148874f(View view, int i, int i2) {
        int i3;
        int i4;
        int paddingTop = i == 0 ? i2 : view.getPaddingTop();
        if (i == 1) {
            i3 = i2;
        } else {
            i3 = view.getPaddingBottom();
        }
        if (i == 2) {
            i4 = i2;
        } else {
            i4 = view.getPaddingStart();
        }
        if (i != 3) {
            i2 = view.getPaddingEnd();
        }
        view.setPaddingRelative(i4, paddingTop, i2, i3);
    }

    /* renamed from: g */
    public static boolean m148875g() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* renamed from: h */
    public static boolean m148876h(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: i */
    public static boolean m148877i(View view, MotionEvent motionEvent) {
        int[] j = m148878j(view);
        if (view.getVisibility() == 0) {
            int i = j[0];
            if (new Rect(i, j[1], view.getWidth() + i, j[1] + view.getHeight()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static int[] m148878j(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: k */
    public static float m148879k(float f, float f2, float f3, float f4) {
        return f3 + (((1.0f - f3) * (m148869a(f, f2, f4) - f)) / (f2 - f));
    }

    /* renamed from: l */
    public static void m148880l(TextView textView, Drawable drawable, Drawable drawable2) {
        int i = 0;
        if (drawable == null && drawable2 == null) {
            int compoundDrawablePadding = textView.getCompoundDrawablePadding();
            textView.setCompoundDrawablePadding(0);
            i = compoundDrawablePadding;
        }
        textView.setCompoundDrawablesRelative(drawable, (Drawable) null, drawable2, (Drawable) null);
        if (i != 0) {
            textView.setCompoundDrawablePadding(i);
        }
    }

    /* renamed from: m */
    public static void m148881m(TextView textView, int i) {
        int i2;
        if (i == 0) {
            int compoundDrawablePadding = textView.getCompoundDrawablePadding();
            textView.setCompoundDrawablePadding(0);
            i2 = compoundDrawablePadding;
            i = 0;
        } else {
            i2 = 0;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        if (i2 != 0) {
            textView.setCompoundDrawablePadding(i2);
        }
    }

    /* renamed from: n */
    public static void m148882n(TextView textView, Drawable drawable) {
        int i = 0;
        if (drawable == null) {
            int compoundDrawablePadding = textView.getCompoundDrawablePadding();
            textView.setCompoundDrawablePadding(0);
            i = compoundDrawablePadding;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        if (i != 0) {
            textView.setCompoundDrawablePadding(i);
        }
    }

    /* renamed from: o */
    private static Display m148883o(Context context) {
        Display display;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                display = context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                display = null;
            }
            if (display != null) {
                return display;
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }
}
