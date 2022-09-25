package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import android.widget.RemoteViews;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.ad */
/* compiled from: PG */
public final /* synthetic */ class C139000ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f378012a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f378013b;

    /* renamed from: c */
    public final /* synthetic */ RemoteViews f378014c;

    public /* synthetic */ C139000ad(C60870cx cxVar, C60870cx cxVar2, RemoteViews remoteViews) {
        this.f378012a = cxVar;
        this.f378013b = cxVar2;
        this.f378014c = remoteViews;
    }

    public final Object call() {
        C60870cx cxVar = this.f378012a;
        C60870cx cxVar2 = this.f378013b;
        RemoteViews remoteViews = this.f378014c;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        if (optional.isPresent() && optional2.isPresent()) {
            return Optional.m71637of(remoteViews);
        }
        if (!optional.isPresent() || optional2.isPresent()) {
            return Optional.empty();
        }
        return optional;
    }
}
