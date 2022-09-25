package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d.C37122d;
import com.google.apps.tiktok.dataservice.C46877q;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.j */
/* compiled from: PG */
public final class C37106j {

    /* renamed from: a */
    private static final String[] f96651a = {"contact_id", "display_name", "data4", "data1", "starred"};

    /* renamed from: b */
    private final C46877q f96652b;

    /* renamed from: c */
    private final C37122d f96653c;

    /* renamed from: d */
    private final Set f96654d;

    public C37106j(C46877q qVar, C37122d dVar, Set set) {
        this.f96652b = qVar;
        this.f96653c = dVar;
        this.f96654d = set;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.libraries.search.assistant.y.s.a.b.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.libraries.search.assistant.y.s.a.b.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.libraries.search.assistant.y.s.a.b.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40635a(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37104h
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.assistant.y.s.a.b.h r0 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37104h) r0
            int r1 = r0.f96650d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96650d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.y.s.a.b.h r0 = new com.google.android.libraries.search.assistant.y.s.a.b.h
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f96648b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f96650d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f96647a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0053
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0031:
            p5462h.C69714l.m101134b(r11)
            com.google.apps.tiktok.dataservice.q r4 = r10.f96652b
            android.net.Uri r5 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String[] r6 = f96651a
            r7 = 0
            r8 = 0
            r9 = 0
            com.google.apps.tiktok.concurrent.o r11 = r4.mo50872b(r5, r6, r7, r8, r9)
            com.google.android.libraries.search.assistant.y.s.a.b.i r2 = new com.google.android.libraries.search.assistant.y.s.a.b.i
            r2.<init>()
            r0.f96647a = r10
            r0.f96650d = r3
            com.google.android.libraries.search.assistant.y.s.a.d.d r4 = r10.f96653c
            java.lang.Object r11 = r4.mo40645a(r11, r2, r0)
            if (r11 == r1) goto L_0x0180
            r0 = r10
        L_0x0053:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x005e:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0081
            java.lang.Object r2 = r11.next()
            r4 = r2
            com.google.android.libraries.search.assistant.y.s.a.b.g r4 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37103g) r4
            java.lang.String r4 = r4.f96643a
            java.lang.Object r5 = r1.get(r4)
            if (r5 != 0) goto L_0x007b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r4, r5)
        L_0x007b:
            java.util.List r5 = (java.util.List) r5
            r5.add(r2)
            goto L_0x005e
        L_0x0081:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x008e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r4 = r0
            com.google.android.libraries.search.assistant.y.s.a.b.j r4 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37106j) r4
            java.util.Set r4 = r4.f96654d
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r11.put(r4, r2)
            goto L_0x008e
        L_0x00b5:
            java.util.Collection r11 = r11.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x00c2:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x017f
            java.lang.Object r1 = r11.next()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            java.lang.Object r2 = p5462h.p5463a.C69540x.m100822D(r1, r2)
            com.google.android.libraries.search.assistant.y.s.a.b.g r2 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37103g) r2
            r4 = 0
            if (r2 != 0) goto L_0x00da
            goto L_0x0178
        L_0x00da:
            java.lang.String r5 = r2.f96643a
            java.lang.Long r5 = p5462h.p5483m.C69764m.m101226e(r5)
            if (r5 == 0) goto L_0x0178
            long r4 = r5.longValue()
            java.lang.String r6 = r2.f96644b
            boolean r2 = r2.f96646d
            com.google.assistant.e.j.yp r7 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.yo r7 = (com.google.assistant.p3897e.p3921j.C52622yo) r7
            java.lang.String r8 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            com.google.assistant.e.j.yt r8 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.ys r8 = (com.google.assistant.p3897e.p3921j.C52626ys) r8
            r8.mo53900b(r4)
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.assistant.e.j.yp r4 = (com.google.assistant.p3897e.p3921j.C52623yp) r4
            com.google.protobuf.bv r5 = r8.build()
            com.google.assistant.e.j.yt r5 = (com.google.assistant.p3897e.p3921j.C52627yt) r5
            r5.getClass()
            r4.f138165b = r5
            int r5 = r4.f138164a
            r5 = r5 | r3
            r4.f138164a = r5
            com.google.assistant.e.j.yn r4 = com.google.assistant.p3897e.p3921j.C52621yn.f138154g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.ym r4 = (com.google.assistant.p3897e.p3921j.C52620ym) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.yn r5 = (com.google.assistant.p3897e.p3921j.C52621yn) r5
            int r8 = r5.f138156a
            r8 = r8 | 2
            r5.f138156a = r8
            r5.f138158c = r6
            r7.mo53892e(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0137:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0149
            java.lang.Object r4 = r1.next()
            com.google.android.libraries.search.assistant.y.s.a.b.g r4 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37103g) r4
            com.google.assistant.e.j.yv r4 = r4.f96645c
            r7.mo53895h(r4)
            goto L_0x0137
        L_0x0149:
            com.google.assistant.e.j.adm r1 = com.google.assistant.p3897e.p3921j.adm.f134889h
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.adf r1 = (com.google.assistant.p3897e.p3921j.adf) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.j.adm r4 = (com.google.assistant.p3897e.p3921j.adm) r4
            com.google.protobuf.bv r5 = r7.build()
            com.google.assistant.e.j.yp r5 = (com.google.assistant.p3897e.p3921j.C52623yp) r5
            r5.getClass()
            r4.f134892b = r5
            int r5 = r4.f134891a
            r5 = r5 | r3
            r4.f134891a = r5
            com.google.protobuf.bv r1 = r1.build()
            java.lang.String r4 = "newBuilder().setPersonData(personBuilder).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            com.google.assistant.e.j.adm r1 = (com.google.assistant.p3897e.p3921j.adm) r1
            com.google.android.libraries.search.assistant.y.s.a.b.d r4 = new com.google.android.libraries.search.assistant.y.s.a.b.d
            r4.<init>(r1, r2)
        L_0x0178:
            if (r4 == 0) goto L_0x00c2
            r0.add(r4)
            goto L_0x00c2
        L_0x017f:
            return r0
        L_0x0180:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37106j.mo40635a(h.c.g):java.lang.Object");
    }
}
