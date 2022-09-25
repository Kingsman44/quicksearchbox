package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89010ah;
import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;

/* renamed from: com.google.android.libraries.gsa.c.a.au */
/* compiled from: PG */
final class C22222au extends C70898m {

    /* renamed from: a */
    private final C70898m f61352a;

    /* renamed from: b */
    private final C89010ah f61353b;

    public C22222au(C70898m mVar, C89010ah ahVar) {
        this.f61352a = mVar;
        this.f61353b = ahVar;
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        C89010ah ahVar = this.f61353b;
        C58838bb.m90884s(!ahVar.mo82982r(), "markStart shouldn't be called multiple times.");
        ahVar.f241209m = deVar;
        this.f61352a.mo27478a(new C22223av(lVar, this.f61353b), deVar);
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        this.f61352a.mo27480d(str, th);
    }

    /* renamed from: f */
    public final void mo27481f() {
        this.f61352a.mo27481f();
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        this.f61352a.mo27482g(i);
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        if (obj instanceof MessageLite) {
            this.f61353b.f241181f += (long) ((MessageLite) obj).getSerializedSize();
        }
        this.f61352a.mo27483h(obj);
    }
}
