package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123064l;
import com.google.android.libraries.assistant.portable.C19118z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.l */
/* compiled from: PG */
final class C123080l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C2164c f340649a;

    /* renamed from: b */
    final /* synthetic */ C123081m f340650b;

    public C123080l(C123081m mVar, C2164c cVar) {
        this.f340650b = mVar;
        this.f340649a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f340650b.f340651a.mo20122b(th);
        this.f340649a.mo5439d(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C19118z zVar = (C19118z) obj;
        C123081m mVar = this.f340650b;
        C122726b bVar = new C122726b(mVar, zVar.mo24264b());
        C123064l.m202406a(C60856cj.m92905n(C47810es.m84965e(bVar), mVar.f340652b), mVar.f340651a, "startReadingStream");
        this.f340649a.mo5437b(zVar);
    }
}
