package com.google.android.libraries.web.weblayer.contrib.contactpicker.internal;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;
import org.chromium.weblayer.C72607bp;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.h */
/* compiled from: PG */
public final class C44180h extends C72607bp {

    /* renamed from: a */
    public static final C59071e f114939a = C59071e.m91332i("com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.h");

    /* renamed from: b */
    public final C46423aj f114940b;

    /* renamed from: c */
    public final C46423aj f114941c;

    /* renamed from: d */
    public final C47449e f114942d;

    /* renamed from: e */
    public final Executor f114943e;

    /* renamed from: f */
    public final C60887da f114944f;

    public C44180h(Executor executor, C60887da daVar, AccountId accountId, C46175b bVar, C46128f fVar, C47449e eVar) {
        this.f114940b = new C46423aj(new C44175c(bVar, accountId), executor);
        this.f114941c = new C46423aj(new C44178f(bVar, accountId, fVar, executor), executor);
        this.f114942d = eVar;
        this.f114943e = executor;
        this.f114944f = daVar;
    }
}
