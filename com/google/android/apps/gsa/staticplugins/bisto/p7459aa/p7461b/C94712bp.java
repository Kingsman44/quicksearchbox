package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88261vc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88381zo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bp */
/* compiled from: PG */
public final /* synthetic */ class C94712bp implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118896b f264888a;

    /* renamed from: b */
    public final /* synthetic */ C94785f f264889b;

    public /* synthetic */ C94712bp(C118896b bVar, C94785f fVar) {
        this.f264888a = bVar;
        this.f264889b = fVar;
    }

    public final void run() {
        C118896b bVar = this.f264888a;
        C94785f fVar = this.f264889b;
        if (bVar.mo104061d()) {
            String b = bVar.mo104059b();
            C59104x b2 = C94785f.f265029a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BistoEventHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(16756)).mo56386p("setFinalRecognizedText");
            C87684al alVar = new C87684al(C88244um.BISTO_SET_FINAL_RECOGNIZED_TEXT);
            C62940bt btVar = C88260vb.f238727a;
            C88261vc vcVar = (C88261vc) C88262vd.f238728d.createBuilder();
            vcVar.copyOnWrite();
            C88262vd vdVar = (C88262vd) vcVar.instance;
            b.getClass();
            vdVar.f238730a |= 1;
            vdVar.f238731b = b;
            alVar.mo81965b(btVar, (C88262vd) vcVar.build());
            fVar.mo88613g(alVar.mo81964a());
            return;
        }
        String b3 = bVar.mo104059b();
        String c = bVar.mo104060c();
        C58976aa aaVar = C58975e.f156826a;
        C87684al alVar2 = new C87684al(C88244um.BISTO_UPDATE_RECOGNIZED_TEXT);
        C62940bt btVar2 = C88380zn.f238990a;
        C88381zo zoVar = (C88381zo) C88382zp.f238991e.createBuilder();
        zoVar.copyOnWrite();
        C88382zp zpVar = (C88382zp) zoVar.instance;
        b3.getClass();
        zpVar.f238993a |= 1;
        zpVar.f238994b = b3;
        zoVar.copyOnWrite();
        C88382zp zpVar2 = (C88382zp) zoVar.instance;
        c.getClass();
        zpVar2.f238993a |= 2;
        zpVar2.f238995c = c;
        alVar2.mo81965b(btVar2, (C88382zp) zoVar.build());
        fVar.mo88613g(alVar2.mo81964a());
    }
}
