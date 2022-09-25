package com.google.android.libraries.p11012aj.p11013a;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.p11012aj.p11015c.C147601a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.aj.a.a */
/* compiled from: PG */
public final /* synthetic */ class C147593a implements C147601a {

    /* renamed from: a */
    public final /* synthetic */ Context f398394a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f398395b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f398396c;

    public /* synthetic */ C147593a(Context context, C69464a aVar, C58833ax axVar) {
        this.f398394a = context;
        this.f398395b = aVar;
        this.f398396c = axVar;
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        Context context = this.f398394a;
        C69464a aVar = this.f398395b;
        C58833ax axVar = this.f398396c;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((C58817ah) ((C58847bk) axVar).f156646a).apply(new C147594b(application, aVar, axVar)));
    }
}
