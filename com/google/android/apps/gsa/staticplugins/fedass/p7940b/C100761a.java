package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7180q.C91081a;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.libraries.search.p3028l.C38569b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.a */
/* compiled from: PG */
public final class C100761a {

    /* renamed from: a */
    private static final C59071e f281653a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.b.a");

    /* renamed from: a */
    public static void m166954a(Context context) {
        if ((C91081a.m148802a() != C91084c.TRAIN || !m166955b(context)) && !m166956c(context)) {
            m166955b(context);
        }
    }

    /* renamed from: b */
    private static boolean m166955b(Context context) {
        try {
            C38569b.m67851a(context, "google_speech_jni");
            ((C59052c) ((C59052c) f281653a.mo56224b()).mo56372aa(19525)).mo56386p("Successfully loaded the Ekho(Speech) native library.");
            return true;
        } catch (UnsatisfiedLinkError e) {
            ((C59052c) ((C59052c) ((C59052c) f281653a.mo56225c()).mo56382g(e)).mo56372aa(19526)).mo56386p("Unable to load Ekho native library");
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m166956c(Context context) {
        try {
            C38569b.m67851a(context, "soda_jni_no_terse");
            ((C59052c) ((C59052c) f281653a.mo56224b()).mo56372aa(19527)).mo56386p("Successfully loaded the Ekho(Soda) native library.");
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }
}
