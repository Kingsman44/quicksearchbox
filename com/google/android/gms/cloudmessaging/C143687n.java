package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.p10784a.C143999b;
import com.google.android.gms.libs.p10836d.p10839c.C144859a;
import com.google.android.gms.libs.p10836d.p10839c.C144860b;
import com.google.android.gms.tasks.C146006ab;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.cloudmessaging.n */
/* compiled from: PG */
public final class C143687n {

    /* renamed from: c */
    private static C143687n f389543c;

    /* renamed from: a */
    public final Context f389544a;

    /* renamed from: b */
    public final ScheduledExecutorService f389545b;

    /* renamed from: d */
    private C143682i f389546d = new C143682i(this);

    /* renamed from: e */
    private int f389547e = 1;

    public C143687n(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f389545b = scheduledExecutorService;
        this.f389544a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C143687n m233422b(Context context) {
        C143687n nVar;
        synchronized (C143687n.class) {
            if (f389543c == null) {
                C144859a aVar = C144860b.f391709a;
                f389543c = new C143687n(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C143999b("MessengerIpcClient"))));
            }
            nVar = f389543c;
        }
        return nVar;
    }

    /* renamed from: a */
    public final synchronized int mo119058a() {
        int i;
        i = this.f389547e;
        this.f389547e = i + 1;
        return i;
    }

    /* renamed from: c */
    public final synchronized C146006ab mo119059c(C143684k kVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
        }
        if (!this.f389546d.mo119049e(kVar)) {
            C143682i iVar = new C143682i(this);
            this.f389546d = iVar;
            iVar.mo119049e(kVar);
        }
        return kVar.f389541b.f394698a;
    }
}
