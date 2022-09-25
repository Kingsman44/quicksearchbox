package com.google.android.libraries.search.p2871b.p2895i;

import com.google.common.base.C58833ax;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.b.i.l */
/* compiled from: PG */
public final class C37263l extends C37265n {

    /* renamed from: a */
    private final C71189f f99026a;

    /* renamed from: b */
    private final C58833ax f99027b;

    /* renamed from: c */
    private final boolean f99028c;

    public C37263l(C71189f fVar, C58833ax axVar, boolean z) {
        if (fVar != null) {
            this.f99026a = fVar;
            this.f99027b = axVar;
            this.f99028c = z;
            return;
        }
        throw new NullPointerException("Null appFlow");
    }

    /* renamed from: a */
    public final C58833ax mo40820a() {
        return this.f99027b;
    }

    /* renamed from: b */
    public final C71189f mo40821b() {
        return this.f99026a;
    }

    /* renamed from: c */
    public final boolean mo40822c() {
        return this.f99028c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37265n) {
            C37265n nVar = (C37265n) obj;
            return this.f99026a.equals(nVar.mo40821b()) && this.f99027b.equals(nVar.mo40820a()) && this.f99028c == nVar.mo40822c();
        }
    }

    public final int hashCode() {
        return ((((this.f99026a.hashCode() ^ 1000003) * 1000003) ^ this.f99027b.hashCode()) * 1000003) ^ (true != this.f99028c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f99026a.toString();
        String obj2 = this.f99027b.toString();
        boolean z = this.f99028c;
        return "LoggedAppFlow{appFlow=" + obj + ", loggedTimeNanos=" + obj2 + ", sampledOut=" + z + "}";
    }
}
