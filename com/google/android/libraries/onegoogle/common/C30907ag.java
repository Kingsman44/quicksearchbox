package com.google.android.libraries.onegoogle.common;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.libraries.onegoogle.common.ag */
/* compiled from: PG */
final class C30907ag implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f83334a;

    /* renamed from: b */
    final /* synthetic */ C0640fb f83335b;

    public C30907ag(RecyclerView recyclerView, C0640fb fbVar) {
        this.f83334a = recyclerView;
        this.f83335b = fbVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f83334a.setAdapter(this.f83335b);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f83334a.setAdapter((C0640fb) null);
    }
}
