package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.cl */
/* compiled from: PG */
public final class C94735cl extends C68247h {

    /* renamed from: a */
    private final C68283d f264931a;

    /* renamed from: c */
    private final C68283d f264932c;

    /* renamed from: d */
    private final C68283d f264933d;

    public C94735cl(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C94735cl.class), aVar);
        this.f264931a = C68236af.m98549d(dVar);
        this.f264932c = C68236af.m98549d(dVar2);
        this.f264933d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C94785f fVar = (C94785f) list.get(1);
        C58976aa aaVar = C58975e.f156826a;
        Objects.requireNonNull(fVar);
        ((C22871g) list.get(2)).mo28212l("BistoVoiceResCBModule#handleStartOfSpeechDetected", new C94730cg(fVar));
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264931a.mo60297gq(), this.f264932c.mo60297gq(), this.f264933d.mo60297gq());
    }
}
