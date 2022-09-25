package com.google.android.libraries.search.assistant.p2828y.p2854o;

import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.p374ah.C7500b;
import com.google.p374ah.C7502d;
import com.google.p374ah.C7504f;
import com.google.p374ah.C7507i;

/* renamed from: com.google.android.libraries.search.assistant.y.o.q */
/* compiled from: PG */
public final class C37055q {

    /* renamed from: a */
    public final C58528ij f96532a;

    /* renamed from: b */
    public final C58528ij f96533b;

    /* renamed from: c */
    public final C58528ij f96534c;

    /* renamed from: d */
    public final C58528ij f96535d;

    /* renamed from: e */
    public final C58528ij f96536e;

    /* renamed from: f */
    public final C58528ij f96537f;

    /* renamed from: g */
    public final C58528ij f96538g;

    /* renamed from: h */
    public final C58528ij f96539h;

    /* renamed from: i */
    public final C58528ij f96540i;

    /* renamed from: j */
    public final C58528ij f96541j;

    /* renamed from: k */
    public final C58528ij f96542k;

    /* renamed from: l */
    public final C58528ij f96543l;

    /* renamed from: m */
    public final C58528ij f96544m;

    /* renamed from: n */
    public final C58528ij f96545n;

    public C37055q(C7507i iVar, C7507i iVar2, C7507i iVar3, C7507i iVar4, C7507i iVar5) {
        this.f96532a = m65792a(iVar);
        this.f96533b = m65792a(iVar2);
        this.f96534c = m65794c(iVar3);
        this.f96535d = m65794c(iVar4);
        this.f96536e = m65793b(iVar5, "type", "/personal/homegraph/room");
        this.f96537f = m65793b(iVar5, "type", "/personal/homegraph/structure");
        this.f96538g = m65793b(iVar5, "trait", "OnOff");
        this.f96539h = m65793b(iVar5, "trait", "Brightness");
        this.f96540i = m65793b(iVar5, "trait", "TemperatureSetting");
        this.f96541j = m65793b(iVar5, "trait", "ColorSetting");
        this.f96542k = m65793b(iVar5, "trait", "Assistant");
        this.f96543l = m65793b(iVar5, "trait", "Cast");
        this.f96544m = m65793b(iVar5, "trait", "CommunicationCall");
        this.f96545n = m65793b(iVar5, "trait", "CommunicationVideoCall");
    }

    /* renamed from: a */
    public static C58528ij m65792a(C7507i iVar) {
        C58526ih ihVar = new C58526ih();
        C7504f fVar = iVar.f24738i;
        if (fVar == null) {
            fVar = C7504f.f24723b;
        }
        for (C7502d dVar : fVar.f24725a) {
            for (C7507i iVar2 : dVar.f24721c) {
                C7504f fVar2 = iVar2.f24738i;
                if (fVar2 == null) {
                    fVar2 = C7504f.f24723b;
                }
                for (C7502d dVar2 : fVar2.f24725a) {
                    C7500b bVar = dVar2.f24720b;
                    if (bVar == null) {
                        bVar = C7500b.f24711d;
                    }
                    String str = bVar.f24715c;
                    if (str.equals("full_name") || str.equals("given_name") || str.equals("alias_name")) {
                        for (C7507i iVar3 : dVar2.f24721c) {
                            ihVar.mo55373c(iVar3.f24733d);
                        }
                    }
                }
            }
        }
        return ihVar.mo55486f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r2 = r2.f24738i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r2 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        r2 = com.google.p374ah.C7504f.f24723b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r2 = r2.f24725a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r2.hasNext() == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r3 = (com.google.p374ah.C7502d) r2.next();
        r4 = r3.f24720b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r4 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        r4 = com.google.p374ah.C7500b.f24711d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r4.f24715c.equals("name_variant") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        r3 = r3.f24721c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        if (r3.hasNext() == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        r0.mo55373c(((com.google.p374ah.C7507i) r3.next()).f24733d);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4522b.C58528ij m65793b(com.google.p374ah.C7507i r7, java.lang.String r8, java.lang.String r9) {
        /*
            com.google.common.b.ih r0 = new com.google.common.b.ih
            r0.<init>()
            com.google.ah.f r7 = r7.f24738i
            if (r7 != 0) goto L_0x000b
            com.google.ah.f r7 = com.google.p374ah.C7504f.f24723b
        L_0x000b:
            com.google.protobuf.cq r7 = r7.f24725a
            java.util.Iterator r7 = r7.iterator()
        L_0x0011:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r1 = r7.next()
            com.google.ah.d r1 = (com.google.p374ah.C7502d) r1
            com.google.protobuf.cq r1 = r1.f24721c
            java.util.Iterator r1 = r1.iterator()
        L_0x0023:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0011
            java.lang.Object r2 = r1.next()
            com.google.ah.i r2 = (com.google.p374ah.C7507i) r2
            com.google.ah.f r3 = r2.f24738i
            if (r3 != 0) goto L_0x0035
            com.google.ah.f r3 = com.google.p374ah.C7504f.f24723b
        L_0x0035:
            com.google.protobuf.cq r3 = r3.f24725a
            java.util.Iterator r3 = r3.iterator()
        L_0x003b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0023
            java.lang.Object r4 = r3.next()
            com.google.ah.d r4 = (com.google.p374ah.C7502d) r4
            com.google.ah.b r5 = r4.f24720b
            if (r5 != 0) goto L_0x004d
            com.google.ah.b r5 = com.google.p374ah.C7500b.f24711d
        L_0x004d:
            java.lang.String r5 = r5.f24715c
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x003b
            com.google.protobuf.cq r4 = r4.f24721c
            java.util.Iterator r4 = r4.iterator()
        L_0x005b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()
            com.google.ah.i r5 = (com.google.p374ah.C7507i) r5
            java.lang.String r6 = r5.f24733d
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x007d
            com.google.ah.b r5 = r5.f24732c
            if (r5 != 0) goto L_0x0075
            com.google.ah.b r5 = com.google.p374ah.C7500b.f24711d
        L_0x0075:
            java.lang.String r5 = r5.f24714b
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x005b
        L_0x007d:
            com.google.ah.f r2 = r2.f24738i
            if (r2 != 0) goto L_0x0083
            com.google.ah.f r2 = com.google.p374ah.C7504f.f24723b
        L_0x0083:
            com.google.protobuf.cq r2 = r2.f24725a
            java.util.Iterator r2 = r2.iterator()
        L_0x0089:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()
            com.google.ah.d r3 = (com.google.p374ah.C7502d) r3
            com.google.ah.b r4 = r3.f24720b
            if (r4 != 0) goto L_0x009b
            com.google.ah.b r4 = com.google.p374ah.C7500b.f24711d
        L_0x009b:
            java.lang.String r4 = r4.f24715c
            java.lang.String r5 = "name_variant"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0089
            com.google.protobuf.cq r3 = r3.f24721c
            java.util.Iterator r3 = r3.iterator()
        L_0x00ab:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r3.next()
            com.google.ah.i r4 = (com.google.p374ah.C7507i) r4
            java.lang.String r4 = r4.f24733d
            r0.mo55373c(r4)
            goto L_0x00ab
        L_0x00bd:
            com.google.common.b.ij r7 = r0.mo55486f()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2854o.C37055q.m65793b(com.google.ah.i, java.lang.String, java.lang.String):com.google.common.b.ij");
    }

    /* renamed from: c */
    public static C58528ij m65794c(C7507i iVar) {
        C58526ih ihVar = new C58526ih();
        C7504f fVar = iVar.f24738i;
        if (fVar == null) {
            fVar = C7504f.f24723b;
        }
        for (C7502d dVar : fVar.f24725a) {
            for (C7507i iVar2 : dVar.f24721c) {
                C7504f fVar2 = iVar2.f24738i;
                if (fVar2 == null) {
                    fVar2 = C7504f.f24723b;
                }
                for (C7502d dVar2 : fVar2.f24725a) {
                    C7500b bVar = dVar2.f24720b;
                    if (bVar == null) {
                        bVar = C7500b.f24711d;
                    }
                    if (bVar.f24715c.equals("name")) {
                        for (C7507i iVar3 : dVar2.f24721c) {
                            ihVar.mo55373c(iVar3.f24733d);
                        }
                    }
                }
            }
        }
        return ihVar.mo55486f();
    }
}
