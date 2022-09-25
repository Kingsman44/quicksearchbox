package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class ShortDynamicLinkImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C61190m();

    /* renamed from: a */
    public final Uri f165525a;

    /* renamed from: b */
    public final Uri f165526b;

    /* renamed from: c */
    public final List f165527c;

    /* compiled from: PG */
    public class WarningImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C61191n();

        /* renamed from: a */
        public final String f165528a;

        public WarningImpl(String str) {
            this.f165528a = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234106y(parcel, 2, this.f165528a);
            C143947c.m234083b(parcel, a);
        }
    }

    public ShortDynamicLinkImpl(Uri uri, Uri uri2, List list) {
        this.f165525a = uri;
        this.f165526b = uri2;
        this.f165527c = list == null ? new ArrayList() : list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f165525a, i);
        C143947c.m234105x(parcel, 2, this.f165526b, i);
        C143947c.m234080C(parcel, 3, this.f165527c);
        C143947c.m234083b(parcel, a);
    }
}
