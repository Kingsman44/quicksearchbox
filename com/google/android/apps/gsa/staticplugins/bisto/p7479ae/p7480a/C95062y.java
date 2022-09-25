package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.shared.bisto.p7029b.C89640k;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.p10712d.C142383dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.y */
/* compiled from: PG */
public final class C95062y extends C95043f {

    /* renamed from: g */
    public final C95055r f265947g;

    /* renamed from: h */
    private final C60870cx f265948h;

    /* renamed from: i */
    private final Executor f265949i;

    public C95062y(C95055r rVar, C60888db dbVar, C60888db dbVar2, Executor executor, C89640k kVar, C37335b bVar, C142383dh dhVar) {
        super(dbVar, executor, bVar, kVar, "SbcDecoder");
        this.f265947g = rVar;
        this.f265949i = new C60904dr(executor);
        this.f265948h = C60922j.m93044g(rVar.mo88984a(), new C95060w(dhVar), dbVar2);
    }

    /* renamed from: a */
    public final C60870cx mo88961a(byte[] bArr) {
        return C60922j.m93044g(this.f265948h, new C95059v(bArr), this.f265949i);
    }

    /* renamed from: b */
    public final void mo88962b() {
        C58976aa aaVar = C58975e.f156826a;
        C60922j.m93044g(this.f265948h, new C95061x(this), this.f265949i);
    }
}
