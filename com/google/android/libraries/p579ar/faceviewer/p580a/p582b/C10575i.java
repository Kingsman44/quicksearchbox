package com.google.android.libraries.p579ar.faceviewer.p580a.p582b;

import android.content.Context;
import android.os.Build;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4542m.C59344a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.b.i */
/* compiled from: PG */
public final class C10575i {

    /* renamed from: a */
    public static final String f35373a;

    /* renamed from: b */
    private static final C59071e f35374b = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.b.i");

    /* renamed from: c */
    private static final String f35375c;

    /* renamed from: d */
    private static boolean f35376d = false;

    static {
        String str = Build.SUPPORTED_ABIS[0];
        f35375c = str;
        f35373a = String.format("assets/%s/libfaceviewer_jni.so", new Object[]{str});
    }

    private C10575i() {
    }

    /* renamed from: a */
    protected static synchronized C60870cx m25550a(Context context, Executor executor, String str) {
        synchronized (C10575i.class) {
            if (f35376d) {
                C60870cx i = C60856cj.m92900i(true);
                return i;
            }
            C60870cx n = C60856cj.m92905n(new C10573g(str, context), executor);
            return n;
        }
    }

    /* renamed from: b */
    public static boolean m25551b(String str) {
        try {
            C59344a.m92230a(str);
            f35376d = true;
            ((C59052c) ((C59052c) f35374b.mo56224b()).mo56372aa(42281)).mo56386p("Native Library loaded.");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            ((C59052c) ((C59052c) ((C59052c) f35374b.mo56225c()).mo56382g(e)).mo56372aa(42282)).mo56386p("Error loading native library.");
            return false;
        }
    }
}
