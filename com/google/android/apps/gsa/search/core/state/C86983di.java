package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.di */
/* compiled from: PG */
public final class C86983di implements C87143ik {

    /* renamed from: a */
    private final C86982dh f234937a;

    /* renamed from: b */
    private final C68214a f234938b;

    public C86983di(C86982dh dhVar, C68214a aVar) {
        this.f234937a = dhVar;
        this.f234938b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234937a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C87052fn) this.f234938b.mo27525b()).f235452J)) {
            C86982dh dhVar = this.f234937a;
            Query query = ((C87052fn) this.f234938b.mo27525b()).f235177m;
            if (!dhVar.f234932c.mo79746e(C90120fr.f250793aF)) {
                return;
            }
            if ((query.mo84403cj() || query.mo84420dA()) && ((C91077d) dhVar.f234931b.mo27525b()).f254356c.mo85346a("android.permission.MEDIA_CONTENT_CONTROL") && !query.equals(Query.f252741b) && query.f252780s != dhVar.f234933d.f252780s) {
                dhVar.f234933d = query;
                dhVar.mo80622a();
            }
        }
    }
}
