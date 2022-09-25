package com.google.android.apps.gsa.shared.util;

import android.app.Activity;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.c */
/* compiled from: PG */
public final class C90779c {

    /* renamed from: a */
    private static final C59071e f253871a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c");

    /* renamed from: a */
    public static void m148334a(Activity activity, int i) {
        try {
            activity.setRequestedOrientation(i);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f253871a.mo56226d()).mo56382g(e)).mo56372aa(11306)).mo56386p("safeSetRequestedOrientation: Unable to setRequestedOrientation.");
        }
    }
}
