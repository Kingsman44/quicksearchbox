package com.google.android.apps.gsa.search.core.google.p6797g;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.core.google.g.a */
/* compiled from: PG */
public final class C85985a {

    /* renamed from: a */
    private static int f232502a;

    /* renamed from: a */
    public static int m138246a(Resources resources) {
        int i = f232502a;
        if (i != 0) {
            return i;
        }
        int max = Math.max(resources.getDisplayMetrics().heightPixels, resources.getDisplayMetrics().widthPixels);
        f232502a = max;
        return max;
    }

    /* renamed from: b */
    public static int m138247b(Resources resources, boolean z, boolean z2) {
        int i;
        if (!z) {
            i = m138246a(resources);
        } else {
            i = resources.getDimensionPixelSize(R.dimen.max_srp_height_padding_searchplate_top_nav_bar);
        }
        return z2 ? (int) Math.ceil((double) (((float) i) / resources.getDisplayMetrics().density)) : i;
    }
}
