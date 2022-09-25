package com.google.android.libraries.onegoogle.accountmenu.p2353c;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0395p;
import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.C30799z;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.c.m */
/* compiled from: PG */
public final class C30343m {

    /* renamed from: a */
    public final C30305n f82038a;

    /* renamed from: b */
    private final C0395p f82039b;

    /* renamed from: c */
    private final Fragment f82040c;

    /* renamed from: d */
    private final SelectedAccountDisc f82041d;

    /* renamed from: e */
    private final C30799z f82042e;

    public C30343m(C0395p pVar, Fragment fragment, C30305n nVar, SelectedAccountDisc selectedAccountDisc) {
        C58838bb.m90869d((pVar == null) != (fragment == null), "Activity or Fragment should be non-null but not both");
        this.f82039b = pVar;
        this.f82040c = fragment;
        nVar.getClass();
        this.f82038a = nVar;
        selectedAccountDisc.getClass();
        this.f82041d = selectedAccountDisc;
        this.f82042e = new C30799z(selectedAccountDisc, nVar);
    }

    /* renamed from: b */
    public static void m56502b(Fragment fragment, C30305n nVar, SelectedAccountDisc selectedAccountDisc) {
        C19559g.m37304c();
        selectedAccountDisc.mo35805c(fragment.getActivity());
        fragment.getClass();
        new C30343m((C0395p) null, fragment, nVar, selectedAccountDisc).mo35905c();
    }

    /* renamed from: a */
    public final void mo35904a() {
        C30305n nVar = this.f82038a;
        C30860b m = nVar.mo35862m();
        Object c = C30281j.m56319c(nVar.mo35858i().f81934a.f81883d);
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 8;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 8;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a = 8 | bVar3.f172121a;
        aVar.copyOnWrite();
        C63644b bVar4 = (C63644b) aVar.instance;
        bVar4.f172122b = 32;
        bVar4.f172121a |= 1;
        m.mo35875a(c, (C63644b) aVar.build());
    }

    /* renamed from: c */
    public final void mo35905c() {
        C30339i iVar;
        FragmentManager fragmentManager;
        C2391v vVar;
        C19559g.m37304c();
        C0395p pVar = this.f82039b;
        if (pVar != null) {
            fragmentManager = pVar.mo545jw();
            C0395p pVar2 = this.f82039b;
            C30305n nVar = this.f82038a;
            SelectedAccountDisc selectedAccountDisc = this.f82041d;
            C19559g.m37304c();
            iVar = new C30339i(selectedAccountDisc, new C30333c(pVar2.mo545jw(), nVar, pVar2), nVar);
            vVar = pVar;
        } else {
            Fragment fragment = this.f82040c;
            View view = fragment.getView();
            C2391v vVar2 = fragment;
            if (view != null) {
                vVar2 = fragment.getViewLifecycleOwner();
            }
            Fragment fragment2 = this.f82040c;
            fragment2.getClass();
            fragmentManager = fragment2.getParentFragmentManager();
            Fragment fragment3 = this.f82040c;
            C30305n nVar2 = this.f82038a;
            SelectedAccountDisc selectedAccountDisc2 = this.f82041d;
            C19559g.m37304c();
            iVar = new C30339i(selectedAccountDisc2, C30333c.m56496b(fragment3, nVar2), nVar2);
            vVar = vVar2;
        }
        this.f82038a.mo35860k().mo36170c().mo36286b(vVar, fragmentManager, this.f82041d);
        this.f82042e.mo36482a(vVar);
        iVar.f82033d = new C30340j(this);
        iVar.f82034e = new C30341k(this);
        C19559g.m37304c();
        C30338h hVar = new C30338h(iVar, new C30337g(iVar));
        iVar.f82030a.addOnAttachStateChangeListener(hVar);
        if (C2043bi.m5569aw(iVar.f82030a)) {
            hVar.onViewAttachedToWindow(iVar.f82030a);
        }
        iVar.f82030a.setEnabled(iVar.f82031b.f81934a.f81882c);
        iVar.f82030a.setOnClickListener(new C30335e(iVar, iVar.f82032c.mo35898a()));
    }
}
