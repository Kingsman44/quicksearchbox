package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.support.p031v4.app.Fragment;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.j */
/* compiled from: PG */
public final class C32477j extends AppWidgetHost {

    /* renamed from: a */
    public final int f87031a;

    /* renamed from: b */
    public final Fragment f87032b;

    /* renamed from: c */
    private final Executor f87033c;

    public C32477j(Context context, Executor executor, int i, Fragment fragment) {
        super(context, i);
        this.f87032b = fragment;
        this.f87033c = executor;
        this.f87031a = i;
    }

    /* renamed from: a */
    public final void mo38099a() {
        stopListening();
        clearViews();
    }

    /* access modifiers changed from: protected */
    public final AppWidgetHostView onCreateView(Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        C32480m mVar = new C32480m(context);
        mVar.setExecutor(this.f87033c);
        return mVar;
    }
}
