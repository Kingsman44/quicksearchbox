package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8434i.C110186h;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110400d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110416m;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114681g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114682h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114686l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114687m;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114690p;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114691q;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114751e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114877i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.aj */
/* compiled from: PG */
public final /* synthetic */ class C114979aj implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114980ak f319115a;

    public /* synthetic */ C114979aj(C114980ak akVar) {
        this.f319115a = akVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C53420nf nfVar;
        C53350kq kqVar;
        C114980ak akVar = this.f319115a;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(akVar.f319117b).inflate(R.layout.ambient_task_view, (ViewGroup) null);
        if (akVar.f319127l < 2 && akVar.f319120e.mo101778a().mo56113h()) {
            C58485gu d = ((C115017bu) akVar.f319120e.mo101778a().mo56107c()).mo101819d();
            int size = d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C53366lf a = ((C114751e) d.get(i)).mo101573a();
                if (a.f140037b == 4) {
                    nfVar = (C53420nf) a.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                if (nfVar.f140168b != 3 || !C114874f.m190419s(((C53350kq) nfVar.f140169c).f139994b)) {
                    i++;
                } else {
                    C114682h hVar = akVar.f319121f;
                    if (nfVar.f140168b == 3) {
                        kqVar = (C53350kq) nfVar.f140169c;
                    } else {
                        kqVar = C53350kq.f139991e;
                    }
                    C53350kq kqVar2 = kqVar;
                    C91097g gVar = akVar.f319124i;
                    Context context = (Context) hVar.f318204a.mo17428b();
                    context.getClass();
                    Activity activity = (Activity) hVar.f318205b.mo17428b();
                    activity.getClass();
                    C58833ax axVar = (C58833ax) hVar.f318206c.mo17428b();
                    axVar.getClass();
                    kqVar2.getClass();
                    gVar.getClass();
                    C114681g gVar2 = new C114681g(context, activity, axVar, kqVar2, gVar);
                    viewGroup.addView(gVar2.mo101464b());
                    akVar.f319127l++;
                    C28293k c = gVar2.mo101465c();
                    if (c != null) {
                        akVar.f319125j.add(c);
                    }
                }
            }
        }
        if (akVar.f319127l < 2 && akVar.f319120e.mo101780d().mo56113h() && C114877i.m190422a(akVar.f319118c.mo26870b())) {
            C114691q qVar = akVar.f319122g;
            C53245gt gtVar = (C53245gt) akVar.f319120e.mo101780d().mo56107c();
            C91097g gVar3 = akVar.f319124i;
            Context context2 = (Context) qVar.f318239a.mo17428b();
            context2.getClass();
            Activity activity2 = (Activity) qVar.f318240b.mo17428b();
            activity2.getClass();
            C68214a a2 = C68219e.m98518a(((C68226l) qVar.f318241c).f184585a);
            a2.getClass();
            C58833ax axVar2 = (C58833ax) qVar.f318242d.mo17428b();
            axVar2.getClass();
            C58833ax axVar3 = (C58833ax) qVar.f318243e.mo17428b();
            axVar3.getClass();
            gtVar.getClass();
            gVar3.getClass();
            C114690p pVar = new C114690p(context2, activity2, a2, axVar2, axVar3, gtVar, gVar3);
            viewGroup.addView(pVar.mo101464b());
            akVar.f319127l++;
            C28293k c2 = pVar.mo101465c();
            if (c2 != null) {
                akVar.f319125j.add(c2);
            }
        }
        if (akVar.f319127l < 2 && akVar.f319119d.mo79746e(C90014bt.f247840p) && C36619a.m65148d(akVar.f319116a)) {
            C114687m mVar = akVar.f319123h;
            Context context3 = (Context) mVar.f318219a.mo17428b();
            context3.getClass();
            Activity activity3 = (Activity) mVar.f318220b.mo17428b();
            activity3.getClass();
            C2391v vVar = (C2391v) mVar.f318221c.mo17428b();
            vVar.getClass();
            C110416m mVar2 = (C110416m) mVar.f318222d.mo17428b();
            mVar2.getClass();
            C110186h hVar2 = (C110186h) mVar.f318223e.mo17428b();
            hVar2.getClass();
            C110400d dVar = (C110400d) mVar.f318224f.mo17428b();
            dVar.getClass();
            C114686l lVar = new C114686l(context3, activity3, vVar, mVar2, hVar2, dVar);
            viewGroup.addView(lVar.mo101464b());
            akVar.f319127l++;
            C28293k c3 = lVar.mo101465c();
            if (c3 != null) {
                akVar.f319125j.add(c3);
            }
        }
        if (akVar.f319127l == 0) {
            viewGroup.setVisibility(8);
        } else {
            akVar.f319126k = C28293k.m52907d(new C28292j(75846), akVar.f319125j);
        }
        return viewGroup;
    }
}
