package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.graphics.Rect;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.a */
/* compiled from: PG */
final class C24153a extends C24162c {

    /* renamed from: a */
    private final Rect f65973a;

    /* renamed from: b */
    private final float f65974b;

    /* renamed from: c */
    private final int f65975c;

    public C24153a(Rect rect, float f, int i) {
        if (rect != null) {
            this.f65973a = rect;
            this.f65974b = f;
            this.f65975c = i;
            return;
        }
        throw new NullPointerException("Null rect");
    }

    /* renamed from: a */
    public final float mo29570a() {
        return this.f65974b;
    }

    /* renamed from: b */
    public final int mo29571b() {
        return this.f65975c;
    }

    /* renamed from: c */
    public final Rect mo29572c() {
        return this.f65973a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24162c) {
            C24162c cVar = (C24162c) obj;
            return this.f65973a.equals(cVar.mo29572c()) && Float.floatToIntBits(this.f65974b) == Float.floatToIntBits(cVar.mo29570a()) && this.f65975c == cVar.mo29571b();
        }
    }

    public final int hashCode() {
        return ((((this.f65973a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f65974b)) * 1000003) ^ this.f65975c;
    }

    public final String toString() {
        String obj = this.f65973a.toString();
        float f = this.f65974b;
        int i = this.f65975c;
        return "WordDebugItem{rect=" + obj + ", angle=" + f + ", color=" + i + "}";
    }
}
