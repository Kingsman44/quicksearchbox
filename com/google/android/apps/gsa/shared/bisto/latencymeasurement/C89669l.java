package com.google.android.apps.gsa.shared.bisto.latencymeasurement;

import com.google.android.apps.gsa.shared.bisto.latencymeasurement.jni.JingleNativeDetector;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.latencymeasurement.l */
/* compiled from: PG */
public final class C89669l extends C89672o {

    /* renamed from: a */
    public static final C59071e f242788a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.latencymeasurement.l");

    /* renamed from: a */
    public final String mo83572a() {
        return "android_latency_measurement";
    }

    /* renamed from: b */
    public final synchronized void mo83573b() {
        if (mo83578c()) {
            JingleNativeDetector.release();
        }
    }
}
