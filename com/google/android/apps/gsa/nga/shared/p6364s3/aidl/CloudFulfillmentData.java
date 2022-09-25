package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80498f;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.CloudFulfillmentData */
/* compiled from: PG */
public class CloudFulfillmentData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C81483a();

    /* renamed from: a */
    public final C58833ax f222915a;

    /* renamed from: b */
    public final C58833ax f222916b;

    /* renamed from: c */
    public final C80498f f222917c;

    /* renamed from: d */
    private final boolean f222918d;

    public CloudFulfillmentData(C58833ax axVar, C58833ax axVar2, C80498f fVar, boolean z) {
        this.f222915a = axVar;
        this.f222916b = axVar2;
        this.f222917c = fVar;
        this.f222918d = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f222915a.mo56111f(), i);
        parcel.writeParcelable((Parcelable) this.f222916b.mo56111f(), i);
        ProtoLiteParcelable.m147141l(this.f222917c, parcel);
        parcel.writeInt(this.f222918d ? 1 : 0);
    }
}
