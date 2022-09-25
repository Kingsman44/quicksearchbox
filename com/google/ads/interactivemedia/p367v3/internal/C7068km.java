package com.google.ads.interactivemedia.p367v3.internal;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.internal.km */
/* compiled from: PG */
public final class C7068km {

    /* renamed from: a */
    public final C7071kp f22625a;

    /* renamed from: b */
    public final C7071kp f22626b;

    public C7068km(C7071kp kpVar, C7071kp kpVar2) {
        this.f22625a = kpVar;
        this.f22626b = kpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7068km kmVar = (C7068km) obj;
            return this.f22625a.equals(kmVar.f22625a) && this.f22626b.equals(kmVar.f22626b);
        }
    }

    public final int hashCode() {
        return (this.f22625a.hashCode() * 31) + this.f22626b.hashCode();
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f22625a);
        if (this.f22625a.equals(this.f22626b)) {
            str = BuildConfig.FLAVOR;
        } else {
            String valueOf2 = String.valueOf(this.f22626b);
            String.valueOf(valueOf2).length();
            str = ", ".concat(String.valueOf(valueOf2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + str.length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
