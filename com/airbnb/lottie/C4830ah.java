package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.ah */
/* compiled from: PG */
public final class C4830ah {

    /* renamed from: a */
    public final Object f15396a;

    /* renamed from: b */
    public final Throwable f15397b;

    public C4830ah(Object obj) {
        this.f15396a = obj;
        this.f15397b = null;
    }

    public C4830ah(Throwable th) {
        this.f15397b = th;
        this.f15396a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4830ah)) {
            return false;
        }
        C4830ah ahVar = (C4830ah) obj;
        Object obj2 = this.f15396a;
        if (obj2 != null && obj2.equals(ahVar.f15396a)) {
            return true;
        }
        Throwable th = this.f15397b;
        if (th == null || ahVar.f15397b == null) {
            return false;
        }
        return th.toString().equals(this.f15397b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15396a, this.f15397b});
    }
}
