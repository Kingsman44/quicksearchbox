package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11696b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11697ba;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11523c;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p676c.C11524a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.d */
/* compiled from: PG */
public final class C11497d implements C11523c {

    /* renamed from: a */
    public static final C58974d f37366a = C58974d.m91134h("ActiveNotificationHndlr");

    /* renamed from: b */
    public C58480gp f37367b;

    /* renamed from: c */
    public C2164c f37368c;

    /* renamed from: d */
    private final Executor f37369d;

    /* renamed from: e */
    private final Executor f37370e;

    public C11497d(Executor executor) {
        C69664n.m101061g(executor, "executor");
        this.f37369d = executor;
        this.f37370e = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20020a(C70148al alVar, C11697ba baVar, C69626l lVar) {
        C69664n.m101061g(alVar, "context");
        return C60856cj.m92905n(C47810es.m84965e(new C11495b(baVar, alVar, lVar, this)), this.f37370e);
    }

    /* renamed from: b */
    public final void mo20021b(C70148al alVar, C11696b bVar, C69626l lVar) {
        C69664n.m101061g(alVar, "context");
        C11524a.m27217a(this.f37370e, "Error handling additional notifications", new C11496c(this, lVar, bVar, alVar));
    }
}
