package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.app.KeyguardManager;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10024a;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.b.a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5978b.C75190c;
import com.google.android.apps.gsa.nga.engine.p5978b.C75214d;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79504ab;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79505ac;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79477b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79553k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79577i;
import com.google.android.apps.gsa.nga.engine.warmactions.p6256h.C79597c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.p4543n.p4545b.C59371e;
import com.google.common.p4543n.p4545b.C59379m;
import com.google.common.p4543n.p4545b.C59380n;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62995dn;
import dagger.C68214a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.an */
/* compiled from: PG */
public final class C79418an implements C75155d, C79456n, C90991b, C79505ac, C75214d {

    /* renamed from: a */
    public static final C58974d f218059a = C58974d.m91136j();

    /* renamed from: f */
    private static final C79416al f218060f = new C79416al();

    /* renamed from: b */
    public final C60888db f218061b;

    /* renamed from: c */
    public final C81013d f218062c;

    /* renamed from: d */
    public final C79597c f218063d;

    /* renamed from: e */
    public Duration f218064e = Duration.ofMinutes(3);

    /* renamed from: g */
    private final C91142g f218065g;

    /* renamed from: h */
    private final C68214a f218066h;

    /* renamed from: i */
    private final C58495hd f218067i;

    /* renamed from: j */
    private final C79553k f218068j;

    /* renamed from: k */
    private final C81006b f218069k;

    /* renamed from: l */
    private final KeyguardManager f218070l;

    /* renamed from: m */
    private final C79448f f218071m;

    /* renamed from: n */
    private final C79421aq f218072n;

    /* renamed from: o */
    private C10026c f218073o = C10026c.f34231b;

    /* renamed from: p */
    private final C79417am f218074p = new C79417am();

    public C79418an(C91142g gVar, C68214a aVar, Map map, C79553k kVar, C60888db dbVar, C81006b bVar, C81013d dVar, C79597c cVar, KeyguardManager keyguardManager, C79448f fVar, C79421aq aqVar) {
        this.f218065g = gVar;
        this.f218066h = aVar;
        this.f218067i = C58495hd.m89898l(map);
        this.f218068j = kVar;
        this.f218061b = dbVar;
        this.f218069k = bVar;
        this.f218062c = dVar;
        this.f218063d = cVar;
        this.f218070l = keyguardManager;
        this.f218071m = fVar;
        this.f218072n = aqVar;
    }

    /* renamed from: p */
    private final synchronized void m127447p(long j) {
        m127452u();
        this.f218074p.f218058c.add(Long.valueOf(j));
    }

    /* renamed from: q */
    private final synchronized void m127448q(long j) {
        if (this.f218074p.f218058c.remove(Long.valueOf(j))) {
            m127451t();
        }
    }

    /* renamed from: r */
    private final synchronized void m127449r(Optional optional) {
        if (this.f218074p.mo74027a()) {
            optional.ifPresent(new C79407ac(this));
        } else if (this.f218071m.f218121b.isEmpty()) {
            m127452u();
        } else {
            m127450s(optional);
        }
    }

    /* renamed from: s */
    private final void m127450s(Optional optional) {
        C79477b bVar = (C79477b) this.f218066h.mo27525b();
        C59364ae b = C59364ae.m92266l(this.f218071m.f218121b).mo56891b(C79431b.f218096a);
        Comparator reversed = Comparator.EL.reversed(Comparator.CC.comparing(C79445c.f218117a));
        reversed.getClass();
        C59364ae c = C59364ae.m92267m(b.mo56898a().sorted(Comparator.CC.comparing(C59379m.f157584a, reversed))).mo56892c(C79446d.f218118a);
        C79447e eVar = C79447e.f218119a;
        eVar.getClass();
        C58495hd h = C59364ae.m92266l((C58495hd) c.mo56896f(new C59371e(eVar))).mo56891b(C79457o.f218136a).mo56899h();
        C79577i iVar = (C79577i) C79569ab.f218316f.createBuilder();
        iVar.copyOnWrite();
        C79569ab abVar = (C79569ab) iVar.instance;
        C62995dn dnVar = abVar.f218319b;
        if (!dnVar.f170058b) {
            abVar.f218319b = dnVar.mo58980a();
        }
        abVar.f218319b.putAll(h);
        bVar.mo74086a((C79569ab) iVar.build());
        optional.ifPresent(new C79465w(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m127451t() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.apps.gsa.nga.engine.warmactions.a.f r0 = r1.f218071m     // Catch:{ all -> 0x001e }
            j$.util.concurrent.ConcurrentHashMap r0 = r0.f218121b     // Catch:{ all -> 0x001e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            com.google.android.apps.gsa.nga.engine.warmactions.a.am r0 = r1.f218074p     // Catch:{ all -> 0x001e }
            boolean r0 = r0.mo74027a()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x001e }
            r1.m127450s(r0)     // Catch:{ all -> 0x001e }
            monitor-exit(r1)
            return
        L_0x001c:
            monitor-exit(r1)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79418an.m127451t():void");
    }

    /* renamed from: u */
    private final void m127452u() {
        ((C79477b) this.f218066h.mo27525b()).mo74087b();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        blVar.name();
        if (blVar.equals(bl.c)) {
            this.f218061b.execute(new C79412ah(this));
        } else if (blVar.equals(bl.a) || blVar.equals(bl.d)) {
            this.f218061b.execute(new C79413ai(this));
        }
    }

    /* renamed from: c */
    public final void mo74028c(C79504ab abVar) {
        if (this.f218065g.mo85405j(C90126fx.f251469jR)) {
            int a = abVar.mo74103a();
            if (a == 4) {
                m127447p(abVar.mo74104b());
            } else if (a == 7) {
                m127448q(abVar.mo74104b());
            }
        }
    }

    /* renamed from: e */
    public final void mo71496e(C75190c cVar) {
        if (this.f218065g.mo85405j(C90126fx.f251467jP)) {
            a aVar = (a) cVar;
            aVar.b.name();
            if (aVar.b.a()) {
                this.f218061b.execute(new C79408ad(this));
            } else {
                this.f218061b.execute(new C79409ae(this));
            }
        }
    }

    /* renamed from: f */
    public final void mo74029f(C10026c cVar) {
        this.f218073o = cVar;
        C58495hd h = C59364ae.m92266l(Collections.unmodifiableMap(cVar.f34233a)).mo56902k(C79458p.f218137a).mo56901j(new C79459q(this.f218069k.mo74778c())).mo56899h();
        C10024a aVar = (C10024a) C10026c.f34231b.createBuilder();
        aVar.mo18194a(h);
        C10026c cVar2 = (C10026c) aVar.build();
        C59364ae.m92266l(this.f218067i).mo56901j(new C79460r(cVar2)).mo56895e(C59380n.f157585a).forEach(new C79461s(cVar2));
        this.f218063d.mo74149a().flatMap(C79462t.f218141a).ifPresent(new C79463u(this));
        this.f218072n.mo74044a();
    }

    /* renamed from: g */
    public final void mo74030g(C128461e eVar) {
        this.f218061b.execute(new C79406ab(this, eVar));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MWW Context Manager");
        fVar.mo85279c("Current sessions").mo85276a(C90752i.m148234h(Collection.EL.stream((C58485gu) Collection.EL.stream(this.f218071m.f218121b.keySet()).map(C79431b.f218096a).collect(C58370cn.f155946a)).map(C79468z.f218150a).collect(C58370cn.f155946a)));
        C91005e b = fVar.mo85278b("Settings");
        b.mo85276a(C90752i.m148229c("[" + ((String) C59364ae.m92266l(Collections.unmodifiableMap(this.f218073o.f34233a)).mo56895e(C79410af.f218049a).collect(Collectors.joining(", "))) + "]"));
        C91005e b2 = fVar.mo85278b("Context handlers");
        b2.mo85276a(C90752i.m148229c("[" + ((String) C59364ae.m92266l(this.f218067i).mo56895e(C79405aa.f218043a).collect(Collectors.joining(", "))) + "]"));
        fVar.mo85278b("Lockscreen").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f218070l.isKeyguardLocked())));
    }

    /* renamed from: h */
    public final void mo74031h(C79570b bVar, boolean z) {
        this.f218061b.execute(new C79466x(this, bVar, z));
    }

    /* renamed from: i */
    public final void mo74032i() {
        C59364ae.m92266l(this.f218067i).mo56895e(C59380n.f157585a).forEach(C79464v.f218143a);
        this.f218072n.mo74045b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0117, code lost:
        if (r9.f218071m.f218121b.remove(r3.mo74043e()) != null) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0147 A[SYNTHETIC, Splitter:B:38:0x0147] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo74033j(com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r9.f218062c     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.shared.aq.b.e r0 = (com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e) r0     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.shared.v.i r0 = r0.f222055a     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r1 = r10.mo108448b()     // Catch:{ all -> 0x0158 }
            int r1 = r1.f218339o     // Catch:{ all -> 0x0158 }
            com.google.android.apps.search.assistant.surfaces.voice.o.a.d r2 = r10.mo108450d()     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x0158 }
            if (r2 == 0) goto L_0x0150
            com.google.android.apps.gsa.nga.shared.v.c.gb r3 = new com.google.android.apps.gsa.nga.shared.v.c.gb     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = "NGA_WARM_ACTIONS_EVENT_COUNT"
            r3.<init>(r4, r1, r2)     // Catch:{ all -> 0x0158 }
            r0.mo75579d(r3)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.k r0 = r9.f218068j     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.b r1 = new com.google.android.apps.gsa.nga.engine.warmactions.e.b     // Catch:{ all -> 0x0158 }
            r1.<init>()     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.a.al r2 = f218060f     // Catch:{ all -> 0x0158 }
            com.google.android.apps.search.assistant.surfaces.voice.o.a.d r3 = r10.mo108450d()     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.t r2 = r2.apply(r3)     // Catch:{ all -> 0x0158 }
            r1.mo74124c(r2)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r2 = r10.mo108448b()     // Catch:{ all -> 0x0158 }
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)     // Catch:{ all -> 0x0158 }
            r1.f218258a = r2     // Catch:{ all -> 0x0158 }
            android.app.KeyguardManager r2 = r9.f218070l     // Catch:{ all -> 0x0158 }
            boolean r2 = r2.isKeyguardLocked()     // Catch:{ all -> 0x0158 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0158 }
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)     // Catch:{ all -> 0x0158 }
            r1.f218260c = r2     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.j r1 = r1.mo74122a()     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.i r1 = r1.mo74125a()     // Catch:{ all -> 0x0158 }
            r2 = r0
            com.google.android.apps.gsa.nga.engine.warmactions.e.s r2 = (com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79561s) r2     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.d r2 = r2.f218283b     // Catch:{ all -> 0x0158 }
            com.google.common.b.hd r3 = com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79550h.f218273a     // Catch:{ all -> 0x0158 }
            com.google.common.b.ij r3 = r3.keySet()     // Catch:{ all -> 0x0158 }
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.e r4 = new com.google.android.apps.gsa.nga.engine.warmactions.e.e     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.h r2 = (com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79550h) r2     // Catch:{ all -> 0x0158 }
            r4.<init>(r2)     // Catch:{ all -> 0x0158 }
            j$.util.stream.Stream r2 = r3.map(r4)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.f r3 = com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79548f.f218271a     // Catch:{ all -> 0x0158 }
            j$.util.stream.Stream r2 = r2.filter(r3)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.g r3 = com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79549g.f218272a     // Catch:{ all -> 0x0158 }
            j$.util.stream.Stream r2 = r2.map(r3)     // Catch:{ all -> 0x0158 }
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155947b     // Catch:{ all -> 0x0158 }
            java.lang.Object r2 = r2.collect(r3)     // Catch:{ all -> 0x0158 }
            com.google.common.b.ij r2 = (com.google.common.p4522b.C58528ij) r2     // Catch:{ all -> 0x0158 }
            r1.mo74123b(r2)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.j r1 = r1.mo74122a()     // Catch:{ all -> 0x0158 }
            r2 = r0
            com.google.android.apps.gsa.nga.engine.warmactions.e.s r2 = (com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79561s) r2     // Catch:{ all -> 0x0158 }
            r2.mo74136b(r1)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.e.s r0 = (com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79561s) r0     // Catch:{ all -> 0x0158 }
            r0.mo74137c(r1)     // Catch:{ all -> 0x0158 }
            j$.util.Optional r0 = r10.mo108451e()     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.a.ag r1 = new com.google.android.apps.gsa.nga.engine.warmactions.a.ag     // Catch:{ all -> 0x0158 }
            r1.<init>(r9, r10)     // Catch:{ all -> 0x0158 }
            j$.util.Optional r0 = r0.mo43489or(r1)     // Catch:{ all -> 0x0158 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x00ac
            monitor-exit(r9)
            return
        L_0x00ac:
            com.google.android.apps.gsa.shared.util.v.g r1 = r9.f218065g     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251457jF     // Catch:{ all -> 0x0158 }
            boolean r1 = r1.mo85405j(r2)     // Catch:{ all -> 0x0158 }
            r2 = 2
            if (r1 == 0) goto L_0x00cb
            com.google.android.apps.gsa.nga.engine.warmactions.a.aq r1 = r9.f218072n     // Catch:{ all -> 0x0158 }
            boolean r1 = r1.mo74046c(r10)     // Catch:{ all -> 0x0158 }
            if (r1 != 0) goto L_0x00c0
            goto L_0x00cb
        L_0x00c0:
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r9.f218062c     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r10 = r10.mo108448b()     // Catch:{ all -> 0x0158 }
            r0.mo74787c(r10, r2)     // Catch:{ all -> 0x0158 }
            monitor-exit(r9)
            return
        L_0x00cb:
            long r4 = r10.mo108447a()     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r6 = r10.mo108448b()     // Catch:{ all -> 0x0158 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0158 }
            r7 = r0
            com.google.android.apps.gsa.nga.engine.warmactions.g.o r7 = (com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o) r7     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.a.h r0 = new com.google.android.apps.gsa.nga.engine.warmactions.a.h     // Catch:{ all -> 0x0158 }
            com.google.common.v.g r1 = com.google.common.p4580v.C60948g.f165068a     // Catch:{ all -> 0x0158 }
            j$.time.Instant r8 = p3186j$.time.Instant.now()     // Catch:{ all -> 0x0158 }
            r3 = r0
            r3.<init>(r4, r6, r7, r8)     // Catch:{ all -> 0x0158 }
            com.google.android.apps.search.assistant.surfaces.voice.o.a.d r1 = r10.mo108450d()     // Catch:{ all -> 0x0158 }
            int r3 = r1.ordinal()     // Catch:{ all -> 0x0158 }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x011b
            if (r3 == r5) goto L_0x010b
            if (r3 != r2) goto L_0x00f7
            goto L_0x010b
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "Invalid status "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0158 }
            r10.<init>(r0)     // Catch:{ all -> 0x0158 }
            throw r10     // Catch:{ all -> 0x0158 }
        L_0x010b:
            com.google.android.apps.gsa.nga.engine.warmactions.a.f r1 = r9.f218071m     // Catch:{ all -> 0x0158 }
            j$.util.concurrent.ConcurrentHashMap r1 = r1.f218121b     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.g.f r0 = r0.mo74043e()     // Catch:{ all -> 0x0158 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x0139
        L_0x0119:
            r4 = 1
            goto L_0x0139
        L_0x011b:
            com.google.android.apps.gsa.nga.engine.warmactions.a.f r1 = r9.f218071m     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.shared.util.v.g r2 = r1.f218120a     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251455jD     // Catch:{ all -> 0x0158 }
            boolean r2 = r2.mo85405j(r3)     // Catch:{ all -> 0x0158 }
            if (r2 != 0) goto L_0x012c
            j$.util.concurrent.ConcurrentHashMap r2 = r1.f218121b     // Catch:{ all -> 0x0158 }
            r2.clear()     // Catch:{ all -> 0x0158 }
        L_0x012c:
            j$.util.concurrent.ConcurrentHashMap r1 = r1.f218121b     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.g.f r2 = r0.mo74043e()     // Catch:{ all -> 0x0158 }
            java.lang.Object r0 = r1.put(r2, r0)     // Catch:{ all -> 0x0158 }
            if (r0 != 0) goto L_0x0139
            goto L_0x0119
        L_0x0139:
            if (r4 != 0) goto L_0x0147
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r9.f218062c     // Catch:{ all -> 0x0158 }
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r10 = r10.mo108448b()     // Catch:{ all -> 0x0158 }
            r1 = 6
            r0.mo74787c(r10, r1)     // Catch:{ all -> 0x0158 }
            monitor-exit(r9)
            return
        L_0x0147:
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r10)     // Catch:{ all -> 0x0158 }
            r9.m127449r(r10)     // Catch:{ all -> 0x0158 }
            monitor-exit(r9)
            return
        L_0x0150:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "Null status"
            r10.<init>(r0)     // Catch:{ all -> 0x0158 }
            throw r10     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x015c
        L_0x015b:
            throw r10
        L_0x015c:
            goto L_0x015b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79418an.mo74033j(com.google.android.apps.search.assistant.surfaces.voice.o.a.e):void");
    }

    /* renamed from: k */
    public final synchronized void mo74034k() {
        this.f218074p.f218057b.set(true);
        m127451t();
    }

    /* renamed from: l */
    public final synchronized void mo74035l() {
        this.f218074p.f218056a.set(false);
        m127451t();
    }

    /* renamed from: m */
    public final synchronized void mo74036m() {
        m127452u();
        this.f218074p.f218057b.set(false);
    }

    /* renamed from: n */
    public final synchronized void mo74037n() {
        m127452u();
        this.f218074p.f218056a.set(true);
    }

    /* renamed from: o */
    public final synchronized void mo74038o(C79570b bVar, boolean z) {
        if (z) {
            Collection.EL.removeIf(this.f218071m.f218121b.keySet(), new C79404a(bVar));
        }
        m127449r(Optional.empty());
    }
}
