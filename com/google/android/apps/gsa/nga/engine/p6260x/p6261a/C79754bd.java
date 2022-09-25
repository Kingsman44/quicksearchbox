package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ae.d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79852aj;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.engine.p6260x.C79858f;
import com.google.android.apps.gsa.nga.engine.p6260x.C79859g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6344g.C81067a;
import com.google.android.apps.gsa.nga.shared.p6367t.C81512g;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83319in;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.knowledge.p4661a.p4662a.C61752n;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bd */
/* compiled from: PG */
public final class C79754bd implements C79858f, C79853ak, C79859g, C90991b, C79852aj, C81512g {

    /* renamed from: d */
    private static final C59071e f218664d = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.x.a.bd");

    /* renamed from: e */
    private static final Object f218665e = new Object();

    /* renamed from: a */
    public final C21370a f218666a;

    /* renamed from: b */
    public final AtomicInteger f218667b = new AtomicInteger();

    /* renamed from: c */
    public Optional f218668c = Optional.empty();

    /* renamed from: f */
    private final C91142g f218669f;

    /* renamed from: g */
    private final C76092h f218670g;

    /* renamed from: h */
    private final Optional f218671h;

    /* renamed from: i */
    private final List f218672i = new ArrayList();

    /* renamed from: j */
    private final C81067a f218673j = new C81067a(10);

    /* renamed from: k */
    private final C68214a f218674k;

    /* renamed from: l */
    private final C68214a f218675l;

    /* renamed from: m */
    private final C83305i f218676m;

    /* renamed from: n */
    private final C79783cf f218677n;

    /* renamed from: o */
    private long f218678o;

    /* renamed from: p */
    private String f218679p;

    /* renamed from: q */
    private List f218680q = new ArrayList();

    public C79754bd(C68214a aVar, C91142g gVar, C21370a aVar2, C68214a aVar3, C83305i iVar, C79783cf cfVar, C76092h hVar, Optional optional) {
        this.f218674k = aVar;
        this.f218669f = gVar;
        this.f218666a = aVar2;
        this.f218675l = aVar3;
        this.f218676m = iVar;
        this.f218677n = cfVar;
        this.f218679p = C80471b.SODA.name();
        this.f218670g = hVar;
        this.f218671h = optional;
    }

    /* renamed from: k */
    public static boolean m127820k(long j, long j2, long j3) {
        return Math.abs(j - j2) < j3;
    }

    /* renamed from: l */
    public static boolean m127821l(C82889ee eeVar, C79814dj djVar) {
        C82823bt btVar;
        C82885ea eaVar = eeVar.f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 29) {
            btVar = (C82823bt) eaVar.f225980b;
        } else {
            btVar = C82823bt.f225680i;
        }
        C80513b bVar = btVar.f225684c;
        if (bVar == null) {
            bVar = C80513b.f221014e;
        }
        C61752n nVar = bVar.f221016a;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        if (nVar.f166811b.equals("UnintendedInvocation")) {
            return true;
        }
        C61752n nVar2 = C79783cf.m127871e(eeVar, djVar).f221016a;
        if (nVar2 == null) {
            nVar2 = C61752n.f166808f;
        }
        return nVar2.f166811b.equals("UnintendedInvocation");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: m */
    private final com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc m127822m(com.google.android.apps.gsa.nga.shared.p6407v.C83320io r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f227136c
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            com.google.common.base.C58838bb.m90868c(r0)
            java.lang.Object r0 = f218665e
            monitor-enter(r0)
            com.google.android.apps.gsa.nga.engine.x.a.bc r1 = r9.m127824o(r10)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return r1
        L_0x0016:
            monitor-enter(r0)     // Catch:{ all -> 0x0094 }
        L_0x0017:
            java.util.List r1 = r9.f218672i     // Catch:{ all -> 0x0091 }
            int r1 = r1.size()     // Catch:{ all -> 0x0091 }
            r2 = 4
            if (r1 < r2) goto L_0x0030
            java.util.List r1 = r9.f218672i     // Catch:{ all -> 0x0091 }
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x0091 }
            com.google.android.apps.gsa.nga.engine.x.a.bc r1 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r1     // Catch:{ all -> 0x0091 }
            r9.m127828s(r1)     // Catch:{ all -> 0x0091 }
            m127831v(r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0017
        L_0x0030:
            com.google.android.apps.gsa.nga.engine.x.a.bc r1 = new com.google.android.apps.gsa.nga.engine.x.a.bc     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = r9.f218679p     // Catch:{ all -> 0x0091 }
            r1.<init>(r9, r10, r2)     // Catch:{ all -> 0x0091 }
            java.util.List r2 = r9.f218672i     // Catch:{ all -> 0x0091 }
            r2.add(r1)     // Catch:{ all -> 0x0091 }
            com.google.android.apps.gsa.nga.shared.g.a r2 = r9.f218673j     // Catch:{ all -> 0x0091 }
            r2.add(r1)     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            dagger.a r2 = r9.f218674k     // Catch:{ all -> 0x0094 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.w r2 = (com.google.android.apps.gsa.nga.shared.p6407v.C83334w) r2     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.ec r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.SESSION_ID     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x0094 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.dz r4 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz) r4     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.gi r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82947gi.f226310c     // Catch:{ all -> 0x0094 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.gh r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82946gh) r5     // Catch:{ all -> 0x0094 }
            java.lang.String r6 = r1.f218652b     // Catch:{ all -> 0x0094 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0094 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.gi r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82947gi) r7     // Catch:{ all -> 0x0094 }
            r6.getClass()     // Catch:{ all -> 0x0094 }
            int r8 = r7.f226312a     // Catch:{ all -> 0x0094 }
            r8 = r8 | 1
            r7.f226312a = r8     // Catch:{ all -> 0x0094 }
            r7.f226313b = r6     // Catch:{ all -> 0x0094 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0094 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r6     // Catch:{ all -> 0x0094 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.gi r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82947gi) r5     // Catch:{ all -> 0x0094 }
            r5.getClass()     // Catch:{ all -> 0x0094 }
            r6.f225980b = r5     // Catch:{ all -> 0x0094 }
            r5 = 50
            r6.f225979a = r5     // Catch:{ all -> 0x0094 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0094 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r4 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r4     // Catch:{ all -> 0x0094 }
            r2.mo75545c(r3, r4, r10)     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return r1
        L_0x0091:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r10     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0097:
            throw r10
        L_0x0098:
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.m127822m(com.google.android.apps.gsa.nga.shared.v.io):com.google.android.apps.gsa.nga.engine.x.a.bc");
    }

    /* renamed from: n */
    private final C79753bc m127823n(String str) {
        C83319in inVar = (C83319in) C83320io.f227132d.createBuilder();
        inVar.copyOnWrite();
        C83320io ioVar = (C83320io) inVar.instance;
        str.getClass();
        ioVar.f227134a |= 2;
        ioVar.f227136c = str;
        return m127822m((C83320io) inVar.build());
    }

    /* renamed from: o */
    private final C79753bc m127824o(C83320io ioVar) {
        synchronized (f218665e) {
            for (C79753bc bcVar : this.f218672i) {
                if (ioVar.f227136c.equals(bcVar.f218660j.f218842G)) {
                    return bcVar;
                }
            }
            return null;
        }
    }

    /* renamed from: p */
    private final C79753bc m127825p(String str) {
        C79753bc bcVar;
        synchronized (f218665e) {
            bcVar = (C79753bc) Collection.EL.stream(this.f218672i).filter(new C79821e(str)).findFirst().orElse(null);
        }
        return bcVar;
    }

    /* renamed from: q */
    private final Optional m127826q() {
        synchronized (f218665e) {
            if (this.f218672i.isEmpty()) {
                Optional empty = Optional.empty();
                return empty;
            }
            for (C79753bc bcVar : C58597ky.m90216g(this.f218672i)) {
                if (bcVar.f218660j.f218854d.size() > 0) {
                    Optional of = Optional.m71637of(bcVar);
                    return of;
                }
            }
            Optional of2 = Optional.m71637of((C79753bc) C58557jl.m90131l(this.f218672i));
            return of2;
        }
    }

    /* renamed from: r */
    private static void m127827r(C91006f fVar, String str, String str2) {
        fVar.mo85293t("%s: %s", C90752i.m148229c(str), C90752i.m148229c(str2));
        fVar.mo85284k(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: com.google.android.apps.gsa.nga.shared.v.d.ee} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    private final void m127828s(com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc r28) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            java.lang.Object r2 = f218665e
            monitor-enter(r2)
            boolean r3 = r0.f218654d     // Catch:{ all -> 0x05a0 }
            if (r3 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x05a0 }
            return
        L_0x000d:
            r3 = 1
            r0.f218654d = r3     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r10 = r0.f218660j     // Catch:{ all -> 0x05a0 }
            com.google.protobuf.cq r4 = r10.f218854d     // Catch:{ all -> 0x05a0 }
            int r4 = r4.size()     // Catch:{ all -> 0x05a0 }
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.f218655e     // Catch:{ all -> 0x05a0 }
            if (r4 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x05a0 }
            return
        L_0x0021:
            java.lang.String r6 = r0.f218652b     // Catch:{ all -> 0x05a0 }
            com.google.common.o.l.r r11 = r0.f218653c     // Catch:{ all -> 0x05a0 }
            monitor-enter(r2)     // Catch:{ all -> 0x05a0 }
            boolean r4 = r0.f218657g     // Catch:{ all -> 0x059d }
            r5 = 2
            r7 = 29
            if (r4 == 0) goto L_0x0044
            com.google.android.apps.gsa.nga.shared.v.i r4 = r1.f218676m     // Catch:{ all -> 0x059d }
            com.google.android.apps.gsa.nga.shared.v.c.mw r9 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()     // Catch:{ all -> 0x059d }
            java.lang.String r12 = "NOT_LOGGING_ALREADY_LOGGED"
            r13 = r9
            com.google.android.apps.gsa.nga.shared.v.c.ej r13 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r13     // Catch:{ all -> 0x059d }
            r13.f225172b = r12     // Catch:{ all -> 0x059d }
            com.google.android.apps.gsa.nga.shared.v.c.mx r9 = r9.mo76117a()     // Catch:{ all -> 0x059d }
            r4.mo75579d(r9)     // Catch:{ all -> 0x059d }
            monitor-exit(r2)     // Catch:{ all -> 0x059d }
            goto L_0x036d
        L_0x0044:
            com.google.android.apps.gsa.nga.engine.x.a.dj r4 = r0.f218660j     // Catch:{ all -> 0x059d }
            java.lang.String r9 = r0.f218652b     // Catch:{ all -> 0x059d }
            java.lang.String r12 = r0.f218662l     // Catch:{ all -> 0x059d }
            boolean r13 = r0.f218655e     // Catch:{ all -> 0x059d }
            r0.f218657g = r3     // Catch:{ all -> 0x059d }
            monitor-exit(r2)     // Catch:{ all -> 0x059d }
            com.google.android.apps.gsa.nga.engine.x.a.cf r14 = r1.f218677n     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.util.v.g r15 = r14.f218743f     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247401gU     // Catch:{ all -> 0x05a0 }
            boolean r8 = r15.mo85405j(r8)     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x0071
            com.google.android.apps.gsa.nga.shared.v.i r4 = r14.f218748k     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mw r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()     // Catch:{ all -> 0x05a0 }
            java.lang.String r9 = "NOT_LOGGING_DISABLED_BY_FLAG"
            r12 = r8
            com.google.android.apps.gsa.nga.shared.v.c.ej r12 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r12     // Catch:{ all -> 0x05a0 }
            r12.f225172b = r9     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mx r8 = r8.mo76117a()     // Catch:{ all -> 0x05a0 }
            r4.mo75579d(r8)     // Catch:{ all -> 0x05a0 }
            goto L_0x036d
        L_0x0071:
            boolean r8 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127882t(r4)     // Catch:{ all -> 0x05a0 }
            if (r8 == 0) goto L_0x0081
            com.google.android.apps.gsa.shared.util.v.g r8 = r14.f218743f     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251463jL     // Catch:{ all -> 0x05a0 }
            boolean r8 = r8.mo85405j(r15)     // Catch:{ all -> 0x05a0 }
            if (r8 == 0) goto L_0x036d
        L_0x0081:
            com.google.protobuf.cq r8 = r4.f218854d     // Catch:{ all -> 0x05a0 }
            int r8 = r8.size()     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x008a
            goto L_0x00d0
        L_0x008a:
            com.google.protobuf.cq r8 = r4.f218854d     // Catch:{ all -> 0x05a0 }
            java.lang.Object r8 = com.google.common.p4522b.C58557jl.m90131l(r8)     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.ee r8 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee) r8     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r8 = r8.f226099d     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x0098
            com.google.android.apps.gsa.nga.shared.v.d.ea r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x05a0 }
        L_0x0098:
            int r15 = r8.f225979a     // Catch:{ all -> 0x05a0 }
            if (r15 != r7) goto L_0x00a1
            java.lang.Object r8 = r8.f225980b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.bt r8 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt) r8     // Catch:{ all -> 0x05a0 }
            goto L_0x00a3
        L_0x00a1:
            com.google.android.apps.gsa.nga.shared.v.d.bt r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt.f225680i     // Catch:{ all -> 0x05a0 }
        L_0x00a3:
            boolean r15 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127880r(r8)     // Catch:{ all -> 0x05a0 }
            if (r15 != 0) goto L_0x00d0
            int r15 = r8.f225682a     // Catch:{ all -> 0x05a0 }
            r15 = r15 & r5
            if (r15 != 0) goto L_0x00d0
            boolean r8 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127881s(r8)     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x00d0
            boolean r8 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127882t(r4)     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x00d0
            com.google.android.apps.gsa.nga.shared.v.i r4 = r14.f218748k     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mw r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()     // Catch:{ all -> 0x05a0 }
            java.lang.String r9 = "NOT_LOGGING_SYNTHETIC_UTTERANCE"
            r12 = r8
            com.google.android.apps.gsa.nga.shared.v.c.ej r12 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r12     // Catch:{ all -> 0x05a0 }
            r12.f225172b = r9     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mx r8 = r8.mo76117a()     // Catch:{ all -> 0x05a0 }
            r4.mo75579d(r8)     // Catch:{ all -> 0x05a0 }
            goto L_0x036d
        L_0x00d0:
            int r8 = r4.f218851a     // Catch:{ all -> 0x05a0 }
            r15 = 64
            r8 = r8 & r15
            r16 = 0
            if (r8 == 0) goto L_0x00e0
            com.google.android.apps.gsa.nga.shared.v.d.ee r8 = r4.f218866p     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x00e2
            com.google.android.apps.gsa.nga.shared.v.d.ee r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee.f226094j     // Catch:{ all -> 0x05a0 }
            goto L_0x00e2
        L_0x00e0:
            r8 = r16
        L_0x00e2:
            com.google.android.apps.gsa.nga.shared.v.d.ee r5 = r4.f218852b     // Catch:{ all -> 0x05a0 }
            if (r5 != 0) goto L_0x00e8
            com.google.android.apps.gsa.nga.shared.v.d.ee r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee.f226094j     // Catch:{ all -> 0x05a0 }
        L_0x00e8:
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = r5.f226099d     // Catch:{ all -> 0x05a0 }
            if (r5 != 0) goto L_0x00ee
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x05a0 }
        L_0x00ee:
            int r3 = r5.f225979a     // Catch:{ all -> 0x05a0 }
            r7 = 38
            if (r3 != r7) goto L_0x00f9
            java.lang.Object r3 = r5.f225980b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.br r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82821br) r3     // Catch:{ all -> 0x05a0 }
            goto L_0x00fb
        L_0x00f9:
            com.google.android.apps.gsa.nga.shared.v.d.br r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82821br.f225675d     // Catch:{ all -> 0x05a0 }
        L_0x00fb:
            int r3 = r3.f225679c     // Catch:{ all -> 0x05a0 }
            int r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82820bq.m132403a(r3)     // Catch:{ all -> 0x05a0 }
            r5 = 4
            if (r3 != 0) goto L_0x0105
            goto L_0x010b
        L_0x0105:
            if (r3 != r5) goto L_0x010b
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_ERROR     // Catch:{ all -> 0x05a0 }
            goto L_0x0286
        L_0x010b:
            com.google.protobuf.cq r3 = r4.f218854d     // Catch:{ all -> 0x05a0 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x05a0 }
            if (r3 == 0) goto L_0x0284
            if (r13 == 0) goto L_0x0284
            int r3 = r4.f218851a     // Catch:{ all -> 0x05a0 }
            r3 = r3 & 128(0x80, float:1.794E-43)
            r7 = 32
            if (r3 == 0) goto L_0x01f1
            com.google.android.apps.gsa.nga.shared.v.d.ee r3 = r4.f218873w     // Catch:{ all -> 0x05a0 }
            if (r3 != 0) goto L_0x0123
            com.google.android.apps.gsa.nga.shared.v.d.ee r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee.f226094j     // Catch:{ all -> 0x05a0 }
        L_0x0123:
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = r3.f226099d     // Catch:{ all -> 0x05a0 }
            if (r3 != 0) goto L_0x0129
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x05a0 }
        L_0x0129:
            int r8 = r3.f225979a     // Catch:{ all -> 0x05a0 }
            r13 = 6
            if (r8 != r13) goto L_0x0133
            java.lang.Object r3 = r3.f225980b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.g r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82938g) r3     // Catch:{ all -> 0x05a0 }
            goto L_0x0135
        L_0x0133:
            com.google.android.apps.gsa.nga.shared.v.d.g r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82938g.f226273j     // Catch:{ all -> 0x05a0 }
        L_0x0135:
            com.google.android.apps.gsa.nga.shared.aa.k.b.d r8 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80479d.UNKNOWN_TYPE     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.engine.ar.bb r8 = com.google.android.apps.gsa.nga.engine.ar.bb.a     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.y r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.UNKNOWN     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.aa.k.b.c r8 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c.UNKNOWN     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.assistant.shared.l.e r8 = com.google.android.apps.gsa.assistant.shared.l.e.a     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.ec r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.UNKNOWN     // Catch:{ all -> 0x05a0 }
            int r8 = r3.f226279e     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.y r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.m132448a(r8)     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x014b
            com.google.android.apps.gsa.nga.shared.v.d.y r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.UNKNOWN     // Catch:{ all -> 0x05a0 }
        L_0x014b:
            int r8 = r8.ordinal()     // Catch:{ all -> 0x05a0 }
            r13 = 25
            if (r8 == r13) goto L_0x01e6
            r13 = 27
            if (r8 == r13) goto L_0x01e6
            r13 = 71
            if (r8 == r13) goto L_0x01e3
            if (r8 == r7) goto L_0x01e6
            r7 = 33
            if (r8 == r7) goto L_0x01e3
            r7 = 42
            if (r8 == r7) goto L_0x01e6
            r7 = 43
            if (r8 == r7) goto L_0x01e6
            switch(r8) {
                case 52: goto L_0x01e0;
                case 53: goto L_0x01a2;
                case 54: goto L_0x0184;
                default: goto L_0x016c;
            }     // Catch:{ all -> 0x05a0 }
        L_0x016c:
            switch(r8) {
                case 86: goto L_0x0180;
                case 87: goto L_0x017c;
                case 88: goto L_0x0178;
                case 89: goto L_0x0174;
                case 90: goto L_0x0170;
                default: goto L_0x016f;
            }     // Catch:{ all -> 0x05a0 }
        L_0x016f:
            goto L_0x019c
        L_0x0170:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_INVALID_OAUTH_TOKEN     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x0174:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_NO_RECOGNITION_RECEIVED     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x0178:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_SPEECH_PIPELINE     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x017c:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_SEARCH_PROCESS_DEAD     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x0180:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_RECOGNIZER_NO_SPEECH_DETECTED     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x0184:
            com.google.android.apps.gsa.nga.shared.v.d.ew r3 = r3.f226283i     // Catch:{ all -> 0x05a0 }
            if (r3 != 0) goto L_0x018a
            com.google.android.apps.gsa.nga.shared.v.d.ew r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew.f226160o     // Catch:{ all -> 0x05a0 }
        L_0x018a:
            int r3 = r3.f226163b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.a(r3)     // Catch:{ all -> 0x05a0 }
            if (r3 != 0) goto L_0x0194
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.a     // Catch:{ all -> 0x05a0 }
        L_0x0194:
            int r3 = r3.ordinal()     // Catch:{ all -> 0x05a0 }
            r7 = 26
            if (r3 == r7) goto L_0x019f
        L_0x019c:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x019f:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_SUGGESTION_CHIP     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x01a2:
            com.google.android.apps.gsa.nga.shared.v.d.ew r3 = r3.f226283i     // Catch:{ all -> 0x05a0 }
            if (r3 != 0) goto L_0x01a8
            com.google.android.apps.gsa.nga.shared.v.d.ew r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew.f226160o     // Catch:{ all -> 0x05a0 }
        L_0x01a8:
            int r3 = r3.f226163b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.a(r3)     // Catch:{ all -> 0x05a0 }
            if (r3 != 0) goto L_0x01b2
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.a     // Catch:{ all -> 0x05a0 }
        L_0x01b2:
            int r3 = r3.ordinal()     // Catch:{ all -> 0x05a0 }
            if (r3 == r15) goto L_0x01dd
            r7 = 76
            if (r3 == r7) goto L_0x01dd
            r7 = 98
            if (r3 == r7) goto L_0x01da
            r7 = 110(0x6e, float:1.54E-43)
            if (r3 == r7) goto L_0x01da
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x01dd
            r7 = 120(0x78, float:1.68E-43)
            if (r3 == r7) goto L_0x01d7
            r7 = 122(0x7a, float:1.71E-43)
            if (r3 == r7) goto L_0x01da
            r7 = 124(0x7c, float:1.74E-43)
            if (r3 == r7) goto L_0x01d7
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x01d7:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_LPH     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x01da:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_NEW_HOTWORD     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x01dd:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_SQUEEZE     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x01e0:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_NO_SPEECH_DETECTED     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x01e3:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_VISUAL_STAGE_CHANGE     // Catch:{ all -> 0x05a0 }
            goto L_0x01e8
        L_0x01e6:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_EXPLICIT_CLOSE     // Catch:{ all -> 0x05a0 }
        L_0x01e8:
            com.google.android.apps.gsa.nga.shared.v.d.ee r7 = r4.f218873w     // Catch:{ all -> 0x05a0 }
            if (r7 != 0) goto L_0x01ee
            com.google.android.apps.gsa.nga.shared.v.d.ee r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee.f226094j     // Catch:{ all -> 0x05a0 }
        L_0x01ee:
            r8 = r7
            goto L_0x0286
        L_0x01f1:
            com.google.android.apps.gsa.nga.shared.v.d.ee r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee.f226094j     // Catch:{ all -> 0x05a0 }
            com.google.protobuf.cq r13 = r4.f218865o     // Catch:{ all -> 0x05a0 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x05a0 }
        L_0x01f9:
            boolean r18 = r13.hasNext()     // Catch:{ all -> 0x05a0 }
            r5 = 24
            if (r18 == 0) goto L_0x0233
            java.lang.Object r18 = r13.next()     // Catch:{ all -> 0x05a0 }
            r15 = r18
            com.google.android.apps.gsa.nga.shared.v.d.ee r15 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee) r15     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r7 = r15.f226099d     // Catch:{ all -> 0x05a0 }
            if (r7 != 0) goto L_0x020f
            com.google.android.apps.gsa.nga.shared.v.d.ea r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x05a0 }
        L_0x020f:
            r21 = r13
            int r13 = r7.f225979a     // Catch:{ all -> 0x05a0 }
            if (r13 != r5) goto L_0x021a
            java.lang.Object r5 = r7.f225980b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.z r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83017z) r5     // Catch:{ all -> 0x05a0 }
            goto L_0x021c
        L_0x021a:
            com.google.android.apps.gsa.nga.shared.v.d.z r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83017z.f226625d     // Catch:{ all -> 0x05a0 }
        L_0x021c:
            int r5 = r5.f226628b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.y r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.m132448a(r5)     // Catch:{ all -> 0x05a0 }
            if (r5 != 0) goto L_0x0226
            com.google.android.apps.gsa.nga.shared.v.d.y r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.UNKNOWN     // Catch:{ all -> 0x05a0 }
        L_0x0226:
            com.google.android.apps.gsa.nga.shared.v.d.y r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.INITIAL_RESULT     // Catch:{ all -> 0x05a0 }
            if (r5 == r7) goto L_0x022b
            r3 = r15
        L_0x022b:
            r13 = r21
            r5 = 4
            r7 = 32
            r15 = 64
            goto L_0x01f9
        L_0x0233:
            com.google.android.apps.gsa.nga.shared.aa.k.b.d r7 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80479d.UNKNOWN_TYPE     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.engine.ar.bb r7 = com.google.android.apps.gsa.nga.engine.ar.bb.a     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.y r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.UNKNOWN     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.aa.k.b.c r7 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c.UNKNOWN     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.a     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.ec r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.UNKNOWN     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r7 = r3.f226099d     // Catch:{ all -> 0x05a0 }
            if (r7 != 0) goto L_0x0245
            com.google.android.apps.gsa.nga.shared.v.d.ea r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x05a0 }
        L_0x0245:
            int r13 = r7.f225979a     // Catch:{ all -> 0x05a0 }
            if (r13 != r5) goto L_0x024e
            java.lang.Object r5 = r7.f225980b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.z r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83017z) r5     // Catch:{ all -> 0x05a0 }
            goto L_0x0250
        L_0x024e:
            com.google.android.apps.gsa.nga.shared.v.d.z r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83017z.f226625d     // Catch:{ all -> 0x05a0 }
        L_0x0250:
            int r5 = r5.f226628b     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.d.y r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.m132448a(r5)     // Catch:{ all -> 0x05a0 }
            if (r5 != 0) goto L_0x025a
            com.google.android.apps.gsa.nga.shared.v.d.y r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.UNKNOWN     // Catch:{ all -> 0x05a0 }
        L_0x025a:
            int r5 = r5.ordinal()     // Catch:{ all -> 0x05a0 }
            r7 = 29
            if (r5 == r7) goto L_0x0270
            r7 = 32
            if (r5 == r7) goto L_0x026b
            r7 = 59
            if (r5 == r7) goto L_0x0270
            goto L_0x0275
        L_0x026b:
            com.google.android.apps.gsa.shared.logger.b.ae r16 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_EXPLICIT_CLOSE     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x0275
            goto L_0x0274
        L_0x0270:
            com.google.android.apps.gsa.shared.logger.b.ae r16 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_NO_SPEECH_DETECTED     // Catch:{ all -> 0x05a0 }
            if (r8 != 0) goto L_0x0275
        L_0x0274:
            r8 = r3
        L_0x0275:
            if (r16 != 0) goto L_0x0281
            int r3 = r4.f218851a     // Catch:{ all -> 0x05a0 }
            r5 = 64
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0281
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN     // Catch:{ all -> 0x05a0 }
            goto L_0x0286
        L_0x0281:
            r3 = r16
            goto L_0x0286
        L_0x0284:
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_SUCCESS     // Catch:{ all -> 0x05a0 }
        L_0x0286:
            if (r3 != 0) goto L_0x029e
            com.google.android.apps.gsa.nga.shared.v.i r3 = r14.f218748k     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mw r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()     // Catch:{ all -> 0x05a0 }
            java.lang.String r5 = "NOT_LOGGING_END_STATE_MISSING"
            r7 = r4
            com.google.android.apps.gsa.nga.shared.v.c.ej r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r7     // Catch:{ all -> 0x05a0 }
            r7.f225172b = r5     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mx r4 = r4.mo76117a()     // Catch:{ all -> 0x05a0 }
            r3.mo75579d(r4)     // Catch:{ all -> 0x05a0 }
            goto L_0x036d
        L_0x029e:
            if (r8 != 0) goto L_0x02b6
            com.google.android.apps.gsa.nga.shared.v.i r3 = r14.f218748k     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mw r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()     // Catch:{ all -> 0x05a0 }
            java.lang.String r5 = "NOT_LOGGING_FINAL_EVENT_MISSING"
            r7 = r4
            com.google.android.apps.gsa.nga.shared.v.c.ej r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r7     // Catch:{ all -> 0x05a0 }
            r7.f225172b = r5     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mx r4 = r4.mo76117a()     // Catch:{ all -> 0x05a0 }
            r3.mo75579d(r4)     // Catch:{ all -> 0x05a0 }
            goto L_0x036d
        L_0x02b6:
            int r5 = r4.f218851a     // Catch:{ all -> 0x05a0 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0359
            com.google.android.apps.gsa.nga.shared.v.i r5 = r14.f218748k     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mw r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()     // Catch:{ all -> 0x05a0 }
            java.lang.String r13 = "LOGGED"
            r15 = r7
            com.google.android.apps.gsa.nga.shared.v.c.ej r15 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r15     // Catch:{ all -> 0x05a0 }
            r15.f225172b = r13     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mx r7 = r7.mo76117a()     // Catch:{ all -> 0x05a0 }
            r5.mo75579d(r7)     // Catch:{ all -> 0x05a0 }
            com.google.common.b.gp r5 = r14.mo74229i(r4, r9, r12)     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.logger.b.g r4 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127872f(r4)     // Catch:{ all -> 0x05a0 }
            if (r4 == 0) goto L_0x02dd
            r5.mo55395g(r4)     // Catch:{ all -> 0x05a0 }
        L_0x02dd:
            com.google.common.o.cb r4 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ all -> 0x05a0 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x05a0 }
            com.google.common.o.aj r4 = (com.google.common.p4552o.C59582aj) r4     // Catch:{ all -> 0x05a0 }
            r4.copyOnWrite()     // Catch:{ all -> 0x05a0 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x05a0 }
            com.google.common.o.cb r7 = (com.google.common.p4552o.C59687cb) r7     // Catch:{ all -> 0x05a0 }
            r9.getClass()     // Catch:{ all -> 0x05a0 }
            int r12 = r7.f160062a     // Catch:{ all -> 0x05a0 }
            r13 = 4
            r12 = r12 | r13
            r7.f160062a = r12     // Catch:{ all -> 0x05a0 }
            r7.f160127h = r9     // Catch:{ all -> 0x05a0 }
            r4.copyOnWrite()     // Catch:{ all -> 0x05a0 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x05a0 }
            com.google.common.o.cb r7 = (com.google.common.p4552o.C59687cb) r7     // Catch:{ all -> 0x05a0 }
            int r12 = r7.f160115b     // Catch:{ all -> 0x05a0 }
            r13 = 4194304(0x400000, float:5.877472E-39)
            r12 = r12 | r13
            r7.f160115b = r12     // Catch:{ all -> 0x05a0 }
            r12 = 1
            r7.f160059X = r12     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.logger.b.f r7 = new com.google.android.apps.gsa.shared.logger.b.f     // Catch:{ all -> 0x05a0 }
            r7.<init>()     // Catch:{ all -> 0x05a0 }
            r7.f246201a = r3     // Catch:{ all -> 0x05a0 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x05a0 }
            long r12 = r8.f226103h     // Catch:{ all -> 0x05a0 }
            long r12 = r3.toNanos(r12)     // Catch:{ all -> 0x05a0 }
            r7.f246204d = r12     // Catch:{ all -> 0x05a0 }
            com.google.protobuf.bv r3 = r4.build()     // Catch:{ all -> 0x05a0 }
            com.google.common.o.cb r3 = (com.google.common.p4552o.C59687cb) r3     // Catch:{ all -> 0x05a0 }
            r7.f246203c = r3     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.logger.b.g r3 = r7.mo83699a()     // Catch:{ all -> 0x05a0 }
            r5.mo55395g(r3)     // Catch:{ all -> 0x05a0 }
            com.google.common.b.gu r3 = r5.mo55394f()     // Catch:{ all -> 0x05a0 }
            r4 = r3
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4     // Catch:{ all -> 0x05a0 }
            int r4 = r4.f156474d     // Catch:{ all -> 0x05a0 }
            r5 = 0
        L_0x0332:
            if (r5 >= r4) goto L_0x036d
            java.lang.Object r7 = r3.get(r5)     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.logger.b.g r7 = (com.google.android.apps.gsa.shared.logger.p7051b.C89857g) r7     // Catch:{ all -> 0x05a0 }
            dagger.a r8 = r14.f218747j     // Catch:{ all -> 0x05a0 }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.engine.x.k r8 = (com.google.android.apps.gsa.nga.engine.p6260x.C79863k) r8     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.logger.b.f r12 = new com.google.android.apps.gsa.shared.logger.b.f     // Catch:{ all -> 0x05a0 }
            r12.<init>()     // Catch:{ all -> 0x05a0 }
            r12.mo83700b(r7)     // Catch:{ all -> 0x05a0 }
            java.lang.String r7 = "rId"
            r12.mo83701c(r7, r9)     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.shared.logger.b.g r7 = r12.mo83699a()     // Catch:{ all -> 0x05a0 }
            r8.mo74236a(r7)     // Catch:{ all -> 0x05a0 }
            int r5 = r5 + 1
            goto L_0x0332
        L_0x0359:
            com.google.android.apps.gsa.nga.shared.v.i r3 = r14.f218748k     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mw r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()     // Catch:{ all -> 0x05a0 }
            java.lang.String r5 = "NOT_LOGGING_OPA_INVOCATION_MISSING"
            r7 = r4
            com.google.android.apps.gsa.nga.shared.v.c.ej r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r7     // Catch:{ all -> 0x05a0 }
            r7.f225172b = r5     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.shared.v.c.mx r4 = r4.mo76117a()     // Catch:{ all -> 0x05a0 }
            r3.mo75579d(r4)     // Catch:{ all -> 0x05a0 }
        L_0x036d:
            java.lang.Object r3 = f218665e     // Catch:{ all -> 0x05a0 }
            monitor-enter(r3)     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r4 = r0.f218660j     // Catch:{ all -> 0x059a }
            com.google.protobuf.cq r5 = r4.f218854d     // Catch:{ all -> 0x059a }
            int r5 = r5.size()     // Catch:{ all -> 0x059a }
            if (r5 != 0) goto L_0x037f
            monitor-exit(r3)     // Catch:{ all -> 0x059a }
        L_0x037b:
            r16 = r10
            goto L_0x0567
        L_0x037f:
            com.google.protobuf.cq r5 = r4.f218854d     // Catch:{ all -> 0x059a }
            java.lang.Object r5 = com.google.common.p4522b.C58557jl.m90131l(r5)     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.v.d.ee r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee) r5     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = r5.f226099d     // Catch:{ all -> 0x059a }
            if (r5 != 0) goto L_0x038d
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x059a }
        L_0x038d:
            int r7 = r5.f225979a     // Catch:{ all -> 0x059a }
            r8 = 29
            if (r7 != r8) goto L_0x0398
            java.lang.Object r5 = r5.f225980b     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.v.d.bt r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt) r5     // Catch:{ all -> 0x059a }
            goto L_0x039a
        L_0x0398:
            com.google.android.apps.gsa.nga.shared.v.d.bt r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt.f225680i     // Catch:{ all -> 0x059a }
        L_0x039a:
            java.lang.String r7 = r5.f225685d     // Catch:{ all -> 0x059a }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x059a }
            if (r7 == 0) goto L_0x03a4
            monitor-exit(r3)     // Catch:{ all -> 0x059a }
            goto L_0x037b
        L_0x03a4:
            com.google.protobuf.cq r7 = r4.f218863m     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.i r8 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79825i.f218896a     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r7 = r7.filter(r8)     // Catch:{ all -> 0x059a }
            j$.util.Optional r7 = r7.findFirst()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.j r8 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79826j.f218897a     // Catch:{ all -> 0x059a }
            j$.util.Optional r7 = r7.map(r8)     // Catch:{ all -> 0x059a }
            boolean r8 = r7.isPresent()     // Catch:{ all -> 0x059a }
            if (r8 == 0) goto L_0x03e0
            java.lang.Object r8 = r7.get()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.v.d.gz r8 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz) r8     // Catch:{ all -> 0x059a }
            int r8 = r8.f226345a     // Catch:{ all -> 0x059a }
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x03e0
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.v.d.gz r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz) r7     // Catch:{ all -> 0x059a }
            int r7 = r7.f226353i     // Catch:{ all -> 0x059a }
            int r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82957gs.m132437a(r7)     // Catch:{ all -> 0x059a }
            if (r7 != 0) goto L_0x03db
            goto L_0x03e0
        L_0x03db:
            r8 = 2
            if (r7 != r8) goto L_0x03e0
            r7 = 1
            goto L_0x03e1
        L_0x03e0:
            r7 = 0
        L_0x03e1:
            boolean r8 = m127832w(r28)     // Catch:{ all -> 0x059a }
            com.google.protobuf.cq r9 = r4.f218862l     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.k r12 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79827k.f218898a     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r9 = r9.filter(r12)     // Catch:{ all -> 0x059a }
            j$.util.Optional r9 = r9.findFirst()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.m r12 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79829m.f218900a     // Catch:{ all -> 0x059a }
            j$.util.Optional r9 = r9.map(r12)     // Catch:{ all -> 0x059a }
            if (r8 == 0) goto L_0x0405
            boolean r12 = r9.isPresent()     // Catch:{ all -> 0x059a }
            if (r12 == 0) goto L_0x0405
            r12 = 1
            goto L_0x0406
        L_0x0405:
            r12 = 0
        L_0x0406:
            if (r8 != 0) goto L_0x041b
            com.google.protobuf.cq r13 = r4.f218854d     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r13)     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.n r14 = new com.google.android.apps.gsa.nga.engine.x.a.n     // Catch:{ all -> 0x059a }
            r14.<init>(r4)     // Catch:{ all -> 0x059a }
            boolean r4 = r13.anyMatch(r14)     // Catch:{ all -> 0x059a }
            if (r4 == 0) goto L_0x041b
            r4 = 1
            goto L_0x041c
        L_0x041b:
            r4 = 0
        L_0x041c:
            com.google.android.apps.gsa.nga.shared.v.d.hw r13 = r5.f225683b     // Catch:{ all -> 0x059a }
            if (r13 != 0) goto L_0x0422
            com.google.android.apps.gsa.nga.shared.v.d.hw r13 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw.f226443y     // Catch:{ all -> 0x059a }
        L_0x0422:
            com.google.android.apps.gsa.nga.shared.aa.e.n r13 = r13.f226470x     // Catch:{ all -> 0x059a }
            if (r13 != 0) goto L_0x0428
            com.google.android.apps.gsa.nga.shared.aa.e.n r13 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k     // Catch:{ all -> 0x059a }
        L_0x0428:
            com.google.protobuf.cq r13 = r13.f220658a     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r13)     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.o r14 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79831o.f218902a     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r13 = r13.filter(r14)     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.p r14 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79832p.f218903a     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r13 = r13.map(r14)     // Catch:{ all -> 0x059a }
            j$.util.Optional r13 = r13.findFirst()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.aa.e.a.t r14 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t.UNKNOWN     // Catch:{ all -> 0x059a }
            java.lang.Object r13 = r13.orElse(r14)     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.aa.e.a.t r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t) r13     // Catch:{ all -> 0x059a }
            int r13 = r13.getNumber()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.shared.util.v.g r14 = r1.f218669f     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C89978aq.f246612k     // Catch:{ all -> 0x059a }
            boolean r14 = r14.mo85405j(r15)     // Catch:{ all -> 0x059a }
            if (r14 != 0) goto L_0x046e
            com.google.android.apps.gsa.shared.util.v.g r14 = r1.f218669f     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C89978aq.f246621t     // Catch:{ all -> 0x059a }
            boolean r14 = r14.mo85405j(r15)     // Catch:{ all -> 0x059a }
            if (r14 != 0) goto L_0x046e
            com.google.android.apps.gsa.nga.engine.g.h r14 = r1.f218670g     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.g.f r14 = r14.mo72021b()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.ax.e.b r14 = r14.mo72035a()     // Catch:{ all -> 0x059a }
            boolean r14 = r14.mo71528h()     // Catch:{ all -> 0x059a }
            if (r14 == 0) goto L_0x047c
        L_0x046e:
            if (r4 != 0) goto L_0x0472
            if (r12 == 0) goto L_0x047c
        L_0x0472:
            j$.util.Optional r14 = r1.f218671h     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.q r15 = new com.google.android.apps.gsa.nga.engine.x.a.q     // Catch:{ all -> 0x059a }
            r15.<init>(r4)     // Catch:{ all -> 0x059a }
            r14.ifPresent(r15)     // Catch:{ all -> 0x059a }
        L_0x047c:
            com.google.android.apps.gsa.shared.util.v.g r14 = r1.f218669f     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C89978aq.f246612k     // Catch:{ all -> 0x059a }
            boolean r14 = r14.mo85405j(r15)     // Catch:{ all -> 0x059a }
            if (r14 == 0) goto L_0x04b2
            java.lang.String r5 = r5.f225685d     // Catch:{ all -> 0x059a }
            java.lang.String r14 = "\\s+"
            java.lang.String[] r5 = r5.split(r14)     // Catch:{ all -> 0x059a }
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)     // Catch:{ all -> 0x059a }
            r14 = 10
            j$.util.stream.Stream r5 = r5.limit(r14)     // Catch:{ all -> 0x059a }
            java.lang.String r14 = " "
            j$.util.stream.Collector r14 = p3186j$.util.stream.Collectors.joining(r14)     // Catch:{ all -> 0x059a }
            java.lang.Object r5 = r5.collect(r14)     // Catch:{ all -> 0x059a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x059a }
            j$.util.Optional r14 = r1.f218671h     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.x.a.r r15 = new com.google.android.apps.gsa.nga.engine.x.a.r     // Catch:{ all -> 0x059a }
            r15.<init>(r5)     // Catch:{ all -> 0x059a }
            r14.ifPresent(r15)     // Catch:{ all -> 0x059a }
        L_0x04b2:
            com.google.android.apps.gsa.nga.engine.g.h r5 = r1.f218670g     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.g.f r5 = r5.mo72021b()     // Catch:{ all -> 0x059a }
            java.util.Locale r5 = r5.mo72039e()     // Catch:{ all -> 0x059a }
            java.lang.String r5 = r5.toLanguageTag()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.g.h r14 = r1.f218670g     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.g.f r14 = r14.mo72021b()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.engine.ax.e.b r14 = r14.mo72035a()     // Catch:{ all -> 0x059a }
            java.lang.String r15 = r14.mo71523c()     // Catch:{ all -> 0x059a }
            com.google.common.b.gu r15 = com.google.android.apps.gsa.shared.p7066m.C89988b.m146551d(r15)     // Catch:{ all -> 0x059a }
            j$.util.stream.Stream r15 = p3186j$.util.Collection.EL.stream(r15)     // Catch:{ all -> 0x059a }
            r16 = r10
            com.google.android.apps.gsa.nga.engine.x.a.s r10 = new com.google.android.apps.gsa.nga.engine.x.a.s     // Catch:{ all -> 0x059a }
            r10.<init>(r5)     // Catch:{ all -> 0x059a }
            boolean r10 = r15.anyMatch(r10)     // Catch:{ all -> 0x059a }
            boolean r15 = r14.mo71529i()     // Catch:{ all -> 0x059a }
            if (r15 == 0) goto L_0x0566
            if (r10 == 0) goto L_0x0566
            com.google.android.apps.gsa.nga.shared.v.i r10 = r1.f218676m     // Catch:{ all -> 0x059a }
            java.lang.String r18 = "UNINTENDED_QUERY_SUPPRESSION_EXECUTION_COUNT"
            if (r5 == 0) goto L_0x055e
            if (r4 != 0) goto L_0x04f7
            if (r12 == 0) goto L_0x04f4
            goto L_0x04f7
        L_0x04f4:
            r20 = 0
            goto L_0x04f9
        L_0x04f7:
            r20 = 1
        L_0x04f9:
            boolean r24 = r14.mo71526f()     // Catch:{ all -> 0x059a }
            if (r4 == 0) goto L_0x050a
            if (r7 == 0) goto L_0x050a
            boolean r4 = r14.mo71526f()     // Catch:{ all -> 0x059a }
            if (r4 == 0) goto L_0x050a
            r25 = 1
            goto L_0x050c
        L_0x050a:
            r25 = 0
        L_0x050c:
            com.google.android.apps.gsa.nga.shared.v.c.hq r4 = new com.google.android.apps.gsa.nga.shared.v.c.hq     // Catch:{ all -> 0x059a }
            r23 = 1
            r17 = r4
            r19 = r5
            r21 = r8
            r22 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x059a }
            r10.mo75579d(r4)     // Catch:{ all -> 0x059a }
            if (r8 == 0) goto L_0x055c
            boolean r4 = r9.isPresent()     // Catch:{ all -> 0x059a }
            if (r4 == 0) goto L_0x055c
            java.lang.Object r4 = r9.get()     // Catch:{ all -> 0x059a }
            com.google.assistant.e.i.a.lq r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51544lq) r4     // Catch:{ all -> 0x059a }
            com.google.assistant.e.i.a.lp r4 = r4.f134351h     // Catch:{ all -> 0x059a }
            if (r4 != 0) goto L_0x0532
            com.google.assistant.e.i.a.lp r4 = com.google.assistant.p3897e.p3917i.p3918a.C51543lp.f134334f     // Catch:{ all -> 0x059a }
        L_0x0532:
            com.google.android.apps.gsa.nga.shared.v.i r7 = r1.f218676m     // Catch:{ all -> 0x059a }
            java.lang.String r18 = "UNINTENDED_QUERY_SUPPRESSION_SERVER_EXECUTION_COUNT"
            boolean r8 = r4.f134336a     // Catch:{ all -> 0x059a }
            boolean r9 = r4.f134337b     // Catch:{ all -> 0x059a }
            boolean r10 = r4.f134339d     // Catch:{ all -> 0x059a }
            boolean r12 = r4.f134340e     // Catch:{ all -> 0x059a }
            boolean r4 = r4.f134338c     // Catch:{ all -> 0x059a }
            boolean r26 = r14.mo71526f()     // Catch:{ all -> 0x059a }
            com.google.android.apps.gsa.nga.shared.v.c.hs r14 = new com.google.android.apps.gsa.nga.shared.v.c.hs     // Catch:{ all -> 0x059a }
            r17 = r14
            r19 = r5
            r20 = r13
            r21 = r8
            r22 = r9
            r23 = r4
            r24 = r10
            r25 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x059a }
            r7.mo75579d(r14)     // Catch:{ all -> 0x059a }
        L_0x055c:
            monitor-exit(r3)     // Catch:{ all -> 0x059a }
            goto L_0x0567
        L_0x055e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x059a }
            java.lang.String r4 = "Null language"
            r0.<init>(r4)     // Catch:{ all -> 0x059a }
            throw r0     // Catch:{ all -> 0x059a }
        L_0x0566:
            monitor-exit(r3)     // Catch:{ all -> 0x059a }
        L_0x0567:
            boolean r0 = r0.f218661k     // Catch:{ all -> 0x05a0 }
            if (r0 != 0) goto L_0x056d
            monitor-exit(r2)     // Catch:{ all -> 0x05a0 }
            return
        L_0x056d:
            java.util.List r9 = r1.f218680q     // Catch:{ all -> 0x05a0 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05a0 }
            r0.<init>()     // Catch:{ all -> 0x05a0 }
            r1.f218680q = r0     // Catch:{ all -> 0x05a0 }
            monitor-exit(r2)     // Catch:{ all -> 0x05a0 }
            com.google.android.apps.gsa.nga.engine.x.a.cf r0 = r1.f218677n
            com.google.android.libraries.gsa.k.g r2 = r0.f218751n
            com.google.android.apps.gsa.nga.engine.x.a.bx r3 = new com.google.android.apps.gsa.nga.engine.x.a.bx
            r4 = r3
            r5 = r0
            r7 = r11
            r8 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r4 = "[NGA]logQueryEvent build"
            com.google.common.util.concurrent.cx r2 = r2.mo28202b(r4, r3)
            com.google.android.libraries.gsa.k.g r3 = r0.f218751n
            com.google.android.apps.gsa.nga.engine.x.a.by r4 = new com.google.android.apps.gsa.nga.engine.x.a.by
            r5 = r16
            r4.<init>(r0, r11, r5)
            java.lang.String r0 = "[NGA]logQueryEvent log"
            r3.mo28211k(r2, r0, r4)
            return
        L_0x059a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x059a }
            throw r0     // Catch:{ all -> 0x05a0 }
        L_0x059d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x059d }
            throw r0     // Catch:{ all -> 0x05a0 }
        L_0x05a0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x05a0 }
            goto L_0x05a4
        L_0x05a3:
            throw r0
        L_0x05a4:
            goto L_0x05a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.m127828s(com.google.android.apps.gsa.nga.engine.x.a.bc):void");
    }

    /* renamed from: t */
    private final void m127829t(C89857g gVar, String str) {
        ((d) this.f218675l.mo27525b()).a(C58485gu.m89846n(gVar), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127872f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        m127829t(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f218659i = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001d, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r1 == null) goto L_?;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m127830u(com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc r4) {
        /*
            r3 = this;
            java.lang.Object r0 = f218665e
            monitor-enter(r0)
            boolean r1 = r4.f218659i     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0009:
            java.lang.String r1 = r4.f218658h     // Catch:{ all -> 0x0023 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r2 = r4.f218660j     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0022
            com.google.android.apps.gsa.shared.logger.b.g r2 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127872f(r2)
            if (r2 == 0) goto L_0x0022
            r3.m127829t(r2, r1)
            monitor-enter(r0)
            r1 = 1
            r4.f218659i = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r4
        L_0x0022:
            return
        L_0x0023:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.m127830u(com.google.android.apps.gsa.nga.engine.x.a.bc):void");
    }

    /* renamed from: v */
    private static void m127831v(C79753bc bcVar) {
        synchronized (f218665e) {
            bcVar.mo74216a(C79828l.f218899a);
        }
    }

    /* renamed from: w */
    private static boolean m127832w(C79753bc bcVar) {
        C82823bt btVar;
        if (bcVar.f218660j.f218854d.isEmpty()) {
            return false;
        }
        C82885ea eaVar = ((C82889ee) C58557jl.m90131l(bcVar.f218660j.f218854d)).f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 29) {
            btVar = (C82823bt) eaVar.f225980b;
        } else {
            btVar = C82823bt.f225680i;
        }
        return C79783cf.m127880r(btVar);
    }

    /* renamed from: x */
    private static boolean m127833x(C79753bc bcVar) {
        return Collection.EL.stream(bcVar.f218660j.f218854d).anyMatch(C79723a.f218621a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v101, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0298, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x037a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x03c8, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        r4 = r2.f226102g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x03cb, code lost:
        if (r4 != null) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x03cd, code lost:
        r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x03cf, code lost:
        m127822m(r4).mo74216a(new com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79746aw(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x03db, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x03dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x03dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x03e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x05ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0658, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0773, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x07eb, code lost:
        if (r5 != 7) goto L_0x07f3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:687:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:771:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74217a(com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r3 = r2.f226097b
            com.google.android.apps.gsa.nga.shared.v.d.ec r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.m132416a(r3)
            if (r3 != 0) goto L_0x0010
            com.google.android.apps.gsa.nga.shared.v.d.ec r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.UNKNOWN
        L_0x0010:
            com.google.android.apps.gsa.nga.shared.v.d.ec r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.SESSION_ID
            if (r3 == r4) goto L_0x084b
            int r3 = r2.f226097b
            com.google.android.apps.gsa.nga.shared.v.d.ec r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.m132416a(r3)
            if (r3 != 0) goto L_0x001e
            com.google.android.apps.gsa.nga.shared.v.d.ec r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.UNKNOWN
        L_0x001e:
            com.google.android.apps.gsa.nga.shared.v.d.ec r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.SPEECH_EVENT
            r5 = 3
            r6 = 13
            if (r3 != r4) goto L_0x004e
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = r2.f226099d
            if (r3 != 0) goto L_0x002b
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
        L_0x002b:
            int r4 = r3.f225979a
            if (r4 != r6) goto L_0x0034
            java.lang.Object r3 = r3.f225980b
            com.google.android.apps.gsa.nga.shared.v.d.gz r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz) r3
            goto L_0x0036
        L_0x0034:
            com.google.android.apps.gsa.nga.shared.v.d.gz r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz.f226343j
        L_0x0036:
            int r3 = r3.f226346b
            int r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82963gy.m132440a(r3)
            if (r3 != 0) goto L_0x003f
            goto L_0x004e
        L_0x003f:
            if (r3 != r5) goto L_0x004e
            com.google.android.apps.gsa.nga.shared.v.io r3 = r2.f226102g
            if (r3 != 0) goto L_0x0047
            com.google.android.apps.gsa.nga.shared.v.io r3 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
        L_0x0047:
            com.google.android.apps.gsa.nga.engine.x.a.bc r3 = r1.m127824o(r3)
            if (r3 != 0) goto L_0x004e
            return
        L_0x004e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r4 = f218665e
            monitor-enter(r4)
            com.google.android.libraries.f.a r7 = r1.f218666a     // Catch:{ all -> 0x0847 }
            long r14 = r7.mo26871c()     // Catch:{ all -> 0x0847 }
            long r7 = r1.f218678o     // Catch:{ all -> 0x0847 }
            long r7 = r14 - r7
            r9 = 5000(0x1388, double:2.4703E-320)
            r12 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x006b
            monitor-exit(r4)     // Catch:{ all -> 0x0847 }
            r5 = 0
            goto L_0x00fb
        L_0x006b:
            r1.f218678o = r14     // Catch:{ all -> 0x0847 }
            java.util.List r7 = r1.f218672i     // Catch:{ all -> 0x0847 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0847 }
        L_0x0073:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0847 }
            if (r8 == 0) goto L_0x00bc
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0847 }
            r13 = r8
            com.google.android.apps.gsa.nga.engine.x.a.bc r13 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r13     // Catch:{ all -> 0x0847 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r8 = r13.f218660j     // Catch:{ all -> 0x0847 }
            int r9 = r8.f218851a     // Catch:{ all -> 0x0847 }
            r9 = r9 & 64
            if (r9 == 0) goto L_0x00a5
            com.google.android.apps.gsa.nga.shared.v.d.ee r8 = r8.f218866p     // Catch:{ all -> 0x0847 }
            if (r8 != 0) goto L_0x008e
            com.google.android.apps.gsa.nga.shared.v.d.ee r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee.f226094j     // Catch:{ all -> 0x0847 }
        L_0x008e:
            long r10 = r8.f226103h     // Catch:{ all -> 0x0847 }
            r16 = 20000(0x4e20, double:9.8813E-320)
            r8 = r14
            r6 = r13
            r5 = 0
            r12 = r16
            boolean r8 = m127820k(r8, r10, r12)     // Catch:{ all -> 0x0847 }
            if (r8 != 0) goto L_0x00a0
            r3.add(r6)     // Catch:{ all -> 0x0847 }
        L_0x00a0:
            r5 = 3
            r6 = 13
            r12 = 0
            goto L_0x0073
        L_0x00a5:
            r6 = r13
            r5 = 0
            long r10 = r6.f218651a     // Catch:{ all -> 0x0847 }
            com.google.android.apps.gsa.shared.util.v.g r8 = r1.f218669f     // Catch:{ all -> 0x0847 }
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251541kk     // Catch:{ all -> 0x0847 }
            long r12 = r8.mo85399d(r9)     // Catch:{ all -> 0x0847 }
            r8 = r14
            boolean r8 = m127820k(r8, r10, r12)     // Catch:{ all -> 0x0847 }
            if (r8 != 0) goto L_0x00a0
            r3.add(r6)     // Catch:{ all -> 0x0847 }
            goto L_0x00a0
        L_0x00bc:
            r5 = 0
            java.util.List r6 = r1.f218672i     // Catch:{ all -> 0x0847 }
            r6.removeAll(r3)     // Catch:{ all -> 0x0847 }
            java.util.List r6 = r1.f218680q     // Catch:{ all -> 0x0847 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0847 }
        L_0x00c8:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0847 }
            if (r7 == 0) goto L_0x00e4
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0847 }
            com.google.android.apps.gsa.nga.shared.v.d.ee r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee) r7     // Catch:{ all -> 0x0847 }
            long r10 = r7.f226103h     // Catch:{ all -> 0x0847 }
            r12 = 60000(0xea60, double:2.9644E-319)
            r8 = r14
            boolean r7 = m127820k(r8, r10, r12)     // Catch:{ all -> 0x0847 }
            if (r7 != 0) goto L_0x00c8
            r6.remove()     // Catch:{ all -> 0x0847 }
            goto L_0x00c8
        L_0x00e4:
            monitor-exit(r4)     // Catch:{ all -> 0x0847 }
            int r4 = r3.size()
            r12 = 0
        L_0x00ea:
            if (r12 >= r4) goto L_0x00fb
            java.lang.Object r6 = r3.get(r12)
            com.google.android.apps.gsa.nga.engine.x.a.bc r6 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r6
            r1.m127828s(r6)
            m127831v(r6)
            int r12 = r12 + 1
            goto L_0x00ea
        L_0x00fb:
            com.google.android.apps.gsa.nga.shared.aa.k.b.c r3 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c.UNKNOWN
            int r3 = r2.f226097b
            com.google.android.apps.gsa.nga.shared.v.d.ec r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.m132416a(r3)
            if (r3 != 0) goto L_0x0107
            com.google.android.apps.gsa.nga.shared.v.d.ec r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.UNKNOWN
        L_0x0107:
            int r3 = r3.ordinal()
            r4 = 4
            r6 = 8
            r7 = 0
            r8 = 6
            r12 = 1
            switch(r3) {
                case 1: goto L_0x07ae;
                case 4: goto L_0x0793;
                case 6: goto L_0x0778;
                case 8: goto L_0x05ee;
                case 11: goto L_0x05d3;
                case 14: goto L_0x0534;
                case 16: goto L_0x04f5;
                case 24: goto L_0x04d1;
                case 26: goto L_0x04b6;
                case 29: goto L_0x045e;
                case 33: goto L_0x041e;
                case 37: goto L_0x0403;
                case 38: goto L_0x03e5;
                case 43: goto L_0x039a;
                case 44: goto L_0x037f;
                case 46: goto L_0x033a;
                case 54: goto L_0x031f;
                case 56: goto L_0x0304;
                case 58: goto L_0x02e9;
                case 60: goto L_0x029d;
                case 68: goto L_0x0245;
                case 76: goto L_0x022a;
                case 77: goto L_0x020f;
                case 78: goto L_0x01f4;
                case 79: goto L_0x01d9;
                case 81: goto L_0x01be;
                case 82: goto L_0x01a3;
                case 93: goto L_0x0188;
                case 100: goto L_0x016d;
                case 106: goto L_0x0152;
                case 107: goto L_0x0137;
                case 108: goto L_0x011c;
                default: goto L_0x0114;
            }
        L_0x0114:
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = r2.f226099d
            if (r3 != 0) goto L_0x0812
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
            goto L_0x0812
        L_0x011c:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0133 }
            if (r4 != 0) goto L_0x0125
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0133 }
        L_0x0125:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.nga.engine.x.a.af r5 = new com.google.android.apps.gsa.nga.engine.x.a.af     // Catch:{ all -> 0x0133 }
            r5.<init>(r2)     // Catch:{ all -> 0x0133 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0133 }
            monitor-exit(r3)     // Catch:{ all -> 0x0133 }
            return
        L_0x0133:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0133 }
            throw r2
        L_0x0137:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x014e }
            if (r4 != 0) goto L_0x0140
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x014e }
        L_0x0140:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x014e }
            com.google.android.apps.gsa.nga.engine.x.a.ad r5 = new com.google.android.apps.gsa.nga.engine.x.a.ad     // Catch:{ all -> 0x014e }
            r5.<init>(r2)     // Catch:{ all -> 0x014e }
            r4.mo74216a(r5)     // Catch:{ all -> 0x014e }
            monitor-exit(r3)     // Catch:{ all -> 0x014e }
            return
        L_0x014e:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x014e }
            throw r2
        L_0x0152:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0169 }
            if (r4 != 0) goto L_0x015b
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0169 }
        L_0x015b:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0169 }
            com.google.android.apps.gsa.nga.engine.x.a.ae r5 = new com.google.android.apps.gsa.nga.engine.x.a.ae     // Catch:{ all -> 0x0169 }
            r5.<init>(r2)     // Catch:{ all -> 0x0169 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0169 }
            monitor-exit(r3)     // Catch:{ all -> 0x0169 }
            return
        L_0x0169:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0169 }
            throw r2
        L_0x016d:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0184 }
            if (r4 != 0) goto L_0x0176
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0184 }
        L_0x0176:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0184 }
            com.google.android.apps.gsa.nga.engine.x.a.ab r5 = new com.google.android.apps.gsa.nga.engine.x.a.ab     // Catch:{ all -> 0x0184 }
            r5.<init>(r2)     // Catch:{ all -> 0x0184 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0184 }
            monitor-exit(r3)     // Catch:{ all -> 0x0184 }
            return
        L_0x0184:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0184 }
            throw r2
        L_0x0188:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x019f }
            if (r4 != 0) goto L_0x0191
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x019f }
        L_0x0191:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x019f }
            com.google.android.apps.gsa.nga.engine.x.a.aa r5 = new com.google.android.apps.gsa.nga.engine.x.a.aa     // Catch:{ all -> 0x019f }
            r5.<init>(r2)     // Catch:{ all -> 0x019f }
            r4.mo74216a(r5)     // Catch:{ all -> 0x019f }
            monitor-exit(r3)     // Catch:{ all -> 0x019f }
            return
        L_0x019f:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x019f }
            throw r2
        L_0x01a3:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x01ba }
            if (r4 != 0) goto L_0x01ac
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x01ba }
        L_0x01ac:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x01ba }
            com.google.android.apps.gsa.nga.engine.x.a.ac r5 = new com.google.android.apps.gsa.nga.engine.x.a.ac     // Catch:{ all -> 0x01ba }
            r5.<init>(r2)     // Catch:{ all -> 0x01ba }
            r4.mo74216a(r5)     // Catch:{ all -> 0x01ba }
            monitor-exit(r3)     // Catch:{ all -> 0x01ba }
            return
        L_0x01ba:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x01ba }
            throw r2
        L_0x01be:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x01d5 }
            if (r4 != 0) goto L_0x01c7
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x01d5 }
        L_0x01c7:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x01d5 }
            com.google.android.apps.gsa.nga.engine.x.a.z r5 = new com.google.android.apps.gsa.nga.engine.x.a.z     // Catch:{ all -> 0x01d5 }
            r5.<init>(r2)     // Catch:{ all -> 0x01d5 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x01d5 }
            monitor-exit(r3)     // Catch:{ all -> 0x01d5 }
            return
        L_0x01d5:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x01d5 }
            throw r2
        L_0x01d9:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x01f0 }
            if (r4 != 0) goto L_0x01e2
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x01f0 }
        L_0x01e2:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x01f0 }
            com.google.android.apps.gsa.nga.engine.x.a.x r5 = new com.google.android.apps.gsa.nga.engine.x.a.x     // Catch:{ all -> 0x01f0 }
            r5.<init>(r2)     // Catch:{ all -> 0x01f0 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x01f0 }
            monitor-exit(r3)     // Catch:{ all -> 0x01f0 }
            return
        L_0x01f0:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x01f0 }
            throw r2
        L_0x01f4:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x020b }
            if (r4 != 0) goto L_0x01fd
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x020b }
        L_0x01fd:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x020b }
            com.google.android.apps.gsa.nga.engine.x.a.am r5 = new com.google.android.apps.gsa.nga.engine.x.a.am     // Catch:{ all -> 0x020b }
            r5.<init>(r2)     // Catch:{ all -> 0x020b }
            r4.mo74216a(r5)     // Catch:{ all -> 0x020b }
            monitor-exit(r3)     // Catch:{ all -> 0x020b }
            return
        L_0x020b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x020b }
            throw r2
        L_0x020f:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0226 }
            if (r4 != 0) goto L_0x0218
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0226 }
        L_0x0218:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0226 }
            com.google.android.apps.gsa.nga.engine.x.a.y r5 = new com.google.android.apps.gsa.nga.engine.x.a.y     // Catch:{ all -> 0x0226 }
            r5.<init>(r2)     // Catch:{ all -> 0x0226 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0226 }
            monitor-exit(r3)     // Catch:{ all -> 0x0226 }
            return
        L_0x0226:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0226 }
            throw r2
        L_0x022a:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0241 }
            if (r4 != 0) goto L_0x0233
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0241 }
        L_0x0233:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0241 }
            com.google.android.apps.gsa.nga.engine.x.a.v r5 = new com.google.android.apps.gsa.nga.engine.x.a.v     // Catch:{ all -> 0x0241 }
            r5.<init>(r2)     // Catch:{ all -> 0x0241 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0241 }
            monitor-exit(r3)     // Catch:{ all -> 0x0241 }
            return
        L_0x0241:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0241 }
            throw r2
        L_0x0245:
            com.google.android.apps.gsa.nga.shared.v.d.ea r2 = r2.f226099d
            if (r2 != 0) goto L_0x024b
            com.google.android.apps.gsa.nga.shared.v.d.ea r2 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
        L_0x024b:
            int r3 = r2.f225979a
            r4 = 59
            if (r3 != r4) goto L_0x0256
            java.lang.Object r2 = r2.f225980b
            com.google.android.apps.gsa.nga.shared.v.d.hj r2 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82975hj) r2
            goto L_0x0258
        L_0x0256:
            com.google.android.apps.gsa.nga.shared.v.d.hj r2 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82975hj.f226373c
        L_0x0258:
            int r3 = r2.f226375a
            if (r3 != r12) goto L_0x0846
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            java.lang.String r4 = ""
            int r5 = r2.f226375a     // Catch:{ all -> 0x0299 }
            if (r5 != r12) goto L_0x026a
            java.lang.Object r2 = r2.f226376b     // Catch:{ all -> 0x0299 }
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0299 }
        L_0x026a:
            r1.f218679p = r4     // Catch:{ all -> 0x0299 }
            java.util.List r2 = r1.f218672i     // Catch:{ all -> 0x0299 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0299 }
            if (r2 == 0) goto L_0x0276
            monitor-exit(r3)     // Catch:{ all -> 0x0299 }
            return
        L_0x0276:
            java.util.List r2 = r1.f218672i     // Catch:{ all -> 0x0299 }
            java.lang.Object r2 = com.google.common.p4522b.C58557jl.m90131l(r2)     // Catch:{ all -> 0x0299 }
            com.google.android.apps.gsa.nga.engine.x.a.bc r2 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r2     // Catch:{ all -> 0x0299 }
            boolean r4 = r2.f218654d     // Catch:{ all -> 0x0299 }
            if (r4 != 0) goto L_0x0297
            boolean r4 = r2.f218656f     // Catch:{ all -> 0x0299 }
            if (r4 != 0) goto L_0x0297
            com.google.android.apps.gsa.nga.engine.x.a.dj r4 = r2.f218660j     // Catch:{ all -> 0x0299 }
            com.google.protobuf.cq r4 = r4.f218863m     // Catch:{ all -> 0x0299 }
            int r4 = r4.size()     // Catch:{ all -> 0x0299 }
            if (r4 <= 0) goto L_0x0291
            goto L_0x0297
        L_0x0291:
            java.lang.String r4 = r1.f218679p     // Catch:{ all -> 0x0299 }
            r2.f218662l = r4     // Catch:{ all -> 0x0299 }
            monitor-exit(r3)     // Catch:{ all -> 0x0299 }
            return
        L_0x0297:
            monitor-exit(r3)     // Catch:{ all -> 0x0299 }
            return
        L_0x0299:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0299 }
            throw r2
        L_0x029d:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x02e5 }
            if (r4 != 0) goto L_0x02a6
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x02e5 }
        L_0x02a6:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x02e5 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r6 = r4.f218660j     // Catch:{ all -> 0x02e5 }
            com.google.protobuf.bn r6 = r6.toBuilder()     // Catch:{ all -> 0x02e5 }
            com.google.android.apps.gsa.nga.engine.x.a.di r6 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79813di) r6     // Catch:{ all -> 0x02e5 }
            r6.copyOnWrite()     // Catch:{ all -> 0x02e5 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x02e5 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r7 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79814dj) r7     // Catch:{ all -> 0x02e5 }
            r19.getClass()     // Catch:{ all -> 0x02e5 }
            r7.f218866p = r2     // Catch:{ all -> 0x02e5 }
            int r2 = r7.f218851a     // Catch:{ all -> 0x02e5 }
            r2 = r2 | 64
            r7.f218851a = r2     // Catch:{ all -> 0x02e5 }
            com.google.protobuf.bv r2 = r6.build()     // Catch:{ all -> 0x02e5 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r2 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79814dj) r2     // Catch:{ all -> 0x02e5 }
            r4.f218660j = r2     // Catch:{ all -> 0x02e5 }
            boolean r2 = m127832w(r4)     // Catch:{ all -> 0x02e5 }
            if (r2 == 0) goto L_0x02db
            com.google.android.apps.gsa.nga.engine.x.a.dj r2 = r4.f218660j     // Catch:{ all -> 0x02e5 }
            boolean r2 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127879q(r2)     // Catch:{ all -> 0x02e5 }
            if (r2 != 0) goto L_0x02db
            r12 = 0
        L_0x02db:
            monitor-exit(r3)     // Catch:{ all -> 0x02e5 }
            r1.m127830u(r4)
            if (r12 == 0) goto L_0x0846
            r1.m127828s(r4)
            return
        L_0x02e5:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x02e5 }
            throw r2
        L_0x02e9:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0300 }
            if (r4 != 0) goto L_0x02f2
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0300 }
        L_0x02f2:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0300 }
            com.google.android.apps.gsa.nga.engine.x.a.aj r5 = new com.google.android.apps.gsa.nga.engine.x.a.aj     // Catch:{ all -> 0x0300 }
            r5.<init>(r2)     // Catch:{ all -> 0x0300 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0300 }
            monitor-exit(r3)     // Catch:{ all -> 0x0300 }
            return
        L_0x0300:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0300 }
            throw r2
        L_0x0304:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x031b }
            if (r4 != 0) goto L_0x030d
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x031b }
        L_0x030d:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x031b }
            com.google.android.apps.gsa.nga.engine.x.a.ap r5 = new com.google.android.apps.gsa.nga.engine.x.a.ap     // Catch:{ all -> 0x031b }
            r5.<init>(r2)     // Catch:{ all -> 0x031b }
            r4.mo74216a(r5)     // Catch:{ all -> 0x031b }
            monitor-exit(r3)     // Catch:{ all -> 0x031b }
            return
        L_0x031b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x031b }
            throw r2
        L_0x031f:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0336 }
            if (r4 != 0) goto L_0x0328
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0336 }
        L_0x0328:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0336 }
            com.google.android.apps.gsa.nga.engine.x.a.aq r5 = new com.google.android.apps.gsa.nga.engine.x.a.aq     // Catch:{ all -> 0x0336 }
            r5.<init>(r2)     // Catch:{ all -> 0x0336 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0336 }
            monitor-exit(r3)     // Catch:{ all -> 0x0336 }
            return
        L_0x0336:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0336 }
            throw r2
        L_0x033a:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x037b }
            if (r4 != 0) goto L_0x0343
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x037b }
        L_0x0343:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127824o(r4)     // Catch:{ all -> 0x037b }
            if (r4 != 0) goto L_0x0367
            com.google.common.f.e r2 = f218664d     // Catch:{ all -> 0x037b }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x037b }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x037b }
            java.lang.String r5 = "ClearcutEventAggregator"
            r2.mo56378ag(r4, r5)     // Catch:{ all -> 0x037b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x037b }
            r4 = 3987(0xf93, float:5.587E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x037b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x037b }
            java.lang.String r4 = "Params update for a missing session"
            r2.mo56386p(r4)     // Catch:{ all -> 0x037b }
            monitor-exit(r3)     // Catch:{ all -> 0x037b }
            return
        L_0x0367:
            com.google.android.apps.gsa.nga.engine.x.a.g r5 = new com.google.android.apps.gsa.nga.engine.x.a.g     // Catch:{ all -> 0x037b }
            r5.<init>(r2)     // Catch:{ all -> 0x037b }
            r4.mo74216a(r5)     // Catch:{ all -> 0x037b }
            com.google.android.apps.gsa.nga.engine.x.a.dj r2 = r4.f218660j     // Catch:{ all -> 0x037b }
            int r2 = r2.f218851a     // Catch:{ all -> 0x037b }
            r2 = r2 & r12
            if (r2 == 0) goto L_0x0379
            r1.m127828s(r4)     // Catch:{ all -> 0x037b }
        L_0x0379:
            monitor-exit(r3)     // Catch:{ all -> 0x037b }
            return
        L_0x037b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x037b }
            throw r2
        L_0x037f:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0396 }
            if (r4 != 0) goto L_0x0388
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0396 }
        L_0x0388:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0396 }
            com.google.android.apps.gsa.nga.engine.x.a.t r5 = new com.google.android.apps.gsa.nga.engine.x.a.t     // Catch:{ all -> 0x0396 }
            r5.<init>(r2)     // Catch:{ all -> 0x0396 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0396 }
            monitor-exit(r3)     // Catch:{ all -> 0x0396 }
            return
        L_0x0396:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0396 }
            throw r2
        L_0x039a:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x03e1 }
            if (r4 != 0) goto L_0x03a3
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x03e1 }
        L_0x03a3:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127824o(r4)     // Catch:{ all -> 0x03e1 }
            if (r4 != 0) goto L_0x03c7
            com.google.common.f.e r2 = f218664d     // Catch:{ all -> 0x03e1 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x03e1 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x03e1 }
            java.lang.String r5 = "ClearcutEventAggregator"
            r2.mo56378ag(r4, r5)     // Catch:{ all -> 0x03e1 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x03e1 }
            r4 = 3982(0xf8e, float:5.58E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x03e1 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x03e1 }
            java.lang.String r4 = "Execution done, but no session"
            r2.mo56386p(r4)     // Catch:{ all -> 0x03e1 }
            monitor-exit(r3)     // Catch:{ all -> 0x03e1 }
            return
        L_0x03c7:
            monitor-exit(r3)     // Catch:{ all -> 0x03e1 }
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x03dd }
            if (r4 != 0) goto L_0x03cf
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x03dd }
        L_0x03cf:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x03dd }
            com.google.android.apps.gsa.nga.engine.x.a.aw r5 = new com.google.android.apps.gsa.nga.engine.x.a.aw     // Catch:{ all -> 0x03dd }
            r5.<init>(r2)     // Catch:{ all -> 0x03dd }
            r4.mo74216a(r5)     // Catch:{ all -> 0x03dd }
            monitor-exit(r3)     // Catch:{ all -> 0x03dd }
            return
        L_0x03dd:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x03dd }
            throw r2
        L_0x03e1:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x03e1 }
            throw r2
        L_0x03e5:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x03ff }
            if (r4 != 0) goto L_0x03ee
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x03ff }
        L_0x03ee:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x03ff }
            com.google.android.apps.gsa.nga.engine.x.a.h r5 = new com.google.android.apps.gsa.nga.engine.x.a.h     // Catch:{ all -> 0x03ff }
            r5.<init>(r2)     // Catch:{ all -> 0x03ff }
            r4.mo74216a(r5)     // Catch:{ all -> 0x03ff }
            monitor-exit(r3)     // Catch:{ all -> 0x03ff }
            r1.m127830u(r4)
            return
        L_0x03ff:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x03ff }
            throw r2
        L_0x0403:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x041a }
            if (r4 != 0) goto L_0x040c
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x041a }
        L_0x040c:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x041a }
            com.google.android.apps.gsa.nga.engine.x.a.u r5 = new com.google.android.apps.gsa.nga.engine.x.a.u     // Catch:{ all -> 0x041a }
            r5.<init>(r2)     // Catch:{ all -> 0x041a }
            r4.mo74216a(r5)     // Catch:{ all -> 0x041a }
            monitor-exit(r3)     // Catch:{ all -> 0x041a }
            return
        L_0x041a:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x041a }
            throw r2
        L_0x041e:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x045a }
            if (r4 != 0) goto L_0x0427
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x045a }
        L_0x0427:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x045a }
            com.google.android.apps.gsa.nga.engine.x.a.dj r5 = r4.f218660j     // Catch:{ all -> 0x045a }
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x045a }
            com.google.android.apps.gsa.nga.engine.x.a.di r5 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79813di) r5     // Catch:{ all -> 0x045a }
            r5.copyOnWrite()     // Catch:{ all -> 0x045a }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x045a }
            com.google.android.apps.gsa.nga.engine.x.a.dj r6 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79814dj) r6     // Catch:{ all -> 0x045a }
            r19.getClass()     // Catch:{ all -> 0x045a }
            com.google.protobuf.cq r7 = r6.f218837B     // Catch:{ all -> 0x045a }
            boolean r8 = r7.mo58948c()     // Catch:{ all -> 0x045a }
            if (r8 != 0) goto L_0x044b
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)     // Catch:{ all -> 0x045a }
            r6.f218837B = r7     // Catch:{ all -> 0x045a }
        L_0x044b:
            com.google.protobuf.cq r6 = r6.f218837B     // Catch:{ all -> 0x045a }
            r6.add(r2)     // Catch:{ all -> 0x045a }
            com.google.protobuf.bv r2 = r5.build()     // Catch:{ all -> 0x045a }
            com.google.android.apps.gsa.nga.engine.x.a.dj r2 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79814dj) r2     // Catch:{ all -> 0x045a }
            r4.f218660j = r2     // Catch:{ all -> 0x045a }
            monitor-exit(r3)     // Catch:{ all -> 0x045a }
            return
        L_0x045a:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x045a }
            throw r2
        L_0x045e:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r6 = r2.f226102g     // Catch:{ all -> 0x04b2 }
            if (r6 != 0) goto L_0x0467
            com.google.android.apps.gsa.nga.shared.v.io r6 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x04b2 }
        L_0x0467:
            com.google.android.apps.gsa.nga.engine.x.a.bc r6 = r1.m127822m(r6)     // Catch:{ all -> 0x04b2 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r7 = r6.f218660j     // Catch:{ all -> 0x04b2 }
            com.google.protobuf.bn r7 = r7.toBuilder()     // Catch:{ all -> 0x04b2 }
            com.google.android.apps.gsa.nga.engine.x.a.di r7 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79813di) r7     // Catch:{ all -> 0x04b2 }
            r7.copyOnWrite()     // Catch:{ all -> 0x04b2 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x04b2 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r8 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79814dj) r8     // Catch:{ all -> 0x04b2 }
            r19.getClass()     // Catch:{ all -> 0x04b2 }
            r8.mo74261a()     // Catch:{ all -> 0x04b2 }
            com.google.protobuf.cq r8 = r8.f218854d     // Catch:{ all -> 0x04b2 }
            r8.add(r2)     // Catch:{ all -> 0x04b2 }
            com.google.android.apps.gsa.nga.shared.v.io r8 = r2.f226102g     // Catch:{ all -> 0x04b2 }
            if (r8 != 0) goto L_0x048b
            com.google.android.apps.gsa.nga.shared.v.io r8 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x04b2 }
        L_0x048b:
            java.lang.String r8 = r8.f227135b     // Catch:{ all -> 0x04b2 }
            r7.copyOnWrite()     // Catch:{ all -> 0x04b2 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x04b2 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r9 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79814dj) r9     // Catch:{ all -> 0x04b2 }
            r8.getClass()     // Catch:{ all -> 0x04b2 }
            int r10 = r9.f218851a     // Catch:{ all -> 0x04b2 }
            r4 = r4 | r10
            r9.f218851a = r4     // Catch:{ all -> 0x04b2 }
            r9.f218855e = r8     // Catch:{ all -> 0x04b2 }
            com.google.protobuf.bv r4 = r7.build()     // Catch:{ all -> 0x04b2 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r4 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79814dj) r4     // Catch:{ all -> 0x04b2 }
            r6.f218660j = r4     // Catch:{ all -> 0x04b2 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r4 = r6.f218660j     // Catch:{ all -> 0x04b2 }
            boolean r2 = m127821l(r2, r4)     // Catch:{ all -> 0x04b2 }
            if (r2 == 0) goto L_0x04b0
            r6.f218661k = r5     // Catch:{ all -> 0x04b2 }
        L_0x04b0:
            monitor-exit(r3)     // Catch:{ all -> 0x04b2 }
            return
        L_0x04b2:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x04b2 }
            throw r2
        L_0x04b6:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x04cd }
            if (r4 != 0) goto L_0x04bf
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x04cd }
        L_0x04bf:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x04cd }
            com.google.android.apps.gsa.nga.engine.x.a.an r5 = new com.google.android.apps.gsa.nga.engine.x.a.an     // Catch:{ all -> 0x04cd }
            r5.<init>(r2)     // Catch:{ all -> 0x04cd }
            r4.mo74216a(r5)     // Catch:{ all -> 0x04cd }
            monitor-exit(r3)     // Catch:{ all -> 0x04cd }
            return
        L_0x04cd:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x04cd }
            throw r2
        L_0x04d1:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            java.util.List r4 = r1.f218672i     // Catch:{ all -> 0x04f1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x04f1 }
        L_0x04da:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04f1 }
            if (r5 == 0) goto L_0x04ef
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04f1 }
            com.google.android.apps.gsa.nga.engine.x.a.bc r5 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r5     // Catch:{ all -> 0x04f1 }
            com.google.android.apps.gsa.nga.engine.x.a.d r6 = new com.google.android.apps.gsa.nga.engine.x.a.d     // Catch:{ all -> 0x04f1 }
            r6.<init>(r2)     // Catch:{ all -> 0x04f1 }
            r5.mo74216a(r6)     // Catch:{ all -> 0x04f1 }
            goto L_0x04da
        L_0x04ef:
            monitor-exit(r3)     // Catch:{ all -> 0x04f1 }
            return
        L_0x04f1:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x04f1 }
            throw r2
        L_0x04f5:
            com.google.android.apps.gsa.shared.util.v.g r3 = r1.f218669f
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251290fy
            boolean r3 = r3.mo85405j(r4)
            if (r3 == 0) goto L_0x0846
            com.google.android.apps.gsa.nga.shared.v.io r3 = r2.f226102g
            if (r3 != 0) goto L_0x0505
            com.google.android.apps.gsa.nga.shared.v.io r3 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
        L_0x0505:
            java.lang.String r3 = r3.f227136c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0846
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = r2.f226099d
            if (r3 != 0) goto L_0x0513
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
        L_0x0513:
            int r3 = r3.f225979a
            r4 = 15
            if (r3 != r4) goto L_0x0846
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0530 }
            if (r4 != 0) goto L_0x0522
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0530 }
        L_0x0522:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0530 }
            com.google.android.apps.gsa.nga.engine.x.a.ag r5 = new com.google.android.apps.gsa.nga.engine.x.a.ag     // Catch:{ all -> 0x0530 }
            r5.<init>(r2)     // Catch:{ all -> 0x0530 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0530 }
            monitor-exit(r3)     // Catch:{ all -> 0x0530 }
            return
        L_0x0530:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0530 }
            throw r2
        L_0x0534:
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = r2.f226099d
            if (r3 != 0) goto L_0x053a
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
        L_0x053a:
            int r4 = r3.f225979a
            r5 = 13
            if (r4 != r5) goto L_0x0545
            java.lang.Object r3 = r3.f225980b
            com.google.android.apps.gsa.nga.shared.v.d.gz r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz) r3
            goto L_0x0547
        L_0x0545:
            com.google.android.apps.gsa.nga.shared.v.d.gz r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz.f226343j
        L_0x0547:
            java.lang.Object r4 = f218665e
            monitor-enter(r4)
            com.google.android.apps.gsa.nga.shared.v.io r5 = r2.f226102g     // Catch:{ all -> 0x05cf }
            if (r5 != 0) goto L_0x0550
            com.google.android.apps.gsa.nga.shared.v.io r5 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x05cf }
        L_0x0550:
            java.lang.String r5 = r5.f227136c     // Catch:{ all -> 0x05cf }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x05cf }
            if (r5 == 0) goto L_0x0584
            int r5 = r3.f226346b     // Catch:{ all -> 0x05cf }
            int r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82963gy.m132440a(r5)     // Catch:{ all -> 0x05cf }
            if (r5 != 0) goto L_0x0561
            goto L_0x0584
        L_0x0561:
            if (r5 != r6) goto L_0x0584
            java.util.List r3 = r1.f218672i     // Catch:{ all -> 0x05cf }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05cf }
        L_0x0569:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x05cf }
            if (r5 == 0) goto L_0x0582
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x05cf }
            com.google.android.apps.gsa.nga.engine.x.a.bc r5 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r5     // Catch:{ all -> 0x05cf }
            boolean r6 = r5.f218657g     // Catch:{ all -> 0x05cf }
            if (r6 != 0) goto L_0x0569
            com.google.android.apps.gsa.nga.engine.x.a.ar r6 = new com.google.android.apps.gsa.nga.engine.x.a.ar     // Catch:{ all -> 0x05cf }
            r6.<init>(r2)     // Catch:{ all -> 0x05cf }
            r5.mo74216a(r6)     // Catch:{ all -> 0x05cf }
            goto L_0x0569
        L_0x0582:
            monitor-exit(r4)     // Catch:{ all -> 0x05cf }
            return
        L_0x0584:
            com.google.android.apps.gsa.nga.shared.v.io r5 = r2.f226102g     // Catch:{ all -> 0x05cf }
            if (r5 != 0) goto L_0x058a
            com.google.android.apps.gsa.nga.shared.v.io r5 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x05cf }
        L_0x058a:
            com.google.android.apps.gsa.nga.engine.x.a.bc r5 = r1.m127822m(r5)     // Catch:{ all -> 0x05cf }
            com.google.android.apps.gsa.nga.engine.x.a.at r6 = new com.google.android.apps.gsa.nga.engine.x.a.at     // Catch:{ all -> 0x05cf }
            r6.<init>(r2)     // Catch:{ all -> 0x05cf }
            r5.mo74216a(r6)     // Catch:{ all -> 0x05cf }
            java.lang.String r6 = r5.f218658h     // Catch:{ all -> 0x05cf }
            if (r6 == 0) goto L_0x05af
            int r7 = r3.f226346b     // Catch:{ all -> 0x05cf }
            int r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82963gy.m132440a(r7)     // Catch:{ all -> 0x05cf }
            if (r7 != 0) goto L_0x05a3
            goto L_0x05af
        L_0x05a3:
            r9 = 9
            if (r7 != r9) goto L_0x05af
            com.google.android.apps.gsa.shared.logger.b.g r2 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127874h(r3)     // Catch:{ all -> 0x05cf }
            r1.m127829t(r2, r6)     // Catch:{ all -> 0x05cf }
            goto L_0x05cd
        L_0x05af:
            int r7 = r3.f226346b     // Catch:{ all -> 0x05cf }
            int r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82963gy.m132440a(r7)     // Catch:{ all -> 0x05cf }
            if (r7 != 0) goto L_0x05b8
            goto L_0x05cd
        L_0x05b8:
            if (r7 != r8) goto L_0x05cd
            com.google.android.apps.gsa.nga.engine.x.a.au r7 = new com.google.android.apps.gsa.nga.engine.x.a.au     // Catch:{ all -> 0x05cf }
            r7.<init>(r3)     // Catch:{ all -> 0x05cf }
            r5.mo74216a(r7)     // Catch:{ all -> 0x05cf }
            if (r6 == 0) goto L_0x05cd
            com.google.android.apps.gsa.shared.logger.b.g r2 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127873g(r19)     // Catch:{ all -> 0x05cf }
            if (r2 == 0) goto L_0x05cd
            r1.m127829t(r2, r6)     // Catch:{ all -> 0x05cf }
        L_0x05cd:
            monitor-exit(r4)     // Catch:{ all -> 0x05cf }
            return
        L_0x05cf:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x05cf }
            throw r2
        L_0x05d3:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x05ea }
            if (r4 != 0) goto L_0x05dc
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x05ea }
        L_0x05dc:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x05ea }
            com.google.android.apps.gsa.nga.engine.x.a.ao r5 = new com.google.android.apps.gsa.nga.engine.x.a.ao     // Catch:{ all -> 0x05ea }
            r5.<init>(r2)     // Catch:{ all -> 0x05ea }
            r4.mo74216a(r5)     // Catch:{ all -> 0x05ea }
            monitor-exit(r3)     // Catch:{ all -> 0x05ea }
            return
        L_0x05ea:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x05ea }
            throw r2
        L_0x05ee:
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = r2.f226099d
            if (r3 != 0) goto L_0x05f4
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
        L_0x05f4:
            int r4 = r3.f225979a
            if (r4 != r8) goto L_0x05fd
            java.lang.Object r3 = r3.f225980b
            com.google.android.apps.gsa.nga.shared.v.d.g r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82938g) r3
            goto L_0x05ff
        L_0x05fd:
            com.google.android.apps.gsa.nga.shared.v.d.g r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82938g.f226273j
        L_0x05ff:
            java.lang.Object r4 = f218665e
            monitor-enter(r4)
            java.lang.String r5 = r3.f226280f     // Catch:{ all -> 0x0774 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0774 }
            if (r5 == 0) goto L_0x060c
            r5 = r7
            goto L_0x0612
        L_0x060c:
            java.lang.String r5 = r3.f226280f     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.engine.x.a.bc r5 = r1.m127823n(r5)     // Catch:{ all -> 0x0774 }
        L_0x0612:
            java.lang.String r8 = r3.f226281g     // Catch:{ all -> 0x0774 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0774 }
            if (r8 == 0) goto L_0x061b
            goto L_0x0621
        L_0x061b:
            java.lang.String r7 = r3.f226281g     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.engine.x.a.bc r7 = r1.m127823n(r7)     // Catch:{ all -> 0x0774 }
        L_0x0621:
            if (r7 == 0) goto L_0x062b
            com.google.android.apps.gsa.nga.engine.x.a.ah r8 = new com.google.android.apps.gsa.nga.engine.x.a.ah     // Catch:{ all -> 0x0774 }
            r8.<init>(r2)     // Catch:{ all -> 0x0774 }
            r7.mo74216a(r8)     // Catch:{ all -> 0x0774 }
        L_0x062b:
            java.lang.String r8 = r3.f226281g     // Catch:{ all -> 0x0774 }
            java.lang.String r9 = r3.f226280f     // Catch:{ all -> 0x0774 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0774 }
            if (r8 == 0) goto L_0x0659
            int r2 = r3.f226275a     // Catch:{ all -> 0x0774 }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0657
            com.google.common.f.e r2 = f218664d     // Catch:{ all -> 0x0774 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0774 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0774 }
            java.lang.String r5 = "ClearcutEventAggregator"
            r2.mo56378ag(r3, r5)     // Catch:{ all -> 0x0774 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0774 }
            r3 = 3986(0xf92, float:5.586E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0774 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0774 }
            java.lang.String r3 = "Ignoring potentially useful invocation information."
            r2.mo56386p(r3)     // Catch:{ all -> 0x0774 }
        L_0x0657:
            monitor-exit(r4)     // Catch:{ all -> 0x0774 }
            return
        L_0x0659:
            if (r5 == 0) goto L_0x0665
            r5.f218656f = r12     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.engine.x.a.as r8 = new com.google.android.apps.gsa.nga.engine.x.a.as     // Catch:{ all -> 0x0774 }
            r8.<init>(r2)     // Catch:{ all -> 0x0774 }
            r5.mo74216a(r8)     // Catch:{ all -> 0x0774 }
        L_0x0665:
            if (r7 == 0) goto L_0x06d7
            com.google.android.apps.gsa.nga.shared.v.d.ew r8 = r3.f226283i     // Catch:{ all -> 0x0774 }
            if (r8 != 0) goto L_0x066d
            com.google.android.apps.gsa.nga.shared.v.d.ew r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew.f226160o     // Catch:{ all -> 0x0774 }
        L_0x066d:
            com.google.protobuf.bn r8 = r8.toBuilder()     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ev r8 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82906ev) r8     // Catch:{ all -> 0x0774 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ew r9 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew) r9     // Catch:{ all -> 0x0774 }
            long r9 = r9.f226166e     // Catch:{ all -> 0x0774 }
            r13 = 0
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x068f
            long r9 = r2.f226103h     // Catch:{ all -> 0x0774 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0774 }
            com.google.protobuf.bv r11 = r8.instance     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ew r11 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew) r11     // Catch:{ all -> 0x0774 }
            int r13 = r11.f226162a     // Catch:{ all -> 0x0774 }
            r13 = r13 | r6
            r11.f226162a = r13     // Catch:{ all -> 0x0774 }
            r11.f226166e = r9     // Catch:{ all -> 0x0774 }
        L_0x068f:
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ew r9 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew) r9     // Catch:{ all -> 0x0774 }
            int r9 = r9.f226163b     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.assistant.shared.l.e r9 = com.google.android.apps.gsa.assistant.shared.l.e.a(r9)     // Catch:{ all -> 0x0774 }
            if (r9 != 0) goto L_0x069d
            com.google.android.apps.gsa.assistant.shared.l.e r9 = com.google.android.apps.gsa.assistant.shared.l.e.a     // Catch:{ all -> 0x0774 }
        L_0x069d:
            com.google.android.apps.gsa.assistant.shared.l.e r10 = com.google.android.apps.gsa.assistant.shared.l.e.a     // Catch:{ all -> 0x0774 }
            if (r9 != r10) goto L_0x06c1
            int r9 = r3.f226279e     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.y r9 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.m132448a(r9)     // Catch:{ all -> 0x0774 }
            if (r9 != 0) goto L_0x06ab
            com.google.android.apps.gsa.nga.shared.v.d.y r9 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.UNKNOWN     // Catch:{ all -> 0x0774 }
        L_0x06ab:
            com.google.android.apps.gsa.nga.shared.v.d.y r10 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.NON_VOICE_INTERACTION     // Catch:{ all -> 0x0774 }
            if (r9 != r10) goto L_0x06c1
            com.google.android.apps.gsa.assistant.shared.l.e r9 = com.google.android.apps.gsa.assistant.shared.l.e.S     // Catch:{ all -> 0x0774 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0774 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ew r10 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew) r10     // Catch:{ all -> 0x0774 }
            int r9 = r9.ca     // Catch:{ all -> 0x0774 }
            r10.f226163b = r9     // Catch:{ all -> 0x0774 }
            int r9 = r10.f226162a     // Catch:{ all -> 0x0774 }
            r9 = r9 | r12
            r10.f226162a = r9     // Catch:{ all -> 0x0774 }
        L_0x06c1:
            com.google.android.apps.gsa.nga.engine.x.a.ax r9 = new com.google.android.apps.gsa.nga.engine.x.a.ax     // Catch:{ all -> 0x0774 }
            r9.<init>(r8)     // Catch:{ all -> 0x0774 }
            r7.mo74216a(r9)     // Catch:{ all -> 0x0774 }
            int r8 = r3.f226276b     // Catch:{ all -> 0x0774 }
            int r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82911f.m132425a(r8)     // Catch:{ all -> 0x0774 }
            if (r8 != 0) goto L_0x06d2
            goto L_0x06d7
        L_0x06d2:
            r9 = 2
            if (r8 != r9) goto L_0x06d7
            r7.f218655e = r12     // Catch:{ all -> 0x0774 }
        L_0x06d7:
            int r3 = r3.f226279e     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.y r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.m132448a(r3)     // Catch:{ all -> 0x0774 }
            if (r3 != 0) goto L_0x06e1
            com.google.android.apps.gsa.nga.shared.v.d.y r3 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.UNKNOWN     // Catch:{ all -> 0x0774 }
        L_0x06e1:
            com.google.android.apps.gsa.nga.shared.v.d.y r8 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.RETRY     // Catch:{ all -> 0x0774 }
            if (r3 != r8) goto L_0x0772
            if (r5 == 0) goto L_0x0754
            if (r7 == 0) goto L_0x0754
            r5.f218657g = r12     // Catch:{ all -> 0x0774 }
            boolean r3 = r5.f218655e     // Catch:{ all -> 0x0774 }
            r7.f218655e = r3     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r3 = r5.f218660j     // Catch:{ all -> 0x0774 }
            int r8 = r3.f218851a     // Catch:{ all -> 0x0774 }
            r9 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 & r9
            if (r8 == 0) goto L_0x0702
            long r8 = r3.f218848M     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.engine.x.a.ay r3 = new com.google.android.apps.gsa.nga.engine.x.a.ay     // Catch:{ all -> 0x0774 }
            r3.<init>(r8)     // Catch:{ all -> 0x0774 }
            r7.mo74216a(r3)     // Catch:{ all -> 0x0774 }
        L_0x0702:
            com.google.android.apps.gsa.nga.engine.x.a.az r3 = new com.google.android.apps.gsa.nga.engine.x.a.az     // Catch:{ all -> 0x0774 }
            r3.<init>(r2)     // Catch:{ all -> 0x0774 }
            r7.mo74216a(r3)     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r2 = r5.f218660j     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ew r2 = r2.f218856f     // Catch:{ all -> 0x0774 }
            if (r2 != 0) goto L_0x0712
            com.google.android.apps.gsa.nga.shared.v.d.ew r2 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew.f226160o     // Catch:{ all -> 0x0774 }
        L_0x0712:
            com.google.android.apps.gsa.nga.engine.x.a.ba r3 = new com.google.android.apps.gsa.nga.engine.x.a.ba     // Catch:{ all -> 0x0774 }
            r3.<init>(r2)     // Catch:{ all -> 0x0774 }
            r7.mo74216a(r3)     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r2 = r5.f218660j     // Catch:{ all -> 0x0774 }
            com.google.protobuf.cq r2 = r2.f218863m     // Catch:{ all -> 0x0774 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0774 }
        L_0x0722:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0774 }
            if (r3 == 0) goto L_0x0772
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ee r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee) r3     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = r3.f226099d     // Catch:{ all -> 0x0774 }
            if (r5 != 0) goto L_0x0734
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x0774 }
        L_0x0734:
            int r8 = r5.f225979a     // Catch:{ all -> 0x0774 }
            r9 = 13
            if (r8 != r9) goto L_0x073f
            java.lang.Object r5 = r5.f225980b     // Catch:{ all -> 0x0774 }
            com.google.android.apps.gsa.nga.shared.v.d.gz r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz) r5     // Catch:{ all -> 0x0774 }
            goto L_0x0741
        L_0x073f:
            com.google.android.apps.gsa.nga.shared.v.d.gz r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz.f226343j     // Catch:{ all -> 0x0774 }
        L_0x0741:
            int r5 = r5.f226346b     // Catch:{ all -> 0x0774 }
            int r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82963gy.m132440a(r5)     // Catch:{ all -> 0x0774 }
            if (r5 == 0) goto L_0x0722
            if (r5 != r6) goto L_0x0722
            com.google.android.apps.gsa.nga.engine.x.a.bb r5 = new com.google.android.apps.gsa.nga.engine.x.a.bb     // Catch:{ all -> 0x0774 }
            r5.<init>(r3)     // Catch:{ all -> 0x0774 }
            r7.mo74216a(r5)     // Catch:{ all -> 0x0774 }
            goto L_0x0722
        L_0x0754:
            com.google.common.f.e r2 = f218664d     // Catch:{ all -> 0x0774 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0774 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0774 }
            java.lang.String r5 = "ClearcutEventAggregator"
            r2.mo56378ag(r3, r5)     // Catch:{ all -> 0x0774 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0774 }
            r3 = 3985(0xf91, float:5.584E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0774 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0774 }
            java.lang.String r3 = "Received RETRY event without previous or current session."
            r2.mo56386p(r3)     // Catch:{ all -> 0x0774 }
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x0774 }
        L_0x0772:
            monitor-exit(r4)     // Catch:{ all -> 0x0774 }
            return
        L_0x0774:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0774 }
            throw r2
        L_0x0778:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x078f }
            if (r4 != 0) goto L_0x0781
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x078f }
        L_0x0781:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x078f }
            com.google.android.apps.gsa.nga.engine.x.a.ak r5 = new com.google.android.apps.gsa.nga.engine.x.a.ak     // Catch:{ all -> 0x078f }
            r5.<init>(r2)     // Catch:{ all -> 0x078f }
            r4.mo74216a(r5)     // Catch:{ all -> 0x078f }
            monitor-exit(r3)     // Catch:{ all -> 0x078f }
            return
        L_0x078f:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x078f }
            throw r2
        L_0x0793:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x07aa }
            if (r4 != 0) goto L_0x079c
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x07aa }
        L_0x079c:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x07aa }
            com.google.android.apps.gsa.nga.engine.x.a.al r5 = new com.google.android.apps.gsa.nga.engine.x.a.al     // Catch:{ all -> 0x07aa }
            r5.<init>(r2)     // Catch:{ all -> 0x07aa }
            r4.mo74216a(r5)     // Catch:{ all -> 0x07aa }
            monitor-exit(r3)     // Catch:{ all -> 0x07aa }
            return
        L_0x07aa:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x07aa }
            throw r2
        L_0x07ae:
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r5 = r2.f226102g     // Catch:{ all -> 0x080e }
            if (r5 != 0) goto L_0x07b7
            com.google.android.apps.gsa.nga.shared.v.io r5 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x080e }
        L_0x07b7:
            com.google.android.apps.gsa.nga.engine.x.a.bc r5 = r1.m127822m(r5)     // Catch:{ all -> 0x080e }
            com.google.android.apps.gsa.nga.engine.x.a.b r6 = new com.google.android.apps.gsa.nga.engine.x.a.b     // Catch:{ all -> 0x080e }
            r6.<init>(r2)     // Catch:{ all -> 0x080e }
            r5.mo74216a(r6)     // Catch:{ all -> 0x080e }
            monitor-exit(r3)     // Catch:{ all -> 0x080e }
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = r2.f226099d
            if (r5 != 0) goto L_0x07ca
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c
        L_0x07ca:
            int r6 = r5.f225979a
            if (r6 != r12) goto L_0x07d3
            java.lang.Object r5 = r5.f225980b
            com.google.android.apps.gsa.nga.shared.aa.k.b.i r5 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i) r5
            goto L_0x07d5
        L_0x07d3:
            com.google.android.apps.gsa.nga.shared.aa.k.b.i r5 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i.f220937h
        L_0x07d5:
            int r5 = r5.f220944f
            com.google.android.apps.gsa.nga.shared.aa.k.b.c r5 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c.m128173a(r5)
            if (r5 != 0) goto L_0x07df
            com.google.android.apps.gsa.nga.shared.aa.k.b.c r5 = com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c.UNRECOGNIZED
        L_0x07df:
            int r5 = r5.ordinal()
            if (r5 == r4) goto L_0x07f1
            r4 = 5
            if (r5 == r4) goto L_0x07ee
            if (r5 == r8) goto L_0x07ee
            r4 = 7
            if (r5 == r4) goto L_0x07f1
            goto L_0x07f3
        L_0x07ee:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.A
            goto L_0x07f3
        L_0x07f1:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.S
        L_0x07f3:
            if (r7 == 0) goto L_0x0846
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x080a }
            if (r4 != 0) goto L_0x07fc
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x080a }
        L_0x07fc:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x080a }
            com.google.android.apps.gsa.nga.engine.x.a.c r5 = new com.google.android.apps.gsa.nga.engine.x.a.c     // Catch:{ all -> 0x080a }
            r5.<init>(r7, r2)     // Catch:{ all -> 0x080a }
            r4.mo74216a(r5)     // Catch:{ all -> 0x080a }
            monitor-exit(r3)     // Catch:{ all -> 0x080a }
            return
        L_0x080a:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x080a }
            throw r2
        L_0x080e:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x080e }
            throw r2
        L_0x0812:
            int r3 = r3.f225979a
            r4 = 3
            if (r3 != r4) goto L_0x0846
            java.lang.Object r3 = f218665e
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0842 }
            if (r4 != 0) goto L_0x0820
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0842 }
        L_0x0820:
            java.lang.String r4 = r4.f227136c     // Catch:{ all -> 0x0842 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0842 }
            if (r4 == 0) goto L_0x082e
            java.util.List r4 = r1.f218680q     // Catch:{ all -> 0x0842 }
            r4.add(r2)     // Catch:{ all -> 0x0842 }
            goto L_0x0840
        L_0x082e:
            com.google.android.apps.gsa.nga.shared.v.io r4 = r2.f226102g     // Catch:{ all -> 0x0842 }
            if (r4 != 0) goto L_0x0834
            com.google.android.apps.gsa.nga.shared.v.io r4 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x0842 }
        L_0x0834:
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = r1.m127822m(r4)     // Catch:{ all -> 0x0842 }
            com.google.android.apps.gsa.nga.engine.x.a.ai r5 = new com.google.android.apps.gsa.nga.engine.x.a.ai     // Catch:{ all -> 0x0842 }
            r5.<init>(r2)     // Catch:{ all -> 0x0842 }
            r4.mo74216a(r5)     // Catch:{ all -> 0x0842 }
        L_0x0840:
            monitor-exit(r3)     // Catch:{ all -> 0x0842 }
            return
        L_0x0842:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0842 }
            throw r2
        L_0x0846:
            return
        L_0x0847:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0847 }
            throw r2
        L_0x084b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.mo74217a(com.google.android.apps.gsa.nga.shared.v.d.ee):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r10 = r8.f218676m;
        r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c();
        ((com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r5).f225172b = "HANDOVER_TO_OPA";
        r10.mo75579d(r5.mo76117a());
        r10 = r8.f218677n.mo74229i(r1, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if ((r1.f218851a & 512) == 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        r1 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127872f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r1 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r10.mo55395g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.f218659i = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r9 = f218664d.mo56225c();
        r9.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "ClearcutEventAggregator");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(3980)).mo56386p("Failed to compute EEOS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        return r10.mo55394f();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo74218b(com.google.android.apps.gsa.nga.shared.p6407v.C83320io r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.Object r0 = f218665e
            monitor-enter(r0)
            com.google.android.apps.gsa.nga.engine.x.a.bc r9 = r8.m127824o(r9)     // Catch:{ all -> 0x008d }
            if (r9 == 0) goto L_0x0087
            com.google.android.apps.gsa.nga.engine.x.a.dj r1 = r9.f218660j     // Catch:{ all -> 0x008d }
            int r1 = r1.f218851a     // Catch:{ all -> 0x008d }
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0087
            boolean r1 = r9.f218657g     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0031
            com.google.common.f.e r1 = f218664d     // Catch:{ all -> 0x008d }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x008d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008d }
            java.lang.String r3 = "ClearcutEventAggregator"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x008d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008d }
            r2 = 3981(0xf8d, float:5.579E-42)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x008d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "Double logging of the session AppFlow"
            r1.mo56386p(r2)     // Catch:{ all -> 0x008d }
        L_0x0031:
            com.google.android.apps.gsa.nga.engine.x.a.dj r1 = r9.f218660j     // Catch:{ all -> 0x008d }
            java.lang.String r2 = r9.f218652b     // Catch:{ all -> 0x008d }
            java.lang.String r3 = r9.f218662l     // Catch:{ all -> 0x008d }
            r4 = 1
            r9.f218657g = r4     // Catch:{ all -> 0x008d }
            r9.f218658h = r10     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            com.google.android.apps.gsa.nga.shared.v.i r10 = r8.f218676m
            com.google.android.apps.gsa.nga.shared.v.c.mw r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82646mx.m131904c()
            r6 = r5
            com.google.android.apps.gsa.nga.shared.v.c.ej r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82416ej) r6
            java.lang.String r7 = "HANDOVER_TO_OPA"
            r6.f225172b = r7
            com.google.android.apps.gsa.nga.shared.v.c.mx r5 = r5.mo76117a()
            r10.mo75579d(r5)
            com.google.android.apps.gsa.nga.engine.x.a.cf r10 = r8.f218677n
            com.google.common.b.gp r10 = r10.mo74229i(r1, r2, r3)
            int r2 = r1.f218851a
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0082
            com.google.android.apps.gsa.shared.logger.b.g r1 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127872f(r1)
            if (r1 == 0) goto L_0x006e
            r10.mo55395g(r1)
            monitor-enter(r0)
            r9.f218659i = r4     // Catch:{ all -> 0x006b }
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0082
        L_0x006b:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r9
        L_0x006e:
            com.google.common.f.e r9 = f218664d
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "ClearcutEventAggregator"
            r9.mo56378ag(r0, r1)
            java.lang.String r0 = "Failed to compute EEOS"
            r1 = 3980(0xf8c, float:5.577E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56386p(r0)
        L_0x0082:
            com.google.common.b.gu r9 = r10.mo55394f()
            return r9
        L_0x0087:
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return r9
        L_0x008d:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.mo74218b(com.google.android.apps.gsa.nga.shared.v.io, java.lang.String):com.google.common.b.gu");
    }

    /* renamed from: c */
    public final void mo74219c(String str) {
        synchronized (f218665e) {
            C79753bc p = m127825p(str);
            if (p == null) {
                C59104x d = f218664d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ClearcutEventAggregator");
                ((C59052c) ((C59052c) d).mo56372aa(3984)).mo56389s("Missing session for queryId %s", str);
                int i = C90755l.f253831a;
                return;
            }
            p.f218661k = false;
        }
    }

    /* renamed from: e */
    public final C60218r mo74220e(C83320io ioVar) {
        return m127822m(ioVar).f218653c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        return com.evernote.android.state.BuildConfig.FLAVOR;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo74221f() {
        /*
            r4 = this;
            java.lang.Object r0 = f218665e
            monitor-enter(r0)
            j$.util.Optional r1 = r4.m127826q()     // Catch:{ all -> 0x0046 }
            boolean r2 = r1.isPresent()     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0046 }
            com.google.android.apps.gsa.nga.engine.x.a.bc r1 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r1     // Catch:{ all -> 0x0046 }
            com.google.android.apps.gsa.nga.engine.x.a.dj r1 = r1.f218660j     // Catch:{ all -> 0x0046 }
            com.google.android.apps.gsa.nga.shared.v.d.ee r1 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79783cf.m127870d(r1)     // Catch:{ all -> 0x0046 }
            com.google.android.apps.gsa.nga.shared.v.d.ea r1 = r1.f226099d     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x001f
            com.google.android.apps.gsa.nga.shared.v.d.ea r1 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x0046 }
        L_0x001f:
            int r2 = r1.f225979a     // Catch:{ all -> 0x0046 }
            r3 = 36
            if (r2 != r3) goto L_0x002a
            java.lang.Object r1 = r1.f225980b     // Catch:{ all -> 0x0046 }
            com.google.android.apps.gsa.nga.shared.v.d.ds r1 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds) r1     // Catch:{ all -> 0x0046 }
            goto L_0x002c
        L_0x002a:
            com.google.android.apps.gsa.nga.shared.v.d.ds r1 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds.f225961e     // Catch:{ all -> 0x0046 }
        L_0x002c:
            com.google.assistant.e.i.a.li r2 = r1.f225965c     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0032
            com.google.assistant.e.i.a.li r2 = com.google.assistant.p3897e.p3917i.p3918a.C51536li.f134316k     // Catch:{ all -> 0x0046 }
        L_0x0032:
            int r2 = r2.f134318a     // Catch:{ all -> 0x0046 }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0042
            com.google.assistant.e.i.a.li r1 = r1.f225965c     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x003e
            com.google.assistant.e.i.a.li r1 = com.google.assistant.p3897e.p3917i.p3918a.C51536li.f134316k     // Catch:{ all -> 0x0046 }
        L_0x003e:
            java.lang.String r1 = r1.f134320c     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return r1
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = ""
            return r0
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.mo74221f():java.lang.String");
    }

    /* renamed from: g */
    public final String mo74222g() {
        Optional q = m127826q();
        return q.isPresent() ? ((C79753bc) q.get()).f218652b : BuildConfig.FLAVOR;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: gS */
    public final void mo17602gS(com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f r7) {
        /*
            r6 = this;
            java.lang.Object r0 = f218665e
            monitor-enter(r0)
            r1 = 0
            com.google.android.apps.gsa.shared.util.debug.a.f r7 = r7.mo85281e(r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "NGA Session"
            r7.mo85291r(r1)     // Catch:{ all -> 0x00f5 }
            monitor-enter(r0)     // Catch:{ all -> 0x00f5 }
            com.google.android.libraries.f.a r1 = r6.f218666a     // Catch:{ all -> 0x00f2 }
            long r1 = r1.mo26871c()     // Catch:{ all -> 0x00f2 }
            com.google.android.apps.gsa.nga.shared.g.a r3 = r6.f218673j     // Catch:{ all -> 0x00f2 }
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)     // Catch:{ all -> 0x00f2 }
            com.google.android.apps.gsa.nga.engine.x.a.f r4 = new com.google.android.apps.gsa.nga.engine.x.a.f     // Catch:{ all -> 0x00f2 }
            r4.<init>(r1)     // Catch:{ all -> 0x00f2 }
            j$.util.stream.Stream r1 = r3.filter(r4)     // Catch:{ all -> 0x00f2 }
            j$.util.stream.Collector r2 = p3186j$.util.stream.Collectors.toList()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r1.collect(r2)     // Catch:{ all -> 0x00f2 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00f2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r1)     // Catch:{ all -> 0x00f5 }
            com.google.android.apps.gsa.nga.engine.x.a.av r3 = com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79745av.f218643a     // Catch:{ all -> 0x00f5 }
            j$.util.stream.Stream r2 = r2.map(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = ","
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.joining(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r2 = r2.collect(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00f5 }
            monitor-enter(r0)     // Catch:{ all -> 0x00f5 }
            java.util.List r3 = com.google.common.p4522b.C58597ky.m90216g(r1)     // Catch:{ all -> 0x00ef }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ef }
        L_0x004d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00ef }
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r4     // Catch:{ all -> 0x00ef }
            com.google.android.apps.gsa.nga.engine.x.a.dj r5 = r4.f218660j     // Catch:{ all -> 0x00ef }
            com.google.protobuf.cq r5 = r5.f218854d     // Catch:{ all -> 0x00ef }
            int r5 = r5.size()     // Catch:{ all -> 0x00ef }
            if (r5 <= 0) goto L_0x004d
            boolean r5 = m127833x(r4)     // Catch:{ all -> 0x00ef }
            if (r5 != 0) goto L_0x004d
            java.lang.String r1 = r4.f218652b     // Catch:{ all -> 0x00ef }
            monitor-exit(r0)     // Catch:{ all -> 0x00ef }
            goto L_0x008e
        L_0x006d:
            java.util.List r1 = com.google.common.p4522b.C58597ky.m90216g(r1)     // Catch:{ all -> 0x00ef }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ef }
        L_0x0075:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x008b
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00ef }
            com.google.android.apps.gsa.nga.engine.x.a.bc r3 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r3     // Catch:{ all -> 0x00ef }
            boolean r4 = m127833x(r3)     // Catch:{ all -> 0x00ef }
            if (r4 != 0) goto L_0x0075
            java.lang.String r1 = r3.f218652b     // Catch:{ all -> 0x00ef }
            monitor-exit(r0)     // Catch:{ all -> 0x00ef }
            goto L_0x008e
        L_0x008b:
            java.lang.String r1 = ""
            monitor-exit(r0)     // Catch:{ all -> 0x00ef }
        L_0x008e:
            java.lang.String r3 = "How to debug NGA"
            java.lang.String r4 = "http://go/debug-nga-feedback"
            m127827r(r7, r3, r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = "NGA session ids"
            m127827r(r7, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "Last NGA session ID"
            m127827r(r7, r2, r1)     // Catch:{ all -> 0x00f5 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00f5 }
            if (r2 != 0) goto L_0x00ed
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = "yyyyMMdd"
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x00f5 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00f5 }
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00f5 }
            r3.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = r2.format(r3)     // Catch:{ all -> 0x00f5 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f5 }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x00f5 }
            r5 = 1
            r3[r5] = r2     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "http://go/get-nga-session-by-id?p=NGASESSIONID:%s,DATE:%s"
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f5 }
            r3[r4] = r1     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "http://go/get-uttid-for-nga?p=NGASESSIONID:%s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "NGA Debug session URL"
            m127827r(r7, r4, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "NGA Utterance ID URL"
            m127827r(r7, r2, r3)     // Catch:{ all -> 0x00f5 }
            com.google.android.apps.gsa.nga.engine.x.a.bc r1 = r6.m127825p(r1)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00ed
            java.lang.String r2 = "LAST_QUERY_IS_CLOUDHANDOVER"
            boolean r1 = m127832w(r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = java.lang.Boolean.toString(r1)     // Catch:{ all -> 0x00f5 }
            m127827r(r7, r2, r1)     // Catch:{ all -> 0x00f5 }
        L_0x00ed:
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            return
        L_0x00ef:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ef }
            throw r7     // Catch:{ all -> 0x00f5 }
        L_0x00f2:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
            throw r7     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f9
        L_0x00f8:
            throw r7
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.mo17602gS(com.google.android.apps.gsa.shared.util.debug.a.f):void");
    }

    /* renamed from: h */
    public final String mo74223h(C83320io ioVar) {
        return m127822m(ioVar).f218652b;
    }

    /* renamed from: i */
    public final String mo74224i() {
        return C39191a.m68623b(C90719ac.f253778a.mo85083a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74225j(p3186j$.util.Optional r4) {
        /*
            r3 = this;
            java.lang.Object r0 = f218665e
            monitor-enter(r0)
            r3.f218668c = r4     // Catch:{ all -> 0x003a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000d:
            j$.util.Optional r4 = r3.m127826q()     // Catch:{ all -> 0x003a }
            boolean r1 = r4.isPresent()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0038
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x003a }
            com.google.android.apps.gsa.nga.engine.x.a.bc r4 = (com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79753bc) r4     // Catch:{ all -> 0x003a }
            com.google.android.apps.gsa.nga.engine.x.a.dj r1 = r4.f218660j     // Catch:{ all -> 0x003a }
            int r1 = r1.f218851a     // Catch:{ all -> 0x003a }
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x0038
            j$.util.Optional r1 = r3.f218668c     // Catch:{ all -> 0x003a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x003a }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x003a }
            com.google.android.apps.gsa.nga.engine.x.a.w r2 = new com.google.android.apps.gsa.nga.engine.x.a.w     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
            r4.mo74216a(r2)     // Catch:{ all -> 0x003a }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79754bd.mo74225j(j$.util.Optional):void");
    }
}
