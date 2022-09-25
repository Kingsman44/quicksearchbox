package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.p10793f.C144163h;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;

/* compiled from: PG */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143994s();

    /* renamed from: a */
    public final String f389580a;

    /* renamed from: b */
    public final boolean f389581b;

    /* renamed from: c */
    public final boolean f389582c;

    /* renamed from: d */
    public final Context f389583d;

    /* renamed from: e */
    public final boolean f389584e;

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f389580a);
        C143947c.m234084c(parcel, 2, this.f389581b);
        C143947c.m234084c(parcel, 3, this.f389582c);
        C143947c.m234098q(parcel, 4, new C144166k(this.f389583d));
        C143947c.m234084c(parcel, 5, this.f389584e);
        C143947c.m234083b(parcel, a);
    }

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        C144165j jVar;
        this.f389580a = str;
        this.f389581b = z;
        this.f389582c = z2;
        if (iBinder == null) {
            jVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            jVar = queryLocalInterface instanceof C144165j ? (C144165j) queryLocalInterface : new C144163h(iBinder);
        }
        this.f389583d = (Context) C144166k.m234388a(jVar);
        this.f389584e = z3;
    }
}
