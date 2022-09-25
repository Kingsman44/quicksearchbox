package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d;
import com.google.android.libraries.search.assistant.p2828y.p2862s.C37149e;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a.C37087b;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37102f;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37117d;
import com.google.assistant.p3897e.p3917i.p3918a.C51596no;
import com.google.assistant.p3897e.p3917i.p3918a.C51598nq;
import com.google.assistant.p3897e.p3917i.p3918a.C51601nt;
import com.google.assistant.p3897e.p3917i.p3918a.C51602nu;
import com.google.assistant.p3897e.p3917i.p3918a.C51603nv;
import com.google.assistant.p3897e.p3917i.p3918a.C51605nx;
import com.google.assistant.p3897e.p3917i.p3918a.C51606ny;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.l */
/* compiled from: PG */
public final class C37131l implements C37149e {

    /* renamed from: a */
    private static final C59071e f96716a = C59071e.m91331h();

    /* renamed from: b */
    private final C37117d f96717b;

    /* renamed from: c */
    private final C37087b f96718c;

    /* renamed from: d */
    private final C37096b f96719d;

    /* renamed from: e */
    private final C71422aw f96720e;

    /* renamed from: f */
    private final C37102f f96721f;

    public C37131l(C37102f fVar, C37117d dVar, C37087b bVar, C37096b bVar2, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f96721f = fVar;
        this.f96717b = dVar;
        this.f96718c = bVar;
        this.f96719d = bVar2;
        this.f96720e = awVar;
    }

    /* renamed from: c */
    private final C51606ny m65890c(C51605nx nxVar, List list, C69626l lVar) {
        C51603nv nvVar = (C51603nv) C51606ny.f134497d.createBuilder();
        C69664n.m101060f(nvVar, "newBuilder()");
        C51598nq a = C69664n.m101061g(nvVar, "builder");
        a.mo53655b(nxVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C37125f fVar = (C37125f) it.next();
            a.mo53657d();
            C51601nt ntVar = (C51601nt) C51602nu.f134484e.createBuilder();
            C69664n.m101060f(ntVar, "newBuilder()");
            C51596no a2 = C69664n.m101061g(ntVar, "builder");
            C52623yp ypVar = fVar.f96698e.f134892b;
            if (ypVar == null) {
                ypVar = C52623yp.f138162g;
            }
            String str = ((C52621yn) ypVar.f138166c.get(0)).f138158c;
            C69664n.m101060f(str, "personalContactData.pers…ta.getName(0).displayName");
            a2.mo53653b(str);
            float floatValue = ((Number) lVar.mo5761a(fVar)).floatValue();
            C51601nt ntVar2 = a2.f134481a;
            ntVar2.copyOnWrite();
            C51602nu nuVar = (C51602nu) ntVar2.instance;
            nuVar.f134486a |= 2;
            nuVar.f134488c = floatValue;
            adm adm = fVar.f96698e;
            C69664n.m101061g(adm, "value");
            C51601nt ntVar3 = a2.f134481a;
            ntVar3.copyOnWrite();
            C51602nu nuVar2 = (C51602nu) ntVar3.instance;
            adm.getClass();
            nuVar2.f134489d = adm;
            nuVar2.f134486a |= 4;
            a.mo53656c(a2.mo53652a());
        }
        return a.mo53654a();
    }

    /* renamed from: a */
    public final C60870cx mo40647a(C37148d dVar) {
        C69664n.m101061g(dVar, "configuration");
        C59052c cVar = (C59052c) f96716a.mo56224b();
        cVar.mo56379ah(new C59094n(52517));
        cVar.mo56386p("fetch top contacts");
        return C71663i.m104692e(this.f96720e, (C71424ay) null, new C37126g(this, dVar, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: com.google.android.libraries.search.assistant.y.s.a.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40648b(com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d r22, p5462h.p5466c.C69577g r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37127h
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.libraries.search.assistant.y.s.a.h r2 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37127h) r2
            int r3 = r2.f96712h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f96712h = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.y.s.a.h r2 = new com.google.android.libraries.search.assistant.y.s.a.h
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f96710f
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f96712h
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x005c
            if (r4 == r8) goto L_0x0052
            if (r4 == r7) goto L_0x0045
            if (r4 != r6) goto L_0x003d
            java.lang.Object r3 = r2.f96709e
            java.lang.Object r4 = r2.f96708d
            java.lang.Object r5 = r2.f96707c
            java.lang.Object r6 = r2.f96706b
            java.lang.Object r2 = r2.f96705a
            p5462h.C69714l.m101134b(r1)
            goto L_0x0134
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r4 = r2.f96708d
            java.lang.Object r7 = r2.f96707c
            java.lang.Object r9 = r2.f96706b
            java.lang.Object r10 = r2.f96705a
            p5462h.C69714l.m101134b(r1)
            goto L_0x00d2
        L_0x0052:
            java.lang.Object r4 = r2.f96707c
            java.lang.Object r9 = r2.f96706b
            java.lang.Object r10 = r2.f96705a
            p5462h.C69714l.m101134b(r1)
            goto L_0x0079
        L_0x005c:
            p5462h.C69714l.m101134b(r1)
            com.google.android.libraries.search.assistant.y.s.a.b r1 = r0.f96719d
            com.google.android.libraries.search.assistant.y.s.a.b.f r4 = r0.f96721f
            r2.f96705a = r0
            r9 = r22
            r2.f96706b = r9
            r2.f96707c = r1
            r2.f96712h = r8
            java.lang.Object r4 = r4.mo40631a(r2)
            if (r4 == r3) goto L_0x02c7
            r10 = r0
            r20 = r4
            r4 = r1
            r1 = r20
        L_0x0079:
            java.util.List r1 = (java.util.List) r1
            r11 = r9
            com.google.android.libraries.search.assistant.y.s.d r11 = (com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d) r11
            boolean r11 = r11.mo40660a()
            if (r11 == 0) goto L_0x00d6
            r11 = r10
            com.google.android.libraries.search.assistant.y.s.a.l r11 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37131l) r11
            com.google.android.libraries.search.assistant.y.s.a.a.b r11 = r11.f96718c
            r2.f96705a = r10
            r2.f96706b = r9
            r2.f96707c = r4
            r2.f96708d = r1
            r2.f96712h = r7
            com.google.android.libraries.search.assistant.y.s.a.a.e r11 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a.C37090e) r11
            com.google.common.v.i r7 = r11.f96605d
            j$.time.Instant r7 = r7.mo57444a()
            j$.time.Duration r12 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a.C37090e.f96603b
            j$.time.Instant r7 = r7.minus(r12)
            long r12 = r7.toEpochMilli()
            com.google.apps.tiktok.dataservice.q r14 = r11.f96606e
            android.net.Uri r15 = android.provider.CallLog.Calls.CONTENT_URI
            java.lang.String[] r16 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a.C37090e.f96604c
            java.lang.String[] r7 = new java.lang.String[r8]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r7[r5] = r12
            java.lang.String r17 = "date > ?"
            java.lang.String r19 = "date DESC"
            r18 = r7
            com.google.apps.tiktok.concurrent.o r7 = r14.mo50872b(r15, r16, r17, r18, r19)
            com.google.android.libraries.search.assistant.y.s.a.a.d r12 = new com.google.android.libraries.search.assistant.y.s.a.a.d
            com.google.android.libraries.search.assistant.y.s.a.a.c r13 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a.C37090e.f96602a
            r12.<init>(r13)
            com.google.android.libraries.search.assistant.y.s.a.d.d r11 = r11.f96607f
            java.lang.Object r7 = r11.mo40645a(r7, r12, r2)
            if (r7 == r3) goto L_0x00d5
            r20 = r4
            r4 = r1
            r1 = r7
            r7 = r20
        L_0x00d2:
            java.util.List r1 = (java.util.List) r1
            goto L_0x00de
        L_0x00d5:
            return r3
        L_0x00d6:
            h.a.am r7 = p5462h.p5463a.C69496am.f185918a
            r20 = r4
            r4 = r1
            r1 = r7
            r7 = r20
        L_0x00de:
            r11 = r9
            com.google.android.libraries.search.assistant.y.s.d r11 = (com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d) r11
            boolean r11 = r11.mo40661b()
            if (r11 == 0) goto L_0x013d
            r11 = r10
            com.google.android.libraries.search.assistant.y.s.a.l r11 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37131l) r11
            com.google.android.libraries.search.assistant.y.s.a.c.d r11 = r11.f96717b
            r2.f96705a = r10
            r2.f96706b = r9
            r2.f96707c = r7
            r2.f96708d = r4
            r2.f96709e = r1
            r2.f96712h = r6
            com.google.android.libraries.search.assistant.y.s.a.c.b r11 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37115b) r11
            com.google.common.v.i r6 = r11.f96675c
            j$.time.Instant r6 = r6.mo57444a()
            j$.time.Duration r12 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37115b.f96674b
            j$.time.Instant r6 = r6.minus(r12)
            long r12 = r6.toEpochMilli()
            com.google.apps.tiktok.dataservice.q r14 = r11.f96676d
            android.net.Uri r15 = android.provider.Telephony.Sms.CONTENT_URI
            java.lang.String[] r16 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37115b.f96673a
            java.lang.String[] r6 = new java.lang.String[r8]
            java.lang.String r8 = java.lang.String.valueOf(r12)
            r6[r5] = r8
            java.lang.String r17 = "date > ?"
            java.lang.String r19 = "date DESC"
            r18 = r6
            com.google.apps.tiktok.concurrent.o r5 = r14.mo50872b(r15, r16, r17, r18, r19)
            com.google.android.libraries.search.assistant.y.s.a.c.a r6 = new com.google.android.libraries.search.assistant.y.s.a.c.a
            r6.<init>()
            com.google.android.libraries.search.assistant.y.s.a.d.d r8 = r11.f96677e
            java.lang.Object r2 = r8.mo40645a(r5, r6, r2)
            if (r2 == r3) goto L_0x013c
            r3 = r1
            r1 = r2
            r5 = r7
            r6 = r9
            r2 = r10
        L_0x0134:
            java.util.List r1 = (java.util.List) r1
            r10 = r2
            r7 = r5
            r9 = r6
            r2 = r1
            r1 = r3
            goto L_0x013f
        L_0x013c:
            return r3
        L_0x013d:
            h.a.am r2 = p5462h.p5463a.C69496am.f185918a
        L_0x013f:
            java.lang.String r3 = "contacts"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r3)
            java.lang.String r3 = "calls"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            java.lang.String r3 = "texts"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0157:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x017a
            java.lang.Object r5 = r1.next()
            r6 = r5
            com.google.android.libraries.search.assistant.y.s.a.a.a r6 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a.C37086a) r6
            java.lang.String r6 = r6.f96600c
            java.lang.Object r8 = r3.get(r6)
            if (r8 != 0) goto L_0x0174
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3.put(r6, r8)
        L_0x0174:
            java.util.List r8 = (java.util.List) r8
            r8.add(r5)
            goto L_0x0157
        L_0x017a:
            com.google.android.libraries.search.assistant.y.s.a.a r1 = new com.google.android.libraries.search.assistant.y.s.a.a
            r5 = 0
            r1.<init>(r2, r5)
            h.l.o r2 = new h.l.o
            r2.<init>(r1)
            java.util.List r1 = p5462h.p5482l.C69734n.m101138f(r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0192:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = r1.next()
            h.i r5 = (p5462h.C69685i) r5
            java.lang.Object r6 = r5.f186052a
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r2.get(r6)
            if (r8 != 0) goto L_0x01b0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.put(r6, r8)
        L_0x01b0:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r5 = r5.f186053b
            com.google.android.libraries.search.assistant.y.s.a.c.c r5 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37116c) r5
            r8.add(r5)
            goto L_0x0192
        L_0x01ba:
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r6 = p5462h.p5463a.C69540x.m100804k(r4, r5)
            r1.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x01c9:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0253
            java.lang.Object r6 = r4.next()
            com.google.android.libraries.search.assistant.y.s.a.b.d r6 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37100d) r6
            java.util.Set r8 = r6.f96636c
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = p5462h.p5463a.C69540x.m100804k(r8, r5)
            r11.<init>(r12)
            java.util.Iterator r8 = r8.iterator()
        L_0x01e4:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x01fe
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r3.get(r12)
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L_0x01fa
            h.a.am r12 = p5462h.p5463a.C69496am.f185918a
        L_0x01fa:
            r11.add(r12)
            goto L_0x01e4
        L_0x01fe:
            java.util.List r8 = p5462h.p5463a.C69540x.m100805l(r11)
            java.util.Set r11 = r6.f96636c
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = p5462h.p5463a.C69540x.m100804k(r11, r5)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L_0x0211:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x022b
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r2.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0227
            h.a.am r13 = p5462h.p5463a.C69496am.f185918a
        L_0x0227:
            r12.add(r13)
            goto L_0x0211
        L_0x022b:
            java.util.List r11 = p5462h.p5463a.C69540x.m100805l(r12)
            r12 = r7
            com.google.android.libraries.search.assistant.y.s.a.b r12 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37096b) r12
            com.google.android.apps.gsa.binaries.satin.app.asf r12 = r12.f96627a
            com.google.android.libraries.search.assistant.y.s.a.f r13 = new com.google.android.libraries.search.assistant.y.s.a.f
            com.google.android.apps.gsa.binaries.satin.app.asn r12 = r12.f201454a
            com.google.android.apps.gsa.binaries.satin.app.aqy r12 = r12.a
            com.google.android.apps.gsa.binaries.satin.app.aso r12 = r12.d
            com.google.android.libraries.search.assistant.y.s.a.q r14 = new com.google.android.libraries.search.assistant.y.s.a.q
            com.google.android.apps.gsa.binaries.satin.app.aqy r12 = r12.f201488a
            g.a.a r12 = r12.bC
            java.lang.Object r12 = r12.mo17428b()
            com.google.common.v.i r12 = (com.google.common.p4580v.C60950i) r12
            r14.<init>(r12)
            r13.<init>(r6, r8, r11, r14)
            r1.add(r13)
            goto L_0x01c9
        L_0x0253:
            java.util.Comparator r2 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37125f.f96696c
            java.util.List r2 = p5462h.p5463a.C69540x.m100837S(r1, r2)
            java.util.Comparator r3 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37125f.f96694a
            java.util.List r3 = p5462h.p5463a.C69540x.m100837S(r1, r3)
            java.util.Comparator r4 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37125f.f96695b
            java.util.List r1 = p5462h.p5463a.C69540x.m100837S(r1, r4)
            com.google.assistant.e.i.a.oa r4 = com.google.assistant.p3897e.p3917i.p3918a.C51609oa.f134502b
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.i.a.nz r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51607nz) r4
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.assistant.e.i.a.ns r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.android.libraries.search.assistant.y.s.d r9 = (com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d) r9
            boolean r5 = r9.mo40660a()
            if (r5 == 0) goto L_0x0295
            boolean r5 = r9.mo40661b()
            if (r5 == 0) goto L_0x0295
            r4.mo53660c()
            com.google.assistant.e.i.a.nx r5 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.AGGREGATED
            com.google.android.libraries.search.assistant.y.s.a.i r6 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37128i.f96713a
            r7 = r10
            com.google.android.libraries.search.assistant.y.s.a.l r7 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37131l) r7
            com.google.assistant.e.i.a.ny r2 = r7.m65890c(r5, r2, r6)
            r4.mo53659b(r2)
        L_0x0295:
            boolean r2 = r9.mo40661b()
            if (r2 == 0) goto L_0x02ac
            r4.mo53660c()
            com.google.assistant.e.i.a.nx r2 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.TEXT
            com.google.android.libraries.search.assistant.y.s.a.j r5 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37129j.f96714a
            r6 = r10
            com.google.android.libraries.search.assistant.y.s.a.l r6 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37131l) r6
            com.google.assistant.e.i.a.ny r1 = r6.m65890c(r2, r1, r5)
            r4.mo53659b(r1)
        L_0x02ac:
            boolean r1 = r9.mo40660a()
            if (r1 == 0) goto L_0x02c2
            r4.mo53660c()
            com.google.assistant.e.i.a.nx r1 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.CALL
            com.google.android.libraries.search.assistant.y.s.a.k r2 = com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37130k.f96715a
            com.google.android.libraries.search.assistant.y.s.a.l r10 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37131l) r10
            com.google.assistant.e.i.a.ny r1 = r10.m65890c(r1, r3, r2)
            r4.mo53659b(r1)
        L_0x02c2:
            com.google.assistant.e.i.a.oa r1 = r4.mo53658a()
            return r1
        L_0x02c7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37131l.mo40648b(com.google.android.libraries.search.assistant.y.s.d, h.c.g):java.lang.Object");
    }
}
