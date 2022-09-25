package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;

/* compiled from: PG */
public abstract class StreamRenderData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91913k();

    /* renamed from: a */
    public abstract C91914l mo86516a();

    /* renamed from: b */
    public abstract C9277u mo86517b();

    /* renamed from: c */
    public abstract C7709ha mo86518c();

    /* renamed from: d */
    public abstract C7709ha mo86519d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract C7718hj mo86520e();

    /* renamed from: f */
    public abstract C7718hj mo86522f();

    /* renamed from: g */
    public abstract Integer mo86523g();

    /* renamed from: h */
    public abstract Integer mo86524h();

    /* renamed from: i */
    public abstract Integer mo86526i();

    /* renamed from: j */
    public abstract Integer mo86527j();

    /* renamed from: k */
    public abstract Integer mo86528k();

    public final void writeToParcel(Parcel parcel, int i) {
        Integer num;
        C23338c.m43771c(mo86523g(), parcel);
        C23338c.m43771c(mo86528k(), parcel);
        C23338c.m43771c(mo86526i(), parcel);
        C23338c.m43771c(mo86524h(), parcel);
        ProtoLiteParcelable.m147140k(mo86519d(), parcel);
        ProtoLiteParcelable.m147140k(mo86518c(), parcel);
        C23338c.m43771c(mo86527j(), parcel);
        C9277u b = mo86517b();
        if (b == null) {
            num = null;
        } else {
            num = Integer.valueOf(b.f32164ay);
        }
        C23338c.m43771c(num, parcel);
    }
}
