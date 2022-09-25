package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1129f.p1130a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
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
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.f.a.f */
/* compiled from: PG */
public final class C15567f extends C68247h {

    /* renamed from: a */
    private final C68283d f46572a;

    /* renamed from: c */
    private final C68283d f46573c;

    /* renamed from: d */
    private final C68283d f46574d;

    public C15567f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C15567f.class), aVar);
        this.f46572a = C68236af.m98549d(dVar);
        this.f46573c = C68236af.m98549d(dVar2);
        this.f46574d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C15573l lVar;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C122472a aVar = (C122472a) list.get(1);
        C15481g gVar = (C15481g) list.get(2);
        if (!axVar.mo56113h() || axVar.mo56107c() == null) {
            C58976aa aaVar = C58975e.f156826a;
            C122549e a = aVar.mo105629a();
            gVar.mo22352b(C37179a.f97643eC);
            lVar = new C15573l(false, a);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            gVar.mo22352b(C37179a.f97642eB);
            lVar = new C15573l(true, (C122549e) axVar.mo56107c());
        }
        return C60856cj.m92900i(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f46572a.mo60297gq(), this.f46573c.mo60297gq(), this.f46574d.mo60297gq());
    }
}
