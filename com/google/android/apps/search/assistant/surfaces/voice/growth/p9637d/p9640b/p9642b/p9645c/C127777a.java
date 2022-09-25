package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9645c;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127690f;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127800q;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.android.libraries.search.assistant.p2714o.C34917c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C127777a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C127782f f351716a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f351717b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f351718c;

    /* renamed from: d */
    public final /* synthetic */ Locale f351719d;

    public /* synthetic */ C127777a(C127782f fVar, C60870cx cxVar, C60870cx cxVar2, Locale locale) {
        this.f351716a = fVar;
        this.f351717b = cxVar;
        this.f351718c = cxVar2;
        this.f351719d = locale;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C127782f fVar = this.f351716a;
        C60870cx cxVar = this.f351717b;
        C60870cx cxVar2 = this.f351718c;
        Locale locale = this.f351719d;
        C58485gu a = ((C127690f) C60856cj.m92909r(cxVar)).mo108170a();
        Locale b = ((C127690f) C60856cj.m92909r(cxVar)).mo108171b();
        C34917c cVar = (C34917c) C60856cj.m92909r(cxVar2);
        if (!cVar.mo39613b().isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        String packageName = ((ComponentName) cVar.mo39613b().get()).getPackageName();
        C127804u uVar = fVar.f351729c;
        C60870cx d = uVar.f351768a.mo40240d();
        C127800q qVar = new C127800q(packageName);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(qVar), uVar.f351769b);
        C127781e eVar = new C127781e(fVar, a, b, locale, packageName);
        return C60922j.m93044g(g, C47810es.m84963c(eVar), fVar.f351731e);
    }
}
