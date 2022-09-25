package com.google.android.apps.gsa.sidekick.shared.secondscreen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.sidekick.shared.secondscreen.SecondScreenLaunchHelper;
import com.google.common.p4522b.C58597ky;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7893nw;
import com.google.p375ai.p378b.C8150xj;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.secondscreen.a */
/* compiled from: PG */
final class C91915a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        SecondScreenLaunchHelper.Options options = new SecondScreenLaunchHelper.Options();
        boolean z = true;
        options.f256329p = parcel.readInt() != 0;
        options.f256314a = (C7799kj) ProtoLiteParcelable.m147135f(parcel, C7799kj.f27263h);
        options.f256315b = parcel.readString();
        options.f256316c = (C8150xj) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C8150xj.f28657d.getParserForType());
        options.f256317d = parcel.readString();
        options.f256318e = (C8150xj) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C8150xj.f28657d.getParserForType());
        options.f256319f = parcel.readString();
        C7893nw nwVar = C7893nw.f27731q;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, ProtoLiteParcelable.class.getClassLoader());
        options.f256321h = C58597ky.m90211b(ProtoLiteParcelable.m147138i(arrayList, nwVar.getParserForType()));
        options.f256322i = parcel.readInt() != 0;
        options.f256323j = parcel.readInt();
        options.f256325l = parcel.readInt() != 0;
        options.f256326m = parcel.readInt() != 0;
        options.f256327n = parcel.readInt() != 0;
        options.f256328o = parcel.readInt() != 0;
        options.f256320g = parcel.readString();
        if (parcel.readInt() == 0) {
            z = false;
        }
        options.f256324k = z;
        return options;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SecondScreenLaunchHelper.Options[i];
    }
}
