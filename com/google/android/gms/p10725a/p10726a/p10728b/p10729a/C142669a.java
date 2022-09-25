package com.google.android.gms.p10725a.p10726a.p10728b.p10729a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p10725a.p10726a.p10727a.C142667b;
import com.google.android.gms.p10793f.C144168m;

/* renamed from: com.google.android.gms.a.a.b.a.a */
/* compiled from: PG */
public final class C142669a extends C144168m {

    /* renamed from: a */
    public static final C142669a f387151a = new C142669a();

    private C142669a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo117452a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof C142667b ? (C142667b) queryLocalInterface : new C142667b(iBinder);
    }
}
