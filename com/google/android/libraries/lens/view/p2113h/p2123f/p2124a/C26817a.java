package com.google.android.libraries.lens.view.p2113h.p2123f.p2124a;

import com.google.lens.p4698d.C62169h;

/* renamed from: com.google.android.libraries.lens.view.h.f.a.a */
/* compiled from: PG */
public final class C26817a extends C26818b {

    /* renamed from: a */
    public final C62169h f73097a;

    public C26817a(C62169h hVar) {
        this.f73097a = hVar;
    }

    /* renamed from: a */
    public final C62169h mo32181a() {
        return this.f73097a;
    }

    /* renamed from: b */
    public final int mo32182b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C26819c) {
            C26819c cVar = (C26819c) obj;
            if (cVar.mo32182b() != 2 || !this.f73097a.equals(cVar.mo32181a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f73097a.hashCode();
    }

    public final String toString() {
        String obj = this.f73097a.toString();
        return "FrameSelectionTrackingRequest{nativeAdapterRequest=" + obj + "}";
    }
}
