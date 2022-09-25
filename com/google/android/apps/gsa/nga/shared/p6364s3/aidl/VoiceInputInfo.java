package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81477l;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.VoiceInputInfo */
/* compiled from: PG */
public class VoiceInputInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C81503u();

    /* renamed from: a */
    public final C81477l f222922a;

    /* renamed from: b */
    public final C81496n f222923b;

    /* renamed from: c */
    public final C81499q f222924c;

    public VoiceInputInfo(C81477l lVar, C81496n nVar, C81499q qVar) {
        this.f222922a = lVar;
        this.f222923b = nVar;
        this.f222924c = qVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147141l(this.f222922a, parcel);
        parcel.writeStrongBinder(this.f222923b.asBinder());
        parcel.writeStrongBinder(this.f222924c.asBinder());
    }
}
