package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86248cd;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88426ax;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88427ay;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88428az;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58022i;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.al */
/* compiled from: PG */
public final class C117641al extends C68247h {

    /* renamed from: a */
    private final C68283d f326551a;

    /* renamed from: c */
    private final C68283d f326552c;

    /* renamed from: d */
    private final C68283d f326553d;

    /* renamed from: e */
    private final C68283d f326554e;

    /* renamed from: f */
    private final C68283d f326555f;

    public C117641al(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117641al.class), aVar);
        this.f326551a = C68236af.m98549d(dVar);
        this.f326552c = C68236af.m98549d(dVar2);
        this.f326553d = C68236af.m98549d(dVar3);
        this.f326554e = C68236af.m98549d(dVar4);
        this.f326555f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58022i iVar = (C58022i) list.get(0);
        C86695q qVar = (C86695q) list.get(2);
        C86248cd cdVar = (C86248cd) list.get(3);
        C117634ae aeVar = (C117634ae) list.get(4);
        long j = ((Query) ((C58833ax) list.get(1)).mo56107c()).f252780s;
        C58976aa aaVar = C58975e.f156826a;
        C86232bo boVar = aeVar.f326538i;
        aeVar.f326538i = null;
        if (boVar != null) {
            synchronized (cdVar.f233138b) {
                cdVar.f233140d = j;
                cdVar.f233139c = boVar;
            }
            C88426ax axVar = (C88426ax) C88427ay.f239076c.createBuilder();
            axVar.copyOnWrite();
            C88427ay ayVar = (C88427ay) axVar.instance;
            ayVar.f239078a |= 1;
            ayVar.f239079b = j;
            C88427ay ayVar2 = (C88427ay) axVar.build();
            String str = true != aeVar.f326539j ? "search" : "opa";
            C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
            baVar.mo58885m(C88428az.f239080a, ayVar2);
            qVar.mo80275j(str, (C88431bb) baVar.build());
            return iVar.mo54598b(new C117636ag(aeVar));
        }
        throw new IllegalStateException("Session data contains no search result.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326551a.mo60297gq(), this.f326552c.mo60297gq(), this.f326553d.mo60297gq(), this.f326554e.mo60297gq(), this.f326555f.mo60297gq());
    }
}
