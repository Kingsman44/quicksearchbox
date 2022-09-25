package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.p6074a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.g.a.b */
/* compiled from: PG */
public final /* synthetic */ class C76706b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76709e f212020a;

    /* renamed from: b */
    public final /* synthetic */ Locale f212021b;

    public /* synthetic */ C76706b(C76709e eVar, Locale locale) {
        this.f212020a = eVar;
        this.f212021b = locale;
    }

    public final C60870cx apply(Object obj) {
        C76709e eVar = this.f212020a;
        Locale locale = this.f212021b;
        C122472a aVar = (C122472a) obj;
        C47538ax c = eVar.f212028d.mo51613c("NGA");
        try {
            C60870cx g = aVar.mo105635g(locale);
            if (c != null) {
                c.close();
            }
            return g;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
