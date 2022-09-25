package com.google.android.libraries.assistant.soda;

import android.content.Context;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4542m.C59344a;
import com.p278b.p279a.C5494c;
import com.p278b.p279a.C5496e;

/* renamed from: com.google.android.libraries.assistant.soda.ae */
/* compiled from: PG */
public final class C19242ae {

    /* renamed from: a */
    public static final C58485gu f53915a = C58485gu.m89834D("google_speech_jni", "google_speech_with_aec_jni", "soda_dev_jni", "soda_jni", "soda_jni_init_google", "soda_jni_no_terse_init_google", "soda_jni_wearos", "soda_jni_wearos_init_google", "soda_with_benchmark_jni", "soda_euphonia_jni", "soda_langid_jni", "dps_soda_pixel_s_jni", "dps_soda_jni", "dps_soda_dev_jni");

    /* renamed from: b */
    public static final C58485gu f53916b = C58485gu.m89847o("soda_jni_no_terse", "soda_jni_no_terse_init_google");

    /* renamed from: c */
    private static final C59071e f53917c = C59071e.m91332i("com.google.android.libraries.assistant.soda.ae");

    /* renamed from: a */
    public static void m36689a(boolean z, Context context) {
        boolean z2;
        if (z) {
            z2 = m36691c(context);
            if (!z2) {
                z2 = m36690b(context);
            }
        } else {
            z2 = m36690b(context);
            if (!z2) {
                z2 = m36691c(context);
            }
        }
        if (!z2) {
            ((C59052c) ((C59052c) f53917c.mo56225c()).mo56372aa(47664)).mo56386p("Unable to load any SODA native library");
        }
    }

    /* renamed from: b */
    private static boolean m36690b(Context context) {
        C58485gu guVar = f53915a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) guVar.get(i2);
            if (context != null) {
                try {
                    C5496e.m14213b(context, str);
                } catch (C5494c | UnsatisfiedLinkError unused) {
                    i2++;
                }
            } else {
                C59344a.m92230a(str);
            }
            ((C59052c) ((C59052c) f53917c.mo56224b()).mo56372aa(47665)).mo56389s("Loaded SODA native library: %s", str);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m36691c(Context context) {
        C58485gu guVar = f53916b;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) guVar.get(i2);
            if (context != null) {
                try {
                    C5496e.m14213b(context, str);
                } catch (C5494c | UnsatisfiedLinkError unused) {
                    i2++;
                }
            } else {
                C59344a.m92230a(str);
            }
            ((C59052c) ((C59052c) f53917c.mo56224b()).mo56372aa(47666)).mo56389s("Loaded SODA native library: %s", str);
            return true;
        }
        return false;
    }
}
