package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import p5462h.C69613f;
import p5462h.C69747m;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.j */
/* compiled from: PG */
public final class C138300j {

    /* renamed from: a */
    public static final C69613f f376259a = new C69747m(C138274i.f376206a);

    /* renamed from: b */
    private final C138268c f376260b;

    /* renamed from: c */
    private final C138266a f376261c;

    public C138300j(C138268c cVar, C138266a aVar) {
        this.f376260b = cVar;
        this.f376261c = aVar;
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x05ab, code lost:
        if (new com.google.protobuf.C62963cj(r10.f375542e, com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f).contains(com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL) == false) goto L_0x06d6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x097b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138240s mo114234a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n r23, com.google.android.apps.search.googleapp.search.suggest.C138678v r24, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138264o r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            java.lang.String r4 = "internalResponse"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            java.lang.String r4 = "responseBuilder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "suggestionIdGenerator.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            java.lang.String r6 = r1.f376172b
            r25.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r7 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r7
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r8 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r.f376326j
            r6.getClass()
            int r8 = r7.f376328a
            r9 = 1
            r8 = r8 | r9
            r7.f376328a = r8
            r7.f376329b = r6
            r25.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r6
            r5.getClass()
            int r7 = r6.f376328a
            r8 = 2
            r7 = r7 | r8
            r6.f376328a = r7
            r6.f376330c = r5
            com.google.protobuf.cq r6 = r2.f377199c
            java.lang.String r7 = "internalResponse.suggestionsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.util.Comparator r7 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C137915aa.f375238a
            java.lang.String r10 = "getSuggestionComparatorForOneSearch()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)
            java.util.List r6 = p5462h.p5463a.C69540x.m100837S(r6, r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0067:
            boolean r10 = r6.hasNext()
            java.lang.String r12 = "value"
            java.lang.String r14 = "newBuilder()"
            if (r10 == 0) goto L_0x0987
            java.lang.Object r10 = r6.next()
            com.google.android.apps.search.googleapp.search.suggest.av r10 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r10
            java.lang.String r15 = "suggestion"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r15)
            int r11 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r11)
            if (r11 != 0) goto L_0x0086
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0086:
            com.google.android.apps.search.googleapp.search.suggest.au r8 = com.google.android.apps.search.googleapp.search.suggest.C138029au.IN_CONTEXT_CONTROL
            r18 = 0
            if (r11 != r8) goto L_0x0094
        L_0x008c:
            r21 = r5
            r19 = r6
        L_0x0090:
            r0 = r18
            goto L_0x0955
        L_0x0094:
            int r8 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r8 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r8)
            if (r8 != 0) goto L_0x009e
            com.google.android.apps.search.googleapp.search.suggest.au r8 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x009e:
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.LENS_PROMO
            if (r8 != r11) goto L_0x00a3
            goto L_0x008c
        L_0x00a3:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r8 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb.f376007r
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.al r8 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138177al) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r14)
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r13
            r11.getClass()
            r19 = r6
            int r6 = r13.f376009a
            r6 = r6 | r9
            r13.f376009a = r6
            r13.f376010b = r11
            java.lang.String r6 = r10.f375539b
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r11
            r6.getClass()
            int r13 = r11.f376009a
            r18 = 4
            r13 = r13 | 4
            r11.f376009a = r13
            r11.f376012d = r6
            java.lang.String r6 = r10.f375540c
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r11
            r6.getClass()
            int r13 = r11.f376009a
            r13 = r13 | 8
            r11.f376009a = r13
            r11.f376013e = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            r6.f376014f = r9
            int r11 = r6.f376009a
            r11 = r11 | 16
            r6.f376009a = r11
            java.lang.String r6 = r10.f375539b
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r11
            r6.getClass()
            int r13 = r11.f376009a
            r13 = r13 | 512(0x200, float:7.175E-43)
            r11.f376009a = r13
            r11.f376019k = r6
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x011c
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x011c:
            com.google.at.h.d.a.ae r6 = r6.f142334f
            if (r6 != 0) goto L_0x0122
            com.google.at.h.d.a.ae r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0122:
            com.google.protobuf.dn r6 = r6.f142297h
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r11
            com.google.protobuf.dn r13 = r11.f376020l
            boolean r9 = r13.f170058b
            if (r9 != 0) goto L_0x013b
            com.google.protobuf.dn r9 = r13.mo58980a()
            r11.f376020l = r9
        L_0x013b:
            com.google.protobuf.dn r9 = r11.f376020l
            r9.putAll(r6)
            int r6 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r6)
            if (r6 != 0) goto L_0x014a
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x014a:
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L_0x04d5;
                case 1: goto L_0x03f8;
                case 2: goto L_0x031d;
                case 3: goto L_0x02b8;
                case 4: goto L_0x0287;
                case 5: goto L_0x0173;
                case 6: goto L_0x03f8;
                default: goto L_0x0151;
            }
        L_0x0151:
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 0
            r1.f376011c = r6
            int r6 = r1.f376009a
            r9 = 2
            r6 = r6 | r9
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r1.f376009a = r6
            r6 = 1
            r1.f376018j = r6
            goto L_0x0526
        L_0x0173:
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x0179
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0179:
            int r6 = r6.f142330a
            r6 = r6 & 64
            if (r6 == 0) goto L_0x0229
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            r11 = 2
            r6.f376011c = r11
            int r13 = r6.f376009a
            r13 = r13 | r11
            r6.f376009a = r13
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x0194
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0194:
            com.google.at.h.d.a.l r6 = r6.f142338j
            if (r6 != 0) goto L_0x019a
            com.google.at.h.d.a.l r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54248l.f142431m
        L_0x019a:
            java.lang.String r11 = "suggestion.serverSuggest…yInfoSuggestionParameters"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r11)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ap r11 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138181ap.f375968e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ao r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138180ao) r11
            java.lang.String r13 = r6.f142440h
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ap r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138181ap) r9
            r13.getClass()
            int r1 = r9.f375970a
            r20 = 1
            r1 = r1 | 1
            r9.f375970a = r1
            r9.f375971b = r13
            java.lang.String r1 = r6.f142435c
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ap r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138181ap) r9
            r1.getClass()
            int r13 = r9.f375970a
            r17 = 2
            r13 = r13 | 2
            r9.f375970a = r13
            r9.f375972c = r1
            java.lang.String r1 = r6.f142434b
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ap r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138181ap) r9
            r1.getClass()
            int r13 = r9.f375970a
            r18 = 4
            r13 = r13 | 4
            r9.f375970a = r13
            r9.f375973d = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            com.google.protobuf.bv r9 = r11.build()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ap r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138181ap) r9
            r9.getClass()
            r1.f376021m = r9
            int r9 = r1.f376009a
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r1.f376009a = r9
            java.lang.String r1 = r6.f142439g
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r9
            r1.getClass()
            int r11 = r9.f376009a
            r11 = r11 | 32
            r9.f376009a = r11
            r9.f376015g = r1
            java.lang.String r1 = r6.f142436d
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            r1.getClass()
            int r9 = r6.f376009a
            r9 = r9 | 512(0x200, float:7.175E-43)
            r6.f376009a = r9
            r6.f376019k = r1
        L_0x0229:
            com.google.protobuf.cj r1 = new com.google.protobuf.cj
            com.google.protobuf.ch r6 = r10.f375542e
            com.google.protobuf.ci r9 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r1.<init>(r6, r9)
            com.google.protos.ba.a.b r6 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL
            boolean r1 = r1.contains(r6)
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            int r9 = r6.f376009a
            r9 = r9 | 64
            r6.f376009a = r9
            r6.f376016h = r1
            com.google.protobuf.cj r1 = new com.google.protobuf.cj
            com.google.protobuf.ch r6 = r10.f375542e
            com.google.protobuf.ci r9 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r1.<init>(r6, r9)
            com.google.protos.ba.a.b r6 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_TRENDS
            boolean r1 = r1.contains(r6)
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            int r9 = r6.f376009a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r6.f376009a = r9
            r6.f376017i = r1
            com.google.protobuf.cj r1 = new com.google.protobuf.cj
            com.google.protobuf.ch r6 = r10.f375542e
            com.google.protobuf.ci r9 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r1.<init>(r6, r9)
            com.google.protos.ba.a.b r6 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_TRENDS
            boolean r1 = r1.contains(r6)
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            int r9 = r6.f376009a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r6.f376009a = r9
            r9 = 1
            r1 = r1 ^ r9
            r6.f376018j = r1
            goto L_0x0526
        L_0x0287:
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 0
            r1.f376011c = r6
            int r6 = r1.f376009a
            r9 = 2
            r6 = r6 | r9
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 64
            r1.f376009a = r6
            r6 = 1
            r1.f376016h = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r9 = r1.f376009a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r1.f376009a = r9
            r1.f376018j = r6
            goto L_0x0526
        L_0x02b8:
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 0
            r1.f376011c = r6
            int r6 = r1.f376009a
            r9 = 2
            r6 = r6 | r9
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r1.f376009a = r6
            r6 = 1
            r1.f376018j = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 3
            r1.f376014f = r6
            int r6 = r1.f376009a
            r6 = r6 | 16
            r1.f376009a = r6
            com.google.at.h.d.a.aq r1 = r10.f375543g
            if (r1 != 0) goto L_0x02ef
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
            goto L_0x02f0
        L_0x02ef:
            r6 = r1
        L_0x02f0:
            int r6 = r6.f142330a
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0526
            if (r1 != 0) goto L_0x02fa
            com.google.at.h.d.a.aq r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x02fa:
            com.google.at.h.d.a.v r1 = r1.f142339k
            if (r1 != 0) goto L_0x0300
            com.google.at.h.d.a.v r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54258v.f142462c
        L_0x0300:
            java.lang.String r1 = r1.f142465b
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            int r9 = r6.f376009a
            r9 = r9 | 8
            r6.f376009a = r9
            java.lang.String r9 = "..."
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r9.concat(r1)
            r6.f376013e = r1
            goto L_0x0526
        L_0x031d:
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 4
            r1.f376011c = r6
            int r6 = r1.f376009a
            r9 = 2
            r6 = r6 | r9
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r1.f376009a = r6
            r6 = 0
            r1.f376018j = r6
            com.google.at.h.d.a.aq r1 = r10.f375543g
            if (r1 != 0) goto L_0x0344
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
            goto L_0x0345
        L_0x0344:
            r6 = r1
        L_0x0345:
            int r6 = r6.f142330a
            r6 = r6 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0526
            if (r1 != 0) goto L_0x034f
            com.google.at.h.d.a.aq r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x034f:
            com.google.at.h.d.a.h r1 = r1.f142341m
            if (r1 != 0) goto L_0x0355
            com.google.at.h.d.a.h r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54244h.f142422d
        L_0x0355:
            java.lang.String r1 = r1.f142425b
            java.lang.String r6 = "suggestion.serverSuggest…onParameters.leftHandSide"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x0362
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0362:
            com.google.at.h.d.a.h r6 = r6.f142341m
            if (r6 != 0) goto L_0x0368
            com.google.at.h.d.a.h r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54244h.f142422d
        L_0x0368:
            java.lang.String r6 = r6.f142426c
            java.lang.String r9 = "suggestion.serverSuggest…nParameters.rightHandSide"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r11 = " = "
            r9.append(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "�"
            java.lang.String r13 = "&nbsp;"
            java.lang.String r9 = p5462h.p5483m.C69764m.m101231j(r9, r11, r13)
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r11
            r9.getClass()
            int r13 = r11.f376009a
            r13 = r13 | 8
            r11.f376009a = r13
            r11.f376013e = r9
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.an r9 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138179an.f375963d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.am r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138178am) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)
            java.lang.String r11 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r11)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r12)
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.an r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138179an) r11
            r1.getClass()
            int r13 = r11.f375965a
            r18 = 1
            r13 = r13 | 1
            r11.f375965a = r13
            r11.f375966b = r1
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r12)
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.an r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138179an) r1
            r6.getClass()
            int r11 = r1.f375965a
            r13 = 2
            r11 = r11 | r13
            r1.f375965a = r11
            r1.f375967c = r6
            com.google.protobuf.bv r1 = r9.build()
            java.lang.String r6 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.an r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138179an) r1
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            r1.getClass()
            r6.f376023o = r1
            int r1 = r6.f376009a
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r6.f376009a = r1
            goto L_0x0526
        L_0x03f8:
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 5
            r1.f376011c = r6
            int r6 = r1.f376009a
            r9 = 2
            r6 = r6 | r9
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r1.f376014f = r9
            int r6 = r1.f376009a
            r6 = r6 | 16
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r1.f376009a = r6
            r6 = 0
            r1.f376018j = r6
            int r1 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r1 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r1)
            if (r1 != 0) goto L_0x0431
            com.google.android.apps.search.googleapp.search.suggest.au r1 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0431:
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION
            if (r1 != r6) goto L_0x0445
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 64
            r1.f376009a = r6
            r6 = 1
            r1.f376016h = r6
        L_0x0445:
            com.google.at.h.d.a.aq r1 = r10.f375543g
            if (r1 != 0) goto L_0x044b
            com.google.at.h.d.a.aq r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x044b:
            int r1 = r1.f142330a
            r1 = r1 & 32
            if (r1 == 0) goto L_0x04a5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ba r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138193ba.f376002d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.az r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138191az) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bh r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x0466
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0466:
            com.google.at.h.d.a.n r6 = r6.f142337i
            if (r6 != 0) goto L_0x046c
            com.google.at.h.d.a.n r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54250n.f142445d
        L_0x046c:
            java.lang.String r6 = r6.f142449c
            java.lang.String r9 = "suggestion.serverSuggest…uggestionParameters.title"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r12)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.az r9 = r1.f376028a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ba r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138193ba) r9
            r6.getClass()
            int r11 = r9.f376004a
            r13 = 1
            r11 = r11 | r13
            r9.f376004a = r11
            r9.f376005b = r6
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x0490
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0490:
            com.google.at.h.d.a.n r6 = r6.f142337i
            if (r6 != 0) goto L_0x0496
            com.google.at.h.d.a.n r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54250n.f142445d
        L_0x0496:
            java.lang.String r6 = r6.f142448b
            java.lang.String r9 = "suggestion.serverSuggest…nSuggestionParameters.url"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            r1.mo114198b(r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ba r1 = r1.mo114197a()
            goto L_0x04c2
        L_0x04a5:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ba r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138193ba.f376002d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.az r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138191az) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bh r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            java.lang.String r6 = r10.f375539b
            java.lang.String r9 = "suggestion.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            r1.mo114198b(r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ba r1 = r1.mo114197a()
        L_0x04c2:
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r6
            r1.getClass()
            r6.f376024p = r1
            int r1 = r6.f376009a
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r6.f376009a = r1
            goto L_0x0526
        L_0x04d5:
            com.google.protobuf.cj r1 = new com.google.protobuf.cj
            com.google.protobuf.ch r6 = r10.f375542e
            com.google.protobuf.ci r9 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r1.<init>(r6, r9)
            com.google.protos.ba.a.b r6 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_TRENDS
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x0506
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 1
            r1.f376011c = r6
            int r9 = r1.f376009a
            r11 = 2
            r9 = r9 | r11
            r1.f376009a = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r9 = r1.f376009a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r1.f376009a = r9
            r1.f376017i = r6
            goto L_0x0526
        L_0x0506:
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 0
            r1.f376011c = r6
            int r6 = r1.f376009a
            r9 = 2
            r6 = r6 | r9
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r1.f376009a = r6
            r6 = 1
            r1.f376018j = r6
        L_0x0526:
            com.google.at.h.d.a.aq r1 = r10.f375543g
            if (r1 != 0) goto L_0x052c
            com.google.at.h.d.a.aq r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x052c:
            com.google.at.h.d.a.ae r1 = r1.f142334f
            if (r1 != 0) goto L_0x0532
            com.google.at.h.d.a.ae r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0532:
            boolean r1 = r1.f142307r
            if (r1 == 0) goto L_0x0546
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r1.f376009a = r6
            r6 = 0
            r1.f376018j = r6
        L_0x0546:
            boolean r1 = com.google.android.apps.search.googleapp.search.suggest.p10453e.C138079a.m224413b(r10)
            if (r1 == 0) goto L_0x0571
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r6 = 3
            r1.f376011c = r6
            int r6 = r1.f376009a
            r9 = 2
            r6 = r6 | r9
            r1.f376009a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            int r6 = r1.f376009a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r1.f376009a = r6
            r6 = 0
            r1.f376018j = r6
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.a r1 = r0.f376261c
            r1.mo114222a(r10, r8)
        L_0x0571:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.c r1 = r0.f376260b
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            int r6 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r9 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r6)
            if (r9 != 0) goto L_0x0583
            com.google.android.apps.search.googleapp.search.suggest.au r9 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0583:
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_QUERY
            java.lang.String r13 = "learnMoreUrl"
            java.lang.String r0 = "res.getString(R.string.g…_more_link, learnMoreUrl)"
            r21 = r5
            r5 = 2132086965(0x7f1510b5, float:1.9814172E38)
            if (r9 == r11) goto L_0x05ad
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r6)
            if (r6 != 0) goto L_0x0598
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0598:
            com.google.android.apps.search.googleapp.search.suggest.au r9 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION
            if (r6 == r9) goto L_0x05ad
            com.google.protobuf.cj r6 = new com.google.protobuf.cj
            com.google.protobuf.ch r9 = r10.f375542e
            com.google.protobuf.ci r11 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r6.<init>(r9, r11)
            com.google.protos.ba.a.b r9 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL
            boolean r6 = r6.contains(r9)
            if (r6 == 0) goto L_0x06d6
        L_0x05ad:
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x05b3
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x05b3:
            com.google.at.h.d.a.ae r6 = r6.f142334f
            if (r6 != 0) goto L_0x05b9
            com.google.at.h.d.a.ae r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x05b9:
            int r6 = r6.f142290a
            r6 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x06d6
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ai r6 = r1.f376184b
            java.lang.String r9 = "delete_recent_history"
            java.lang.String r6 = r6.mo114431e(r9)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r9 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av.f375986h
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.aq r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138182aq) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bf r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            int r11 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r11)
            if (r11 != 0) goto L_0x05e3
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x05e3:
            com.google.android.apps.search.googleapp.search.suggest.au r15 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION
            if (r11 != r15) goto L_0x05fa
            android.content.Context r11 = r1.f376183a
            android.content.res.Resources r11 = r11.getResources()
            r15 = 2132086979(0x7f1510c3, float:1.98142E38)
            java.lang.String r11 = r11.getString(r15)
            java.lang.String r15 = "{\n          res.getStrin…ove_pnav_title)\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r15)
            goto L_0x060c
        L_0x05fa:
            android.content.Context r11 = r1.f376183a
            android.content.res.Resources r11 = r11.getResources()
            r15 = 2132086994(0x7f1510d2, float:1.981423E38)
            java.lang.String r11 = r11.getString(r15)
            java.lang.String r15 = "{\n          res.getStrin…deletion_title)\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r15)
        L_0x060c:
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r12)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.aq r12 = r9.f376027a
            r12.copyOnWrite()
            com.google.protobuf.bv r12 = r12.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r12 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av) r12
            r11.getClass()
            int r15 = r12.f375988a
            r16 = 1
            r15 = r15 | 1
            r12.f375988a = r15
            r12.f375989b = r11
            int r11 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r11)
            if (r11 != 0) goto L_0x062f
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x062f:
            com.google.android.apps.search.googleapp.search.suggest.au r12 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION
            if (r11 != r12) goto L_0x0646
            android.content.Context r11 = r1.f376183a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2132086980(0x7f1510c4, float:1.9814202E38)
            java.lang.String r11 = r11.getString(r12)
            java.lang.String r12 = "{\n          res.getStrin…istory_message)\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            goto L_0x0651
        L_0x0646:
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ai r11 = r1.f376184b
            java.lang.String r11 = r11.mo114428b(r10)
            java.lang.String r12 = "{\n          textUtils.ge…age(suggestion)\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
        L_0x0651:
            r9.mo114196f(r11)
            android.content.Context r11 = r1.f376183a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 1
            java.lang.Object[] r15 = new java.lang.Object[r12]
            r12 = 0
            r15[r12] = r6
            java.lang.String r5 = r11.getString(r5, r15)
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            r9.mo114192b(r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r13)
            r9.mo114193c(r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138186au.f375981d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ar r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138183ar) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bd r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            android.content.Context r5 = r1.f376183a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2132086991(0x7f1510cf, float:1.9814225E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "res.getString(R.string.g…y_deletion_delete_button)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.mo114190c(r5)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.at r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138185at.DELETE
            r0.mo114189b(r5)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r0.mo114188a()
            r9.mo114195e(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138186au.f375981d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ar r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138183ar) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bd r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            android.content.Context r1 = r1.f376183a
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2132086990(0x7f1510ce, float:1.9814223E38)
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r5 = "res.getString(R.string.g…y_deletion_cancel_button)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            r0.mo114190c(r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.at r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138185at.NONE
            r0.mo114189b(r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r0.mo114188a()
            r9.mo114194d(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r9.mo114191a()
            goto L_0x0939
        L_0x06d6:
            com.google.at.h.d.a.aq r6 = r10.f375543g
            if (r6 != 0) goto L_0x06dc
            com.google.at.h.d.a.aq r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x06dc:
            com.google.at.h.d.a.ae r6 = r6.f142334f
            if (r6 != 0) goto L_0x06e2
            com.google.at.h.d.a.ae r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x06e2:
            int r6 = r6.f142290a
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r6 = r6 & r9
            r9 = 2132086977(0x7f1510c1, float:1.9814196E38)
            if (r6 == 0) goto L_0x077d
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ai r6 = r1.f376184b
            java.lang.String r6 = r6.mo114430d(r10)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r11 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av.f375986h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.aq r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138182aq) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bf r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            android.content.Context r12 = r1.f376183a
            android.content.res.Resources r12 = r12.getResources()
            com.google.at.h.d.a.aq r13 = r10.f375543g
            if (r13 != 0) goto L_0x0710
            com.google.at.h.d.a.aq r13 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0710:
            com.google.at.h.d.a.ae r13 = r13.f142334f
            if (r13 != 0) goto L_0x0716
            com.google.at.h.d.a.ae r13 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0716:
            com.google.protos.ba.n r13 = r13.f142313x
            if (r13 != 0) goto L_0x071c
            com.google.protos.ba.n r13 = com.google.protos.p4948ba.C64384n.f174622b
        L_0x071c:
            int r13 = r13.f174624a
            com.google.protos.ba.m r13 = com.google.protos.p4948ba.C64383m.m96397a(r13)
            if (r13 != 0) goto L_0x0726
            com.google.protos.ba.m r13 = com.google.protos.p4948ba.C64383m.CATEGORY_UNSPECIFIED
        L_0x0726:
            int r14 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r14 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r14)
            if (r14 != 0) goto L_0x0730
            com.google.android.apps.search.googleapp.search.suggest.au r14 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0730:
            int[] r15 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138267b.f376182a
            int r14 = r14.ordinal()
            r14 = r15[r14]
            r15 = 1
            if (r14 != r15) goto L_0x073e
            r9 = 2132086960(0x7f1510b0, float:1.9814162E38)
        L_0x073e:
            int r9 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138630ai.m225126a(r13, r9)
            java.lang.String r9 = r12.getString(r9)
            java.lang.String r12 = "res.getString(\n         …  }\n          )\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r12)
            r11.mo114196f(r9)
            if (r6 == 0) goto L_0x0769
            android.content.Context r9 = r1.f376183a
            android.content.res.Resources r9 = r9.getResources()
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r12 = 0
            r13[r12] = r6
            java.lang.String r5 = r9.getString(r5, r13)
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            r11.mo114192b(r5)
            r11.mo114193c(r6)
        L_0x0769:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r1.mo114223a()
            r11.mo114195e(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r1.mo114224b()
            r11.mo114194d(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r11.mo114191a()
            goto L_0x0939
        L_0x077d:
            int r6 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r6)
            if (r11 != 0) goto L_0x0787
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0787:
            com.google.android.apps.search.googleapp.search.suggest.au r12 = com.google.android.apps.search.googleapp.search.suggest.C138029au.CALCULATOR_OB
            r15 = 106230(0x19ef6, float:1.4886E-40)
            if (r11 != r12) goto L_0x07fd
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av.f375986h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.aq r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138182aq) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bf r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            android.content.Context r5 = r1.f376183a
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getString(r9)
            java.lang.String r6 = "res.getString(R.string.g…query_suggestion_message)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.mo114196f(r5)
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ai r5 = r1.f376184b
            r6 = 2132086976(0x7f1510c0, float:1.9814194E38)
            java.lang.String r5 = r5.mo114429c(r6, r15)
            java.lang.String r6 = "textUtils.generateLearnM…lar_query_learn_more_url)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.mo114193c(r5)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r5 = r1.mo114223a()
            r0.mo114195e(r5)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138186au.f375981d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ar r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138183ar) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bd r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            android.content.Context r1 = r1.f376183a
            android.content.res.Resources r1 = r1.getResources()
            r6 = 2132086951(0x7f1510a7, float:1.9814144E38)
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "res.getString(R.string.ga_common_learn_more)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            r5.mo114190c(r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.at r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138185at.LEARN_MORE
            r5.mo114189b(r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r1 = r5.mo114188a()
            r0.mo114194d(r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r0.mo114191a()
            goto L_0x0939
        L_0x07fd:
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r6)
            if (r6 != 0) goto L_0x0805
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0805:
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.NAVIGATION
            if (r6 != r11) goto L_0x0841
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av.f375986h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.aq r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138182aq) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bf r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            android.content.Context r5 = r1.f376183a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2132086978(0x7f1510c2, float:1.9814198E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "res.getString(R.string.g…r_url_suggestion_message)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.mo114196f(r5)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r5 = r1.mo114223a()
            r0.mo114195e(r5)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r1 = r1.mo114224b()
            r0.mo114194d(r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r0.mo114191a()
            goto L_0x0939
        L_0x0841:
            com.google.protobuf.cj r6 = new com.google.protobuf.cj
            com.google.protobuf.ch r11 = r10.f375542e
            com.google.protobuf.ci r12 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r6.<init>(r11, r12)
            com.google.protos.ba.a.b r11 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_TRENDS
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x08af
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ai r6 = r1.f376184b
            r9 = 2132086999(0x7f1510d7, float:1.981424E38)
            java.lang.String r6 = r6.mo114429c(r9, r15)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r9 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av.f375986h
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.aq r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138182aq) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bf r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            android.content.Context r11 = r1.f376183a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2132087000(0x7f1510d8, float:1.9814243E38)
            java.lang.String r11 = r11.getString(r12)
            java.lang.String r12 = "res.getString(R.string.g…rends_suggestion_message)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            r9.mo114196f(r11)
            android.content.Context r11 = r1.f376183a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 1
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r12 = 0
            r14[r12] = r6
            java.lang.String r5 = r11.getString(r5, r14)
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            r9.mo114192b(r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r13)
            r9.mo114193c(r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r1.mo114223a()
            r9.mo114195e(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r1.mo114224b()
            r9.mo114194d(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r9.mo114191a()
            goto L_0x0939
        L_0x08af:
            com.google.protobuf.cj r6 = new com.google.protobuf.cj
            com.google.protobuf.ch r11 = r10.f375542e
            com.google.protobuf.ci r12 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r6.<init>(r11, r12)
            com.google.protos.ba.a.b r11 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_ONBOARDING
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x08c8
            r0 = 2132086971(0x7f1510bb, float:1.9814184E38)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r1.mo114225c(r0)
            goto L_0x0939
        L_0x08c8:
            com.google.protobuf.cj r6 = new com.google.protobuf.cj
            com.google.protobuf.ch r11 = r10.f375542e
            com.google.protobuf.ci r12 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r6.<init>(r11, r12)
            com.google.protos.ba.a.b r11 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_VASCO
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x08e1
            r0 = 2132087001(0x7f1510d9, float:1.9814245E38)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r1.mo114225c(r0)
            goto L_0x0939
        L_0x08e1:
            com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ai r6 = r1.f376184b
            r11 = 2132086976(0x7f1510c0, float:1.9814194E38)
            java.lang.String r6 = r6.mo114429c(r11, r15)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r11 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av.f375986h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.aq r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138182aq) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bf r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            android.content.Context r12 = r1.f376183a
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r9 = r12.getString(r9)
            java.lang.String r12 = "res.getString(R.string.g…query_suggestion_message)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r12)
            r11.mo114196f(r9)
            android.content.Context r9 = r1.f376183a
            android.content.res.Resources r9 = r9.getResources()
            r12 = 1
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r12 = 0
            r14[r12] = r6
            java.lang.String r5 = r9.getString(r5, r14)
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            r11.mo114192b(r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r13)
            r11.mo114193c(r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r1.mo114223a()
            r11.mo114195e(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au r0 = r1.mo114224b()
            r11.mo114194d(r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.av r0 = r11.mo114191a()
        L_0x0939:
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r1
            r0.getClass()
            r1.f376025q = r0
            int r0 = r1.f376009a
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.f376009a = r0
            com.google.protobuf.bv r0 = r8.build()
            r18 = r0
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r18 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r18
            goto L_0x0090
        L_0x0955:
            if (r0 == 0) goto L_0x097b
            r25.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r1
            com.google.protobuf.cq r5 = r1.f376331d
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x096c
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)
            r1.f376331d = r5
        L_0x096c:
            com.google.protobuf.cq r1 = r1.f376331d
            r1.add(r0)
            java.lang.String r0 = r0.f376010b
            java.lang.String r1 = "oneSearchSuggestion.suggestionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            r7.put(r0, r10)
        L_0x097b:
            r0 = r22
            r1 = r23
            r6 = r19
            r5 = r21
            r8 = 2
            r9 = 1
            goto L_0x0067
        L_0x0987:
            r21 = r5
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            h.f r0 = f376259a
            java.lang.Object r0 = r0.mo5768a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x09ba
            r25.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r0
            r1 = 3
            r0.f376334g = r1
            int r4 = r0.f376328a
            r4 = r4 | 16
            r0.f376328a = r4
            r25.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r0
            int r4 = r0.f376328a
            r4 = r4 | 32
            r0.f376328a = r4
            r0.f376335h = r1
            goto L_0x09d9
        L_0x09ba:
            r25.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r0
            r1 = 4
            r0.f376334g = r1
            int r4 = r0.f376328a
            r4 = r4 | 16
            r0.f376328a = r4
            r25.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r0
            int r4 = r0.f376328a
            r4 = r4 | 32
            r0.f376328a = r4
            r0.f376335h = r1
        L_0x09d9:
            r0 = 1
            r3.mo114221a(r0)
            r0 = 2
            r3.mo114221a(r0)
            com.google.android.apps.search.googleapp.search.suggest.t r0 = r2.f377200d
            if (r0 != 0) goto L_0x09e7
            com.google.android.apps.search.googleapp.search.suggest.t r0 = com.google.android.apps.search.googleapp.search.suggest.C138542t.f376811i
        L_0x09e7:
            java.lang.String r1 = "internalResponse.responseParameters"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.String r1 = "responseId"
            r2 = r21
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r1)
            java.lang.String r1 = "getSuggestionsRequest"
            r3 = r23
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r1)
            java.lang.String r1 = "responseParams"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r1 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138240s.f376117f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.o r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138236o) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.u r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            r1.mo114219f()
            r1.mo114217d(r2, r3)
            r1.mo114218e()
            r1.mo114216c(r7)
            r1.mo114220g()
            java.lang.String r3 = "key"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r12)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.o r3 = r1.f376125a
            r2.getClass()
            r0.getClass()
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138240s) r3
            com.google.protobuf.dn r3 = r3.mo114213c()
            r3.put(r2, r0)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r0 = r1.mo114214a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138300j.mo114234a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n, com.google.android.apps.search.googleapp.search.suggest.v, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.o):com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s");
    }
}
