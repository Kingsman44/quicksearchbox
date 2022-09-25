package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118960a;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a.p7737a.C98908a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.d */
/* compiled from: PG */
public final class C98914d implements C118960a, C98933w {

    /* renamed from: a */
    public static final C59071e f276420a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.d");

    /* renamed from: b */
    protected static boolean f276421b;

    /* renamed from: c */
    public final C86124t f276422c;

    /* renamed from: d */
    public final SharedPreferences f276423d;

    /* renamed from: e */
    public final C21370a f276424e;

    /* renamed from: f */
    public final C89859i f276425f;

    /* renamed from: g */
    protected final Query f276426g;

    /* renamed from: h */
    public volatile boolean f276427h = false;

    /* renamed from: i */
    private final C92194i f276428i;

    /* renamed from: j */
    private final C22871g f276429j;

    /* renamed from: k */
    private final C84352a f276430k;

    /* renamed from: l */
    private final Optional f276431l;

    /* renamed from: m */
    private final Context f276432m;

    /* renamed from: n */
    private final Query f276433n;

    /* renamed from: o */
    private boolean f276434o;

    public C98914d(Context context, Query query, C92194i iVar, C84352a aVar, Query query2, C22871g gVar, C86124t tVar, Optional optional, SharedPreferences sharedPreferences, C21370a aVar2, C89859i iVar2) {
        this.f276432m = context;
        this.f276428i = iVar;
        this.f276426g = query;
        this.f276430k = aVar;
        this.f276433n = query2;
        this.f276429j = gVar;
        this.f276422c = tVar;
        this.f276431l = optional;
        this.f276423d = sharedPreferences;
        this.f276424e = aVar2;
        this.f276425f = iVar2;
    }

    /* renamed from: a */
    public final void mo91334a() {
        if (this.f276426g.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")) {
            return;
        }
        if (this.f276426g.mo84412cs()) {
            this.f276428i.mo86848d();
        } else {
            this.f276428i.mo86847c(C92207r.m151409a(this.f276426g, this.f276422c));
        }
    }

    /* renamed from: b */
    public final void mo91335b() {
        C92194i iVar = this.f276428i;
        Query query = this.f276426g;
        C86124t tVar = this.f276422c;
        if (this.f276434o) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
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

    /* renamed from: c */
    public final void mo91336c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276434o && this.f276431l.isPresent()) {
            ((C98908a) this.f276431l.get()).mo91321a();
            this.f276425f.mo83702b(C89849ae.VOICE_SEARCH_AUTO_AUDIO_SPINNER_PLAYED);
        }
    }

    /* renamed from: d */
    public final void mo91337d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f276425f.mo83702b(C89849ae.VOICE_SEARCH_AUTO_LIMITED_CONNECTIVITY);
        f276421b = this.f276424e.mo26870b() > this.f276423d.getLong("CarTtsLastPlayedMs", -1) + TimeUnit.MINUTES.toMillis(this.f276422c.mo79743a(C90086ek.f250331bC));
        if (this.f276422c.mo79746e(C90086ek.f250260L) && f276421b) {
            this.f276434o = true;
            String string = this.f276432m.getString(R.string.voice_search_limited_connectivity_tts);
            this.f276427h = true;
            new C90873ag(this.f276430k.mo77887a(this.f276433n, new TtsRequest(string, false), C98907a.f276413a), this.f276429j, "Slow internet connection TTS", new C98912b(this)).mo85223a(new C98913c(this));
        } else if (this.f276422c.mo79746e(C90086ek.f250259K)) {
            this.f276434o = true;
            mo91336c();
        }
    }

    /* renamed from: e */
    public final void mo91338e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f276434o = false;
        if (this.f276422c.mo79746e(C90086ek.f250260L) && this.f276427h) {
            this.f276430k.mo77890d();
        }
        if (this.f276422c.mo79746e(C90086ek.f250259K) && this.f276431l.isPresent()) {
            ((C98908a) this.f276431l.get()).mo91322b();
        }
    }
}
