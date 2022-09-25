package com.google.android.apps.search.googleapp.p10117aa;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.favicon.C43546e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.aa.aw */
/* compiled from: PG */
public final class C133105aw implements C43546e {

    /* renamed from: a */
    private final C133103au f362888a;

    /* renamed from: b */
    private String f362889b = null;

    public C133105aw(C133103au auVar, C43269t tVar) {
        this.f362888a = auVar;
        String str = tVar.mo46384b().f112969h;
        if (str != null) {
            this.f362889b = str;
        }
    }

    /* renamed from: a */
    public final void mo46610a(Bitmap bitmap, Uri uri) {
        C60870cx cxVar;
        String str = this.f362889b;
        if (str != null) {
            C133103au auVar = this.f362888a;
            if (bitmap == null) {
                cxVar = auVar.f362876b.mo46039a(new C133137v(str), C60826bg.f164896a);
            } else {
                C60870cx b = auVar.f362877c.mo19399b(C47810es.m84978r(new C133140y(bitmap)));
                C133138w wVar = new C133138w(auVar, str);
                cxVar = C60922j.m93045h(b, C47810es.m84966f(wVar), C60826bg.f164896a);
            }
            C46459k.m82829b(cxVar, "Could not save Favicon for URI %s", uri);
        }
    }
}
