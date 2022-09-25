package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81379m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.ax */
/* compiled from: PG */
public final class C75823ax implements C75864b, C75786o, C75155d {

    /* renamed from: a */
    public static final C58974d f210422a = C58974d.m91136j();

    /* renamed from: b */
    public final C81379m f210423b;

    /* renamed from: c */
    private final C75158f f210424c;

    /* renamed from: d */
    private final C75906g f210425d;

    /* renamed from: e */
    private final C22871g f210426e;

    /* renamed from: f */
    private final C21370a f210427f;

    /* renamed from: g */
    private final C91142g f210428g;

    /* renamed from: h */
    private Optional f210429h = Optional.empty();

    public C75823ax(C75158f fVar, C75906g gVar, C81379m mVar, C22871g gVar2, C21370a aVar, C91142g gVar3) {
        this.f210424c = fVar;
        this.f210425d = gVar;
        this.f210423b = mVar;
        this.f210426e = gVar2;
        this.f210427f = aVar;
        this.f210428g = gVar3;
    }

    /* renamed from: c */
    private final void m122208c(C80267v vVar, boolean z) {
        if (this.f210425d.mo71924d() && this.f210428g.mo85405j(C90126fx.f251387hp)) {
            C90875ai.m148465b(C75820au.f210420a, this.f210423b.mo75021d(Instant.ofEpochMilli(this.f210427f.mo26870b()), vVar, z), this.f210426e, "[NGA] PieOndeviceActionLoggerImpl.recordFlowCompletion").mo85223a(C75821av.f210421a);
        }
    }

    /* renamed from: g */
    private final synchronized void m122209g(boolean z) {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.f210427f.mo26870b());
        new C90873ag(this.f210426e.mo28202b("[NGA] PieOndeviceActionLoggerImpl.onActiveStateChangeEvent", new C75817ar(this, this.f210429h, z, ofEpochMilli)), this.f210426e, "[NGA] PieOndeviceActionLoggerImpl.onActiveStateChangeEvent.record", C75818as.f210418a).mo85223a(C75819at.f210419a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo71137a(com.google.android.apps.gsa.nga.engine.p5964av.C75077bo r2, com.google.android.apps.gsa.nga.engine.p5964av.C75077bo r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.apps.gsa.nga.engine.education.pie.g r3 = r1.f210425d     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.mo71924d()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0037
            com.google.android.apps.gsa.shared.util.v.g r3 = r1.f210428g     // Catch:{ all -> 0x0039 }
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251382hk     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.mo85405j(r0)     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0037
            boolean r3 = r2.mo71469o()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x001d
            r3 = 0
            r1.m122209g(r3)     // Catch:{ all -> 0x0039 }
        L_0x001d:
            boolean r3 = r2.mo71470p()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002f
            j$.util.Optional r2 = r2.mo71467m()     // Catch:{ all -> 0x0039 }
            r1.f210429h = r2     // Catch:{ all -> 0x0039 }
            r2 = 1
            r1.m122209g(r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            return
        L_0x002f:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0039 }
            r1.f210429h = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            return
        L_0x0037:
            monitor-exit(r1)
            return
        L_0x0039:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75823ax.mo71137a(com.google.android.apps.gsa.nga.engine.av.bo, com.google.android.apps.gsa.nga.engine.av.bo):void");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: d */
    public final void mo71889d(C75788q qVar, int i, C80265t tVar) {
        m122208c(qVar.mo71878j(), false);
    }

    /* renamed from: e */
    public final void mo71890e(C75788q qVar, int i, C75891l lVar) {
    }

    /* renamed from: f */
    public final void mo71891f(C75788q qVar) {
        m122208c(qVar.mo71878j(), true);
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210424c.mo71506b(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210424c.mo71507c(this);
    }
}
