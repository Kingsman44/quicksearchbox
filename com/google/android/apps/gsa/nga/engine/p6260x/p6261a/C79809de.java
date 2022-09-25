package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.de */
/* compiled from: PG */
public final class C79809de extends C79356f {

    /* renamed from: a */
    private final C79808dd f218811a;

    /* renamed from: b */
    private final C76092h f218812b;

    public C79809de(C79808dd ddVar, C76092h hVar, C79359i iVar) {
        super(iVar);
        this.f218811a = ddVar;
        this.f218812b = hVar;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f218812b.mo72021b().mo72041f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public final boolean mo71822gD() {
        Optional optional;
        C79808dd ddVar = this.f218811a;
        synchronized (ddVar.f218801b) {
            optional = ddVar.f218804e;
        }
        return !optional.equals(this.f218812b.mo72021b().mo72038d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        C79808dd ddVar = this.f218811a;
        ddVar.f218800a.mo28212l("[NGA] Set primary account name", new C79807dc(ddVar, this.f218812b.mo72021b().mo72038d()));
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        C79808dd ddVar = this.f218811a;
        synchronized (ddVar.f218801b) {
            ddVar.f218802c.clear();
            ddVar.f218804e = Optional.empty();
            ddVar.f218803d = false;
        }
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "NgaUserAppFlowLogger";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 28;
    }
}
