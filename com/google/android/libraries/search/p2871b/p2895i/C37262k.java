package com.google.android.libraries.search.p2871b.p2895i;

import com.google.android.libraries.search.p2871b.p2887b.C37216a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.p4438c.p4439a.C57912a;

/* renamed from: com.google.android.libraries.search.b.i.k */
/* compiled from: PG */
final class C37262k extends C37256e {

    /* renamed from: a */
    private final long f99020a;

    /* renamed from: b */
    private final C58833ax f99021b;

    /* renamed from: c */
    private final C37216a f99022c;

    /* renamed from: d */
    private final C57912a f99023d;

    /* renamed from: e */
    private final C58495hd f99024e;

    /* renamed from: f */
    private final C58528ij f99025f;

    public C37262k(long j, C58833ax axVar, C37216a aVar, C57912a aVar2, C58495hd hdVar, C58528ij ijVar) {
        this.f99020a = j;
        this.f99021b = axVar;
        this.f99022c = aVar;
        this.f99023d = aVar2;
        this.f99024e = hdVar;
        this.f99025f = ijVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo40796a() {
        return this.f99020a;
    }

    /* renamed from: b */
    public final C57912a mo40797b() {
        return this.f99023d;
    }

    /* renamed from: c */
    public final C37216a mo40798c() {
        return this.f99022c;
    }

    /* renamed from: e */
    public final C58833ax mo40799e() {
        return this.f99021b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37256e) {
            C37256e eVar = (C37256e) obj;
            return this.f99020a == eVar.mo40796a() && this.f99021b.equals(eVar.mo40799e()) && this.f99022c.equals(eVar.mo40798c()) && this.f99023d.equals(eVar.mo40797b()) && this.f99024e.equals(eVar.mo40800f()) && this.f99025f.equals(eVar.mo40801g());
        }
    }

    /* renamed from: f */
    public final C58495hd mo40800f() {
        return this.f99024e;
    }

    /* renamed from: g */
    public final C58528ij mo40801g() {
        return this.f99025f;
    }

    public final int hashCode() {
        long j = this.f99020a;
        return this.f99025f.hashCode() ^ ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f99021b.hashCode()) * 1000003) ^ this.f99022c.hashCode()) * 1000003) ^ this.f99023d.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f99024e.entrySet())) * 1000003);
    }
}
