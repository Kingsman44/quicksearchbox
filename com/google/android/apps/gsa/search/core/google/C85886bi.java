package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p398b.p399a.p400a.C8415a;
import com.google.p395al.p398b.p399a.p400a.C8419c;
import com.google.p395al.p398b.p399a.p400a.C8420d;
import com.google.p395al.p398b.p399a.p400a.C8421e;
import com.google.p395al.p398b.p399a.p400a.C8422f;
import com.google.p395al.p398b.p399a.p400a.C8423g;
import com.google.p395al.p398b.p399a.p400a.C8426j;
import com.google.p395al.p398b.p399a.p400a.C8427k;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.bi */
/* compiled from: PG */
public final class C85886bi {

    /* renamed from: a */
    private static final C59071e f232215a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.bi");

    /* renamed from: b */
    private final C68214a f232216b;

    public C85886bi(C68214a aVar) {
        this.f232216b = aVar;
    }

    /* renamed from: a */
    public final C8423g mo79519a(Query query) {
        int i;
        C8422f fVar = (C8422f) C8423g.f29294f.createBuilder();
        if (!query.f252770i.isEmpty()) {
            C8420d dVar = (C8420d) C8421e.f29289c.createBuilder();
            String str = query.f252770i;
            dVar.copyOnWrite();
            C8421e eVar = (C8421e) dVar.instance;
            str.getClass();
            eVar.f29291a = 1;
            eVar.f29292b = str;
            fVar.copyOnWrite();
            C8423g gVar = (C8423g) fVar.instance;
            C8421e eVar2 = (C8421e) dVar.build();
            eVar2.getClass();
            gVar.f29297b = eVar2;
            gVar.f29296a |= 1;
        }
        fVar.copyOnWrite();
        C8423g gVar2 = (C8423g) fVar.instance;
        gVar2.f29296a |= 16;
        gVar2.f29300e = true;
        C8415a aVar = (C8415a) C8419c.f29284d.createBuilder();
        if (query.mo84434dO()) {
            i = query.mo84412cs() ? 36 : query.mo84337bV() ? 39 : 17;
        } else {
            i = query.mo84326bK() ? 5 : 7;
        }
        aVar.copyOnWrite();
        C8419c cVar = (C8419c) aVar.instance;
        cVar.f29287b = i - 1;
        cVar.f29286a = 1 | cVar.f29286a;
        fVar.copyOnWrite();
        C8423g gVar3 = (C8423g) fVar.instance;
        C8419c cVar2 = (C8419c) aVar.build();
        cVar2.getClass();
        gVar3.f29299d = cVar2;
        gVar3.f29296a |= 8;
        C8426j jVar = (C8426j) C8427k.f29308c.createBuilder();
        String str2 = query.f252778q;
        if (str2 != null) {
            jVar.copyOnWrite();
            C8427k kVar = (C8427k) jVar.instance;
            kVar.f29310a |= 2;
            kVar.f29311b = str2;
        }
        fVar.copyOnWrite();
        C8423g gVar4 = (C8423g) fVar.instance;
        C8427k kVar2 = (C8427k) jVar.build();
        kVar2.getClass();
        gVar4.f29298c = kVar2;
        gVar4.f29296a |= 4;
        return (C8423g) fVar.build();
    }

    /* JADX WARNING: type inference failed for: r9v16, types: [com.google.protobuf.bv] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055 A[LOOP:0: B:10:0x004f->B:12:0x0055, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* renamed from: b */
    public final com.google.p4017at.p4060h.p4068b.p4069a.C54188e mo79520b(java.util.Map r9, java.util.Map r10, java.util.Map r11) {
        /*
            r8 = this;
            com.google.at.h.b.a.e r0 = com.google.p4017at.p4060h.p4068b.p4069a.C54188e.f142203f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.at.h.b.a.b r0 = (com.google.p4017at.p4060h.p4068b.p4069a.C54185b) r0
            java.lang.String r1 = "X-Client-Data"
            java.lang.Object r1 = r10.get(r1)
            byte[] r1 = (byte[]) r1
            r2 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0013:
            r1 = r2
            goto L_0x0031
        L_0x0015:
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x0022 }
            com.google.cl.b.a.a.b r4 = com.google.p4495cl.p4497b.p4498a.p4499a.C58131b.f155403h     // Catch:{ Exception -> 0x0022 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ Exception -> 0x0022 }
            com.google.cl.b.a.a.b r1 = (com.google.p4495cl.p4497b.p4498a.p4499a.C58131b) r1     // Catch:{ Exception -> 0x0022 }
            goto L_0x0031
        L_0x0022:
            r1 = move-exception
            com.google.common.f.e r3 = f232215a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "ClientDataHeaderProto parsing error!!!"
            r5 = 7870(0x1ebe, float:1.1028E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0013
        L_0x0031:
            if (r1 == 0) goto L_0x0042
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.at.h.b.a.e r3 = (com.google.p4017at.p4060h.p4068b.p4069a.C54188e) r3
            r3.f142206b = r1
            int r1 = r3.f142205a
            r1 = r1 | 1
            r3.f142205a = r1
        L_0x0042:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x004f:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r9.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = android.net.Uri.decode(r4)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = android.net.Uri.decode(r3)
            r1.put(r4, r3)
            goto L_0x004f
        L_0x0073:
            r0.mo54073b(r1)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0083:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "X-Client-Data"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0083
            java.lang.Object r3 = r1.getValue()
            byte[] r3 = (byte[]) r3
            r4 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r9.put(r1, r3)
            goto L_0x0083
        L_0x00b3:
            r0.mo54072a(r9)
            r0.mo54072a(r11)
            dagger.a r9 = r8.f232216b
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.l.h r9 = (com.google.android.apps.gsa.search.core.p6809l.C86159h) r9
            dagger.a r10 = r9.f232834c
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r10 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r10
            com.google.knowledge.b.k r11 = com.google.knowledge.p4671b.C61818k.f166999r
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.knowledge.b.j r11 = (com.google.knowledge.p4671b.C61817j) r11
            com.google.android.ssb.d r1 = r9.f232837f
            com.google.knowledge.b.b r1 = r9.mo79794c(r1, r10)
            boolean r3 = r9.mo79797g(r11, r10)
            boolean r4 = com.google.android.apps.gsa.search.core.p6809l.C86159h.m138580j(r11, r10)
            r3 = r3 | r4
            r4 = 0
            boolean r4 = r9.mo79801n(r11, r4)
            r3 = r3 | r4
            boolean r4 = com.google.android.apps.gsa.search.core.p6809l.C86159h.m138579i(r11, r10)
            r3 = r3 | r4
            java.lang.Object r4 = r10.f236439a
            monitor-enter(r4)
            monitor-exit(r4)     // Catch:{ all -> 0x0161 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.media.PlaybackStatus r4 = r10.mo81645g()
            if (r4 != 0) goto L_0x00f9
            r5 = r2
            goto L_0x00fb
        L_0x00f9:
            java.lang.String r5 = r4.f236609f
        L_0x00fb:
            com.google.android.apps.gsa.search.shared.d.d r6 = r10.mo81644f()
            boolean r7 = com.google.android.apps.gsa.search.core.p6809l.C86159h.m138581k(r11, r10)
            r3 = r3 | r7
            boolean r7 = r9.mo79798h(r11, r1, r5)
            r3 = r3 | r7
            boolean r1 = r9.mo79800m(r11, r1, r5)
            r1 = r1 | r3
            boolean r9 = r9.mo79799l(r11, r4)
            r9 = r9 | r1
            com.google.common.b.gu r1 = r6.f236462a
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x012b
            r11.copyOnWrite()
            com.google.protobuf.bv r3 = r11.instance
            com.google.knowledge.b.k r3 = (com.google.knowledge.p4671b.C61818k) r3
            com.google.protobuf.cq r4 = com.google.knowledge.p4671b.C61818k.emptyProtobufList()
            r3.f167003c = r4
            r11.mo58201b(r1)
        L_0x012b:
            boolean r1 = r1.isEmpty()
            boolean r3 = com.google.android.apps.gsa.search.core.p6809l.C86159h.m138582p(r11, r10)
            com.google.android.apps.gsa.search.core.p6809l.C86159h.m138583r(r10)
            r10 = r1 ^ 1
            r9 = r9 | r10
            r9 = r9 | r3
            if (r9 != 0) goto L_0x013d
            goto L_0x0144
        L_0x013d:
            com.google.protobuf.bv r9 = r11.build()
            r2 = r9
            com.google.knowledge.b.k r2 = (com.google.knowledge.p4671b.C61818k) r2
        L_0x0144:
            if (r2 != 0) goto L_0x0148
            com.google.knowledge.b.k r2 = com.google.knowledge.p4671b.C61818k.f166999r
        L_0x0148:
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.at.h.b.a.e r9 = (com.google.p4017at.p4060h.p4068b.p4069a.C54188e) r9
            r2.getClass()
            r9.f142207c = r2
            int r10 = r9.f142205a
            r10 = r10 | 2
            r9.f142205a = r10
            com.google.protobuf.bv r9 = r0.build()
            com.google.at.h.b.a.e r9 = (com.google.p4017at.p4060h.p4068b.p4069a.C54188e) r9
            return r9
        L_0x0161:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0161 }
            goto L_0x0165
        L_0x0164:
            throw r9
        L_0x0165:
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.C85886bi.mo79520b(java.util.Map, java.util.Map, java.util.Map):com.google.at.h.b.a.e");
    }
}
