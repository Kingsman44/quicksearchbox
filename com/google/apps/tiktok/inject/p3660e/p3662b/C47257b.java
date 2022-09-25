package com.google.apps.tiktok.inject.p3660e.p3662b;

import android.app.Activity;
import android.support.p031v4.app.C0167am;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.apps.tiktok.inject.e.b.b */
/* compiled from: PG */
public final class C47257b {
    /* renamed from: a */
    public static C58833ax m84060a(Activity activity) {
        if (activity != null) {
            return C58833ax.m90834k((C0167am) activity);
        }
        try {
            return C58836b.f156633a;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }
}
