package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127687c;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9646d.C127783a;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9646d.C127785c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.x */
/* compiled from: PG */
public final /* synthetic */ class C127807x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127809z f351772a;

    public /* synthetic */ C127807x(C127809z zVar) {
        this.f351772a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C127809z zVar = this.f351772a;
        if (((C127746g) obj).equals(C127746g.MODE_UNSPECIFIED)) {
            return C60856cj.m92900i(Optional.empty());
        }
        C127785c cVar = zVar.f351777d;
        Locale locale = Locale.US;
        C60870cx d = ((C42876ab) cVar.f351741d.f351549a.mo27525b()).mo46042d();
        C127687c cVar2 = new C127687c();
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(cVar2), C60826bg.f164896a);
        C127804u uVar = cVar.f351740c;
        C60870cx d2 = uVar.f351768a.mo40240d();
        C127802s sVar = C127802s.f351766a;
        C60870cx g2 = C60922j.m93044g(d2, C47810es.m84963c(sVar), uVar.f351769b);
        return C47638k.m84753d(g, g2).mo51520a(new C127783a(cVar, g, g2, locale), cVar.f351742e);
    }
}
