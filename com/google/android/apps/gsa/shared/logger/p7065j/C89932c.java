package com.google.android.apps.gsa.shared.logger.p7065j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.p4193c.p4200e.C55996d;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58161m;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58162n;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58164p;
import com.google.p4500cm.p4518d.C58177a;
import com.google.p4500cm.p4518d.C58186c;
import com.google.p4500cm.p4518d.C58187d;
import com.google.p4500cm.p4518d.C58188e;
import com.google.p4500cm.p4518d.C58189f;
import com.google.p4500cm.p4518d.C58190g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.logger.j.c */
/* compiled from: PG */
public final class C89932c {

    /* renamed from: a */
    public static final C59071e f246390a = C59071e.m91332i("com.google.android.apps.gsa.shared.logger.j.c");

    /* renamed from: b */
    public static final C89932c f246391b = new C89932c();

    /* renamed from: l */
    private static final C89934e f246392l = new C89934e();

    /* renamed from: c */
    public final Object f246393c = new Object();

    /* renamed from: d */
    public final List f246394d = new ArrayList();

    /* renamed from: e */
    public List f246395e = new ArrayList();

    /* renamed from: f */
    public long f246396f = -1;

    /* renamed from: g */
    public boolean f246397g = true;

    /* renamed from: h */
    public boolean f246398h;

    /* renamed from: i */
    public String f246399i;

    /* renamed from: j */
    public boolean f246400j;

    /* renamed from: k */
    public C89930a f246401k;

    /* renamed from: m */
    private boolean f246402m = true;

    private C89932c() {
    }

    /* renamed from: a */
    public static C58177a m146484a(long j, long j2) {
        C58177a aVar = (C58177a) C58186c.f155565i.createBuilder();
        aVar.copyOnWrite();
        C58186c cVar = (C58186c) aVar.instance;
        cVar.f155567a |= 4;
        cVar.f155570d = j;
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        aVar.copyOnWrite();
        C58186c cVar2 = (C58186c) aVar.instance;
        cVar2.f155567a |= 2;
        cVar2.f155569c = micros;
        if (j2 > -1) {
            aVar.copyOnWrite();
            C58186c cVar3 = (C58186c) aVar.instance;
            cVar3.f155567a |= 8;
            cVar3.f155571e = j2;
        }
        return aVar;
    }

    /* renamed from: j */
    public static final C58189f m146485j(List list) {
        C58189f fVar = (C58189f) C58190g.f155597d.createBuilder();
        for (int i = 0; i < list.size(); i++) {
            fVar.copyOnWrite();
            C58190g gVar = (C58190g) fVar.instance;
            C58186c cVar = (C58186c) ((C58177a) list.get(i)).build();
            cVar.getClass();
            gVar.mo54680a();
            gVar.f155601c.add(cVar);
        }
        return fVar;
    }

    /* renamed from: k */
    private final void m146486k(View view) {
        boolean z;
        if (C89941l.m146510a(view) == -1) {
            C89941l.m146512c(view, 6727);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.f246402m;
        C89949q.m146521e(C28285c.m52874a(view, true != z2 ? 647 : 472), !z2);
        if (z) {
            C89941l.m146511b(view);
        }
    }

    /* renamed from: l */
    private final boolean m146487l() {
        return this.f246400j && this.f246401k != null;
    }

    /* renamed from: m */
    private static final String m146488m(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((C58164p) it.next()).f155507b);
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final C58187d mo83772b(C89933d dVar) {
        if (dVar == null) {
            return (C58187d) C58188e.f155576t.createBuilder();
        }
        C58187d dVar2 = (C58187d) C58188e.f155576t.createBuilder();
        C55998f fVar = dVar.f246412j;
        dVar2.copyOnWrite();
        C58188e eVar = (C58188e) dVar2.instance;
        eVar.f155588k = fVar.f149132g;
        eVar.f155578a |= 4096;
        int i = dVar.f246410h.f146230cP;
        dVar2.copyOnWrite();
        C58188e eVar2 = (C58188e) dVar2.instance;
        eVar2.f155578a |= 1024;
        eVar2.f155586i = i;
        String b = C39191a.m68623b(dVar.f246403a);
        dVar2.copyOnWrite();
        C58188e eVar3 = (C58188e) dVar2.instance;
        b.getClass();
        eVar3.f155578a |= 4;
        eVar3.f155581d = b;
        boolean z = dVar.f246404b;
        dVar2.copyOnWrite();
        C58188e eVar4 = (C58188e) dVar2.instance;
        eVar4.f155578a |= 8;
        eVar4.f155582e = !z;
        boolean z2 = dVar.f246405c;
        dVar2.copyOnWrite();
        C58188e eVar5 = (C58188e) dVar2.instance;
        eVar5.f155578a |= 16;
        eVar5.f155583f = z2;
        String str = dVar.f246406d;
        dVar2.copyOnWrite();
        C58188e eVar6 = (C58188e) dVar2.instance;
        str.getClass();
        eVar6.f155578a |= 2;
        eVar6.f155580c = str;
        boolean z3 = dVar.f246411i;
        dVar2.copyOnWrite();
        C58188e eVar7 = (C58188e) dVar2.instance;
        eVar7.f155578a |= 2048;
        eVar7.f155587j = z3;
        boolean z4 = dVar.f246419q;
        dVar2.copyOnWrite();
        C58188e eVar8 = (C58188e) dVar2.instance;
        eVar8.f155578a |= 16384;
        eVar8.f155590m = z4;
        boolean z5 = dVar.f246420r;
        dVar2.copyOnWrite();
        C58188e eVar9 = (C58188e) dVar2.instance;
        eVar9.f155578a |= 32768;
        eVar9.f155591n = z5;
        boolean z6 = dVar.f246421s;
        dVar2.copyOnWrite();
        C58188e eVar10 = (C58188e) dVar2.instance;
        eVar10.f155578a |= 65536;
        eVar10.f155592o = z6;
        boolean z7 = dVar.f246413k;
        dVar2.copyOnWrite();
        C58188e eVar11 = (C58188e) dVar2.instance;
        eVar11.f155578a |= 1048576;
        eVar11.f155593p = z7;
        int i2 = dVar.f246414l;
        dVar2.copyOnWrite();
        C58188e eVar12 = (C58188e) dVar2.instance;
        eVar12.f155578a |= 8388608;
        eVar12.f155595r = i2;
        int i3 = dVar.f246417o;
        if (i3 != 0) {
            dVar2.copyOnWrite();
            C58188e eVar13 = (C58188e) dVar2.instance;
            eVar13.f155578a |= 16777216;
            eVar13.f155596s = i3;
        }
        C55996d dVar3 = dVar.f246415m;
        if (dVar3 != null) {
            dVar2.copyOnWrite();
            C58188e eVar14 = (C58188e) dVar2.instance;
            eVar14.f155589l = dVar3;
            eVar14.f155578a |= 8192;
        }
        if (dVar.f246404b) {
            String str2 = dVar.f246409g;
            if (str2 != null) {
                dVar2.copyOnWrite();
                C58188e eVar15 = (C58188e) dVar2.instance;
                eVar15.f155578a |= 1;
                eVar15.f155579b = str2;
            } else {
                C59104x d = f246390a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ActionCardEventLogger");
                ((C59052c) ((C59052c) d).mo56372aa(10712)).mo56386p("Impression Data with null event id.");
            }
        }
        int i4 = dVar.f246407e;
        if (i4 != 0) {
            dVar2.copyOnWrite();
            C58188e eVar16 = (C58188e) dVar2.instance;
            eVar16.f155578a |= 256;
            eVar16.f155584g = i4;
        }
        long j = dVar.f246408f;
        if (j >= 0) {
            dVar2.copyOnWrite();
            C58188e eVar17 = (C58188e) dVar2.instance;
            eVar17.f155578a |= 512;
            eVar17.f155585h = (int) j;
        }
        return dVar2;
    }

    /* renamed from: c */
    public final void mo83773c(C58177a aVar, boolean z) {
        if (z && !this.f246395e.isEmpty()) {
            mo83774d(m146485j(this.f246395e));
            this.f246395e = new ArrayList();
        }
        C89930a aVar2 = this.f246401k;
        if (!m146487l() || aVar2 == null) {
            this.f246395e.add(aVar);
            return;
        }
        boolean z2 = true;
        for (C58177a build : this.f246395e) {
            aVar2.mo79249a((C58186c) build.build(), z2);
            z2 = false;
        }
        this.f246395e.clear();
        aVar2.mo79249a((C58186c) aVar.build(), z);
    }

    /* renamed from: d */
    public final void mo83774d(C58189f fVar) {
        synchronized (this.f246393c) {
            this.f246394d.add(fVar);
        }
    }

    /* renamed from: e */
    public final void mo83775e(View view) {
        C58177a aVar;
        if (this.f246397g) {
            List d = C89941l.m146513d(view, f246392l);
            if (!this.f246395e.isEmpty()) {
                List list = this.f246395e;
                aVar = (C58177a) list.get(list.size() - 1);
            } else {
                if (!m146487l()) {
                    C59104x c = f246390a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ActionCardEventLogger");
                    ((C59052c) ((C59052c) c).mo56372aa(10717)).mo56386p("No previous ACLE when logCardUpdateImpression");
                }
                aVar = null;
            }
            String m = m146488m(d);
            if (m.equals(this.f246399i)) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            this.f246399i = m;
            if (aVar != null) {
                C58186c cVar = (C58186c) aVar.instance;
                if ((cVar.f155567a & 1024) != 0 && cVar.f155572f.size() == 0) {
                    aVar.mo54679a(d);
                    this.f246396f = ((C58186c) aVar.instance).f155570d;
                    C58976aa aaVar2 = C58975e.f156826a;
                    m146486k(view);
                }
            }
            C59104x d2 = f246390a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ActionCardEventLogger");
            ((C59052c) ((C59052c) d2).mo56372aa(10713)).mo56386p("CardUpdateImpression without an interaction.");
            long b = C90719ac.f253778a.mo85084b();
            C58177a a = m146484a(b, this.f246396f);
            a.mo54679a(d);
            int i = true != this.f246398h ? 2 : 3;
            a.copyOnWrite();
            C58186c cVar2 = (C58186c) a.instance;
            C58186c cVar3 = C58186c.f155565i;
            cVar2.f155573g = i - 1;
            cVar2.f155567a |= 512;
            this.f246396f = b;
            mo83773c(a, false);
            m146486k(view);
        }
    }

    /* renamed from: f */
    public final void mo83776f(View view, C89933d dVar) {
        if (this.f246397g) {
            mo83777g(C89941l.m146513d(view, f246392l), dVar);
            m146486k(view);
        }
    }

    /* renamed from: g */
    public final void mo83777g(List list, C89933d dVar) {
        long b = C90719ac.f253778a.mo85084b();
        this.f246396f = b;
        this.f246402m = dVar.f246416n;
        this.f246398h = dVar.f246418p;
        C58177a a = m146484a(b, -1);
        int i = true != this.f246398h ? 2 : 3;
        a.copyOnWrite();
        C58186c cVar = (C58186c) a.instance;
        C58186c cVar2 = C58186c.f155565i;
        cVar.f155573g = i - 1;
        cVar.f155567a |= 512;
        C58188e eVar = (C58188e) mo83772b(dVar).build();
        a.copyOnWrite();
        C58186c cVar3 = (C58186c) a.instance;
        eVar.getClass();
        cVar3.f155568b = eVar;
        cVar3.f155567a |= 1;
        a.mo54679a(list);
        mo83773c(a, true);
        this.f246399i = m146488m(list);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: h */
    public final void mo83778h(View view, int i) {
        int i2;
        if (this.f246397g) {
            int a = C89941l.m146510a(view);
            if (a < 0) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            Object tag = view.getTag(R.id.ve_index);
            C58838bb.m90869d(tag == null || (tag instanceof Integer), "ve_index can only be an Integer.");
            if (tag == null) {
                C59104x c = f246390a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ActionCardEventLogger");
                ((C59052c) ((C59052c) c).mo56372aa(10719)).mo56386p("Interaction on a VE with no ve_index.");
                i2 = -1;
            } else {
                i2 = ((Integer) tag).intValue();
            }
            mo83779i(a, i2, i);
            C89949q.m146521e(C28285c.m52882i(view, i, (Integer) null), !this.f246402m);
        }
    }

    /* renamed from: i */
    public final void mo83779i(int i, int i2, int i3) {
        if (this.f246396f == -1) {
            C59104x c = f246390a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ActionCardEventLogger");
            ((C59052c) ((C59052c) c).mo56372aa(10722)).mo56386p("Interaction on a VE with no impression.");
        }
        C58177a a = m146484a(C90719ac.f253778a.mo85084b(), this.f246396f);
        C58161m mVar = (C58161m) C58162n.f155498e.createBuilder();
        mVar.copyOnWrite();
        C58162n nVar = (C58162n) mVar.instance;
        nVar.f155500a |= 1;
        nVar.f155501b = i;
        mVar.copyOnWrite();
        C58162n nVar2 = (C58162n) mVar.instance;
        int i4 = 2;
        nVar2.f155500a |= 2;
        nVar2.f155502c = i2;
        mVar.copyOnWrite();
        C58162n nVar3 = (C58162n) mVar.instance;
        nVar3.f155500a |= 4;
        nVar3.f155503d = i3 - 1;
        C58162n nVar4 = (C58162n) mVar.build();
        a.copyOnWrite();
        C58186c cVar = (C58186c) a.instance;
        C58186c cVar2 = C58186c.f155565i;
        nVar4.getClass();
        cVar.f155574h = nVar4;
        cVar.f155567a |= 1024;
        if (true == this.f246398h) {
            i4 = 3;
        }
        a.copyOnWrite();
        C58186c cVar3 = (C58186c) a.instance;
        cVar3.f155573g = i4 - 1;
        cVar3.f155567a |= 512;
        mo83773c(a, false);
        this.f246399i = null;
        C58976aa aaVar = C58975e.f156826a;
    }
}
