package android.support.p033v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.view.a */
/* compiled from: PG */
public final class C0433a {
    /* renamed from: a */
    public static final int m1392a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: b */
    public static final int m1393b(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: c */
    public static final int m1394c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0338a.f1065a, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!m1395d(context)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: d */
    public static final boolean m1395d(Context context) {
        return context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
