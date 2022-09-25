package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a.p808a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12180f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.C12479e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12693a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12833c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.a.q */
/* compiled from: PG */
public final class C12453q extends C68247h {

    /* renamed from: a */
    private final C68283d f39328a;

    /* renamed from: c */
    private final C68283d f39329c;

    /* renamed from: d */
    private final C68283d f39330d;

    /* renamed from: e */
    private final C68283d f39331e;

    public C12453q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C12453q.class), aVar);
        this.f39328a = C68236af.m98549d(dVar);
        this.f39329c = C68236af.m98549d(dVar2);
        this.f39330d = C68236af.m98549d(dVar3);
        this.f39331e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Optional optional;
        List list = (List) obj;
        Void voidR = (Void) list.get(0);
        C12833c cVar = (C12833c) list.get(1);
        Optional optional2 = (Optional) list.get(2);
        C12479e eVar = (C12479e) list.get(3);
        if (!optional2.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            optional = Optional.empty();
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            C12693a aVar = new C12693a();
            aVar.mo20732d((C12180f) optional2.get());
            aVar.mo20731c(eVar.mo20621a());
            aVar.mo20730b(eVar.mo20623c());
            optional = Optional.m71637of(cVar.mo20734a(aVar.mo20729a()));
        }
        return C60856cj.m92900i(optional);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39328a.mo60297gq(), this.f39329c.mo60297gq(), this.f39330d.mo60297gq(), this.f39331e.mo60297gq());
    }
}
