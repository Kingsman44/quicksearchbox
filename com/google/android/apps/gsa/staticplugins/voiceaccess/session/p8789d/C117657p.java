package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a.C117624e;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.p */
/* compiled from: PG */
public final class C117657p extends C68247h {

    /* renamed from: a */
    private final C68283d f326585a;

    /* renamed from: c */
    private final C68283d f326586c;

    /* renamed from: d */
    private final C68283d f326587d;

    /* renamed from: e */
    private final C68283d f326588e;

    /* renamed from: f */
    private final C68283d f326589f;

    public C117657p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117657p.class), aVar);
        this.f326585a = C68236af.m98549d(dVar);
        this.f326586c = C68236af.m98549d(dVar2);
        this.f326587d = C68236af.m98549d(dVar3);
        this.f326588e = C68236af.m98549d(dVar4);
        this.f326589f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Context context = (Context) list.get(0);
        C58022i iVar = (C58022i) list.get(1);
        C117624e eVar = (C117624e) list.get(2);
        C117634ae aeVar = (C117634ae) list.get(3);
        C68283d dVar = this.f326589f;
        C58976aa aaVar = C58975e.f156826a;
        if (!eVar.mo103416e()) {
            return iVar.mo54598b(new C117652k(eVar, context, dVar));
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326585a.mo60297gq(), this.f326586c.mo60297gq(), this.f326587d.mo60297gq(), this.f326588e.mo60297gq());
    }
}
