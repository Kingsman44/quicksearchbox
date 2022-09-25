package com.google.android.apps.gsa.shared.p7045k;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.shared.k.m */
/* compiled from: PG */
public final /* synthetic */ class C89817m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C89826v f243111a;

    /* renamed from: b */
    public final /* synthetic */ C89809e f243112b;

    /* renamed from: c */
    public final /* synthetic */ C89825u f243113c;

    /* renamed from: d */
    public final /* synthetic */ int f243114d;

    public /* synthetic */ C89817m(C89826v vVar, C89809e eVar, C89825u uVar, int i) {
        this.f243111a = vVar;
        this.f243112b = eVar;
        this.f243113c = uVar;
        this.f243114d = i;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C89826v vVar = this.f243111a;
        C89809e eVar = this.f243112b;
        C89825u uVar = this.f243113c;
        int i = this.f243114d;
        C89794ab abVar = (C89794ab) obj;
        if (abVar == null) {
            ((C59052c) ((C59052c) C89826v.f243137a.mo56226d()).mo56372aa(10525)).mo56389s("Failed to get Eureka info for device: %s", eVar.mo83648d());
            vVar.mo83675c(eVar, uVar, i);
            return;
        }
        vVar.mo83677e(abVar, eVar, uVar);
    }
}
