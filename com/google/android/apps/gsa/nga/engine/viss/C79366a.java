package com.google.android.apps.gsa.nga.engine.viss;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.a */
/* compiled from: PG */
final class C79366a extends C79370ac {

    /* renamed from: a */
    public final C120124o f217980a;

    /* renamed from: b */
    public final int f217981b;

    public C79366a(int i, C120124o oVar) {
        this.f217981b = i;
        if (oVar != null) {
            this.f217980a = oVar;
            return;
        }
        throw new NullPointerException("Null preferredApaVariance");
    }

    /* renamed from: a */
    public final C120124o mo73936a() {
        return this.f217980a;
    }

    /* renamed from: b */
    public final int mo73937b() {
        return this.f217981b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79370ac) {
            C79370ac acVar = (C79370ac) obj;
            return this.f217981b == acVar.mo73937b() && this.f217980a.equals(acVar.mo73936a());
        }
    }

    public final int hashCode() {
        return ((this.f217981b ^ 1000003) * 1000003) ^ this.f217980a.hashCode();
    }

    public final String toString() {
        int i = this.f217981b;
        String obj = this.f217980a.toString();
        return "SessionConfiguration{type=" + C79369ab.m127348a(i) + ", preferredApaVariance=" + obj + "}";
    }
}
