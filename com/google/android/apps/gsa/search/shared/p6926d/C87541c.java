package com.google.android.apps.gsa.search.shared.p6926d;

import android.text.TextUtils;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.assist.p507f.C9416b;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.speech.embedded.TaggerResult;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4671b.C61789ah;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61806ay;
import com.google.knowledge.p4671b.C61814g;
import com.google.knowledge.p4682d.C61995f;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.p5277z.p5282c.C68032v;
import com.google.protobuf.C63088z;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Stack;

/* renamed from: com.google.android.apps.gsa.search.shared.d.c */
/* compiled from: PG */
public final class C87541c implements C90991b {

    /* renamed from: a */
    public final Object f236439a = new Object();

    /* renamed from: b */
    public final Deque f236440b = new ArrayDeque(6);

    /* renamed from: c */
    public final Stack f236441c = new Stack();

    /* renamed from: d */
    public final Stack f236442d = new Stack();

    /* renamed from: e */
    public C87539a f236443e;

    /* renamed from: f */
    public C87542d f236444f = null;

    /* renamed from: g */
    public boolean f236445g;

    /* renamed from: h */
    public boolean f236446h;

    /* renamed from: i */
    public C55421x f236447i = C55421x.UNKNOWN_ACTION_TYPE;

    /* renamed from: j */
    public String f236448j;

    /* renamed from: k */
    public final C87540b f236449k;

    /* renamed from: l */
    public PlaybackStatus f236450l;

    /* renamed from: m */
    public C9416b f236451m;

    /* renamed from: n */
    public C68032v f236452n;

    /* renamed from: o */
    public final C9321i f236453o;

    /* renamed from: p */
    public TaggerResult f236454p;

    /* renamed from: q */
    public boolean f236455q;

    /* renamed from: r */
    public C61790ai f236456r;

    /* renamed from: s */
    public C63088z f236457s;

    /* renamed from: t */
    private Query f236458t = Query.f252741b.mo84291ab();

    /* renamed from: u */
    private C61995f f236459u;

    /* renamed from: v */
    private String f236460v;

    /* renamed from: w */
    private C63088z f236461w;

    public C87541c(C9321i iVar, C91022f fVar, C21370a aVar) {
        this.f236453o = iVar;
        fVar.mo85301a(this);
        this.f236449k = new C87540b(aVar);
    }

    /* renamed from: A */
    public final boolean mo81639A() {
        boolean z;
        synchronized (this.f236439a) {
            z = this.f236445g;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t mo81642c() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f236439a
            monitor-enter(r0)
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r1 = r4.mo81641b()     // Catch:{ all -> 0x0018 }
            r2 = 0
            if (r1 != 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x000c:
            boolean r3 = r1.mo81077p()     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x0016
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.t r2 = r1.mo81064e()     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.p6926d.C87541c.mo81642c():com.google.android.apps.gsa.search.shared.actions.modular.arguments.t");
    }

    /* renamed from: f */
    public final C87542d mo81644f() {
        C87542d dVar;
        synchronized (this.f236439a) {
            if (this.f236444f == null) {
                C58485gu j = C58485gu.m89842j(this.f236440b);
                String bk = this.f236458t.mo84352bk();
                if (true == TextUtils.isEmpty(bk)) {
                    bk = null;
                }
                this.f236444f = new C87542d(j, this.f236460v, this.f236459u, bk, this.f236458t.mo84317bB() ? this.f236458t.f252745C : 0, this.f236456r);
            }
            dVar = this.f236444f;
        }
        return dVar;
    }

    /* renamed from: g */
    public final PlaybackStatus mo81645g() {
        PlaybackStatus playbackStatus;
        synchronized (this.f236439a) {
            playbackStatus = this.f236450l;
        }
        return playbackStatus;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("DiscourseContext");
        synchronized (this.f236439a) {
            fVar.mo85279c("Displays").mo85276a(C90752i.m148230d(Integer.valueOf(this.f236440b.size())));
            for (C61790ai aiVar : this.f236440b) {
                C91006f e = fVar.mo85281e((Object) null);
                e.mo85291r("Display");
                e.mo85279c("URI").mo85276a(C90752i.m148233g(aiVar.f166906g));
                e.mo85279c("Timestamp").mo85276a(C90752i.m148232f(new Date(aiVar.f166901b / 1000)));
                if ((aiVar.f166900a & 16) != 0) {
                    C91005e c = e.mo85279c("AppPkg");
                    C61814g gVar = aiVar.f166903d;
                    if (gVar == null) {
                        gVar = C61814g.f166984j;
                    }
                    c.mo85276a(C90752i.m148233g(gVar.f166987b));
                    C91005e c2 = e.mo85279c("AppURI");
                    C61814g gVar2 = aiVar.f166903d;
                    if (gVar2 == null) {
                        gVar2 = C61814g.f166984j;
                    }
                    c2.mo85276a(C90752i.m148233g(gVar2.f166991f));
                    C91005e c3 = e.mo85279c("Query");
                    C61814g gVar3 = aiVar.f166903d;
                    if (gVar3 == null) {
                        gVar3 = C61814g.f166984j;
                    }
                    c3.mo85276a(C90752i.m148233g(gVar3.f166992g));
                }
            }
            fVar.mo85279c("mIsGmmNavigating").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236445g)));
            fVar.mo85279c("mTriggeredActionType").mo85276a(C90752i.m148231e(this.f236447i));
            fVar.mo85279c("mTriggeredActionType").mo85276a(C90752i.m148231e(this.f236447i));
            fVar.mo85279c("mTriggeredActionPackage").mo85276a(C90752i.m148229c(this.f236448j));
        }
    }

    /* renamed from: h */
    public final Query mo81646h() {
        Query query;
        synchronized (this.f236439a) {
            query = this.f236458t;
        }
        return query;
    }

    /* renamed from: i */
    public final TaggerResult mo81647i() {
        TaggerResult taggerResult;
        synchronized (this.f236439a) {
            taggerResult = this.f236454p;
        }
        return taggerResult;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        r0 = r1.f236432d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p5277z.p5282c.C68032v mo81648j() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f236439a
            monitor-enter(r0)
            com.google.android.apps.gsa.search.shared.d.a r1 = r2.f236443e     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0012
            com.google.bb.a.ad r0 = r1.f236429a
            if (r0 == 0) goto L_0x0012
            com.google.z.c.v r0 = r1.f236432d
            if (r0 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r0
        L_0x0012:
            com.google.z.c.v r0 = r2.f236452n
            return r0
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.p6926d.C87541c.mo81648j():com.google.z.c.v");
    }

    /* renamed from: l */
    public final C63088z mo81650l() {
        C63088z zVar;
        synchronized (this.f236439a) {
            zVar = this.f236461w;
        }
        return zVar;
    }

    /* renamed from: m */
    public final C63088z mo81651m() {
        C63088z zVar;
        synchronized (this.f236439a) {
            zVar = this.f236457s;
        }
        return zVar;
    }

    /* renamed from: n */
    public final void mo81652n(C61806ay ayVar, long j) {
        C61789ah ahVar = (C61789ah) C61790ai.f166898o.createBuilder();
        ahVar.copyOnWrite();
        C61790ai aiVar = (C61790ai) ahVar.instance;
        ayVar.getClass();
        aiVar.f166904e = ayVar;
        aiVar.f166900a |= 32;
        ahVar.copyOnWrite();
        C61790ai aiVar2 = (C61790ai) ahVar.instance;
        aiVar2.f166900a |= 2;
        aiVar2.f166901b = j;
        C61790ai aiVar3 = (C61790ai) ahVar.build();
        synchronized (this.f236439a) {
            while (this.f236440b.size() > 5) {
                this.f236440b.removeLast();
            }
            this.f236440b.addFirst(aiVar3);
            this.f236444f = null;
        }
    }

    /* renamed from: o */
    public final void mo81653o() {
        synchronized (this.f236439a) {
            this.f236443e = null;
            this.f236442d.clear();
            this.f236452n = null;
            mo81654p();
        }
    }

    /* renamed from: p */
    public final void mo81654p() {
        synchronized (this.f236439a) {
            this.f236447i = C55421x.UNKNOWN_ACTION_TYPE;
            this.f236448j = null;
        }
    }

    /* renamed from: q */
    public final void mo81655q(C63088z zVar) {
        synchronized (this.f236439a) {
            this.f236461w = zVar;
        }
    }

    /* renamed from: r */
    public final void mo81656r(Query query) {
        synchronized (this.f236439a) {
            this.f236458t = query;
            if (this.f236455q) {
                this.f236455q = false;
            }
        }
    }

    /* renamed from: s */
    public final void mo81657s(C55876h hVar) {
        synchronized (this.f236439a) {
            C87540b bVar = this.f236449k;
            if (hVar != null) {
                bVar.f236437b = hVar;
                bVar.f236438c = bVar.f236436a.mo26871c();
            }
        }
    }

    /* renamed from: t */
    public final void mo81658t(C61995f fVar) {
        synchronized (this.f236439a) {
            this.f236459u = fVar;
        }
    }

    /* renamed from: u */
    public final void mo81659u(C55421x xVar) {
        synchronized (this.f236439a) {
            this.f236447i = xVar;
        }
    }

    /* renamed from: v */
    public final void mo81660v(String str) {
        synchronized (this.f236439a) {
            if (!C58832aw.m90831a(this.f236460v, str)) {
                this.f236460v = str;
                this.f236444f = null;
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: w */
    public final void mo81661w(com.google.p4152bb.p4153a.C54946ad r16, com.google.android.apps.gsa.search.shared.actions.VoiceAction r17, com.google.p5277z.p5282c.C68032v r18, com.google.android.apps.gsa.search.shared.actions.util.CardDecision r19, java.lang.String r20, boolean r21, java.lang.String r22, com.google.android.speech.embedded.TaggerResult r23) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r10 = r17
            boolean r2 = r10 instanceof com.google.android.apps.gsa.search.shared.actions.SearchError
            if (r2 == 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.Object r11 = r1.f236439a
            monitor-enter(r11)
            r2 = 0
            r12 = 1
            if (r21 == 0) goto L_0x0014
        L_0x0011:
            r7 = 0
            goto L_0x00c2
        L_0x0014:
            if (r0 == 0) goto L_0x0048
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C54960ar.f144579d     // Catch:{ all -> 0x019b }
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)     // Catch:{ all -> 0x019b }
            r0.mo58887l(r3)     // Catch:{ all -> 0x019b }
            com.google.protobuf.bf r4 = r0.f169962ag     // Catch:{ all -> 0x019b }
            com.google.protobuf.bs r3 = r3.f169971d     // Catch:{ all -> 0x019b }
            boolean r3 = r4.mo58857o(r3)     // Catch:{ all -> 0x019b }
            if (r3 == 0) goto L_0x0048
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C54960ar.f144579d     // Catch:{ all -> 0x019b }
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)     // Catch:{ all -> 0x019b }
            r0.mo58887l(r2)     // Catch:{ all -> 0x019b }
            com.google.protobuf.bf r3 = r0.f169962ag     // Catch:{ all -> 0x019b }
            com.google.protobuf.bs r4 = r2.f169971d     // Catch:{ all -> 0x019b }
            java.lang.Object r3 = r3.mo58854l(r4)     // Catch:{ all -> 0x019b }
            if (r3 != 0) goto L_0x003f
            java.lang.Object r2 = r2.f169969b     // Catch:{ all -> 0x019b }
            goto L_0x0043
        L_0x003f:
            java.lang.Object r2 = r2.mo58889c(r3)     // Catch:{ all -> 0x019b }
        L_0x0043:
            com.google.bb.a.ar r2 = (com.google.p4152bb.p4153a.C54960ar) r2     // Catch:{ all -> 0x019b }
            int r2 = r2.f144582b     // Catch:{ all -> 0x019b }
            goto L_0x0056
        L_0x0048:
            java.lang.Object r3 = r1.f236439a     // Catch:{ all -> 0x019b }
            monitor-enter(r3)     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.search.shared.d.a r4 = r1.f236443e     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x0059
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r4.f236430b     // Catch:{ all -> 0x0198 }
            if (r10 != r5) goto L_0x0059
            int r2 = r4.f236433e     // Catch:{ all -> 0x0198 }
            monitor-exit(r3)     // Catch:{ all -> 0x0198 }
        L_0x0056:
            r7 = r2
            goto L_0x00c2
        L_0x0059:
            if (r10 != 0) goto L_0x005c
            goto L_0x00b0
        L_0x005c:
            if (r4 == 0) goto L_0x0070
            boolean r4 = r15.mo81662x()     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x0070
            com.google.android.apps.gsa.search.shared.d.a r4 = r1.f236443e     // Catch:{ all -> 0x0198 }
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r4.f236431c     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x00bf
            int r4 = r4.f236259m     // Catch:{ all -> 0x0198 }
            r5 = 2
            if (r4 == r5) goto L_0x0070
            goto L_0x00bf
        L_0x0070:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.t r4 = r17.mo81064e()     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x00bf
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r4 = r4.mo81156b()     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x008c
            boolean r5 = r4.mo81541i()     // Catch:{ all -> 0x0198 }
            if (r5 == 0) goto L_0x008c
            com.google.android.apps.gsa.search.shared.contact.RelationshipStatus r5 = r4.f236395k     // Catch:{ all -> 0x0198 }
            boolean r5 = r5.mo81600b()     // Catch:{ all -> 0x0198 }
            if (r5 != 0) goto L_0x008c
            r5 = 1
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            com.google.android.apps.gsa.search.shared.d.a r6 = r1.f236443e     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x0098
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r6.f236430b     // Catch:{ all -> 0x0198 }
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.t r6 = r6.mo81064e()     // Catch:{ all -> 0x0198 }
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            if (r6 == 0) goto L_0x00ae
            com.google.android.apps.gsa.search.shared.d.a r7 = r1.f236443e     // Catch:{ all -> 0x0198 }
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r7 = r7.f236430b     // Catch:{ all -> 0x0198 }
            boolean r7 = r7.mo81052B()     // Catch:{ all -> 0x0198 }
            if (r7 != 0) goto L_0x00ae
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r6 = r6.mo81156b()     // Catch:{ all -> 0x0198 }
            boolean r4 = com.google.android.apps.gsa.search.shared.contact.Disambiguation.m142057k(r6, r4)     // Catch:{ all -> 0x0198 }
            r5 = r5 | r4
        L_0x00ae:
            if (r5 == 0) goto L_0x00bf
        L_0x00b0:
            boolean r2 = r15.mo81662x()     // Catch:{ all -> 0x0198 }
            if (r2 == 0) goto L_0x00b8
            r2 = 1
            goto L_0x00bd
        L_0x00b8:
            com.google.android.apps.gsa.search.shared.d.a r2 = r1.f236443e     // Catch:{ all -> 0x0198 }
            int r2 = r2.f236433e     // Catch:{ all -> 0x0198 }
            int r2 = r2 + r12
        L_0x00bd:
            monitor-exit(r3)     // Catch:{ all -> 0x0198 }
            goto L_0x0056
        L_0x00bf:
            monitor-exit(r3)     // Catch:{ all -> 0x0198 }
            goto L_0x0011
        L_0x00c2:
            com.google.android.apps.gsa.search.shared.d.a r13 = r1.f236443e     // Catch:{ all -> 0x019b }
            com.google.android.apps.gsa.search.shared.d.a r14 = new com.google.android.apps.gsa.search.shared.d.a     // Catch:{ all -> 0x019b }
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r17
            r6 = r19
            r8 = r20
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x019b }
            r1.f236443e = r14     // Catch:{ all -> 0x019b }
            java.lang.Object r2 = r1.f236439a     // Catch:{ all -> 0x019b }
            monitor-enter(r2)     // Catch:{ all -> 0x019b }
            com.google.bb.a.ad r0 = r15.mo81649k()     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0154
            com.google.bb.a.bg r3 = r0.f144537e     // Catch:{ all -> 0x0195 }
            if (r3 != 0) goto L_0x00e7
            com.google.bb.a.bg r3 = com.google.p4152bb.p4153a.C54976bg.f144641o     // Catch:{ all -> 0x0195 }
        L_0x00e7:
            com.google.protobuf.bn r3 = r3.toBuilder()     // Catch:{ all -> 0x0195 }
            com.google.bb.a.bf r3 = (com.google.p4152bb.p4153a.C54975bf) r3     // Catch:{ all -> 0x0195 }
            boolean r4 = r17.mo81083v()     // Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x0108
            r3.copyOnWrite()     // Catch:{ all -> 0x0195 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x0195 }
            com.google.bb.a.bg r4 = (com.google.p4152bb.p4153a.C54976bg) r4     // Catch:{ all -> 0x0195 }
            int r5 = r4.f144643a     // Catch:{ all -> 0x0195 }
            r5 = r5 | 16
            r4.f144643a = r5     // Catch:{ all -> 0x0195 }
            r4.f144648f = r12     // Catch:{ all -> 0x0195 }
            java.util.Stack r4 = r1.f236442d     // Catch:{ all -> 0x0195 }
            r4.clear()     // Catch:{ all -> 0x0195 }
            goto L_0x012c
        L_0x0108:
            boolean r4 = r17.mo81084w()     // Catch:{ all -> 0x0195 }
            if (r4 != 0) goto L_0x0114
            boolean r4 = r17.mo81053C()     // Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x012c
        L_0x0114:
            r3.copyOnWrite()     // Catch:{ all -> 0x0195 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x0195 }
            com.google.bb.a.bg r4 = (com.google.p4152bb.p4153a.C54976bg) r4     // Catch:{ all -> 0x0195 }
            int r5 = r4.f144643a     // Catch:{ all -> 0x0195 }
            r5 = r5 | r12
            r4.f144643a = r5     // Catch:{ all -> 0x0195 }
            r4.f144644b = r12     // Catch:{ all -> 0x0195 }
            java.util.Stack r4 = r1.f236442d     // Catch:{ all -> 0x0195 }
            r4.clear()     // Catch:{ all -> 0x0195 }
            java.util.Stack r4 = r1.f236441c     // Catch:{ all -> 0x0195 }
            r4.clear()     // Catch:{ all -> 0x0195 }
        L_0x012c:
            com.google.android.apps.gsa.search.shared.d.a r4 = r1.f236443e     // Catch:{ all -> 0x0195 }
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ all -> 0x0195 }
            com.google.bb.a.ac r0 = (com.google.p4152bb.p4153a.C54945ac) r0     // Catch:{ all -> 0x0195 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0195 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ all -> 0x0195 }
            com.google.bb.a.ad r5 = (com.google.p4152bb.p4153a.C54946ad) r5     // Catch:{ all -> 0x0195 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x0195 }
            com.google.bb.a.bg r3 = (com.google.p4152bb.p4153a.C54976bg) r3     // Catch:{ all -> 0x0195 }
            r3.getClass()     // Catch:{ all -> 0x0195 }
            r5.f144537e = r3     // Catch:{ all -> 0x0195 }
            int r3 = r5.f144533a     // Catch:{ all -> 0x0195 }
            r3 = r3 | 32
            r5.f144533a = r3     // Catch:{ all -> 0x0195 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0195 }
            com.google.bb.a.ad r0 = (com.google.p4152bb.p4153a.C54946ad) r0     // Catch:{ all -> 0x0195 }
            r4.f236429a = r0     // Catch:{ all -> 0x0195 }
        L_0x0154:
            monitor-exit(r2)     // Catch:{ all -> 0x0195 }
            java.util.Stack r0 = r1.f236441c     // Catch:{ all -> 0x019b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x0169
            java.util.Stack r0 = r1.f236441c     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x019b }
            if (r0 == r10) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r0 = r23
            goto L_0x0191
        L_0x0169:
            java.util.Stack r0 = r1.f236442d     // Catch:{ all -> 0x019b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x017f
            java.util.Stack r0 = r1.f236442d     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x019b }
            if (r0 != r10) goto L_0x017f
            java.util.Stack r0 = r1.f236442d     // Catch:{ all -> 0x019b }
            r0.pop()     // Catch:{ all -> 0x019b }
            goto L_0x018b
        L_0x017f:
            java.util.Stack r0 = r1.f236442d     // Catch:{ all -> 0x019b }
            r0.clear()     // Catch:{ all -> 0x019b }
            if (r13 != 0) goto L_0x018b
            java.util.Stack r0 = r1.f236441c     // Catch:{ all -> 0x019b }
            r0.clear()     // Catch:{ all -> 0x019b }
        L_0x018b:
            java.util.Stack r0 = r1.f236441c     // Catch:{ all -> 0x019b }
            r0.push(r10)     // Catch:{ all -> 0x019b }
            goto L_0x0166
        L_0x0191:
            r1.f236454p = r0     // Catch:{ all -> 0x019b }
            monitor-exit(r11)     // Catch:{ all -> 0x019b }
            return
        L_0x0195:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x0198:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0198 }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x019b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x019b }
            goto L_0x019f
        L_0x019e:
            throw r0
        L_0x019f:
            goto L_0x019e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.p6926d.C87541c.mo81661w(com.google.bb.a.ad, com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.z.c.v, com.google.android.apps.gsa.search.shared.actions.util.CardDecision, java.lang.String, boolean, java.lang.String, com.google.android.speech.embedded.TaggerResult):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f236430b;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo81662x() {
        /*
            r1 = this;
            com.google.android.apps.gsa.search.shared.d.a r0 = r1.f236443e
            if (r0 == 0) goto L_0x0011
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f236430b
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.mo81083v()
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            return r0
        L_0x0011:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.p6926d.C87541c.mo81662x():boolean");
    }

    /* renamed from: y */
    public final boolean mo81663y(boolean z) {
        VoiceAction b = mo81641b();
        if (b == null) {
            return false;
        }
        if (z) {
            return b.mo81077p() && !b.mo81080s();
        }
        CardDecision e = mo81643e();
        return e != null && e.f236254h;
    }

    /* renamed from: z */
    public final boolean mo81664z() {
        boolean z;
        synchronized (this.f236439a) {
            z = this.f236446h;
        }
        return z;
    }

    /* renamed from: a */
    public final int mo81640a() {
        synchronized (this.f236439a) {
            C87539a aVar = this.f236443e;
            if (aVar == null) {
                return 0;
            }
            int i = aVar.f236433e;
            return i;
        }
    }

    /* renamed from: b */
    public final VoiceAction mo81641b() {
        synchronized (this.f236439a) {
            C87539a aVar = this.f236443e;
            if (aVar == null) {
                return null;
            }
            VoiceAction voiceAction = aVar.f236430b;
            return voiceAction;
        }
    }

    /* renamed from: e */
    public final CardDecision mo81643e() {
        synchronized (this.f236439a) {
            C87539a aVar = this.f236443e;
            if (aVar == null) {
                return null;
            }
            CardDecision cardDecision = aVar.f236431c;
            return cardDecision;
        }
    }

    /* renamed from: k */
    public final C54946ad mo81649k() {
        synchronized (this.f236439a) {
            C87539a aVar = this.f236443e;
            if (aVar == null) {
                return null;
            }
            C54946ad adVar = aVar.f236429a;
            return adVar;
        }
    }
}
