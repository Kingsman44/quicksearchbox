package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94668b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bn */
/* compiled from: PG */
public final class C94710bn extends C68247h {

    /* renamed from: a */
    private final C68283d f264882a;

    /* renamed from: c */
    private final C68283d f264883c;

    /* renamed from: d */
    private final C68283d f264884d;

    public C94710bn(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C94710bn.class), aVar);
        this.f264882a = C68236af.m98549d(dVar);
        this.f264883c = C68236af.m98549d(dVar2);
        this.f264884d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C94668b bVar = (C94668b) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C22871g gVar = (C22871g) list.get(2);
        if (axVar.mo56113h()) {
            return gVar.mo28202b("updateErrors", new C94680ak(bVar, axVar));
        }
        C59104x c = C94692aw.f264811a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
        ((C59052c) ((C59052c) c).mo56372aa(16867)).mo56386p("actionDataOptional is absent");
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264882a.mo60297gq(), this.f264883c.mo60297gq(), this.f264884d.mo60297gq());
    }
}
