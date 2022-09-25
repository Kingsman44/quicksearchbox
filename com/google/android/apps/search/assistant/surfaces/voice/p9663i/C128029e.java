package com.google.android.apps.search.assistant.surfaces.voice.p9663i;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9664a.C127935b;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.C128010h;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9670e.C128030a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.e */
/* compiled from: PG */
final class C128029e implements C127933a {

    /* renamed from: a */
    public static final C58974d f352304a = C58974d.m91134h("PSManager");

    /* renamed from: b */
    public final C128010h f352305b;

    /* renamed from: c */
    public final C128030a f352306c;

    /* renamed from: d */
    private final ExecutorService f352307d;

    /* renamed from: e */
    private final C127935b f352308e;

    /* renamed from: f */
    private boolean f352309f = false;

    public C128029e(C60888db dbVar, C128030a aVar, C128010h hVar) {
        this.f352307d = dbVar;
        this.f352306c = aVar;
        this.f352305b = hVar;
        this.f352308e = new C127935b("hands-free", dbVar);
    }

    /* renamed from: a */
    public final synchronized C60870cx mo108281a() {
        C60870cx a;
        C127936b bVar;
        a = this.f352308e.mo108283a();
        bVar = C127936b.f352158a;
        return C60846c.m92878g(a, Throwable.class, C47810es.m84963c(bVar), this.f352307d);
    }

    /* renamed from: b */
    public final synchronized void mo108282b(boolean z, boolean z2) {
        if (this.f352309f != z) {
            this.f352309f = z;
            if (z) {
                this.f352308e.mo108284b(new C127948d(this, z2));
            }
        }
    }
}
