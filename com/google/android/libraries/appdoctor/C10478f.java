package com.google.android.libraries.appdoctor;

import android.content.BroadcastReceiver;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.appdoctor.f */
/* compiled from: PG */
public final /* synthetic */ class C10478f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f35247a;

    /* renamed from: b */
    public final /* synthetic */ BroadcastReceiver.PendingResult f35248b;

    public /* synthetic */ C10478f(C60870cx cxVar, BroadcastReceiver.PendingResult pendingResult) {
        this.f35247a = cxVar;
        this.f35248b = pendingResult;
    }

    public final Object call() {
        AppDoctorReceiver.m25412a(this.f35247a, this.f35248b);
        return null;
    }
}
