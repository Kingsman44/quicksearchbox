package com.google.android.apps.gsa.nga.engine.warmactions.p6257i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77826c;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77829e;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79568aa;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79579k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79580l;
import com.google.android.apps.gsa.nga.engine.warmactions.p6256h.C79597c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66866cl;
import com.google.speech.p5218j.C66867cm;
import com.google.speech.p5218j.C66884da;
import com.google.speech.p5218j.C66885db;
import com.google.speech.p5218j.C66905dv;
import com.google.speech.p5218j.C66906dw;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66980gp;
import com.google.speech.p5218j.C66981gq;
import com.google.speech.p5218j.C66982gr;
import com.google.speech.p5218j.C66983gs;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66993hb;
import com.google.speech.p5218j.C66994hc;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67132mf;
import com.google.speech.p5218j.C67133mg;
import com.google.speech.p5218j.C67134mh;
import com.google.speech.p5218j.C67135mi;
import com.google.speech.p5218j.p5219a.C66712ap;
import com.google.speech.p5218j.p5219a.C66713aq;
import com.google.speech.p5218j.p5219a.C66753t;
import com.google.speech.p5218j.p5219a.C66754u;
import dagger.C68214a;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.i.x */
/* compiled from: PG */
public final class C79641x {

    /* renamed from: a */
    public static final C79580l f218453a;

    /* renamed from: b */
    public final C68214a f218454b;

    /* renamed from: c */
    private final String f218455c;

    /* renamed from: d */
    private final C77829e f218456d;

    /* renamed from: e */
    private final C77826c f218457e;

    /* renamed from: f */
    private final C91142g f218458f;

    /* renamed from: g */
    private final C81013d f218459g;

    /* renamed from: h */
    private final C79597c f218460h;

    static {
        C79579k kVar = (C79579k) C79580l.f218352d.createBuilder();
        kVar.copyOnWrite();
        C79580l lVar = (C79580l) kVar.instance;
        lVar.f218354a |= 1;
        lVar.f218355b = "client-id";
        kVar.copyOnWrite();
        C79580l lVar2 = (C79580l) kVar.instance;
        lVar2.f218354a |= 2;
        lVar2.f218356c = "MOBILE_WARM_WORDS";
        f218453a = (C79580l) kVar.build();
    }

    public C79641x(String str, C77829e eVar, C77826c cVar, C91142g gVar, C68214a aVar, C81013d dVar, C79597c cVar2) {
        this.f218455c = str;
        this.f218456d = eVar;
        this.f218457e = cVar;
        this.f218458f = gVar;
        this.f218454b = aVar;
        this.f218459g = dVar;
        this.f218460h = cVar2;
    }

    /* renamed from: b */
    public static C66713aq m127706b(C79580l lVar) {
        C66712ap apVar = (C66712ap) C66713aq.f181479c.createBuilder();
        C66753t tVar = (C66753t) C66754u.f181563b.createBuilder();
        tVar.mo59735b(C63088z.m96143E(lVar.f218356c));
        apVar.copyOnWrite();
        C66713aq aqVar = (C66713aq) apVar.instance;
        C66754u uVar = (C66754u) tVar.build();
        uVar.getClass();
        aqVar.f181482b = uVar;
        aqVar.f181481a = 1;
        return (C66713aq) apVar.build();
    }

    /* renamed from: a */
    public final C66999hh mo74171a() {
        C79569ab abVar = (C79569ab) this.f218460h.mo74149a().orElseGet(C79633p.f218445a);
        Locale a = this.f218457e.mo72835a();
        C66998hg o = C19245ah.m36707o(this.f218456d.mo72815a(a), BuildConfig.FLAVOR, Paths.get(this.f218456d.mo72817c(), new String[]{"guacamole_cache"}).toString(), 2, this.f218455c);
        C66905dv dvVar = (C66905dv) C66906dw.f181875e.createBuilder();
        int i = 3;
        int i2 = true != this.f218458f.mo85405j(C90126fx.f251459jH) ? 1 : 3;
        dvVar.copyOnWrite();
        C66906dw dwVar = (C66906dw) dvVar.instance;
        dwVar.f181878b = i2 - 1;
        dwVar.f181877a |= 1;
        dvVar.copyOnWrite();
        C66906dw dwVar2 = (C66906dw) dvVar.instance;
        dwVar2.f181877a |= 64;
        dwVar2.f181880d = true;
        C66906dw dwVar3 = (C66906dw) dvVar.build();
        o.copyOnWrite();
        C66999hh hhVar = (C66999hh) o.instance;
        C66999hh hhVar2 = C66999hh.f182127p;
        dwVar3.getClass();
        hhVar.f182136h = dwVar3;
        hhVar.f182129a |= 128;
        C66866cl clVar = (C66866cl) C66867cm.f181796g.createBuilder();
        clVar.copyOnWrite();
        C66867cm cmVar = (C66867cm) clVar.instance;
        cmVar.f181798a |= 32;
        cmVar.f181803f = true;
        clVar.copyOnWrite();
        C66867cm cmVar2 = (C66867cm) clVar.instance;
        cmVar2.f181798a |= 2;
        cmVar2.f181799b = false;
        clVar.copyOnWrite();
        C66867cm cmVar3 = (C66867cm) clVar.instance;
        cmVar3.f181798a |= 4;
        cmVar3.f181800c = false;
        clVar.copyOnWrite();
        C66867cm cmVar4 = (C66867cm) clVar.instance;
        cmVar4.f181798a |= 8;
        cmVar4.f181801d = false;
        boolean j = this.f218458f.mo85405j(C90126fx.f251782pm);
        clVar.copyOnWrite();
        C66867cm cmVar5 = (C66867cm) clVar.instance;
        cmVar5.f181798a |= 16;
        cmVar5.f181802e = j;
        C66867cm cmVar6 = (C66867cm) clVar.build();
        o.copyOnWrite();
        C66999hh hhVar3 = (C66999hh) o.instance;
        cmVar6.getClass();
        hhVar3.f182141m = cmVar6;
        hhVar3.f182129a |= 8192;
        C79568aa aaVar = abVar.f218321d;
        if (aaVar == null) {
            aaVar = C79568aa.f218309f;
        }
        C66994hc hcVar = (C66994hc) C66997hf.f182099z.createBuilder();
        int a2 = C66993hb.m97403a(aaVar.f218312b);
        if (a2 != 0) {
            i = a2;
        }
        hcVar.copyOnWrite();
        C66997hf hfVar = (C66997hf) hcVar.instance;
        hfVar.f182104c = i - 1;
        hfVar.f182102a |= 1;
        hcVar.copyOnWrite();
        C66997hf hfVar2 = (C66997hf) hcVar.instance;
        hfVar2.f182103b |= 32;
        hfVar2.f182126y = true;
        hcVar.copyOnWrite();
        C66997hf hfVar3 = (C66997hf) hcVar.instance;
        hfVar3.f182102a |= 65536;
        hfVar3.f182116o = false;
        hcVar.copyOnWrite();
        C66997hf hfVar4 = (C66997hf) hcVar.instance;
        hfVar4.f182102a |= C89885b.S3REQUEST_VALUE;
        hfVar4.f182117p = false;
        boolean j2 = this.f218458f.mo85405j(C90126fx.f251503jz);
        hcVar.copyOnWrite();
        C66997hf hfVar5 = (C66997hf) hcVar.instance;
        hfVar5.f182102a |= 2048;
        hfVar5.f182111j = j2;
        String a3 = this.f218456d.mo72815a(a);
        hcVar.copyOnWrite();
        C66997hf hfVar6 = (C66997hf) hcVar.instance;
        a3.getClass();
        hfVar6.f182102a |= 32768;
        hfVar6.f182115n = a3;
        C66964g a4 = C66964g.m97396a(aaVar.f218313c);
        if (a4 == null) {
            a4 = C66964g.DEFAULT_ONESHOT;
        }
        hcVar.copyOnWrite();
        C66997hf hfVar7 = (C66997hf) hcVar.instance;
        hfVar7.f182119r = a4.f182026k;
        hfVar7.f182102a |= 1048576;
        C67132mf mfVar = (C67132mf) C67133mg.f182480c.createBuilder();
        C67134mh mhVar = (C67134mh) C67135mi.f182484c.createBuilder();
        String b = this.f218456d.mo72816b(a);
        mhVar.copyOnWrite();
        C67135mi miVar = (C67135mi) mhVar.instance;
        b.getClass();
        miVar.f182486a |= 2;
        miVar.f182487b = b;
        mfVar.copyOnWrite();
        C67133mg mgVar = (C67133mg) mfVar.instance;
        C67135mi miVar2 = (C67135mi) mhVar.build();
        miVar2.getClass();
        mgVar.f182483b = miVar2;
        mgVar.f182482a |= 2;
        hcVar.copyOnWrite();
        C66997hf hfVar8 = (C66997hf) hcVar.instance;
        C67133mg mgVar2 = (C67133mg) mfVar.build();
        mgVar2.getClass();
        hfVar8.f182109h = mgVar2;
        hfVar8.f182102a |= 512;
        C66997hf hfVar9 = (C66997hf) hcVar.build();
        o.copyOnWrite();
        C66999hh hhVar4 = (C66999hh) o.instance;
        hfVar9.getClass();
        hhVar4.f182132d = hfVar9;
        hhVar4.f182129a |= 4;
        C66884da daVar = (C66884da) C66885db.f181841d.createBuilder();
        daVar.copyOnWrite();
        C66885db dbVar = (C66885db) daVar.instance;
        dbVar.f181843a |= 1;
        dbVar.f181844b = false;
        C66885db dbVar2 = (C66885db) daVar.build();
        o.copyOnWrite();
        C66999hh hhVar5 = (C66999hh) o.instance;
        dbVar2.getClass();
        hhVar5.f182140l = dbVar2;
        hhVar5.f182129a |= 2048;
        C79568aa aaVar2 = abVar.f218321d;
        if (((aaVar2 == null ? C79568aa.f218309f : aaVar2).f218311a & 4) != 0) {
            if (aaVar2 == null) {
                aaVar2 = C79568aa.f218309f;
            }
            if (aaVar2.f218315e.size() > 0) {
                C66982gr grVar = (C66982gr) C66983gs.f182072b.createBuilder();
                C79568aa aaVar3 = abVar.f218321d;
                if (aaVar3 == null) {
                    aaVar3 = C79568aa.f218309f;
                }
                C62971cq cqVar = aaVar3.f218315e;
                grVar.copyOnWrite();
                C66983gs gsVar = (C66983gs) grVar.instance;
                C62971cq cqVar2 = gsVar.f182074a;
                if (!cqVar2.mo58948c()) {
                    gsVar.f182074a = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) cqVar, (List) gsVar.f182074a);
                C66984gt gtVar = (C66984gt) C66985gu.f182075h.createBuilder();
                gtVar.copyOnWrite();
                C66985gu guVar = (C66985gu) gtVar.instance;
                guVar.f182077a |= 1;
                guVar.f182078b = true;
                gtVar.copyOnWrite();
                C66985gu guVar2 = (C66985gu) gtVar.instance;
                guVar2.f182077a |= 4096;
                guVar2.f182083g = true;
                C66980gp gpVar = (C66980gp) C66981gq.f182064g.createBuilder();
                gpVar.copyOnWrite();
                C66981gq gqVar = (C66981gq) gpVar.instance;
                gqVar.f182066a = 1 | gqVar.f182066a;
                gqVar.f182069d = "warmactions";
                C79568aa aaVar4 = abVar.f218321d;
                if (aaVar4 == null) {
                    aaVar4 = C79568aa.f218309f;
                }
                C63088z zVar = aaVar4.f218314d;
                gpVar.copyOnWrite();
                C66981gq gqVar2 = (C66981gq) gpVar.instance;
                zVar.getClass();
                gqVar2.f182067b = 2;
                gqVar2.f182068c = zVar;
                gpVar.copyOnWrite();
                C66981gq gqVar3 = (C66981gq) gpVar.instance;
                C66983gs gsVar2 = (C66983gs) grVar.build();
                gsVar2.getClass();
                gqVar3.f182071f = gsVar2;
                gqVar3.f182066a |= 512;
                gtVar.mo59756a(gpVar);
                o.copyOnWrite();
                C66999hh hhVar6 = (C66999hh) o.instance;
                C66985gu guVar3 = (C66985gu) gtVar.build();
                guVar3.getClass();
                hhVar6.f182131c = guVar3;
                hhVar6.f182129a |= 2;
            }
        }
        return (C66999hh) o.build();
    }

    /* renamed from: c */
    public final void mo74172c(Iterable iterable, int i) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f218459g.mo74790f((C79570b) it.next(), i);
        }
    }
}
