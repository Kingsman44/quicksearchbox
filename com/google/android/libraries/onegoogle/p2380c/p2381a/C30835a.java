package com.google.android.libraries.onegoogle.p2380c.p2381a;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.p1635au.C19566c;
import com.google.common.base.C58881cr;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C30835a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ ScheduledExecutorService f83175a;

    /* renamed from: b */
    public final /* synthetic */ Context f83176b;

    public /* synthetic */ C30835a(ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f83175a = scheduledExecutorService;
        this.f83176b = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        ScheduledExecutorService scheduledExecutorService = this.f83175a;
        Context context = this.f83176b;
        Application application = null;
        C19566c cVar = new C19566c(context, "STREAMZ_ONEGOOGLE_ANDROID", (String) null);
        if (context instanceof Application) {
            application = (Application) context;
        }
        return new C30859y(scheduledExecutorService, cVar, application);
    }
}
