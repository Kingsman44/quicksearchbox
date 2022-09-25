package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.core.C42276bb;
import com.google.android.libraries.social.populous.core.SessionContext;

/* renamed from: com.google.android.libraries.social.populous.e.b.f */
/* compiled from: PG */
public final class C42427f extends C42444w {

    /* renamed from: a */
    public final int f111291a;

    /* renamed from: b */
    private final SessionContext f111292b;

    /* renamed from: c */
    private final boolean f111293c;

    /* renamed from: d */
    private final C42276bb f111294d;

    public C42427f(int i, SessionContext sessionContext, boolean z, C42276bb bbVar) {
        this.f111291a = i;
        this.f111292b = sessionContext;
        this.f111293c = z;
        this.f111294d = bbVar;
    }

    /* renamed from: a */
    public final C42276bb mo45475a() {
        return this.f111294d;
    }

    /* renamed from: b */
    public final SessionContext mo45476b() {
        return this.f111292b;
    }

    /* renamed from: c */
    public final boolean mo45477c() {
        return this.f111293c;
    }

    /* renamed from: d */
    public final int mo45478d() {
        return this.f111291a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42444w) {
            C42444w wVar = (C42444w) obj;
            return this.f111291a == wVar.mo45478d() && this.f111292b.equals(wVar.mo45476b()) && this.f111293c == wVar.mo45477c() && this.f111294d.equals(wVar.mo45475a());
        }
    }

    public final int hashCode() {
        return ((((((this.f111291a ^ 1000003) * 1000003) ^ this.f111292b.hashCode()) * 1000003) ^ (true != this.f111293c ? 1237 : 1231)) * 1000003) ^ this.f111294d.hashCode();
    }

    public final String toString() {
        int i = this.f111291a;
        String str = i != 1 ? i != 2 ? "COALESCED" : "FIELD_FLATTENED" : "NONE";
        String obj = this.f111292b.toString();
        boolean z = this.f111293c;
        String obj2 = this.f111294d.toString();
        return "LoaderQueryOptions{resultsGroupingOption=" + str + ", sessionContext=" + obj + ", useLiveAutocomplete=" + z + ", minimumTopNCacheCallbackStatus=" + obj2 + "}";
    }
}
