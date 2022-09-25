package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.p820a.p821a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12191a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12222d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12223e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12612e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13022aj;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a.a.e */
/* compiled from: PG */
public final class C12588e extends C68247h {

    /* renamed from: a */
    private final C68283d f39544a;

    /* renamed from: c */
    private final C68283d f39545c;

    public C12588e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C12588e.class), aVar);
        this.f39544a = C68236af.m98549d(dVar);
        this.f39545c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C13022aj ajVar;
        C12612e eVar = (C12612e) obj;
        C68283d dVar = this.f39545c;
        if (eVar.mo20677c().f40449a == 1) {
            C13023ak c = eVar.mo20677c();
            if (c.f40449a == 1) {
                ajVar = (C13022aj) c.f40450b;
            } else {
                ajVar = C13022aj.f40443c;
            }
            obj2 = C58833ax.m90834k(ajVar);
        } else {
            obj2 = C58836b.f156633a;
        }
        C12222d e = C12223e.m28149e();
        e.mo20485c(eVar.mo20677c());
        C12191a aVar = (C12191a) e;
        aVar.f38899a = C60856cj.m92900i(obj2);
        C60870cx gq = dVar.mo60297gq();
        if (gq != null) {
            aVar.f38900b = gq;
            e.mo20484b(eVar.mo20676b());
            return C60856cj.m92900i(e.mo20483a());
        }
        throw new NullPointerException("Null conversationDelta");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39544a.mo60297gq();
    }
}
