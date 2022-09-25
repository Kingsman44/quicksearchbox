package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4449cd.p4456g.C57974a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.j */
/* compiled from: PG */
final class C12126j {

    /* renamed from: a */
    int f38760a = 0;

    /* renamed from: b */
    final /* synthetic */ C57974a f38761b;

    /* renamed from: c */
    final /* synthetic */ C12127k f38762c;

    public C12126j(C12127k kVar, C57974a aVar) {
        this.f38762c = kVar;
        this.f38761b = aVar;
    }

    /* renamed from: a */
    public final void mo20437a(byte[] bArr) {
        C12124h hVar = new C12124h(this, bArr, this.f38761b);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(hVar), this.f38762c.f38763a), "#onEncodedByteAvailable processing failed", new Object[0]);
    }

    /* renamed from: b */
    public final void mo20438b() {
        C12125i iVar = new C12125i(this, this.f38761b);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(iVar), this.f38762c.f38763a), "#onEncodingEnd processing failed", new Object[0]);
    }

    /* renamed from: c */
    public final void mo20439c(Throwable th) {
        C12123g gVar = new C12123g(this, this.f38761b, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(gVar), this.f38762c.f38763a), "#onEncodingFailure processing failed", new Object[0]);
    }
}
