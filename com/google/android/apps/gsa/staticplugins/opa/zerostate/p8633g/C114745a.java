package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8633g;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.opaonboarding.C83883aq;
import com.google.android.apps.gsa.opaonboarding.C83884ar;
import com.google.android.apps.gsa.opaonboarding.C83885as;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C83944k;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109789ai;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.g.a */
/* compiled from: PG */
public final class C114745a extends C84036z implements C83904bj {

    /* renamed from: a */
    private final C68214a f318442a;

    /* renamed from: b */
    private final Context f318443b;

    /* renamed from: c */
    private final C68214a f318444c;

    /* renamed from: d */
    private C83885as f318445d;

    public C114745a(C68214a aVar, Context context, C68214a aVar2) {
        this.f318442a = aVar;
        this.f318443b = context;
        this.f318444c = aVar2;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f318445d.mo77270a() != 2) {
            return C83903bi.m133649e(1, (Intent) null);
        }
        Context context = this.f318443b;
        C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
        hwVar.copyOnWrite();
        C53287ih ihVar = (C53287ih) hwVar.instance;
        ihVar.f139698d = 2;
        ihVar.f139695a = 1 | ihVar.f139695a;
        hwVar.copyOnWrite();
        C53287ih ihVar2 = (C53287ih) hwVar.instance;
        ihVar2.f139702h = 17;
        ihVar2.f139695a |= 64;
        hwVar.copyOnWrite();
        C53287ih ihVar3 = (C53287ih) hwVar.instance;
        ihVar3.f139703i = 45;
        ihVar3.f139695a |= 128;
        ((C87571n) this.f318444c.mo27525b()).mo81698j(context, (C53287ih) hwVar.build());
        return C83903bi.m133649e(-1, (Intent) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C83883aq o = C83884ar.m133585o();
        ((C83944k) o).f228637d = 17;
        o.mo77254i(36);
        o.mo77255j(18);
        C83885as a = ((C109789ai) this.f318442a.mo27525b()).mo98123a(o.mo77246a());
        this.f318445d = a;
        return C58485gu.m89846n(a);
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        C58976aa aaVar = C58975e.f156826a;
        return C83903bi.m133649e(1, (Intent) null);
    }
}
