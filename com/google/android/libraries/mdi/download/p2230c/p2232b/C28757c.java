package com.google.android.libraries.mdi.download.p2230c.p2232b;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2230c.C28775j;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.android.libraries.mdi.download.p2230c.C28783r;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.c.b.c */
/* compiled from: PG */
public final class C28757c implements C28782q {

    /* renamed from: a */
    public final C42813k f78174a;

    /* renamed from: b */
    private final Executor f78175b;

    public C28757c(C42813k kVar, Executor executor) {
        this.f78174a = kVar;
        this.f78175b = executor;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo34370a(C28775j jVar) {
        return C60856cj.m92899h(new UnsupportedOperationException("Not implemented"));
    }

    /* renamed from: b */
    public final C60870cx mo34371b(C28781p pVar) {
        if (!pVar.mo34402f().startsWith("inlinefile")) {
            C29045l.m53936h("%s: Invalid url given, expected to start with 'inlinefile:', but was %s", "InlineFileDownloader", pVar.mo34402f());
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.INVALID_INLINE_FILE_URL_SCHEME;
            bnVar.f78063b = "InlineFileDownloader only supports copying inlinefile: scheme";
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        C28756b bVar = new C28756b(this, (C28783r) pVar.mo34399d().mo56107c(), pVar);
        return C60856cj.m92905n(C47810es.m84965e(bVar), this.f78175b);
    }
}
