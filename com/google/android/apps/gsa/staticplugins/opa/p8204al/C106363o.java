package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58833ax;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.o */
/* compiled from: PG */
public final class C106363o extends C68247h {

    /* renamed from: a */
    private final C68283d f296710a;

    /* renamed from: c */
    private final C68283d f296711c;

    public C106363o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C106363o.class), aVar);
        this.f296710a = C68236af.m98549d(dVar);
        this.f296711c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(1);
        int f = ((C92473f) list.get(0)).f258015c.mo87195f();
        if (axVar.mo56113h()) {
            f = ((C74458k) axVar.mo56107c()).mo70774a().mo87195f();
        } else {
            C59104x d = C106358j.f296704a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Greco3RecParModule_oda");
            ((C59052c) ((C59052c) d).mo56372aa(25302)).mo56386p("AudioListeningSessionAdapterOptional is not present");
            int i = C90755l.f253831a;
        }
        return C60856cj.m92900i(Integer.valueOf(f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296710a.mo60297gq(), this.f296711c.mo60297gq());
    }
}
