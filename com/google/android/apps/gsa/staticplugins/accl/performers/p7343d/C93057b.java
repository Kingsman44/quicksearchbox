package com.google.android.apps.gsa.staticplugins.accl.performers.p7343d;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.accl.performers.p7343d.C93058c;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35785a;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35982u;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35983v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.d.b */
/* compiled from: PG */
public final /* synthetic */ class C93057b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93058c f259578a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f259579b;

    public /* synthetic */ C93057b(C93058c cVar, C51809dy dyVar) {
        this.f259578a = cVar;
        this.f259579b = dyVar;
    }

    public final C60870cx apply(Object obj) {
        C93058c cVar = this.f259578a;
        C51809dy dyVar = this.f259579b;
        Context context = cVar.f259581a;
        Class<C93058c.C93059a> cls = C93058c.C93059a.class;
        C35982u c = C35983v.m64370c();
        C35785a aVar = (C35785a) c;
        aVar.f93743a = Boolean.valueOf(cVar.f259584d);
        aVar.f93744b = Boolean.valueOf(cVar.f259585e);
        return ((C93058c.C93059a) C47245e.m84045a(context, cls, (AccountId) obj)).mo87527fl().mo39917a(c.mo39837a(), cVar.f259582b, cVar.f259583c).mo20766a(dyVar);
    }
}
