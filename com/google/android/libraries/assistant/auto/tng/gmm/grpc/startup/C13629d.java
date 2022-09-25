package com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup;

import com.google.android.libraries.assistant.auto.jumpboost.p670f.C11473a;
import com.google.android.libraries.assistant.p1522k.p1523a.p1524a.C18399c;
import com.google.android.libraries.assistant.p1522k.p1523a.p1524a.C18400d;
import com.google.android.libraries.assistant.p1522k.p1523a.p1524a.C18401e;
import com.google.android.libraries.assistant.p1522k.p1523a.p1524a.C18402f;
import com.google.android.libraries.assistant.p1522k.p1523a.p1524a.C18403g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup.d */
/* compiled from: PG */
public final class C13629d extends C18403g {

    /* renamed from: a */
    public static final C59071e f41664a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup.d");

    /* renamed from: b */
    public final C69464a f41665b;

    /* renamed from: c */
    public final Executor f41666c;

    /* renamed from: d */
    public boolean f41667d = false;

    /* renamed from: e */
    private final C11473a f41668e;

    public C13629d(C11473a aVar, C69464a aVar2, C60887da daVar) {
        this.f41668e = aVar;
        this.f41665b = aVar2;
        this.f41666c = new C60904dr(daVar);
    }

    /* renamed from: b */
    public final void mo21194b(C18400d dVar, C70862aj ajVar) {
        C18401e eVar = (C18401e) C18402f.f52231c.createBuilder();
        int a = C18399c.m35843a(dVar.f52229a);
        if (a != 0 && a == 2) {
            C11473a aVar = this.f41668e;
            long j = aVar.f37274a;
            if (j == 0) {
                j = aVar.f37275b;
                if (j == 0) {
                    j = 0;
                }
            }
            eVar.copyOnWrite();
            C18402f fVar = (C18402f) eVar.instance;
            fVar.f52233a |= 1;
            fVar.f52234b = j;
            if (!this.f41667d) {
                C60856cj.m92911t(C60856cj.m92905n(C47810es.m84965e(new C13626a(this)), this.f41666c), C47810es.m84974n(new C13628c(this)), this.f41666c);
            }
            ajVar.mo20123c((C18402f) eVar.build());
            ajVar.mo20121a();
            return;
        }
        ajVar.mo20123c((C18402f) eVar.build());
        ajVar.mo20121a();
    }
}
