package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bw */
/* compiled from: PG */
public final /* synthetic */ class C92920bw implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C92978ca f259234a;

    /* renamed from: b */
    public final /* synthetic */ C22434e f259235b;

    public /* synthetic */ C92920bw(C92978ca caVar, C22434e eVar) {
        this.f259234a = caVar;
        this.f259235b = eVar;
    }

    public final void run() {
        C92978ca caVar = this.f259234a;
        C22434e eVar = this.f259235b;
        C89859i iVar = (C89859i) caVar.f259361b.mo27525b();
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.OPA_RESPONSE_RENDERED_CARD_SHOWED;
        C22407c cVar = (C22407c) eVar;
        if (cVar.f61902d.mo56113h() && ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56113h()) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            String b = C39191a.m68623b(((C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56107c()).f229566a.f252749G);
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            b.getClass();
            cbVar.f160062a |= 4;
            cbVar.f160127h = b;
            fVar.f246203c = (C59687cb) ajVar.build();
        }
        iVar.mo74236a(fVar.mo83699a());
    }
}
