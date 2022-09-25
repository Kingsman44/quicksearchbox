package com.google.android.apps.gsa.sidekick.main.p7219n;

import android.app.PendingIntent;
import com.google.android.apps.gsa.proactive.C84175k;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84539b;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.shared.multiuser.C87616s;
import com.google.android.apps.gsa.search.shared.multiuser.C87618u;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.entry.C91354j;
import com.google.android.apps.gsa.sidekick.main.notifications.C91517bb;
import com.google.android.apps.gsa.sidekick.main.notifications.C91520be;
import com.google.android.apps.gsa.sidekick.main.notifications.C91544r;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91598e;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.n.h */
/* compiled from: PG */
public final class C91482h implements C91480f, C86091a {

    /* renamed from: a */
    boolean f255170a;

    /* renamed from: b */
    private final C68214a f255171b;

    /* renamed from: c */
    private final C68214a f255172c;

    /* renamed from: d */
    private final C68214a f255173d;

    /* renamed from: e */
    private final C68214a f255174e;

    /* renamed from: f */
    private final C68214a f255175f;

    /* renamed from: g */
    private final C68214a f255176g;

    /* renamed from: h */
    private final C68214a f255177h;

    /* renamed from: i */
    private final C68214a f255178i;

    /* renamed from: j */
    private final C86054o f255179j;

    /* renamed from: k */
    private final C85651bb f255180k;

    /* renamed from: l */
    private final C87618u f255181l;

    /* renamed from: m */
    private final C86124t f255182m;

    /* renamed from: n */
    private final C22871g f255183n;

    /* renamed from: o */
    private final Object f255184o = new Object();

    /* renamed from: p */
    private boolean f255185p;

    /* renamed from: q */
    private C87616s f255186q;

    public C91482h(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C86054o oVar, C85651bb bbVar, C87618u uVar, C86124t tVar, C22871g gVar) {
        this.f255172c = aVar2;
        this.f255173d = aVar3;
        this.f255177h = aVar7;
        this.f255178i = aVar8;
        this.f255179j = oVar;
        this.f255174e = aVar4;
        this.f255180k = bbVar;
        this.f255181l = uVar;
        this.f255175f = aVar5;
        this.f255171b = aVar;
        this.f255176g = aVar6;
        this.f255182m = tVar;
        this.f255183n = gVar;
    }

    /* renamed from: a */
    public final void mo85822a() {
        ((C91306ak) this.f255173d.mo27525b()).mo85598k();
        C91520be beVar = (C91520be) this.f255174e.mo27525b();
        beVar.f255264g.mo85139d(new C91517bb(beVar));
        C118522by byVar = C118522by.CLEAR_TRAINING_DATA;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328824d = 1;
        agVar.f328821a |= 4;
        ((C118561t) ((C91598e) this.f255176g.mo27525b()).f255476n.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        r3.f255183n.mo28212l("Start Now Services", new com.google.android.apps.gsa.sidekick.main.p7219n.C91481g(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85823b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f255184o
            monitor-enter(r0)
            boolean r1 = r3.f255170a     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x000e
            boolean r1 = r3.f255185p     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            com.google.android.libraries.gsa.k.g r0 = r3.f255183n
            com.google.android.apps.gsa.sidekick.main.n.g r1 = new com.google.android.apps.gsa.sidekick.main.n.g
            r1.<init>(r3)
            java.lang.String r2 = "Start Now Services"
            r0.mo28212l(r2, r1)
            return
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.p7219n.C91482h.mo85823b():void");
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (z || z2) {
            mo85823b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0175, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85824d() {
        /*
            r12 = this;
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.android.apps.gsa.search.core.i.t r0 = r12.f255182m
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246928X
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0022
            dagger.a r0 = r12.f255178i
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.sidekick.main.entry.ay r0 = (com.google.android.apps.gsa.sidekick.main.entry.C91320ay) r0
            com.google.common.util.concurrent.cx r0 = r0.mo85620j()
            java.lang.String r1 = "NowServicesControllerIm"
            java.lang.String r2 = "EntryTreeReader initialized"
            java.lang.String r3 = "EntryTreeReader failed to initialize"
            com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148481o(r0, r1, r2, r3)
        L_0x0022:
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = r12.f255179j
            android.accounts.Account r0 = r0.mo79668a()
            if (r0 != 0) goto L_0x002b
            return
        L_0x002b:
            java.lang.Object r1 = r12.f255184o
            monitor-enter(r1)
            com.google.android.apps.gsa.search.core.bb r2 = r12.f255180k     // Catch:{ all -> 0x0176 }
            boolean r2 = r2.mo79161x(r0)     // Catch:{ all -> 0x0176 }
            if (r2 != 0) goto L_0x0043
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0176 }
            com.google.android.apps.gsa.search.core.bb r2 = r12.f255180k     // Catch:{ all -> 0x0176 }
            boolean r2 = r2.mo79141N()     // Catch:{ all -> 0x0176 }
            if (r2 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            monitor-exit(r1)     // Catch:{ all -> 0x0176 }
            return
        L_0x0043:
            boolean r2 = r12.f255170a     // Catch:{ all -> 0x0176 }
            r3 = 1
            if (r2 != 0) goto L_0x00e2
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0176 }
            dagger.a r2 = r12.f255172c     // Catch:{ all -> 0x0176 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x0176 }
            com.google.android.apps.gsa.sidekick.main.entry.j r2 = (com.google.android.apps.gsa.sidekick.main.entry.C91354j) r2     // Catch:{ all -> 0x0176 }
            r4 = 0
            r2.mo85663b(r4)     // Catch:{ all -> 0x0176 }
            dagger.a r2 = r12.f255177h     // Catch:{ all -> 0x0176 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x0176 }
            com.google.android.apps.gsa.sidekick.main.notifications.r r2 = (com.google.android.apps.gsa.sidekick.main.notifications.C91544r) r2     // Catch:{ all -> 0x0176 }
            com.google.android.apps.gsa.sidekick.main.notifications.ao r5 = r2.f255333b     // Catch:{ all -> 0x0176 }
            boolean r6 = r5.mo85848n()     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x0067
            goto L_0x00ce
        L_0x0067:
            java.lang.Object r6 = r5.f255221g     // Catch:{ all -> 0x0176 }
            monitor-enter(r6)     // Catch:{ all -> 0x0176 }
            com.google.android.apps.g.c.b r7 = r5.f255220f     // Catch:{ all -> 0x00df }
            com.google.protobuf.bn r7 = r7.toBuilder()     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.a r7 = (com.google.android.apps.p489g.p493c.C9128a) r7     // Catch:{ all -> 0x00df }
            r7.copyOnWrite()     // Catch:{ all -> 0x00df }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.b r8 = (com.google.android.apps.p489g.p493c.C9129b) r8     // Catch:{ all -> 0x00df }
            com.google.protobuf.cq r9 = com.google.android.apps.p489g.p493c.C9129b.emptyProtobufList()     // Catch:{ all -> 0x00df }
            r8.f31419b = r9     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.b r8 = r5.f255220f     // Catch:{ all -> 0x00df }
            com.google.protobuf.cq r8 = r8.f31419b     // Catch:{ all -> 0x00df }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00df }
            r9 = 0
        L_0x0088:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00c0
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.f r10 = (com.google.android.apps.p489g.p493c.C9133f) r10     // Catch:{ all -> 0x00df }
            boolean r11 = r10.f31434d     // Catch:{ all -> 0x00df }
            if (r11 == 0) goto L_0x00bc
            boolean r11 = r10.f31435e     // Catch:{ all -> 0x00df }
            if (r11 != 0) goto L_0x00bc
            com.google.protobuf.bn r9 = r10.toBuilder()     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.e r9 = (com.google.android.apps.p489g.p493c.C9132e) r9     // Catch:{ all -> 0x00df }
            r9.copyOnWrite()     // Catch:{ all -> 0x00df }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.f r10 = (com.google.android.apps.p489g.p493c.C9133f) r10     // Catch:{ all -> 0x00df }
            int r11 = r10.f31431a     // Catch:{ all -> 0x00df }
            r11 = r11 | 4
            r10.f31431a = r11     // Catch:{ all -> 0x00df }
            r10.f31434d = r4     // Catch:{ all -> 0x00df }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.f r9 = (com.google.android.apps.p489g.p493c.C9133f) r9     // Catch:{ all -> 0x00df }
            r7.mo17432d(r9)     // Catch:{ all -> 0x00df }
            r9 = 1
            goto L_0x0088
        L_0x00bc:
            r7.mo17432d(r10)     // Catch:{ all -> 0x00df }
            goto L_0x0088
        L_0x00c0:
            if (r9 == 0) goto L_0x00cd
            com.google.protobuf.bv r4 = r7.build()     // Catch:{ all -> 0x00df }
            com.google.android.apps.g.c.b r4 = (com.google.android.apps.p489g.p493c.C9129b) r4     // Catch:{ all -> 0x00df }
            r5.f255220f = r4     // Catch:{ all -> 0x00df }
            r5.mo85842g()     // Catch:{ all -> 0x00df }
        L_0x00cd:
            monitor-exit(r6)     // Catch:{ all -> 0x00df }
        L_0x00ce:
            com.google.android.apps.gsa.sidekick.main.notifications.ao r4 = r2.f255333b     // Catch:{ all -> 0x0176 }
            r4.mo85845j()     // Catch:{ all -> 0x0176 }
            r2.mo85927f()     // Catch:{ all -> 0x0176 }
            r2.mo85930i()     // Catch:{ all -> 0x0176 }
            r2.mo85931j()     // Catch:{ all -> 0x0176 }
            r12.f255170a = r3     // Catch:{ all -> 0x0176 }
            goto L_0x00e2
        L_0x00df:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x0176 }
        L_0x00e2:
            com.google.android.apps.gsa.search.core.bb r2 = r12.f255180k     // Catch:{ all -> 0x0176 }
            boolean r0 = r2.mo79161x(r0)     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r12.f255184o     // Catch:{ all -> 0x0176 }
            monitor-enter(r0)     // Catch:{ all -> 0x0176 }
            boolean r2 = r12.f255170a     // Catch:{ all -> 0x0171 }
            if (r2 != 0) goto L_0x00f6
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0171 }
            monitor-exit(r0)     // Catch:{ all -> 0x0171 }
            goto L_0x0174
        L_0x00f6:
            boolean r2 = r12.f255185p     // Catch:{ all -> 0x0171 }
            if (r2 == 0) goto L_0x00fd
            monitor-exit(r0)     // Catch:{ all -> 0x0171 }
            goto L_0x0174
        L_0x00fd:
            com.google.android.apps.gsa.search.core.bb r2 = r12.f255180k     // Catch:{ all -> 0x0171 }
            boolean r2 = r2.mo79134G()     // Catch:{ all -> 0x0171 }
            if (r2 != 0) goto L_0x0109
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0171 }
            monitor-exit(r0)     // Catch:{ all -> 0x0171 }
            goto L_0x0174
        L_0x0109:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.search.shared.multiuser.u r2 = r12.f255181l     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.search.shared.multiuser.s r4 = new com.google.android.apps.gsa.search.shared.multiuser.s     // Catch:{ all -> 0x0171 }
            r4.<init>(r2)     // Catch:{ all -> 0x0171 }
            r12.f255186q = r4     // Catch:{ all -> 0x0171 }
            boolean r2 = r4.mo81749b()     // Catch:{ all -> 0x0171 }
            if (r2 != 0) goto L_0x011d
            r2 = 0
            r12.f255186q = r2     // Catch:{ all -> 0x0171 }
        L_0x011d:
            com.google.android.apps.gsa.tasks.ag r2 = com.google.android.apps.gsa.tasks.C118472ag.f328819i     // Catch:{ all -> 0x0171 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.tasks.af r2 = (com.google.android.apps.gsa.tasks.C118471af) r2     // Catch:{ all -> 0x0171 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0171 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4     // Catch:{ all -> 0x0171 }
            int r5 = r4.f328821a     // Catch:{ all -> 0x0171 }
            r5 = r5 | 2
            r4.f328821a = r5     // Catch:{ all -> 0x0171 }
            r5 = 1
            r4.f328823c = r5     // Catch:{ all -> 0x0171 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.search.core.i.t r4 = r12.f255182m     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249423dJ     // Catch:{ all -> 0x0171 }
            boolean r4 = r4.mo79746e(r5)     // Catch:{ all -> 0x0171 }
            if (r4 == 0) goto L_0x0153
            dagger.a r4 = r12.f255171b     // Catch:{ all -> 0x0171 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.tasks.t r4 = (com.google.android.apps.gsa.tasks.C118561t) r4     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.tasks.by r5 = com.google.android.apps.gsa.tasks.C118522by.PREFETCH_TAPAS_ZERO_PREFIX_SUGGESTIONS     // Catch:{ all -> 0x0171 }
            r4.mo103754e(r5, r2)     // Catch:{ all -> 0x0171 }
        L_0x0153:
            com.google.android.apps.gsa.search.core.i.t r4 = r12.f255182m     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249429dP     // Catch:{ all -> 0x0171 }
            boolean r4 = r4.mo79746e(r5)     // Catch:{ all -> 0x0171 }
            if (r4 == 0) goto L_0x016a
            dagger.a r4 = r12.f255171b     // Catch:{ all -> 0x0171 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.tasks.t r4 = (com.google.android.apps.gsa.tasks.C118561t) r4     // Catch:{ all -> 0x0171 }
            com.google.android.apps.gsa.tasks.by r5 = com.google.android.apps.gsa.tasks.C118522by.SYNC_TAPAS_ZERO_PREFIX_CACHE     // Catch:{ all -> 0x0171 }
            r4.mo103754e(r5, r2)     // Catch:{ all -> 0x0171 }
        L_0x016a:
            r12.mo85826f()     // Catch:{ all -> 0x0171 }
            r12.f255185p = r3     // Catch:{ all -> 0x0171 }
            monitor-exit(r0)     // Catch:{ all -> 0x0171 }
            goto L_0x0174
        L_0x0171:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0171 }
            throw r2     // Catch:{ all -> 0x0176 }
        L_0x0174:
            monitor-exit(r1)     // Catch:{ all -> 0x0176 }
            return
        L_0x0176:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0179:
            throw r0
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.p7219n.C91482h.mo85824d():void");
    }

    /* renamed from: e */
    public final void mo85825e() {
        C90748e.m148224b();
        synchronized (this.f255184o) {
            if (this.f255170a) {
                C58976aa aaVar = C58975e.f156826a;
                ((C91544r) this.f255177h.mo27525b()).mo85932k();
                ((C84175k) this.f255175f.mo27525b()).mo77642e();
                C91354j jVar = (C91354j) this.f255172c.mo27525b();
                PendingIntent a = jVar.mo85662a(false);
                if (a != null) {
                    C84539b bVar = jVar.f254909a;
                    C86341u uVar = new C86341u((C86346z) bVar.f230067b.f232790a.mo79722a());
                    uVar.mo80075j("AlarmStartTimeMillis_refresh_alarm");
                    uVar.mo80086l(false);
                    bVar.mo78251a(a);
                    a.cancel();
                }
                synchronized (this.f255184o) {
                    if (this.f255185p) {
                        ((C91544r) this.f255177h.mo27525b()).mo85932k();
                        C87616s sVar = this.f255186q;
                        if (sVar != null) {
                            sVar.mo81748a();
                            this.f255186q = null;
                        }
                        this.f255185p = false;
                    }
                }
                this.f255170a = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo85826f() {
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long millis = TimeUnit.MINUTES.toMillis(30);
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = millis;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328824d = 1;
        agVar2.f328821a |= 4;
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        agVar3.f328821a |= 16;
        agVar3.f328826f = false;
        afVar.copyOnWrite();
        C118472ag agVar4 = (C118472ag) afVar.instance;
        agVar4.f328821a |= 8;
        agVar4.f328825e = false;
        ((C118561t) this.f255171b.mo27525b()).mo103754e(C118522by.NOW_UPDATE_GCM_REGISTRATION, (C118472ag) afVar.build());
    }
}
