package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p6026f.C75981a;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76007b;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76008c;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76013h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82781ae;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82782af;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.p5220b.p5221a.C66808l;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.x */
/* compiled from: PG */
public final class C76005x implements C75981a {

    /* renamed from: a */
    public static final /* synthetic */ int f210829a = 0;

    /* renamed from: b */
    private static final C59071e f210830b = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.f.a.x");

    /* renamed from: c */
    private static final C58869cf f210831c = C58869cf.m90937c(C58837ba.m90854c("\\."));

    /* renamed from: d */
    private final Map f210832d = new ConcurrentHashMap();

    /* renamed from: e */
    private final C75993l f210833e;

    /* renamed from: f */
    private final Context f210834f;

    /* renamed from: g */
    private final C83334w f210835g;

    public C76005x(C75993l lVar, Context context, C83334w wVar) {
        this.f210833e = lVar;
        this.f210834f = context;
        this.f210835g = wVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x025e A[SYNTHETIC, Splitter:B:113:0x025e] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x028c A[LOOP:0: B:1:0x0010->B:128:0x028c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0267 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x028b A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p3186j$.util.Optional m122562f(java.lang.String r18, p3186j$.util.function.Predicate r19) {
        /*
            r17 = this;
            r1 = r19
            java.lang.String r2 = "BlacklistRulesHandler"
            r3 = r17
            java.util.Map r0 = r3.f210832d
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x0010:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0290
            java.lang.Object r0 = r4.next()
            com.google.android.apps.gsa.nga.engine.f.a.k r0 = (com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75992k) r0
            com.google.android.apps.gsa.nga.engine.x.ai r5 = r0.f210813g     // Catch:{ Exception -> 0x026a }
            r6 = 24003(0x5dc3, float:3.3635E-41)
            com.google.android.apps.gsa.nga.engine.x.ah r5 = r5.mo74251b(r6)     // Catch:{ Exception -> 0x026a }
            com.google.common.b.ja r6 = r0.f210810d     // Catch:{ all -> 0x0258 }
            com.google.common.b.hd r6 = r6.mo55198p()     // Catch:{ all -> 0x0258 }
            com.google.common.b.ij r6 = r6.keySet()     // Catch:{ all -> 0x0258 }
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r6)     // Catch:{ all -> 0x0258 }
            j$.util.stream.Stream r6 = r6.filter(r1)     // Catch:{ all -> 0x0258 }
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ all -> 0x0258 }
            java.lang.Object r6 = r6.collect(r7)     // Catch:{ all -> 0x0258 }
            com.google.common.b.gu r6 = (com.google.common.p4522b.C58485gu) r6     // Catch:{ all -> 0x0258 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0258 }
            if (r7 == 0) goto L_0x004b
            j$.util.Optional r6 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0258 }
            r9 = 0
            goto L_0x0144
        L_0x004b:
            com.google.android.apps.gsa.nga.engine.f.b.j r7 = r0.f210809c     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.b.l r7 = r7.f210852a     // Catch:{ all -> 0x0258 }
            if (r7 != 0) goto L_0x0053
            com.google.android.apps.gsa.nga.engine.f.b.l r7 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76017l.f210854b     // Catch:{ all -> 0x0258 }
        L_0x0053:
            int r7 = r7.f210856a     // Catch:{ all -> 0x0258 }
            com.google.common.i.o r10 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75992k.f210808b     // Catch:{ all -> 0x0258 }
            if (r7 != 0) goto L_0x005e
            com.google.common.b.pz r7 = com.google.common.p4522b.C58733pz.f156496a     // Catch:{ all -> 0x0258 }
            r9 = 0
            goto L_0x0103
        L_0x005e:
            java.lang.String r11 = r18.trim()     // Catch:{ all -> 0x0258 }
            java.lang.String r12 = "[^a-zA-Z*][^a-zA-Z]*"
            java.lang.String[] r11 = r11.split(r12)     // Catch:{ all -> 0x0258 }
            j$.util.stream.Stream r11 = p3186j$.util.DesugarArrays.stream((T[]) r11)     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.a.o r12 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75996o.f210820a     // Catch:{ all -> 0x0258 }
            j$.util.stream.Stream r11 = r11.map(r12)     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.a.p r12 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75997p.f210821a     // Catch:{ all -> 0x0258 }
            j$.util.stream.Stream r11 = r11.filter(r12)     // Catch:{ all -> 0x0258 }
            j$.util.stream.Collector r12 = p3186j$.util.stream.Collectors.toList()     // Catch:{ all -> 0x0258 }
            java.lang.Object r11 = r11.collect(r12)     // Catch:{ all -> 0x0258 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0258 }
            int r12 = r11.size()     // Catch:{ all -> 0x0258 }
            int r7 = java.lang.Math.min(r7, r12)     // Catch:{ all -> 0x0258 }
            com.google.common.b.gp r12 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0258 }
            r13 = 0
        L_0x008f:
            int r14 = r11.size()     // Catch:{ all -> 0x0258 }
            if (r13 >= r14) goto L_0x00d5
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0258 }
            r14.<init>()     // Catch:{ all -> 0x0258 }
            java.lang.Object r15 = r11.get(r13)     // Catch:{ all -> 0x0258 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0258 }
            r14.append(r15)     // Catch:{ all -> 0x0258 }
            java.lang.String r15 = r14.toString()     // Catch:{ all -> 0x0258 }
            r12.mo55395g(r15)     // Catch:{ all -> 0x0258 }
            int r15 = r13 + 1
            r8 = r15
        L_0x00ad:
            int r9 = r11.size()     // Catch:{ all -> 0x0258 }
            if (r8 >= r9) goto L_0x00d3
            int r9 = r8 - r13
            r16 = 1
            int r9 = r9 + 1
            if (r9 > r7) goto L_0x00d3
            r9 = 32
            r14.append(r9)     // Catch:{ all -> 0x0258 }
            java.lang.Object r9 = r11.get(r8)     // Catch:{ all -> 0x0258 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0258 }
            r14.append(r9)     // Catch:{ all -> 0x0258 }
            java.lang.String r9 = r14.toString()     // Catch:{ all -> 0x0258 }
            r12.mo55395g(r9)     // Catch:{ all -> 0x0258 }
            int r8 = r8 + 1
            goto L_0x00ad
        L_0x00d3:
            r13 = r15
            goto L_0x008f
        L_0x00d5:
            com.google.common.b.gu r7 = r12.mo55394f()     // Catch:{ all -> 0x0258 }
            com.google.common.b.ih r8 = new com.google.common.b.ih     // Catch:{ all -> 0x0258 }
            r8.<init>()     // Catch:{ all -> 0x0258 }
            r9 = 0
            com.google.common.b.sm r7 = r7.listIterator(r9)     // Catch:{ all -> 0x0258 }
        L_0x00e3:
            boolean r11 = r7.hasNext()     // Catch:{ all -> 0x0258 }
            if (r11 == 0) goto L_0x00ff
            java.lang.Object r11 = r7.next()     // Catch:{ all -> 0x0258 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0258 }
            com.google.common.i.n r11 = r10.mo56760b(r11)     // Catch:{ all -> 0x0258 }
            long r11 = r11.mo56773c()     // Catch:{ all -> 0x0258 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0258 }
            r8.mo55373c(r11)     // Catch:{ all -> 0x0258 }
            goto L_0x00e3
        L_0x00ff:
            com.google.common.b.ij r7 = r8.mo55486f()     // Catch:{ all -> 0x0258 }
        L_0x0103:
            int r8 = r6.size()     // Catch:{ all -> 0x0258 }
            r10 = 0
        L_0x0108:
            if (r10 >= r8) goto L_0x0140
            java.lang.Object r11 = r6.get(r10)     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.b.c r11 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76008c) r11     // Catch:{ all -> 0x0258 }
            com.google.common.b.ja r12 = r0.f210810d     // Catch:{ all -> 0x0258 }
            com.google.common.b.hd r11 = r12.mo55543v(r11)     // Catch:{ all -> 0x0258 }
            com.google.common.b.ij r12 = r11.keySet()     // Catch:{ all -> 0x0258 }
            boolean r12 = java.util.Collections.disjoint(r7, r12)     // Catch:{ all -> 0x0258 }
            if (r12 != 0) goto L_0x013d
            java.util.Iterator r12 = r7.iterator()     // Catch:{ all -> 0x0258 }
        L_0x0124:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0258 }
            if (r13 == 0) goto L_0x013d
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0258 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x0258 }
            java.lang.Object r13 = r11.get(r13)     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.b.h r13 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76013h) r13     // Catch:{ all -> 0x0258 }
            if (r13 == 0) goto L_0x0124
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r13)     // Catch:{ all -> 0x0258 }
            goto L_0x0144
        L_0x013d:
            int r10 = r10 + 1
            goto L_0x0108
        L_0x0140:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0258 }
        L_0x0144:
            boolean r7 = r6.isPresent()     // Catch:{ all -> 0x0258 }
            if (r7 == 0) goto L_0x0153
            if (r5 == 0) goto L_0x014f
            r5.close()     // Catch:{ Exception -> 0x026a }
        L_0x014f:
            r14 = r18
            goto L_0x0285
        L_0x0153:
            com.google.common.b.gw r6 = r0.f210811e     // Catch:{ all -> 0x0258 }
            com.google.common.b.hd r6 = r6.map     // Catch:{ all -> 0x0258 }
            com.google.common.b.ij r6 = r6.keySet()     // Catch:{ all -> 0x0258 }
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r6)     // Catch:{ all -> 0x0258 }
            j$.util.stream.Stream r6 = r6.filter(r1)     // Catch:{ all -> 0x0258 }
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ all -> 0x0258 }
            java.lang.Object r6 = r6.collect(r7)     // Catch:{ all -> 0x0258 }
            com.google.common.b.gu r6 = (com.google.common.p4522b.C58485gu) r6     // Catch:{ all -> 0x0258 }
            int r7 = r6.size()     // Catch:{ all -> 0x0258 }
            r8 = 0
        L_0x0170:
            if (r8 >= r7) goto L_0x023d
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.b.c r10 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76008c) r10     // Catch:{ all -> 0x0258 }
            com.google.common.b.gw r11 = r0.f210811e     // Catch:{ all -> 0x0258 }
            com.google.common.b.gu r10 = r11.mo55277g(r10)     // Catch:{ all -> 0x0258 }
            r10.getClass()
            int r11 = r10.size()     // Catch:{ all -> 0x0258 }
            r12 = 0
        L_0x0186:
            int r13 = r8 + 1
            if (r12 >= r11) goto L_0x0236
            java.lang.Object r13 = r10.get(r12)     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.b.h r13 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76013h) r13     // Catch:{ all -> 0x0258 }
            com.google.android.apps.gsa.nga.engine.f.b.f r14 = r13.f210848b     // Catch:{ all -> 0x0258 }
            if (r14 != 0) goto L_0x0196
            com.google.android.apps.gsa.nga.engine.f.b.f r14 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76011f.f210841c     // Catch:{ all -> 0x0258 }
        L_0x0196:
            int r14 = r14.f210843a     // Catch:{ all -> 0x0258 }
            int r14 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76010e.m122570a(r14)     // Catch:{ all -> 0x0258 }
            int r15 = r14 + -1
            if (r14 == 0) goto L_0x0232
            java.lang.String r14 = ""
            r9 = 1
            if (r15 == r9) goto L_0x01e4
            r9 = 3
            if (r15 == r9) goto L_0x01c0
            com.google.common.f.e r9 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75992k.f210807a     // Catch:{ all -> 0x0258 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x0258 }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0258 }
            r9.mo56378ag(r13, r2)     // Catch:{ all -> 0x0258 }
            java.lang.String r13 = "unexpected rules found in blacklistNonHashRulesForAction"
            r14 = 3094(0xc16, float:4.336E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r14)).mo56386p(r13)     // Catch:{ all -> 0x0258 }
            int r9 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x0258 }
        L_0x01bc:
            r14 = r18
            r15 = 1
            goto L_0x022b
        L_0x01c0:
            com.google.android.apps.gsa.nga.engine.f.b.f r15 = r13.f210848b     // Catch:{ all -> 0x0258 }
            if (r15 != 0) goto L_0x01c6
            com.google.android.apps.gsa.nga.engine.f.b.f r15 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76011f.f210841c     // Catch:{ all -> 0x0258 }
        L_0x01c6:
            int r1 = r15.f210843a     // Catch:{ all -> 0x0258 }
            if (r1 != r9) goto L_0x01cf
            java.lang.Object r1 = r15.f210844b     // Catch:{ all -> 0x0258 }
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0258 }
        L_0x01cf:
            java.lang.String r1 = com.google.android.apps.gsa.nga.shared.p6320al.C80884a.m128736a(r18)     // Catch:{ all -> 0x0258 }
            java.lang.String r9 = com.google.android.apps.gsa.nga.shared.p6320al.C80884a.m128736a(r14)     // Catch:{ all -> 0x0258 }
            boolean r1 = r1.contains(r9)     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x01bc
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r13)     // Catch:{ all -> 0x0258 }
            r14 = r18
            goto L_0x0243
        L_0x01e4:
            com.google.android.apps.gsa.nga.engine.f.b.f r1 = r13.f210848b     // Catch:{ all -> 0x0258 }
            if (r1 != 0) goto L_0x01ea
            com.google.android.apps.gsa.nga.engine.f.b.f r1 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76011f.f210841c     // Catch:{ all -> 0x0258 }
        L_0x01ea:
            int r9 = r1.f210843a     // Catch:{ all -> 0x0258 }
            r15 = 1
            if (r9 != r15) goto L_0x01f4
            java.lang.Object r1 = r1.f210844b     // Catch:{ all -> 0x0258 }
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0258 }
        L_0x01f4:
            com.google.common.b.hd r1 = r0.f210812f     // Catch:{ all -> 0x0258 }
            java.lang.Object r1 = r1.get(r14)     // Catch:{ all -> 0x0258 }
            com.google.br.r r1 = (com.google.p4272br.C56449r) r1     // Catch:{ all -> 0x0258 }
            if (r1 != 0) goto L_0x0215
            com.google.common.f.e r1 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75992k.f210807a     // Catch:{ all -> 0x0258 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0258 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0258 }
            r1.mo56378ag(r9, r2)     // Catch:{ all -> 0x0258 }
            java.lang.String r9 = "Regular expression has not been precompiled"
            r13 = 3097(0xc19, float:4.34E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r13)).mo56386p(r9)     // Catch:{ all -> 0x0258 }
            int r1 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x0258 }
            r14 = r18
            goto L_0x022b
        L_0x0215:
            com.google.br.k r9 = new com.google.br.k     // Catch:{ all -> 0x0258 }
            r14 = r18
            r9.<init>(r1, r14)     // Catch:{ all -> 0x0256 }
            boolean r1 = r9.mo54387h()     // Catch:{ all -> 0x0256 }
            if (r1 == 0) goto L_0x0229
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0256 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x0243
        L_0x0229:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0256 }
        L_0x022b:
            int r12 = r12 + 1
            r1 = r19
            r9 = 0
            goto L_0x0186
        L_0x0232:
            r14 = r18
            r0 = 0
            throw r0     // Catch:{ all -> 0x0256 }
        L_0x0236:
            r14 = r18
            r1 = r19
            r8 = r13
            goto L_0x0170
        L_0x023d:
            r14 = r18
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0256 }
        L_0x0243:
            r6 = r0
            boolean r0 = r6.isPresent()     // Catch:{ all -> 0x0256 }
            if (r0 == 0) goto L_0x0250
            if (r5 == 0) goto L_0x0285
            r5.close()     // Catch:{ Exception -> 0x0268 }
            goto L_0x0285
        L_0x0250:
            if (r5 == 0) goto L_0x0281
            r5.close()     // Catch:{ Exception -> 0x0268 }
            goto L_0x0281
        L_0x0256:
            r0 = move-exception
            goto L_0x025b
        L_0x0258:
            r0 = move-exception
            r14 = r18
        L_0x025b:
            r1 = r0
            if (r5 == 0) goto L_0x0267
            r5.close()     // Catch:{ all -> 0x0262 }
            goto L_0x0267
        L_0x0262:
            r0 = move-exception
            r5 = r0
            com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75991j.m122544a(r1, r5)     // Catch:{ Exception -> 0x0268 }
        L_0x0267:
            throw r1     // Catch:{ Exception -> 0x0268 }
        L_0x0268:
            r0 = move-exception
            goto L_0x026d
        L_0x026a:
            r0 = move-exception
            r14 = r18
        L_0x026d:
            com.google.common.f.e r1 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75992k.f210807a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r5, r2)
            java.lang.String r5 = "Unexpected exception thrown from PerformanceStopWatch"
            r6 = 3098(0xc1a, float:4.341E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x0281:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
        L_0x0285:
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L_0x028c
            return r6
        L_0x028c:
            r1 = r19
            goto L_0x0010
        L_0x0290:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C76005x.m122562f(java.lang.String, j$.util.function.Predicate):j$.util.Optional");
    }

    /* renamed from: g */
    private final void m122563g(String str, C83320io ioVar) {
        C82781ae aeVar = (C82781ae) C82782af.f225556c.createBuilder();
        aeVar.copyOnWrite();
        C82782af afVar = (C82782af) aeVar.instance;
        str.getClass();
        afVar.f225558a |= 1;
        afVar.f225559b = str;
        C83334w wVar = this.f210835g;
        C82887ec ecVar = C82887ec.BLACKLIST_RULE_MATCHES_QUERY;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82782af afVar2 = (C82782af) aeVar.build();
        afVar2.getClass();
        eaVar.f225980b = afVar2;
        eaVar.f225979a = 67;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
    }

    /* renamed from: a */
    public final Optional mo71990a(String str, C83320io ioVar) {
        C66808l lVar;
        Optional f = m122562f(str, C76003v.f210827a);
        if (f.isPresent()) {
            m122563g("JINN_BLACKLIST", ioVar);
            C59104x b = f210830b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NgaBlacklistRulesChecke");
            ((C59052c) ((C59052c) b).mo56372aa(3100)).mo56386p("Query blacklisted - JINN_BLACKLIST, will go to the cloud");
        }
        if (f.isEmpty()) {
            return Optional.empty();
        }
        for (C76008c cVar : ((C76013h) f.get()).f210849c) {
            int a = C76007b.m122569a(cVar.f210840c);
            if (a != 0 && a == 4) {
                if (cVar.f210838a == 2) {
                    lVar = (C66808l) cVar.f210839b;
                } else {
                    lVar = C66808l.f181676a;
                }
                return Optional.m71637of(lVar);
            }
        }
        C59104x d = f210830b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NgaBlacklistRulesChecke");
        ((C59052c) ((C59052c) d).mo56372aa(3104)).mo56386p("getMatchingRule returned BlackList rule missing appropriate action");
        int i = C90755l.f253831a;
        return Optional.empty();
    }

    /* renamed from: b */
    public final boolean mo71991b(String str, C80515d dVar, C83320io ioVar) {
        Optional f = m122562f(str, new C76004w(dVar));
        if (f.isPresent()) {
            m122563g(String.format("SKIP_INTENT_GENERATION_FOR_ORIGIN - %s", new Object[]{dVar.name()}), ioVar);
            C59104x b = f210830b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NgaBlacklistRulesChecke");
            ((C59052c) ((C59052c) b).mo56372aa(3101)).mo56389s("Query blacklisted - SKIP_INTENT_GENERATION_FOR_ORIGIN for origin %s", dVar.name());
        }
        return f.isPresent();
    }

    /* renamed from: c */
    public final boolean mo71992c(String str, C80517f fVar, C83320io ioVar) {
        Optional f = m122562f(str, new C75998q(fVar));
        if (f.isPresent()) {
            m122563g(String.format("SKIP_REWRITE_FOR_ORIGIN - %s", new Object[]{fVar.name()}), ioVar);
            C59104x b = f210830b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NgaBlacklistRulesChecke");
            ((C59052c) ((C59052c) b).mo56372aa(3103)).mo56389s("Query blacklisted - SKIP_REWRITE_FOR_ORIGIN for rewrite origin %s", fVar.name());
        }
        return f.isPresent();
    }

    /* renamed from: d */
    public final boolean mo71993d(String str, C83320io ioVar) {
        Optional f = m122562f(str, C75999r.f210823a);
        if (f.isPresent()) {
            m122563g("SKIP_ON_DEVICE_PROCESSING", ioVar);
            C59104x b = f210830b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NgaBlacklistRulesChecke");
            ((C59052c) ((C59052c) b).mo56372aa(3102)).mo56386p("Query blacklisted - SKIP_ON_DEVICE_PROCESSING, will go to the cloud");
        }
        return f.isPresent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72006e(java.lang.String r8, com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f210834f
            r1 = 0
            r2 = 1
            java.lang.String r0 = com.google.android.apps.gsa.shared.util.C90773bq.m148321c(r0)     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r0 != 0) goto L_0x000f
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x0079
        L_0x000f:
            com.google.common.base.cf r3 = f210831c     // Catch:{ NameNotFoundException -> 0x0075 }
            java.util.List r0 = r3.mo56155i(r0)     // Catch:{ NameNotFoundException -> 0x0075 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ NameNotFoundException -> 0x0075 }
            com.google.android.apps.gsa.nga.engine.f.a.s r3 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C76000s.f210824a     // Catch:{ NameNotFoundException -> 0x0075 }
            j$.util.stream.Stream r0 = r0.map(r3)     // Catch:{ NameNotFoundException -> 0x0075 }
            com.google.android.apps.gsa.nga.engine.f.a.t r3 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C76001t.f210825a     // Catch:{ NameNotFoundException -> 0x0075 }
            j$.util.stream.Stream r0 = r0.filter(r3)     // Catch:{ NameNotFoundException -> 0x0075 }
            com.google.android.apps.gsa.nga.engine.f.a.u r3 = com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C76002u.f210826a     // Catch:{ NameNotFoundException -> 0x0075 }
            j$.util.stream.Stream r0 = r0.map(r3)     // Catch:{ NameNotFoundException -> 0x0075 }
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.toList()     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.Object r0 = r0.collect(r3)     // Catch:{ NameNotFoundException -> 0x0075 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ NameNotFoundException -> 0x0075 }
            boolean r3 = r0.isEmpty()     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r3 == 0) goto L_0x0040
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x0079
        L_0x0040:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.Object r4 = r0.get(r1)     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NameNotFoundException -> 0x0075 }
            r3.<init>(r4)     // Catch:{ NameNotFoundException -> 0x0075 }
            int r4 = r0.size()     // Catch:{ NameNotFoundException -> 0x0075 }
            java.util.List r0 = r0.subList(r2, r4)     // Catch:{ NameNotFoundException -> 0x0075 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NameNotFoundException -> 0x0075 }
        L_0x0057:
            boolean r4 = r0.hasNext()     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r0.next()     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r5 = "."
            r3.append(r5)     // Catch:{ NameNotFoundException -> 0x0075 }
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x0057
        L_0x006c:
            java.lang.String r0 = r3.toString()     // Catch:{ NameNotFoundException -> 0x0075 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0079:
            boolean r3 = r0.isPresent()
            if (r3 == 0) goto L_0x0103
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.apps.gsa.nga.engine.f.b.j r3 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j.f210850c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.nga.engine.f.b.i r3 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76014i) r3
            com.google.android.apps.gsa.nga.engine.f.b.l r4 = r9.f210852a
            if (r4 != 0) goto L_0x0093
            com.google.android.apps.gsa.nga.engine.f.b.l r4 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76017l.f210854b
        L_0x0093:
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.nga.engine.f.b.j r5 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j) r5
            r4.getClass()
            r5.f210852a = r4
            com.google.protobuf.cq r9 = r9.f210853b
            java.util.Iterator r9 = r9.iterator()
        L_0x00a5:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r4 = r9.next()
            com.google.android.apps.gsa.nga.engine.f.b.h r4 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76013h) r4
            com.google.android.apps.gsa.nga.engine.f.b.r r5 = r4.f210847a
            if (r5 == 0) goto L_0x00cd
            java.lang.String r5 = r5.f210865a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00cd
            com.google.android.apps.gsa.nga.engine.f.b.r r5 = r4.f210847a
            if (r5 != 0) goto L_0x00c3
            com.google.android.apps.gsa.nga.engine.f.b.r r5 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76023r.f210863c
        L_0x00c3:
            java.lang.String r5 = r5.f210865a
            boolean r5 = com.google.android.apps.gsa.shared.util.C90773bq.m148324f(r0, r5)
            if (r5 != 0) goto L_0x00cd
            r5 = 0
            goto L_0x00ce
        L_0x00cd:
            r5 = 1
        L_0x00ce:
            com.google.android.apps.gsa.nga.engine.f.b.r r6 = r4.f210847a
            if (r6 == 0) goto L_0x00e8
            java.lang.String r6 = r6.f210866b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00e8
            com.google.android.apps.gsa.nga.engine.f.b.r r6 = r4.f210847a
            if (r6 != 0) goto L_0x00e0
            com.google.android.apps.gsa.nga.engine.f.b.r r6 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76023r.f210863c
        L_0x00e0:
            java.lang.String r6 = r6.f210866b
            boolean r6 = com.google.android.apps.gsa.shared.util.C90773bq.m148324f(r6, r0)
            if (r6 == 0) goto L_0x00a5
        L_0x00e8:
            if (r5 == 0) goto L_0x00a5
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.nga.engine.f.b.j r5 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j) r5
            r4.getClass()
            r5.mo72007a()
            com.google.protobuf.cq r5 = r5.f210853b
            r5.add(r4)
            goto L_0x00a5
        L_0x00fd:
            com.google.protobuf.bv r9 = r3.build()
            com.google.android.apps.gsa.nga.engine.f.b.j r9 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j) r9
        L_0x0103:
            com.google.android.apps.gsa.nga.engine.f.a.l r0 = r7.f210833e
            com.google.android.apps.gsa.nga.engine.f.a.k r1 = new com.google.android.apps.gsa.nga.engine.f.a.k
            g.a.a r0 = r0.f210814a
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.nga.engine.x.ai r0 = (com.google.android.apps.gsa.nga.engine.p6260x.C79851ai) r0
            r0.getClass()
            r9.getClass()
            r1.<init>(r0, r9)
            java.util.Map r9 = r7.f210832d
            r9.put(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C76005x.mo72006e(java.lang.String, com.google.android.apps.gsa.nga.engine.f.b.j):void");
    }
}
