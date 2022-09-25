package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146479cj();

    /* renamed from: a */
    final int f395626a;

    /* renamed from: b */
    public final C146451bi f395627b;

    public RemoveListenerRequest(int i, IBinder iBinder) {
        this.f395626a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f395627b = queryLocalInterface instanceof C146451bi ? (C146451bi) queryLocalInterface : new C146449bg(iBinder);
            return;
        }
        this.f395627b = null;
    }

    public RemoveListenerRequest(C146451bi biVar) {
        this.f395626a = 1;
        this.f395627b = biVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f395626a);
        C146451bi biVar = this.f395627b;
        if (biVar == null) {
            iBinder = null;
        } else {
            iBinder = biVar.asBinder();
        }
        C143947c.m234098q(parcel, 2, iBinder);
        C143947c.m234083b(parcel, a);
    }
}
