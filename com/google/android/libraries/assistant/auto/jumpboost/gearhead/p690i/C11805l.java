package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p690i;

import com.google.android.gearhead.sdk.assistant.C142663i;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11525d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.C12620b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.l */
/* compiled from: PG */
public final class C11805l implements C12620b {

    /* renamed from: a */
    public static final C59071e f37963a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.l");

    /* renamed from: b */
    public final C11525d f37964b;

    /* renamed from: c */
    public final Executor f37965c;

    /* renamed from: d */
    public final Executor f37966d;

    /* renamed from: e */
    public C142663i f37967e = null;

    /* renamed from: f */
    private final C11628d f37968f;

    public C11805l(C11525d dVar, C11628d dVar2, Executor executor) {
        this.f37964b = dVar;
        this.f37968f = dVar2;
        this.f37965c = executor;
        this.f37966d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20158a() {
        C11801h hVar = new C11801h(this);
        return C60856cj.m92904m(C47810es.m84978r(hVar), this.f37966d);
    }

    /* renamed from: b */
    public final void mo20159b(String str) {
        C60870cx c = this.f37968f.mo20065c();
        C11800g gVar = new C11800g(this, str);
        C46459k.m82829b(C60922j.m93045h(c, C47810es.m84966f(gVar), this.f37965c), "Failed to update transcription session final", new Object[0]);
    }

    /* renamed from: c */
    public final void mo20160c() {
        C60870cx c = this.f37968f.mo20065c();
        C11799f fVar = new C11799f(this);
        C46459k.m82829b(C60922j.m93045h(c, C47810es.m84966f(fVar), this.f37965c), "Failed to end transcription session", new Object[0]);
    }

    /* renamed from: d */
    public final void mo20161d(String str) {
        C60870cx c = this.f37968f.mo20065c();
        C11802i iVar = new C11802i(this, str);
        C46459k.m82829b(C60922j.m93045h(c, C47810es.m84966f(iVar), this.f37965c), "Failed to update transcription session change", new Object[0]);
    }
}
