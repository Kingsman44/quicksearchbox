package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146442b();

    /* renamed from: a */
    public final C146451bi f395518a;

    /* renamed from: b */
    public final IntentFilter[] f395519b;

    /* renamed from: c */
    public final String f395520c;

    /* renamed from: d */
    public final String f395521d;

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f395518a = queryLocalInterface instanceof C146451bi ? (C146451bi) queryLocalInterface : new C146449bg(iBinder);
        } else {
            this.f395518a = null;
        }
        this.f395519b = intentFilterArr;
        this.f395520c = str;
        this.f395521d = str2;
    }

    public AddListenerRequest(C146503dg dgVar) {
        this.f395518a = dgVar;
        this.f395519b = dgVar.f395700d;
        this.f395520c = null;
        this.f395521d = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C143947c.m234082a(parcel, 20293);
        C146451bi biVar = this.f395518a;
        if (biVar == null) {
            iBinder = null;
        } else {
            iBinder = biVar.asBinder();
        }
        C143947c.m234098q(parcel, 2, iBinder);
        C143947c.m234079B(parcel, 3, this.f395519b, i);
        C143947c.m234106y(parcel, 4, this.f395520c);
        C143947c.m234106y(parcel, 5, this.f395521d);
        C143947c.m234083b(parcel, a);
    }
}
