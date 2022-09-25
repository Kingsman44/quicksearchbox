package com.google.android.libraries.onegoogle.account.disc;

import android.view.View;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.q */
/* compiled from: PG */
public final /* synthetic */ class C30217q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View.OnAttachStateChangeListener f81682a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f81683b;

    public /* synthetic */ C30217q(View.OnAttachStateChangeListener onAttachStateChangeListener, ImageView imageView) {
        this.f81682a = onAttachStateChangeListener;
        this.f81683b = imageView;
    }

    public final void run() {
        this.f81682a.onViewAttachedToWindow(this.f81683b);
    }
}
