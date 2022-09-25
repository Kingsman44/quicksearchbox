package com.google.android.libraries.mdi.download.p2230c.p2234c;

import android.content.Context;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2230c.C28775j;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.p10983ae.p10984a.C147457b;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42720g;
import com.google.android.libraries.storage.p3304a.p3305a.C42729p;
import com.google.android.libraries.storage.p3304a.p3305a.C42734u;
import com.google.android.libraries.storage.p3304a.p3309d.p3310a.C42770a;
import com.google.android.libraries.storage.p3304a.p3309d.p3310a.C42771b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.c.c.f */
/* compiled from: PG */
public final class C28766f implements C28782q {

    /* renamed from: a */
    public final C147476u f78197a;

    /* renamed from: b */
    public final C147457b f78198b;

    /* renamed from: c */
    private final Context f78199c;

    /* renamed from: d */
    private final C42813k f78200d;

    /* renamed from: e */
    private final Executor f78201e;

    public C28766f(Context context, C147476u uVar, C147457b bVar, C42813k kVar, Executor executor) {
        this.f78199c = context;
        this.f78197a = uVar;
        this.f78198b = bVar;
        this.f78200d = kVar;
        this.f78201e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo34370a(C28775j jVar) {
        C58833ax a = jVar.mo34365a();
        C28765e eVar = new C28765e(this, jVar.mo34366b(), a);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(eVar), this.f78201e);
        C28764d dVar = new C28764d(a);
        return C60922j.m93044g(n, C47810es.m84963c(dVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo34371b(C28781p pVar) {
        String lastPathSegment = pVar.mo34397b().getLastPathSegment();
        lastPathSegment.getClass();
        try {
            File parentFile = C42734u.m75496a(pVar.mo34397b(), new C42720g(this.f78199c, (C42729p) null)).getParentFile();
            parentFile.getClass();
            try {
                return C2169h.m6027a(new C28763c(this, pVar, parentFile, lastPathSegment, (C42770a) this.f78200d.mo45889c(pVar.mo34397b(), new C42771b())));
            } catch (IOException e) {
                C29045l.m53938j(e, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", pVar.mo34397b());
                C28736bn bnVar = new C28736bn();
                bnVar.f78062a = C28737bo.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                bnVar.f78064c = e;
                return C60856cj.m92899h(bnVar.mo34334a());
            }
        } catch (IOException e2) {
            C29045l.m53936h("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", pVar.mo34397b());
            C28736bn bnVar2 = new C28736bn();
            bnVar2.f78062a = C28737bo.MALFORMED_FILE_URI_ERROR;
            bnVar2.f78064c = e2;
            return C60856cj.m92899h(bnVar2.mo34334a());
        }
    }
}
