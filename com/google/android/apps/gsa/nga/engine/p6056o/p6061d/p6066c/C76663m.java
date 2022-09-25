package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6066c;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.aos;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2543a.C32976a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.c.m */
/* compiled from: PG */
public final class C76663m extends C76657g {

    /* renamed from: a */
    private final Context f211922a;

    /* renamed from: b */
    private final C37215b f211923b;

    /* renamed from: c */
    private final C60887da f211924c;

    /* renamed from: d */
    private final aos f211925d;

    public C76663m(Context context, C37215b bVar, C60887da daVar, aos aos) {
        this.f211922a = context;
        this.f211923b = bVar;
        this.f211924c = daVar;
        this.f211925d = aos;
    }

    /* renamed from: b */
    public final void mo72287b(C76652b bVar, C70862aj ajVar) {
        C32976a a = this.f211925d.mo66637a(C32951d.m60991x().mo38367a(), this.f211923b);
        Context context = this.f211922a;
        C52081en enVar = bVar.f211912a;
        if (enVar == null) {
            enVar = C52081en.f136679i;
        }
        C60870cx a2 = a.mo38429a(context, enVar);
        ((C70883v) ajVar).mo62583d(new C76660j(a2));
        C60856cj.m92911t(a2, C47810es.m84974n(new C76662l(ajVar)), this.f211924c);
    }
}
