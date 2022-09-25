package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.RectF;

/* renamed from: com.google.android.apps.gsa.shared.y.i */
/* compiled from: PG */
final class C91217i extends C91218j {

    /* renamed from: a */
    private final RectF f254607a;

    public C91217i(RectF rectF) {
        this.f254607a = rectF;
    }

    /* renamed from: a */
    public final int mo85479a() {
        return 5;
    }

    /* renamed from: b */
    public final RectF mo85480b() {
        return this.f254607a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C91210bo) {
            C91210bo boVar = (C91210bo) obj;
            if (boVar.mo85479a() != 5 || !this.f254607a.equals(boVar.mo85480b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f254607a.hashCode();
    }

    public final String toString() {
        String obj = this.f254607a.toString();
        return "Transform{smartCropKind=" + obj + "}";
    }
}
