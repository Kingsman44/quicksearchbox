package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.education.pie.C75762a;
import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.C75912m;
import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.C75957b;
import com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.C75958c;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79849ag;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80942c;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80944e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81354b;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C59999iw;
import com.google.common.p4552o.C60000ix;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.aj */
/* compiled from: PG */
public final class C75924aj implements C75864b, C90919bp, C75957b {

    /* renamed from: c */
    private static final C58974d f210652c = C58974d.m91136j();

    /* renamed from: a */
    public final Context f210653a;

    /* renamed from: b */
    public final C81515c f210654b;

    /* renamed from: d */
    private final C80944e f210655d;

    /* renamed from: e */
    private final C75906g f210656e;

    /* renamed from: f */
    private final C75866e f210657f;

    /* renamed from: g */
    private final C76092h f210658g;

    /* renamed from: h */
    private final C75911l f210659h;

    /* renamed from: i */
    private final C75958c f210660i;

    /* renamed from: j */
    private final C91142g f210661j;

    /* renamed from: k */
    private final C79849ag f210662k;

    /* renamed from: l */
    private final AtomicBoolean f210663l = new AtomicBoolean(false);

    /* renamed from: m */
    private final C28292j f210664m;

    /* renamed from: n */
    private final C28292j f210665n;

    /* renamed from: o */
    private final C28293k f210666o;

    /* renamed from: p */
    private Optional f210667p;

    public C75924aj(Context context, C80944e eVar, C75906g gVar, C75866e eVar2, C76092h hVar, C81515c cVar, C75911l lVar, C75958c cVar2, C91142g gVar2, C79849ag agVar) {
        C28292j jVar = new C28292j(94154);
        jVar.mo33795i(22);
        jVar.mo33795i(5);
        this.f210664m = jVar;
        C28292j jVar2 = new C28292j(94155);
        jVar2.mo33795i(5);
        this.f210665n = jVar2;
        this.f210666o = C28293k.m52908e(jVar, C28293k.m52908e(jVar2, new C28293k[0]));
        this.f210667p = Optional.empty();
        this.f210653a = context;
        this.f210655d = eVar;
        this.f210656e = gVar;
        this.f210657f = eVar2;
        this.f210658g = hVar;
        this.f210654b = cVar;
        this.f210659h = lVar;
        this.f210660i = cVar2;
        this.f210661j = gVar2;
        this.f210662k = agVar;
    }

    /* renamed from: f */
    private final void m122433f() {
        this.f210663l.set(false);
        this.f210655d.mo74728a(C89094c.NGA_PIE_TRIGGER);
    }

    /* renamed from: g */
    private final void m122434g(C60321oe oeVar) {
        if (oeVar != null) {
            this.f210662k.mo74227b(oeVar);
        }
    }

    /* renamed from: h */
    private final void m122435h() {
        C81374h hVar = (C81374h) this.f210667p.get();
        if (!this.f210655d.mo74729b(C80942c.NGA_PIE)) {
            C81380n d = C81381o.m129461d();
            d.mo75044c(C81377k.m129443a(hVar.mo75029c()));
            d.mo75043b(C80265t.NOTIFICATIONS_DISABLED);
            d.mo75045d(hVar.mo75037i());
            throw d.mo75042a();
        } else if (hVar.mo75034g() || !this.f210663l.getAndSet(true)) {
            Locale e = this.f210658g.mo72021b().mo72039e();
            if (hVar.mo75034g() || this.f210655d.mo74730c(C89094c.NGA_PIE_TRIGGER, C80942c.NGA_PIE, new C75920af(this, e, hVar))) {
                this.f210664m.mo33794h(true != hVar.mo75034g() ? 1 : 3);
                C59999iw iwVar = (C59999iw) C60000ix.f162157e.createBuilder();
                C80267v a = C81377k.m129443a(hVar.mo75029c());
                iwVar.copyOnWrite();
                C60000ix ixVar = (C60000ix) iwVar.instance;
                ixVar.f162161b = a.f220269g;
                ixVar.f162160a = 1 | ixVar.f162160a;
                C80248co b = C81377k.m129444b(hVar.mo75029c());
                iwVar.copyOnWrite();
                C60000ix ixVar2 = (C60000ix) iwVar.instance;
                ixVar2.f162162c = b.f220171g;
                ixVar2.f162160a |= 2;
                Optional f = hVar.mo75033f();
                Objects.requireNonNull(iwVar);
                f.ifPresent(new C75921ag(iwVar));
                this.f210664m.f76974b.mo58885m(C60000ix.f162158f, (C60000ix) iwVar.build());
                C79849ag agVar = this.f210662k;
                C60321oe b2 = C28285c.m52875b(this.f210666o, 94154);
                b2.getClass();
                agVar.mo74227b(b2);
                if (hVar.mo75034g()) {
                    this.f210667p = Optional.empty();
                    C81380n d2 = C81381o.m129461d();
                    d2.mo75044c(C81377k.m129443a(hVar.mo75029c()));
                    d2.mo75043b(C80265t.TRIGGER_NOTIFICATION_USER_IS_COUNTERFACTUAL);
                    d2.mo75045d(hVar.mo75037i());
                    throw d2.mo75042a();
                }
                return;
            }
            C81380n d3 = C81381o.m129461d();
            d3.mo75044c(C81377k.m129443a(hVar.mo75029c()));
            d3.mo75043b(C80265t.TRIGGER_NOTIFICATION_DISPLAY_FAILED);
            d3.mo75045d(hVar.mo75037i());
            throw d3.mo75042a();
        } else {
            C81380n d4 = C81381o.m129461d();
            d4.mo75044c(C81377k.m129443a(hVar.mo75029c()));
            d4.mo75043b(C80265t.TRIGGER_NOTIFICATION_ALREADY_DISPLAYED);
            d4.mo75045d(hVar.mo75037i());
            throw d4.mo75042a();
        }
    }

    /* renamed from: i */
    private final void m122436i() {
        if (this.f210656e.mo71922a().mo76657c() == C80201av.PIE_ELIGIBLE && this.f210667p.isPresent()) {
            try {
                m122435h();
                return;
            } catch (C81381o e) {
                this.f210659h.mo71913b(e, false);
            }
        }
        m122433f();
    }

    /* renamed from: j */
    private final boolean m122437j() {
        return this.f210661j.mo85405j(C90126fx.f251392hu);
    }

    /* renamed from: k */
    private final C75913n m122438k(C80248co coVar, Optional optional, int i) {
        Locale e = this.f210658g.mo72021b().mo72039e();
        C75912m f = C75913n.m122414f(i);
        f.mo71871b(coVar);
        C75762a aVar = (C75762a) f;
        aVar.f210250a = Optional.m71637of((String) optional.map(new C75922ah(this, e)).orElse("UNKNOWN"));
        aVar.f210251b = Optional.m71637of((String) optional.map(new C75923ai(this, e)).orElse("UNKNOWN"));
        return f.mo71870a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17870a(Object obj) {
        C80201av avVar = (C80201av) obj;
        mo71962e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa A[Catch:{ o -> 0x00d7 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo71960c(android.content.Intent r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r9.getAction()     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r9.getAction()     // Catch:{ all -> 0x00e8 }
            android.os.Bundle r1 = r9.getExtras()     // Catch:{ all -> 0x00e8 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.v r2 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k.m129443a(r1)     // Catch:{ all -> 0x00e8 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.co r3 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k.m129444b(r1)     // Catch:{ all -> 0x00e8 }
            r4 = 1
            if (r0 == 0) goto L_0x00c6
            if (r1 == 0) goto L_0x00c6
            int r5 = r0.hashCode()     // Catch:{ o -> 0x00d7 }
            r6 = 18427832(0x1192fb8, float:2.8135898E-38)
            r7 = 2
            if (r5 == r6) goto L_0x0042
            r6 = 494642787(0x1d7ba663, float:3.3305593E-21)
            if (r5 == r6) goto L_0x0038
            r6 = 991373757(0x3b1729bd, float:0.002306565)
            if (r5 == r6) goto L_0x002e
            goto L_0x004c
        L_0x002e:
            java.lang.String r5 = "com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_TAPPED"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x0038:
            java.lang.String r5 = "com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_BUTTON"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x004c
            r0 = 2
            goto L_0x004d
        L_0x0042:
            java.lang.String r5 = "com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_DISMISSED"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x004c
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = -1
        L_0x004d:
            r5 = 0
            if (r0 == 0) goto L_0x00aa
            r6 = 5
            if (r0 == r4) goto L_0x0095
            if (r0 != r7) goto L_0x006b
            com.google.android.libraries.logging.j r9 = r8.f210665n     // Catch:{ o -> 0x00d7 }
            com.google.common.o.oe r9 = com.google.android.libraries.logging.C28285c.m52883j(r9, r6, r5)     // Catch:{ o -> 0x00d7 }
            r8.m122434g(r9)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.engine.education.pie.e r9 = r8.f210657f     // Catch:{ o -> 0x00d7 }
            j$.util.Optional r0 = r8.f210667p     // Catch:{ o -> 0x00d7 }
            r2 = 6
            com.google.android.apps.gsa.nga.engine.education.pie.n r0 = r8.m122438k(r3, r0, r2)     // Catch:{ o -> 0x00d7 }
            r9.mo71904b(r1, r0)     // Catch:{ o -> 0x00d7 }
            goto L_0x00dd
        L_0x006b:
            com.google.common.f.a.d r0 = f210652c     // Catch:{ o -> 0x00d7 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ o -> 0x00d7 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ o -> 0x00d7 }
            r1 = 3453(0xd7d, float:4.839E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ o -> 0x00d7 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ o -> 0x00d7 }
            java.lang.String r1 = "Unknown action from intent: %s"
            java.lang.String r9 = r9.getAction()     // Catch:{ o -> 0x00d7 }
            r0.mo56389s(r1, r9)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.l.a.n r9 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o.m129461d()     // Catch:{ o -> 0x00d7 }
            r9.mo75044c(r2)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.t r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t.TRIGGER_NOTIFICATION_INVALID_DATA     // Catch:{ o -> 0x00d7 }
            r9.mo75043b(r0)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.l.a.o r9 = r9.mo75042a()     // Catch:{ o -> 0x00d7 }
            throw r9     // Catch:{ o -> 0x00d7 }
        L_0x0095:
            com.google.android.libraries.logging.j r9 = r8.f210664m     // Catch:{ o -> 0x00d7 }
            com.google.common.o.oe r9 = com.google.android.libraries.logging.C28285c.m52883j(r9, r6, r5)     // Catch:{ o -> 0x00d7 }
            r8.m122434g(r9)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.engine.education.pie.e r9 = r8.f210657f     // Catch:{ o -> 0x00d7 }
            j$.util.Optional r0 = r8.f210667p     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.engine.education.pie.n r0 = r8.m122438k(r3, r0, r6)     // Catch:{ o -> 0x00d7 }
            r9.mo71904b(r1, r0)     // Catch:{ o -> 0x00d7 }
            goto L_0x00dd
        L_0x00aa:
            com.google.android.libraries.logging.j r9 = r8.f210664m     // Catch:{ o -> 0x00d7 }
            r0 = 22
            com.google.common.o.oe r9 = com.google.android.libraries.logging.C28285c.m52883j(r9, r0, r5)     // Catch:{ o -> 0x00d7 }
            r8.m122434g(r9)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.l.a.n r9 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o.m129461d()     // Catch:{ o -> 0x00d7 }
            r9.mo75044c(r2)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.t r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t.TRIGGER_NOTIFICATION_DISMISSED     // Catch:{ o -> 0x00d7 }
            r9.mo75043b(r0)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.l.a.o r9 = r9.mo75042a()     // Catch:{ o -> 0x00d7 }
            throw r9     // Catch:{ o -> 0x00d7 }
        L_0x00c6:
            com.google.android.apps.gsa.nga.shared.l.a.n r9 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o.m129461d()     // Catch:{ o -> 0x00d7 }
            r9.mo75044c(r2)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.t r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t.TRIGGER_NOTIFICATION_INVALID_DATA     // Catch:{ o -> 0x00d7 }
            r9.mo75043b(r0)     // Catch:{ o -> 0x00d7 }
            com.google.android.apps.gsa.nga.shared.l.a.o r9 = r9.mo75042a()     // Catch:{ o -> 0x00d7 }
            throw r9     // Catch:{ o -> 0x00d7 }
        L_0x00d7:
            r9 = move-exception
            com.google.android.apps.gsa.nga.engine.education.pie.l r0 = r8.f210659h     // Catch:{ all -> 0x00e8 }
            r0.mo71913b(r9, r4)     // Catch:{ all -> 0x00e8 }
        L_0x00dd:
            j$.util.Optional r9 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x00e8 }
            r8.f210667p = r9     // Catch:{ all -> 0x00e8 }
            r8.m122433f()     // Catch:{ all -> 0x00e8 }
            monitor-exit(r8)
            return
        L_0x00e8:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.triggering.C75924aj.mo71960c(android.content.Intent):void");
    }

    /* renamed from: d */
    public final synchronized void mo71961d(C81374h hVar) {
        C80267v a = C81377k.m129443a(((C81354b) hVar).f222670a);
        if (!this.f210667p.isPresent()) {
            this.f210667p = Optional.m71637of(hVar);
            if (m122437j()) {
                m122436i();
            } else {
                m122435h();
            }
        } else {
            C81380n d = C81381o.m129461d();
            d.mo75044c(a);
            d.mo75043b(C80265t.TRIGGER_NOTIFICATION_ALREADY_ACTIVE);
            d.mo75045d(((C81354b) hVar).f222677h);
            throw d.mo75042a();
        }
    }

    /* renamed from: e */
    public final synchronized void mo71962e() {
        if (m122437j()) {
            m122436i();
        }
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210656e.mo71922a().mo76658d(this);
        this.f210660i.f210748a.set(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210656e.mo71922a().mo76659e(this);
        this.f210660i.f210748a.set((Object) null);
    }
}
