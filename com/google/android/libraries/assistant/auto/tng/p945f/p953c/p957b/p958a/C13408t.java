package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35616ai;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35617aj;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35628au;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.t */
/* compiled from: PG */
public final class C13408t implements C35472h {

    /* renamed from: a */
    public final C35616ai f41202a;

    /* renamed from: b */
    public final C35617aj f41203b;

    /* renamed from: c */
    public final C35606g f41204c;

    /* renamed from: d */
    public final C35628au f41205d;

    /* renamed from: e */
    private final Executor f41206e;

    /* renamed from: f */
    private final C16850a f41207f;

    public C13408t(Executor executor, C16850a aVar, C35616ai aiVar, C35617aj ajVar, C35606g gVar, C35628au auVar) {
        this.f41206e = executor;
        this.f41207f = aVar;
        this.f41202a = aiVar;
        this.f41203b = ajVar;
        this.f41204c = gVar;
        this.f41205d = auVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C60870cx b = this.f41207f.mo23063b();
        C13407s sVar = new C13407s(this, dyVar);
        return C60922j.m93045h(b, C47810es.m84966f(sVar), this.f41206e);
    }
}
