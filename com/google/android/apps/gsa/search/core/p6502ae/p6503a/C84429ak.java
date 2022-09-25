package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import com.google.android.gms.appdatasearch.Section;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21453aa;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21473u;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21478z;
import com.google.common.base.C58827ar;
import com.google.p4152bb.p4153a.C55038do;
import com.google.p4152bb.p4153a.C55040dq;
import com.google.p4152bb.p4153a.C55042ds;
import com.google.p4152bb.p4153a.C55044du;
import com.google.p4152bb.p4153a.C55046dw;
import com.google.p4152bb.p4153a.C55047dx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.ak */
/* compiled from: PG */
public final class C84429ak {

    /* renamed from: a */
    public final C55047dx f229726a;

    /* renamed from: b */
    public final C68214a f229727b;

    /* renamed from: c */
    public final int f229728c;

    /* renamed from: d */
    public List f229729d;

    /* renamed from: e */
    public C21473u f229730e;

    /* renamed from: f */
    private final C68214a f229731f;

    /* renamed from: g */
    private String f229732g;

    public C84429ak(C55047dx dxVar, C68214a aVar, C68214a aVar2, int i) {
        this.f229726a = dxVar;
        this.f229727b = aVar;
        this.f229731f = aVar2;
        this.f229728c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r4 = r4.substring(9);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List m134757c(com.google.p4152bb.p4153a.C55047dx r9, java.util.List r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.protobuf.cq r9 = r9.f144825c
            java.util.Iterator r9 = r9.iterator()
        L_0x000b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r9.next()
            com.google.bb.a.ds r1 = (com.google.p4152bb.p4153a.C55042ds) r1
            com.google.protobuf.cq r1 = r1.f144813a
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x000b
            java.lang.Object r2 = r1.next()
            com.google.bb.a.du r2 = (com.google.p4152bb.p4153a.C55044du) r2
            int r3 = r2.f144817b
            if (r3 < 0) goto L_0x0086
            int r4 = r10.size()
            if (r3 < r4) goto L_0x0034
            goto L_0x0086
        L_0x0034:
            int r3 = r2.f144817b
            java.lang.Object r3 = r10.get(r3)
            com.google.android.libraries.gcoreclient.c.a.aa r3 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21453aa) r3
            com.google.android.gms.appdatasearch.Section r4 = r3.f59904a
            java.lang.String r4 = r4.f387556a
            java.lang.String r5 = "semantic#"
            boolean r6 = r4.startsWith(r5)
            r7 = 0
            if (r6 != 0) goto L_0x004a
            goto L_0x006a
        L_0x004a:
            r6 = 9
            java.lang.String r4 = r4.substring(r6)
            r6 = 59
            int r6 = r4.indexOf(r6)
            r8 = -1
            if (r6 != r8) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            android.util.Pair r7 = new android.util.Pair
            r8 = 0
            java.lang.String r8 = r4.substring(r8, r6)
            int r6 = r6 + 1
            java.lang.String r4 = r4.substring(r6)
            r7.<init>(r8, r4)
        L_0x006a:
            com.google.android.gms.appdatasearch.Section r3 = r3.f59904a
            java.lang.String r3 = r3.f387556a
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x001d
            if (r7 == 0) goto L_0x001d
            java.lang.String r3 = "body"
            java.lang.Object r4 = r7.second
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x001d
            java.lang.String r2 = r2.f144818c
            r0.add(r2)
            goto L_0x001d
        L_0x0086:
            int r2 = r2.f144817b
            goto L_0x001d
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84429ak.m134757c(com.google.bb.a.dx, java.util.List):java.util.List");
    }

    /* renamed from: a */
    public final String mo78008a() {
        if (this.f229732g == null) {
            C55047dx dxVar = this.f229726a;
            List b = mo78009b(dxVar);
            StringBuilder sb = new StringBuilder();
            for (C55042ds dsVar : dxVar.f144825c) {
                if (dsVar.f144813a.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (C55044du duVar : dsVar.f144813a) {
                        int i = duVar.f144817b;
                        if (i < 0 || i >= b.size()) {
                            int i2 = duVar.f144817b;
                        } else {
                            arrayList.add(String.format("%s:%s ", new Object[]{((C21453aa) b.get(duVar.f144817b)).f59904a.f387556a, duVar.f144818c}));
                        }
                    }
                    new C58827ar("OR ").mo56100g(sb, arrayList);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C55040dq dqVar : dxVar.f144830h) {
                int i3 = dqVar.f144809b;
                int a = C55046dw.m87567a(i3);
                if (a != 0 && a == 2) {
                    arrayList2.add(String.format("%s:%s", new Object[]{"tag", dqVar.f144808a}));
                } else {
                    int a2 = C55046dw.m87567a(i3);
                    if (a2 != 0 && a2 == 3) {
                        arrayList2.add(String.format("%s:%s", new Object[]{"-tag", dqVar.f144808a}));
                    }
                }
            }
            new C58827ar(" ").mo56100g(sb, arrayList2);
            this.f229732g = sb.toString().trim();
        }
        return this.f229732g;
    }

    /* renamed from: b */
    public final List mo78009b(C55047dx dxVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (C55038do doVar : dxVar.f144824b) {
            if (!doVar.f144803c.isEmpty()) {
                if (doVar.f144802b.isEmpty()) {
                    str = doVar.f144803c;
                } else {
                    str = Section.m231701a(doVar.f144802b, doVar.f144803c);
                }
                boolean z = doVar.f144804d;
                int i = z ? doVar.f144805e : 0;
                C21478z zVar = (C21478z) this.f229731f.mo27525b();
                arrayList.add(new C21453aa(str, z, i));
            }
        }
        return arrayList;
    }
}
