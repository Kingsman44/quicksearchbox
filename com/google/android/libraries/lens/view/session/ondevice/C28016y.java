package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.y */
/* compiled from: PG */
final class C28016y {

    /* renamed from: a */
    final C24201ad f76235a;

    /* renamed from: b */
    final C25762k f76236b;

    /* renamed from: c */
    C24208ak f76237c;

    public C28016y(C24201ad adVar, C25762k kVar) {
        this.f76235a = adVar;
        this.f76236b = kVar;
        this.f76237c = C24208ak.m45056e(adVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33465a(C24208ak akVar) {
        ((C58970a) ((C58970a) C28017z.f76238a.mo56224b()).mo56372aa(49965)).mo56355H("Query[%s] result (complete=%b)", this.f76235a.mo29680c(), akVar.mo29701g());
        this.f76236b.mo30913c(akVar, akVar.mo29701g());
        this.f76237c = akVar;
    }
}
