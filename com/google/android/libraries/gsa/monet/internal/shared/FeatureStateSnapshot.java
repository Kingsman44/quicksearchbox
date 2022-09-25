package com.google.android.libraries.gsa.monet.internal.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23037d;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* compiled from: PG */
public final class FeatureStateSnapshot implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23043h();

    /* renamed from: a */
    public final Bundle f63361a;

    /* renamed from: b */
    public final ProtoParcelable f63362b;

    /* renamed from: c */
    private final ProtoParcelable f63363c;

    public FeatureStateSnapshot(Parcel parcel) {
        Class<FeatureStateSnapshot> cls = FeatureStateSnapshot.class;
        this.f63363c = (ProtoParcelable) parcel.readParcelable(cls.getClassLoader());
        this.f63361a = parcel.readBundle(cls.getClassLoader());
        this.f63362b = (ProtoParcelable) parcel.readParcelable(cls.getClassLoader());
    }

    /* renamed from: a */
    public final C23037d mo28454a() {
        C23037d dVar = (C23037d) C23245b.m43557b(this.f63363c, C23037d.f63373e.getParserForType(), C62921ba.f169869a, true);
        dVar.getClass();
        return dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f63363c, i);
        parcel.writeBundle(this.f63361a);
        parcel.writeParcelable(this.f63362b, i);
    }

    public FeatureStateSnapshot(ProtoParcelable protoParcelable, Bundle bundle, ProtoParcelable protoParcelable2) {
        this.f63363c = protoParcelable;
        this.f63361a = new Bundle(bundle);
        this.f63362b = protoParcelable2;
    }
}
