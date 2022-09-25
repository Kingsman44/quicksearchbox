package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.C86815al;
import com.google.android.apps.gsa.search.core.state.C86883ce;
import com.google.android.apps.gsa.search.core.state.C86978dd;
import com.google.android.apps.gsa.search.core.state.C86982dh;
import com.google.android.apps.gsa.search.core.state.C87023eq;
import com.google.android.apps.gsa.search.core.state.C87042fd;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.core.state.C87171z;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88477c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.a.l */
/* compiled from: PG */
public final class C107733l {

    /* renamed from: a */
    public final C87052fn f299774a;

    /* renamed from: b */
    public final C22871g f299775b;

    /* renamed from: c */
    public final C87042fd f299776c;

    /* renamed from: d */
    public final C86815al f299777d;

    /* renamed from: e */
    public final C86982dh f299778e;

    /* renamed from: f */
    public final C87023eq f299779f;

    /* renamed from: g */
    public final C86883ce f299780g;

    /* renamed from: h */
    private final C87171z f299781h;

    /* renamed from: i */
    private final C86978dd f299782i;

    public C107733l(C87052fn fnVar, C87042fd fdVar, C86982dh dhVar, C87171z zVar, C87023eq eqVar, C86883ce ceVar, C22871g gVar, C86978dd ddVar, C86815al alVar) {
        this.f299774a = fnVar;
        this.f299776c = fdVar;
        this.f299778e = dhVar;
        this.f299781h = zVar;
        this.f299779f = eqVar;
        this.f299780g = ceVar;
        this.f299775b = gVar;
        this.f299782i = ddVar;
        this.f299777d = alVar;
    }

    /* renamed from: a */
    public final Query mo96253a() {
        C22872h.m42743c(C86593a.class);
        C58976aa aaVar = C58975e.f156826a;
        return this.f299774a.f235177m;
    }

    /* renamed from: b */
    public final Query mo96254b() {
        C22872h.m42743c(C86593a.class);
        C58976aa aaVar = C58975e.f156826a;
        return this.f299774a.f235176l;
    }

    /* renamed from: c */
    public final void mo96255c() {
        C58976aa aaVar = C58975e.f156826a;
        if (C22872h.m42744d(C86593a.class)) {
            mo96256d();
        } else {
            this.f299775b.mo28212l("clear action state", new C107727f(this));
        }
    }

    /* renamed from: d */
    public final void mo96256d() {
        List i = this.f299781h.mo80810i();
        if (i != null && !i.isEmpty()) {
            C87171z zVar = this.f299781h;
            zVar.mo80772D(zVar.f235555j);
        }
    }

    /* renamed from: e */
    public final void mo96257e(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (C22872h.m42744d(C86593a.class)) {
            this.f299774a.mo80462q(query);
        } else {
            this.f299775b.mo28212l("Commit the query on the UI thread", new C107732k(this, query));
        }
    }

    /* renamed from: f */
    public final void mo96258f(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (C22872h.m42744d(C86593a.class)) {
            mo96259g(query);
        } else {
            this.f299775b.mo28212l("GlobalEventBusAccessor#logEventBusSuccess", new C107730i(this, query));
        }
    }

    /* renamed from: g */
    public final void mo96259g(Query query) {
        if (query.mo84420dA()) {
            this.f299776c.mo80667j(query, C60537to.NATIVE_VOICE_RENDERED);
        } else if (query.mo84392cY()) {
            this.f299776c.mo80667j(query, C60537to.NATIVE_TEXT_RENDERED);
        } else if (query.mo84369cB()) {
            this.f299776c.mo80667j(query, C60537to.NATIVE_SOUND_SEARCH_RENDERED);
        }
    }

    /* renamed from: h */
    public final void mo96260h(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (C22872h.m42744d(C86593a.class)) {
            this.f299779f.mo80639n(z);
        } else {
            this.f299775b.mo28212l("GlobalEventBusAccessor#updateNeedAudioForCcl", new C107731j(this, z));
        }
    }

    /* renamed from: i */
    public final void mo96261i(C88477c cVar) {
        this.f299782i.mo80620e(cVar, (Bundle) null);
    }
}
