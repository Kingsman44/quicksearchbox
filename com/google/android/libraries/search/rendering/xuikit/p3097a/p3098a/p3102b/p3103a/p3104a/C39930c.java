package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3103a.p3104a;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40452l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4648g.p4650b.C61640c;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64137f;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64141j;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64155x;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;
import p5591n.p5594b.p5595a.p5596a.p5597a.p5598a.p5599a.p5600a.p5601a.C71856a;
import p5591n.p5594b.p5595a.p5596a.p5597a.p5598a.p5599a.p5600a.p5601a.C71857b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C39930c implements C61640c {

    /* renamed from: a */
    public final /* synthetic */ C64155x f104971a;

    /* renamed from: b */
    public final /* synthetic */ C40452l f104972b;

    /* renamed from: c */
    public final /* synthetic */ Executor f104973c;

    public /* synthetic */ C39930c(C64155x xVar, C40452l lVar, Executor executor) {
        this.f104971a = xVar;
        this.f104972b = lVar;
        this.f104973c = executor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C64155x xVar = this.f104971a;
        C40452l lVar = this.f104972b;
        Executor executor = this.f104973c;
        C63088z zVar = (C63088z) obj;
        C71856a aVar = (C71856a) C71857b.f191399c.createBuilder();
        aVar.copyOnWrite();
        C71857b bVar = (C71857b) aVar.instance;
        zVar.getClass();
        bVar.f191401a |= 1;
        bVar.f191402b = zVar;
        C71857b bVar2 = (C71857b) aVar.build();
        int i = xVar.f173456b;
        if (i == 4) {
            cxVar = lVar.mo42455c(bVar2, (C64141j) xVar.f173457c);
        } else if (i == 5) {
            cxVar = lVar.mo42453a(bVar2, (C64137f) xVar.f173457c);
        } else {
            throw new IllegalArgumentException("No server_config specified");
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(C39928a.f104967a), executor);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
