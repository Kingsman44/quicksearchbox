package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10303b;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135914g;
import com.google.android.libraries.web.p3353c.C43378w;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63033ey;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.b.d */
/* compiled from: PG */
public final /* synthetic */ class C135921d implements C43378w {

    /* renamed from: a */
    public final /* synthetic */ C135923f f370179a;

    public /* synthetic */ C135921d(C135923f fVar) {
        this.f370179a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo46481a(Object obj) {
        C135923f fVar = this.f370179a;
        String str = (String) obj;
        if (str.isEmpty()) {
            return C60856cj.m92900i(C46688af.m83205b(C135923f.m220532a(C135914g.READABILITY_STATE_NON_READABLE), fVar.f370185e.mo26871c()));
        }
        C60870cx e = fVar.f370181a.mo50345e(C63033ey.m95859a(str));
        C135919b bVar = new C135919b(fVar);
        return C60922j.m93044g(e, C47810es.m84963c(bVar), C60826bg.f164896a);
    }
}
