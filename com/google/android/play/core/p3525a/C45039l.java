package com.google.android.play.core.p3525a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.p3525a.p3526a.C45026a;
import com.google.android.play.core.p3533e.C45075g;

/* renamed from: com.google.android.play.core.a.l */
/* compiled from: PG */
public final /* synthetic */ class C45039l implements C45075g {

    /* renamed from: a */
    public static final /* synthetic */ C45039l f117663a = new C45039l();

    private /* synthetic */ C45039l() {
    }

    /* renamed from: a */
    public final Object mo48870a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C45026a ? (C45026a) queryLocalInterface : new C45026a(iBinder);
    }
}
