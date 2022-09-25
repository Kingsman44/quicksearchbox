package com.google.android.apps.gsa.nga.engine.screen.parser.impl;

import com.google.android.apps.gsa.nga.d.a.w;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.parser.impl.e */
/* compiled from: PG */
final class C77952e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ScreenContentParserImpl f214701a;

    public C77952e(ScreenContentParserImpl screenContentParserImpl) {
        this.f214701a = screenContentParserImpl;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f214701a.f214689a.f214626a.mo74271b(C89849ae.NGA_SCREEN_PARSING_FAILURE);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        w wVar = (w) obj;
        this.f214701a.f214689a.f214626a.mo74271b(C89849ae.NGA_SCREEN_PARSING_SUCCESS);
    }
}
