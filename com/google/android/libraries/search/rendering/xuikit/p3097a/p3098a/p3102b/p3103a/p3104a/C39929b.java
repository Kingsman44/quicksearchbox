package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3103a.p3104a;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40452l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4060h.p4061a.p4062a.p4067e.C54176a;
import com.google.p4017at.p4060h.p4061a.p4062a.p4067e.C54177b;
import com.google.p4648g.p4650b.C61640c;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64145n;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64155x;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C39929b implements C61640c {

    /* renamed from: a */
    public final /* synthetic */ C40452l f104968a;

    /* renamed from: b */
    public final /* synthetic */ C64155x f104969b;

    /* renamed from: c */
    public final /* synthetic */ Executor f104970c;

    public /* synthetic */ C39929b(C40452l lVar, C64155x xVar, Executor executor) {
        this.f104968a = lVar;
        this.f104969b = xVar;
        this.f104970c = executor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C64145n nVar;
        C40452l lVar = this.f104968a;
        C64155x xVar = this.f104969b;
        Executor executor = this.f104970c;
        C63088z zVar = (C63088z) obj;
        C54176a aVar = (C54176a) C54177b.f142184c.createBuilder();
        aVar.copyOnWrite();
        C54177b bVar = (C54177b) aVar.instance;
        zVar.getClass();
        bVar.f142186a |= 1;
        bVar.f142187b = zVar;
        C54177b bVar2 = (C54177b) aVar.build();
        if (xVar.f173456b == 3) {
            nVar = (C64145n) xVar.f173457c;
        } else {
            nVar = C64145n.f173426i;
        }
        return C60922j.m93044g(lVar.mo42454b(bVar2, nVar), C47810es.m84963c(C39932e.f104975a), executor);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
