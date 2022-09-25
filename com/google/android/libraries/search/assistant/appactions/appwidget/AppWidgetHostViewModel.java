package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.appwidget.AppWidgetHost;
import android.content.Context;
import androidx.lifecycle.C2358bf;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
public final class AppWidgetHostViewModel extends C2358bf {

    /* renamed from: a */
    public final AtomicInteger f87007a = new AtomicInteger(-1);

    /* renamed from: b */
    private final Context f87008b;

    public AppWidgetHostViewModel(Context context) {
        this.f87008b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        int andSet = this.f87007a.getAndSet(-1);
        if (andSet != -1) {
            new AppWidgetHost(this.f87008b, andSet).deleteHost();
        }
    }
}
