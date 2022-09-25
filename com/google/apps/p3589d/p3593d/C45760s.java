package com.google.apps.p3589d.p3593d;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.apps.d.d.s */
/* compiled from: PG */
public final class C45760s extends C45755n {

    /* renamed from: a */
    public final boolean f120331a;

    /* renamed from: b */
    public final boolean f120332b;

    /* renamed from: i */
    public final C45763v f120333i;

    /* renamed from: j */
    public final C45763v f120334j;

    /* renamed from: k */
    public final C45747f f120335k;

    /* renamed from: l */
    public final int f120336l;

    private C45760s(C45760s sVar, C45750i iVar) {
        super((C45755n) sVar, iVar);
        this.f120331a = sVar.f120331a;
        this.f120332b = sVar.f120332b;
        this.f120333i = iVar.mo49883a(sVar.f120333i);
        this.f120334j = iVar.mo49883a(sVar.f120334j);
        this.f120335k = sVar.f120335k;
        this.f120336l = sVar.f120336l;
    }

    /* renamed from: a */
    public final /* synthetic */ C45755n mo49862a(C45750i iVar) {
        return new C45760s(this, iVar);
    }

    /* renamed from: g */
    public final void mo49863g(C45741ai aiVar, C45742aj ajVar) {
        mo49889h(aiVar, ajVar);
        this.f120333i.mo49898g(aiVar, ajVar, this);
        this.f120334j.mo49898g(aiVar, ajVar, this);
    }

    /* renamed from: i */
    public final boolean mo49864i() {
        return this.f120333i.f120342a.f120220a.isEmpty() && this.f120334j.f120342a.f120220a.isEmpty();
    }

    public C45760s(boolean z, boolean z2, C45763v vVar, C45763v vVar2, C45747f fVar, int i) {
        super(10, BuildConfig.FLAVOR);
        this.f120331a = z;
        this.f120332b = z2;
        this.f120333i = vVar;
        this.f120334j = vVar2;
        this.f120335k = fVar;
        this.f120336l = i;
    }
}
