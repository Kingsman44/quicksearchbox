package com.google.android.apps.search.assistant.verticals.ambient.p9917g.p9918a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130681c;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130685g;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130689k;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130693o;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.apps.search.assistant.verticals.ambient.startup.BootCompletedReceiver_Receiver;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131690b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p4016z.C53714bl;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.a.h */
/* compiled from: PG */
public final class C130676h extends C130681c {

    /* renamed from: a */
    public final C58974d f357836a;

    /* renamed from: b */
    private final Context f357837b;

    /* renamed from: c */
    private final C119500b f357838c;

    /* renamed from: d */
    private final C131690b f357839d;

    /* renamed from: e */
    private final ExecutorService f357840e;

    /* renamed from: f */
    private final boolean f357841f;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.a.h$a */
    /* compiled from: PG */
    public interface C130677a {
        /* renamed from: aM */
        C131101a mo109784aM();
    }

    public C130676h(C130603a aVar, Context context, C119500b bVar, C131690b bVar2, ExecutorService executorService, boolean z) {
        this.f357836a = aVar.mo109740b(this);
        this.f357837b = context;
        this.f357838c = bVar;
        this.f357839d = bVar2;
        this.f357840e = executorService;
        this.f357841f = z;
    }

    /* renamed from: b */
    public final void mo109780b(C130685g gVar, C70862aj ajVar) {
        C47633f i = mo109783e().mo51516i(new C130669a(gVar), this.f357840e);
        C130675g gVar2 = new C130675g(this, "dismissCard", ajVar, C130670b.f357826a);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(gVar2), this.f357840e);
    }

    /* renamed from: c */
    public final void mo109781c(C130689k kVar, C70862aj ajVar) {
        C60870cx cxVar;
        ((C58970a) ((C58970a) this.f357836a.mo56224b()).mo56372aa(38948)).mo56389s("Enabling Ambient location subscriptions: %s", kVar);
        ComponentName componentName = new ComponentName(this.f357837b, BootCompletedReceiver_Receiver.class);
        PackageManager packageManager = this.f357837b.getPackageManager();
        if (!this.f357841f || !kVar.f357857b) {
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            cxVar = this.f357839d.mo110266c();
        } else {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            cxVar = this.f357839d.mo110265b(true);
        }
        C130675g gVar = new C130675g(this, "Subscription manager", ajVar, C130671c.f357827a);
        C60856cj.m92911t(cxVar, C47810es.m84974n(gVar), this.f357840e);
    }

    /* renamed from: d */
    public final void mo109782d(C130693o oVar, C70862aj ajVar) {
        C53715bm bmVar = oVar.f357863b;
        if (bmVar == null) {
            bmVar = C53715bm.f141021c;
        }
        ((C58970a) ((C58970a) this.f357836a.mo56224b()).mo56372aa(38949)).mo56389s("Triggering event: %s", C53714bl.m86892a(bmVar.f141023a));
        C47633f i = mo109783e().mo51516i(new C130673e(bmVar, oVar), this.f357840e);
        C130675g gVar = new C130675g(this, "handleEvent", ajVar, C130674f.f357831a);
        C60856cj.m92911t(i, C47810es.m84974n(gVar), this.f357840e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C47633f mo109783e() {
        return C47633f.m84733g(this.f357838c.mo104411a(C130677a.class)).mo51515h(C130672d.f357828a, this.f357840e);
    }
}
