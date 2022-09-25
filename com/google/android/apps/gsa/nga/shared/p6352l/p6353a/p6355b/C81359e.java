package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81373g;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81379m;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.HashMap;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b.e */
/* compiled from: PG */
public final class C81359e {

    /* renamed from: a */
    public static final C58974d f222686a = C58974d.m91136j();

    /* renamed from: b */
    public final C81379m f222687b;

    /* renamed from: c */
    private final C91142g f222688c;

    public C81359e(C81379m mVar, C91142g gVar) {
        this.f222687b = mVar;
        this.f222688c = gVar;
    }

    /* renamed from: a */
    public final void mo75040a(C80267v vVar, int i, boolean z, C81373g gVar) {
        C80267v vVar2 = vVar;
        int i2 = i;
        boolean z2 = z;
        if (gVar.mo71923b() == C80201av.PIE_ELIGIBLE) {
            if (i2 == 12) {
                HashMap hashMap = new HashMap();
                DesugarArrays.stream((T[]) C80267v.values()).forEach(new C81355a(this, z2, hashMap));
                C60948g gVar2 = C60948g.f165068a;
                Instant now = Instant.now();
                if (ChronoUnit.SECONDS.between((Instant) Collection.EL.stream(hashMap.values()).max(C81356b.f222682a).orElse(Instant.EPOCH), now) < this.f222688c.mo85399d(C90126fx.f251614mD)) {
                    C81380n d = C81381o.m129461d();
                    d.mo75044c(vVar2);
                    d.mo75043b(C80265t.TRIGGER_NOTIFICATION_RATE_LIMITED_GLOBALLY);
                    d.mo75045d(12);
                    throw d.mo75042a();
                }
            } else {
                C60948g gVar3 = C60948g.f165068a;
                Instant now2 = Instant.now();
                if (!this.f222687b.mo75025h().plus(Duration.ofHours(this.f222688c.mo85399d(C90126fx.f251659mw))).isAfter(now2)) {
                    HashMap hashMap2 = new HashMap();
                    DesugarArrays.stream((T[]) C80267v.values()).forEach(new C81357c(this, z2, hashMap2));
                    Instant instant = (Instant) hashMap2.get(vVar2);
                    instant.getClass();
                    long between = ChronoUnit.SECONDS.between(instant, now2);
                    long between2 = ChronoUnit.SECONDS.between((Instant) Collection.EL.stream(hashMap2.values()).max(C81356b.f222682a).orElse(Instant.EPOCH), now2);
                    long between3 = ChronoUnit.SECONDS.between((Instant) Collection.EL.stream(this.f222687b.mo75026i(vVar2)).max(C81356b.f222682a).orElse(Instant.EPOCH), now2);
                    long d2 = this.f222688c.mo85399d(C90126fx.f251613mC);
                    long d3 = this.f222688c.mo85399d(C90126fx.f251615mE);
                    if (between3 < this.f222688c.mo85399d(C90126fx.f251612mB)) {
                        C81380n d4 = C81381o.m129461d();
                        d4.mo75044c(vVar2);
                        d4.mo75043b(C80265t.TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW_SUCCESS);
                        d4.mo75045d(i2);
                        throw d4.mo75042a();
                    } else if (between < d3) {
                        C81380n d5 = C81381o.m129461d();
                        d5.mo75044c(vVar2);
                        d5.mo75043b(C80265t.TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW);
                        d5.mo75045d(i2);
                        throw d5.mo75042a();
                    } else if (between2 < d2) {
                        C81380n d6 = C81381o.m129461d();
                        d6.mo75044c(vVar2);
                        d6.mo75043b(C80265t.TRIGGER_NOTIFICATION_RATE_LIMITED_GLOBALLY);
                        d6.mo75045d(i2);
                        throw d6.mo75042a();
                    } else if (((long) this.f222687b.mo75018a(vVar2, z2).size()) >= this.f222688c.mo85399d(C90126fx.f251611mA)) {
                        C81380n d7 = C81381o.m129461d();
                        d7.mo75044c(vVar2);
                        d7.mo75043b(C80265t.TRIGGER_NOTIFICATION_MAXIMUM_PER_FLOW);
                        d7.mo75045d(i2);
                        throw d7.mo75042a();
                    }
                } else {
                    C81380n d8 = C81381o.m129461d();
                    d8.mo75044c(vVar2);
                    d8.mo75043b(C80265t.TRIGGER_NOTIFICATION_INIT_DELAY);
                    d8.mo75045d(i2);
                    throw d8.mo75042a();
                }
            }
            C60856cj.m92911t(this.f222687b.mo75024g(Instant.now(), vVar2, z2), new C81358d(), C60826bg.f164896a);
            return;
        }
        C81380n d9 = C81381o.m129461d();
        d9.mo75044c(vVar2);
        d9.mo75043b(C80265t.TRIGGER_NOTIFICATION_PIE_NOT_ELIGIBLE);
        d9.mo75045d(i2);
        throw d9.mo75042a();
    }
}
