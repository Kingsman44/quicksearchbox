package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.p8889z.p8917f.p8918a.C119072a;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p5488io.grpc.C70286co;

/* renamed from: com.google.android.apps.gsa.s3.h */
/* compiled from: PG */
public final class C84290h implements C84333v {

    /* renamed from: a */
    public static final C59071e f229383a = C59071e.m91332i("com.google.android.apps.gsa.s3.h");

    /* renamed from: b */
    public C70286co f229384b;

    /* renamed from: c */
    private final C90931ca f229385c;

    /* renamed from: d */
    private final C89012aj f229386d;

    /* renamed from: e */
    private final C68214a f229387e;

    /* renamed from: f */
    private final C119072a f229388f;

    /* renamed from: g */
    private final C58833ax f229389g;

    public C84290h(C90931ca caVar, C89012aj ajVar, C68214a aVar, C119072a aVar2, C58833ax axVar) {
        this.f229385c = caVar;
        this.f229386d = ajVar;
        this.f229387e = aVar;
        this.f229388f = aVar2;
        this.f229389g = axVar;
    }

    /* renamed from: a */
    public final void mo77826a() {
        ((C59052c) ((C59052c) f229383a.mo56224b()).mo56372aa(7158)).mo56386p("close");
        C70286co coVar = this.f229384b;
        if (coVar != null) {
            coVar.mo61974f();
        }
    }

    /* renamed from: b */
    public final void mo77827b(C84295m mVar, C92439c cVar) {
        C60870cx g = C60922j.m93044g(C84292j.m134449a((C58833ax) this.f229387e.mo27525b(), this.f229386d, this.f229388f.mo104106a(), this.f229389g), C84287e.f229374a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        this.f229385c.mo85142g(g, new C84288f(this, mVar, cVar));
    }
}
