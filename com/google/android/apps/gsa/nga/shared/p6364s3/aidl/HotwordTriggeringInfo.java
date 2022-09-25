package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80496d;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.HotwordTriggeringInfo */
/* compiled from: PG */
public class HotwordTriggeringInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C81484b();

    /* renamed from: a */
    public final C80496d f222919a;

    /* renamed from: b */
    public final C81490h f222920b;

    /* renamed from: c */
    public final C81493k f222921c;

    public HotwordTriggeringInfo(C80496d dVar, C81490h hVar, C81493k kVar) {
        this.f222919a = dVar;
        this.f222920b = hVar;
        this.f222921c = kVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147141l(this.f222919a, parcel);
        parcel.writeStrongBinder(this.f222920b.asBinder());
        parcel.writeStrongBinder(this.f222921c.asBinder());
    }
}
