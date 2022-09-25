package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C127767c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127773i f351690a;

    /* renamed from: b */
    public final /* synthetic */ Locale f351691b;

    public /* synthetic */ C127767c(C127773i iVar, Locale locale) {
        this.f351690a = iVar;
        this.f351691b = locale;
    }

    public final C60870cx apply(Object obj) {
        C127773i iVar = this.f351690a;
        Locale locale = this.f351691b;
        C130348b bVar = (C130348b) obj;
        Optional d = bVar.mo109680d();
        if (d.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx b = iVar.f351701b.mo108218b((String) d.get());
        C127769e eVar = new C127769e(iVar, bVar, locale, d);
        return C60922j.m93044g(b, C47810es.m84963c(eVar), iVar.f351703d);
    }
}
