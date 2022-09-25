package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8738f;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90035cn;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7158b.C90756m;
import com.google.android.libraries.assistant.p1594s.p1597b.C19140aa;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19146ag;
import com.google.android.libraries.assistant.p1594s.p1597b.C19147ah;
import com.google.android.libraries.assistant.p1594s.p1597b.C19148ai;
import com.google.android.libraries.assistant.p1594s.p1597b.C19149aj;
import com.google.android.libraries.assistant.p1594s.p1597b.C19150ak;
import com.google.android.libraries.assistant.p1594s.p1597b.C19151al;
import com.google.android.libraries.assistant.p1594s.p1597b.C19152am;
import com.google.android.libraries.assistant.p1594s.p1597b.C19153an;
import com.google.android.libraries.assistant.p1594s.p1597b.C19154ao;
import com.google.android.libraries.assistant.p1594s.p1597b.C19155ap;
import com.google.android.libraries.assistant.p1594s.p1597b.C19156aq;
import com.google.android.libraries.assistant.p1594s.p1597b.C19157ar;
import com.google.android.libraries.assistant.p1594s.p1597b.C19165az;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19175c;
import com.google.android.libraries.assistant.p1594s.p1597b.C19176d;
import com.google.android.libraries.assistant.p1594s.p1597b.C19194v;
import com.google.android.libraries.assistant.p1594s.p1597b.C19195w;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.f.a */
/* compiled from: PG */
public final class C116944a {

    /* renamed from: a */
    private static final C58974d f324668a = C58974d.m91136j();

    /* renamed from: b */
    private final C86124t f324669b;

    /* renamed from: c */
    private C19167ba f324670c;

    public C116944a(C86124t tVar) {
        this.f324669b = tVar;
    }

    /* renamed from: b */
    public static C58485gu m194338b(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (!TextUtils.isEmpty(str)) {
                    e.mo55395g(C48672ag.m85258a(str));
                }
            } catch (IllegalArgumentException e2) {
                ((C58970a) ((C58970a) ((C58970a) f324668a.mo56225c()).mo56382g(e2)).mo56372aa(32509)).mo56389s("no SourceType enum for \"%s\"", str);
            }
        }
        return e.mo55394f();
    }

    /* renamed from: a */
    public final C19167ba mo103065a() {
        C58495hd hdVar;
        C58495hd hdVar2;
        C58485gu guVar;
        if (this.f324670c == null) {
            C19165az azVar = (C19165az) C19167ba.f53673s.createBuilder();
            azVar.mo24303c(m194338b(this.f324669b.mo79745c(C90035cn.f248391p)));
            azVar.mo24302b(m194338b(this.f324669b.mo79745c(C90035cn.f248387l)));
            boolean e = this.f324669b.mo79746e(C90035cn.f248381f);
            azVar.copyOnWrite();
            C19167ba baVar = (C19167ba) azVar.instance;
            baVar.f53675a |= 1;
            baVar.f53678f = e;
            azVar.copyOnWrite();
            C19167ba baVar2 = (C19167ba) azVar.instance;
            baVar2.f53675a |= 2;
            baVar2.f53679g = false;
            boolean e2 = this.f324669b.mo79746e(C90035cn.f248389n);
            azVar.copyOnWrite();
            C19167ba baVar3 = (C19167ba) azVar.instance;
            baVar3.f53675a |= 4;
            baVar3.f53680h = e2;
            azVar.copyOnWrite();
            C19167ba baVar4 = (C19167ba) azVar.instance;
            baVar4.f53675a |= 16;
            baVar4.f53682j = 0.1d;
            azVar.copyOnWrite();
            C19167ba baVar5 = (C19167ba) azVar.instance;
            baVar5.f53675a |= 32;
            baVar5.f53683k = 0.1d;
            azVar.copyOnWrite();
            C19167ba baVar6 = (C19167ba) azVar.instance;
            baVar6.f53675a |= 64;
            baVar6.f53684l = 1;
            C19194v vVar = (C19194v) C19195w.f53744e.createBuilder();
            C19175c cVar = (C19175c) C19176d.f53709f.createBuilder();
            cVar.copyOnWrite();
            C19176d dVar = (C19176d) cVar.instance;
            dVar.f53711a |= 16;
            dVar.f53714d = true;
            C19176d dVar2 = (C19176d) cVar.build();
            vVar.copyOnWrite();
            C19195w wVar = (C19195w) vVar.instance;
            dVar2.getClass();
            wVar.f53749d = dVar2;
            wVar.f53746a |= 4;
            C19195w wVar2 = (C19195w) vVar.build();
            azVar.copyOnWrite();
            C19167ba baVar7 = (C19167ba) azVar.instance;
            wVar2.getClass();
            baVar7.f53690r = wVar2;
            baVar7.f53675a |= 2048;
            boolean e3 = this.f324669b.mo79746e(C90035cn.f248382g);
            azVar.copyOnWrite();
            C19167ba baVar8 = (C19167ba) azVar.instance;
            baVar8.f53675a |= 256;
            baVar8.f53686n = e3;
            C19150ak akVar = (C19150ak) C19153an.f53644b.createBuilder();
            C19151al alVar = (C19151al) C19152am.f53639d.createBuilder();
            C48670ae aeVar = C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY;
            alVar.copyOnWrite();
            C19152am amVar = (C19152am) alVar.instance;
            amVar.f53642b = aeVar.f125872ao;
            amVar.f53641a |= 1;
            alVar.copyOnWrite();
            C19152am amVar2 = (C19152am) alVar.instance;
            amVar2.f53641a |= 2;
            amVar2.f53643c = 5;
            akVar.mo24299a(alVar);
            C19151al alVar2 = (C19151al) C19152am.f53639d.createBuilder();
            C48670ae aeVar2 = C48670ae.SUGGESTION_GROUP_ICON_SHORTCUT;
            alVar2.copyOnWrite();
            C19152am amVar3 = (C19152am) alVar2.instance;
            amVar3.f53642b = aeVar2.f125872ao;
            amVar3.f53641a |= 1;
            alVar2.copyOnWrite();
            C19152am amVar4 = (C19152am) alVar2.instance;
            amVar4.f53641a |= 2;
            amVar4.f53643c = 5;
            akVar.mo24299a(alVar2);
            C19153an anVar = (C19153an) akVar.build();
            C19146ag agVar = (C19146ag) C19149aj.f53636b.createBuilder();
            C58495hd r = this.f324669b.mo79752r(C90063do.f249541fV);
            try {
                C58490gz gzVar = new C58490gz(4);
                Map.EL.forEach(r, new C116951h(gzVar));
                hdVar = gzVar.mo55427f(false);
            } catch (RuntimeException e4) {
                C59104x c = C116953j.f324683a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "gmn.RankParsers");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e4)).mo56372aa(32521)).mo56386p("Caught error while parsing source maxes");
                hdVar = C58729pv.f156485a;
            }
            C58800sl lA = hdVar.keySet().iterator();
            while (lA.hasNext()) {
                C48672ag agVar2 = (C48672ag) lA.next();
                C19147ah ahVar = (C19147ah) C19148ai.f53631d.createBuilder();
                ahVar.copyOnWrite();
                C19148ai aiVar = (C19148ai) ahVar.instance;
                aiVar.f53634b = agVar2.f125915O;
                aiVar.f53633a |= 1;
                Integer num = (Integer) hdVar.get(agVar2);
                num.getClass();
                int intValue = num.intValue();
                ahVar.copyOnWrite();
                C19148ai aiVar2 = (C19148ai) ahVar.instance;
                aiVar2.f53633a |= 2;
                aiVar2.f53635c = intValue;
                agVar.mo24298a(ahVar);
            }
            C19154ao aoVar = (C19154ao) C19157ar.f53652b.createBuilder();
            C58495hd r2 = this.f324669b.mo79752r(C90063do.f249543fX);
            try {
                C58490gz gzVar2 = new C58490gz(4);
                Map.EL.forEach(r2, new C116952i(gzVar2));
                hdVar2 = gzVar2.mo55427f(false);
            } catch (C90756m | RuntimeException e5) {
                C59104x c2 = C116953j.f324683a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "gmn.RankParsers");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e5)).mo56372aa(32522)).mo56386p("Caught error while parsing type maxes");
                hdVar2 = C58729pv.f156485a;
            }
            C58800sl lA2 = hdVar2.keySet().iterator();
            while (lA2.hasNext()) {
                C48580an anVar2 = (C48580an) lA2.next();
                C19155ap apVar = (C19155ap) C19156aq.f53647d.createBuilder();
                apVar.copyOnWrite();
                C19156aq aqVar = (C19156aq) apVar.instance;
                aqVar.f53650b = anVar2.getNumber();
                aqVar.f53649a |= 1;
                Integer num2 = (Integer) hdVar2.get(anVar2);
                num2.getClass();
                int intValue2 = num2.intValue();
                apVar.copyOnWrite();
                C19156aq aqVar2 = (C19156aq) apVar.instance;
                aqVar2.f53649a |= 2;
                aqVar2.f53651c = intValue2;
                aoVar.mo24300a(apVar);
            }
            C19140aa aaVar = (C19140aa) C19141ab.f53614i.createBuilder();
            aaVar.copyOnWrite();
            C19141ab abVar = (C19141ab) aaVar.instance;
            abVar.f53616a = 1 | abVar.f53616a;
            abVar.f53617b = false;
            try {
                guVar = (C58485gu) Collection.EL.stream(this.f324669b.mo79745c(C90035cn.f248386k)).filter(C116949f.f324679a).map(C116950g.f324680a).collect(C58370cn.f155946a);
            } catch (RuntimeException e6) {
                C59104x c3 = C116953j.f324683a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "gmn.RankParsers");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e6)).mo56372aa(32520)).mo56386p("Caught error while parsing mix adjusters");
                guVar = C58485gu.m89845m();
            }
            aaVar.mo24297a(guVar);
            aaVar.copyOnWrite();
            C19141ab abVar2 = (C19141ab) aaVar.instance;
            anVar.getClass();
            abVar2.f53621g = anVar;
            abVar2.f53616a |= 8;
            aaVar.copyOnWrite();
            C19141ab abVar3 = (C19141ab) aaVar.instance;
            anVar.getClass();
            abVar3.f53622h = anVar;
            abVar3.f53616a |= 16;
            C19149aj ajVar = (C19149aj) agVar.build();
            aaVar.copyOnWrite();
            C19141ab abVar4 = (C19141ab) aaVar.instance;
            ajVar.getClass();
            abVar4.f53619d = ajVar;
            abVar4.f53616a |= 4;
            C19157ar arVar = (C19157ar) aoVar.build();
            aaVar.copyOnWrite();
            C19141ab abVar5 = (C19141ab) aaVar.instance;
            arVar.getClass();
            abVar5.f53618c = arVar;
            abVar5.f53616a |= 2;
            C19141ab abVar6 = (C19141ab) aaVar.build();
            azVar.copyOnWrite();
            C19167ba baVar9 = (C19167ba) azVar.instance;
            abVar6.getClass();
            baVar9.f53685m = abVar6;
            baVar9.f53675a |= 128;
            azVar.mo24301a(this.f324669b.mo79745c(C90035cn.f248390o));
            this.f324670c = (C19167ba) azVar.build();
        }
        return this.f324670c;
    }
}
