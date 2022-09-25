package com.google.android.gms.cast.framework.p10774b.p10775a;

import android.os.Bundle;
import com.google.android.gms.tasks.C146042v;

/* renamed from: com.google.android.gms.cast.framework.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C143418a implements C146042v {

    /* renamed from: a */
    public static final /* synthetic */ C143418a f388917a = new C143418a();

    private /* synthetic */ C143418a() {
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        Bundle bundle = (Bundle) obj;
        C143419b.f388918a = bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", 300);
        C143419b.f388919b = bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", 10000);
        C143419b.f388920c = bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS", 6000);
    }
}
