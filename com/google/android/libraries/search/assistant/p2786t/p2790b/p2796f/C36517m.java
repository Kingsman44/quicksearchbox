package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import android.net.Uri;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.m */
/* compiled from: PG */
public final /* synthetic */ class C36517m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36524t f95289a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f95290b;

    public /* synthetic */ C36517m(C36524t tVar, C58528ij ijVar) {
        this.f95289a = tVar;
        this.f95290b = ijVar;
    }

    public final Object apply(Object obj) {
        C36524t tVar = this.f95289a;
        C58528ij ijVar = this.f95290b;
        MessageNotification messageNotification = (MessageNotification) obj;
        if (!messageNotification.mo39558o().isPresent() || !Collection.EL.stream(ijVar).anyMatch(new C36518n((String) messageNotification.mo39558o().get())) || !messageNotification.mo39552i().isPresent() || !messageNotification.mo39550h().isPresent()) {
            return C47633f.m84733g(C60866ct.f164955a);
        }
        C36514j jVar = new C36514j(tVar, (String) messageNotification.mo39550h().get(), (Uri) messageNotification.mo39552i().get());
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(jVar), tVar.f95299c));
    }
}
