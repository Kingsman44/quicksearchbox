package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6193d;

import com.google.android.apps.gsa.assistant.shared.appactions.b.u;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88285w;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.d.a */
/* compiled from: PG */
public final /* synthetic */ class C78658a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78663f f216553a;

    /* renamed from: b */
    public final /* synthetic */ C87693ab f216554b;

    public /* synthetic */ C78658a(C78663f fVar, C87693ab abVar) {
        this.f216553a = fVar;
        this.f216554b = abVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Optional optional;
        C78663f fVar = this.f216553a;
        C87693ab abVar = this.f216554b;
        Optional optional2 = (Optional) obj;
        if (optional2.isEmpty() || ((C63088z) optional2.get()).mo59173M()) {
            fVar.mo73491f();
            return;
        }
        C88285w wVar = (C88285w) abVar.toBuilder();
        C49826ak akVar = abVar.f237119c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        C63088z zVar = (C63088z) optional2.get();
        ahVar.copyOnWrite();
        C49826ak akVar2 = (C49826ak) ahVar.instance;
        zVar.getClass();
        akVar2.f129464a |= 256;
        akVar2.f129473j = zVar;
        C49826ak akVar3 = abVar.f237119c;
        if (akVar3 == null) {
            akVar3 = C49826ak.f129462q;
        }
        ahVar.mo53361a(akVar3.f129471h);
        C49826ak akVar4 = (C49826ak) ahVar.build();
        wVar.copyOnWrite();
        C87693ab abVar2 = (C87693ab) wVar.instance;
        akVar4.getClass();
        abVar2.f237119c = akVar4;
        abVar2.f237117a |= 2;
        C87693ab abVar3 = (C87693ab) wVar.build();
        fVar.mo73561g(Optional.m71637of(abVar3));
        u uVar = fVar.f216561c;
        C49826ak akVar5 = abVar3.f237119c;
        String str = (akVar5 == null ? C49826ak.f129462q : akVar5).f129471h;
        if (akVar5 == null) {
            akVar5 = C49826ak.f129462q;
        }
        if (akVar5.f129476m.isEmpty()) {
            optional = Optional.empty();
        } else {
            C49826ak akVar6 = abVar3.f237119c;
            if (akVar6 == null) {
                akVar6 = C49826ak.f129462q;
            }
            optional = Optional.m71637of(akVar6.f129476m);
        }
        C80905at.m128763g(uVar.e(str, optional), C78660c.f216556a);
    }
}
