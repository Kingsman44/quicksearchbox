package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.assistant.p3994s.p3995a.C53142cy;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.r */
/* compiled from: PG */
public final /* synthetic */ class C124022r implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C124025u f342555a;

    /* renamed from: b */
    public final /* synthetic */ Set f342556b;

    /* renamed from: c */
    public final /* synthetic */ C53142cy f342557c;

    /* renamed from: d */
    public final /* synthetic */ List f342558d;

    public /* synthetic */ C124022r(C124025u uVar, Set set, C53142cy cyVar, List list) {
        this.f342555a = uVar;
        this.f342556b = set;
        this.f342557c = cyVar;
        this.f342558d = list;
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0325  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45928a(com.google.android.libraries.storage.p3315b.C42847bf r28) {
        /*
            r27 = this;
            r1 = r27
            r8 = r28
            com.google.android.apps.search.assistant.platform.pcp.g.u r9 = r1.f342555a
            java.util.Set r0 = r1.f342556b
            com.google.assistant.s.a.cy r2 = r1.f342557c
            java.util.List r10 = r1.f342558d
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.android.apps.search.assistant.platform.pcp.g.m r3 = r9.f342563c
            com.google.common.b.gu r0 = r3.mo106232a(r8, r0)
            int r3 = r0.size()
            r11 = 0
            r4 = 0
        L_0x001c:
            java.lang.String r12 = "-"
            if (r4 >= r3) goto L_0x008a
            java.lang.Object r5 = r0.get(r4)
            com.google.assistant.s.a.cs r5 = (com.google.assistant.p3994s.p3995a.C53136cs) r5
            int r6 = r5.f139273c
            r7 = 100000(0x186a0, float:1.4013E-40)
            if (r6 <= r7) goto L_0x002e
            goto L_0x0087
        L_0x002e:
            int r7 = r5.f139271a
            r7 = r7 & 4
            if (r7 == 0) goto L_0x004d
            java.util.Map r7 = r9.f342568h
            java.lang.String r13 = r5.f139272b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            r14.append(r12)
            r14.append(r13)
            java.lang.String r6 = r14.toString()
            r7.put(r6, r5)
        L_0x004d:
            com.google.protobuf.cq r6 = r5.f139275e
            java.util.Iterator r6 = r6.iterator()
        L_0x0053:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0087
            java.lang.Object r7 = r6.next()
            com.google.assistant.s.a.cr r7 = (com.google.assistant.p3994s.p3995a.C53135cr) r7
            java.util.Map r12 = r9.f342569i
            com.google.android.apps.search.assistant.platform.pcp.i.a r13 = new com.google.android.apps.search.assistant.platform.pcp.i.a
            r13.<init>()
            int r14 = r7.f139267b
            com.google.assistant.s.a.j r14 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r14)
            if (r14 != 0) goto L_0x0070
            com.google.assistant.s.a.j r14 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x0070:
            r13.mo106246b(r14)
            int r14 = r5.f139273c
            r13.mo106248d(r14)
            java.lang.String r14 = r5.f139272b
            r13.mo106247c(r14)
            com.google.android.apps.search.assistant.platform.pcp.i.aj r13 = r13.mo106245a()
            java.lang.String r7 = r7.f139268c
            r12.put(r13, r7)
            goto L_0x0053
        L_0x0087:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x008a:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            com.google.protobuf.cq r0 = r2.f139290a
            java.util.Iterator r15 = r0.iterator()
        L_0x009a:
            boolean r0 = r15.hasNext()
            java.lang.String r2 = "PCP.SyncResponse"
            java.lang.String r3 = "SharedProactiveData"
            java.lang.String r4 = "ClientProactiveData"
            r5 = 1
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r0 = r15.next()
            com.google.assistant.s.a.ci r0 = (com.google.assistant.p3994s.p3995a.C53126ci) r0
            int r6 = r0.f139233c
            if (r6 != r5) goto L_0x0117
            com.google.assistant.s.a.di r6 = r0.f139234d
            if (r6 != 0) goto L_0x00b7
            com.google.assistant.s.a.di r6 = com.google.assistant.p3994s.p3995a.C53153di.f139315c
        L_0x00b7:
            com.google.protobuf.bt r17 = com.google.assistant.p3994s.p3995a.C53245gt.f139565o
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r17)
            r6.mo58887l(r7)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r5 = r7.f169971d
            java.lang.Object r5 = r6.mo58854l(r5)
            if (r5 != 0) goto L_0x00cd
            java.lang.Object r5 = r7.f169969b
            goto L_0x00d1
        L_0x00cd:
            java.lang.Object r5 = r7.mo58889c(r5)
        L_0x00d1:
            com.google.assistant.s.a.gt r5 = (com.google.assistant.p3994s.p3995a.C53245gt) r5
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.cq r6 = r5.f139569c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x00e7
            com.google.protobuf.cq r6 = r5.f139569c
            java.lang.Object r6 = r6.get(r11)
            com.google.assistant.s.a.ge r6 = (com.google.assistant.p3994s.p3995a.C53230ge) r6
            java.lang.String r6 = r6.f139507c
        L_0x00e7:
            boolean r6 = r5.f139574h
            com.google.assistant.s.a.gq r6 = r5.f139577k
            if (r6 != 0) goto L_0x00ef
            com.google.assistant.s.a.gq r6 = com.google.assistant.p3994s.p3995a.C53242gq.f139546f
        L_0x00ef:
            com.google.protobuf.fg r6 = r5.f139572f
            if (r6 != 0) goto L_0x00f5
            com.google.protobuf.fg r6 = com.google.protobuf.C63042fg.f170152c
        L_0x00f5:
            int r5 = r5.f139568b
            com.google.assistant.s.a.gg r5 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.s.a.ch r0 = (com.google.assistant.p3994s.p3995a.C53125ch) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.s.a.ci r5 = (com.google.assistant.p3994s.p3995a.C53126ci) r5
            int r6 = r5.f139231a
            r7 = 1
            r6 = r6 | r7
            r5.f139231a = r6
            java.lang.String r6 = "weather_current"
            r5.f139232b = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.s.a.ci r0 = (com.google.assistant.p3994s.p3995a.C53126ci) r0
            goto L_0x0118
        L_0x0117:
            r7 = 1
        L_0x0118:
            r6 = r0
            int r0 = r6.f139233c
            java.lang.String r5 = r6.f139232b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r12)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            int r0 = r6.f139231a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0164
            java.util.Map r0 = r9.f342568h
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L_0x0164
            r10.add(r6)
            java.util.Map r0 = r9.f342570j
            r0.put(r5, r6)
            android.content.ContentValues r0 = r9.mo106233a(r6)
            r5 = 5
            r8.mo45931c(r3, r0, r5)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r9.f342573m
            int r2 = r6.f139233c
            r0.mo106284c(r2)
            r3 = 1
            r2 = r6
            r7 = r4
            r4 = r28
            r11 = 1
            r5 = r13
            r11 = r6
            r6 = r14
            r1 = r7
            r7 = r9
            com.google.android.apps.search.assistant.platform.pcp.p9337g.C124024t.m203397a(r2, r3, r4, r5, r6, r7)
            goto L_0x0312
        L_0x0164:
            r1 = r4
            r11 = r6
            java.util.Map r0 = r9.f342568h
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0312
            int r0 = r11.f139233c
            java.lang.String r4 = r11.f139232b
            com.google.android.libraries.storage.b.az r6 = new com.google.android.libraries.storage.b.az
            r6.<init>()
            java.lang.StringBuilder r7 = r6.f112130a
            r16 = r15
            java.lang.String r15 = "SELECT data_content, hash_tag FROM SharedProactiveData WHERE data_type = ? AND data_id = ?"
            r7.append(r15)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.ArrayList r7 = r6.f112131b
            r7.add(r0)
            java.util.ArrayList r0 = r6.f112131b
            r0.add(r4)
            com.google.android.libraries.storage.b.ay r0 = r6.mo45920a()
            android.database.Cursor r4 = r8.mo45932d(r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0304 }
            if (r0 == 0) goto L_0x02c6
            java.lang.String r0 = "data_content"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0304 }
            byte[] r0 = r4.getBlob(r0)     // Catch:{ all -> 0x0304 }
            java.lang.String r6 = "hash_tag"
            int r6 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0304 }
            byte[] r6 = r4.getBlob(r6)     // Catch:{ all -> 0x0304 }
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96139A(r6)     // Catch:{ all -> 0x0304 }
            java.nio.charset.Charset r7 = com.google.protobuf.C62972cr.f170009a     // Catch:{ all -> 0x0304 }
            java.lang.String r6 = r6.mo59170I(r7)     // Catch:{ all -> 0x0304 }
            com.google.assistant.s.a.di r7 = com.google.assistant.p3994s.p3995a.C53153di.f139315c     // Catch:{ all -> 0x0304 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x0304 }
            com.google.assistant.s.a.dh r7 = (com.google.assistant.p3994s.p3995a.C53152dh) r7     // Catch:{ all -> 0x0304 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0304 }
            com.google.protobuf.bv r15 = r7.instance     // Catch:{ all -> 0x0304 }
            com.google.assistant.s.a.di r15 = (com.google.assistant.p3994s.p3995a.C53153di) r15     // Catch:{ all -> 0x0304 }
            r6.getClass()     // Catch:{ all -> 0x0304 }
            r18 = r12
            int r12 = r15.f139317a     // Catch:{ all -> 0x0304 }
            r19 = r1
            r1 = 1
            r12 = r12 | r1
            r15.f139317a = r12     // Catch:{ all -> 0x0304 }
            r15.f139318b = r6     // Catch:{ all -> 0x0304 }
            int r6 = r11.f139233c     // Catch:{ ct -> 0x0275 }
            if (r6 == r1) goto L_0x0263
            r1 = 7
            if (r6 == r1) goto L_0x0251
            r1 = 9
            if (r6 == r1) goto L_0x023f
            r1 = 18
            if (r6 == r1) goto L_0x022d
            r1 = 110(0x6e, float:1.54E-43)
            if (r6 == r1) goto L_0x021b
            r1 = 100
            if (r6 == r1) goto L_0x0208
            r1 = 101(0x65, float:1.42E-43)
            if (r6 == r1) goto L_0x01f5
            goto L_0x029b
        L_0x01f5:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.ff r6 = com.google.assistant.p3994s.p3995a.C53204ff.f139458a     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.ff r0 = (com.google.assistant.p3994s.p3995a.C53204ff) r0     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bt r1 = com.google.assistant.p3994s.p3995a.C53204ff.f139459b     // Catch:{ ct -> 0x0275 }
            r7.mo58885m(r1, r0)     // Catch:{ ct -> 0x0275 }
            goto L_0x029b
        L_0x0208:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.gb r6 = com.google.assistant.p3994s.p3995a.C53227gb.f139499b     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.gb r0 = (com.google.assistant.p3994s.p3995a.C53227gb) r0     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bt r1 = com.google.assistant.p3994s.p3995a.C53227gb.f139500c     // Catch:{ ct -> 0x0275 }
            r7.mo58885m(r1, r0)     // Catch:{ ct -> 0x0275 }
            goto L_0x029b
        L_0x021b:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.gv r6 = com.google.assistant.p3994s.p3995a.C53247gv.f139580b     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.gv r0 = (com.google.assistant.p3994s.p3995a.C53247gv) r0     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bt r1 = com.google.assistant.p3994s.p3995a.C53247gv.f139581c     // Catch:{ ct -> 0x0275 }
            r7.mo58885m(r1, r0)     // Catch:{ ct -> 0x0275 }
            goto L_0x029b
        L_0x022d:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.es r6 = com.google.assistant.p3994s.p3995a.C53190es.f139393s     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.es r0 = (com.google.assistant.p3994s.p3995a.C53190es) r0     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bt r1 = com.google.assistant.p3994s.p3995a.C53190es.f139394t     // Catch:{ ct -> 0x0275 }
            r7.mo58885m(r1, r0)     // Catch:{ ct -> 0x0275 }
            goto L_0x029b
        L_0x023f:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.ft r6 = com.google.assistant.p3994s.p3995a.C53218ft.f139481a     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.ft r0 = (com.google.assistant.p3994s.p3995a.C53218ft) r0     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bt r1 = com.google.assistant.p3994s.p3995a.C53218ft.f139482b     // Catch:{ ct -> 0x0275 }
            r7.mo58885m(r1, r0)     // Catch:{ ct -> 0x0275 }
            goto L_0x029b
        L_0x0251:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.fn r6 = com.google.assistant.p3994s.p3995a.C53212fn.f139467g     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.fn r0 = (com.google.assistant.p3994s.p3995a.C53212fn) r0     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bt r1 = com.google.assistant.p3994s.p3995a.C53212fn.f139468h     // Catch:{ ct -> 0x0275 }
            r7.mo58885m(r1, r0)     // Catch:{ ct -> 0x0275 }
            goto L_0x029b
        L_0x0263:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.gt r6 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0275 }
            com.google.assistant.s.a.gt r0 = (com.google.assistant.p3994s.p3995a.C53245gt) r0     // Catch:{ ct -> 0x0275 }
            com.google.protobuf.bt r1 = com.google.assistant.p3994s.p3995a.C53245gt.f139565o     // Catch:{ ct -> 0x0275 }
            r7.mo58885m(r1, r0)     // Catch:{ ct -> 0x0275 }
            goto L_0x029b
        L_0x0275:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.pcp.p9337g.C124025u.f342561a     // Catch:{ all -> 0x0304 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0304 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0304 }
            r1.mo56378ag(r6, r2)     // Catch:{ all -> 0x0304 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0304 }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ all -> 0x0304 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0304 }
            r1 = 35363(0x8a23, float:4.9554E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0304 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = "Invalid parsing from db dataType %s dataId %s"
            int r2 = r11.f139233c     // Catch:{ all -> 0x0304 }
            java.lang.String r6 = r11.f139232b     // Catch:{ all -> 0x0304 }
            r0.mo56395y(r1, r2, r6)     // Catch:{ all -> 0x0304 }
        L_0x029b:
            com.google.protobuf.bn r0 = r11.toBuilder()     // Catch:{ all -> 0x0304 }
            com.google.assistant.s.a.ch r0 = (com.google.assistant.p3994s.p3995a.C53125ch) r0     // Catch:{ all -> 0x0304 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0304 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x0304 }
            com.google.assistant.s.a.ci r1 = (com.google.assistant.p3994s.p3995a.C53126ci) r1     // Catch:{ all -> 0x0304 }
            com.google.protobuf.bv r2 = r7.build()     // Catch:{ all -> 0x0304 }
            com.google.assistant.s.a.di r2 = (com.google.assistant.p3994s.p3995a.C53153di) r2     // Catch:{ all -> 0x0304 }
            r2.getClass()     // Catch:{ all -> 0x0304 }
            r1.f139234d = r2     // Catch:{ all -> 0x0304 }
            int r2 = r1.f139231a     // Catch:{ all -> 0x0304 }
            r2 = r2 | 4
            r1.f139231a = r2     // Catch:{ all -> 0x0304 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0304 }
            r6 = r0
            com.google.assistant.s.a.ci r6 = (com.google.assistant.p3994s.p3995a.C53126ci) r6     // Catch:{ all -> 0x0304 }
            if (r4 == 0) goto L_0x02d0
            r4.close()
            goto L_0x02d0
        L_0x02c6:
            r19 = r1
            r18 = r12
            if (r4 == 0) goto L_0x02cf
            r4.close()
        L_0x02cf:
            r6 = r11
        L_0x02d0:
            r10.add(r6)
            java.util.Map r0 = r9.f342570j
            r0.put(r5, r11)
            android.content.ContentValues r0 = r9.mo106233a(r11)
            r1 = 2
            java.lang.String[] r2 = new java.lang.String[r1]
            int r4 = r11.f139233c
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = r11.f139232b
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "data_type =? AND data_id =?"
            r8.mo45936j(r3, r0, r4, r2)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r9.f342573m
            int r2 = r11.f139233c
            r0.mo106284c(r2)
            r3 = 0
            r2 = r11
            r4 = r28
            r5 = r13
            r6 = r14
            r7 = r9
            com.google.android.apps.search.assistant.platform.pcp.p9337g.C124024t.m203397a(r2, r3, r4, r5, r6, r7)
            goto L_0x0319
        L_0x0304:
            r0 = move-exception
            r1 = r0
            if (r4 == 0) goto L_0x0311
            r4.close()     // Catch:{ all -> 0x030c }
            goto L_0x0311
        L_0x030c:
            r0 = move-exception
            r2 = r0
            com.google.android.apps.search.assistant.platform.pcp.p9337g.C124019o.m203394a(r1, r2)
        L_0x0311:
            throw r1
        L_0x0312:
            r19 = r1
            r18 = r12
            r16 = r15
            r1 = 2
        L_0x0319:
            com.google.protobuf.cq r0 = r11.f139235e
            java.util.Iterator r0 = r0.iterator()
        L_0x031f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x03db
            java.lang.Object r2 = r0.next()
            com.google.assistant.s.a.co r2 = (com.google.assistant.p3994s.p3995a.C53132co) r2
            com.google.android.apps.search.assistant.platform.pcp.i.a r3 = new com.google.android.apps.search.assistant.platform.pcp.i.a
            r3.<init>()
            int r4 = r2.f139253b
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r4)
            if (r4 != 0) goto L_0x033a
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x033a:
            r3.mo106246b(r4)
            int r4 = r11.f139233c
            r3.mo106248d(r4)
            java.lang.String r4 = r11.f139232b
            r3.mo106247c(r4)
            com.google.android.apps.search.assistant.platform.pcp.i.aj r3 = r3.mo106245a()
            java.util.Map r4 = r9.f342571k
            java.lang.String r5 = r2.f139262k
            r4.put(r3, r5)
            java.util.Map r4 = r9.f342569i
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L_0x0389
            com.google.assistant.ag.c.az r3 = r2.f139255d
            if (r3 != 0) goto L_0x0360
            com.google.assistant.ag.c.az r3 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0360:
            r21 = r3
            com.google.android.libraries.f.a r3 = r9.f342565e
            long r22 = r3.mo26870b()
            int r3 = r2.f139253b
            com.google.assistant.s.a.j r3 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r3)
            if (r3 != 0) goto L_0x0372
            com.google.assistant.s.a.j r3 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x0372:
            r24 = r3
            int r3 = r11.f139233c
            java.lang.String r4 = r11.f139232b
            r20 = r2
            r25 = r3
            r26 = r4
            android.content.ContentValues r3 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202963v(r20, r21, r22, r24, r25, r26)
            r5 = r19
            r4 = 5
            r8.mo45931c(r5, r3, r4)
            goto L_0x03c4
        L_0x0389:
            r5 = r19
            r4 = 5
            com.google.assistant.ag.c.az r3 = r2.f139255d
            if (r3 != 0) goto L_0x0392
            com.google.assistant.ag.c.az r3 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0392:
            com.google.android.libraries.f.a r6 = r9.f342565e
            long r6 = r6.mo26870b()
            android.content.ContentValues r3 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202962u(r2, r3, r6)
            r6 = 3
            java.lang.String[] r7 = new java.lang.String[r6]
            int r6 = r11.f139233c
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r12 = 0
            r7[r12] = r6
            java.lang.String r6 = r11.f139232b
            r12 = 1
            r7[r12] = r6
            int r6 = r2.f139253b
            com.google.assistant.s.a.j r6 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r6)
            if (r6 != 0) goto L_0x03b7
            com.google.assistant.s.a.j r6 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x03b7:
            int r6 = r6.f139793X
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r7[r1] = r6
            java.lang.String r6 = "data_type =? AND data_id =? AND client_type =?"
            r8.mo45936j(r5, r3, r6, r7)
        L_0x03c4:
            com.google.android.apps.search.assistant.platform.pcp.i.bz r3 = r9.f342573m
            int r6 = r11.f139233c
            int r2 = r2.f139253b
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r2)
            if (r2 != 0) goto L_0x03d2
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x03d2:
            int r2 = r2.f139793X
            r3.mo106283b(r6, r2)
            r19 = r5
            goto L_0x031f
        L_0x03db:
            r1 = r27
            r15 = r16
            r12 = r18
            r11 = 0
            goto L_0x009a
        L_0x03e4:
            r5 = r4
            r18 = r12
            r1 = 2
            r4 = 5
            java.util.Set r0 = r13.entrySet()     // Catch:{ InterruptedException -> 0x04e1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ InterruptedException -> 0x04e1 }
        L_0x03f1:
            boolean r6 = r0.hasNext()     // Catch:{ InterruptedException -> 0x04e1 }
            if (r6 == 0) goto L_0x044b
            java.lang.Object r6 = r0.next()     // Catch:{ InterruptedException -> 0x04e1 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x04e1 }
            r6.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r7 = r6.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r7 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r7     // Catch:{ InterruptedException -> 0x04e1 }
            int r7 = r7.mo106298a()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.assistant.s.a.j r19 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r7)     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r7 = r6.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r7 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r7     // Catch:{ InterruptedException -> 0x04e1 }
            int r20 = r7.mo106299b()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.i.aj r7 = (com.google.android.apps.search.assistant.platform.pcp.p9339i.C124055aj) r7     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.String r21 = r7.mo106260c()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r7 = r6.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r7 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r7     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.assistant.ag.c.az r24 = r7.mo106301d()     // Catch:{ InterruptedException -> 0x04e1 }
            r22 = 0
            r23 = 0
            com.google.android.libraries.f.a r7 = r9.f342565e     // Catch:{ InterruptedException -> 0x04e1 }
            long r25 = r7.mo26870b()     // Catch:{ InterruptedException -> 0x04e1 }
            android.content.ContentValues r7 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202942a(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ InterruptedException -> 0x04e1 }
            r8.mo45931c(r5, r7, r4)     // Catch:{ InterruptedException -> 0x04e1 }
            java.util.List r7 = r9.f342572l     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r6 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r6     // Catch:{ InterruptedException -> 0x04e1 }
            r7.add(r6)     // Catch:{ InterruptedException -> 0x04e1 }
            goto L_0x03f1
        L_0x044b:
            java.util.Set r0 = r14.entrySet()     // Catch:{ InterruptedException -> 0x04e1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ InterruptedException -> 0x04e1 }
        L_0x0453:
            boolean r4 = r0.hasNext()     // Catch:{ InterruptedException -> 0x04e1 }
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r0.next()     // Catch:{ InterruptedException -> 0x04e1 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x04e1 }
            r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r6 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r6 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r6     // Catch:{ InterruptedException -> 0x04e1 }
            int r6 = r6.mo106298a()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.assistant.s.a.j r19 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r6)     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r6 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r6 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r6     // Catch:{ InterruptedException -> 0x04e1 }
            int r20 = r6.mo106299b()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r6 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r6 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r6     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.String r21 = r6.mo106304f()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r6 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r6 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r6     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.assistant.ag.c.az r24 = r6.mo106301d()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.libraries.f.a r6 = r9.f342565e     // Catch:{ InterruptedException -> 0x04e1 }
            long r25 = r6.mo26870b()     // Catch:{ InterruptedException -> 0x04e1 }
            r22 = 0
            r23 = 0
            android.content.ContentValues r6 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202942a(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ InterruptedException -> 0x04e1 }
            r7 = 3
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r11 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r11 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r11     // Catch:{ InterruptedException -> 0x04e1 }
            int r11 = r11.mo106299b()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ InterruptedException -> 0x04e1 }
            r12 = 0
            r10[r12] = r11     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r11 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r11 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r11     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.String r11 = r11.mo106304f()     // Catch:{ InterruptedException -> 0x04e1 }
            r13 = 1
            r10[r13] = r11     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r11 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r11 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r11     // Catch:{ InterruptedException -> 0x04e1 }
            int r11 = r11.mo106298a()     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ InterruptedException -> 0x04e1 }
            r10[r1] = r11     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.String r11 = "data_type = ? AND data_id = ? AND client_type = ? "
            r8.mo45936j(r5, r6, r11, r10)     // Catch:{ InterruptedException -> 0x04e1 }
            java.util.List r6 = r9.f342572l     // Catch:{ InterruptedException -> 0x04e1 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ InterruptedException -> 0x04e1 }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r4 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r4     // Catch:{ InterruptedException -> 0x04e1 }
            r6.add(r4)     // Catch:{ InterruptedException -> 0x04e1 }
            goto L_0x0453
        L_0x04e1:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.pcp.p9337g.C124025u.f342561a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r4, r2)
            java.lang.String r2 = "Cannot save validity entity. Db operation interrupted."
            r4 = 35362(0x8a22, float:4.9553E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r4)).mo56386p(r2)
        L_0x04f5:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r2 = r9.f342568h
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0509:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0550
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getValue()
            com.google.assistant.s.a.cs r6 = (com.google.assistant.p3994s.p3995a.C53136cs) r6
            java.util.Map r7 = r9.f342570j
            java.lang.Object r10 = r4.getKey()
            boolean r7 = r7.containsKey(r10)
            if (r7 != 0) goto L_0x0509
            int r7 = r6.f139273c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r0.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x053a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x053a:
            java.lang.String r10 = r6.f139272b
            r7.add(r10)
            int r10 = r6.f139273c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.put(r10, r7)
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.getKey()
            int r4 = r6.f139273c
            goto L_0x0509
        L_0x0550:
            java.util.Map r2 = r9.f342569i
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x055a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x05a0
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            com.google.android.apps.search.assistant.platform.pcp.i.aj r4 = (com.google.android.apps.search.assistant.platform.pcp.p9339i.C124055aj) r4
            java.util.Map r6 = r9.f342571k
            boolean r6 = r6.containsKey(r4)
            if (r6 != 0) goto L_0x055a
            java.util.Map r6 = r9.f342570j
            int r7 = r4.mo106258a()
            java.lang.String r10 = r4.mo106260c()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r7 = r18
            r11.append(r7)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            boolean r6 = r6.containsKey(r10)
            if (r6 == 0) goto L_0x059d
            r1.add(r4)
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x059d:
            r18 = r7
            goto L_0x055a
        L_0x05a0:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x05b4
            com.google.android.libraries.storage.b.aw r2 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202945d(r3, r0)
            r8.mo45929a(r2)
            com.google.android.libraries.storage.b.aw r0 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202945d(r5, r0)
            r8.mo45929a(r0)
        L_0x05b4:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05c1
            com.google.android.libraries.storage.b.aw r0 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202944c(r1)
            r8.mo45929a(r0)
        L_0x05c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9337g.C124022r.mo45928a(com.google.android.libraries.storage.b.bf):void");
    }
}
