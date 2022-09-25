package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146365a();

    /* renamed from: a */
    String[] f395386a;

    /* renamed from: b */
    int[] f395387b;

    /* renamed from: c */
    RemoteViews f395388c;

    /* renamed from: d */
    byte[] f395389d;

    private GetSaveInstrumentDetailsResponse() {
    }

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f395386a = strArr;
        this.f395387b = iArr;
        this.f395388c = remoteViews;
        this.f395389d = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234107z(parcel, 1, this.f395386a);
        C143947c.m234099r(parcel, 2, this.f395387b);
        C143947c.m234105x(parcel, 3, this.f395388c, i);
        C143947c.m234094m(parcel, 4, this.f395389d);
        C143947c.m234083b(parcel, a);
    }
}
