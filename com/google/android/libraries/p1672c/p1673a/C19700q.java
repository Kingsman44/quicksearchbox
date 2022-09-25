package com.google.android.libraries.p1672c.p1673a;

import com.google.android.gms.car.C143100al;
import com.google.android.gms.car.CarCall;
import com.google.common.p4522b.C58746ql;
import com.google.common.p4522b.C58747qm;
import com.google.common.p4522b.C58748qn;
import com.google.common.p4522b.C58749qo;
import com.google.common.p4522b.C58756qv;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.c.a.q */
/* compiled from: PG */
public final class C19700q {

    /* renamed from: a */
    List f54712a;

    /* renamed from: b */
    CarCall f54713b;

    /* renamed from: c */
    Set f54714c;

    /* renamed from: d */
    Map f54715d;

    /* renamed from: e */
    public Boolean f54716e;

    /* renamed from: f */
    Integer f54717f;

    /* renamed from: g */
    public Integer f54718g;

    /* renamed from: h */
    final /* synthetic */ C19701r f54719h;

    public C19700q(C19701r rVar) {
        this.f54719h = rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25081a() {
        C19700q qVar;
        if (mo25082b()) {
            this.f54715d = new HashMap();
            for (CarCall carCall : this.f54714c) {
                this.f54715d.put(Integer.valueOf(carCall.f387931a), carCall);
            }
            C19701r rVar = this.f54719h;
            synchronized (rVar.f54722c) {
                qVar = rVar.f54723d;
                if (!this.f54714c.isEmpty() && this.f54718g.intValue() == 0) {
                    if (qVar == null || !qVar.mo25082b() || qVar.f54718g.intValue() == 0) {
                        ((C58970a) ((C58970a) C19701r.f54720a.mo56226d()).mo56372aa(47888)).mo56386p("Using default audio state since new state has active calls and invalid audio state");
                        this.f54718g = 2;
                        this.f54717f = Integer.valueOf(2 | this.f54717f.intValue());
                    } else {
                        ((C58970a) ((C58970a) C19701r.f54720a.mo56226d()).mo56372aa(47889)).mo56386p("Using previous audio state since new state has active calls and invalid audio state");
                        this.f54718g = qVar.f54718g;
                        this.f54717f = qVar.f54717f;
                    }
                }
                rVar.f54723d = this;
            }
            if (qVar == null || !qVar.mo25082b()) {
                C19701r.m37514e(rVar.f54721b, this.f54714c);
                for (CarCall carCall2 : this.f54714c) {
                    C58976aa aaVar = C58975e.f156826a;
                }
                return;
            }
            C58756qv c = C58758qx.m90645c(this.f54714c, qVar.f54714c);
            C58756qv c2 = C58758qx.m90645c(qVar.f54714c, this.f54714c);
            C58756qv d = C58758qx.m90646d(qVar.f54714c, this.f54714c);
            C19701r.m37514e(rVar.f54721b, c);
            for (C143100al alVar : rVar.f54721b) {
                C58748qn qnVar = new C58748qn((C58749qo) c2);
                while (qnVar.hasNext()) {
                    alVar.mo21808c((CarCall) qnVar.next());
                }
                C58746ql qlVar = new C58746ql((C58747qm) d);
                while (qlVar.hasNext()) {
                    int i = ((CarCall) qlVar.next()).f387931a;
                    Map map = qVar.f54715d;
                    Integer valueOf = Integer.valueOf(i);
                    CarCall carCall3 = (CarCall) map.get(valueOf);
                    carCall3.getClass();
                    CarCall carCall4 = (CarCall) this.f54715d.get(valueOf);
                    carCall4.getClass();
                    C19701r.m37513d(carCall3.f387932b, carCall4.f387932b);
                    C19701r.m37513d(carCall3.f387933c, carCall4.f387933c);
                    C19701r.m37513d(carCall3.f387934d, carCall4.f387934d);
                    int i2 = carCall3.f387935e;
                    int i3 = carCall4.f387935e;
                    if (i2 != i3) {
                        alVar.mo21809d(carCall4, i3);
                    }
                    CarCall.Details details = carCall3.f387936f;
                    CarCall.Details details2 = carCall4.f387936f;
                    if (details2 == null) {
                        ((C58970a) ((C58970a) C19701r.f54720a.mo56225c()).mo56372aa(47903)).mo56386p("New call has null details.");
                    } else if (details != null && !C19701r.m37513d(details.f387940a, details2.f387940a) && !C19701r.m37513d(details.f387941b, details2.f387941b) && !C19701r.m37513d(details.f387942c, details2.f387942c) && !C19701r.m37513d(details.f387945f, details2.f387945f)) {
                        C19701r.m37513d(details.f387944e, details2.f387944e);
                    }
                    List b = C19701r.m37512b(carCall3, qVar);
                    List b2 = C19701r.m37512b(carCall4, this);
                    if (b.containsAll(b2)) {
                        b2.containsAll(b);
                    }
                }
                CarCall carCall5 = this.f54713b;
                if (!(carCall5 == null || this.f54712a == null)) {
                    this.f54715d.containsKey(Integer.valueOf(carCall5.f387931a));
                }
            }
            if (!this.f54714c.isEmpty()) {
                if (!qVar.f54716e.equals(this.f54716e) || !qVar.f54718g.equals(this.f54718g) || !qVar.f54717f.equals(this.f54717f)) {
                    for (C143100al a : rVar.f54721b) {
                        a.mo21806a(this.f54716e.booleanValue(), this.f54718g.intValue(), this.f54717f.intValue());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo25082b() {
        return (this.f54714c == null || this.f54716e == null || this.f54717f == null || this.f54718g == null) ? false : true;
    }
}
