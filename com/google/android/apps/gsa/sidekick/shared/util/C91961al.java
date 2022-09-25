package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.al */
/* compiled from: PG */
public final class C91961al {
    /* renamed from: a */
    public static int m150917a(Resources resources, int i) {
        int i2;
        switch (i - 1) {
            case 1:
                i2 = R.dimen.qp_third_party_logo_size;
                break;
            case 2:
                i2 = R.dimen.qp_h1_icon_size;
                break;
            case 3:
                i2 = R.dimen.qp_h2_icon_size;
                break;
            case 4:
                i2 = R.dimen.qp_h3_icon_size;
                break;
            case 5:
                i2 = R.dimen.qp_h4_icon_size;
                break;
            case 6:
                i2 = R.dimen.qp_h5_icon_size;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 != 0) {
            return resources.getDimensionPixelSize(i2);
        }
        return 0;
    }

    /* renamed from: b */
    public static void m150918b(Resources resources, View view, int i) {
        int a = m150917a(resources, i);
        if (a > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = a;
            layoutParams.height = a;
            view.setLayoutParams(layoutParams);
        }
    }
}
