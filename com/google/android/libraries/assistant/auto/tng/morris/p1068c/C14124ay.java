package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.ay */
/* compiled from: PG */
public final class C14124ay implements C14117ar {

    /* renamed from: a */
    public static final C59071e f42826a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.c.ay");

    /* renamed from: b */
    static final Duration f42827b = Duration.ofSeconds(60);

    /* renamed from: c */
    public final C37215b f42828c;

    /* renamed from: d */
    public final C60888db f42829d;

    /* renamed from: e */
    public final C14118as f42830e;

    /* renamed from: f */
    public final Executor f42831f;

    /* renamed from: g */
    public boolean f42832g = false;

    /* renamed from: h */
    public C60870cx f42833h;

    public C14124ay(C37215b bVar, C60888db dbVar, C14118as asVar) {
        this.f42828c = bVar;
        this.f42829d = dbVar;
        this.f42830e = asVar;
        this.f42831f = new C60904dr(dbVar);
    }

    /* renamed from: a */
    public final void mo21433a(C37254c cVar) {
        C14121av avVar = new C14121av(this, cVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(avVar), this.f42831f), "Error logging end event", new Object[0]);
    }

    /* renamed from: b */
    public final void mo21434b(C37254c cVar) {
        C14123ax axVar = new C14123ax(this, cVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(axVar), this.f42831f), "Error logging milestone event", new Object[0]);
    }

    /* renamed from: c */
    public final void mo21435c(C37254c cVar) {
        C14122aw awVar = new C14122aw(this, cVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(awVar), this.f42831f), "Error logging start event", new Object[0]);
    }
}
