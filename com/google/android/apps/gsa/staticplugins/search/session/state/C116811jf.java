package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85423d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86380ab;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.logger.p7053c.C89880c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90115fm;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116532a;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116533b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jf */
/* compiled from: PG */
public final class C116811jf extends C116780ib {

    /* renamed from: a */
    public static final C59071e f324102a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.jf");

    /* renamed from: b */
    public final C68214a f324103b;

    /* renamed from: c */
    public final C68214a f324104c;

    /* renamed from: d */
    public final C116807jb f324105d;

    /* renamed from: e */
    public final C68214a f324106e;

    /* renamed from: f */
    public final C85423d f324107f;

    /* renamed from: g */
    public final C86124t f324108g;

    /* renamed from: h */
    public final C68214a f324109h;

    /* renamed from: i */
    public final boolean f324110i;

    /* renamed from: j */
    public Query f324111j = Query.f252741b;

    /* renamed from: k */
    public boolean f324112k;

    /* renamed from: l */
    public C85421b f324113l;

    /* renamed from: m */
    public C60870cx f324114m;

    /* renamed from: n */
    private final C68214a f324115n;

    /* renamed from: o */
    private final C68214a f324116o;

    /* renamed from: p */
    private final C68214a f324117p;

    /* renamed from: q */
    private final C68214a f324118q;

    /* renamed from: r */
    private final C116533b f324119r;

    /* renamed from: s */
    private final C85005h f324120s;

    /* renamed from: t */
    private final C85202a f324121t;

    /* renamed from: u */
    private final C68214a f324122u;

    /* renamed from: v */
    private final C22871g f324123v;

    /* renamed from: w */
    private final C22871g f324124w;

    /* renamed from: x */
    private final SharedPreferences f324125x;

    /* renamed from: y */
    private final C21370a f324126y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116811jf(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C116533b bVar, C116807jb jbVar, C85423d dVar, C85005h hVar, C85202a aVar10, C68214a aVar11, C22871g gVar, C22871g gVar2, C86124t tVar, SharedPreferences sharedPreferences, C21370a aVar12, boolean z) {
        super(aVar, 172);
        C68214a aVar13 = aVar;
        this.f324103b = aVar2;
        this.f324104c = aVar3;
        this.f324116o = aVar4;
        this.f324106e = aVar5;
        this.f324115n = aVar6;
        this.f324117p = aVar7;
        this.f324118q = aVar8;
        this.f324109h = aVar9;
        this.f324119r = bVar;
        this.f324107f = dVar;
        this.f324120s = hVar;
        this.f324121t = aVar10;
        this.f324122u = aVar11;
        this.f324123v = gVar;
        this.f324124w = gVar2;
        this.f324108g = tVar;
        this.f324105d = jbVar;
        this.f324125x = sharedPreferences;
        this.f324126y = aVar12;
        this.f324110i = z;
    }

    /* renamed from: e */
    public final void mo102953e(C60870cx cxVar) {
        C58833ax k;
        C89356b b = ((C84466a) this.f324122u.mo27525b()).mo78026b("Voice search graph", C118575h.GRAPH_VOICE_SEARCH, C118575h.WORKER_VOICE_SEARCH);
        Query query = this.f324111j;
        if (!query.mo84435dP()) {
            k = C58836b.f156633a;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            C116642cz czVar = (C116642cz) this.f324117p.mo27525b();
            PlaybackStatus playbackStatus = czVar.f323508g;
            czVar.f323508g = null;
            C116532a a = this.f324119r.mo102746a(playbackStatus);
            C85202a aVar = this.f324121t;
            C116819jn jnVar = (C116819jn) this.f324118q.mo27525b();
            jnVar.mo102960o();
            C60870cx a2 = aVar.mo78786a(b, a, jnVar.f324151N);
            if (query.mo84434dO()) {
                a2 = this.f324120s.mo78618a(new C86380ab(a2), b, this.f324105d);
            }
            k = C58833ax.m90834k(a2);
        }
        C58833ax axVar = k;
        C58976aa aaVar2 = C58975e.f156826a;
        C60870cx a3 = this.f324107f.mo78928a(this.f324111j, ((C116569ag) this.f324115n.mo27525b()).f323267a, this.f324105d, (C86498a) this.f324116o.mo27525b(), b, axVar, cxVar);
        this.f324114m = a3;
        C85421b bVar = this.f324113l;
        if (bVar != null) {
            bVar.mo78931a(C60537to.NO_LONGER_HANDLED, false);
            this.f324113l = null;
        }
        this.f324123v.mo28211k(a3, "setControllerListenableFuture", new C116810je(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("VoiceSearchState");
    }

    /* renamed from: ho */
    public final void mo80748ho() {
        if (this.f324112k) {
            this.f324112k = false;
            Query n = ((C116735gk) this.f324104c.mo27525b()).mo102901n("voicesearch");
            if (n != null) {
                C58976aa aaVar = C58975e.f156826a;
                C116808jc jcVar = new C116808jc(this, n);
                SharedPreferences.Editor edit = this.f324125x.edit();
                if (this.f324126y.mo26870b() - this.f324125x.getLong("agsa_legacy_voice_search_latest_query_timestamp_millis", 0) > Duration.ofDays(this.f324108g.mo79743a(C90115fm.f250736c)).toMillis()) {
                    edit.putInt("agsa_legacy_voice_search_queries_counter_from_active_user", 0);
                }
                edit.apply();
                this.f324111j = n;
                if (!n.mo84381cN()) {
                    C60870cx cxVar = this.f324114m;
                    if (cxVar == null || cxVar.isDone() || !this.f324114m.cancel(false)) {
                        C85421b bVar = this.f324113l;
                        if (bVar == null || bVar.mo78934d()) {
                            jcVar.run();
                            return;
                        }
                        this.f324123v.mo28211k(C90877ak.m148471e(this.f324113l.mo78931a(C89880c.m146354a(n), false), this.f324108g.mo79743a(C90120fr.f250765E), TimeUnit.MILLISECONDS, this.f324124w), "Complete previous VoiceSearch", new C116809jd(jcVar));
                        return;
                    }
                    jcVar.run();
                }
            }
        }
    }
}
