package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1424e.p1425a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.C17404a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.speech.p5208h.C66591bq;
import com.google.speech.p5208h.C66592br;
import com.google.speech.p5208h.C66596bv;
import com.google.speech.p5208h.C66597bw;
import com.google.speech.p5208h.C66614cl;
import com.google.speech.p5208h.C66615cm;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.a.e.a.f */
/* compiled from: PG */
public final class C17418f extends C68247h {

    /* renamed from: a */
    private final C68283d f50319a;

    /* renamed from: c */
    private final C68283d f50320c;

    /* renamed from: d */
    private final C68283d f50321d;

    public C17418f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C17418f.class), aVar);
        this.f50319a = C68236af.m98549d(dVar);
        this.f50320c = C68236af.m98549d(dVar2);
        this.f50321d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        String str = (String) list.get(1);
        Optional optional = (Optional) list.get(2);
        C66614cl clVar = (C66614cl) C66615cm.f181220j.createBuilder();
        if (C57940c.m88582i(cVar)) {
            C58833ax axVar = (C58833ax) C57940c.m88577d(cVar);
            if (axVar.mo56113h()) {
                C66591bq bqVar = (C66591bq) C66592br.f181140e.createBuilder();
                bqVar.copyOnWrite();
                C66592br brVar = (C66592br) bqVar.instance;
                str.getClass();
                brVar.f181142a |= 4;
                brVar.f181144c = str;
                bqVar.copyOnWrite();
                C66592br brVar2 = (C66592br) bqVar.instance;
                brVar2.f181142a |= 2;
                brVar2.f181143b = true;
                String str2 = (String) axVar.mo56107c();
                bqVar.copyOnWrite();
                C66592br brVar3 = (C66592br) bqVar.instance;
                str2.getClass();
                brVar3.f181142a |= 8;
                brVar3.f181145d = str2;
                clVar.mo59689c((C66592br) bqVar.build());
            }
        } else {
            C59104x d = C17414b.f50312a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TTS.Server");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Throwable) C57940c.m88575b(cVar).mo56111f())).mo56372aa(42717)).mo56386p("AuthToken could not be included in request!");
        }
        if (optional.isPresent()) {
            C66596bv bvVar = (C66596bv) C66597bw.f181154d.createBuilder();
            bvVar.copyOnWrite();
            C66597bw bwVar = (C66597bw) bvVar.instance;
            bwVar.f181156a |= 2;
            bwVar.f181158c = 1;
            String str3 = (String) optional.get();
            bvVar.copyOnWrite();
            C66597bw bwVar2 = (C66597bw) bvVar.instance;
            str3.getClass();
            bwVar2.f181156a |= 1;
            bwVar2.f181157b = str3;
            C66597bw bwVar3 = (C66597bw) bvVar.build();
            clVar.copyOnWrite();
            C66615cm cmVar = (C66615cm) clVar.instance;
            bwVar3.getClass();
            cmVar.f181226d = bwVar3;
            cmVar.f181223a = 1 | cmVar.f181223a;
            clVar.copyOnWrite();
            C66615cm cmVar2 = (C66615cm) clVar.instance;
            bwVar3.getClass();
            cmVar2.f181228f = bwVar3;
            cmVar2.f181223a |= 2;
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(new C17404a(Optional.m71637of((C66615cm) clVar.build()), C66615cm.f181221k));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f50319a.mo60297gq()), this.f50320c.mo60297gq(), this.f50321d.mo60297gq());
    }
}
