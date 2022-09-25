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

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.util.b */
/* compiled from: PG */
final class C91854b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C91853a aVar = new C91853a();
        aVar.f256166a = (C9141ad) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C9141ad.f31521K.getParserForType());
        aVar.f256167b = (C7526an) ProtoLiteParcelable.m147135f(parcel, C7526an.f26049l);
        aVar.f256169d = (C8178yk) ProtoLiteParcelable.m147135f(parcel, C8178yk.f28736g);
        C8142xb a = C8142xb.m22954a(parcel.readInt());
        if (a == null) {
            a = C8142xb.UNKNOWN_SURFACE;
        }
        aVar.mo86355b(a);
        Integer a2 = C23338c.m43769a(parcel);
        aVar.f256168c = a2 != null ? C9277u.m23705a(a2.intValue()) : null;
        return aVar.mo86354a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientControllerAction[i];
    }
}
