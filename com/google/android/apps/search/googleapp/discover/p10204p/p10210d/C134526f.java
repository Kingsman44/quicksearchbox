package com.google.android.apps.search.googleapp.discover.p10204p.p10210d;

import com.google.android.apps.search.googleapp.discover.p10244v.C135158bc;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.storage.protostore.C42876ab;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.d.f */
/* compiled from: PG */
public final class C134526f {

    /* renamed from: a */
    public final C42876ab f366350a;

    /* renamed from: b */
    public final C21232ab f366351b;

    /* renamed from: c */
    private final C69585o f366352c;

    /* renamed from: d */
    private final C135158bc f366353d;

    public C134526f(C42876ab abVar, C69585o oVar, C135158bc bcVar, C21232ab abVar2) {
        C69664n.m101061g(abVar, "store");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(abVar2, "dataStore");
        this.f366350a = abVar;
        this.f366352c = oVar;
        this.f366353d = bcVar;
        this.f366351b = abVar2;
        bcVar.mo112136a(C134752c.f366921a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111808a(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134522b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.discover.p.d.b r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134522b) r0
            int r1 = r0.f366343c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f366343c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.p.d.b r0 = new com.google.android.apps.search.googleapp.discover.p.d.b
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f366341a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f366343c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r10)
            goto L_0x003a
        L_0x0027:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002f:
            p5462h.C69714l.m101134b(r10)
            r0.f366343c = r3
            java.lang.Object r10 = r9.mo111809b(r0)
            if (r10 == r1) goto L_0x0125
        L_0x003a:
            com.google.android.apps.search.googleapp.discover.p.c.f r10 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f) r10
            com.google.bv.e.b.c.a.cn r0 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57286cn.f152926b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bv.e.b.c.a.ck r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57283ck) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.protobuf.cq r1 = r10.f366286a
            java.lang.String r2 = "onDeviceContent.watchCollectionList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0054:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0115
            java.lang.Object r2 = r1.next()
            com.google.android.apps.search.googleapp.discover.p.c.n r2 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r2
            com.google.bv.e.b.c.a.cm r4 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57285cm.f152919f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bv.e.b.c.a.cl r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57284cl) r4
            java.lang.String r5 = r2.f366305c
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.bv.e.b.c.a.cm r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57285cm) r6
            r5.getClass()
            int r7 = r6.f152921a
            r7 = r7 | r3
            r6.f152921a = r7
            r6.f152922b = r5
            com.google.protobuf.cq r5 = r2.f366304b
            int r5 = r5.size()
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.bv.e.b.c.a.cm r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57285cm) r6
            int r7 = r6.f152921a
            r7 = r7 | 2
            r6.f152921a = r7
            long r7 = (long) r5
            r6.f152923c = r7
            com.google.protobuf.cq r5 = r2.f366304b
            java.lang.String r6 = "it.watchItemList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00f0
            com.google.protobuf.cq r5 = r2.f366304b
            r7 = 0
            java.lang.Object r5 = r5.get(r7)
            com.google.android.apps.search.googleapp.discover.p.c.p r5 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r5
            java.lang.String r5 = r5.f366314e
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.bv.e.b.c.a.cm r7 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57285cm) r7
            r5.getClass()
            int r8 = r7.f152921a
            r8 = r8 | 4
            r7.f152921a = r8
            r7.f152924d = r5
            com.google.protobuf.cq r2 = r2.f366304b
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x00c4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r5 = r2.next()
            com.google.android.apps.search.googleapp.discover.p.c.p r5 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r5
            java.lang.String r5 = r5.f366318i
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.bv.e.b.c.a.cm r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57285cm) r6
            r5.getClass()
            com.google.protobuf.cq r7 = r6.f152925e
            boolean r8 = r7.mo58948c()
            if (r8 != 0) goto L_0x00ea
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f152925e = r7
        L_0x00ea:
            com.google.protobuf.cq r6 = r6.f152925e
            r6.add(r5)
            goto L_0x00c4
        L_0x00f0:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bv.e.b.c.a.cn r2 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57286cn) r2
            com.google.protobuf.bv r4 = r4.build()
            com.google.bv.e.b.c.a.cm r4 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57285cm) r4
            r4.getClass()
            com.google.protobuf.cq r5 = r2.f152929a
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x010e
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)
            r2.f152929a = r5
        L_0x010e:
            com.google.protobuf.cq r2 = r2.f152929a
            r2.add(r4)
            goto L_0x0054
        L_0x0115:
            com.google.android.apps.search.googleapp.discover.p.d.a r1 = new com.google.android.apps.search.googleapp.discover.p.d.a
            com.google.protobuf.bv r0 = r0.build()
            java.lang.String r2 = "onDeviceContentMetadata.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            com.google.bv.e.b.c.a.cn r0 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57286cn) r0
            r1.<init>(r10, r0)
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134526f.mo111808a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111809b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134523c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.discover.p.d.c r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134523c) r0
            int r1 = r0.f366346c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f366346c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.p.d.c r0 = new com.google.android.apps.search.googleapp.discover.p.d.c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f366344a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f366346c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            h.c.o r6 = r5.f366352c
            com.google.android.apps.search.googleapp.discover.p.d.d r2 = new com.google.android.apps.search.googleapp.discover.p.d.d
            r4 = 0
            r2.<init>(r5, r4)
            r0.f366346c = r3
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r6, r2, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r0 = "suspend fun readOnDevice…t) { store.data.await() }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134526f.mo111809b(h.c.g):java.lang.Object");
    }
}
