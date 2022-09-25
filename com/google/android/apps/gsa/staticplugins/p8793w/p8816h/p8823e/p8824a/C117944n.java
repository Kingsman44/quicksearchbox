package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.n */
/* compiled from: PG */
public final class C117944n extends C68247h {

    /* renamed from: a */
    private final C68283d f327356a;

    /* renamed from: c */
    private final C68283d f327357c;

    /* renamed from: d */
    private final C68283d f327358d;

    /* renamed from: e */
    private final C68283d f327359e;

    /* renamed from: f */
    private final C68283d f327360f;

    /* renamed from: g */
    private final C68283d f327361g;

    public C117944n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C117944n.class), aVar);
        this.f327356a = C68236af.m98549d(dVar);
        this.f327357c = C68236af.m98549d(dVar2);
        this.f327358d = C68236af.m98549d(dVar3);
        this.f327359e = C68236af.m98549d(dVar4);
        this.f327360f = C68236af.m98549d(dVar5);
        this.f327361g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C68283d dVar = this.f327357c;
        C89859i iVar = (C89859i) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        Query query = (Query) list.get(4);
        if (C57940c.m88582i(cVar)) {
            if (C117940j.SKIPPED.equals(cVar.mo60292a())) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                if (axVar.mo56113h()) {
                    ((C11897m) axVar.mo56107c()).mo20284e(query);
                }
                return C118826c.f331423b;
            }
        }
        if (booleanValue) {
            return C118826c.f331423b;
        }
        C58833ax b = C57940c.m88575b(cVar);
        if (b.mo56113h()) {
            C58976aa aaVar3 = C58975e.f156826a;
            ((Throwable) b.mo56107c()).getMessage();
        }
        iVar.mo83702b(C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_OFFLINE_START);
        if (axVar.mo56113h()) {
            ((C11897m) axVar.mo56107c()).mo20285f(query);
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f327356a.mo60297gq()), this.f327358d.mo60297gq(), this.f327359e.mo60297gq(), this.f327360f.mo60297gq(), this.f327361g.mo60297gq());
    }
}
