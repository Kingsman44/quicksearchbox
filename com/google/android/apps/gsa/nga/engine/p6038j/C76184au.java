package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124445ap;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.au */
/* compiled from: PG */
final class C76184au extends C76180aq {

    /* renamed from: c */
    final /* synthetic */ C76185av f211176c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C76184au(C76185av avVar) {
        super(avVar, "listening");
        this.f211176c = avVar;
    }

    /* renamed from: a */
    public final C76180aq mo72116a(C124445ap apVar) {
        C119903v vVar;
        C119904w wVar = apVar.f343448b;
        if (wVar == null) {
            wVar = C119904w.f333909c;
        }
        if (wVar.f333911a != 2) {
            return this;
        }
        C119904w wVar2 = apVar.f343448b;
        if (wVar2 == null) {
            wVar2 = C119904w.f333909c;
        }
        if (wVar2.f333911a == 2) {
            vVar = (C119903v) wVar2.f333912b;
        } else {
            vVar = C119903v.f333904d;
        }
        return vVar.f333906a == 1 ? this : new C76181ar(this.f211176c);
    }

    /* renamed from: b */
    public final void mo72117b() {
        C76185av avVar = this.f211176c;
        avVar.f211178b.mo71596e(avVar.f211179c);
    }
}
