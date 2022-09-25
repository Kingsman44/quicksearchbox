package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import android.support.p033v7.app.C0401v;
import android.widget.RemoteViews;
import com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a.C133778c;
import com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a.C133779d;
import com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a.C133781f;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.appactions.serviceengine.impl.C147908aq;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.k */
/* compiled from: PG */
public final /* synthetic */ class C133792k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133798q f364427a;

    public /* synthetic */ C133792k(C133798q qVar) {
        this.f364427a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C133798q qVar = this.f364427a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C133781f fVar = qVar.f364435c;
        C147908aq aqVar = (C147908aq) optional.get();
        String packageName = fVar.f364403b.getPackageName();
        C133933a aVar = fVar.f364405d;
        int i = C0401v.f1356b;
        RemoteViews remoteViews = new RemoteViews(packageName, true != C133933a.m217248a(aVar.f364779a) ? R.layout.googleapp_app_actions_bottombar_light : R.layout.googleapp_app_actions_bottombar_dark);
        C60870cx i2 = C60856cj.m92900i(aqVar.mo124573b());
        C60870cx h = C60922j.m93045h(C60856cj.m92900i(aqVar.mo124574c()), C47810es.m84966f(new C133778c(fVar)), fVar.f364407f);
        return C47638k.m84751b(i2, h).mo51520a(new C133779d(fVar, i2, h, remoteViews, aqVar), fVar.f364407f);
    }
}
