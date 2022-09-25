package com.google.android.apps.gsa.sidekick.shared.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p375ai.p378b.C8142xb;

/* compiled from: PG */
public abstract class NowStreamConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91897f();

    /* renamed from: g */
    public static C91898g m150602g() {
        C91892a aVar = new C91892a();
        aVar.mo86468c(false);
        aVar.mo86471f(false);
        aVar.mo86470e(false);
        aVar.f256219a = null;
        aVar.mo86467b(false);
        return aVar;
    }

    /* renamed from: a */
    public abstract C8142xb mo86455a();

    /* renamed from: b */
    public abstract String mo86456b();

    /* renamed from: c */
    public abstract boolean mo86457c();

    /* renamed from: d */
    public abstract boolean mo86458d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract boolean mo86459e();

    /* renamed from: f */
    public abstract boolean mo86461f();

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo86455a().f28649u);
        parcel.writeInt(mo86458d() ? 1 : 0);
        parcel.writeInt(mo86461f() ? 1 : 0);
        parcel.writeInt(mo86459e() ? 1 : 0);
        parcel.writeString(mo86456b());
        parcel.writeInt(mo86457c() ? 1 : 0);
    }
}
