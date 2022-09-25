package com.google.android.apps.search.googleapp.urlhandler.optimizer.p10532a;

import android.net.Uri;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10295i.C135860e;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.p3384g.C43561a;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.weblayer.contrib.p3456d.C44191d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69079cv;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.optimizer.a.j */
/* compiled from: PG */
public final class C139839j implements C139840k {

    /* renamed from: a */
    public final C43561a f380103a;

    /* renamed from: b */
    public final C44191d f380104b;

    /* renamed from: c */
    private final C44074i f380105c;

    /* renamed from: d */
    private final C60888db f380106d;

    /* renamed from: e */
    private final Optional f380107e;

    /* renamed from: f */
    private final int f380108f;

    public C139839j(C43561a aVar, C44191d dVar, C44074i iVar, long j, C60888db dbVar, Optional optional) {
        this.f380103a = aVar;
        this.f380104b = dVar;
        this.f380105c = iVar;
        int a = C69079cv.m100184a((int) j);
        this.f380108f = a == 0 ? 1 : a;
        this.f380106d = dbVar;
        this.f380107e = optional;
    }

    /* renamed from: d */
    private final C60870cx m227368d() {
        return this.f380105c.mo47042b(C43271v.WEB_LAYER);
    }

    /* renamed from: a */
    public final C60870cx mo115300a() {
        C60870cx d = m227368d();
        C139836g gVar = new C139836g(this);
        C60888db dbVar = this.f380106d;
        C58838bb.m90884s(this.f380107e.isPresent(), "GoogleAppBrowser Prewarmer is not included in the build");
        return C47638k.m84753d(C60922j.m93045h(d, C47810es.m84966f(gVar), dbVar), ((C135860e) this.f380107e.get()).mo112587a()).mo51520a(C139838i.f380102a, this.f380106d);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo115301b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo115302c(Uri uri) {
        int i = this.f380108f - 1;
        if (i == 0 || i == 1) {
            return C60866ct.f164955a;
        }
        if (i != 2) {
            return C60856cj.m92899h(new UnsupportedOperationException("Web Prerenderer is not supported."));
        }
        return C60922j.m93044g(m227368d(), C47810es.m84963c(new C139837h(this, uri)), this.f380106d);
    }
}
