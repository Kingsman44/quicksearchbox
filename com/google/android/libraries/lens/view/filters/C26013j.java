package com.google.android.libraries.lens.view.filters;

/* renamed from: com.google.android.libraries.lens.view.filters.j */
/* compiled from: PG */
public final /* synthetic */ class C26013j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FilterPreview f70693a;

    public /* synthetic */ C26013j(FilterPreview filterPreview) {
        this.f70693a = filterPreview;
    }

    public final void run() {
        FilterPreview filterPreview = this.f70693a;
        filterPreview.f70216a.f70698c.animate().alpha(0.0f).setDuration((long) filterPreview.f70217b.f70694a).start();
    }
}
