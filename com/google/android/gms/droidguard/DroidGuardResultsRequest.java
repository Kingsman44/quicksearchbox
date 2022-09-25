package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import p5304e.p5305a.p5306a.p5390n.p5399e.p5400a.C68850d;

/* compiled from: PG */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144120c();

    /* renamed from: a */
    public Bundle f390377a;

    public DroidGuardResultsRequest() {
        String str;
        this.f390377a = new Bundle();
        this.f390377a.putInt("clientVersion", C143875g.f389988b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception unused) {
            str = "?";
        }
        this.f390377a.putString("appArchitecture", str);
    }

    /* renamed from: a */
    public final int mo119651a() {
        return this.f390377a.getInt("timeoutMs", (int) C68850d.f185055a.mo6453a().mo60649a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234093l(parcel, 2, this.f390377a);
        C143947c.m234083b(parcel, a);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.f390377a = bundle;
    }
}
