package com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.q */
/* compiled from: PG */
final class C91875q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return VisualElementBoundsParcelable.m150498f((C8178yk) ProtoLiteParcelable.m147136g(parcel, C8178yk.f28736g), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (C57057b) ProtoLiteParcelable.m147135f(parcel, C57057b.f152311e), (C7669fo) ProtoLiteParcelable.m147135f(parcel, C7669fo.f26633e), (C7973qv) ProtoLiteParcelable.m147135f(parcel, C7973qv.f28001c));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisualElementBoundsParcelable[i];
    }
}
