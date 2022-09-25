package com.airbnb.lottie.p238c;

import androidx.core.p097i.C1970e;

/* renamed from: com.airbnb.lottie.c.i */
/* compiled from: PG */
public final class C4894i {

    /* renamed from: a */
    public Object f15629a;

    /* renamed from: b */
    public Object f15630b;

    /* renamed from: a */
    private static boolean m13590a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1970e)) {
            return false;
        }
        C1970e eVar = (C1970e) obj;
        if (!m13590a(eVar.f5888a, this.f15629a) || !m13590a(eVar.f5889b, this.f15630b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f15629a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f15630b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15629a);
        String valueOf2 = String.valueOf(this.f15630b);
        return "Pair{" + valueOf + " " + valueOf2 + "}";
    }
}
