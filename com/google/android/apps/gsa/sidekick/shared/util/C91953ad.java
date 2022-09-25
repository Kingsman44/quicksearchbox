package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7728ht;
import com.google.p375ai.p378b.C7744ii;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ad */
/* compiled from: PG */
public class C91953ad {

    /* renamed from: a */
    private int f256450a = 0;

    /* renamed from: g */
    public boolean f256451g = false;

    protected C91953ad() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7726hr mo85622a(C7726hr hrVar) {
        return hrVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo85609b(C7718hj hjVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C7718hj mo85623c(C7718hj hjVar) {
        return hjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C7744ii mo85624d(C7744ii iiVar) {
        return iiVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C7718hj mo85640e(C7718hj hjVar) {
        return hjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C7718hj mo85641f(C7718hj hjVar) {
        return hjVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0015 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p375ai.p378b.C7726hr mo86652i(com.google.p375ai.p378b.C7726hr r9) {
        /*
            r8 = this;
            com.google.protobuf.bn r0 = r9.toBuilder()
            com.google.ai.b.hq r0 = (com.google.p375ai.p378b.C7725hq) r0
            com.google.protobuf.cq r1 = r9.f27012c
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r1.next()
            com.google.ai.b.hr r3 = (com.google.p375ai.p378b.C7726hr) r3
            if (r3 != 0) goto L_0x0027
        L_0x0025:
            r4 = 1
            goto L_0x005f
        L_0x0027:
            int r6 = r3.f27010a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x003f
            com.google.ai.b.hj r6 = r3.f27016g
            if (r6 != 0) goto L_0x0033
            com.google.ai.b.hj r6 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x0033:
            boolean r6 = r8.mo85609b(r6)
            if (r6 == 0) goto L_0x003f
            int r4 = r8.f256450a
            int r4 = r4 + r5
            r8.f256450a = r4
            goto L_0x0025
        L_0x003f:
            int r6 = r3.f27010a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0057
            com.google.ai.b.hj r6 = r3.f27015f
            if (r6 != 0) goto L_0x004b
            com.google.ai.b.hj r6 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x004b:
            boolean r6 = r8.mo85609b(r6)
            if (r6 == 0) goto L_0x0057
            int r4 = r8.f256450a
            int r4 = r4 + r5
            r8.f256450a = r4
            goto L_0x0025
        L_0x0057:
            com.google.ai.b.hr r3 = r8.mo85622a(r3)
            com.google.ai.b.hr r3 = r8.mo86652i(r3)
        L_0x005f:
            if (r4 != 0) goto L_0x0080
            if (r3 == 0) goto L_0x0080
            int r6 = r3.f27010a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x006a
            goto L_0x0080
        L_0x006a:
            com.google.protobuf.cq r6 = r3.f27012c
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0080
            com.google.protobuf.cq r6 = r3.f27013d
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0080
            int r3 = r8.f256450a
            int r3 = r3 + r5
            r8.f256450a = r3
            goto L_0x0015
        L_0x0080:
            if (r4 != 0) goto L_0x0015
            r2.add(r3)
            goto L_0x0015
        L_0x0086:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.ai.b.hr r1 = (com.google.p375ai.p378b.C7726hr) r1
            com.google.protobuf.cq r3 = com.google.p375ai.p378b.C7726hr.emptyProtobufList()
            r1.f27012c = r3
            r0.mo16948a(r2)
            int r1 = r9.f27010a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x00b8
            com.google.ai.b.hj r1 = r9.f27016g
            if (r1 != 0) goto L_0x00a2
            com.google.ai.b.hj r1 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x00a2:
            com.google.ai.b.hj r1 = r8.mo85641f(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.ai.b.hr r2 = (com.google.p375ai.p378b.C7726hr) r2
            r1.getClass()
            r2.f27016g = r1
            int r1 = r2.f27010a
            r1 = r1 | 8
            r2.f27010a = r1
        L_0x00b8:
            int r1 = r9.f27010a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00da
            com.google.ai.b.hj r1 = r9.f27015f
            if (r1 != 0) goto L_0x00c4
            com.google.ai.b.hj r1 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x00c4:
            com.google.ai.b.hj r1 = r8.mo85640e(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.ai.b.hr r2 = (com.google.p375ai.p378b.C7726hr) r2
            r1.getClass()
            r2.f27015f = r1
            int r1 = r2.f27010a
            r1 = r1 | 2
            r2.f27010a = r1
        L_0x00da:
            com.google.protobuf.cq r1 = r9.f27013d
            java.util.ArrayList r1 = com.google.common.p4522b.C58597ky.m90211b(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            int r3 = r1.size()
        L_0x00ed:
            if (r4 >= r3) goto L_0x0116
            java.lang.Object r6 = r1.get(r4)
            com.google.ai.b.hj r6 = (com.google.p375ai.p378b.C7718hj) r6
            if (r6 == 0) goto L_0x010e
            int r7 = r9.f27010a
            r7 = r7 & 2
            if (r7 == 0) goto L_0x00ff
            com.google.ai.b.hj r7 = r9.f27015f
        L_0x00ff:
            boolean r7 = r8.mo85609b(r6)
            if (r7 == 0) goto L_0x0106
            goto L_0x010e
        L_0x0106:
            com.google.ai.b.hj r6 = r8.mo85623c(r6)
            r2.add(r6)
            goto L_0x0113
        L_0x010e:
            int r6 = r8.f256450a
            int r6 = r6 + r5
            r8.f256450a = r6
        L_0x0113:
            int r4 = r4 + 1
            goto L_0x00ed
        L_0x0116:
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.ai.b.hr r9 = (com.google.p375ai.p378b.C7726hr) r9
            com.google.protobuf.cq r1 = com.google.p375ai.p378b.C7726hr.emptyProtobufList()
            r9.f27013d = r1
            r0.mo16949b(r2)
            com.google.protobuf.bv r9 = r0.build()
            com.google.ai.b.hr r9 = (com.google.p375ai.p378b.C7726hr) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.util.C91953ad.mo86652i(com.google.ai.b.hr):com.google.ai.b.hr");
    }

    /* renamed from: j */
    public final C7744ii mo86653j(C7744ii iiVar) {
        C7728ht htVar = (C7728ht) mo85624d(iiVar).toBuilder();
        C7744ii iiVar2 = (C7744ii) htVar.instance;
        if ((iiVar2.f27056a & 1) != 0) {
            C7726hr hrVar = iiVar2.f27057b;
            if (hrVar == null) {
                hrVar = C7726hr.f27008i;
            }
            C7726hr i = mo86652i(mo85622a(hrVar));
            htVar.copyOnWrite();
            C7744ii iiVar3 = (C7744ii) htVar.instance;
            i.getClass();
            iiVar3.f27057b = i;
            iiVar3.f27056a |= 1;
        }
        return (C7744ii) htVar.build();
    }

    /* renamed from: k */
    public final C7744ii mo86654k(C7744ii iiVar) {
        this.f256451g = true;
        return mo86653j(iiVar);
    }

    /* renamed from: l */
    public final C7744ii mo86655l(C7744ii iiVar) {
        this.f256451g = false;
        return mo86653j(iiVar);
    }

    /* renamed from: m */
    public final List mo86656m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo86653j((C7744ii) it.next()));
        }
        return arrayList;
    }
}
