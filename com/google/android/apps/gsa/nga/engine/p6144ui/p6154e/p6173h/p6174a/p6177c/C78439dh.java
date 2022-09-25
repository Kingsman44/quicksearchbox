package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80762ej;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.dh */
/* compiled from: PG */
final class C78439dh extends C78394bq {

    /* renamed from: a */
    public final C78438dg f215958a;

    /* renamed from: b */
    public final C78387bj f215959b;

    /* renamed from: c */
    public final C83358h f215960c;

    /* renamed from: d */
    private final C83358h f215961d;

    /* renamed from: e */
    private final C83358h f215962e;

    /* renamed from: f */
    private final C83358h f215963f;

    /* renamed from: g */
    private final C83358h f215964g;

    /* renamed from: h */
    private final C78253d f215965h;

    /* renamed from: i */
    private final C83358h f215966i;

    public C78439dh(C78438dg dgVar, C22871g gVar, C78253d dVar, C78387bj bjVar, C83358h hVar, C83358h hVar2, C83358h hVar3, C83358h hVar4, C83358h hVar5, C81515c cVar) {
        super(gVar);
        this.f215965h = dVar;
        this.f215966i = hVar2;
        this.f215958a = dgVar;
        this.f215959b = bjVar;
        this.f215964g = hVar;
        this.f215960c = hVar4;
        this.f215961d = C83349aj.m132654i(hVar3, hVar4, hVar5, hVar, new C78434dc(dgVar, cVar));
        this.f215962e = C83349aj.m132658m(hVar3, new C78435dd(dgVar));
        this.f215963f = C83349aj.m132658m(hVar3, new C78436de(dgVar));
    }

    /* renamed from: a */
    public final C83358h mo73322a() {
        return this.f215961d;
    }

    /* renamed from: b */
    public final void mo73323b() {
        this.f215839q.mo76663c(this.f215964g, new C78429cy(this));
        if (((C80762ej) ((C83352b) this.f215966i).mo76654b()).mo74563b() || C78245d.f215382a.contains(((C78245d) this.f215960c.mo76657c()).mo73180b().mo73169a())) {
            mo73362o("[NGA] NotListeningStage.timer", this.f215965h.mo73223w(), new C78430cz(this));
        }
        if (!((C80762ej) ((C83352b) this.f215966i).mo76654b()).mo74563b()) {
            this.f215839q.mo76663c(this.f215966i, new C78432da(this));
        } else {
            this.f215839q.mo76663c(this.f215966i, new C78433db(this));
        }
    }

    /* renamed from: e */
    public final C78391bn mo73326e() {
        return this.f215958a.mo73372a();
    }

    /* renamed from: f */
    public final C83358h mo73327f() {
        return this.f215963f;
    }

    /* renamed from: g */
    public final C83358h mo73328g() {
        return this.f215962e;
    }
}
