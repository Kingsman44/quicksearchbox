package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143878a();

    /* renamed from: a */
    final int f389995a;

    /* renamed from: b */
    public final Uri f389996b;

    /* renamed from: c */
    public final int f389997c;

    /* renamed from: d */
    public final int f389998d;

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.f389995a = i;
        this.f389996b = uri;
        this.f389997c = i2;
        this.f389998d = i3;
    }

    public WebImage(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C143912ba.m233950b(this.f389996b, webImage.f389996b) && this.f389997c == webImage.f389997c && this.f389998d == webImage.f389998d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389996b, Integer.valueOf(this.f389997c), Integer.valueOf(this.f389998d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f389997c), Integer.valueOf(this.f389998d), this.f389996b.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f389995a);
        C143947c.m234105x(parcel, 2, this.f389996b, i);
        C143947c.m234089h(parcel, 3, this.f389997c);
        C143947c.m234089h(parcel, 4, this.f389998d);
        C143947c.m234083b(parcel, a);
    }
}
