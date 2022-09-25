package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a;

import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127375b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127448f;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127452g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127418e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.a.d */
/* compiled from: PG */
public final class C127392d {

    /* renamed from: a */
    private final C127448f f350796a;

    /* renamed from: b */
    private final C60887da f350797b;

    public C127392d(C127448f fVar, C60887da daVar) {
        this.f350796a = fVar;
        this.f350797b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo108045a(C127375b bVar) {
        if (bVar.f350747a != 1) {
            return C60856cj.m92899h(new IllegalArgumentException("No deeplink entry request provided."));
        }
        C127448f fVar = this.f350796a;
        C60870cx a = C70876o.m103760a(fVar.f189039a.mo39510a(C127452g.m208414a(), fVar.f189040b), (C127418e) bVar.f350748b);
        C127391c cVar = C127391c.f350795a;
        return C60922j.m93044g(a, C47810es.m84963c(cVar), this.f350797b);
    }
}
