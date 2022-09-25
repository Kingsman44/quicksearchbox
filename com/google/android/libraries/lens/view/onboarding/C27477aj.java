package com.google.android.libraries.lens.view.onboarding;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.onboarding.aj */
/* compiled from: PG */
public final /* synthetic */ class C27477aj implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C27479al f75138a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f75139b;

    public /* synthetic */ C27477aj(C27479al alVar, ViewGroup viewGroup) {
        this.f75138a = alVar;
        this.f75139b = viewGroup;
    }

    public final void accept(Object obj, Object obj2) {
        C27479al alVar = this.f75138a;
        View view = (View) obj;
        String str = (String) obj2;
        if (this.f75139b.isEnabled()) {
            alVar.f75144c.mo30556f(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
