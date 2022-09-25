package com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.appactions.serviceengine.impl.C147908aq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.a.d */
/* compiled from: PG */
public final /* synthetic */ class C133779d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133781f f364394a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f364395b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f364396c;

    /* renamed from: d */
    public final /* synthetic */ RemoteViews f364397d;

    /* renamed from: e */
    public final /* synthetic */ C147908aq f364398e;

    public /* synthetic */ C133779d(C133781f fVar, C60870cx cxVar, C60870cx cxVar2, RemoteViews remoteViews, C147908aq aqVar) {
        this.f364394a = fVar;
        this.f364395b = cxVar;
        this.f364396c = cxVar2;
        this.f364397d = remoteViews;
        this.f364398e = aqVar;
    }

    public final Object call() {
        C133781f fVar = this.f364394a;
        C60870cx cxVar = this.f364395b;
        C60870cx cxVar2 = this.f364396c;
        RemoteViews remoteViews = this.f364397d;
        C147908aq aqVar = this.f364398e;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        remoteViews.setTextViewText(R.id.googleapp_app_actions_button_text, (CharSequence) optional.get());
        if (!optional2.isPresent()) {
            return Optional.empty();
        }
        remoteViews.setImageViewBitmap(R.id.googleapp_app_actions_button_icon_image, (Bitmap) optional2.get());
        return Optional.m71637of(new C133780e(fVar, remoteViews, aqVar));
    }
}
