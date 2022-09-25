package com.google.android.apps.gsa.tasks;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89963ab;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.tasks.x */
/* compiled from: PG */
public final class C118565x implements C118561t, C58881cr {

    /* renamed from: f */
    private static final C59071e f329174f = C59071e.m91332i("com.google.android.apps.gsa.tasks.x");

    /* renamed from: a */
    public final C118533ch f329175a;

    /* renamed from: b */
    public final C21370a f329176b;

    /* renamed from: c */
    public final int f329177c;

    /* renamed from: d */
    public final C58881cr f329178d;

    /* renamed from: e */
    public final boolean f329179e;

    /* renamed from: g */
    private final C118478am f329180g;

    /* renamed from: h */
    private final C86124t f329181h;

    /* renamed from: i */
    private final Set f329182i;

    public C118565x(Context context, C118478am amVar, C118527cb cbVar, C86124t tVar, C118533ch chVar, C21370a aVar, int i, boolean z, Set set) {
        this.f329180g = amVar;
        this.f329181h = tVar;
        this.f329175a = chVar;
        this.f329176b = aVar;
        this.f329177c = i;
        this.f329179e = z;
        this.f329182i = set;
        C58886cw.m90973a(new C118563v(context));
        Objects.requireNonNull(cbVar);
        this.f329178d = C58886cw.m90973a(new C118564w(cbVar));
    }

    /* renamed from: i */
    private final C118472ag m196846i(C118472ag agVar) {
        if (!this.f329179e) {
            return agVar;
        }
        int a = C118470ae.m196676a(agVar.f328824d);
        if (a != 0 && a != 1) {
            return agVar;
        }
        C118471af afVar = (C118471af) agVar.toBuilder();
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328824d = 1;
        agVar2.f328821a |= 4;
        return (C118472ag) afVar.build();
    }

    /* renamed from: j */
    private final void m196847j(int i, C118522by byVar, C118472ag agVar) {
        long d = this.f329176b.mo26872d();
        C118484as asVar = (C118484as) C118485at.f328861h.createBuilder();
        asVar.copyOnWrite();
        C118485at atVar = (C118485at) asVar.instance;
        atVar.f328863a |= 1;
        atVar.f328864b = i;
        asVar.copyOnWrite();
        C118485at atVar2 = (C118485at) asVar.instance;
        atVar2.f328865c = byVar.f329106cj;
        atVar2.f328863a |= 2;
        C118476ak akVar = agVar.f328827g;
        if (akVar == null) {
            akVar = C118476ak.f328838a;
        }
        asVar.copyOnWrite();
        C118485at atVar3 = (C118485at) asVar.instance;
        akVar.getClass();
        atVar3.f328866d = akVar;
        atVar3.f328863a |= 4;
        int i2 = this.f329177c;
        asVar.copyOnWrite();
        C118485at atVar4 = (C118485at) asVar.instance;
        atVar4.f328863a |= 8;
        atVar4.f328867e = i2;
        if (agVar.f328822b == 0 && agVar.f328823c <= TimeUnit.SECONDS.toMillis(15)) {
            asVar.copyOnWrite();
            C118485at atVar5 = (C118485at) asVar.instance;
            atVar5.f328863a |= 16;
            atVar5.f328868f = d;
        }
        C118466aa c = C118523bz.m196762c(i);
        C58976aa aaVar = C58975e.f156826a;
        ((C118526ca) this.f329178d.mo6453a()).mo103721e(agVar, (C118485at) asVar.build());
        this.f329175a.mo103739c(c.f328808d, byVar, d);
    }

    /* renamed from: b */
    public final Integer mo103751b(C118522by byVar, C118472ag agVar) {
        int i;
        if (!mo103757h(byVar)) {
            return null;
        }
        C118567z.m196858a(agVar);
        C118472ag i2 = m196846i(agVar);
        C118478am amVar = this.f329180g;
        synchronized (amVar.f328846c) {
            amVar.f328847d--;
            amVar.f328850g.edit().putInt("background_tasks_last_generated_id", amVar.f328847d).apply();
            i = amVar.f328847d;
        }
        m196847j(i, byVar, i2);
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo103752c(C118522by byVar) {
        mo103756g(C118523bz.m196760a(byVar));
        this.f329180g.mo103715b(byVar);
    }

    /* renamed from: d */
    public final void mo103753d(int i) {
        if (C118523bz.m196762c(i) != C118466aa.NONEXCLUSIVE) {
            C59104x d = f329174f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BgTaskSchedulerImpl");
            ((C59052c) ((C59052c) d).mo56372aa(33977)).mo56387q("%d is not a valid non-exclusive task id.", i);
            int i2 = C90755l.f253831a;
            return;
        }
        mo103756g(i);
    }

    /* renamed from: e */
    public final boolean mo103754e(C118522by byVar, C118472ag agVar) {
        Integer num;
        if (!mo103757h(byVar)) {
            return false;
        }
        C118567z.m196858a(agVar);
        C118472ag i = m196846i(agVar);
        C118478am amVar = this.f329180g;
        synchronized (amVar.f328848e) {
            long c = amVar.f328849f.mo26871c();
            long millis = (amVar.f328848e.containsKey(byVar) ? TimeUnit.SECONDS.toMillis((long) ((Integer) amVar.f328848e.get(byVar)).intValue()) : 0) - c;
            if (millis > 0) {
                ((C59052c) ((C59052c) C118478am.f328844a.mo56224b()).mo56372aa(33978)).mo56353F("Refusing EXCLUSIVE task %s, it is already pending. Try again in %d seconds.", byVar, TimeUnit.MILLISECONDS.toSeconds(millis));
                num = null;
            } else {
                amVar.f328848e.put(byVar, Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(c + i.f328822b + i.f328823c + C118478am.f328845b)));
                amVar.mo103714a();
                num = Integer.valueOf(C118523bz.m196760a(byVar));
            }
        }
        if (num == null) {
            return false;
        }
        m196847j(num.intValue(), byVar, i);
        return true;
    }

    /* renamed from: f */
    public final C118526ca mo6453a() {
        return (C118526ca) this.f329178d.mo6453a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo103756g(int i) {
        ((C118526ca) this.f329178d.mo6453a()).mo103723g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo103757h(C118522by byVar) {
        return !this.f329181h.mo79745c(C89963ab.f246490g).contains(byVar.name()) && Collection.EL.stream(this.f329182i).allMatch(new C118562u(byVar));
    }
}
