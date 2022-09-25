package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.facebook.litho.LithoView;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.o */
/* compiled from: PG */
final class C134910o {

    /* renamed from: a */
    public final LithoView f367339a;

    /* renamed from: b */
    public final String f367340b;

    public C134910o(LithoView lithoView, String str) {
        C69664n.m101061g(lithoView, "view");
        C69664n.m101061g(str, "contentId");
        this.f367339a = lithoView;
        this.f367340b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134910o)) {
            return false;
        }
        C134910o oVar = (C134910o) obj;
        return C69664n.m101066l(this.f367339a, oVar.f367339a) && C69664n.m101066l(this.f367340b, oVar.f367340b);
    }

    public final int hashCode() {
        return (this.f367339a.hashCode() * 31) + this.f367340b.hashCode();
    }

    public final String toString() {
        LithoView lithoView = this.f367339a;
        String str = this.f367340b;
        return "LithoViewAndContentId(view=" + lithoView + ", contentId=" + str + ")";
    }
}
