package com.google.android.apps.search.googleapp.notifications.p10360a;

import com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136718c;
import com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136736n;
import com.google.android.apps.search.googleapp.notifications.p10364c.C136767e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.g */
/* compiled from: PG */
public final class C136754g {

    /* renamed from: e */
    private static final C71788b f372263e = new C71799m();

    /* renamed from: l */
    private static final int f372264l = 3;

    /* renamed from: a */
    public final C136736n f372265a;

    /* renamed from: b */
    public final C62910ar f372266b;

    /* renamed from: c */
    public final C71422aw f372267c;

    /* renamed from: d */
    public final C60888db f372268d;

    /* renamed from: f */
    private final C136718c f372269f;

    /* renamed from: g */
    private final C136767e f372270g;

    /* renamed from: h */
    private final C21370a f372271h;

    /* renamed from: i */
    private final long f372272i;

    /* renamed from: j */
    private final String f372273j;

    /* renamed from: k */
    private final C39141kp f372274k;

    public C136754g(C136718c cVar, C136736n nVar, C136767e eVar, C21370a aVar, long j, C62910ar arVar, C71422aw awVar, C60888db dbVar, String str, C39141kp kpVar) {
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        C69664n.m101061g(str, "appVersionName");
        C69664n.m101061g(kpVar, "clientStreamz");
        this.f372269f = cVar;
        this.f372265a = nVar;
        this.f372270g = eVar;
        this.f372271h = aVar;
        this.f372272i = j;
        this.f372266b = arVar;
        this.f372267c = awVar;
        this.f372268d = dbVar;
        this.f372273j = str;
        this.f372274k = kpVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.ai.b.lm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.google.protobuf.bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.ai.b.lm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.ai.b.lm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113350a(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.C136715a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.notifications.a.a r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136715a) r0
            int r1 = r0.f372136f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372136f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.a r0 = new com.google.android.apps.search.googleapp.notifications.a.a
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f372134d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372136f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.f372133c
            java.lang.Object r2 = r0.f372132b
            java.lang.Object r0 = r0.f372131a
            com.google.bv.d.e r0 = (com.google.p4283bv.p4345d.C57026e) r0
            p5462h.C69714l.m101134b(r10)
            goto L_0x00a9
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003b:
            java.lang.Object r2 = r0.f372132b
            java.lang.Object r5 = r0.f372131a
            com.google.android.apps.search.googleapp.notifications.a.g r5 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r5
            p5462h.C69714l.m101134b(r10)
            goto L_0x0077
        L_0x0045:
            p5462h.C69714l.m101134b(r10)
            com.google.bv.d.h r10 = com.google.p4283bv.p4345d.C57029h.f152248f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.bv.d.e r10 = (com.google.p4283bv.p4345d.C57026e) r10
            int r2 = f372264l
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.bv.d.h r5 = (com.google.p4283bv.p4345d.C57029h) r5
            int r6 = r2 + -1
            if (r2 == 0) goto L_0x00e4
            r5.f152254e = r6
            int r2 = r5.f152250a
            r2 = r2 | 4
            r5.f152250a = r2
            com.google.android.apps.search.googleapp.notifications.c.e r2 = r9.f372270g
            r0.f372131a = r9
            r0.f372132b = r10
            r0.f372136f = r4
            java.lang.Object r2 = r2.mo113354a(r0)
            if (r2 == r1) goto L_0x00e3
            r5 = r9
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x0077:
            java.lang.String r10 = (java.lang.String) r10
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0080
            goto L_0x00e2
        L_0x0080:
            com.google.ai.b.lp r10 = com.google.p375ai.p378b.C7832lp.f27462d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.ai.b.lm r10 = (com.google.p375ai.p378b.C7829lm) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r6 = r10.instance
            com.google.ai.b.lp r6 = (com.google.p375ai.p378b.C7832lp) r6
            r6.f27465b = r4
            int r7 = r6.f27464a
            r4 = r4 | r7
            r6.f27464a = r4
            com.google.android.apps.search.googleapp.notifications.c.e r4 = r5.f372270g
            r0.f372131a = r2
            r0.f372132b = r2
            r0.f372133c = r10
            r0.f372136f = r3
            java.lang.Object r0 = r4.mo113354a(r0)
            if (r0 == r1) goto L_0x00e3
            r1 = r10
            r10 = r0
            r0 = r2
        L_0x00a9:
            java.lang.String r10 = (java.lang.String) r10
            r4 = r1
            com.google.protobuf.bn r4 = (com.google.protobuf.C62934bn) r4
            r4.copyOnWrite()
            com.google.ai.b.lm r1 = (com.google.p375ai.p378b.C7829lm) r1
            com.google.protobuf.bv r1 = r1.instance
            com.google.ai.b.lp r1 = (com.google.p375ai.p378b.C7832lp) r1
            com.google.ai.b.lp r5 = com.google.p375ai.p378b.C7832lp.f27462d
            r10.getClass()
            int r5 = r1.f27464a
            r5 = r5 | r3
            r1.f27464a = r5
            r1.f27466c = r10
            r10 = r2
            com.google.protobuf.bn r10 = (com.google.protobuf.C62934bn) r10
            r10.copyOnWrite()
            com.google.bv.d.e r2 = (com.google.p4283bv.p4345d.C57026e) r2
            com.google.protobuf.bv r10 = r2.instance
            com.google.bv.d.h r10 = (com.google.p4283bv.p4345d.C57029h) r10
            com.google.protobuf.bv r1 = r4.build()
            com.google.ai.b.lp r1 = (com.google.p375ai.p378b.C7832lp) r1
            com.google.bv.d.h r2 = com.google.p4283bv.p4345d.C57029h.f152248f
            r1.getClass()
            r10.f152253d = r1
            int r1 = r10.f152250a
            r1 = r1 | r3
            r10.f152250a = r1
            r2 = r0
        L_0x00e2:
            return r2
        L_0x00e3:
            return r1
        L_0x00e4:
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.C136754g.mo113350a(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.google.common.b.gu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: com.google.android.apps.search.googleapp.notifications.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: com.google.common.b.gu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x037d, code lost:
        r1 = r0.f372137a;
        r2 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK;
        r1 = r1.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0386, code lost:
        if (r1 == 1) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0389, code lost:
        if (r1 == 2) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x038c, code lost:
        if (r1 == 3) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x038f, code lost:
        r0 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372274k;
        r2 = com.google.net.p4726a.p4727a.C62722b.UNKNOWN.name();
        r3 = f372264l;
        r5 = com.google.p4283bv.p4345d.C57028g.m88254a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03a1, code lost:
        if (r3 == 0) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a3, code lost:
        r0.mo41710y("200", r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03a8, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03a9, code lost:
        r1 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372274k;
        r2 = r0.f372139c;
        r0 = com.google.net.p4726a.p4727a.C62722b.m94931a(r0.f372138b.f152259b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b7, code lost:
        if (r0 != null) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03b9, code lost:
        r0 = com.google.net.p4726a.p4727a.C62722b.OK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03bb, code lost:
        r0 = r0.name();
        r3 = f372264l;
        r5 = com.google.p4283bv.p4345d.C57028g.m88254a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03c5, code lost:
        if (r3 == 0) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c7, code lost:
        r1.mo41710y(r2, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03cc, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03cd, code lost:
        r1 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372274k;
        r0 = r0.f372139c;
        r2 = com.google.net.p4726a.p4727a.C62722b.UNKNOWN.name();
        r3 = f372264l;
        r5 = com.google.p4283bv.p4345d.C57028g.m88254a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03df, code lost:
        if (r3 == 0) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03e1, code lost:
        r1.mo41710y(r0, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03e4, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03e9, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ec, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ed, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03ee, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03f1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03f3, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03f4, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03f5, code lost:
        r4.mo63026c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03fa, code lost:
        return p5462h.C69788q.f186170a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03fb, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03fc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03fd, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03fe, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r0 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372265a;
        r2.f372256a = r11;
        r2.f372257b = r4;
        r2.f372258c = r10;
        r2.f372262g = 2;
        r0 = r0.mo113342a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        if (r0 == r3) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
        r20 = r10;
        r10 = r4;
        r4 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0 = (com.google.common.p4522b.C58485gu) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        if (r0.isEmpty() != false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        r2.f372256a = r11;
        r2.f372257b = r10;
        r2.f372258c = r4;
        r2.f372259d = r0;
        r2.f372262g = 3;
        r12 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).mo113350a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        if (r12 == r3) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        r20 = r4;
        r4 = r0;
        r0 = r12;
        r12 = r10;
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0 = (com.google.p4283bv.p4345d.C57026e) r0;
        r13 = com.google.protobuf.p4750c.C62948a.m95459j(((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372271h.mo26870b()).f169860a;
        r15 = (com.google.p4283bv.p4345d.C56950a) com.google.p4283bv.p4345d.C56964b.f152019j.createBuilder();
        r5 = java.util.Locale.getDefault().toString();
        r15.copyOnWrite();
        r9 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.getClass();
        r9.f152021a |= 1;
        r9.f152022b = r5;
        r15.copyOnWrite();
        r5 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.f152021a |= 2;
        r5.f152023c = r13;
        r5 = p3186j$.time.ZoneId.systemDefault().toString();
        r15.copyOnWrite();
        r6 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.getClass();
        r6.f152021a |= 8;
        r6.f152024d = r5;
        r15.copyOnWrite();
        r5 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.f152026f = 1;
        r5.f152021a |= 32;
        r5 = android.os.Build.VERSION.RELEASE;
        r15.copyOnWrite();
        r6 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.getClass();
        r6.f152021a |= 64;
        r6.f152027g = r5;
        r5 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372273j;
        r15.copyOnWrite();
        r6 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.getClass();
        r6.f152021a |= 128;
        r6.f152028h = r5;
        r15.copyOnWrite();
        r5 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.f152021a |= 16;
        r5.f152025e = Integer.MAX_VALUE;
        r15.copyOnWrite();
        r5 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r5.f152021a |= 1024;
        r5.f152029i = Integer.MAX_VALUE;
        r5 = ((com.google.p4283bv.p4345d.C57029h) r0.build()).getSerializedSize() + ((com.google.p4283bv.p4345d.C56964b) r15.build()).getSerializedSize();
        r6 = com.google.common.p4522b.C58485gu.m89837e();
        r9 = r4.listIterator(0);
        r13 = 0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01d5, code lost:
        if (r9.hasNext() == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d7, code lost:
        r8 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136731i) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01e5, code lost:
        r22 = r9;
        r17 = r10;
        r13 = r13 + ((long) r8.f372185a.getSerializedSize());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r18 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f6, code lost:
        if ((((long) r5) + r13) < ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372272i) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f9, code lost:
        r13 = r8.f372186b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01fe, code lost:
        if (((long) r7) >= r13) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0200, code lost:
        r7 = (int) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0202, code lost:
        r6.mo55395g(r8);
        r1 = r8.f372185a;
        r0.copyOnWrite();
        r8 = (com.google.p4283bv.p4345d.C57029h) r0.instance;
        r1.getClass();
        r9 = r8.f152252c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0217, code lost:
        if (r9.mo58948c() != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0219, code lost:
        r8.f152252c = com.google.protobuf.C62942bv.mutableCopy(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x021f, code lost:
        r8.f152252c.add(r1);
        r1 = r21;
        r9 = r22;
        r10 = r17;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022e, code lost:
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0230, code lost:
        r15.copyOnWrite();
        r1 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r1.f152021a |= 16;
        r1.f152025e = r7;
        r1 = r4.size() - ((com.google.common.p4522b.C58724pq) r6.mo55394f()).f156474d;
        r15.copyOnWrite();
        r4 = (com.google.p4283bv.p4345d.C56964b) r15.instance;
        r4.f152021a |= 1024;
        r4.f152029i = r1;
        r0.copyOnWrite();
        r1 = (com.google.p4283bv.p4345d.C57029h) r0.instance;
        r4 = (com.google.p4283bv.p4345d.C56964b) r15.build();
        r4.getClass();
        r1.f152251b = r4;
        r1.f152250a |= 1;
        r1 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372274k;
        r4 = ((com.google.common.p4522b.C58724pq) r6.mo55394f()).f156474d;
        r5 = f372264l;
        r7 = com.google.p4283bv.p4345d.C57028g.m88254a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0288, code lost:
        if (r5 == 0) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x028a, code lost:
        r5 = 0;
        ((com.google.android.libraries.p1635au.C19567d) r1.f102838aV.mo6453a()).mo24822a(1, java.lang.Integer.valueOf(r4), r7);
        r1 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372269f;
        r0 = r0.build();
        p5462h.p5473f.p5475b.C69664n.m101060f(r0, "actionUploadRequestBuilder.build()");
        r0 = (com.google.p4283bv.p4345d.C57029h) r0;
        r2.f372256a = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02b6, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r2.f372257b = r4;
        r2.f372258c = r6;
        r2.f372259d = null;
        r2.f372262g = 4;
        r0 = r1.mo113337a(r0, r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02c6, code lost:
        if (r0 == r3) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02c8, code lost:
        r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136716a) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02ce, code lost:
        if (r0.f372137a != com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02d0, code lost:
        r1 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11).f372265a;
        r6 = r6.mo55394f();
        p5462h.p5473f.p5475b.C69664n.m101060f(r6, "sizeLimitedActionUploadInfoListBuilder.build()");
        r2.f372256a = r11;
        r2.f372257b = r4;
        r2.f372258c = r0;
        r2.f372262g = 5;
        r7 = com.google.common.p4522b.C58485gu.m89837e();
        r8 = ((com.google.common.p4522b.C58724pq) r6).f156474d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02f0, code lost:
        if (r5 >= r8) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02f2, code lost:
        r7.mo55395g(new java.lang.Long(((com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136731i) r6.get(r5)).f372186b));
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0305, code lost:
        r1 = r1.f372200a;
        r5 = r7.mo55394f();
        p5462h.p5473f.p5475b.C69664n.m101060f(r5, "eventIds.build()");
        r1 = r1.f372183a.mo45937a(new com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136726d(r5));
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "idList: ImmutableList<Lo…yBuilder.build())\n      }");
        r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2);
        r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0326, code lost:
        if (r1 == r5) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0328, code lost:
        r1 = p5462h.C69788q.f186170a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x032a, code lost:
        if (r1 == r5) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x032c, code lost:
        r1 = p5462h.C69788q.f186170a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x032e, code lost:
        if (r1 == r3) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0330, code lost:
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0331, code lost:
        r1 = r0.f372138b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0337, code lost:
        if ((r1.f152258a & 2) == 0) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0339, code lost:
        r5 = ((com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r10).f372270g;
        r1 = r1.f152260c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0340, code lost:
        if (r1 != null) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0342, code lost:
        r1 = com.google.p375ai.p378b.C7832lp.f27462d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0344, code lost:
        r1 = r1.f27466c;
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "actionUploadResponse.res…ataVersion().getVersion()");
        p5462h.p5473f.p5475b.C69664n.m101061g(r1, "newVersion");
        r1 = r5.f372299a.mo46039a(new com.google.android.apps.search.googleapp.notifications.p10364c.C136766d(r1), r5.f372300b);
        p5462h.p5473f.p5475b.C69664n.m101060f(r1, "kansasDataStoreAccessor\n…taVersion().getVersion())");
        r2.f372256a = r10;
        r2.f372257b = r4;
        r2.f372258c = r0;
        r2.f372262g = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x036f, code lost:
        if (kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2) == r3) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0371, code lost:
        r3 = r0;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0373, code lost:
        r11 = r2;
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0376, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0377, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0379, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x037c, code lost:
        return r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113351b(java.lang.String r22, p5462h.p5466c.C69577g r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.C136753f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.googleapp.notifications.a.f r2 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136753f) r2
            int r3 = r2.f372262g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f372262g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.googleapp.notifications.a.f r2 = new com.google.android.apps.search.googleapp.notifications.a.f
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f372260e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f372262g
            r5 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            switch(r4) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x0094;
                case 2: goto L_0x0083;
                case 3: goto L_0x0068;
                case 4: goto L_0x0056;
                case 5: goto L_0x0042;
                case 6: goto L_0x0031;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.Object r3 = r2.f372258c
            com.google.android.apps.search.googleapp.notifications.a.a.a r3 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136716a) r3
            java.lang.Object r4 = r2.f372257b
            kotlinx.coroutines.j.b r4 = (kotlinx.coroutines.p5584j.C71788b) r4
            java.lang.Object r2 = r2.f372256a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0373
        L_0x0040:
            r0 = move-exception
            goto L_0x0091
        L_0x0042:
            java.lang.Object r4 = r2.f372258c
            com.google.android.apps.search.googleapp.notifications.a.a.a r4 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136716a) r4
            java.lang.Object r6 = r2.f372257b
            kotlinx.coroutines.j.b r6 = (kotlinx.coroutines.p5584j.C71788b) r6
            java.lang.Object r10 = r2.f372256a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0053 }
            r0 = r4
            r4 = r6
            goto L_0x0331
        L_0x0053:
            r0 = move-exception
            r4 = r6
            goto L_0x0091
        L_0x0056:
            java.lang.Object r4 = r2.f372258c
            com.google.common.b.gp r4 = (com.google.common.p4522b.C58480gp) r4
            java.lang.Object r10 = r2.f372257b
            kotlinx.coroutines.j.b r10 = (kotlinx.coroutines.p5584j.C71788b) r10
            java.lang.Object r11 = r2.f372256a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x007e }
            r6 = r4
            r4 = r10
            r5 = 0
            goto L_0x02c8
        L_0x0068:
            java.lang.Object r4 = r2.f372259d
            java.lang.Object r10 = r2.f372258c
            kotlinx.coroutines.j.b r10 = (kotlinx.coroutines.p5584j.C71788b) r10
            java.lang.Object r11 = r2.f372257b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.f372256a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x007e }
            r20 = r12
            r12 = r11
            r11 = r20
            goto L_0x00f8
        L_0x007e:
            r0 = move-exception
            r1 = r9
            r4 = r10
            goto L_0x03ff
        L_0x0083:
            java.lang.Object r4 = r2.f372258c
            kotlinx.coroutines.j.b r4 = (kotlinx.coroutines.p5584j.C71788b) r4
            java.lang.Object r10 = r2.f372257b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.f372256a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x00d6
        L_0x0091:
            r1 = r9
            goto L_0x03ff
        L_0x0094:
            java.lang.Object r4 = r2.f372258c
            kotlinx.coroutines.j.b r4 = (kotlinx.coroutines.p5584j.C71788b) r4
            java.lang.Object r10 = r2.f372257b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.f372256a
            p5462h.C69714l.m101134b(r0)
            r20 = r10
            r10 = r4
            r4 = r20
            goto L_0x00be
        L_0x00a7:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = f372263e
            r2.f372256a = r1
            r4 = r22
            r2.f372257b = r4
            r2.f372258c = r0
            r2.f372262g = r8
            java.lang.Object r10 = r0.mo63025b(r9, r2)
            if (r10 == r3) goto L_0x0403
            r10 = r0
            r11 = r1
        L_0x00be:
            r0 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r0     // Catch:{ all -> 0x03fc }
            com.google.android.apps.search.googleapp.notifications.a.b.n r0 = r0.f372265a     // Catch:{ all -> 0x03fc }
            r2.f372256a = r11     // Catch:{ all -> 0x03fc }
            r2.f372257b = r4     // Catch:{ all -> 0x03fc }
            r2.f372258c = r10     // Catch:{ all -> 0x03fc }
            r2.f372262g = r7     // Catch:{ all -> 0x03fc }
            java.lang.Object r0 = r0.mo113342a(r2)     // Catch:{ all -> 0x03fc }
            if (r0 == r3) goto L_0x03fb
            r20 = r10
            r10 = r4
            r4 = r20
        L_0x00d6:
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ all -> 0x0379 }
            boolean r12 = r0.isEmpty()     // Catch:{ all -> 0x0379 }
            if (r12 != 0) goto L_0x03f4
            r2.f372256a = r11     // Catch:{ all -> 0x0379 }
            r2.f372257b = r10     // Catch:{ all -> 0x0379 }
            r2.f372258c = r4     // Catch:{ all -> 0x0379 }
            r2.f372259d = r0     // Catch:{ all -> 0x0379 }
            r2.f372262g = r5     // Catch:{ all -> 0x0379 }
            r12 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r12 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r12     // Catch:{ all -> 0x0379 }
            java.lang.Object r12 = r12.mo113350a(r2)     // Catch:{ all -> 0x0379 }
            if (r12 == r3) goto L_0x03f3
            r20 = r4
            r4 = r0
            r0 = r12
            r12 = r10
            r10 = r20
        L_0x00f8:
            com.google.bv.d.e r0 = (com.google.p4283bv.p4345d.C57026e) r0     // Catch:{ all -> 0x03f1 }
            r13 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r13 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r13     // Catch:{ all -> 0x03f1 }
            com.google.android.libraries.f.a r13 = r13.f372271h     // Catch:{ all -> 0x03f1 }
            long r13 = r13.mo26870b()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.ar r13 = com.google.protobuf.p4750c.C62948a.m95459j(r13)     // Catch:{ all -> 0x03f1 }
            long r13 = r13.f169860a     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r15 = com.google.p4283bv.p4345d.C56964b.f152019j     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bn r15 = r15.createBuilder()     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.a r15 = (com.google.p4283bv.p4345d.C56950a) r15     // Catch:{ all -> 0x03f1 }
            java.util.Locale r16 = java.util.Locale.getDefault()     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = r16.toString()     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r9 = (com.google.p4283bv.p4345d.C56964b) r9     // Catch:{ all -> 0x03f1 }
            r5.getClass()     // Catch:{ all -> 0x03f1 }
            int r6 = r9.f152021a     // Catch:{ all -> 0x03f1 }
            r6 = r6 | r8
            r9.f152021a = r6     // Catch:{ all -> 0x03f1 }
            r9.f152022b = r5     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r5 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r5 = (com.google.p4283bv.p4345d.C56964b) r5     // Catch:{ all -> 0x03f1 }
            int r6 = r5.f152021a     // Catch:{ all -> 0x03f1 }
            r6 = r6 | r7
            r5.f152021a = r6     // Catch:{ all -> 0x03f1 }
            r5.f152023c = r13     // Catch:{ all -> 0x03f1 }
            j$.time.ZoneId r5 = p3186j$.time.ZoneId.systemDefault()     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r6 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r6 = (com.google.p4283bv.p4345d.C56964b) r6     // Catch:{ all -> 0x03f1 }
            r5.getClass()     // Catch:{ all -> 0x03f1 }
            int r9 = r6.f152021a     // Catch:{ all -> 0x03f1 }
            r9 = r9 | 8
            r6.f152021a = r9     // Catch:{ all -> 0x03f1 }
            r6.f152024d = r5     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r5 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r5 = (com.google.p4283bv.p4345d.C56964b) r5     // Catch:{ all -> 0x03f1 }
            r5.f152026f = r8     // Catch:{ all -> 0x03f1 }
            int r6 = r5.f152021a     // Catch:{ all -> 0x03f1 }
            r6 = r6 | 32
            r5.f152021a = r6     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r6 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r6 = (com.google.p4283bv.p4345d.C56964b) r6     // Catch:{ all -> 0x03f1 }
            r5.getClass()     // Catch:{ all -> 0x03f1 }
            int r9 = r6.f152021a     // Catch:{ all -> 0x03f1 }
            r9 = r9 | 64
            r6.f152021a = r9     // Catch:{ all -> 0x03f1 }
            r6.f152027g = r5     // Catch:{ all -> 0x03f1 }
            r5 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r5 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r5     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = r5.f372273j     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r6 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r6 = (com.google.p4283bv.p4345d.C56964b) r6     // Catch:{ all -> 0x03f1 }
            r5.getClass()     // Catch:{ all -> 0x03f1 }
            int r9 = r6.f152021a     // Catch:{ all -> 0x03f1 }
            r9 = r9 | 128(0x80, float:1.794E-43)
            r6.f152021a = r9     // Catch:{ all -> 0x03f1 }
            r6.f152028h = r5     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r5 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r5 = (com.google.p4283bv.p4345d.C56964b) r5     // Catch:{ all -> 0x03f1 }
            int r6 = r5.f152021a     // Catch:{ all -> 0x03f1 }
            r6 = r6 | 16
            r5.f152021a = r6     // Catch:{ all -> 0x03f1 }
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5.f152025e = r6     // Catch:{ all -> 0x03f1 }
            r15.copyOnWrite()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r5 = r15.instance     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r5 = (com.google.p4283bv.p4345d.C56964b) r5     // Catch:{ all -> 0x03f1 }
            int r9 = r5.f152021a     // Catch:{ all -> 0x03f1 }
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r5.f152021a = r9     // Catch:{ all -> 0x03f1 }
            r5.f152029i = r6     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r5 = r0.build()     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.h r5 = (com.google.p4283bv.p4345d.C57029h) r5     // Catch:{ all -> 0x03f1 }
            int r5 = r5.getSerializedSize()     // Catch:{ all -> 0x03f1 }
            com.google.protobuf.bv r6 = r15.build()     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.b r6 = (com.google.p4283bv.p4345d.C56964b) r6     // Catch:{ all -> 0x03f1 }
            int r6 = r6.getSerializedSize()     // Catch:{ all -> 0x03f1 }
            int r5 = r5 + r6
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x03f1 }
            r9 = r4
            com.google.common.b.gu r9 = (com.google.common.p4522b.C58485gu) r9     // Catch:{ all -> 0x03f1 }
            r13 = 0
            com.google.common.b.sm r9 = r9.listIterator(r13)     // Catch:{ all -> 0x03f1 }
            r13 = 0
            r7 = 0
        L_0x01d1:
            boolean r17 = r9.hasNext()     // Catch:{ all -> 0x03f1 }
            if (r17 == 0) goto L_0x022e
            java.lang.Object r17 = r9.next()     // Catch:{ all -> 0x03f1 }
            r8 = r17
            com.google.android.apps.search.googleapp.notifications.a.b.i r8 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136731i) r8     // Catch:{ all -> 0x03f1 }
            com.google.bv.d.l r1 = r8.f372185a     // Catch:{ all -> 0x03f1 }
            int r1 = r1.getSerializedSize()     // Catch:{ all -> 0x03f1 }
            r22 = r9
            r17 = r10
            long r9 = (long) r1
            long r13 = r13 + r9
            long r9 = (long) r5
            long r9 = r9 + r13
            r1 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r1 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r1     // Catch:{ all -> 0x03ed }
            r18 = r13
            long r13 = r1.f372272i     // Catch:{ all -> 0x03ed }
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 < 0) goto L_0x01f9
            goto L_0x0230
        L_0x01f9:
            long r9 = (long) r7     // Catch:{ all -> 0x03ed }
            long r13 = r8.f372186b     // Catch:{ all -> 0x03ed }
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x0202
            int r1 = (int) r13     // Catch:{ all -> 0x03ed }
            r7 = r1
        L_0x0202:
            r6.mo55395g(r8)     // Catch:{ all -> 0x03ed }
            com.google.bv.d.l r1 = r8.f372185a     // Catch:{ all -> 0x03ed }
            r0.copyOnWrite()     // Catch:{ all -> 0x03ed }
            com.google.protobuf.bv r8 = r0.instance     // Catch:{ all -> 0x03ed }
            com.google.bv.d.h r8 = (com.google.p4283bv.p4345d.C57029h) r8     // Catch:{ all -> 0x03ed }
            r1.getClass()     // Catch:{ all -> 0x03ed }
            com.google.protobuf.cq r9 = r8.f152252c     // Catch:{ all -> 0x03ed }
            boolean r10 = r9.mo58948c()     // Catch:{ all -> 0x03ed }
            if (r10 != 0) goto L_0x021f
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)     // Catch:{ all -> 0x03ed }
            r8.f152252c = r9     // Catch:{ all -> 0x03ed }
        L_0x021f:
            com.google.protobuf.cq r8 = r8.f152252c     // Catch:{ all -> 0x03ed }
            r8.add(r1)     // Catch:{ all -> 0x03ed }
            r1 = r21
            r9 = r22
            r10 = r17
            r13 = r18
            r8 = 1
            goto L_0x01d1
        L_0x022e:
            r17 = r10
        L_0x0230:
            r15.copyOnWrite()     // Catch:{ all -> 0x03ed }
            com.google.protobuf.bv r1 = r15.instance     // Catch:{ all -> 0x03ed }
            com.google.bv.d.b r1 = (com.google.p4283bv.p4345d.C56964b) r1     // Catch:{ all -> 0x03ed }
            int r5 = r1.f152021a     // Catch:{ all -> 0x03ed }
            r5 = r5 | 16
            r1.f152021a = r5     // Catch:{ all -> 0x03ed }
            r1.f152025e = r7     // Catch:{ all -> 0x03ed }
            com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4     // Catch:{ all -> 0x03ed }
            int r1 = r4.size()     // Catch:{ all -> 0x03ed }
            com.google.common.b.gu r4 = r6.mo55394f()     // Catch:{ all -> 0x03ed }
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4     // Catch:{ all -> 0x03ed }
            int r4 = r4.f156474d     // Catch:{ all -> 0x03ed }
            int r1 = r1 - r4
            r15.copyOnWrite()     // Catch:{ all -> 0x03ed }
            com.google.protobuf.bv r4 = r15.instance     // Catch:{ all -> 0x03ed }
            com.google.bv.d.b r4 = (com.google.p4283bv.p4345d.C56964b) r4     // Catch:{ all -> 0x03ed }
            int r5 = r4.f152021a     // Catch:{ all -> 0x03ed }
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r4.f152021a = r5     // Catch:{ all -> 0x03ed }
            r4.f152029i = r1     // Catch:{ all -> 0x03ed }
            r0.copyOnWrite()     // Catch:{ all -> 0x03ed }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x03ed }
            com.google.bv.d.h r1 = (com.google.p4283bv.p4345d.C57029h) r1     // Catch:{ all -> 0x03ed }
            com.google.protobuf.bv r4 = r15.build()     // Catch:{ all -> 0x03ed }
            com.google.bv.d.b r4 = (com.google.p4283bv.p4345d.C56964b) r4     // Catch:{ all -> 0x03ed }
            r4.getClass()     // Catch:{ all -> 0x03ed }
            r1.f152251b = r4     // Catch:{ all -> 0x03ed }
            int r4 = r1.f152250a     // Catch:{ all -> 0x03ed }
            r5 = 1
            r4 = r4 | r5
            r1.f152250a = r4     // Catch:{ all -> 0x03ed }
            r1 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r1 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r1     // Catch:{ all -> 0x03ed }
            com.google.android.libraries.search.logging.d.kp r1 = r1.f372274k     // Catch:{ all -> 0x03ed }
            com.google.common.b.gu r4 = r6.mo55394f()     // Catch:{ all -> 0x03ed }
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4     // Catch:{ all -> 0x03ed }
            int r4 = r4.f156474d     // Catch:{ all -> 0x03ed }
            int r5 = f372264l     // Catch:{ all -> 0x03ed }
            java.lang.String r7 = com.google.p4283bv.p4345d.C57028g.m88254a(r5)     // Catch:{ all -> 0x03ed }
            if (r5 == 0) goto L_0x03e9
            com.google.common.base.cr r1 = r1.f102838aV     // Catch:{ all -> 0x03ed }
            java.lang.Object r1 = r1.mo6453a()     // Catch:{ all -> 0x03ed }
            com.google.android.libraries.au.d r1 = (com.google.android.libraries.p1635au.C19567d) r1     // Catch:{ all -> 0x03ed }
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x03ed }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03ed }
            r5 = 0
            r8[r5] = r4     // Catch:{ all -> 0x03ed }
            r4 = 1
            r8[r4] = r7     // Catch:{ all -> 0x03ed }
            r9 = 1
            r1.mo24822a(r9, r8)     // Catch:{ all -> 0x03ed }
            r1 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r1 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r1     // Catch:{ all -> 0x03ed }
            com.google.android.apps.search.googleapp.notifications.a.a.c r1 = r1.f372269f     // Catch:{ all -> 0x03ed }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x03ed }
            java.lang.String r4 = "actionUploadRequestBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x03ed }
            com.google.bv.d.h r0 = (com.google.p4283bv.p4345d.C57029h) r0     // Catch:{ all -> 0x03ed }
            r2.f372256a = r11     // Catch:{ all -> 0x03ed }
            r4 = r17
            r2.f372257b = r4     // Catch:{ all -> 0x0379 }
            r2.f372258c = r6     // Catch:{ all -> 0x0379 }
            r7 = 0
            r2.f372259d = r7     // Catch:{ all -> 0x0379 }
            r7 = 4
            r2.f372262g = r7     // Catch:{ all -> 0x0379 }
            java.lang.Object r0 = r1.mo113337a(r0, r12, r2)     // Catch:{ all -> 0x0379 }
            if (r0 == r3) goto L_0x03e8
        L_0x02c8:
            com.google.android.apps.search.googleapp.notifications.a.a.a r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136716a) r0     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.a.a.d r1 = r0.f372137a     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.a.a.d r7 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK     // Catch:{ all -> 0x0379 }
            if (r1 != r7) goto L_0x037d
            r1 = r11
            com.google.android.apps.search.googleapp.notifications.a.g r1 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r1     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.a.b.n r1 = r1.f372265a     // Catch:{ all -> 0x0379 }
            com.google.common.b.gu r6 = r6.mo55394f()     // Catch:{ all -> 0x0379 }
            java.lang.String r7 = "sizeLimitedActionUploadInfoListBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x0379 }
            r2.f372256a = r11     // Catch:{ all -> 0x0379 }
            r2.f372257b = r4     // Catch:{ all -> 0x0379 }
            r2.f372258c = r0     // Catch:{ all -> 0x0379 }
            r7 = 5
            r2.f372262g = r7     // Catch:{ all -> 0x0379 }
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0379 }
            r8 = r6
            com.google.common.b.pq r8 = (com.google.common.p4522b.C58724pq) r8     // Catch:{ all -> 0x0379 }
            int r8 = r8.f156474d     // Catch:{ all -> 0x0379 }
        L_0x02f0:
            if (r5 >= r8) goto L_0x0305
            java.lang.Object r9 = r6.get(r5)     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.a.b.i r9 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136731i) r9     // Catch:{ all -> 0x0379 }
            long r9 = r9.f372186b     // Catch:{ all -> 0x0379 }
            java.lang.Long r12 = new java.lang.Long     // Catch:{ all -> 0x0379 }
            r12.<init>(r9)     // Catch:{ all -> 0x0379 }
            r7.mo55395g(r12)     // Catch:{ all -> 0x0379 }
            int r5 = r5 + 1
            goto L_0x02f0
        L_0x0305:
            com.google.android.apps.search.googleapp.notifications.a.b.h r1 = r1.f372200a     // Catch:{ all -> 0x0379 }
            com.google.common.b.gu r5 = r7.mo55394f()     // Catch:{ all -> 0x0379 }
            java.lang.String r6 = "eventIds.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x0379 }
            com.google.android.libraries.storage.b.e r1 = r1.f372183a     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.a.b.d r6 = new com.google.android.apps.search.googleapp.notifications.a.b.d     // Catch:{ all -> 0x0379 }
            r6.<init>(r5)     // Catch:{ all -> 0x0379 }
            com.google.common.util.concurrent.cx r1 = r1.mo45937a(r6)     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = "idList: ImmutableList<Lo…yBuilder.build())\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ all -> 0x0379 }
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2)     // Catch:{ all -> 0x0379 }
            h.c.a.a r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0379 }
            if (r1 == r5) goto L_0x032a
            h.q r1 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0379 }
        L_0x032a:
            if (r1 == r5) goto L_0x032e
            h.q r1 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0379 }
        L_0x032e:
            if (r1 == r3) goto L_0x037c
            r10 = r11
        L_0x0331:
            com.google.bv.d.j r1 = r0.f372138b     // Catch:{ all -> 0x0379 }
            int r5 = r1.f152258a     // Catch:{ all -> 0x0379 }
            r6 = 2
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0377
            r5 = r10
            com.google.android.apps.search.googleapp.notifications.a.g r5 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r5     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.c.e r5 = r5.f372270g     // Catch:{ all -> 0x0379 }
            com.google.ai.b.lp r1 = r1.f152260c     // Catch:{ all -> 0x0379 }
            if (r1 != 0) goto L_0x0344
            com.google.ai.b.lp r1 = com.google.p375ai.p378b.C7832lp.f27462d     // Catch:{ all -> 0x0379 }
        L_0x0344:
            java.lang.String r1 = r1.f27466c     // Catch:{ all -> 0x0379 }
            java.lang.String r6 = "actionUploadResponse.res…ataVersion().getVersion()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)     // Catch:{ all -> 0x0379 }
            java.lang.String r6 = "newVersion"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r6)     // Catch:{ all -> 0x0379 }
            com.google.android.libraries.storage.protostore.ab r6 = r5.f372299a     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.c.d r7 = new com.google.android.apps.search.googleapp.notifications.c.d     // Catch:{ all -> 0x0379 }
            r7.<init>(r1)     // Catch:{ all -> 0x0379 }
            java.util.concurrent.Executor r1 = r5.f372300b     // Catch:{ all -> 0x0379 }
            com.google.common.util.concurrent.cx r1 = r6.mo46039a(r7, r1)     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = "kansasDataStoreAccessor\n…taVersion().getVersion())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ all -> 0x0379 }
            r2.f372256a = r10     // Catch:{ all -> 0x0379 }
            r2.f372257b = r4     // Catch:{ all -> 0x0379 }
            r2.f372258c = r0     // Catch:{ all -> 0x0379 }
            r5 = 6
            r2.f372262g = r5     // Catch:{ all -> 0x0379 }
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2)     // Catch:{ all -> 0x0379 }
            if (r1 == r3) goto L_0x0376
            r3 = r0
            r2 = r10
        L_0x0373:
            r11 = r2
            r0 = r3
            goto L_0x037d
        L_0x0376:
            return r3
        L_0x0377:
            r11 = r10
            goto L_0x037d
        L_0x0379:
            r0 = move-exception
            goto L_0x03fe
        L_0x037c:
            return r3
        L_0x037d:
            com.google.android.apps.search.googleapp.notifications.a.a.d r1 = r0.f372137a     // Catch:{ all -> 0x0379 }
            com.google.android.apps.search.googleapp.notifications.a.a.d r2 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK     // Catch:{ all -> 0x0379 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0379 }
            r2 = 1
            if (r1 == r2) goto L_0x03cd
            r2 = 2
            if (r1 == r2) goto L_0x03a9
            r2 = 3
            if (r1 == r2) goto L_0x038f
            goto L_0x03e4
        L_0x038f:
            com.google.android.apps.search.googleapp.notifications.a.g r11 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11     // Catch:{ all -> 0x0379 }
            com.google.android.libraries.search.logging.d.kp r0 = r11.f372274k     // Catch:{ all -> 0x0379 }
            java.lang.String r1 = "200"
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.UNKNOWN     // Catch:{ all -> 0x0379 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x0379 }
            int r3 = f372264l     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = com.google.p4283bv.p4345d.C57028g.m88254a(r3)     // Catch:{ all -> 0x0379 }
            if (r3 == 0) goto L_0x03a7
            r0.mo41710y(r1, r2, r5)     // Catch:{ all -> 0x0379 }
            goto L_0x03e4
        L_0x03a7:
            r1 = 0
            throw r1     // Catch:{ all -> 0x0379 }
        L_0x03a9:
            com.google.android.apps.search.googleapp.notifications.a.g r11 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11     // Catch:{ all -> 0x0379 }
            com.google.android.libraries.search.logging.d.kp r1 = r11.f372274k     // Catch:{ all -> 0x0379 }
            java.lang.String r2 = r0.f372139c     // Catch:{ all -> 0x0379 }
            com.google.bv.d.j r0 = r0.f372138b     // Catch:{ all -> 0x0379 }
            int r0 = r0.f152259b     // Catch:{ all -> 0x0379 }
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.m94931a(r0)     // Catch:{ all -> 0x0379 }
            if (r0 != 0) goto L_0x03bb
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ all -> 0x0379 }
        L_0x03bb:
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0379 }
            int r3 = f372264l     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = com.google.p4283bv.p4345d.C57028g.m88254a(r3)     // Catch:{ all -> 0x0379 }
            if (r3 == 0) goto L_0x03cb
            r1.mo41710y(r2, r0, r5)     // Catch:{ all -> 0x0379 }
            goto L_0x03e4
        L_0x03cb:
            r1 = 0
            throw r1     // Catch:{ all -> 0x0379 }
        L_0x03cd:
            com.google.android.apps.search.googleapp.notifications.a.g r11 = (com.google.android.apps.search.googleapp.notifications.p10360a.C136754g) r11     // Catch:{ all -> 0x0379 }
            com.google.android.libraries.search.logging.d.kp r1 = r11.f372274k     // Catch:{ all -> 0x0379 }
            java.lang.String r0 = r0.f372139c     // Catch:{ all -> 0x0379 }
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.UNKNOWN     // Catch:{ all -> 0x0379 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x0379 }
            int r3 = f372264l     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = com.google.p4283bv.p4345d.C57028g.m88254a(r3)     // Catch:{ all -> 0x0379 }
            if (r3 == 0) goto L_0x03e6
            r1.mo41710y(r0, r2, r5)     // Catch:{ all -> 0x0379 }
        L_0x03e4:
            r1 = 0
            goto L_0x03f5
        L_0x03e6:
            r1 = 0
            throw r1     // Catch:{ all -> 0x0379 }
        L_0x03e8:
            return r3
        L_0x03e9:
            r4 = r17
            r1 = 0
            throw r1     // Catch:{ all -> 0x0379 }
        L_0x03ed:
            r0 = move-exception
            r4 = r17
            goto L_0x03fe
        L_0x03f1:
            r0 = move-exception
            goto L_0x03fd
        L_0x03f3:
            return r3
        L_0x03f4:
            r1 = r9
        L_0x03f5:
            r4.mo63026c(r1)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x03fb:
            return r3
        L_0x03fc:
            r0 = move-exception
        L_0x03fd:
            r4 = r10
        L_0x03fe:
            r1 = 0
        L_0x03ff:
            r4.mo63026c(r1)
            throw r0
        L_0x0403:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.C136754g.mo113351b(java.lang.String, h.c.g):java.lang.Object");
    }
}
