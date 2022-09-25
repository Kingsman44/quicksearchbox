package com.google.android.apps.search.googleapp.urlhandler.p10528a;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4561g.C59804e;
import com.google.common.p4552o.p4561g.C59805f;
import com.google.common.p4552o.p4561g.C59806g;
import com.google.common.p4552o.p4561g.C59807h;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.a.b */
/* compiled from: PG */
public final class C139782b {

    /* renamed from: a */
    public static final C59071e f379909a = C59071e.m91332i("com.google.android.apps.search.googleapp.urlhandler.a.b");

    /* renamed from: b */
    public final Executor f379910b;

    /* renamed from: c */
    private final C136832c f379911c;

    /* renamed from: d */
    private final C38768q f379912d;

    public C139782b(C136832c cVar, C38768q qVar, Executor executor) {
        this.f379911c = cVar;
        this.f379912d = qVar;
        this.f379910b = executor;
    }

    /* renamed from: a */
    public final void mo115233a(Uri uri) {
        if (this.f379911c.mo113401g(uri)) {
            String queryParameter = uri.getQueryParameter("cit");
            C59804e eVar = (C59804e) C59805f.f161622c.createBuilder();
            if (queryParameter != null) {
                eVar.copyOnWrite();
                C59805f fVar = (C59805f) eVar.instance;
                fVar.f161624a |= 1;
                fVar.f161625b = queryParameter;
            }
            C59806g gVar = (C59806g) C59807h.f161626c.createBuilder();
            gVar.copyOnWrite();
            C59807h hVar = (C59807h) gVar.instance;
            C59805f fVar2 = (C59805f) eVar.build();
            fVar2.getClass();
            hVar.f161630b = fVar2;
            hVar.f161629a |= 1;
            this.f379912d.mo41590b(C59743a.AD_CLICKED, C59807h.f161627d, (C59807h) gVar.build());
        }
    }
}
