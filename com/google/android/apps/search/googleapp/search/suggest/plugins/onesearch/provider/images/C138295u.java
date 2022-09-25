package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.bumptech.glide.load.p293a.p295b.C5686b;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.u */
/* compiled from: PG */
public final /* synthetic */ class C138295u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376251a;

    /* renamed from: b */
    public final /* synthetic */ String f376252b;

    /* renamed from: c */
    public final /* synthetic */ C138213bu f376253c;

    public /* synthetic */ C138295u(OneSearchImageProvider oneSearchImageProvider, String str, C138213bu buVar) {
        this.f376251a = oneSearchImageProvider;
        this.f376252b = str;
        this.f376253c = buVar;
    }

    public final C60870cx apply(Object obj) {
        return this.f376251a.mo114230c((C5686b) obj, this.f376252b, Optional.m71637of(this.f376253c));
    }
}
