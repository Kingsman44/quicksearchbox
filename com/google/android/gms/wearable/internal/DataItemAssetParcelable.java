package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wearable.C146529l;

/* compiled from: PG */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, C146529l {
    public static final Parcelable.Creator CREATOR = new C146424ai();

    /* renamed from: a */
    public final String f395569a;

    /* renamed from: b */
    public final String f395570b;

    public DataItemAssetParcelable(C146529l lVar) {
        String c = lVar.mo123129c();
        C143919bh.m233958a(c);
        this.f395569a = c;
        String b = lVar.mo123128b();
        C143919bh.m233958a(b);
        this.f395570b = b;
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.f395569a = str;
        this.f395570b = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final String mo123128b() {
        return this.f395570b;
    }

    /* renamed from: c */
    public final String mo123129c() {
        return this.f395569a;
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f395569a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f395569a);
        }
        sb.append(", key=");
        sb.append(this.f395570b);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395569a);
        C143947c.m234106y(parcel, 3, this.f395570b);
        C143947c.m234083b(parcel, a);
    }
}
