package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28807cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.i */
/* compiled from: PG */
public final /* synthetic */ class C122322i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339186a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339187b;

    /* renamed from: c */
    public final /* synthetic */ C28807cv f339188c;

    public /* synthetic */ C122322i(C122165am amVar, Locale locale, C28807cv cvVar) {
        this.f339186a = amVar;
        this.f339187b = locale;
        this.f339188c = cvVar;
    }

    public final C60870cx apply(Object obj) {
        C122165am amVar = this.f339186a;
        Locale locale = this.f339187b;
        C28807cv cvVar = this.f339188c;
        C60870cx e = C60856cj.m92896e((Iterable) Collection.EL.stream((C58485gu) obj).map(new C122324k(amVar, locale)).collect(C58370cn.f155946a));
        C122325l lVar = new C122325l(amVar, cvVar, locale);
        return C60922j.m93044g(e, C47810es.m84963c(lVar), amVar.f338839d);
    }
}
