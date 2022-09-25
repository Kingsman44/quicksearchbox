package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40028ai;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b */
/* compiled from: PG */
final class C39992b extends C40076p {

    /* renamed from: a */
    private final C40028ai f105131a;

    /* renamed from: b */
    private final C40306b f105132b;

    public C39992b(C40028ai aiVar, C40306b bVar) {
        this.f105131a = aiVar;
        this.f105132b = bVar;
    }

    /* renamed from: a */
    public final C40028ai mo42109a() {
        return this.f105131a;
    }

    /* renamed from: b */
    public final C40306b mo42110b() {
        return this.f105132b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40076p) {
            C40076p pVar = (C40076p) obj;
            return this.f105131a.equals(pVar.mo42109a()) && this.f105132b.equals(pVar.mo42110b());
        }
    }

    public final int hashCode() {
        return ((this.f105131a.hashCode() ^ 1000003) * 1000003) ^ this.f105132b.hashCode();
    }

    public final String toString() {
        String obj = this.f105131a.toString();
        String obj2 = this.f105132b.toString();
        return "XUiKitContext{viewsVisibilityTracker=" + obj + ", clientContext=" + obj2 + "}";
    }
}
