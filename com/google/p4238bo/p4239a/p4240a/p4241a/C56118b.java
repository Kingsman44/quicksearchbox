package com.google.p4238bo.p4239a.p4240a.p4241a;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.bo.a.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C56118b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f149515a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f149516b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f149517c;

    public /* synthetic */ C56118b(AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        this.f149515a = atomicReference;
        this.f149516b = atomicReference2;
        this.f149517c = atomicReference3;
    }

    public final Object apply(Object obj) {
        AtomicReference atomicReference = this.f149515a;
        AtomicReference atomicReference2 = this.f149516b;
        AtomicReference atomicReference3 = this.f149517c;
        C56124h hVar = new C56124h();
        hVar.mo54325d(((C70761fa) obj).f188571a);
        C56125i.m87911c(hVar, atomicReference, atomicReference2);
        if (atomicReference3.get() != null) {
            C58838bb.m90866a((C70256c) atomicReference3.get(), "Attributes must not be null.");
        }
        return hVar.mo54322a();
    }
}
