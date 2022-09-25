package com.android.p247a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.android.a.d */
/* compiled from: PG */
public final class C5011d {

    /* renamed from: a */
    public final List f15873a;

    /* renamed from: b */
    public final List f15874b;

    /* renamed from: c */
    public final List f15875c;

    /* renamed from: d */
    public C5009c f15876d;

    /* renamed from: e */
    public boolean f15877e;

    /* renamed from: f */
    private final List f15878f = new ArrayList();

    /* renamed from: g */
    private final List f15879g = new ArrayList();

    public C5011d() {
        ArrayList arrayList = new ArrayList();
        this.f15873a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f15874b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f15875c = arrayList3;
        Arrays.asList(new List[]{arrayList, arrayList2, arrayList3});
    }

    /* renamed from: a */
    public final void mo9967a(int i, Object... objArr) {
        this.f15878f.add(new C4980a(i, objArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9968b(int i, Object... objArr) {
        this.f15879g.add(new C4980a(i, objArr));
    }
}
