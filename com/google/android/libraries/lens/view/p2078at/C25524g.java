package com.google.android.libraries.lens.view.p2078at;

import android.graphics.Bitmap;

/* renamed from: com.google.android.libraries.lens.view.at.g */
/* compiled from: PG */
public final class C25524g extends C25531n {

    /* renamed from: a */
    private final Bitmap f69508a;

    /* renamed from: b */
    private final long f69509b;

    public C25524g(Bitmap bitmap, long j) {
        if (bitmap != null) {
            this.f69508a = bitmap;
            this.f69509b = j;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }

    /* renamed from: a */
    public final long mo30577a() {
        return this.f69509b;
    }

    /* renamed from: b */
    public final Bitmap mo30578b() {
        return this.f69508a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25531n) {
            C25531n nVar = (C25531n) obj;
            return this.f69508a.equals(nVar.mo30578b()) && this.f69509b == nVar.mo30577a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f69508a.hashCode();
        long j = this.f69509b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f69508a.toString();
        long j = this.f69509b;
        return "FrozenImageData{bitmap=" + obj + ", timestampUs=" + j + "}";
    }
}
