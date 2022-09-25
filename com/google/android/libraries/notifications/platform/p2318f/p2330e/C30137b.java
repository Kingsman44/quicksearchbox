package com.google.android.libraries.notifications.platform.p2318f.p2330e;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.notifications.platform.f.e.b */
/* compiled from: PG */
public final class C30137b {

    /* renamed from: a */
    public final C19576m f81507a;

    /* renamed from: b */
    public final C58881cr f81508b = C58886cw.m90973a(new C30136a(this));

    /* renamed from: c */
    private final C19575l f81509c;

    public C30137b(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C19576m e = C19576m.m37335e("gnp_android");
        this.f81507a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f81509c = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f81509c = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
