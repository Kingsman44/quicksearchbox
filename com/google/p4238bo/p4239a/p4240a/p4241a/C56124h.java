package com.google.p4238bo.p4239a.p4240a.p4241a;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.bo.a.a.a.h */
/* compiled from: PG */
public final class C56124h {

    /* renamed from: a */
    public Status f149523a;

    /* renamed from: b */
    public Object f149524b;

    /* renamed from: c */
    public C70334de f149525c;

    /* renamed from: d */
    public C70334de f149526d;

    public C56124h() {
        C70256c cVar = C70256c.f187254a;
    }

    /* renamed from: a */
    public final C56125i mo54322a() {
        C58838bb.m90866a(this.f149523a, "Status must be set.");
        boolean z = true;
        if (this.f149523a.mo61679g() && (!this.f149523a.mo61679g() || this.f149524b == null)) {
            z = false;
        }
        C58838bb.m90884s(z, "Payload is mandatory when the response status is OK.");
        return new C56125i(this);
    }

    /* renamed from: b */
    public final void mo54323b(C70334de deVar) {
        C70334de deVar2 = new C70334de();
        C58838bb.m90866a(deVar, "Metadata headers must not be null.");
        deVar2.mo62032g(deVar);
        this.f149525c = deVar2;
    }

    /* renamed from: c */
    public final void mo54324c(Object obj) {
        C58838bb.m90866a(obj, "Payload must not be null.");
        this.f149524b = obj;
    }

    /* renamed from: d */
    public final void mo54325d(Status status) {
        C58838bb.m90866a(status, "Status must not be null.");
        this.f149523a = status;
    }

    /* renamed from: e */
    public final void mo54326e(C70334de deVar) {
        C70334de deVar2 = new C70334de();
        C58838bb.m90866a(deVar, "Metadata trailers must not be null.");
        deVar2.mo62032g(deVar);
        this.f149526d = deVar2;
    }
}
