package com.google.apps.tiktok.account.api.controller;

/* renamed from: com.google.apps.tiktok.account.api.controller.bo */
/* compiled from: PG */
final class C46004bo {

    /* renamed from: a */
    public final int f120848a;

    /* renamed from: b */
    public int f120849b;

    public C46004bo(int i, int i2) {
        this.f120848a = i;
        this.f120849b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46004bo)) {
            return false;
        }
        C46004bo boVar = (C46004bo) obj;
        return this.f120848a == boVar.f120848a && this.f120849b == boVar.f120849b;
    }

    public final int hashCode() {
        return (this.f120848a * 31) + this.f120849b;
    }

    public final String toString() {
        int i = this.f120848a;
        int i2 = this.f120849b;
        return "ActiveCallbacks(callbacksId=" + i + ", callbacksState=" + i2 + ")";
    }
}
