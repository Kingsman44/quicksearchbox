package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.ah */
/* compiled from: PG */
final class C18250ah implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f51813a;

    /* renamed from: b */
    final /* synthetic */ Level f51814b;

    /* renamed from: c */
    final /* synthetic */ C70862aj f51815c;

    public C18250ah(String str, Level level, C70862aj ajVar) {
        this.f51813a = str;
        this.f51814b = level;
        this.f51815c = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            String format = String.format(Locale.US, "Safety check failed in %s", new Object[]{this.f51813a});
            ((C59052c) ((C59052c) C18253ak.f51818a.mo56223a(this.f51814b).mo56382g(th)).mo56372aa(47079)).mo56389s("%s", format);
            C70862aj ajVar = this.f51815c;
            if (ajVar != null) {
                ajVar.mo20122b(Status.f186915m.mo61678e(th).withDescription(format).asException());
            }
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
