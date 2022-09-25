package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.p6074a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.g.a.h */
/* compiled from: PG */
public final /* synthetic */ class C76712h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76716l f212034a;

    /* renamed from: b */
    public final /* synthetic */ Locale f212035b;

    public /* synthetic */ C76712h(C76716l lVar, Locale locale) {
        this.f212034a = lVar;
        this.f212035b = locale;
    }

    public final C60870cx apply(Object obj) {
        C76716l lVar = this.f212034a;
        Locale locale = this.f212035b;
        C122472a aVar = (C122472a) obj;
        C47538ax c = lVar.f212041b.mo51613c("NGA");
        try {
            C60870cx d = aVar.mo105632d(locale);
            if (c != null) {
                c.close();
            }
            return d;
        } catch (Throwable th) {
            C76711g.m123322a(th, th);
        }
        throw th;
    }
}
