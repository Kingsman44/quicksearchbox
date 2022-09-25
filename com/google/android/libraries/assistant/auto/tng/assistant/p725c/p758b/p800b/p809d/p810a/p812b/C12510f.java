package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p812b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.C12480a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12864h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13017ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13075u;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13077w;
import com.google.android.libraries.assistant.auto.tng.common.p931p.C13314n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.p4456g.p4459c.C58002f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.b.f */
/* compiled from: PG */
public final class C12510f extends C68247h {

    /* renamed from: a */
    private final C68283d f39417a;

    /* renamed from: c */
    private final C68283d f39418c;

    /* renamed from: d */
    private final C68283d f39419d;

    /* renamed from: e */
    private final C68283d f39420e;

    /* renamed from: f */
    private final C68283d f39421f;

    /* renamed from: g */
    private final C68283d f39422g;

    /* renamed from: h */
    private final C68283d f39423h;

    public C12510f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C12510f.class), aVar);
        this.f39417a = C68236af.m98549d(dVar);
        this.f39418c = C68236af.m98549d(dVar2);
        this.f39419d = C68236af.m98549d(dVar3);
        this.f39420e = C68236af.m98549d(dVar4);
        this.f39421f = C68236af.m98549d(dVar5);
        this.f39422g = C68236af.m98549d(dVar6);
        this.f39423h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C12480a aVar = (C12480a) list.get(0);
        C68283d dVar = this.f39418c;
        C68283d dVar2 = this.f39419d;
        C68283d dVar3 = this.f39420e;
        C68283d dVar4 = this.f39421f;
        C68283d dVar5 = this.f39422g;
        Executor executor = (Executor) list.get(1);
        C60870cx a = aVar.mo20629a(C13075u.class, C13314n.m29569a(dVar.mo60297gq(), executor));
        C12509e.m28615a(a, executor, "Failed to stream mic state", new Object[0]);
        C12509e.m28615a(aVar.mo20629a(C13033au.class, C13314n.m29569a(dVar2.mo60297gq(), executor)), executor, "Failed to stream transcription state", new Object[0]);
        C12509e.m28615a(aVar.mo20629a(C12864h.class, C13314n.m29569a(dVar3.mo60297gq(), executor)), executor, "Failed to stream conversation delta rendering state", new Object[0]);
        C12509e.m28615a(aVar.mo20629a(C13077w.class, new C58002f(C13314n.m29569a(dVar4.mo60297gq(), executor), C12505a.f39412a)), executor, "Failed to stream network state", new Object[0]);
        C12509e.m28615a(C60922j.m93045h(a, C47810es.m84966f(new C12506b(aVar, dVar3, executor)), executor), executor, "Failed to stream TTS state", new Object[0]);
        C12509e.m28615a(aVar.mo20629a(C13017ae.class, C13314n.m29569a(dVar5.mo60297gq(), executor)), executor, "Failed to stream StaticDiscoveryState", new Object[0]);
        return C60856cj.m92900i(aVar.mo20630b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39417a.mo60297gq(), this.f39423h.mo60297gq());
    }
}
