package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106434a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106447am;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106469j;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131091a;
import com.google.android.libraries.search.assistant.p2566g.C33421p;
import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146601i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.o */
/* compiled from: PG */
public final class C106636o implements C33421p {

    /* renamed from: a */
    private final C60887da f297288a;

    /* renamed from: b */
    private final C106434a f297289b;

    /* renamed from: c */
    private final C131091a f297290c;

    /* renamed from: d */
    private final C90021c f297291d;

    public C106636o(C106434a aVar, C131091a aVar2, C90021c cVar, C60887da daVar) {
        this.f297289b = aVar;
        this.f297290c = aVar2;
        this.f297291d = cVar;
        this.f297288a = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo38837a(AccountId accountId, C33423r rVar) {
        if (this.f297291d.mo79746e(C90017bw.f247929ar)) {
            C62940bt r3 = C62942bv.checkIsLite(C146601i.f395963b);
            rVar.mo58887l(r3);
            if (rVar.f169962ag.mo58857o(r3.f169971d)) {
                C106447am amVar = (C106447am) this.f297289b;
                C47633f i = C47633f.m84733g(amVar.mo95539h()).mo51516i(new C106469j(amVar), amVar.f296919k);
                C60870cx a = this.f297290c.mo95547a();
                return C47638k.m84751b(i, a).mo51520a(new C106631j(a, i), this.f297288a);
            }
        }
        return C47633f.m84733g(C60856cj.m92900i(C58485gu.m89845m()));
    }
}
