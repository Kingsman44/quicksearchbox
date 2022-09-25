package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import android.app.Activity;
import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83828ai;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83831al;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83832am;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83843c;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83855o;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83858r;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83859s;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83860t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92422b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101496ad;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.d */
/* compiled from: PG */
public final /* synthetic */ class C94248d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94321h f263366a;

    public /* synthetic */ C94248d(C94321h hVar) {
        this.f263366a = hVar;
    }

    public final void onClick(View view) {
        C94321h hVar = this.f263366a;
        hVar.f263576l.dismiss();
        hVar.f263578n = 1;
        Activity activity = hVar.getActivity();
        if (activity == null) {
            ((C59052c) ((C59052c) C94321h.f263566b.mo56226d()).mo56372aa(14111)).mo56386p("Try to do audit logging but activity is null!");
        } else {
            C83855o oVar = (C83855o) C83860t.f228502e.createBuilder();
            C83858r rVar = (C83858r) C83859s.f228499b.createBuilder();
            C83923j jVar = hVar.f263580p;
            jVar.getClass();
            rVar.mo77205a(AvocadoUtils.m155380d(jVar));
            oVar.copyOnWrite();
            C83860t tVar = (C83860t) oVar.instance;
            C83859s sVar = (C83859s) rVar.build();
            sVar.getClass();
            tVar.f228505b = sVar;
            tVar.f228504a |= 1;
            oVar.copyOnWrite();
            C83860t tVar2 = (C83860t) oVar.instance;
            tVar2.f228506c = 1;
            tVar2.f228504a |= 2;
            oVar.copyOnWrite();
            C83860t tVar3 = (C83860t) oVar.instance;
            tVar3.f228504a |= 4;
            tVar3.f228507d = true;
            C83860t tVar4 = (C83860t) oVar.build();
            C83843c cVar = (C83843c) C83841av.f228478e.createBuilder();
            cVar.copyOnWrite();
            C83841av avVar = (C83841av) cVar.instance;
            tVar4.getClass();
            avVar.f228483d = tVar4;
            avVar.f228482c = 7;
            if (!hVar.f263579o) {
                C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
                String str = ((Account) hVar.f263570f.mo77278a().mo56107c()).name;
                aeVar.copyOnWrite();
                C83825af afVar = (C83825af) aeVar.instance;
                str.getClass();
                afVar.f228449a |= 1;
                afVar.f228450b = str;
                C83825af afVar2 = (C83825af) aeVar.build();
                cVar.copyOnWrite();
                C83841av avVar2 = (C83841av) cVar.instance;
                afVar2.getClass();
                avVar2.f228481b = afVar2;
                avVar2.f228480a = 1;
            } else {
                C92422b bVar = hVar.f263569e.f257560e;
                if (bVar != null) {
                    C101495ac a = ((C101496ad) ((C58847bk) hVar.f263572h).f156646a).mo92327a();
                    a.f283241a = bVar;
                    C58833ax b = a.mo92323b(((Account) hVar.f263570f.mo77278a().mo56107c()).name);
                    C58833ax a2 = a.mo92322a(((Account) hVar.f263570f.mo77278a().mo56107c()).name);
                    if (!b.mo56113h() || !a2.mo56113h()) {
                        ((C59052c) ((C59052c) C94321h.f263566b.mo56225c()).mo56372aa(14110)).mo56386p("Unable to get parent/child user IDs during unicorn flow");
                    } else {
                        C83828ai aiVar = (C83828ai) C83832am.f228459d.createBuilder();
                        C83831al alVar = (C83831al) b.mo56107c();
                        aiVar.copyOnWrite();
                        C83832am amVar = (C83832am) aiVar.instance;
                        alVar.getClass();
                        amVar.f228462b = alVar;
                        amVar.f228461a = 1 | amVar.f228461a;
                        C83831al alVar2 = (C83831al) a2.mo56107c();
                        aiVar.copyOnWrite();
                        C83832am amVar2 = (C83832am) aiVar.instance;
                        alVar2.getClass();
                        amVar2.f228463c = alVar2;
                        amVar2.f228461a |= 2;
                        cVar.copyOnWrite();
                        C83841av avVar3 = (C83841av) cVar.instance;
                        C83832am amVar3 = (C83832am) aiVar.build();
                        amVar3.getClass();
                        avVar3.f228481b = amVar3;
                        avVar3.f228480a = 2;
                    }
                } else {
                    ((C59052c) ((C59052c) C94321h.f263566b.mo56225c()).mo56372aa(14109)).mo56386p("Unicorn config not set or factory is null");
                }
            }
            ((C83819a) hVar.f263571g.mo56107c()).mo77204a(activity, (C83841av) cVar.build());
        }
        hVar.mo77318iT().mo77312a();
    }
}
