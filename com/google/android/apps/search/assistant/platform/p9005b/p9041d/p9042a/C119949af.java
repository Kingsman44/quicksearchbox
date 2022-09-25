package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119875dp;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119876dq;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C120015c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.af */
/* compiled from: PG */
public final class C119949af implements C120015c {

    /* renamed from: a */
    private final C119789ak f334037a;

    /* renamed from: b */
    private final C119985bl f334038b;

    /* renamed from: c */
    private final C58528ij f334039c;

    public C119949af(C119981bh bhVar, C119985bl blVar) {
        C119789ak akVar = ((C119990d) bhVar).f334111a;
        this.f334037a = akVar;
        this.f334038b = blVar;
        this.f334039c = C58528ij.m90006F(akVar.f333659b);
    }

    /* renamed from: a */
    public final C58485gu mo104584a() {
        return C58485gu.m89842j(this.f334037a.f333659b);
    }

    /* renamed from: b */
    public final C60870cx mo104585b(C32796ar arVar) {
        if (!Collection.EL.stream(this.f334039c).filter(C119945ab.f334034a).anyMatch(new C119946ac(arVar))) {
            return C60856cj.m92899h(new C119948ae(arVar));
        }
        C119985bl blVar = this.f334038b;
        C119875dp dpVar = (C119875dp) C119876dq.f333846c.createBuilder();
        dpVar.copyOnWrite();
        C119876dq dqVar = (C119876dq) dpVar.instance;
        arVar.getClass();
        dqVar.f333850b = arVar;
        dqVar.f333849a = 1;
        C60870cx a = blVar.f334101a.mo38119a((C119876dq) dpVar.build());
        C119947ad adVar = C119947ad.f334036a;
        return C60922j.m93044g(a, C47810es.m84963c(adVar), C60826bg.f164896a);
    }
}
