package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9718b;

import com.google.android.apps.gsa.binaries.satin.app.anw;
import com.google.android.apps.search.assistant.libraries.p8966e.p8969c.C119354k;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128416ak;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.b.c */
/* compiled from: PG */
public final class C128422c implements C119908e {

    /* renamed from: a */
    public final C128416ak f353185a;

    /* renamed from: b */
    public final Executor f353186b;

    /* renamed from: c */
    public final C119354k f353187c;

    /* renamed from: d */
    private final C71422aw f353188d;

    public C128422c(C51809dy dyVar, C128416ak akVar, anw anw, Executor executor, C71422aw awVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(akVar, "voiceSearchClientConnection");
        C69664n.m101061g(anw, "opaHandoverPerformerFactory");
        C69664n.m101061g(executor, "sequentialExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f353185a = akVar;
        this.f353186b = executor;
        this.f353188d = awVar;
        this.f353187c = anw.a(dyVar);
    }

    /* renamed from: a */
    public final C60870cx mo104299a() {
        return C71663i.m104692e(this.f353188d, (C71424ay) null, new C128421b(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final void mo104300b() {
    }
}
