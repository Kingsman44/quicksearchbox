package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85721i;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85722j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86245ca;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90525q;
import com.google.android.apps.gsa.staticplugins.p8793w.p8827i.C118082a;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.aa */
/* compiled from: PG */
public final class C117767aa extends C68247h {

    /* renamed from: a */
    private final C68283d f326853a;

    /* renamed from: c */
    private final C68283d f326854c;

    /* renamed from: d */
    private final C69464a f326855d;

    /* renamed from: e */
    private final C68283d f326856e;

    /* renamed from: f */
    private final C68283d f326857f;

    /* renamed from: g */
    private final C69464a f326858g;

    /* renamed from: h */
    private final C68283d f326859h;

    /* renamed from: i */
    private final C68283d f326860i;

    /* renamed from: j */
    private final C68283d f326861j;

    public C117767aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C68283d dVar3, C68283d dVar4, C69464a aVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C117767aa.class), aVar);
        this.f326853a = C68236af.m98549d(dVar);
        this.f326854c = C68236af.m98549d(dVar2);
        this.f326855d = aVar3;
        this.f326856e = C68236af.m98549d(dVar3);
        this.f326857f = C68236af.m98549d(dVar4);
        this.f326858g = aVar4;
        this.f326859h = C68236af.m98549d(dVar5);
        this.f326860i = C68236af.m98549d(dVar6);
        this.f326861j = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118082a aVar;
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C21370a aVar2 = (C21370a) list.get(1);
        C68214a a = C68219e.m98518a(this.f326855d);
        C58833ax axVar = (C58833ax) list.get(2);
        C89859i iVar = (C89859i) list.get(3);
        C68214a a2 = C68219e.m98518a(this.f326858g);
        C58833ax axVar2 = (C58833ax) list.get(4);
        Query query2 = (Query) list.get(5);
        C86124t tVar = (C86124t) list.get(6);
        if (axVar.mo56113h()) {
            C86246cb a3 = C86245ca.m138881a(query.mo84238A(), aVar2.mo26871c(), a, iVar, a2, tVar);
            C85722j.m137726a((C85721i) axVar.mo56107c(), a3);
            a3.mo79914ae();
            if (!axVar2.mo56113h() || !tVar.mo79746e(C90086ek.f250336bH)) {
                aVar = new C118082a(C58833ax.m90834k(a3), C60856cj.m92900i(C58836b.f156633a), C58836b.f156633a);
            } else {
                aVar = new C118082a(C58833ax.m90834k(a3), C60856cj.m92900i(C58836b.f156633a), ((C11897m) axVar2.mo56107c()).mo20280a(query2));
            }
            return C60856cj.m92900i(aVar);
        }
        throw new C90525q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326853a.mo60297gq(), this.f326854c.mo60297gq(), this.f326856e.mo60297gq(), this.f326857f.mo60297gq(), this.f326859h.mo60297gq(), this.f326860i.mo60297gq(), this.f326861j.mo60297gq());
    }
}
