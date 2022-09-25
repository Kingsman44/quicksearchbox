package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89010ah;
import com.google.android.apps.gsa.shared.p6968aa.C89016an;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.common.base.C58836b;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5523c.C70266j;

/* renamed from: com.google.android.libraries.gsa.c.a.aw */
/* compiled from: PG */
public final class C22224aw implements C70899n {

    /* renamed from: a */
    private final String f61356a;

    /* renamed from: b */
    private final int f61357b;

    /* renamed from: c */
    private final int f61358c;

    /* renamed from: d */
    private final C89016an f61359d;

    /* renamed from: e */
    private final C89059o f61360e;

    public C22224aw(String str, int i, int i2, C89016an anVar, C89059o oVar) {
        this.f61356a = str;
        this.f61357b = i;
        this.f61358c = i2;
        this.f61359d = anVar;
        this.f61360e = oVar;
    }

    /* renamed from: a */
    public final C70898m mo27479a(C70338di diVar, C70851i iVar, C70888j jVar) {
        C70153aq aqVar = iVar.f189016b;
        C89016an anVar = this.f61359d;
        C89010ah ahVar = new C89010ah(this.f61356a, this.f61357b, diVar, this.f61358c, aqVar != null ? aqVar.toString() : null, anVar.f241223c, C58836b.f156633a);
        anVar.mo82988c(ahVar);
        C70851i p = C70266j.m102424p(iVar, ahVar);
        C89059o oVar = this.f61360e;
        if (oVar != null) {
            oVar.mo27428c(ahVar);
        }
        return new C22222au(jVar.mo39510a(diVar, p), ahVar);
    }
}
