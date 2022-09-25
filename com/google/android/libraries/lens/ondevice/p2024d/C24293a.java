package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.lens.p4701g.C62331d;

/* renamed from: com.google.android.libraries.lens.ondevice.d.a */
/* compiled from: PG */
public final class C24293a extends C24424r {

    /* renamed from: a */
    private final C62331d f66357a;

    public C24293a(C62331d dVar) {
        if (dVar != null) {
            this.f66357a = dVar;
            return;
        }
        throw new NullPointerException("Null cascadeType");
    }

    /* renamed from: a */
    public final C62331d mo29861a() {
        return this.f66357a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24424r) {
            return this.f66357a.equals(((C24424r) obj).mo29861a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f66357a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String num = Integer.toString(this.f66357a.f168273v);
        return "CascadeId{cascadeType=" + num + "}";
    }
}
