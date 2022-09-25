package com.google.android.apps.gsa.searchplate.p6966d;

import android.graphics.Point;

/* renamed from: com.google.android.apps.gsa.searchplate.d.a */
/* compiled from: PG */
public final class C88929a extends C88940l {

    /* renamed from: a */
    private final Point f240900a;

    /* renamed from: b */
    private final Point f240901b;

    /* renamed from: c */
    private final int f240902c;

    public C88929a(Point point, Point point2, int i) {
        this.f240900a = point;
        this.f240901b = point2;
        this.f240902c = i;
    }

    /* renamed from: a */
    public final int mo82806a() {
        return this.f240902c;
    }

    /* renamed from: b */
    public final Point mo82807b() {
        return this.f240901b;
    }

    /* renamed from: c */
    public final Point mo82808c() {
        return this.f240900a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C88940l) {
            C88940l lVar = (C88940l) obj;
            return this.f240900a.equals(lVar.mo82808c()) && this.f240901b.equals(lVar.mo82807b()) && this.f240902c == lVar.mo82806a();
        }
    }

    public final int hashCode() {
        return ((((this.f240900a.hashCode() ^ 1000003) * 1000003) ^ this.f240901b.hashCode()) * 1000003) ^ this.f240902c;
    }

    public final String toString() {
        String obj = this.f240900a.toString();
        String obj2 = this.f240901b.toString();
        int i = this.f240902c;
        return "StateAnimationEntry{start=" + obj + ", end=" + obj2 + ", staticFrameResourceId=" + i + "}";
    }
}
