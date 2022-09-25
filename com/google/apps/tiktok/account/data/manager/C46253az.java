package com.google.apps.tiktok.account.data.manager;

import android.os.IBinder;
import android.os.IInterface;
import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.data.manager.az */
/* compiled from: PG */
public final /* synthetic */ class C46253az implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C46253az f121236a = new C46253az();

    private /* synthetic */ C46253az() {
    }

    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.apps.tiktok.account.data.manager.IAccountSyncService");
        return queryLocalInterface instanceof C46278bx ? (C46278bx) queryLocalInterface : new C46276bv(iBinder);
    }
}
