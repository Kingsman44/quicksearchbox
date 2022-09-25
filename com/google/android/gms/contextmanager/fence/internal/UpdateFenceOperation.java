package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.C142932a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class UpdateFenceOperation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144050r();

    /* renamed from: a */
    public final int f390286a;

    /* renamed from: b */
    public final ContextFenceRegistrationStub f390287b;

    /* renamed from: c */
    public C144048p f390288c;

    /* renamed from: d */
    public final C142932a f390289d;

    /* renamed from: e */
    public final PendingIntent f390290e;

    /* renamed from: f */
    public final String f390291f;

    /* renamed from: g */
    public final long f390292g;

    /* renamed from: h */
    public final long f390293h;

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, PendingIntent pendingIntent, String str) {
        this.f390286a = i;
        this.f390287b = contextFenceRegistrationStub;
        this.f390288c = null;
        this.f390289d = null;
        this.f390290e = pendingIntent;
        this.f390291f = str;
        this.f390292g = -1;
        this.f390293h = -1;
    }

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, IBinder iBinder, PendingIntent pendingIntent, String str, long j, long j2) {
        C144048p pVar;
        this.f390286a = i;
        this.f390287b = contextFenceRegistrationStub;
        if (iBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            pVar = queryLocalInterface instanceof C144048p ? (C144048p) queryLocalInterface : new C144046n(iBinder);
        }
        this.f390288c = pVar;
        this.f390289d = null;
        this.f390290e = pendingIntent;
        this.f390291f = str;
        this.f390292g = j;
        this.f390293h = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f390286a);
        C143947c.m234105x(parcel, 3, this.f390287b, i);
        C144048p pVar = this.f390288c;
        if (pVar == null) {
            iBinder = null;
        } else {
            iBinder = pVar.asBinder();
        }
        C143947c.m234098q(parcel, 4, iBinder);
        C143947c.m234105x(parcel, 5, this.f390290e, i);
        C143947c.m234106y(parcel, 6, this.f390291f);
        C143947c.m234090i(parcel, 7, this.f390292g);
        C143947c.m234090i(parcel, 8, this.f390293h);
        C143947c.m234083b(parcel, a);
    }
}
