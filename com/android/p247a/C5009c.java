package com.android.p247a;

import com.android.p247a.p249b.p250a.C4991b;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.a.c */
/* compiled from: PG */
public final class C5009c {

    /* renamed from: a */
    public final List f15868a;

    /* renamed from: b */
    private final List f15869b;

    /* renamed from: c */
    private final List f15870c;

    /* renamed from: d */
    private final List f15871d;

    /* renamed from: e */
    private final List f15872e;

    public C5009c(C4991b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f15870c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f15871d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f15872e = arrayList3;
        this.f15869b = bVar.f15812b;
        this.f15868a = bVar.f15813c;
        arrayList.addAll(bVar.f15816f);
        arrayList2.addAll(bVar.f15815e);
        arrayList3.addAll(bVar.f15814d);
        long j = bVar.f15811a;
    }

    /* renamed from: a */
    public final X509Certificate mo9966a() {
        if (this.f15869b.isEmpty()) {
            return null;
        }
        return (X509Certificate) this.f15869b.get(0);
    }
}
