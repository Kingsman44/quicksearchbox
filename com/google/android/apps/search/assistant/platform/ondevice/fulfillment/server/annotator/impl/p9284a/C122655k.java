package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122406ay;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122407az;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.k */
/* compiled from: PG */
public final /* synthetic */ class C122655k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C122659o f339894a;

    /* renamed from: b */
    public final /* synthetic */ String f339895b;

    public /* synthetic */ C122655k(C122659o oVar, String str) {
        this.f339894a = oVar;
        this.f339895b = str;
    }

    public final Object call() {
        C122659o oVar = this.f339894a;
        byte[] k = oVar.f339903f.f339882a.mo58310k(this.f339895b);
        C122406ay ayVar = (C122406ay) C122407az.f339353b.createBuilder();
        if (k != null) {
            C63088z A = C63088z.m96139A(k);
            ayVar.copyOnWrite();
            ((C122407az) ayVar.instance).f339355a = A;
        }
        return (C122407az) ayVar.build();
    }
}
