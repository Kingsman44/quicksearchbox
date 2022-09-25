package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.apps.tiktok.p3644h.C47103a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66591bq;
import com.google.speech.p5208h.C66592br;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66614cl;
import com.google.speech.p5208h.C66615cm;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.a */
/* compiled from: PG */
public final /* synthetic */ class C124753a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C66607ce f344154a;

    public /* synthetic */ C124753a(C66607ce ceVar) {
        this.f344154a = ceVar;
    }

    public final Object apply(Object obj) {
        Object obj2;
        C66607ce ceVar = this.f344154a;
        C47103a aVar = (C47103a) obj;
        C59104x b = C124755c.f344157a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoInitialS3RequestMutator");
        ((C59052c) ((C59052c) b).mo56372aa(36281)).mo56386p("Adding auth token to initial S3Request");
        C62940bt r1 = C62942bv.checkIsLite(C66615cm.f181221k);
        ceVar.mo58887l(r1);
        Object l = ceVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj2 = r1.f169969b;
        } else {
            obj2 = r1.mo58889c(l);
        }
        C66614cl clVar = (C66614cl) ((C66615cm) obj2).toBuilder();
        C66591bq bqVar = (C66591bq) C66592br.f181140e.createBuilder();
        bqVar.copyOnWrite();
        C66592br brVar = (C66592br) bqVar.instance;
        brVar.f181142a |= 4;
        brVar.f181144c = "https://www.googleapis.com/auth/googlenow";
        bqVar.copyOnWrite();
        C66592br brVar2 = (C66592br) bqVar.instance;
        brVar2.f181142a |= 2;
        brVar2.f181143b = true;
        String str = aVar.f122701a;
        bqVar.copyOnWrite();
        C66592br brVar3 = (C66592br) bqVar.instance;
        str.getClass();
        brVar3.f181142a |= 8;
        brVar3.f181145d = str;
        clVar.mo59689c((C66592br) bqVar.build());
        C66606cd cdVar = (C66606cd) ceVar.toBuilder();
        cdVar.mo58885m(C66615cm.f181221k, (C66615cm) clVar.build());
        return (C66607ce) cdVar.build();
    }
}
