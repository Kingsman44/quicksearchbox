package com.google.android.gms.car.p10760f;

import android.graphics.Rect;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.car.f.bq */
/* compiled from: PG */
public final class C143283bq {

    /* renamed from: a */
    public final int f388491a;

    /* renamed from: b */
    public final Rect f388492b;

    public C143283bq(int i, Rect rect) {
        this.f388491a = i;
        this.f388492b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C143283bq bqVar = (C143283bq) obj;
        if (this.f388491a != bqVar.f388491a) {
            return false;
        }
        return Objects.equals(this.f388492b, bqVar.f388492b);
    }

    public final int hashCode() {
        int i = this.f388491a * 31;
        Rect rect = this.f388492b;
        return i + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f388491a;
        String valueOf = String.valueOf(this.f388492b);
        return "FocusInfo{direction=" + i + ", focusedRect=" + valueOf + "}";
    }
}
