package com.google.android.apps.search.googleapp.search.p10420k;

import android.net.Uri;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.search.k.c */
/* compiled from: PG */
public final /* synthetic */ class C137544c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri f374096a;

    /* renamed from: b */
    public final /* synthetic */ C137416e f374097b;

    public /* synthetic */ C137544c(Uri uri, C137416e eVar) {
        this.f374096a = uri;
        this.f374097b = eVar;
    }

    public final void accept(Object obj) {
        String str = (String) obj;
        this.f374097b.mo113714b(str, C58837ba.m90858g(this.f374096a.getQueryParameter(str)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
