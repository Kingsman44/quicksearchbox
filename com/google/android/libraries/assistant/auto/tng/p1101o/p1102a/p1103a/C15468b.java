package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1103a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.a.b */
/* compiled from: PG */
final class C15468b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Optional f46388a;

    /* renamed from: b */
    final /* synthetic */ C62722b f46389b;

    /* renamed from: c */
    final /* synthetic */ Optional f46390c;

    /* renamed from: d */
    final /* synthetic */ C15469c f46391d;

    /* renamed from: e */
    final /* synthetic */ C37259h f46392e;

    public C15468b(C15469c cVar, Optional optional, C37259h hVar, C62722b bVar, Optional optional2) {
        this.f46391d = cVar;
        this.f46388a = optional;
        this.f46392e = hVar;
        this.f46389b = bVar;
        this.f46390c = optional2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C15469c.f46393a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AAAppFlowLogger");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(45168)).mo56386p("#logEndEventMaybeWithLpVersion#onFailure():Read LanguagePack version failed.");
        this.f46391d.mo22357g(this.f46392e, this.f46389b, this.f46390c, this.f46388a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C15471a aVar;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            int intValue = ((Integer) optional.get()).intValue();
            C58976aa aaVar = C58975e.f156826a;
            if (this.f46388a.isPresent()) {
                aVar = (C15471a) ((C15474b) this.f46388a.get()).toBuilder();
            } else {
                aVar = (C15471a) C15474b.f46404j.createBuilder();
            }
            C15469c cVar = this.f46391d;
            C37259h hVar = this.f46392e;
            C62722b bVar = this.f46389b;
            Optional optional2 = this.f46390c;
            aVar.copyOnWrite();
            C15474b bVar2 = (C15474b) aVar.instance;
            bVar2.f46406a |= 2;
            bVar2.f46408c = (long) intValue;
            cVar.mo22357g(hVar, bVar, optional2, Optional.m71637of((C15474b) aVar.build()));
            return;
        }
        C59104x b = C15469c.f46393a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AAAppFlowLogger");
        ((C59052c) ((C59052c) b).mo56372aa(45169)).mo56386p("#logEndEventMaybeWithLpVersion: No LanguagePack is installed in the current locale.");
        this.f46391d.mo22357g(this.f46392e, this.f46389b, this.f46390c, this.f46388a);
    }
}
