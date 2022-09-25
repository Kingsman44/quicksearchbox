package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123011be;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123044ck;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.C123148c;
import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.assistant.gallium.framework.p1511d.C18236e;
import com.google.android.libraries.search.assistant.p2716p.p2717a.p2718a.p2719a.C34922b;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.r */
/* compiled from: PG */
public final /* synthetic */ class C123544r implements C123011be {

    /* renamed from: a */
    public final /* synthetic */ Context f341374a;

    /* renamed from: b */
    public final /* synthetic */ C123148c f341375b;

    /* renamed from: c */
    public final /* synthetic */ Executor f341376c;

    /* renamed from: d */
    public final /* synthetic */ C18207ak f341377d;

    /* renamed from: e */
    public final /* synthetic */ boolean f341378e;

    /* renamed from: f */
    public final /* synthetic */ Executor f341379f;

    /* renamed from: g */
    public final /* synthetic */ C39141kp f341380g;

    /* renamed from: h */
    public final /* synthetic */ String f341381h;

    /* renamed from: i */
    public final /* synthetic */ boolean f341382i;

    /* renamed from: j */
    public final /* synthetic */ C68214a f341383j;

    /* renamed from: k */
    public final /* synthetic */ Set f341384k;

    /* renamed from: l */
    public final /* synthetic */ C34922b f341385l;

    public /* synthetic */ C123544r(Context context, C123148c cVar, C34922b bVar, Executor executor, C18207ak akVar, boolean z, Executor executor2, C39141kp kpVar, String str, boolean z2, C68214a aVar, Set set) {
        this.f341374a = context;
        this.f341375b = cVar;
        this.f341385l = bVar;
        this.f341376c = executor;
        this.f341377d = akVar;
        this.f341378e = z;
        this.f341379f = executor2;
        this.f341380g = kpVar;
        this.f341381h = str;
        this.f341382i = z2;
        this.f341383j = aVar;
        this.f341384k = set;
    }

    /* renamed from: a */
    public final C60870cx mo105827a(C122985af afVar) {
        C58485gu guVar;
        Context context = this.f341374a;
        C123148c cVar = this.f341375b;
        C34922b bVar = this.f341385l;
        Executor executor = this.f341376c;
        C18207ak akVar = this.f341377d;
        boolean z = this.f341378e;
        Executor executor2 = this.f341379f;
        C39141kp kpVar = this.f341380g;
        String str = this.f341381h;
        boolean z2 = this.f341382i;
        C68214a aVar = this.f341383j;
        Set set = this.f341384k;
        if (z) {
            guVar = C58485gu.m89846n(new C18236e(executor2));
        } else {
            guVar = C58485gu.m89845m();
        }
        C58485gu guVar2 = guVar;
        C60870cx b = bVar.mo39635b();
        C60870cx a = cVar.mo105896a();
        C47637j d = C47638k.m84753d(b, a);
        C122985af afVar2 = afVar;
        C123547u uVar = r1;
        C123547u uVar2 = new C123547u(afVar2, b, context, a, executor, akVar, guVar2, kpVar, str, z2);
        return C60922j.m93045h(d.mo51521b(uVar, executor), C47810es.m84966f(new C123044ck(new C123536j(afVar2, aVar, set))), executor);
    }
}
