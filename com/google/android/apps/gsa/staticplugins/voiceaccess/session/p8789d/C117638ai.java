package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.ai */
/* compiled from: PG */
public final class C117638ai extends C68247h {

    /* renamed from: a */
    private final C68283d f326544a;

    public C117638ai(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C117638ai.class), aVar);
        this.f326544a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        C86232bo boVar = ((C117634ae) obj).f326538i;
        if (boVar != null) {
            return boVar.mo79865A();
        }
        throw new IllegalStateException("Session data contains no search result.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f326544a.mo60297gq();
    }
}