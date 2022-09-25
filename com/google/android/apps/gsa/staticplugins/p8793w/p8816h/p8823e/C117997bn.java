package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88261vc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88381zo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13030ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13032at;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.bn */
/* compiled from: PG */
final class C117997bn extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C118000bq f327492a;

    public C117997bn(C118000bq bqVar) {
        this.f327492a = bqVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C13030ar arVar;
        C13033au auVar = (C13033au) obj;
        int i = auVar.f40464a;
        if (i == 2) {
            this.f327492a.mo103492a(9);
            if (auVar.f40464a == 2) {
                arVar = (C13030ar) auVar.f40465b;
            } else {
                arVar = C13030ar.f40453c;
            }
            String str = arVar.f40456b;
            C118027cq cqVar = this.f327492a.f327496b;
            C87684al alVar = new C87684al(C88244um.SET_FINAL_RECOGNIZED_TEXT);
            C62940bt btVar = C88260vb.f238727a;
            C88261vc vcVar = (C88261vc) C88262vd.f238728d.createBuilder();
            vcVar.copyOnWrite();
            C88262vd vdVar = (C88262vd) vcVar.instance;
            str.getClass();
            vdVar.f238730a = 1 | vdVar.f238730a;
            vdVar.f238731b = str;
            alVar.mo81965b(btVar, (C88262vd) vcVar.build());
            cqVar.mo103503e(alVar.mo81964a());
            if (this.f327492a.f327497c.mo79746e(C90082eg.f250067dx)) {
                ((C59052c) ((C59052c) C118000bq.f327495a.mo56224b()).mo56372aa(18879)).mo56389s("Recognized Text: %s", str);
            }
        } else if (i == 1) {
            C13032at atVar = (C13032at) auVar.f40465b;
            C118027cq cqVar2 = this.f327492a.f327496b;
            String str2 = atVar.f40460b;
            String str3 = atVar.f40461c;
            C87684al alVar2 = new C87684al(C88244um.UPDATE_RECOGNIZED_TEXT);
            C62940bt btVar2 = C88380zn.f238990a;
            C88381zo zoVar = (C88381zo) C88382zp.f238991e.createBuilder();
            zoVar.copyOnWrite();
            C88382zp zpVar = (C88382zp) zoVar.instance;
            str2.getClass();
            zpVar.f238993a = 1 | zpVar.f238993a;
            zpVar.f238994b = str2;
            zoVar.copyOnWrite();
            C88382zp zpVar2 = (C88382zp) zoVar.instance;
            str3.getClass();
            zpVar2.f238993a = 2 | zpVar2.f238993a;
            zpVar2.f238995c = str3;
            alVar2.mo81965b(btVar2, (C88382zp) zoVar.build());
            cqVar2.mo103503e(alVar2.mo81964a());
        }
    }
}
