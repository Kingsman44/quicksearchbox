package com.google.android.apps.search.podcasts.language.p10577a;

import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.a.a */
/* compiled from: PG */
public final class C140516a {

    /* renamed from: a */
    public String f381651a;

    /* renamed from: b */
    public boolean f381652b;

    public C140516a() {
        this((byte[]) null);
    }

    public /* synthetic */ C140516a(byte[] bArr) {
        this.f381651a = BuildConfig.FLAVOR;
        this.f381652b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140516a)) {
            return false;
        }
        C140516a aVar = (C140516a) obj;
        return C69664n.m101066l(this.f381651a, aVar.f381651a) && this.f381652b == aVar.f381652b;
    }

    public final int hashCode() {
        return (this.f381651a.hashCode() * 31) + (this.f381652b ? 1 : 0);
    }

    public final String toString() {
        String str = this.f381651a;
        boolean z = this.f381652b;
        return "FilterConstraintData(constraint=" + str + ", scrollToTop=" + z + ")";
    }
}
