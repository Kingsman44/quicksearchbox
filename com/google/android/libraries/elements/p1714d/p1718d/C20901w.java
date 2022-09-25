package com.google.android.libraries.elements.p1714d.p1718d;

import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.C21276bs;
import com.google.android.libraries.elements.interfaces.C21277bt;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.d.d.w */
/* compiled from: PG */
final class C20901w extends C21276bs {

    /* renamed from: b */
    private final C69464a f58600b;

    public C20901w(C69464a aVar) {
        this.f58600b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C21277bt mo26036a(String str, Object obj) {
        return new C20900v(((IntersectionEngine) this.f58600b.mo17428b()).subscribe(str, (IntersectionObserver) obj));
    }

    /* renamed from: b */
    public final void mo26037b() {
        ((IntersectionEngine) this.f58600b.mo17428b()).checkProminence();
    }

    /* renamed from: c */
    public final void mo26038c(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
        ((IntersectionEngine) this.f58600b.mo17428b()).onExit(str, rect, rect2, rect3, z);
    }

    /* renamed from: d */
    public final void mo26039d(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
        ((IntersectionEngine) this.f58600b.mo17428b()).onSizeChange(str, rect, rect2, rect3, z);
    }
}
