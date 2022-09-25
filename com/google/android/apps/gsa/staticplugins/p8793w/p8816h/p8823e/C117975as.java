package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118960a;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.as */
/* compiled from: PG */
public final class C117975as implements C118960a {

    /* renamed from: a */
    public static final C59071e f327430a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.e.as");

    /* renamed from: b */
    protected static boolean f327431b;

    /* renamed from: c */
    public final C86124t f327432c;

    /* renamed from: d */
    public final C22871g f327433d;

    /* renamed from: e */
    public final C84352a f327434e;

    /* renamed from: f */
    public final C117971ao f327435f;

    /* renamed from: g */
    public final Context f327436g;

    /* renamed from: h */
    public final SharedPreferences f327437h;

    /* renamed from: i */
    public final C21370a f327438i;

    /* renamed from: j */
    public final C89859i f327439j;

    /* renamed from: k */
    protected final Query f327440k;

    /* renamed from: l */
    public final Query f327441l;

    /* renamed from: m */
    public boolean f327442m;

    /* renamed from: n */
    public volatile boolean f327443n = false;

    /* renamed from: o */
    private final C92194i f327444o;

    public C117975as(Query query, Context context, C92194i iVar, C84352a aVar, Query query2, C22871g gVar, C86124t tVar, C117971ao aoVar, SharedPreferences sharedPreferences, C21370a aVar2, C89859i iVar2) {
        this.f327436g = context;
        this.f327444o = iVar;
        this.f327440k = query;
        this.f327434e = aVar;
        this.f327441l = query2;
        this.f327433d = gVar;
        this.f327432c = tVar;
        this.f327435f = aoVar;
        this.f327437h = sharedPreferences;
        this.f327438i = aVar2;
        this.f327439j = iVar2;
    }

    /* renamed from: a */
    public final void mo91334a() {
        if (this.f327440k.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")) {
            return;
        }
        if (this.f327440k.mo84412cs()) {
            this.f327444o.mo86848d();
        } else {
            this.f327444o.mo86847c(C92207r.m151409a(this.f327440k, this.f327432c));
        }
    }

    /* renamed from: b */
    public final void mo91335b() {
        C92194i iVar = this.f327444o;
        Query query = this.f327440k;
        C86124t tVar = this.f327432c;
        if (!this.f327442m) {
            boolean a = C92207r.m151409a(query, tVar);
            if (query.mo84412cs()) {
                iVar.mo86851g();
            } else if (query.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")) {
            } else {
                if ((!query.mo84338bW() && !query.mo84403cj()) || query.mo84337bV()) {
                    iVar.mo86850f(a);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo103491c() {
        if (this.f327442m) {
            C117971ao aoVar = this.f327435f;
            C58976aa aaVar = C58975e.f156826a;
            if (!aoVar.f327425e) {
                aoVar.f327424d.mo28212l("play audio spinner", new C117968al(aoVar));
            }
            this.f327439j.mo83702b(C89849ae.VOICE_SEARCH_AUTO_AUDIO_SPINNER_PLAYED);
        }
    }
}
