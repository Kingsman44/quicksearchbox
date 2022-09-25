package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view;

import android.support.p033v7.widget.LinearLayoutManager;
import android.widget.GridLayout;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.b */
/* compiled from: PG */
final class C106794b {

    /* renamed from: a */
    int f297609a;

    /* renamed from: b */
    int f297610b;

    /* renamed from: c */
    final float f297611c;

    public C106794b(int i, int i2, float f) {
        this.f297609a = i;
        this.f297610b = i2;
        this.f297611c = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final GridLayout.Spec mo95663a(boolean z) {
        return GridLayout.spec(z ? LinearLayoutManager.INVALID_OFFSET : this.f297609a, this.f297610b, this.f297611c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C106794b)) {
            return false;
        }
        C106794b bVar = (C106794b) obj;
        return this.f297609a == bVar.f297609a && this.f297610b == bVar.f297610b && this.f297611c == bVar.f297611c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f297609a), Integer.valueOf(this.f297610b), Float.valueOf(this.f297611c));
    }
}
