package com.google.android.libraries.onegoogle.account.disc;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.k */
/* compiled from: PG */
final class C30211k extends C30175ac {

    /* renamed from: a */
    private final C58833ax f81673a;

    /* renamed from: b */
    private final C58833ax f81674b;

    public C30211k(C58833ax axVar, C58833ax axVar2) {
        this.f81673a = axVar;
        this.f81674b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo35623a() {
        return this.f81673a;
    }

    /* renamed from: b */
    public final C58833ax mo35624b() {
        return this.f81674b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30175ac) {
            C30175ac acVar = (C30175ac) obj;
            return this.f81673a.equals(acVar.mo35623a()) && this.f81674b.equals(acVar.mo35624b());
        }
    }

    public final int hashCode() {
        return ((this.f81673a.hashCode() ^ 1000003) * 1000003) ^ this.f81674b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f81673a);
        String valueOf2 = String.valueOf(this.f81674b);
        return "DecorationContent{badgeContent=" + valueOf + ", ringContent=" + valueOf2 + "}";
    }
}
