package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C143901aq;
import com.google.android.gms.common.internal.C143903as;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;

/* compiled from: PG */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143996u();

    /* renamed from: a */
    public final String f389589a;

    /* renamed from: b */
    public final boolean f389590b;

    /* renamed from: c */
    public final boolean f389591c;

    /* renamed from: d */
    private final C143989n f389592d;

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        C143903as asVar;
        byte[] bArr;
        this.f389589a = str;
        C143990o oVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof C143903as) {
                    asVar = (C143903as) queryLocalInterface;
                } else {
                    asVar = new C143901aq(iBinder);
                }
                C144165j c = asVar.mo119418c();
                if (c == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C144166k.m234388a(c);
                }
                if (bArr != null) {
                    oVar = new C143990o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f389592d = oVar;
        this.f389590b = z;
        this.f389591c = z2;
    }

    public GoogleCertificatesQuery(String str, C143989n nVar, boolean z, boolean z2) {
        this.f389589a = str;
        this.f389592d = nVar;
        this.f389590b = z;
        this.f389591c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f389589a);
        C143989n nVar = this.f389592d;
        if (nVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            nVar = null;
        }
        C143947c.m234098q(parcel, 2, nVar);
        C143947c.m234084c(parcel, 3, this.f389590b);
        C143947c.m234084c(parcel, 4, this.f389591c);
        C143947c.m234083b(parcel, a);
    }
}
