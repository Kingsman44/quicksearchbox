package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.bumptech.glide.load.p293a.p295b.C5686b;
import com.bumptech.glide.p290g.C5602e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.o */
/* compiled from: PG */
public final /* synthetic */ class C138289o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f376240a;

    /* renamed from: b */
    public final /* synthetic */ Exception f376241b;

    public /* synthetic */ C138289o(String str, Exception exc) {
        this.f376240a = str;
        this.f376241b = exc;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f376240a;
        Exception exc = this.f376241b;
        ((C5686b) obj).mo12192c(new C5602e("onesearch-".concat(String.valueOf(str))));
        return C60856cj.m92899h(exc);
    }
}
