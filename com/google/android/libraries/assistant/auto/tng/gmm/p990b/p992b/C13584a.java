package com.google.android.libraries.assistant.auto.tng.gmm.p990b.p992b;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.p453b.p457b.p460b.p461a.C9000a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C13584a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13584a f41592a = new C13584a();

    private /* synthetic */ C13584a() {
    }

    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gmm.offline.api.aidl.IOfflineExternalSearch");
        return queryLocalInterface instanceof C9000a ? (C9000a) queryLocalInterface : new C9000a(iBinder);
    }
}
