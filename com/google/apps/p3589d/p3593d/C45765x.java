package com.google.apps.p3589d.p3593d;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.apps.d.d.x */
/* compiled from: PG */
public final class C45765x extends C45755n {

    /* renamed from: a */
    public C45763v f120345a;

    /* renamed from: b */
    public final C45763v f120346b;

    public C45765x(C45763v vVar, C45763v vVar2) {
        super(11, BuildConfig.FLAVOR);
        this.f120345a = vVar;
        this.f120346b = vVar2;
    }

    /* renamed from: a */
    public final /* synthetic */ C45755n mo49862a(C45750i iVar) {
        return new C45765x(this, iVar);
    }

    /* renamed from: g */
    public final void mo49863g(C45741ai aiVar, C45742aj ajVar) {
        mo49889h(aiVar, ajVar);
        C45763v vVar = this.f120345a;
        if (vVar != null) {
            vVar.mo49898g(aiVar, ajVar, this);
        }
        this.f120346b.mo49898g(aiVar, ajVar, this);
    }

    /* renamed from: i */
    public final boolean mo49864i() {
        C45763v vVar = this.f120345a;
        return (vVar == null || vVar.f120342a.f120220a.isEmpty()) && this.f120346b.f120342a.f120220a.isEmpty();
    }

    private C45765x(C45765x xVar, C45750i iVar) {
        super((C45755n) xVar, iVar);
        C45763v vVar;
        C45763v vVar2 = xVar.f120345a;
        if (vVar2 == null) {
            vVar = null;
        } else {
            vVar = iVar.mo49883a(vVar2);
        }
        this.f120345a = vVar;
        this.f120346b = iVar.mo49883a(xVar.f120346b);
    }
}
