package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134552aq;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10214s.C134567be;
import com.google.android.apps.search.googleapp.discover.p10214s.C134569bg;
import com.google.android.apps.search.googleapp.discover.p10214s.C134570bh;
import com.google.android.apps.search.googleapp.discover.p10214s.C134572bj;
import com.google.android.apps.search.googleapp.discover.p10214s.C134573bk;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.p10249z.p10251b.C135324d;
import com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.common.p4522b.C58479go;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Instant;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.bi */
/* compiled from: PG */
public final class C135335bi {

    /* renamed from: a */
    public static final C59071e f368721a = C59071e.m91331h();

    /* renamed from: b */
    private final C135200t f368722b;

    /* renamed from: c */
    private final C135343f f368723c;

    /* renamed from: d */
    private final C135324d f368724d;

    /* renamed from: e */
    private final C60950i f368725e;

    /* renamed from: f */
    private final C69585o f368726f;

    public C135335bi(C135200t tVar, C135343f fVar, C135324d dVar, C60950i iVar, C69585o oVar) {
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f368722b = tVar;
        this.f368723c = fVar;
        this.f368724d = dVar;
        this.f368725e = iVar;
        this.f368726f = oVar;
    }

    /* renamed from: g */
    public static final C135347d m219475g(C134573bk bkVar) {
        C134570bh bhVar = bkVar.f366505g;
        if (bhVar == null) {
            bhVar = C134570bh.f366480d;
        }
        C62971cq<C134567be> cqVar = bhVar.f366483b;
        C69664n.m101060f(cqVar, "structure.restrictionInf…restrictionConditionsList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C134567be beVar : cqVar) {
            C134569bg a = C134569bg.m218288a(beVar.f366473b);
            if (a == null) {
                a = C134569bg.UNKNOWN_SURFACE;
            }
            arrayList.add(a);
        }
        String str = bkVar.f366501c;
        C69664n.m101060f(str, "structure.contentId");
        C134572bj a2 = C134572bj.m218290a(bkVar.f366504f);
        if (a2 == null) {
            a2 = C134572bj.UNDEFINED_ROLE;
        }
        C134572bj bjVar = a2;
        C69664n.m101060f(bjVar, "structure.role");
        C134552aq aqVar = bkVar.f366503e;
        if (aqVar == null) {
            aqVar = C134552aq.f366420e;
        }
        C134552aq aqVar2 = aqVar;
        C69664n.m101060f(aqVar2, "structure.expirationInfo");
        C69664n.m101061g(str, "contentId");
        C69664n.m101061g(bjVar, "role");
        C69664n.m101061g(aqVar2, "expirationInfo");
        return new C135347d(str, bjVar, false, aqVar2, arrayList);
    }

    /* renamed from: h */
    private final C135300ag m219476h(C134560ay ayVar, Map map, Map map2, Instant instant, C134766q qVar) {
        C134560ay ayVar2 = ayVar;
        ArrayList arrayList = new ArrayList();
        String str = ayVar2.f366458d;
        C69664n.m101060f(str, "content.contentId");
        for (C135347d dVar : m219478j(str, map)) {
            if (!dVar.mo112283a(instant, qVar.f366957f)) {
                String str2 = dVar.f368763a;
                C134560ay ayVar3 = (C134560ay) map2.get(str2);
                if (ayVar3 == null) {
                    C59052c cVar = (C59052c) f368721a.mo56225c();
                    cVar.mo56379ah(new C59094n(40449));
                    cVar.mo56389s("Content not found for %s", str2);
                } else {
                    arrayList.add(m219476h(ayVar3, map, map2, instant, qVar));
                }
            } else {
                Map map3 = map2;
            }
        }
        String str3 = ayVar2.f366458d;
        C69664n.m101060f(str3, "content.contentId");
        return new C135300ag(str3, C58479go.m89810b(arrayList), ayVar);
    }

    /* renamed from: i */
    private final void m219477i(C135347d dVar, Map map, Set set, Instant instant, C134766q qVar) {
        if (!dVar.mo112283a(instant, qVar.f366957f)) {
            set.add(dVar.f368763a);
            for (C135347d i : m219478j(dVar.f368763a, map)) {
                m219477i(i, map, set, instant, qVar);
            }
        }
    }

    /* renamed from: j */
    private static final List m219478j(String str, Map map) {
        List list = (List) map.get(str);
        return list == null ? C69496am.f185918a : list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0240, code lost:
        r28 = "getDefaultInstance()";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0243, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0244, code lost:
        r1 = r27;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a2 A[SYNTHETIC, Splitter:B:102:0x02a2] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e4 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0109 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0136 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013c A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0158 A[Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0176 A[SYNTHETIC, Splitter:B:76:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0243 A[ExcHandler: CancellationException (e java.util.concurrent.CancellationException), Splitter:B:72:0x016d] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0296 A[SYNTHETIC, Splitter:B:95:0x0296] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.googleapp.discover.p10249z.C135319az mo112267a(java.util.Map r30, com.google.android.apps.search.googleapp.discover.p10214s.C134556au r31, com.google.android.apps.search.googleapp.discover.p10249z.C135336bj r32, com.google.android.apps.search.googleapp.discover.p10249z.C135316aw r33, p3186j$.time.Instant r34, com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q r35) {
        /*
            r29 = this;
            r7 = r29
            r0 = r30
            r8 = r31
            r1 = r32
            r9 = r33
            java.lang.String r10 = "getDefaultInstance()"
            java.lang.String r11 = "sessionState.structure.rootResponseEventId"
            java.lang.String r12 = "timeSource.now()"
            java.lang.String r2 = "TB#getStreamSubtree"
            com.google.apps.tiktok.tracing.bi r13 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r2)
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r15.<init>()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.util.Collection r2 = r30.values()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x0023:
            boolean r3 = r2.hasNext()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r2.next()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.ay r3 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r3     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.b.ij r4 = r1.f368729c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.String r5 = r3.f366458d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            boolean r4 = r4.contains(r5)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.String r5 = "streamContent.contentId"
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r3.f366458d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r15.put(r4, r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x0043:
            int r4 = r3.f366456b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r6 = 3
            if (r4 != r6) goto L_0x004d
            java.lang.Object r4 = r3.f366457c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.ai r4 = (com.google.android.apps.search.googleapp.discover.p10214s.C134544ai) r4     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            goto L_0x004f
        L_0x004d:
            com.google.android.apps.search.googleapp.discover.s.ai r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134544ai.f366393i     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x004f:
            int r4 = r4.f366395a     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = r3.f366458d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r15.put(r4, r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            goto L_0x0023
        L_0x005e:
            java.lang.String r2 = r9.f368666d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.z.d r2 = r1.mo112273a(r2)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r2 == 0) goto L_0x00af
            java.lang.String r3 = r2.f368763a     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.ay r3 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r3     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r3 == 0) goto L_0x0095
            int r2 = r3.f366456b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r4 = 4
            if (r2 != r4) goto L_0x007c
            java.lang.Object r2 = r3.f366457c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.ak r2 = (com.google.android.apps.search.googleapp.discover.p10214s.C134546ak) r2     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r16 = r2
            goto L_0x00b1
        L_0x007c:
            com.google.common.f.e r2 = f368721a     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.String r3 = "StreamStructure didn't contain a StreamToken"
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r5 = 40454(0x9e06, float:5.6688E-41)
            r4.<init>(r5)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r2.mo56379ah(r4)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r2.mo56386p(r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            goto L_0x00af
        L_0x0095:
            com.google.common.f.e r3 = f368721a     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.String r4 = "Content for the token %s was not found"
            java.lang.String r2 = r2.f368763a     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r6 = 40453(0x9e05, float:5.6687E-41)
            r5.<init>(r6)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r3.mo56379ah(r5)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r3.mo56389s(r4, r2)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x00af:
            r16 = 0
        L_0x00b1:
            com.google.common.b.hd r6 = r1.f368730d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.aw r1 = r8.f366438b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x00b9
            com.google.android.apps.search.googleapp.discover.s.aw r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x00b9:
            int r1 = r1.f366445a     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x00d5
            com.google.android.apps.search.googleapp.discover.s.aw r1 = r8.f366438b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x00c5
            com.google.android.apps.search.googleapp.discover.s.aw r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x00c5:
            com.google.protobuf.fg r1 = r1.f366446b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x00cb
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x00cb:
            java.lang.String r3 = "session.structure.creationTime"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            j$.time.Instant r1 = com.google.protobuf.p4750c.p4751a.C62949a.m95469d(r1)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            goto L_0x00de
        L_0x00d5:
            com.google.common.v.i r1 = r7.f368725e     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            j$.time.Instant r1 = r1.mo57444a()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r12)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x00de:
            r21 = r1
            com.google.protobuf.fg r1 = r8.f366440d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x00e6
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x00e6:
            java.lang.String r3 = "sessionState.lastRefreshAttemptTime"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            j$.time.Instant r20 = com.google.protobuf.p4750c.p4751a.C62949a.m95469d(r1)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.String r1 = r9.f368666d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            int r3 = r8.f366439c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.at r3 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.m218283a(r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r3 != 0) goto L_0x00fb
            com.google.android.apps.search.googleapp.discover.s.at r3 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.UNKNOWN     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x00fb:
            java.lang.String r4 = "session.sessionStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.String r4 = "undefined:root"
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r4)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r4 = 0
            if (r1 == 0) goto L_0x0123
            r1 = 2
            com.google.android.apps.search.googleapp.discover.s.at[] r1 = new com.google.android.apps.search.googleapp.discover.p10214s.C134555at[r1]     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.at r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.SUCCESS     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r1[r4] = r5     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.at r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.UNKNOWN     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r1[r2] = r5     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.util.Set r1 = p5462h.p5463a.C69531o.m100939p(r1)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            boolean r1 = r1.contains(r3)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 == 0) goto L_0x0123
            com.google.android.apps.search.googleapp.discover.s.at r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.EMPTY_SESSION     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r18 = r1
            goto L_0x0125
        L_0x0123:
            r18 = r3
        L_0x0125:
            com.google.android.apps.search.googleapp.discover.s.aw r1 = r8.f366438b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x012b
            com.google.android.apps.search.googleapp.discover.s.aw r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x012b:
            java.lang.String r5 = r1.f366448d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            java.lang.String r1 = "sessionState.structure.sessionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.aw r1 = r8.f366438b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x0138
            com.google.android.apps.search.googleapp.discover.s.aw r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x0138:
            com.google.common.o.l.r r1 = r1.f366450f     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x013e
            com.google.common.o.l.r r1 = com.google.common.p4552o.p4566l.C60218r.f162925d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x013e:
            r3 = r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r11)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.aw r1 = r8.f366438b     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x0148
            com.google.android.apps.search.googleapp.discover.s.aw r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x0148:
            com.google.bv.e.b r1 = r1.f366451g     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x014e
            com.google.bv.e.b r1 = com.google.p4283bv.p4354e.C57051b.f152305a     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x014e:
            r2 = r1
            java.lang.String r1 = "sessionState.structure.feedId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.android.apps.search.googleapp.discover.s.am r1 = r8.f366441e     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            if (r1 != 0) goto L_0x015a
            com.google.android.apps.search.googleapp.discover.s.am r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134548am.f366412d     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
        L_0x015a:
            java.lang.String r4 = "sessionState.contentLifetime"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.b.gu r4 = r9.f368665c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            int r4 = r4.size()     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89838f(r4)     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            com.google.common.b.gu r14 = r9.f368665c     // Catch:{ CancellationException -> 0x02f3, Exception -> 0x024d, all -> 0x0248 }
            r27 = r13
            int r13 = r14.size()     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023f }
            r28 = r10
            r10 = 0
        L_0x0174:
            if (r10 >= r13) goto L_0x01ec
            java.lang.Object r17 = r14.get(r10)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r19 = r1
            r1 = r17
            com.google.android.apps.search.googleapp.discover.z.d r1 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r1     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            java.lang.String r1 = r1.f368763a     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            java.lang.Object r17 = r0.get(r1)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.android.apps.search.googleapp.discover.s.ay r17 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r17     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            if (r17 != 0) goto L_0x01b7
            com.google.common.f.e r17 = f368721a     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.common.f.x r17 = r17.mo56225c()     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r0 = r17
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r22 = r2
            java.lang.String r2 = "Stream content %s was not found"
            r23 = r3
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r32 = r4
            r4 = 40451(0x9e03, float:5.6684E-41)
            r3.<init>(r4)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r0.mo56379ah(r3)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r0.mo56389s(r2, r1)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r17 = r13
            r0 = r19
            r24 = r22
            r13 = r32
            r22 = r5
            r19 = r6
            goto L_0x01db
        L_0x01b7:
            r22 = r2
            r23 = r3
            r32 = r4
            r0 = r19
            r1 = r29
            r24 = r22
            r2 = r17
            r3 = r6
            r17 = r13
            r13 = r32
            r4 = r30
            r22 = r5
            r5 = r34
            r19 = r6
            r6 = r35
            com.google.android.apps.search.googleapp.discover.z.ag r1 = r1.m219476h(r2, r3, r4, r5, r6)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r13.mo55395g(r1)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
        L_0x01db:
            int r10 = r10 + 1
            r1 = r0
            r4 = r13
            r13 = r17
            r6 = r19
            r5 = r22
            r3 = r23
            r2 = r24
            r0 = r30
            goto L_0x0174
        L_0x01ec:
            r0 = r1
            r24 = r2
            r23 = r3
            r13 = r4
            r22 = r5
            j$.util.Optional r1 = p3186j$.util.Optional.ofNullable(r16)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            java.lang.String r2 = "ofNullable(token)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.android.apps.search.googleapp.discover.z.ab r3 = new com.google.android.apps.search.googleapp.discover.z.ab     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r19 = 0
            r17 = r3
            r25 = r1
            r26 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.common.b.gu r1 = r13.mo55394f()     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            java.lang.String r0 = "childrenBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.common.f.e r0 = f368721a     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            java.lang.String r2 = "Created StreamSubTree successfully, items %s"
            r4 = r1
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            int r4 = r4.f156474d     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r6 = 40450(0x9e02, float:5.6683E-41)
            r5.<init>(r6)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r0.mo56379ah(r5)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r0.mo56387q(r2, r4)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            com.google.android.apps.search.googleapp.discover.z.az r6 = new com.google.android.apps.search.googleapp.discover.z.az     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            int r4 = r9.f368663a     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            int r5 = r9.f368664b     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            r0 = r6
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ CancellationException -> 0x0243, Exception -> 0x023d }
            goto L_0x02e8
        L_0x023d:
            r0 = move-exception
            goto L_0x0252
        L_0x023f:
            r0 = move-exception
            r28 = r10
            goto L_0x0252
        L_0x0243:
            r0 = move-exception
            r1 = r27
            goto L_0x02f5
        L_0x0248:
            r0 = move-exception
            r2 = r0
            r1 = r13
            goto L_0x02f8
        L_0x024d:
            r0 = move-exception
            r28 = r10
            r27 = r13
        L_0x0252:
            com.google.common.f.e r1 = f368721a     // Catch:{ all -> 0x02ef }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x02ef }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x02ef }
            com.google.common.f.x r1 = r1.mo56382g(r0)     // Catch:{ all -> 0x02ef }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x02ef }
            com.google.common.f.aa r2 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b     // Catch:{ all -> 0x02ef }
            r3 = 148413590(0x8d89c96, float:1.303684E-33)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02ef }
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x02ef }
            java.lang.String r2 = "#createBoundSubtree - unexpected error, returning EMPTY_SESSION"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x02ef }
            r4 = 40452(0x9e04, float:5.6685E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x02ef }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x02ef }
            r1.mo56386p(r2)     // Catch:{ all -> 0x02ef }
            com.google.android.apps.search.googleapp.discover.z.ab r1 = new com.google.android.apps.search.googleapp.discover.z.ab     // Catch:{ all -> 0x02ef }
            com.google.android.apps.search.googleapp.discover.s.at r17 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.EMPTY_SESSION     // Catch:{ all -> 0x02ef }
            com.google.common.v.i r2 = r7.f368725e     // Catch:{ all -> 0x02ef }
            j$.time.Instant r2 = r2.mo57444a()     // Catch:{ all -> 0x02ef }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r12)     // Catch:{ all -> 0x02ef }
            com.google.common.v.i r3 = r7.f368725e     // Catch:{ all -> 0x02ef }
            j$.time.Instant r3 = r3.mo57444a()     // Catch:{ all -> 0x02ef }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)     // Catch:{ all -> 0x02ef }
            com.google.android.apps.search.googleapp.discover.s.aw r4 = r8.f366438b     // Catch:{ all -> 0x02ef }
            if (r4 != 0) goto L_0x029e
            com.google.android.apps.search.googleapp.discover.s.aw r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ all -> 0x0299 }
            goto L_0x029e
        L_0x0299:
            r0 = move-exception
            r2 = r0
            r1 = r27
            goto L_0x02f8
        L_0x029e:
            com.google.common.o.l.r r4 = r4.f366450f     // Catch:{ all -> 0x02ef }
            if (r4 != 0) goto L_0x02a4
            com.google.common.o.l.r r4 = com.google.common.p4552o.p4566l.C60218r.f162925d     // Catch:{ all -> 0x0299 }
        L_0x02a4:
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)     // Catch:{ all -> 0x02ef }
            com.google.bv.e.b r5 = com.google.p4283bv.p4354e.C57051b.f152305a     // Catch:{ all -> 0x02ef }
            r6 = r28
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x02ef }
            j$.util.Optional r8 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x02ef }
            java.lang.String r9 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ all -> 0x02ef }
            com.google.android.apps.search.googleapp.discover.s.am r9 = com.google.android.apps.search.googleapp.discover.p10214s.C134548am.f366412d     // Catch:{ all -> 0x02ef }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r6)     // Catch:{ all -> 0x02ef }
            java.lang.String r21 = "Stream::Invalid"
            r16 = r1
            r18 = r0
            r19 = r2
            r20 = r3
            r22 = r4
            r23 = r5
            r24 = r8
            r25 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x02ef }
            com.google.android.apps.search.googleapp.discover.z.az r6 = new com.google.android.apps.search.googleapp.discover.z.az     // Catch:{ all -> 0x02ef }
            h.a.am r0 = p5462h.p5463a.C69496am.f185918a     // Catch:{ all -> 0x02ef }
            h.a.an r2 = p5462h.p5463a.C69497an.f185919a     // Catch:{ all -> 0x02ef }
            r3 = 0
            r4 = 0
            r30 = r6
            r31 = r0
            r32 = r2
            r33 = r1
            r34 = r3
            r35 = r4
            r30.<init>(r31, r32, r33, r34, r35)     // Catch:{ all -> 0x02ef }
        L_0x02e8:
            r1 = r27
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r2)
            return r6
        L_0x02ef:
            r0 = move-exception
            r1 = r27
            goto L_0x02f7
        L_0x02f3:
            r0 = move-exception
            r1 = r13
        L_0x02f5:
            throw r0     // Catch:{ all -> 0x02f6 }
        L_0x02f6:
            r0 = move-exception
        L_0x02f7:
            r2 = r0
        L_0x02f8:
            throw r2     // Catch:{ all -> 0x02f9 }
        L_0x02f9:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r1, r2)
            goto L_0x0300
        L_0x02ff:
            throw r3
        L_0x0300:
            goto L_0x02ff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.mo112267a(java.util.Map, com.google.android.apps.search.googleapp.discover.s.au, com.google.android.apps.search.googleapp.discover.z.bj, com.google.android.apps.search.googleapp.discover.z.aw, j$.time.Instant, com.google.android.apps.search.googleapp.discover.streamui.h.q):com.google.android.apps.search.googleapp.discover.z.az");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.apps.search.googleapp.discover.z.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112268b(com.google.android.apps.search.googleapp.discover.p10249z.C135336bj r16, com.google.android.apps.search.googleapp.discover.p10249z.C135316aw r17, p3186j$.time.Instant r18, com.google.android.apps.search.googleapp.discover.p10214s.C134556au r19, com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q r20, p5462h.p5466c.C69577g r21) {
        /*
            r15 = this;
            r7 = r15
            r0 = r16
            r8 = r17
            r1 = r21
            boolean r2 = r1 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135328bb
            if (r2 == 0) goto L_0x001a
            r2 = r1
            com.google.android.apps.search.googleapp.discover.z.bb r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135328bb) r2
            int r3 = r2.f368690d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f368690d = r3
            goto L_0x001f
        L_0x001a:
            com.google.android.apps.search.googleapp.discover.z.bb r2 = new com.google.android.apps.search.googleapp.discover.z.bb
            r2.<init>(r15, r1)
        L_0x001f:
            r9 = r2
            java.lang.Object r1 = r9.f368688b
            h.c.a.a r10 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r9.f368690d
            r11 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r11) goto L_0x003c
            java.lang.Object r2 = r9.f368687a
            p5462h.C69714l.m101134b(r1)     // Catch:{ CancellationException -> 0x0039, Exception -> 0x0036 }
            goto L_0x00bf
        L_0x0032:
            r0 = move-exception
            r1 = r0
            goto L_0x00f1
        L_0x0036:
            r0 = move-exception
            goto L_0x00c7
        L_0x0039:
            r0 = move-exception
            goto L_0x00ed
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            p5462h.C69714l.m101134b(r1)
            java.lang.String r1 = "TB#getBindingContent"
            com.google.apps.tiktok.tracing.bi r12 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            com.google.common.b.ij r1 = r0.f368729c     // Catch:{ all -> 0x00ee }
            java.util.Set r13 = p5462h.p5463a.C69540x.m100845aa(r1)     // Catch:{ all -> 0x00ee }
            com.google.common.b.gu r1 = r8.f368665c     // Catch:{ all -> 0x00ee }
            r2 = 0
            com.google.common.b.sm r14 = r1.listIterator(r2)     // Catch:{ all -> 0x00ee }
        L_0x005a:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x00ee }
            r2 = r1
            com.google.android.apps.search.googleapp.discover.z.d r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r2     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = "child"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)     // Catch:{ all -> 0x00ee }
            com.google.common.b.hd r3 = r0.f368730d     // Catch:{ all -> 0x00ee }
            r1 = r15
            r4 = r13
            r5 = r18
            r6 = r20
            r1.m219477i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00ee }
            goto L_0x005a
        L_0x0078:
            java.lang.String r1 = r8.f368666d     // Catch:{ all -> 0x00ee }
            com.google.android.apps.search.googleapp.discover.z.d r2 = r0.mo112273a(r1)     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x008b
            com.google.common.b.hd r3 = r0.f368730d     // Catch:{ all -> 0x00ee }
            r1 = r15
            r4 = r13
            r5 = r18
            r6 = r20
            r1.m219477i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00ee }
        L_0x008b:
            com.google.android.apps.search.googleapp.discover.v.t r0 = r7.f368722b     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            r1 = r20
            com.google.android.apps.search.googleapp.discover.streamui.h.f r1 = r1.f366954c     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            r2 = r19
            com.google.android.apps.search.googleapp.discover.s.aw r2 = r2.f366438b     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            if (r2 != 0) goto L_0x0099
            com.google.android.apps.search.googleapp.discover.s.aw r2 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
        L_0x0099:
            java.lang.String r2 = r2.f366448d     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            java.lang.String r3 = "sessionState.structure.sessionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            r9.f368687a = r12     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            r9.f368690d = r11     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            h.c.o r3 = r0.f368290d     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            com.google.android.apps.search.googleapp.discover.v.m r4 = new com.google.android.apps.search.googleapp.discover.v.m     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            r5 = 0
            r16 = r4
            r17 = r0
            r18 = r1
            r19 = r2
            r20 = r13
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            java.lang.Object r1 = kotlinx.coroutines.C71803m.m105040a(r3, r4, r9)     // Catch:{ CancellationException -> 0x00eb, Exception -> 0x00c5 }
            if (r1 == r10) goto L_0x00c4
            r2 = r12
        L_0x00bf:
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r2, r0)
            return r1
        L_0x00c4:
            return r10
        L_0x00c5:
            r0 = move-exception
            r2 = r12
        L_0x00c7:
            com.google.common.f.e r1 = f368721a     // Catch:{ all -> 0x0032 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0032 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0032 }
            com.google.common.f.x r1 = r1.mo56382g(r0)     // Catch:{ all -> 0x0032 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "A storage exception caught from getContent"
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x0032 }
            r5 = 40457(0x9e09, float:5.6692E-41)
            r4.<init>(r5)     // Catch:{ all -> 0x0032 }
            r1.mo56379ah(r4)     // Catch:{ all -> 0x0032 }
            r1.mo56386p(r3)     // Catch:{ all -> 0x0032 }
            com.google.android.apps.search.googleapp.discover.v.bt r1 = new com.google.android.apps.search.googleapp.discover.v.bt     // Catch:{ all -> 0x0032 }
            r1.<init>(r0)     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x00eb:
            r0 = move-exception
            r2 = r12
        L_0x00ed:
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x00ee:
            r0 = move-exception
            r1 = r0
            r2 = r12
        L_0x00f1:
            throw r1     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r2, r1)
            goto L_0x00f9
        L_0x00f8:
            throw r3
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.mo112268b(com.google.android.apps.search.googleapp.discover.z.bj, com.google.android.apps.search.googleapp.discover.z.aw, j$.time.Instant, com.google.android.apps.search.googleapp.discover.s.au, com.google.android.apps.search.googleapp.discover.streamui.h.q, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.google.android.apps.search.googleapp.discover.streamui.h.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.google.android.apps.search.googleapp.discover.streamui.h.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112269c(com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135329bc
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.discover.z.bc r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135329bc) r0
            int r1 = r0.f368694d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368694d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.bc r0 = new com.google.android.apps.search.googleapp.discover.z.bc
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f368692b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368694d
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f368691a
            p5462h.C69714l.m101134b(r7)     // Catch:{ CancellationException -> 0x002e, Exception -> 0x002c }
            goto L_0x0052
        L_0x0029:
            r7 = move-exception
            goto L_0x008a
        L_0x002c:
            r7 = move-exception
            goto L_0x0061
        L_0x002e:
            r7 = move-exception
            goto L_0x0089
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            p5462h.C69714l.m101134b(r7)
            java.lang.String r7 = "TB#getSessionState"
            com.google.apps.tiktok.tracing.bi r7 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r7)
            com.google.android.apps.search.googleapp.discover.v.t r2 = r5.f368722b     // Catch:{ CancellationException -> 0x0085, Exception -> 0x005d, all -> 0x0058 }
            com.google.android.apps.search.googleapp.discover.streamui.h.f r6 = r6.f366954c     // Catch:{ CancellationException -> 0x0085, Exception -> 0x005d, all -> 0x0058 }
            r0.f368691a = r7     // Catch:{ CancellationException -> 0x0085, Exception -> 0x005d, all -> 0x0058 }
            r0.f368694d = r3     // Catch:{ CancellationException -> 0x0085, Exception -> 0x005d, all -> 0x0058 }
            java.lang.Object r6 = r2.mo112156d(r6, r0)     // Catch:{ CancellationException -> 0x0085, Exception -> 0x005d, all -> 0x0058 }
            if (r6 == r1) goto L_0x0057
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0052:
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r6, r0)
            return r7
        L_0x0057:
            return r1
        L_0x0058:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
            goto L_0x008a
        L_0x005d:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0061:
            com.google.common.f.e r0 = f368721a     // Catch:{ all -> 0x0029 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0029 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0029 }
            com.google.common.f.x r0 = r0.mo56382g(r7)     // Catch:{ all -> 0x0029 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "A storage exception caught from getSession"
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x0029 }
            r3 = 40458(0x9e0a, float:5.6694E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            r0.mo56379ah(r2)     // Catch:{ all -> 0x0029 }
            r0.mo56386p(r1)     // Catch:{ all -> 0x0029 }
            com.google.android.apps.search.googleapp.discover.v.bt r0 = new com.google.android.apps.search.googleapp.discover.v.bt     // Catch:{ all -> 0x0029 }
            r0.<init>(r7)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0085:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0089:
            throw r7     // Catch:{ all -> 0x0029 }
        L_0x008a:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.mo112269c(com.google.android.apps.search.googleapp.discover.streamui.h.q, h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo112270d(String str, int i, C135327ba baVar, Instant instant, C134766q qVar, C69577g gVar) {
        return C71803m.m105040a(this.f368726f, new C135332bf(this, qVar, instant, str, i, baVar, (C69577g) null), gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112271e(com.google.android.apps.search.googleapp.discover.p10249z.C135336bj r5, com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135333bg
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.discover.z.bg r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135333bg) r0
            int r1 = r0.f368716d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368716d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.bg r0 = new com.google.android.apps.search.googleapp.discover.z.bg
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f368714b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368716d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f368713a
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x004b
        L_0x0029:
            r6 = move-exception
            goto L_0x0056
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            java.lang.String r7 = "TB#logConditionalRenderings"
            com.google.apps.tiktok.tracing.bi r7 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r7)
            com.google.android.apps.search.googleapp.discover.z.c.f r2 = r4.f368723c     // Catch:{ all -> 0x0053 }
            com.google.common.b.gu r5 = r5.f368732f     // Catch:{ all -> 0x0053 }
            r0.f368713a = r7     // Catch:{ all -> 0x0053 }
            r0.f368716d = r3     // Catch:{ all -> 0x0053 }
            java.lang.Object r5 = r2.mo112279c(r6, r5, r0)     // Catch:{ all -> 0x0053 }
            if (r5 == r1) goto L_0x0052
            r5 = r7
        L_0x004b:
            r6 = 0
            p5462h.p5472e.C69598b.m101013a(r5, r6)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x0052:
            return r1
        L_0x0053:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L_0x0056:
            throw r6     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r7 = move-exception
            p5462h.p5472e.C69598b.m101013a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.mo112271e(com.google.android.apps.search.googleapp.discover.z.bj, com.google.android.apps.search.googleapp.discover.streamui.h.q, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112272f(com.google.android.apps.search.googleapp.discover.p10249z.C135336bj r8, com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135334bh
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.discover.z.bh r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135334bh) r0
            int r1 = r0.f368720d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368720d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.bh r0 = new com.google.android.apps.search.googleapp.discover.z.bh
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f368718b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368720d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.f368717a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0029 }
            goto L_0x007d
        L_0x0029:
            r9 = move-exception
            goto L_0x008a
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.googleapp.discover.streamui.h.c r10 = com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c.f366921a
            com.google.android.apps.search.googleapp.discover.streamui.h.f r2 = r9.f366954c
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r2)
            if (r10 != 0) goto L_0x0043
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0043:
            java.lang.String r10 = "TB#logExpirations"
            com.google.apps.tiktok.tracing.bi r10 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r10)
            com.google.android.apps.search.googleapp.discover.z.b.d r2 = r7.f368724d     // Catch:{ all -> 0x0087 }
            com.google.common.b.ij r8 = r8.f368731e     // Catch:{ all -> 0x0087 }
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x005a
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x0087 }
            com.google.apps.tiktok.tracing.contrib.b.f r8 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r8)     // Catch:{ all -> 0x0087 }
            goto L_0x006b
        L_0x005a:
            com.google.android.libraries.storage.protostore.ab r4 = r2.f368681a     // Catch:{ all -> 0x0087 }
            com.google.android.apps.search.googleapp.discover.z.b.b r5 = new com.google.android.apps.search.googleapp.discover.z.b.b     // Catch:{ all -> 0x0087 }
            r5.<init>(r2, r9, r8)     // Catch:{ all -> 0x0087 }
            java.util.concurrent.Executor r8 = r2.f368682b     // Catch:{ all -> 0x0087 }
            com.google.common.util.concurrent.cx r8 = r4.mo46039a(r5, r8)     // Catch:{ all -> 0x0087 }
            com.google.apps.tiktok.tracing.contrib.b.f r8 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r8)     // Catch:{ all -> 0x0087 }
        L_0x006b:
            java.lang.String r9 = "featureExpirationLogging…eData.featureExpirations)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ all -> 0x0087 }
            r0.f368717a = r10     // Catch:{ all -> 0x0087 }
            r0.f368720d = r3     // Catch:{ all -> 0x0087 }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ all -> 0x0087 }
            if (r8 == r1) goto L_0x0086
            r6 = r10
            r10 = r8
            r8 = r6
        L_0x007d:
            java.lang.Void r10 = (java.lang.Void) r10     // Catch:{ all -> 0x0029 }
            r9 = 0
            p5462h.p5472e.C69598b.m101013a(r8, r9)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0086:
            return r1
        L_0x0087:
            r8 = move-exception
            r9 = r8
            r8 = r10
        L_0x008a:
            throw r9     // Catch:{ all -> 0x008b }
        L_0x008b:
            r10 = move-exception
            p5462h.p5472e.C69598b.m101013a(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.mo112272f(com.google.android.apps.search.googleapp.discover.z.bj, com.google.android.apps.search.googleapp.discover.streamui.h.q, h.c.g):java.lang.Object");
    }
}
