package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125929r;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126107dr;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.C125971a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9472d.C126028a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b.r */
/* compiled from: PG */
public final class C126018r {

    /* renamed from: a */
    public final C126107dr f347289a;

    /* renamed from: b */
    public final C126028a f347290b;

    /* renamed from: c */
    public final C125971a f347291c;

    /* renamed from: d */
    public final C125929r f347292d;

    /* renamed from: e */
    public final long f347293e;

    /* renamed from: f */
    public final long f347294f;

    /* renamed from: g */
    public final boolean f347295g;

    /* renamed from: h */
    public final Executor f347296h;

    public C126018r(C126107dr drVar, C126028a aVar, C125971a aVar2, C125929r rVar, long j, long j2, boolean z, Executor executor) {
        this.f347289a = drVar;
        this.f347290b = aVar;
        this.f347291c = aVar2;
        this.f347292d = rVar;
        this.f347293e = j;
        this.f347294f = j2;
        this.f347295g = z;
        this.f347296h = executor;
    }

    /* renamed from: a */
    public final C60870cx mo107243a(C126035k kVar) {
        C126028a aVar = this.f347290b;
        C126029e eVar = (C126029e) kVar;
        if (eVar.f347345f) {
            if (!aVar.f347338b.mo107181b(eVar.f347344e)) {
                eVar.f347344e.toLanguageTag();
            } else {
                C126087cy cyVar = eVar.f347343d;
                if (cyVar.f347497h && cyVar.f347498i.f347480a && !cyVar.f347496g.f345042a.isEmpty()) {
                    C60870cx b = this.f347291c.mo107220b(eVar.f347343d.mo107327b(), eVar.f347344e);
                    C126008h hVar = new C126008h(this, kVar);
                    return C60922j.m93044g(b, C47810es.m84963c(hVar), this.f347296h);
                }
            }
        }
        return C47633f.m84733g(C60856cj.m92900i(C58485gu.m89845m()));
    }
}
