package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126316ay;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.bt */
/* compiled from: PG */
public final class C126233bt {

    /* renamed from: a */
    public static final C59071e f347840a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.q.bt");

    /* renamed from: b */
    public final C126203aq f347841b;

    /* renamed from: c */
    public final C126278v f347842c;

    /* renamed from: d */
    public final Executor f347843d;

    /* renamed from: e */
    public final C61301b f347844e;

    /* renamed from: f */
    public C126208av f347845f;

    /* renamed from: g */
    public C60931s f347846g;

    /* renamed from: h */
    public boolean f347847h = false;

    /* renamed from: i */
    public final C125422z f347848i;

    /* renamed from: j */
    private final long f347849j;

    public C126233bt(long j, C126278v vVar, C125422z zVar, C126203aq aqVar, C60888db dbVar) {
        this.f347849j = j;
        this.f347842c = vVar;
        this.f347848i = zVar;
        this.f347841b = aqVar;
        this.f347843d = new C60904dr(dbVar);
        this.f347844e = C126290c.m206496a("OrationManager@Dictation#" + j);
    }

    /* renamed from: a */
    public final C60870cx mo107476a(C126316ay ayVar) {
        C126229bp bpVar = new C126229bp(this, ayVar);
        return C60856cj.m92905n(C47810es.m84965e(bpVar), this.f347843d);
    }

    /* renamed from: b */
    public final void mo107477b(C126208av avVar, C126207au auVar) {
        this.f347843d.execute(C47810es.m84977q(new C126228bo(this, avVar, auVar)));
    }

    public final String toString() {
        long j = this.f347849j;
        return "OrationManager@Dictation#" + j;
    }
}
