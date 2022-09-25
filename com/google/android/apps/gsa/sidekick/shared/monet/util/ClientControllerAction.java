package com.google.android.apps.gsa.sidekick.shared.monet.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;

/* compiled from: PG */
public abstract class ClientControllerAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91854b();

    /* renamed from: a */
    public abstract C9277u mo86344a();

    /* renamed from: b */
    public abstract C9141ad mo86345b();

    /* renamed from: c */
    public abstract C7526an mo86346c();

    /* renamed from: d */
    public abstract C8142xb mo86347d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract C8178yk mo86348e();

    public final void writeToParcel(Parcel parcel, int i) {
        Integer num;
        ProtoLiteParcelable.m147140k(mo86345b(), parcel);
        ProtoLiteParcelable.m147140k(mo86346c(), parcel);
        ProtoLiteParcelable.m147140k(mo86348e(), parcel);
        parcel.writeInt(mo86347d().f28649u);
        C9277u a = mo86344a();
        if (a == null) {
            num = null;
        } else {
            num = Integer.valueOf(a.f32164ay);
        }
        C23338c.m43771c(num, parcel);
    }
}
