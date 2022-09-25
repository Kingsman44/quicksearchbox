package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.searchbox.p6960ui.C88707h;
import com.google.android.apps.gsa.searchbox.p6960ui.C88708i;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89201f;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.e */
/* compiled from: PG */
public final class C88649e implements C88708i, C89201f, C89200e, C89203h {

    /* renamed from: a */
    public final C21370a f239677a;

    /* renamed from: b */
    public C87681ai f239678b;

    /* renamed from: c */
    C88707h f239679c;

    /* renamed from: d */
    public int f239680d = 0;

    /* renamed from: e */
    public C89205j f239681e;

    /* renamed from: f */
    final BroadcastReceiver f239682f = new C88647c(this);

    /* renamed from: g */
    final BroadcastReceiver f239683g = new C88648d(this);

    /* renamed from: h */
    private C88760ae f239684h;

    /* renamed from: i */
    private Response f239685i;

    /* renamed from: j */
    private final Context f239686j;

    public C88649e(Context context, C21370a aVar) {
        this.f239686j = context;
        this.f239677a = aVar;
    }

    /* renamed from: a */
    public final void mo82249a() {
        this.f239686j.unregisterReceiver(this.f239682f);
        this.f239686j.unregisterReceiver(this.f239683g);
    }

    /* renamed from: b */
    public final void mo82320b() {
        Response response = this.f239685i;
        if (response != null && mo82322g(response)) {
            Response response2 = this.f239685i;
            C58976aa aaVar = C58975e.f156826a;
            this.f239679c.mo82432a(new Response(response2, this.f239677a.mo26871c()));
            this.f239685i = null;
        }
    }

    /* renamed from: c */
    public final void mo44284c(Response response) {
        C89205j jVar;
        if (this.f239678b == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (mo82322g(response)) {
            this.f239679c.mo82432a(response);
            if (response.f108861a.isEmpty() && (jVar = this.f239681e) != null && response.f108864d == 1 && !response.f108868h.f142366f && response.f108867g) {
                jVar.mo83174n("cachedZeroPrefixResponse", response);
                return;
            }
            return;
        }
        this.f239685i = response;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f239679c = pVar.f239942n;
        this.f239684h = pVar.f239943o;
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: f */
    public final void mo82321f(ClientEventData clientEventData) {
        C87681ai aiVar = this.f239678b;
        if (aiVar != null) {
            aiVar.mo81937i(clientEventData);
        }
    }

    /* renamed from: g */
    public final boolean mo82322g(Response response) {
        C88760ae aeVar = this.f239684h;
        if (aeVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (aeVar.mo82499u()) {
            int i = response.f108864d;
            int i2 = this.f239680d;
            return i2 != 0 && i == i2;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        if (this.f239681e == null) {
            this.f239686j.registerReceiver(this.f239682f, new IntentFilter("com.google.android.apps.now.account_update_broadcast"));
            this.f239686j.registerReceiver(this.f239683g, new IntentFilter("preference-updated"));
        }
        this.f239681e = jVar;
    }
}
