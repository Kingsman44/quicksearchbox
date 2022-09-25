package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4542m.C59344a;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.lib3.b */
/* compiled from: PG */
public final class C61860b {

    /* renamed from: a */
    private static final C58485gu f167233a = C58485gu.m89832B("textclassifier3_jni_agsa", "textclassifier3_jni_aiai", "textclassifier3_jni_aosp", "textclassifier3_jni_gmscore", "textclassifier3_jni_google3", "textclassifier3_jni_tclib", "textclassifier3_jni_tclib-experimental", "tclibapitest_jni", "nga_jni", "nga_jni_tclib_testing");

    /* renamed from: b */
    private static final C58485gu f167234b = C58485gu.m89847o("com/google/android/apps/gsa/nga/testing/headless/inject/libnga_jni_headless.so", "com/google/android/apps/gsa/nga/engine/annotators/libnga_jni_tclib_testing.so");

    /* renamed from: c */
    private static final Object f167235c = new Object();

    /* renamed from: d */
    private static Boolean f167236d;

    private C61860b() {
    }

    /* renamed from: a */
    public static void m94501a() {
        int i;
        boolean booleanValue;
        synchronized (f167235c) {
            i = 0;
            if (f167236d == null) {
                try {
                    Class.forName("com.google.knowledge.cerebra.sense.textclassifier.lib3.DoNotLoadJniLibs");
                    f167236d = false;
                } catch (ClassNotFoundException unused) {
                    f167236d = true;
                }
            }
            booleanValue = f167236d.booleanValue();
        }
        if (booleanValue) {
            C58485gu guVar = f167233a;
            int i2 = ((C58724pq) guVar).f156474d;
            int i3 = 0;
            while (i3 < i2) {
                String str = (String) guVar.get(i3);
                try {
                    System.loadLibrary(str);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    if (e.getMessage() != null && !e.getMessage().contains("findLibrary returned null") && !e.getMessage().contains("not found")) {
                        Log.w("tclib", "Failed to load ".concat(String.valueOf(str)), e);
                    }
                    i3++;
                }
            }
            C58485gu guVar2 = f167234b;
            int i4 = ((C58724pq) guVar2).f156474d;
            while (i < i4) {
                try {
                    C59344a.m92230a((String) guVar2.get(i));
                    return;
                } catch (UnsatisfiedLinkError unused2) {
                    i++;
                }
            }
            C58480gp e2 = C58485gu.m89837e();
            e2.mo55396h(f167233a);
            e2.mo55396h(f167234b);
            String join = TextUtils.join(", ", e2.mo55394f());
            String valueOf = String.valueOf(C61860b.class.getClassLoader());
            throw new UnsatisfiedLinkError("Could not load any of the native libraries: " + join + " in the classloader " + valueOf);
        }
    }
}
