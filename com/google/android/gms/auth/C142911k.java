package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p10709b.C142291a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.k */
/* compiled from: PG */
final class C142911k implements C142913m {

    /* renamed from: a */
    final /* synthetic */ String f387815a;

    /* renamed from: b */
    final /* synthetic */ Bundle f387816b;

    public C142911k(String str, Bundle bundle) {
        this.f387815a = str;
        this.f387816b = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo117809a(IBinder iBinder) {
        C142291a aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            aVar = queryLocalInterface instanceof C142291a ? (C142291a) queryLocalInterface : new C142291a(iBinder);
        }
        String str = this.f387815a;
        Bundle bundle = this.f387816b;
        Parcel gA = aVar.mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, bundle);
        Parcel gT = aVar.mo17261gT(2, gA);
        Bundle bundle2 = (Bundle) C8850c.m23492a(gT, Bundle.CREATOR);
        gT.recycle();
        C142914n.m231870r(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new C142903e(string);
    }
}
