package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.c */
/* compiled from: PG */
public final /* synthetic */ class C125724c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125739r f346514a;

    public /* synthetic */ C125724c(C125739r rVar) {
        this.f346514a = rVar;
    }

    public final C60870cx apply(Object obj) {
        C125739r rVar = this.f346514a;
        C125738q qVar = (C125738q) obj;
        qVar.mo107094c();
        C47633f e = C47633f.m84733g(rVar.f346538c.mo106906e(qVar.mo107094c())).mo51515h(new C125736o(rVar, qVar), rVar.f346541f).mo51513e(Exception.class, new C125737p(qVar), C60826bg.f164896a);
        return C47638k.m84753d(rVar.f346539d.mo107149a(), e).mo51520a(new C125735n(rVar, e, qVar), rVar.f346541f);
    }
}
