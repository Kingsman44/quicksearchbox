package com.google.android.apps.search.fedora.p10094c;

import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4125ay.C54646d;

/* renamed from: com.google.android.apps.search.fedora.c.b */
/* compiled from: PG */
public final class C132727b {

    /* renamed from: a */
    private static final C59071e f362153a = C59071e.m91332i("com.google.android.apps.search.fedora.c.b");

    /* renamed from: a */
    public static void m215742a(Context context) {
        C54646d.m87517d(new C132724a(context));
        try {
            C54646d.m87516c("google_speech_jni", new String[0]);
            ((C59052c) ((C59052c) f362153a.mo56224b()).mo56372aa(39803)).mo56386p("Successfully loaded the Ekho(Speech) native library.");
        } catch (UnsatisfiedLinkError e) {
            ((C59052c) ((C59052c) ((C59052c) f362153a.mo56226d()).mo56382g(e)).mo56372aa(39804)).mo56386p("Unable to load the Ekho native library.");
        }
    }
}
