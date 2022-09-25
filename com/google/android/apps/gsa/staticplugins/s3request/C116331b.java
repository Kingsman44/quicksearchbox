package com.google.android.apps.gsa.staticplugins.s3request;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6658cm.C85139a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116349h;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116354m;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116359r;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.b */
/* compiled from: PG */
public final class C116331b extends C86734a implements C85139a {

    /* renamed from: a */
    public final C116359r f322511a;

    /* renamed from: b */
    public final C116354m f322512b;

    /* renamed from: c */
    public final C116349h f322513c;

    /* renamed from: f */
    private final C22871g f322514f;

    protected C116331b(C116359r rVar, C116354m mVar, C116349h hVar, C22871g gVar) {
        super(C118575h.S3REQUEST, "s3request");
        this.f322511a = rVar;
        this.f322512b = mVar;
        this.f322513c = hVar;
        this.f322514f = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo78731a(C92473f fVar, C58833ax axVar) {
        return this.f322514f.mo28201a("create RequestSourceFactory", new C116244a(this, fVar, axVar));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
