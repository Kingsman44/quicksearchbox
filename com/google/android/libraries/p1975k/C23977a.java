package com.google.android.libraries.p1975k;

import android.content.Context;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.k.a */
/* compiled from: PG */
public final class C23977a extends C23995c {

    /* renamed from: a */
    public final Context f65576a;

    /* renamed from: b */
    public final C58833ax f65577b;

    /* renamed from: c */
    public final C58833ax f65578c;

    /* renamed from: d */
    public final C58833ax f65579d;

    public C23977a(Context context, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f65576a = context;
        this.f65577b = axVar;
        this.f65578c = axVar2;
        this.f65579d = axVar3;
    }

    /* renamed from: a */
    public final Context mo29383a() {
        return this.f65576a;
    }

    /* renamed from: b */
    public final C58833ax mo29384b() {
        return this.f65577b;
    }

    /* renamed from: c */
    public final C58833ax mo29385c() {
        return this.f65579d;
    }

    /* renamed from: d */
    public final C58833ax mo29386d() {
        return this.f65578c;
    }

    /* renamed from: e */
    public final boolean mo29387e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23995c) {
            C23995c cVar = (C23995c) obj;
            return this.f65576a.equals(cVar.mo29383a()) && this.f65577b.equals(cVar.mo29384b()) && this.f65578c.equals(cVar.mo29386d()) && !cVar.mo29387e() && this.f65579d.equals(cVar.mo29385c());
        }
    }

    public final int hashCode() {
        return ((((((((this.f65576a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.f65578c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String obj = this.f65576a.toString();
        String valueOf = String.valueOf(this.f65578c);
        String valueOf2 = String.valueOf(this.f65579d);
        return "CollectionBasisContext{context=" + obj + ", accountNames=Optional.absent(), stacktrace=" + valueOf + ", googlerOverridesCheckbox=false, executor=" + valueOf2 + "}";
    }
}
