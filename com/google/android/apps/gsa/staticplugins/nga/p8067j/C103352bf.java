package com.google.android.apps.gsa.staticplugins.nga.p8067j;

import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6363s.C81453b;
import com.google.android.apps.gsa.nga.shared.p6363s.C81456e;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.j.bf */
/* compiled from: PG */
public final class C103352bf implements C86091a, C74718bv {

    /* renamed from: a */
    private final C22871g f288155a;

    /* renamed from: b */
    private final C103335ap f288156b;

    /* renamed from: c */
    private final C68214a f288157c;

    /* renamed from: d */
    private final C81453b f288158d;

    /* renamed from: e */
    private final C68214a f288159e;

    public C103352bf(C22871g gVar, C103335ap apVar, C68214a aVar, C68214a aVar2, C81456e eVar) {
        this.f288155a = gVar;
        this.f288156b = apVar;
        this.f288157c = aVar;
        this.f288159e = aVar2;
        this.f288158d = eVar.mo75087a(C103351be.f288154a);
    }

    /* renamed from: a */
    public final void mo17497a(NgaState ngaState) {
        C58976aa aaVar = C58975e.f156826a;
        if (ngaState != NgaState.c) {
            C80905at.m128764h("NgaStartupListener", C60856cj.m92897f(this.f288158d.mo75085a()), "Failed to notify reload listeners for changes.", new Object[0]);
        }
        mo93773b();
    }

    /* renamed from: b */
    public final void mo93773b() {
        this.f288156b.mo93764w(((C74720bx) this.f288157c.mo27525b()).mo71089f(), ((C74714bo) this.f288159e.mo27525b()).mo71080b(), false);
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        this.f288155a.mo28212l("[NGA] NgaStartupListener.onDeviceInstallOrBoot", new C103350bd(this));
    }
}
