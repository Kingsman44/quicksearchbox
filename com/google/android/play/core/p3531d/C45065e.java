package com.google.android.play.core.p3531d;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.p3531d.p3532a.C45059a;
import com.google.android.play.core.p3533e.C45075g;

/* renamed from: com.google.android.play.core.d.e */
/* compiled from: PG */
public final /* synthetic */ class C45065e implements C45075g {

    /* renamed from: a */
    public static final /* synthetic */ C45065e f117704a = new C45065e();

    private /* synthetic */ C45065e() {
    }

    /* renamed from: a */
    public final Object mo48870a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
        return queryLocalInterface instanceof C45059a ? (C45059a) queryLocalInterface : new C45059a(iBinder);
    }
}
