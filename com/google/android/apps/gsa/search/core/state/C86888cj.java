package com.google.android.apps.gsa.search.core.state;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.state.p6864a.C86790e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.p3096r.C39905a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cj */
/* compiled from: PG */
public final class C86888cj implements C87143ik {

    /* renamed from: a */
    private final C86887ci f234648a;

    /* renamed from: b */
    private final C86842bk f234649b;

    /* renamed from: c */
    private final C86842bk f234650c;

    public C86888cj(C86887ci ciVar, C68214a aVar, C68214a aVar2) {
        this.f234648a = ciVar;
        this.f234649b = new C86842bk(aVar);
        this.f234650c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234648a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f234649b.mo80534b(icVar);
        this.f234650c.mo80534b(icVar);
        boolean z = this.f234649b.f234552a;
        if (z || this.f234650c.f234552a) {
            C86887ci ciVar = this.f234648a;
            C86842bk bkVar = this.f234650c;
            if (z || bkVar.f234552a) {
                boolean z2 = false;
                if (((C86790e) ciVar.f234642a.mo27525b()).mo80442b()) {
                    Query query = ((C87052fn) ciVar.f234643b.mo27525b()).f235176l;
                    if (!TextUtils.equals(query.f252768g, ciVar.f234646e)) {
                        if (query.mo84392cY() && !query.f252770i.isEmpty() && C39905a.m69320a(query.f252770i) != null) {
                            z2 = true;
                        }
                        ciVar.f234645d = z2;
                        ciVar.f234646e = query.f252768g;
                    }
                    z2 = ciVar.f234645d;
                }
                if (ciVar.f234644c != z2) {
                    ciVar.f234644c = z2;
                    if (z2) {
                        ciVar.f234647f.mo78389i();
                    }
                }
            }
        }
    }
}
