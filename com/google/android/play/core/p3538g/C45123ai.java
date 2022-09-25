package com.google.android.play.core.p3538g;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.p3533e.C45075g;
import com.google.android.play.core.p3538g.p3540b.C45142a;

/* renamed from: com.google.android.play.core.g.ai */
/* compiled from: PG */
public final /* synthetic */ class C45123ai implements C45075g {

    /* renamed from: a */
    public static final /* synthetic */ C45123ai f117809a = new C45123ai();

    private /* synthetic */ C45123ai() {
    }

    /* renamed from: a */
    public final Object mo48870a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C45142a ? (C45142a) queryLocalInterface : new C45142a(iBinder);
    }
}
