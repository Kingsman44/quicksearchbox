package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.g */
/* compiled from: PG */
public final class C32474g {

    /* renamed from: a */
    public final AppWidgetProviderInfo f87021a;

    /* renamed from: b */
    public final C32470c f87022b;

    /* renamed from: c */
    private final AppWidgetHost f87023c;

    /* renamed from: d */
    private final int f87024d;

    public C32474g(AppWidgetHost appWidgetHost, int i, AppWidgetProviderInfo appWidgetProviderInfo, C32470c cVar) {
        this.f87023c = appWidgetHost;
        this.f87024d = i;
        this.f87021a = appWidgetProviderInfo;
        this.f87022b = cVar;
    }

    /* renamed from: a */
    public final void mo38098a(Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        float f;
        AppWidgetHostView createView = this.f87023c.createView(context, this.f87024d, this.f87021a);
        if (createView instanceof C32480m) {
            C32480m mVar = (C32480m) createView;
            if (Build.VERSION.SDK_INT < 31) {
                mVar.f87040a = C32486s.m60298a(context);
            } else {
                if (Build.VERSION.SDK_INT < 31) {
                    f = 0.0f;
                } else {
                    f = Math.min(C32486s.m60298a(context), context.getResources().getDimension(17104904));
                }
                mVar.f87040a = f;
            }
        }
        viewGroup.removeAllViews();
        viewGroup.addView(createView, layoutParams);
    }
}
