package com.facebook.litho.widget;

import com.facebook.litho.C6154cb;
import com.facebook.litho.C6407q;
import com.google.android.libraries.elements.p1729h.C21215m;

/* renamed from: com.facebook.litho.widget.k */
/* compiled from: PG */
public final class C6546k extends C6441b {

    /* renamed from: a */
    private final C6407q f19490a;

    /* renamed from: b */
    private final C21215m f19491b;

    public C6546k(C6544i iVar) {
        super(iVar);
        C6407q qVar = iVar.f19488b;
        if (qVar != null) {
            this.f19490a = qVar;
            this.f19491b = iVar.f19489c;
            return;
        }
        throw new IllegalStateException("Component must be provided.");
    }

    /* renamed from: r */
    public static C6491cw m17818r() {
        C6544i iVar = new C6544i();
        iVar.f19488b = new C6545j();
        return new C6546k(iVar);
    }

    /* renamed from: c */
    public final C6407q mo13521c() {
        return this.f19490a;
    }

    /* renamed from: d */
    public final C6154cb mo13522d() {
        return null;
    }

    /* renamed from: h */
    public final String mo13526h() {
        return null;
    }

    /* renamed from: n */
    public final boolean mo13532n() {
        return true;
    }

    /* renamed from: p */
    public final C21215m mo13534p() {
        return this.f19491b;
    }

    /* renamed from: s */
    public final String mo13577s() {
        return this.f19490a.mo13461q();
    }
}
