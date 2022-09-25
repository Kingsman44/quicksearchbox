package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18482br;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.y */
/* compiled from: PG */
public final class C128455y implements C70862aj {

    /* renamed from: a */
    public static final C59071e f353299a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.n.y");

    /* renamed from: b */
    public final C128436f f353300b;

    /* renamed from: c */
    public final Executor f353301c;

    /* renamed from: d */
    public final C128426a f353302d;

    /* renamed from: e */
    public final C128416ak f353303e;

    /* renamed from: f */
    public C60870cx f353304f = null;

    public C128455y(C128436f fVar, Executor executor, C70862aj ajVar, C128426a aVar) {
        this.f353300b = fVar;
        this.f353301c = executor;
        this.f353302d = aVar;
        this.f353303e = new C128416ak(ajVar, aVar);
    }

    /* renamed from: a */
    public final void mo20121a() {
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f353299a.mo56226d()).mo56382g(th)).mo56372aa(38823)).mo56389s("VoiceSearchAssistantBackend#VoiceQueryRequestObserver#onError: %s", th.getMessage());
        this.f353301c.execute(C47810es.m84977q(new C128451u(this, th)));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        this.f353301c.execute(C47810es.m84977q(new C128452v(this, (C18482br) obj)));
    }
}
