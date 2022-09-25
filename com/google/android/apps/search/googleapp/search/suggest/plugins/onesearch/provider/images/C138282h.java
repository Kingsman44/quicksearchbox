package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138259j;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138261l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.h */
/* compiled from: PG */
public final class C138282h implements C138283i {

    /* renamed from: a */
    public static final C59071e f376231a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.h");

    /* renamed from: b */
    public final C21370a f376232b;

    /* renamed from: c */
    private final Executor f376233c;

    /* renamed from: d */
    private final C47449e f376234d;

    public C138282h(C47449e eVar, Executor executor, C21370a aVar) {
        this.f376233c = executor;
        this.f376234d = eVar;
        this.f376232b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo114228a(C138259j jVar) {
        C138213bu buVar = (C138213bu) C138214bv.f376051f.createBuilder();
        long c = this.f376232b.mo26871c();
        buVar.copyOnWrite();
        C138214bv bvVar = (C138214bv) buVar.instance;
        bvVar.f376053a |= 1;
        bvVar.f376054b = c;
        String str = jVar.f376161b;
        if (TextUtils.isEmpty(str) || (!str.startsWith("https:") && !str.startsWith("data:"))) {
            return C60856cj.m92900i(C138261l.f376163e);
        }
        return C60846c.m92878g(C60922j.m93044g(C5528f.m14300b(C5528f.m14299a(this.f376234d.mo51286a().mo11867e().mo12445g(Uri.parse(str)))), C47810es.m84963c(new C138280f(this, buVar)), this.f376233c), Exception.class, C47810es.m84963c(C138281g.f376230a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo114229b(C138259j jVar) {
        throw new UnsupportedOperationException("Only supported by the one search cache provider implementation.");
    }
}
