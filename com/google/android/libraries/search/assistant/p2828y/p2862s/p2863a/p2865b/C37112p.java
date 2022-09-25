package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d.C37122d;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.p */
/* compiled from: PG */
public final class C37112p implements C37108l {

    /* renamed from: a */
    private static final C59071e f96667a = C59071e.m91331h();

    /* renamed from: b */
    private static final String[] f96668b = {"contact_id", "account_type", "account_name"};

    /* renamed from: c */
    private final C46877q f96669c;

    /* renamed from: d */
    private final C37122d f96670d;

    /* renamed from: e */
    private final C37097a f96671e;

    public C37112p(C46877q qVar, C37122d dVar, C37097a aVar) {
        C69664n.m101061g(qVar, "contentResolver");
        C69664n.m101061g(dVar, "cursorUtil");
        this.f96669c = qVar;
        this.f96670d = dVar;
        this.f96671e = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00db A[LOOP:0: B:27:0x00d5->B:29:0x00db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40636a(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37110n
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.assistant.y.s.a.b.n r0 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37110n) r0
            int r1 = r0.f96666g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96666g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.y.s.a.b.n r0 = new com.google.android.libraries.search.assistant.y.s.a.b.n
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f96664e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f96666g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r2 = r0.f96663d
            java.lang.Object r4 = r0.f96662c
            java.lang.Object r5 = r0.f96661b
            java.lang.Object r6 = r0.f96660a
            p5462h.C69714l.m101134b(r13)
            goto L_0x00b9
        L_0x0033:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003b:
            java.lang.Object r2 = r0.f96660a
            p5462h.C69714l.m101134b(r13)
            goto L_0x007b
        L_0x0041:
            p5462h.C69714l.m101134b(r13)
            com.google.common.f.e r13 = f96667a
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r2 = new com.google.common.f.n
            r5 = 52519(0xcd27, float:7.3595E-41)
            r2.<init>(r5)
            r13.mo56379ah(r2)
            java.lang.String r2 = "fetch ContactsContracts"
            r13.mo56386p(r2)
            com.google.apps.tiktok.dataservice.q r5 = r12.f96669c
            android.net.Uri r6 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            java.lang.String[] r7 = f96668b
            r8 = 0
            r9 = 0
            r10 = 0
            com.google.apps.tiktok.concurrent.o r13 = r5.mo50872b(r6, r7, r8, r9, r10)
            com.google.android.libraries.search.assistant.y.s.a.b.o r2 = new com.google.android.libraries.search.assistant.y.s.a.b.o
            r2.<init>()
            r0.f96660a = r12
            r0.f96666g = r4
            com.google.android.libraries.search.assistant.y.s.a.d.d r4 = r12.f96670d
            java.lang.Object r13 = r4.mo40645a(r13, r2, r0)
            if (r13 == r1) goto L_0x00ec
            r2 = r12
        L_0x007b:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r13 = r13.iterator()
            r6 = r2
            r5 = r4
            r4 = r13
        L_0x0089:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x00c6
            java.lang.Object r2 = r4.next()
            r13 = r2
            com.google.android.libraries.search.assistant.y.s.a.b.m r13 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37109m) r13
            r7 = r6
            com.google.android.libraries.search.assistant.y.s.a.b.p r7 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37112p) r7
            com.google.android.libraries.search.assistant.y.s.a.b.a r7 = r7.f96671e
            java.lang.String r8 = r13.f96658b
            java.lang.String r13 = r13.f96659c
            r0.f96660a = r6
            r0.f96661b = r5
            r0.f96662c = r4
            r0.f96663d = r2
            r0.f96666g = r3
            com.google.android.libraries.search.assistant.y.s.a.b.c r7 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37099c) r7
            h.c.o r9 = r7.f96632a
            com.google.android.libraries.search.assistant.y.s.a.b.b r10 = new com.google.android.libraries.search.assistant.y.s.a.b.b
            r11 = 0
            r10.<init>(r7, r8, r13, r11)
            java.lang.Object r13 = kotlinx.coroutines.C71803m.m105040a(r9, r10, r0)
            if (r13 == r1) goto L_0x00c5
        L_0x00b9:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0089
            r5.add(r2)
            goto L_0x0089
        L_0x00c5:
            return r1
        L_0x00c6:
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = p5462h.p5463a.C69540x.m100804k(r5, r0)
            r13.<init>(r0)
            java.util.Iterator r0 = r5.iterator()
        L_0x00d5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.search.assistant.y.s.a.b.m r1 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37109m) r1
            java.lang.String r1 = r1.f96657a
            r13.add(r1)
            goto L_0x00d5
        L_0x00e7:
            java.util.Set r13 = p5462h.p5463a.C69540x.m100846ab(r13)
            return r13
        L_0x00ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37112p.mo40636a(h.c.g):java.lang.Object");
    }
}
