package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.view.ChatHeadViewProxy */
/* compiled from: PG */
public class ChatHeadViewProxy extends View {

    /* renamed from: a */
    public final AtomicReference f300848a = new AtomicReference(C108181c.f300851a);

    public ChatHeadViewProxy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        ((Consumer) this.f300848a.get()).accept(configuration);
    }
}
