package com.google.android.apps.search.googleapp.customtabs.features.buttons.p10160a;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.a.c */
/* compiled from: PG */
public final /* synthetic */ class C133818c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C133821f f364488a;

    public /* synthetic */ C133818c(C133821f fVar) {
        this.f364488a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C133821f fVar = this.f364488a;
        Uri uri = (Uri) fVar.f364497f.get();
        if (uri == null) {
            return C60856cj.m92898g();
        }
        C60870cx c = fVar.f364494c.mo113595c(uri.toString());
        C133817b bVar = new C133817b(fVar);
        return C60922j.m93045h(c, C47810es.m84966f(bVar), fVar.f364495d);
    }
}
