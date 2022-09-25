package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.JSFutureHandler;
import p5488io.grpc.Status;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.libraries.elements.d.e.a.y */
/* compiled from: PG */
final class C20993y extends JSFutureHandler {

    /* renamed from: a */
    public C69872g f58841a;

    public C20993y(C69872g gVar) {
        this.f58841a = gVar;
    }

    public final Status onError(String str) {
        C69872g gVar = this.f58841a;
        if (gVar == null) {
            return Status.f186916n;
        }
        gVar.mo61501b(new C21260bc(str));
        return Status.f186902OK;
    }

    public final Status onSuccess() {
        C69872g gVar = this.f58841a;
        if (gVar == null) {
            return Status.f186916n;
        }
        gVar.mo61500a();
        return Status.f186902OK;
    }
}
