package com.google.android.apps.gsa.staticplugins.opa.samson.p8430e;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.lifecycle.C2331af;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110254f;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8432g.C110134a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8432g.C110135b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8441m.C110257b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8441m.C110258c;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8441m.C110259d;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8444p.C110310b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8444p.C110311c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.e.e */
/* compiled from: PG */
public final class C110130e extends C2331af {

    /* renamed from: i */
    public final C2332ag f306881i;

    /* renamed from: j */
    long f306882j;

    /* renamed from: k */
    long f306883k;

    /* renamed from: l */
    C110135b f306884l;

    /* renamed from: m */
    C110135b f306885m;

    /* renamed from: n */
    private final int f306886n;

    /* renamed from: o */
    private final C21370a f306887o;

    /* renamed from: p */
    private final C86338r f306888p;

    /* renamed from: q */
    private final long f306889q;

    /* renamed from: r */
    private final C110310b f306890r;

    /* renamed from: s */
    private final C110257b f306891s;

    /* renamed from: t */
    private final Calendar f306892t = Calendar.getInstance();

    /* renamed from: u */
    private final long f306893u;

    /* renamed from: v */
    private final boolean f306894v;

    /* renamed from: w */
    private final int f306895w;

    /* renamed from: x */
    private final int f306896x;

    public C110130e(Context context, C86124t tVar, C86338r rVar, C21370a aVar, C110254f fVar, C110258c cVar, C110311c cVar2) {
        C86124t tVar2 = tVar;
        C86338r rVar2 = rVar;
        C110258c cVar3 = cVar;
        this.f306887o = aVar;
        this.f306888p = rVar2;
        this.f306889q = (long) ((int) tVar2.mo79743a(C90014bt.f247066aD));
        long a = tVar2.mo79743a(C90014bt.f247114az);
        double m = tVar2.mo79747m(C90014bt.f247065aC);
        C110259d dVar = (C110259d) cVar3.f307277a.mo17428b();
        dVar.getClass();
        C110311c cVar4 = (C110311c) cVar3.f307278b.mo17428b();
        cVar4.getClass();
        C110257b bVar = new C110257b((long) ((int) a), m, dVar, cVar4);
        this.f306891s = bVar;
        C110310b a2 = cVar2.mo98561a((long) ((int) tVar2.mo79743a(C90014bt.f247114az)));
        this.f306890r = a2;
        this.f306886n = (int) tVar2.mo79743a(C90014bt.f247063aA);
        Sensor defaultSensor = ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(5);
        this.f306893u = (long) ((int) tVar2.mo79743a(C90014bt.f247074aL));
        this.f306895w = (int) tVar2.mo79743a(C90014bt.f247112ax);
        this.f306896x = (int) tVar2.mo79743a(C90014bt.f247111aw);
        this.f306894v = tVar2.mo79746e(C90014bt.f247113ay);
        C2332ag agVar = new C2332ag();
        this.f306881i = agVar;
        this.f306883k = aVar.mo26870b();
        if (defaultSensor != null) {
            m183433p(fVar, new C110126a(this));
        }
        if (tVar2.mo79746e(C90014bt.f247068aF)) {
            m183433p(bVar, new C110127b(this));
        }
        mo5727n(agVar, new C110128c(this));
        mo5727n(a2, new C110129d(this));
        if (!rVar2.contains("com.google.android.apps.gsa.staticplugins.opa.samson.idle.last_successful_idle")) {
            C86337q b = rVar.mo80076b();
            b.mo80072g("com.google.android.apps.gsa.staticplugins.opa.samson.idle.last_successful_idle", aVar.mo26870b());
            b.apply();
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: p */
    private final void m183433p(LiveData liveData, C2333ah ahVar) {
        C21370a aVar = this.f306887o;
        C2331af afVar = new C2331af();
        afVar.mo5727n(liveData, new C110134a(aVar, afVar));
        mo5727n(afVar, ahVar);
    }

    /* renamed from: q */
    private final boolean m183434q(int i) {
        return i >= this.f306895w && i <= this.f306896x;
    }

    /* renamed from: b */
    public final void mo98404b() {
        this.f306881i.mo5708l(Long.valueOf(this.f306887o.mo26870b()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        super.mo5677g();
        this.f306882j = this.f306887o.mo26870b();
        this.f306881i.mo5708l(Long.valueOf(this.f306887o.mo26870b()));
        this.f306883k = this.f306887o.mo26870b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        super.mo5678h();
        mo5708l(false);
    }

    /* renamed from: o */
    public final void mo98405o() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        boolean z = true;
        long j5 = 0;
        if (this.f306893u > 0) {
            long b = this.f306887o.mo26870b();
            long j6 = this.f306882j;
            C58976aa aaVar = C58975e.f156826a;
            if (b - j6 < this.f306893u) {
                z = false;
            }
            mo5708l(Boolean.valueOf(z));
        } else if (!this.f306894v) {
            if (this.f306885m == null || !Boolean.TRUE.equals(this.f306885m.f306905b)) {
                j = 0;
            } else {
                long min = Math.min((this.f306887o.mo26870b() - this.f306885m.f306906c) / this.f306889q, 60);
                j = min * min;
            }
            long b2 = (this.f306887o.mo26870b() - this.f306883k) / this.f306889q;
            if (b2 < 15) {
                j2 = (long) Math.pow((double) (b2 - 15), 3.0d);
            } else {
                long j7 = b2 - 15;
                j2 = j7 * j7;
            }
            long min2 = j + j2 + ((this.f306884l == null || !Boolean.TRUE.equals(this.f306884l.f306905b)) ? 0 : Math.min((this.f306887o.mo26870b() - this.f306884l.f306906c) / this.f306889q, 60) * 60);
            long b3 = (this.f306887o.mo26870b() - this.f306882j) / this.f306889q;
            if (b3 < 60) {
                j3 = 0;
            } else {
                long j8 = b3 - 60;
                if (j8 > 0) {
                    j3 = Math.min(j8, 120) * 30;
                    j8 -= 120;
                } else {
                    j3 = 0;
                }
                if (j8 > 0) {
                    j3 += j8 * j8;
                }
            }
            long j9 = min2 + j3;
            this.f306892t.setTimeInMillis(this.f306887o.mo26870b());
            int i2 = this.f306892t.get(11);
            if (!m183434q(i2)) {
                j4 = 0;
            } else {
                j4 = 2400 - ((long) (Math.abs(3 - i2) * 800));
            }
            long j10 = j9 + j4;
            if ((this.f306887o.mo26870b() - Math.max(this.f306883k, this.f306882j)) / this.f306889q >= 30) {
                long b4 = (this.f306887o.mo26870b() - this.f306888p.getLong("com.google.android.apps.gsa.staticplugins.opa.samson.idle.last_successful_idle", 0)) / this.f306889q;
                if (b4 < 720) {
                    i = -this.f306886n;
                } else if (b4 > 4320) {
                    i = this.f306886n;
                }
                long j11 = (long) i;
                j5 = j11 + j11;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            mo5708l(Boolean.valueOf(j10 + j5 > ((long) this.f306886n)));
        } else if ((this.f306887o.mo26870b() - Math.max(this.f306883k, this.f306882j)) / this.f306889q < 30) {
            mo5708l(false);
        } else {
            long b5 = (this.f306887o.mo26870b() - this.f306888p.getLong("com.google.android.apps.gsa.staticplugins.opa.samson.idle.last_successful_idle", 0)) / this.f306889q;
            if (b5 < 1440) {
                mo5708l(false);
                return;
            }
            this.f306892t.setTimeInMillis(this.f306887o.mo26870b());
            if (m183434q(this.f306892t.get(11))) {
                mo5708l(true);
            } else if (b5 > 4320) {
                mo5708l(true);
            } else {
                mo5708l(false);
            }
        }
    }
}
