package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119623e;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119642x;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119662e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c.C119767q;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b.C121023g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127448f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.l */
/* compiled from: PG */
final class C119561l {

    /* renamed from: a */
    public static final C59071e f333222a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.g.l");

    /* renamed from: b */
    public final C119623e f333223b;

    /* renamed from: c */
    public final C119574y f333224c;

    /* renamed from: d */
    public final C119533b f333225d;

    /* renamed from: e */
    public final C127448f f333226e;

    /* renamed from: f */
    public C60870cx f333227f;

    /* renamed from: g */
    public final C119548ac f333228g;

    /* renamed from: h */
    public final C121023g f333229h;

    public C119561l(C119623e eVar, C119548ac acVar, C119575z zVar, C127448f fVar, C119533b bVar, C121023g gVar) {
        this.f333223b = eVar;
        this.f333228g = acVar;
        this.f333226e = fVar;
        C119640v vVar = eVar.f333376d;
        C119640v vVar2 = vVar == null ? C119640v.f333408i : vVar;
        acVar.getClass();
        vVar2.getClass();
        C32904f fVar2 = (C32904f) zVar.f333264a.mo17428b();
        fVar2.getClass();
        C119550ae aeVar = (C119550ae) zVar.f333265b.mo17428b();
        aeVar.getClass();
        Executor executor = (Executor) zVar.f333266c.mo17428b();
        executor.getClass();
        ((C46778cv) zVar.f333267d.mo17428b()).getClass();
        C119662e eVar2 = (C119662e) zVar.f333268e.mo17428b();
        eVar2.getClass();
        C119567r rVar = (C119567r) zVar.f333269f.mo17428b();
        rVar.getClass();
        C119767q qVar = (C119767q) zVar.f333270g.mo17428b();
        qVar.getClass();
        this.f333224c = new C119574y(acVar, vVar2, fVar2, aeVar, executor, eVar2, rVar, qVar);
        this.f333225d = bVar;
        this.f333229h = gVar;
        C119532a aVar = C119532a.KARAJAN_V2;
        C119640v vVar3 = eVar.f333376d;
        C119642x xVar = (vVar3 == null ? C119640v.f333408i : vVar3).f333412c;
        bVar.mo104418a(aVar, (xVar == null ? C119642x.f333419e : xVar).f333423c);
    }

    /* renamed from: a */
    public final Throwable mo104430a(Status status, String str) {
        ((C59052c) ((C59052c) f333222a.mo56226d()).mo56372aa(34538)).mo56389s("%s", str);
        StatusException asException = status.withDescription(str).asException();
        this.f333228g.mo104427a(asException);
        return asException;
    }

    /* renamed from: b */
    public final void mo104431b(String str, C60870cx cxVar) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C119560k(this, str)), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo104432c(String str, C60870cx cxVar) {
        C119557h hVar = new C119557h(this);
        mo104431b(str, C60922j.m93044g(cxVar, C47810es.m84963c(hVar), C60826bg.f164896a));
    }
}
