package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12862f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12855v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.p4456g.C57981b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.e */
/* compiled from: PG */
final class C12698e implements C12862f {

    /* renamed from: a */
    public static final C59071e f39768a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.e");

    /* renamed from: b */
    private final C12855v f39769b;

    /* renamed from: c */
    private final C12709p f39770c;

    /* renamed from: d */
    private final C60870cx f39771d;

    /* renamed from: e */
    private final Executor f39772e;

    public C12698e(C12855v vVar, C12709p pVar, C60870cx cxVar, Executor executor) {
        this.f39769b = vVar;
        this.f39770c = pVar;
        this.f39771d = cxVar;
        this.f39772e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20735a() {
        C59104x b = f39768a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CDStateRenderingResult");
        ((C59052c) ((C59052c) b).mo56372aa(44408)).mo56386p("#cancel");
        return C60856cj.m92901j(this.f39769b.mo20815e());
    }

    /* renamed from: b */
    public final C60870cx mo20736b() {
        C60870cx cxVar = this.f39769b.f40104e;
        C12696c cVar = C12696c.f39766a;
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(cVar), this.f39772e);
        return C47638k.m84751b(g, this.f39771d).mo51521b(new C12697d(g), this.f39772e);
    }

    /* renamed from: c */
    public final C60870cx mo20737c() {
        return this.f39769b.f40104e;
    }

    /* renamed from: d */
    public final C57981b mo20738d() {
        return this.f39770c.f39793c;
    }
}
