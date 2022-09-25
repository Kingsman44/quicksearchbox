package com.google.android.apps.gsa.staticplugins.p7666ci.p7667a;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85006i;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85493j;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88142qs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88143qt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88144qu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.a.m */
/* compiled from: PG */
public final class C97758m extends C85493j {

    /* renamed from: a */
    private final C85006i f272947a;

    /* renamed from: b */
    private final C22871g f272948b;

    /* renamed from: c */
    private final C68214a f272949c;

    public C97758m(C85006i iVar, C22871g gVar, C68214a aVar) {
        this.f272947a = iVar;
        this.f272948b = gVar;
        this.f272949c = aVar;
    }

    /* renamed from: a */
    public final void mo90802a(C53422nh nhVar) {
        C58976aa aaVar = C58975e.f156826a;
        C88143qt qtVar = (C88143qt) C88144qu.f238267c.createBuilder();
        C63088z byteString = nhVar.toByteString();
        qtVar.copyOnWrite();
        C88144qu quVar = (C88144qu) qtVar.instance;
        byteString.getClass();
        quVar.f238269a |= 1;
        quVar.f238270b = byteString;
        C87684al alVar = new C87684al(C88244um.OPA_ZERO_STATE_RESPONSE);
        alVar.mo81965b(C88142qs.f238266a, (C88144qu) qtVar.build());
        ServiceEventData a = alVar.mo81964a();
        C87682aj ajVar = ((C86683e) this.f272949c.mo27525b()).f234157a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(a);
        }
    }

    /* renamed from: n */
    public final void mo79015n(C53422nh nhVar) {
        C58976aa aaVar = C58975e.f156826a;
        new C90873ag(this.f272947a.mo78642a(nhVar), this.f272948b, "onZeroStateResponse", new C97756k(this)).mo85223a(new C97757l(this, nhVar));
    }
}
