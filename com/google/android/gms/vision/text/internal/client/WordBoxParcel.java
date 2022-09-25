package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class WordBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146334i();

    /* renamed from: a */
    public final SymbolBoxParcel[] f395249a;

    /* renamed from: b */
    public final BoundingBoxParcel f395250b;

    /* renamed from: c */
    public final BoundingBoxParcel f395251c;

    /* renamed from: d */
    public final String f395252d;

    /* renamed from: e */
    public final float f395253e;

    /* renamed from: f */
    public final String f395254f;

    /* renamed from: g */
    public final boolean f395255g;

    public WordBoxParcel(SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.f395249a = symbolBoxParcelArr;
        this.f395250b = boundingBoxParcel;
        this.f395251c = boundingBoxParcel2;
        this.f395252d = str;
        this.f395253e = f;
        this.f395254f = str2;
        this.f395255g = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 2, this.f395249a, i);
        C143947c.m234105x(parcel, 3, this.f395250b, i);
        C143947c.m234105x(parcel, 4, this.f395251c, i);
        C143947c.m234106y(parcel, 5, this.f395252d);
        C143947c.m234087f(parcel, 6, this.f395253e);
        C143947c.m234106y(parcel, 7, this.f395254f);
        C143947c.m234084c(parcel, 8, this.f395255g);
        C143947c.m234083b(parcel, a);
    }
}
