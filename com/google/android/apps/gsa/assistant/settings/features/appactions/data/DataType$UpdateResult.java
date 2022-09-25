package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* compiled from: PG */
public abstract class DataType$UpdateResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10343bc();

    /* renamed from: d */
    public static DataType$UpdateResult m25244d(int i) {
        C10338ay ayVar = new C10338ay();
        ayVar.mo18449c(i);
        ayVar.mo18450d(2);
        ayVar.mo18448b(Optional.empty());
        return ayVar.mo18447a();
    }

    /* renamed from: e */
    public static DataType$UpdateResult m25245e(C63088z zVar) {
        C10338ay ayVar = new C10338ay();
        ayVar.mo18449c(0);
        ayVar.mo18450d(2);
        ayVar.mo18448b(Optional.m71637of(zVar));
        return ayVar.mo18447a();
    }

    /* renamed from: f */
    public static DataType$UpdateResult m25246f(int i) {
        C10338ay ayVar = new C10338ay();
        ayVar.mo18449c(1);
        ayVar.mo18450d(i);
        ayVar.mo18448b(Optional.empty());
        return ayVar.mo18447a();
    }

    /* renamed from: a */
    public abstract int mo18410a();

    /* renamed from: b */
    public abstract Optional mo18411b();

    /* renamed from: c */
    public abstract int mo18412c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo18410a());
        parcel.writeInt(C49263ai.m85395a(mo18412c()));
        Optional b = mo18411b();
        if (b.isPresent()) {
            parcel.writeByteArray(((C63088z) b.get()).mo59174N());
        } else {
            parcel.writeByteArray((byte[]) null);
        }
    }
}
