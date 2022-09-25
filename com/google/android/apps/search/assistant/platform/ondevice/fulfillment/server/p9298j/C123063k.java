package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.Locale;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.k */
/* compiled from: PG */
final class C123063k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f340624a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f340625b;

    public C123063k(String str, C70862aj ajVar) {
        this.f340624a = str;
        this.f340625b = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String format = String.format(Locale.US, "Safety check failed in %s", new Object[]{this.f340624a});
        ((C59052c) ((C59052c) ((C59052c) C123064l.f340626a.mo56225c()).mo56382g(th)).mo56372aa(35116)).mo56389s("%s", format);
        this.f340625b.mo20122b(Status.f186915m.mo61678e(th).withDescription(format).asException());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
