package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80110ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80111az;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.d */
/* compiled from: PG */
public final class C75718d implements C75155d {

    /* renamed from: a */
    public static final C58974d f210171a = C58974d.m91136j();

    /* renamed from: b */
    public final C81315k f210172b;

    /* renamed from: c */
    private final C76455a f210173c;

    /* renamed from: d */
    private final C22871g f210174d;

    /* renamed from: e */
    private final C91142g f210175e;

    public C75718d(C81315k kVar, C76455a aVar, C22871g gVar, C91142g gVar2) {
        this.f210172b = kVar;
        this.f210173c = aVar;
        this.f210174d = gVar;
        this.f210175e = gVar2;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if ((this.f210175e.mo85405j(C90037cp.f248425aF) || this.f210175e.mo85405j(C90037cp.f248408P)) && boVar.mo71470p()) {
            C22871g gVar = this.f210174d;
            C76455a aVar = this.f210173c;
            C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
            C80110ay ayVar = (C80110ay) C80111az.f219821c.createBuilder();
            ayVar.copyOnWrite();
            C80111az azVar = (C80111az) ayVar.instance;
            azVar.f219824b = ((e) boVar.mo71467m().orElse(e.a)).ca;
            azVar.f219823a |= 1;
            C80111az azVar2 = (C80111az) ayVar.build();
            kVar.copyOnWrite();
            C80136bn bnVar = (C80136bn) kVar.instance;
            azVar2.getClass();
            bnVar.f219918b = azVar2;
            bnVar.f219917a = 33;
            C80905at.m128763g(gVar.mo28209i(aVar.mo72193d((C80136bn) kVar.build(), Optional.empty()), "[NGA] BlockingOobeDataRefresher.refresh", new C75716b(this)), C75717c.f210170a);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }
}
