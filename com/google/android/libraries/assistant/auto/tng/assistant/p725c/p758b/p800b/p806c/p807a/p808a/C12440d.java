package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a.p808a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12175a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12177c;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.C13368a;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.a.d */
/* compiled from: PG */
public final class C12440d extends C68247h {

    /* renamed from: a */
    private final C68283d f39302a;

    public C12440d(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C12440d.class), aVar);
        this.f39302a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C13368a aVar = (C13368a) obj;
        C58976aa aaVar = C58975e.f156826a;
        C57987f fVar = new C57987f();
        if (aVar.f41116a.isPresent()) {
            C12177c cVar = new C12177c();
            cVar.mo20474b((C52081en) aVar.f41116a.get());
            cVar.f38882a = C58729pv.f156485a;
            fVar.f155056f.mo54591h(cVar.mo20473a());
            fVar.f155056f.mo54589f(false);
        } else {
            fVar.f155056f.mo54589f(false);
        }
        C12175a aVar2 = new C12175a();
        aVar2.f38878a = fVar;
        aVar2.f38879b = C58836b.f156633a;
        return C60856cj.m92900i(aVar2.mo20466a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39302a.mo60297gq();
    }
}
