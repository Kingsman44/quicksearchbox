package com.google.android.apps.gsa.sidekick.shared.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p375ai.p378b.C8142xb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.overlay.f */
/* compiled from: PG */
final class C91897f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C91898g g = NowStreamConfig.m150602g();
        C8142xb a = C8142xb.m22954a(parcel.readInt());
        if (a == null) {
            a = C8142xb.UNKNOWN_SURFACE;
        }
        g.mo86469d(a);
        boolean z = false;
        g.mo86468c(parcel.readInt() == 1);
        g.mo86471f(parcel.readInt() == 1);
        g.mo86470e(parcel.readInt() == 1);
        ((C91892a) g).f256219a = parcel.readString();
        if (parcel.readInt() == 1) {
            z = true;
        }
        g.mo86467b(z);
        return g.mo86466a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NowStreamConfig[i];
    }
}
