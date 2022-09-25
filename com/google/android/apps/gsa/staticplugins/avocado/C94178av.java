package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import android.app.Activity;
import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
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
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.av */
/* compiled from: PG */
public final /* synthetic */ class C94178av implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94181ay f263130a;

    public /* synthetic */ C94178av(C94181ay ayVar) {
        this.f263130a = ayVar;
    }

    public final void onClick(View view) {
        C94181ay ayVar = this.f263130a;
        ayVar.f263140i = 1;
        Activity activity = ayVar.getActivity();
        if (activity == null) {
            ((C59052c) ((C59052c) C94181ay.f263133b.mo56226d()).mo56372aa(14234)).mo56386p("Try to do audit logging but activity is null!");
        } else {
            C83855o oVar = (C83855o) C83860t.f228502e.createBuilder();
            C83858r rVar = (C83858r) C83859s.f228499b.createBuilder();
            C83923j jVar = ayVar.f263141j;
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
            C58833ax b = ayVar.f263142k.mo92323b(((Account) ayVar.f263136e.mo77278a().mo56107c()).name);
            C58833ax a = ayVar.f263142k.mo92322a(((Account) ayVar.f263136e.mo77278a().mo56107c()).name);
            if (!b.mo56113h() || !a.mo56113h()) {
                ((C59052c) ((C59052c) C94181ay.f263133b.mo56225c()).mo56372aa(14233)).mo56386p("Unable to get parent/child user IDs during unicorn flow");
            } else {
                C83828ai aiVar = (C83828ai) C83832am.f228459d.createBuilder();
                C83831al alVar = (C83831al) b.mo56107c();
                aiVar.copyOnWrite();
                C83832am amVar = (C83832am) aiVar.instance;
                alVar.getClass();
                amVar.f228462b = alVar;
                amVar.f228461a = 1 | amVar.f228461a;
                C83831al alVar2 = (C83831al) a.mo56107c();
                aiVar.copyOnWrite();
                C83832am amVar2 = (C83832am) aiVar.instance;
                alVar2.getClass();
                amVar2.f228463c = alVar2;
                amVar2.f228461a |= 2;
                cVar.copyOnWrite();
                C83841av avVar2 = (C83841av) cVar.instance;
                C83832am amVar3 = (C83832am) aiVar.build();
                amVar3.getClass();
                avVar2.f228481b = amVar3;
                avVar2.f228480a = 2;
                ((C83819a) ayVar.f263137f.mo56107c()).mo77204a(activity, (C83841av) cVar.build());
            }
        }
        ayVar.mo77318iT().mo77312a();
    }
}
