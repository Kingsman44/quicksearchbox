package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122618d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123067o;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123340bu;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18309l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5028p.p5029a.C64978e;
import com.google.protos.p4985f.p5028p.p5029a.C64979f;
import com.google.protos.p4985f.p5028p.p5029a.C64984k;
import com.google.protos.p5127o.C65682h;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.k */
/* compiled from: PG */
public final class C123522k implements C123524m {

    /* renamed from: b */
    public static final /* synthetic */ int f341328b = 0;

    /* renamed from: a */
    public final C123067o f341329a;

    /* renamed from: d */
    private final C18309l f341330d;

    /* renamed from: e */
    private final C122618d f341331e;

    /* renamed from: f */
    private final C123340bu f341332f;

    /* renamed from: g */
    private final Executor f341333g;

    public C123522k(C18309l lVar, C122618d dVar, C123340bu buVar, C123067o oVar, Executor executor) {
        this.f341330d = lVar;
        this.f341331e = dVar;
        this.f341332f = buVar;
        this.f341329a = oVar;
        this.f341333g = executor;
    }

    /* renamed from: a */
    public final C60870cx mo106030a(C123528q qVar) {
        Optional optional;
        String str = qVar.f341343a;
        try {
            C18309l lVar = this.f341330d;
            C65682h hVar = ((C64984k) lVar.mo23661e().mo23693b(C64978e.f175966a)).f175975b;
            if (hVar == null) {
                hVar = C65682h.f178459f;
            }
            C64979f fVar = new C64979f(lVar, hVar);
            C60870cx a = this.f341331e.mo105693a();
            C123289g gVar = new C123289g(qVar);
            C60870cx h = C60922j.m93045h(a, C47810es.m84966f(gVar), this.f341333g);
            C60870cx c = this.f341332f.mo105991c();
            if (qVar.f341346d.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(qVar.f341346d);
            }
            Optional optional2 = optional;
            return C47633f.m84733g(C47638k.m84753d(h, c).mo51521b(new C123290h(c, qVar, h, optional2, fVar), this.f341333g)).mo51513e(Throwable.class, C123291i.f341026a, C60826bg.f164896a).mo51515h(new C123521j(this), C60826bg.f164896a);
        } catch (C18218av e) {
            return C60856cj.m92899h(e);
        }
    }
}
