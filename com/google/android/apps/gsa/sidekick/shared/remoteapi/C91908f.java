package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C8142xb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.remoteapi.f */
/* compiled from: PG */
final class C91908f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C91909g x = LoggingRequest.m150673x();
        C91903a aVar = (C91903a) x;
        aVar.f256281a = (C7708h) ProtoLiteParcelable.m147135f(parcel, C7708h.f26894n);
        aVar.f256285e = (C7718hj) ProtoLiteParcelable.m147135f(parcel, C7718hj.f26927af);
        aVar.f256286f = (C7526an) ProtoLiteParcelable.m147135f(parcel, C7526an.f26049l);
        aVar.f256289i = (C7918ou) ProtoLiteParcelable.m147135f(parcel, C7918ou.f27824h);
        aVar.f256287g = (StreamRenderData) parcel.readParcelable(StreamRenderData.class.getClassLoader());
        Integer a = C23338c.m43769a(parcel);
        if (a == null) {
            a = 0;
        }
        C8142xb a2 = C8142xb.m22954a(a.intValue());
        if (a2 == null) {
            a2 = C8142xb.UNKNOWN_SURFACE;
        }
        Integer a3 = C23338c.m43769a(parcel);
        aVar.f256288h = a2;
        x.mo86538b(Optional.ofNullable(a3));
        x.mo86545i(C23338c.m43772d(parcel));
        x.mo86544h(C23338c.m43772d(parcel));
        x.mo86549m(C23338c.m43772d(parcel));
        x.mo86541e(parcel.readInt());
        x.mo86539c(parcel.readInt());
        x.mo86540d(parcel.readInt());
        x.mo86542f(parcel.readInt());
        x.mo86553q(parcel.readInt());
        x.mo86550n(parcel.readInt());
        x.mo86551o(parcel.readInt());
        x.mo86552p(parcel.readInt());
        return x.mo86537a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LoggingRequest[i];
    }
}
