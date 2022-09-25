package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.p6074a;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.g.a.c */
/* compiled from: PG */
public final /* synthetic */ class C76707c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76709e f212022a;

    /* renamed from: b */
    public final /* synthetic */ Locale f212023b;

    public /* synthetic */ C76707c(C76709e eVar, Locale locale) {
        this.f212022a = eVar;
        this.f212023b = locale;
    }

    public final C60870cx apply(Object obj) {
        C76709e eVar = this.f212022a;
        Locale locale = this.f212023b;
        Void voidR = (Void) obj;
        if (!eVar.f212026b.mo85405j(C90126fx.f251296gD)) {
            return C60866ct.f164955a;
        }
        synchronized (eVar) {
            if (eVar.f212029e) {
                C60870cx cxVar = C60866ct.f164955a;
                return cxVar;
            }
            eVar.f212029e = true;
            return C60922j.m93045h(eVar.f212027c.mo72312c(), new C76706b(eVar, locale), C60826bg.f164896a);
        }
    }
}
