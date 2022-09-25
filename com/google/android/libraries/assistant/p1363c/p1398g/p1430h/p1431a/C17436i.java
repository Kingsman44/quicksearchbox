package com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1430h.C17427a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a.C17456h;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a.C17462n;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a.C17463o;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17465aa;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17467ac;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17473ai;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.c.g.h.a.i */
/* compiled from: PG */
public final class C17436i implements C17427a {

    /* renamed from: a */
    public static final C59071e f50358a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.h.a.i");

    /* renamed from: b */
    public final C17508k f50359b;

    /* renamed from: c */
    public final C17477am f50360c;

    /* renamed from: d */
    public final C57981b f50361d;

    /* renamed from: e */
    public final Executor f50362e;

    /* renamed from: f */
    public final C17586a f50363f;

    /* renamed from: g */
    public final C32432a f50364g;

    /* renamed from: h */
    public final C60870cx f50365h;

    /* renamed from: i */
    public final C60870cx f50366i;

    /* renamed from: j */
    public final AtomicReference f50367j = new AtomicReference();

    /* renamed from: k */
    public final AtomicReference f50368k = new AtomicReference();

    /* renamed from: l */
    public final C17435h f50369l = new C17435h(this);

    /* renamed from: m */
    public final C17462n f50370m;

    public C17436i(C17508k kVar, C17477am amVar, C57981b bVar, C17522y yVar, C17463o oVar, Executor executor, C17586a aVar, C32432a aVar2) {
        this.f50359b = kVar;
        this.f50360c = amVar;
        this.f50361d = bVar;
        yVar.getClass();
        amVar.getClass();
        Executor executor2 = (Executor) oVar.f50429a.mo17428b();
        executor2.getClass();
        C32432a aVar3 = (C32432a) oVar.f50430b.mo17428b();
        aVar3.getClass();
        C17456h hVar = (C17456h) oVar.f50431c.mo17428b();
        hVar.getClass();
        this.f50370m = new C17462n(yVar, amVar, executor2, aVar3, hVar);
        this.f50362e = executor;
        this.f50363f = aVar;
        this.f50364g = aVar2;
        this.f50365h = C2169h.m6027a(new C17431d(this, kVar, amVar, executor));
        this.f50366i = C2169h.m6027a(new C17432e(this, kVar, amVar, executor));
    }

    /* renamed from: a */
    public final void mo23347a() {
        C59104x b = f50358a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42740)).mo56354G("Closing ExoPlayer for clientInfo %s, sessionToken %s", C17377g.m34653a(this.f50359b), C17377g.m34655c(this.f50360c));
        mo23353b(C17586a.m34875b(C17471ag.PLAYBACK_CLOSED_BY_CLIENT_BEFORE_STARTING), C17586a.m34874a(C17465aa.PLAYBACK_CLOSED_BY_CLIENT_BEFORE_ENDED));
    }

    /* renamed from: b */
    public final void mo23353b(C17473ai aiVar, C17467ac acVar) {
        this.f50362e.execute(C47810es.m84977q(new C17428a(this, aiVar, acVar)));
    }
}
