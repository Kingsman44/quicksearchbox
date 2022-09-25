package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a;

import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.C125722a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.C125725d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.C125726e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.C125727f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.a.e */
/* compiled from: PG */
public final /* synthetic */ class C125717e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125727f f346493a;

    /* renamed from: b */
    public final /* synthetic */ Locale f346494b;

    /* renamed from: c */
    public final /* synthetic */ bj f346495c;

    public /* synthetic */ C125717e(C125727f fVar, Locale locale, bj bjVar) {
        this.f346493a = fVar;
        this.f346494b = locale;
        this.f346495c = bjVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C125727f fVar = this.f346493a;
        Locale locale = this.f346494b;
        bj bjVar = this.f346495c;
        C59071e eVar = C125721i.f346501a;
        C125722a aVar = new C125722a(locale, C58485gu.m89842j(bjVar.i), C58485gu.m89842j(bjVar.h));
        C60870cx a = fVar.f346521c.mo107545a(aVar);
        if (C126309ar.m206529h(a)) {
            return a;
        }
        return C47633f.m84733g(C126309ar.m206526e(C60856cj.m92901j(a), C125727f.f346520b, fVar.f346523e)).mo51513e(TimeoutException.class, new C125725d(fVar, aVar), fVar.f346523e).mo51513e(Exception.class, new C125726e(fVar, aVar), fVar.f346523e);
    }
}
