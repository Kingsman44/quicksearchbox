package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3103a.p3105b;

import com.google.android.libraries.elements.interfaces.C21261bd;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40026ag;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40323n;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4915b.C64159d;
import com.google.protos.youtube.elements.C66192df;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.a.b.b */
/* compiled from: PG */
public final class C39940b implements C40323n {

    /* renamed from: a */
    private final Executor f104987a;

    public C39940b(Executor executor) {
        this.f104987a = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo42087a(Object obj, C21311r rVar, C40335z zVar) {
        C64159d dVar = (C64159d) obj;
        if ((dVar.f173469a & 1) == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("GetClickTrackingIdentifierCommand does not have a DataStore output path"));
        }
        if (rVar == null) {
            return C60856cj.m92899h(new IllegalStateException("No CommandEventData was provided"));
        }
        C66192df E = rVar.mo26734d().mo26844E();
        if (E == null) {
            return C60856cj.m92899h(new IllegalStateException("No LoggingNode is associated with the Element"));
        }
        C21261bd C = rVar.mo26734d().mo26842C();
        if (!(C instanceof C40026ag)) {
            return C60856cj.m92899h(new IllegalStateException("VeElementsInteractionLogger is needed on the client to impress and extract VEs"));
        }
        C60870cx d = ((C40026ag) C).mo42133d(E);
        C39939a aVar = new C39939a(zVar, dVar);
        return C60922j.m93044g(d, C47810es.m84963c(aVar), this.f104987a);
    }
}
