package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35628au;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.i */
/* compiled from: PG */
public final class C13397i implements C35472h {

    /* renamed from: a */
    public final C13395g f41170a;

    /* renamed from: b */
    public final C15481g f41171b;

    /* renamed from: c */
    public final C35606g f41172c;

    /* renamed from: d */
    public final C35628au f41173d;

    /* renamed from: e */
    private final Executor f41174e;

    /* renamed from: f */
    private final C16850a f41175f;

    public C13397i(Executor executor, C16850a aVar, C13395g gVar, C15481g gVar2, C35606g gVar3, C35628au auVar) {
        this.f41174e = executor;
        this.f41175f = aVar;
        this.f41170a = gVar;
        this.f41171b = gVar2;
        this.f41172c = gVar3;
        this.f41173d = auVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C60870cx b = this.f41175f.mo23063b();
        C13396h hVar = new C13396h(this, dyVar);
        return C60922j.m93045h(b, C47810es.m84966f(hVar), this.f41174e);
    }
}
