package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.p375ai.p378b.C7709ha;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.remoteapi.k */
/* compiled from: PG */
final class C91913k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C91904b bVar = new C91904b();
        bVar.f256304a = C23338c.m43769a(parcel);
        bVar.f256305b = C23338c.m43769a(parcel);
        bVar.f256306c = C23338c.m43769a(parcel);
        bVar.f256307d = C23338c.m43769a(parcel);
        bVar.f256308e = (C7709ha) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C7709ha.f26910f.getParserForType());
        bVar.f256309f = (C7709ha) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C7709ha.f26910f.getParserForType());
        bVar.f256310g = C23338c.m43769a(parcel);
        Integer a = C23338c.m43769a(parcel);
        bVar.f256311h = a != null ? C9277u.m23705a(a.intValue()) : null;
        return bVar.mo86554a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreamRenderData[i];
    }
}
