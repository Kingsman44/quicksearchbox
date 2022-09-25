package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8578b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7158b.C90756m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112191q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112194t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113164bv;
import com.google.android.libraries.assistant.p1594s.p1597b.C19140aa;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19146ag;
import com.google.android.libraries.assistant.p1594s.p1597b.C19147ah;
import com.google.android.libraries.assistant.p1594s.p1597b.C19148ai;
import com.google.android.libraries.assistant.p1594s.p1597b.C19149aj;
import com.google.android.libraries.assistant.p1594s.p1597b.C19153an;
import com.google.android.libraries.assistant.p1594s.p1597b.C19154ao;
import com.google.android.libraries.assistant.p1594s.p1597b.C19155ap;
import com.google.android.libraries.assistant.p1594s.p1597b.C19156aq;
import com.google.android.libraries.assistant.p1594s.p1597b.C19157ar;
import com.google.android.libraries.assistant.p1594s.p1597b.C19165az;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.b.a */
/* compiled from: PG */
public final class C113275a {

    /* renamed from: a */
    private final C86124t f313704a;

    /* renamed from: b */
    private C19167ba f313705b;

    public C113275a(C86124t tVar) {
        this.f313704a = tVar;
    }

    /* renamed from: a */
    public final C19167ba mo100052a() {
        C58495hd hdVar;
        if (this.f313705b == null) {
            C19165az azVar = (C19165az) C19167ba.f53673s.createBuilder();
            azVar.mo24303c(C113164bv.m187181b(this.f313704a.mo79745c(C90063do.f249466e)));
            azVar.mo24302b(C113164bv.m187181b(this.f313704a.mo79745c(C90063do.f249595gW)));
            azVar.copyOnWrite();
            C19167ba baVar = (C19167ba) azVar.instance;
            baVar.f53675a |= 1;
            baVar.f53678f = false;
            boolean e = this.f313704a.mo79746e(C90063do.f249601gc);
            azVar.copyOnWrite();
            C19167ba baVar2 = (C19167ba) azVar.instance;
            baVar2.f53675a |= 2;
            baVar2.f53679g = e;
            double m = this.f313704a.mo79747m(C90063do.f249249V);
            azVar.copyOnWrite();
            C19167ba baVar3 = (C19167ba) azVar.instance;
            baVar3.f53675a |= 16;
            baVar3.f53682j = m;
            double m2 = this.f313704a.mo79747m(C90063do.f249241N);
            azVar.copyOnWrite();
            C19167ba baVar4 = (C19167ba) azVar.instance;
            baVar4.f53675a |= 32;
            baVar4.f53683k = m2;
            long a = this.f313704a.mo79743a(C90063do.f249477eK);
            azVar.copyOnWrite();
            C19167ba baVar5 = (C19167ba) azVar.instance;
            baVar5.f53675a |= 64;
            baVar5.f53684l = (int) a;
            azVar.copyOnWrite();
            C19167ba baVar6 = (C19167ba) azVar.instance;
            baVar6.f53675a |= 4;
            baVar6.f53680h = false;
            C19153an a2 = C112194t.m186075a(this.f313704a.mo79751q(C90063do.f249537fR));
            C19146ag agVar = (C19146ag) C19149aj.f53636b.createBuilder();
            C58495hd c = C112194t.m186077c(this.f313704a.mo79752r(C90063do.f249541fV));
            C58800sl lA = c.keySet().iterator();
            while (lA.hasNext()) {
                C48672ag agVar2 = (C48672ag) lA.next();
                C19147ah ahVar = (C19147ah) C19148ai.f53631d.createBuilder();
                ahVar.copyOnWrite();
                C19148ai aiVar = (C19148ai) ahVar.instance;
                aiVar.f53634b = agVar2.f125915O;
                aiVar.f53633a |= 1;
                Integer num = (Integer) c.get(agVar2);
                num.getClass();
                int intValue = num.intValue();
                ahVar.copyOnWrite();
                C19148ai aiVar2 = (C19148ai) ahVar.instance;
                aiVar2.f53633a |= 2;
                aiVar2.f53635c = intValue;
                agVar.mo24298a(ahVar);
            }
            C19154ao aoVar = (C19154ao) C19157ar.f53652b.createBuilder();
            C58495hd r = this.f313704a.mo79752r(C90063do.f249543fX);
            try {
                C58490gz gzVar = new C58490gz(4);
                Map.EL.forEach(r, new C112191q(gzVar));
                hdVar = gzVar.mo55427f(false);
            } catch (C90756m | RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) C112194t.f311492a.mo56225c()).mo56382g(e2)).mo56372aa(27641)).mo56386p("Caught error while parsing type maxes");
                hdVar = C58729pv.f156485a;
            }
            C58800sl lA2 = hdVar.keySet().iterator();
            while (lA2.hasNext()) {
                C48580an anVar = (C48580an) lA2.next();
                C19155ap apVar = (C19155ap) C19156aq.f53647d.createBuilder();
                apVar.copyOnWrite();
                C19156aq aqVar = (C19156aq) apVar.instance;
                aqVar.f53650b = anVar.getNumber();
                aqVar.f53649a |= 1;
                Integer num2 = (Integer) hdVar.get(anVar);
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
            abVar.f53616a |= 1;
            abVar.f53617b = true;
            aaVar.mo24297a(C112194t.m186076b(this.f313704a.mo79745c(C90063do.f249481eO)));
            aaVar.copyOnWrite();
            C19141ab abVar2 = (C19141ab) aaVar.instance;
            a2.getClass();
            abVar2.f53621g = a2;
            abVar2.f53616a |= 8;
            aaVar.copyOnWrite();
            C19141ab abVar3 = (C19141ab) aaVar.instance;
            a2.getClass();
            abVar3.f53622h = a2;
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
            C19167ba baVar7 = (C19167ba) azVar.instance;
            abVar6.getClass();
            baVar7.f53685m = abVar6;
            baVar7.f53675a |= 128;
            boolean e3 = this.f313704a.mo79746e(C90063do.f249280aZ);
            azVar.copyOnWrite();
            C19167ba baVar8 = (C19167ba) azVar.instance;
            baVar8.f53675a |= 512;
            baVar8.f53687o = e3;
            azVar.mo24301a(this.f313704a.mo79745c(C90063do.f249594gV));
            this.f313705b = (C19167ba) azVar.build();
        }
        return this.f313705b;
    }
}
