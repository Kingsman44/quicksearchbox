package com.google.android.apps.search.googleapp.discover.streamui.p10230f;

import android.support.p031v4.app.Fragment;
import android.util.DisplayMetrics;
import com.google.android.apps.search.googleapp.discover.p10199k.C134456b;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.f.a */
/* compiled from: PG */
public final class C134745a {
    /* renamed from: a */
    public static int m218587a(C134456b bVar, boolean z, Fragment fragment) {
        if (!m218588b(fragment)) {
            return 1;
        }
        if (z) {
            return 3;
        }
        if (bVar.mo111788b()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static boolean m218588b(Fragment fragment) {
        DisplayMetrics displayMetrics = fragment.requireContext().getResources().getDisplayMetrics();
        return ((float) displayMetrics.widthPixels) / displayMetrics.density > 640.0f;
    }
}
