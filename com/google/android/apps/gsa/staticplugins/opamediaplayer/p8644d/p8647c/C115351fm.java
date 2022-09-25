package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85347p;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85348q;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import p5285d.p5290b.p5291a.p5292a.C68182br;
import p5285d.p5290b.p5291a.p5292a.C68183bs;
import p5285d.p5290b.p5291a.p5292a.C68185bu;
import p5285d.p5290b.p5291a.p5292a.C68186bv;
import p5285d.p5290b.p5291a.p5292a.C68187bw;
import p5285d.p5290b.p5291a.p5292a.C68188bx;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.fm */
/* compiled from: PG */
public final /* synthetic */ class C115351fm implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115368gc f320063a;

    /* renamed from: b */
    public final /* synthetic */ C68185bu f320064b;

    public /* synthetic */ C115351fm(C115368gc gcVar, C68185bu buVar) {
        this.f320063a = gcVar;
        this.f320064b = buVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C58833ax axVar;
        C115368gc gcVar = this.f320063a;
        C68185bu buVar = this.f320064b;
        C85348q qVar = (C85348q) obj;
        C68189by byVar = qVar.f231144c;
        if (byVar == null) {
            byVar = C68189by.f184505b;
        }
        C68188bx bxVar = (C68188bx) byVar.toBuilder();
        C68182br brVar = (C68182br) C68183bs.f184493c.createBuilder();
        C68186bv bvVar = (C68186bv) C68187bw.f184502b.createBuilder();
        String str = gcVar.f320083d;
        bvVar.copyOnWrite();
        str.getClass();
        ((C68187bw) bvVar.instance).f184504a = str;
        brVar.copyOnWrite();
        C68187bw bwVar = (C68187bw) bvVar.build();
        bwVar.getClass();
        ((C68183bs) brVar.instance).f184495a = bwVar;
        brVar.copyOnWrite();
        buVar.getClass();
        ((C68183bs) brVar.instance).f184496b = buVar;
        C68183bs bsVar = (C68183bs) brVar.build();
        C68189by byVar2 = qVar.f231144c;
        if (byVar2 == null) {
            byVar2 = C68189by.f184505b;
        }
        String str2 = gcVar.f320083d;
        int i = 0;
        while (true) {
            if (i >= byVar2.f184507a.size()) {
                axVar = C58836b.f156633a;
                break;
            }
            C68187bw bwVar2 = ((C68183bs) byVar2.f184507a.get(i)).f184495a;
            if (bwVar2 == null) {
                bwVar2 = C68187bw.f184502b;
            }
            if (bwVar2.f184504a.equals(str2)) {
                axVar = C58833ax.m90834k(Integer.valueOf(i));
                break;
            }
            i++;
        }
        if (!axVar.mo56113h()) {
            bxVar.mo60284b(bsVar);
        } else {
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            bxVar.copyOnWrite();
            C68189by byVar3 = (C68189by) bxVar.instance;
            bsVar.getClass();
            byVar3.mo60285a();
            byVar3.f184507a.set(intValue, bsVar);
        }
        C68189by byVar4 = (C68189by) bxVar.build();
        gcVar.f320093n.mo101973u(new C115362fx(byVar4), 1, "update-voices");
        C85349r rVar = gcVar.f320087h;
        C85347p pVar = (C85347p) qVar.toBuilder();
        pVar.copyOnWrite();
        C85348q qVar2 = (C85348q) pVar.instance;
        byVar4.getClass();
        qVar2.f231144c = byVar4;
        qVar2.f231142a |= 2;
        C90875ai.m148465b(new C115349fk(buVar), rVar.mo78865b((C85348q) pVar.build()), gcVar.f320086g, "speakr-settings-updated").mo85223a(C115350fl.f320062a);
    }
}
