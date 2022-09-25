package com.google.android.libraries.search.p2871b.p2887b;

import com.google.android.libraries.search.p2871b.p2890e.C37232a;
import com.google.android.libraries.search.p2871b.p2890e.C37233b;
import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.libraries.search.b.b.a */
/* compiled from: PG */
public final class C37216a {

    /* renamed from: a */
    public final C37232a f98876a;

    /* renamed from: b */
    public final String f98877b;

    /* renamed from: c */
    public final boolean f98878c;

    /* renamed from: d */
    public final boolean f98879d;

    /* renamed from: e */
    public final C58833ax f98880e;

    /* renamed from: f */
    public final C37234c f98881f;

    /* renamed from: g */
    private final int[] f98882g;

    /* renamed from: h */
    private boolean f98883h;

    /* renamed from: i */
    private C58528ij f98884i = C58733pz.f156496a;

    public C37216a(String str, boolean z, C58833ax axVar, int i, C37234c cVar, int[] iArr, C37233b bVar) {
        this.f98877b = str;
        this.f98879d = z;
        this.f98880e = axVar;
        this.f98876a = new C37232a(i, bVar);
        this.f98878c = iArr.length > 0;
        this.f98881f = cVar;
        this.f98882g = iArr;
    }

    /* renamed from: a */
    public final long mo40696a() {
        return ((Long) this.f98880e.mo56107c()).longValue();
    }

    /* renamed from: b */
    public final synchronized C58528ij mo40697b() {
        if (!this.f98883h) {
            C58526ih ihVar = new C58526ih();
            for (int aVar : this.f98882g) {
                C37233b bVar = this.f98876a.f98907b;
                ihVar.mo55373c(new C37232a(aVar, bVar.f98908a, bVar.f98909b));
            }
            this.f98884i = ihVar.mo55486f();
            this.f98883h = true;
        }
        return this.f98884i;
    }
}
