package com.android.p261d.p264c;

import android.graphics.Bitmap;

/* renamed from: com.android.d.c.l */
/* compiled from: PG */
final class C5064l implements Cloneable {

    /* renamed from: a */
    public boolean f16132a;

    /* renamed from: b */
    public Bitmap.Config f16133b;

    /* renamed from: c */
    public int f16134c;

    /* renamed from: a */
    public final C5064l clone() {
        try {
            return (C5064l) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5064l)) {
            return false;
        }
        C5064l lVar = (C5064l) obj;
        if (this.f16132a == lVar.f16132a && this.f16133b == lVar.f16133b && this.f16134c == lVar.f16134c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f16133b.hashCode() ^ this.f16134c;
        return this.f16132a ? hashCode : -hashCode;
    }
}
