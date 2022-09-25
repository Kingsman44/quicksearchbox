package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.r */
/* compiled from: PG */
public final /* synthetic */ class C122818r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122823w f340190a;

    /* renamed from: b */
    public final /* synthetic */ Locale f340191b;

    public /* synthetic */ C122818r(C122823w wVar, Locale locale) {
        this.f340190a = wVar;
        this.f340191b = locale;
    }

    public final C60870cx apply(Object obj) {
        C122823w wVar = this.f340190a;
        Locale locale = this.f340191b;
        Void voidR = (Void) obj;
        C122799ad adVar = wVar.f340203f;
        if (adVar == null || !adVar.f340149a.equals(locale)) {
            wVar.f340203f = wVar.f340199b.mo105744a(locale);
        }
        C122799ad adVar2 = wVar.f340203f;
        C60870cx a = wVar.f340200c.mo105747a(adVar2);
        C122822v vVar = new C122822v(wVar, adVar2, locale);
        return C60846c.m92879h(a, C122798ac.class, C47810es.m84966f(vVar), wVar.f340202e);
    }
}
