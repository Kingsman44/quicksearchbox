package com.google.android.libraries.lens.view.p2078at;

import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.at.f */
/* compiled from: PG */
public final class C25523f extends C25533p {

    /* renamed from: a */
    public final C60870cx f69503a;

    /* renamed from: b */
    public final C58833ax f69504b;

    /* renamed from: c */
    public final boolean f69505c;

    /* renamed from: d */
    public final C58833ax f69506d;

    /* renamed from: e */
    public final C24226r f69507e;

    public C25523f(C60870cx cxVar, C58833ax axVar, boolean z, C58833ax axVar2, C24226r rVar) {
        this.f69503a = cxVar;
        this.f69504b = axVar;
        this.f69505c = z;
        this.f69506d = axVar2;
        this.f69507e = rVar;
    }

    /* renamed from: a */
    public final C24226r mo30569a() {
        return this.f69507e;
    }

    /* renamed from: b */
    public final C58833ax mo30570b() {
        return this.f69504b;
    }

    @Deprecated
    /* renamed from: c */
    public final C58833ax mo30571c() {
        return this.f69506d;
    }

    /* renamed from: d */
    public final C60870cx mo30572d() {
        return this.f69503a;
    }

    @Deprecated
    /* renamed from: e */
    public final boolean mo30573e() {
        return this.f69505c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25533p) {
            C25533p pVar = (C25533p) obj;
            return this.f69503a.equals(pVar.mo30572d()) && this.f69504b.equals(pVar.mo30570b()) && this.f69505c == pVar.mo30573e() && this.f69506d.equals(pVar.mo30571c()) && this.f69507e.equals(pVar.mo30569a());
        }
    }

    public final int hashCode() {
        return ((((((((this.f69503a.hashCode() ^ 1000003) * 1000003) ^ this.f69504b.hashCode()) * 1000003) ^ (true != this.f69505c ? 1237 : 1231)) * 1000003) ^ this.f69506d.hashCode()) * 1000003) ^ this.f69507e.hashCode();
    }

    public final String toString() {
        String obj = this.f69503a.toString();
        String valueOf = String.valueOf(this.f69504b);
        boolean z = this.f69505c;
        String valueOf2 = String.valueOf(this.f69506d);
        String obj2 = this.f69507e.toString();
        return "FrozenImageConfig{dataFuture=" + obj + ", bootstrapBitmap=" + valueOf + ", shouldResetUi=" + z + ", userSelection=" + valueOf2 + ", source=" + obj2 + "}";
    }
}
