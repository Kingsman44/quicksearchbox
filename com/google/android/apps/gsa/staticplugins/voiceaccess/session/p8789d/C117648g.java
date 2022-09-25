package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.g */
/* compiled from: PG */
public final class C117648g extends C68247h {

    /* renamed from: a */
    private final C68283d f326564a;

    public C117648g(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C117648g.class), aVar);
        this.f326564a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Query query;
        C117634ae aeVar = (C117634ae) obj;
        C58976aa aaVar = C58975e.f156826a;
        String str = aeVar.f326537h;
        aeVar.f326537h = null;
        if (str == null) {
            C59104x d = C117646e.f326562a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VoiceAccessOpaSearchPM");
            ((C59052c) ((C59052c) d).mo56372aa(33603)).mo56386p("Query construction requested, but no speech result is present.");
            int i = C90755l.f253831a;
            query = Query.f252741b;
        } else {
            query = Query.f252741b.mo84254Q().mo84244G(true).mo84302an("android.opa.extra.SHOULD_ADD_USER_BUBBLE", true).mo84262Z().mo84249L(str).mo84345bd().mo84275aL(aeVar.f326530a);
        }
        return C60856cj.m92900i(query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f326564a.mo60297gq();
    }
}
