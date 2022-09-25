package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1301m;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
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
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.m.d */
/* compiled from: PG */
public final class C16600d extends C68247h {

    /* renamed from: a */
    private final C68283d f48666a;

    /* renamed from: c */
    private final C68283d f48667c;

    /* renamed from: d */
    private final C68283d f48668d;

    /* renamed from: e */
    private final C68283d f48669e;

    /* renamed from: f */
    private final C68283d f48670f;

    /* renamed from: g */
    private final C68283d f48671g;

    /* renamed from: h */
    private final C68283d f48672h;

    /* renamed from: i */
    private final C68283d f48673i;

    public C16600d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8) {
        super(aVar2, new C68277d(C16600d.class), aVar);
        this.f48666a = C68236af.m98549d(dVar);
        this.f48667c = C68236af.m98549d(dVar2);
        this.f48668d = C68236af.m98549d(dVar3);
        this.f48669e = C68236af.m98549d(dVar4);
        this.f48670f = C68236af.m98549d(dVar5);
        this.f48671g = C68236af.m98549d(dVar6);
        this.f48672h = C68236af.m98549d(dVar7);
        this.f48673i = C68236af.m98549d(dVar8);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C68282c cVar2 = (C68282c) list.get(2);
        String str = (String) list.get(3);
        String str2 = (String) list.get(4);
        String str3 = (String) list.get(5);
        C15481g gVar = (C15481g) list.get(6);
        boolean booleanValue = ((Boolean) list.get(7)).booleanValue();
        C66614cl clVar = (C66614cl) C66615cm.f181220j.createBuilder();
        if (C57940c.m88582i(cVar)) {
            C58833ax axVar2 = (C58833ax) C57940c.m88577d(cVar);
            if (axVar2.mo56113h()) {
                C66591bq bqVar = (C66591bq) C66592br.f181140e.createBuilder();
                bqVar.copyOnWrite();
                C66592br brVar = (C66592br) bqVar.instance;
                str.getClass();
                brVar.f181142a = 4 | brVar.f181142a;
                brVar.f181144c = str;
                bqVar.copyOnWrite();
                C66592br brVar2 = (C66592br) bqVar.instance;
                brVar2.f181142a |= 2;
                brVar2.f181143b = true;
                String str4 = (String) axVar2.mo56107c();
                bqVar.copyOnWrite();
                C66592br brVar3 = (C66592br) bqVar.instance;
                str4.getClass();
                brVar3.f181142a |= 8;
                brVar3.f181145d = str4;
                clVar.mo59689c((C66592br) bqVar.build());
            }
        } else {
            if (axVar.mo56113h() && !((Boolean) axVar.mo56107c()).booleanValue()) {
                gVar.mo22352b(C37179a.f97553cS);
            }
            ((C59052c) ((C59052c) ((C59052c) C16596a.f48662a.mo56226d()).mo56382g((Throwable) C57940c.m88575b(cVar).mo56111f())).mo56372aa(46400)).mo56386p("AuthToken could not be included in request!");
        }
        if (booleanValue) {
            if (C57940c.m88582i(cVar2)) {
                C58833ax axVar3 = (C58833ax) C57940c.m88577d(cVar2);
                if (axVar3.mo56113h()) {
                    String str5 = (String) axVar3.mo56107c();
                    clVar.copyOnWrite();
                    C66615cm cmVar = (C66615cm) clVar.instance;
                    str5.getClass();
                    cmVar.f181223a |= 32;
                    cmVar.f181230h = str5;
                } else {
                    ((C59052c) ((C59052c) C16596a.f48662a.mo56226d()).mo56372aa(46403)).mo56386p("XGeo header is null, not setting.");
                }
            } else {
                ((C59052c) ((C59052c) ((C59052c) C16596a.f48662a.mo56226d()).mo56382g((Throwable) C57940c.m88575b(cVar2).mo56111f())).mo56372aa(46402)).mo56386p("XGeoHeader could not be included in request.");
            }
        }
        C66596bv bvVar = (C66596bv) C66597bw.f181154d.createBuilder();
        bvVar.copyOnWrite();
        C66597bw bwVar = (C66597bw) bvVar.instance;
        bwVar.f181156a |= 2;
        bwVar.f181158c = 1;
        bvVar.copyOnWrite();
        C66597bw bwVar2 = (C66597bw) bvVar.instance;
        str2.getClass();
        bwVar2.f181156a |= 1;
        bwVar2.f181157b = str2;
        C66597bw bwVar3 = (C66597bw) bvVar.build();
        C66596bv bvVar2 = (C66596bv) C66597bw.f181154d.createBuilder();
        bvVar2.copyOnWrite();
        C66597bw bwVar4 = (C66597bw) bvVar2.instance;
        bwVar4.f181156a |= 2;
        bwVar4.f181158c = 1;
        bvVar2.copyOnWrite();
        C66597bw bwVar5 = (C66597bw) bvVar2.instance;
        str3.getClass();
        bwVar5.f181156a |= 1;
        bwVar5.f181157b = str3;
        C66597bw bwVar6 = (C66597bw) bvVar2.build();
        clVar.copyOnWrite();
        C66615cm cmVar2 = (C66615cm) clVar.instance;
        bwVar3.getClass();
        cmVar2.f181226d = bwVar3;
        cmVar2.f181223a |= 1;
        clVar.copyOnWrite();
        C66615cm cmVar3 = (C66615cm) clVar.instance;
        bwVar6.getClass();
        cmVar3.f181228f = bwVar6;
        cmVar3.f181223a |= 2;
        gVar.mo22352b(C37179a.f97524bq);
        return C60856cj.m92900i(new C16462a(C58833ax.m90834k((C66615cm) clVar.build()), C66615cm.f181221k));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f48666a.mo60297gq()), this.f48667c.mo60297gq(), C68236af.m98546a(this.f48668d.mo60297gq()), this.f48669e.mo60297gq(), this.f48670f.mo60297gq(), this.f48671g.mo60297gq(), this.f48672h.mo60297gq(), this.f48673i.mo60297gq());
    }
}
