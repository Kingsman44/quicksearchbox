package com.google.android.libraries.lens.view;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* compiled from: PG */
public final class InProcessBitmap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C26288g();

    /* renamed from: a */
    private static Bitmap f68072a;

    /* renamed from: b */
    private static long f68073b;

    /* renamed from: c */
    private final long f68074c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f68074c);
    }

    public InProcessBitmap(Bitmap bitmap) {
        Bitmap bitmap2;
        long j;
        synchronized (InProcessBitmap.class) {
            if (bitmap == null) {
                bitmap2 = null;
            } else {
                bitmap2 = Bitmap.createBitmap(bitmap);
            }
            f68072a = bitmap2;
            j = f68073b + 1;
            f68073b = j;
        }
        this.f68074c = j;
    }

    /* renamed from: a */
    public final C58833ax mo30182a() {
        Bitmap bitmap;
        synchronized (InProcessBitmap.class) {
            if (this.f68074c != f68073b || (bitmap = f68072a) == null) {
                C58836b bVar = C58836b.f156633a;
                return bVar;
            }
            C58833ax k = C58833ax.m90834k(bitmap);
            return k;
        }
    }

    protected InProcessBitmap(Parcel parcel) {
        this.f68074c = parcel.readLong();
    }
}
