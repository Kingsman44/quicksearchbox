package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.v */
/* compiled from: PG */
public final /* synthetic */ class C122822v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122823w f340195a;

    /* renamed from: b */
    public final /* synthetic */ C122799ad f340196b;

    /* renamed from: c */
    public final /* synthetic */ Locale f340197c;

    public /* synthetic */ C122822v(C122823w wVar, C122799ad adVar, Locale locale) {
        this.f340195a = wVar;
        this.f340196b = adVar;
        this.f340197c = locale;
    }

    public final C60870cx apply(Object obj) {
        C122823w wVar = this.f340195a;
        C122799ad adVar = this.f340196b;
        Locale locale = this.f340197c;
        C122798ac acVar = (C122798ac) obj;
        C122799ad adVar2 = wVar.f340203f;
        if (adVar2 == adVar) {
            wVar.f340203f = wVar.f340199b.mo105744a(locale);
        } else if (!adVar2.f340149a.equals(locale)) {
            return C60856cj.m92899h(acVar);
        }
        C60870cx a = wVar.f340200c.mo105747a(wVar.f340203f);
        C122821u uVar = C122821u.f340194a;
        return C60846c.m92879h(a, C122798ac.class, C47810es.m84966f(uVar), C60826bg.f164896a);
    }
}
