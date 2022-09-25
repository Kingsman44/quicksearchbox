package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.p10793f.C144166k;

/* compiled from: PG */
public class CastMediaOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143494b();

    /* renamed from: f */
    private static final C143566ae f389030f = new C143566ae("CastMediaOptions");

    /* renamed from: a */
    public final String f389031a;

    /* renamed from: b */
    public final String f389032b;

    /* renamed from: c */
    public final NotificationOptions f389033c;

    /* renamed from: d */
    public final boolean f389034d;

    /* renamed from: e */
    public final boolean f389035e;

    /* renamed from: g */
    private final C143503e f389036g;

    public CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        C143503e eVar;
        this.f389031a = str;
        this.f389032b = str2;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            eVar = queryLocalInterface instanceof C143503e ? (C143503e) queryLocalInterface : new C143501c(iBinder);
        }
        this.f389036g = eVar;
        this.f389033c = notificationOptions;
        this.f389034d = z;
        this.f389035e = z2;
    }

    /* renamed from: a */
    public final C143523j mo118725a() {
        C143503e eVar = this.f389036g;
        if (eVar == null) {
            return null;
        }
        try {
            return (C143523j) C144166k.m234388a(eVar.mo118800f());
        } catch (RemoteException e) {
            f389030f.mo118885c(e, "Unable to call %s on %s.", "getWrappedClientObject", C143503e.class.getSimpleName());
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f389031a);
        C143947c.m234106y(parcel, 3, this.f389032b);
        C143503e eVar = this.f389036g;
        if (eVar == null) {
            iBinder = null;
        } else {
            iBinder = eVar.asBinder();
        }
        C143947c.m234098q(parcel, 4, iBinder);
        C143947c.m234105x(parcel, 5, this.f389033c, i);
        C143947c.m234084c(parcel, 6, this.f389034d);
        C143947c.m234084c(parcel, 7, this.f389035e);
        C143947c.m234083b(parcel, a);
    }
}
