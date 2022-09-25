package com.google.android.libraries.searchbox.p3203ui.logging;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.searchbox.ui.logging.AutoValue_ParcelableQueryBuilderTap */
/* compiled from: PG */
final class AutoValue_ParcelableQueryBuilderTap extends ParcelableQueryBuilderTap {

    /* renamed from: a */
    private final int[] f109079a;

    /* renamed from: b */
    private final int f109080b;

    /* renamed from: c */
    private final int f109081c;

    public AutoValue_ParcelableQueryBuilderTap(int[] iArr, int i, int i2) {
        this.f109079a = iArr;
        this.f109080b = i;
        this.f109081c = i2;
    }

    /* renamed from: a */
    public final int mo44297a() {
        return this.f109081c;
    }

    /* renamed from: b */
    public final int mo44298b() {
        return this.f109080b;
    }

    /* renamed from: c */
    public final int[] mo44299c() {
        return this.f109079a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ParcelableQueryBuilderTap) {
            ParcelableQueryBuilderTap parcelableQueryBuilderTap = (ParcelableQueryBuilderTap) obj;
            return Arrays.equals(this.f109079a, parcelableQueryBuilderTap instanceof AutoValue_ParcelableQueryBuilderTap ? ((AutoValue_ParcelableQueryBuilderTap) parcelableQueryBuilderTap).f109079a : parcelableQueryBuilderTap.mo44299c()) && this.f109080b == parcelableQueryBuilderTap.mo44298b() && this.f109081c == parcelableQueryBuilderTap.mo44297a();
        }
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f109079a) ^ 1000003) * 1000003) ^ this.f109080b) * 1000003) ^ this.f109081c;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f109079a);
        int i = this.f109080b;
        int i2 = this.f109081c;
        return "ParcelableQueryBuilderTap{subtypes=" + arrays + ", savedChars=" + i + ", index=" + i2 + "}";
    }
}
