package com.google.android.libraries.lens.view.onboarding;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.onboarding.au */
/* compiled from: PG */
public final /* synthetic */ class C27488au implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C27493az f75166a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f75167b;

    public /* synthetic */ C27488au(C27493az azVar, ViewGroup viewGroup) {
        this.f75166a = azVar;
        this.f75167b = viewGroup;
    }

    public final void accept(Object obj, Object obj2) {
        C27493az azVar = this.f75166a;
        View view = (View) obj;
        String str = (String) obj2;
        if (this.f75167b.isEnabled()) {
            azVar.f75183d.mo30556f(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
