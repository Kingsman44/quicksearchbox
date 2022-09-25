package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.gms.car.C143100al;
import com.google.android.gms.car.C143319j;
import com.google.android.gms.car.C143321k;
import com.google.android.gms.car.C143339x;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.android.libraries.p1672c.p1673a.C19684a;
import com.google.android.libraries.p1672c.p1673a.C19685b;
import com.google.android.libraries.p1672c.p1673a.C19690g;
import com.google.android.libraries.p1672c.p1673a.C19691h;
import com.google.android.libraries.p1672c.p1673a.C19692i;
import com.google.android.libraries.p1672c.p1673a.C19697n;
import com.google.android.libraries.p1672c.p1673a.C19698o;
import com.google.android.libraries.p1672c.p1673a.C19700q;
import com.google.android.libraries.p1672c.p1673a.C19701r;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.k */
/* compiled from: PG */
public final class C14912k implements C14907f {

    /* renamed from: a */
    public static final C59071e f44834a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.k");

    /* renamed from: b */
    C19684a f44835b;

    /* renamed from: c */
    C143100al f44836c;

    /* renamed from: d */
    private final Context f44837d;

    /* renamed from: e */
    private final C86124t f44838e;

    /* renamed from: f */
    private final C15388p f44839f;

    public C14912k(Context context, C86124t tVar, C15388p pVar) {
        this.f44837d = context;
        this.f44838e = tVar;
        this.f44839f = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        return 2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21819a() {
        /*
            r3 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r3.mo21839q()
            if (r0 == 0) goto L_0x002e
            com.google.android.libraries.c.a.a r0 = r3.f44835b
            r0.getClass()
            r1 = r0
            com.google.android.libraries.c.a.r r1 = (com.google.android.libraries.p1672c.p1673a.C19701r) r1
            java.lang.Object r1 = r1.f54722c
            monitor-enter(r1)
            com.google.android.libraries.c.a.r r0 = (com.google.android.libraries.p1672c.p1673a.C19701r) r0     // Catch:{ all -> 0x002b }
            com.google.android.libraries.c.a.q r0 = r0.f54723d     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0028
            boolean r2 = r0.mo25082b()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            java.lang.Integer r0 = r0.f54718g     // Catch:{ all -> 0x002b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            goto L_0x002a
        L_0x0028:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r0 = 2
        L_0x002a:
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002e:
            com.google.common.f.e r0 = f44834a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "Morris.GCoreCallManager"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "CallManager is disconnected from telephony service"
            r2 = 45675(0xb26b, float:6.4004E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.libraries.assistant.auto.tng.morris.e.p r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p.UNKNOWN
            int r0 = r0.getNumber()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.C14912k.mo21819a():int");
    }

    /* renamed from: b */
    public final void mo21820b(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                C146006ab a = xVar.mo118354a(carCall);
                C146014aj ajVar = (C146014aj) a;
                ajVar.mo122495n(C146013ai.f394700a, new C19691h());
                ajVar.mo122494m(C146013ai.f394700a, new C19692i());
                return;
            }
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45677)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: c */
    public final void mo21821c() {
        this.f44839f.mo22277c().ifPresent(new C14910i(this));
    }

    /* renamed from: d */
    public final void mo21822d(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            aVar.mo25080a(carCall.f387931a);
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45679)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: e */
    public final void mo21823e(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                xVar.mo118363j(carCall);
                return;
            }
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45681)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: f */
    public final void mo21824f() {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo21839q()) {
            C19701r rVar = new C19701r(C58485gu.m89845m());
            this.f44835b = rVar;
            C143100al alVar = this.f44836c;
            if (alVar != null) {
                C19701r rVar2 = rVar;
                synchronized (rVar.f54721b) {
                    C19701r rVar3 = rVar;
                    rVar.f54721b.add(alVar);
                }
            }
            C19684a aVar = this.f44835b;
            aVar.getClass();
            Context context = this.f44837d;
            ((C58970a) ((C58970a) C19701r.f54720a.mo56224b()).mo56372aa(47892)).mo56386p("start");
            context.getClass();
            C19701r rVar4 = (C19701r) aVar;
            rVar4.f54725f = context;
            rVar4.f54724e = new C143339x(rVar4.f54725f);
            rVar4.f54724e.mo118362i();
            C143339x xVar = rVar4.f54724e;
            C143784ce b = C143785cf.m233680b(rVar4.f54726g, xVar.f389927B, "call-listener");
            C143796cq cqVar = new C143796cq();
            cqVar.f389833c = b;
            cqVar.f389831a = new C143319j(b);
            cqVar.f389832b = new C143321k(b);
            cqVar.f389836f = 11007;
            xVar.mo119291v(cqVar.mo119255a());
            rVar4.mo25083c((CarCall) null, (List) null);
        }
    }

    /* renamed from: g */
    public final void mo21825g(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f44838e.mo79746e(C90025cd.f248164v) && this.f44839f.mo22278g(str)) {
            return;
        }
        if (mo21839q()) {
            C59104x b = f44834a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
            ((C59052c) ((C59052c) b).mo56372aa(45688)).mo56386p("Placing outgoing call with legacy call placement method.");
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                C146006ab g = xVar.mo118360g(str);
                C146014aj ajVar = (C146014aj) g;
                ajVar.mo122495n(C146013ai.f394700a, new C19697n());
                ajVar.mo122494m(C146013ai.f394700a, new C19698o());
                return;
            }
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45687)).mo56386p("Unable to place call. Could not use TelecomManager and CallClientAdapter is disconnected.");
    }

    /* renamed from: h */
    public final void mo21826h(CarCall carCall, char c) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                xVar.mo118364k(carCall, c);
                return;
            }
            return;
        }
        C59104x c2 = f44834a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c2).mo56372aa(45690)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: i */
    public final void mo21827i(C143100al alVar) {
        this.f44836c = alVar;
    }

    /* renamed from: j */
    public final void mo21828j(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            aVar.mo25080a(carCall.f387931a);
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45692)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: k */
    public final void mo21829k(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                C146006ab h = xVar.mo118361h(i);
                C146014aj ajVar = (C146014aj) h;
                ajVar.mo122495n(C146013ai.f394700a, new C19685b());
                ajVar.mo122494m(C146013ai.f394700a, new C19690g());
                return;
            }
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45694)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: l */
    public final void mo21830l(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                xVar.mo118366m(z);
                return;
            }
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45696)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: m */
    public final void mo21831m() {
        C19684a aVar = this.f44835b;
        if (aVar != null) {
            ((C58970a) ((C58970a) C19701r.f54720a.mo56224b()).mo56372aa(47893)).mo56386p("stop");
            C19701r rVar = (C19701r) aVar;
            C143339x xVar = rVar.f54724e;
            if (xVar != null) {
                C143782cc ccVar = C143785cf.m233680b(rVar.f54726g, xVar.f389927B, "call-listener").f389806b;
                C58838bb.m90866a(ccVar, "Key must not be null");
                xVar.mo119292w(ccVar, 11009);
                rVar.f54724e = null;
            }
            synchronized (rVar.f54722c) {
                ((C19701r) aVar).f54723d = null;
            }
        }
        this.f44835b = null;
        this.f44836c = null;
    }

    /* renamed from: n */
    public final void mo21832n(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                xVar.mo118367n(carCall);
                return;
            }
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45698)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: o */
    public final void mo21833o(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            C143339x xVar = ((C19701r) aVar).f54724e;
            if (xVar != null) {
                xVar.mo118368o(carCall);
                return;
            }
            return;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45700)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: p */
    public final boolean mo21834p() {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = false;
        if (mo21839q()) {
            C19684a aVar = this.f44835b;
            aVar.getClass();
            synchronized (((C19701r) aVar).f54722c) {
                C19700q qVar = ((C19701r) aVar).f54723d;
                if (qVar != null) {
                    if (qVar.mo25082b()) {
                        z = qVar.f54716e.booleanValue();
                    }
                }
            }
            return z;
        }
        C59104x c = f44834a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.GCoreCallManager");
        ((C59052c) ((C59052c) c).mo56372aa(45703)).mo56386p("CallManager is disconnected from telephony service");
        return false;
    }

    /* renamed from: q */
    public final boolean mo21839q() {
        boolean z = this.f44835b != null;
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }
}
