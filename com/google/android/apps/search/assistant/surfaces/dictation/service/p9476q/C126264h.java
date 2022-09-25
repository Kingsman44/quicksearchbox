package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125193ak;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125255k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125257m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.h */
/* compiled from: PG */
public final class C126264h implements C126268l {

    /* renamed from: a */
    public static final C59071e f347912a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.q.h");

    /* renamed from: b */
    public final C125255k f347913b;

    /* renamed from: c */
    public final C60888db f347914c;

    /* renamed from: d */
    public final Executor f347915d;

    /* renamed from: e */
    public final AtomicBoolean f347916e = new AtomicBoolean(false);

    /* renamed from: f */
    public final C47632e f347917f = new C47632e();

    /* renamed from: g */
    public final C126267k f347918g;

    /* renamed from: h */
    public final C126174c f347919h;

    /* renamed from: i */
    public final C125234by f347920i;

    public C126264h(af afVar, C126267k kVar, C125193ak akVar, C125257m mVar, C125255k kVar2, C126174c cVar, C60888db dbVar, Executor executor) {
        this.f347918g = kVar;
        this.f347919h = cVar;
        C69664n.m101061g(afVar, "keyboardConfig");
        this.f347920i = akVar.mo66634a(new C126263g(this), mVar.mo106883a(afVar, mVar.f345544a.mo107522a(afVar)));
        this.f347913b = kVar2;
        this.f347914c = dbVar;
        this.f347915d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo107493a(C60870cx cxVar, C89885b bVar, String str, Object... objArr) {
        C126308aq aqVar = new C126308aq(C126240c.f347856a, new C126260d(this, bVar, str, objArr));
        C60856cj.m92911t(cxVar, C47810es.m84974n(aqVar), this.f347914c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f347920i);
        return "AiAiAsrClient{session=" + valueOf + "}";
    }
}
