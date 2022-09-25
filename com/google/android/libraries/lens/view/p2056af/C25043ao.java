package com.google.android.libraries.lens.view.p2056af;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.lens.view.af.ao */
/* compiled from: PG */
public final class C25043ao {

    /* renamed from: a */
    public final C19576m f68249a;

    /* renamed from: b */
    public final C58881cr f68250b = C58886cw.m90973a(new C25089s(this));

    /* renamed from: c */
    public final C58881cr f68251c = C58886cw.m90973a(new C25091u(this));

    /* renamed from: d */
    public final C58881cr f68252d = C58886cw.m90973a(new C25094x(this));

    /* renamed from: e */
    public final C58881cr f68253e = C58886cw.m90973a(new C25095y(this));

    /* renamed from: f */
    public final C58881cr f68254f = C58886cw.m90973a(new C25030ab(this));

    /* renamed from: g */
    public final C58881cr f68255g = C58886cw.m90973a(new C25031ac(this));

    /* renamed from: h */
    public final C58881cr f68256h = C58886cw.m90973a(new C25033ae(this));

    /* renamed from: i */
    public final C58881cr f68257i = C58886cw.m90973a(new C25034af(this));

    /* renamed from: j */
    public final C58881cr f68258j = C58886cw.m90973a(new C25032ad(this));

    /* renamed from: k */
    public final C58881cr f68259k = C58886cw.m90973a(new C25035ag(this));

    /* renamed from: l */
    public final C58881cr f68260l = C58886cw.m90973a(new C25038aj(this));

    /* renamed from: m */
    public final C58881cr f68261m = C58886cw.m90973a(new C25039ak(this));

    /* renamed from: n */
    public final C58881cr f68262n = C58886cw.m90973a(new C25040al(this));

    /* renamed from: o */
    public final C58881cr f68263o = C58886cw.m90973a(new C25041am(this));

    /* renamed from: p */
    public final C58881cr f68264p = C58886cw.m90973a(new C25042an(this));

    /* renamed from: q */
    public final C58881cr f68265q = C58886cw.m90973a(new C25090t(this));

    /* renamed from: r */
    public final C58881cr f68266r = C58886cw.m90973a(new C25092v(this));

    /* renamed from: s */
    private final C19575l f68267s;

    /* renamed from: t */
    private final C58881cr f68268t = C58886cw.m90973a(new C25096z(this));

    /* renamed from: u */
    private final C58881cr f68269u = C58886cw.m90973a(new C25029aa(this));

    /* renamed from: v */
    private final C58881cr f68270v = C58886cw.m90973a(new C25036ah(this));

    /* renamed from: w */
    private final C58881cr f68271w = C58886cw.m90973a(new C25037ai(this));

    public C25043ao(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C25093w(this));
        C19576m e = C19576m.m37335e("lens_android");
        this.f68249a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f68267s = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f68267s = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }

    /* renamed from: a */
    public final void mo30235a(String str) {
        ((C19567d) this.f68270v.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: b */
    public final void mo30236b(String str) {
        ((C19567d) this.f68271w.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: c */
    public final void mo30237c(double d, int i, int i2) {
        ((C19569f) this.f68269u.mo6453a()).mo24824b(d, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: d */
    public final void mo30238d(double d) {
        ((C19569f) this.f68268t.mo6453a()).mo24824b(d, new Object[0]);
    }
}
