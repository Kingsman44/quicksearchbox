package com.google.android.libraries.search.p3047m.p3048a;

import android.app.AppOpsManager;
import android.app.AsyncNotedAppOp;
import android.app.SyncNotedAppOp;
import android.content.Context;
import android.os.Build;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59703cr;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.m.a.b */
/* compiled from: PG */
public final class C39224b extends AppOpsManager.OnOpNotedCallback {

    /* renamed from: a */
    private static final AtomicBoolean f103244a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C58485gu f103245b;

    public C39224b(C58485gu guVar) {
        this.f103245b = guVar;
    }

    /* renamed from: a */
    public static void m68653a(Context context, Executor executor, C58485gu guVar) {
        if (Build.VERSION.SDK_INT >= 30 && !f103244a.getAndSet(true)) {
            ((AppOpsManager) context.getSystemService(AppOpsManager.class)).setOnOpNotedCallback(executor, new C39224b(guVar));
        }
    }

    /* renamed from: b */
    private final void m68654b(String str, String str2, C59703cr crVar, String str3, Integer num) {
        C58485gu guVar = this.f103245b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C39217a) guVar.get(i)).mo41729a(str, str2, crVar, str3, num);
        }
    }

    public final void onAsyncNoted(AsyncNotedAppOp asyncNotedAppOp) {
        m68654b(asyncNotedAppOp.getOp(), asyncNotedAppOp.getAttributionTag(), C59703cr.ASYNC, asyncNotedAppOp.getMessage(), Integer.valueOf(asyncNotedAppOp.getNotingUid()));
    }

    public final void onNoted(SyncNotedAppOp syncNotedAppOp) {
        m68654b(syncNotedAppOp.getOp(), syncNotedAppOp.getAttributionTag(), C59703cr.SYNC, (String) null, (Integer) null);
    }

    public final void onSelfNoted(SyncNotedAppOp syncNotedAppOp) {
        m68654b(syncNotedAppOp.getOp(), syncNotedAppOp.getAttributionTag(), C59703cr.SELF, (String) null, (Integer) null);
    }
}
