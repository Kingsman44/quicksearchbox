package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7731b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118895a;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119067w;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118960a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118977r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.b.aa */
/* compiled from: PG */
public final class C98833aa extends C118977r {

    /* renamed from: d */
    private static final C59071e f276124d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.a.b.aa");

    /* renamed from: a */
    final SettableFuture f276125a;

    /* renamed from: b */
    int f276126b;

    /* renamed from: c */
    int f276127c;

    /* renamed from: e */
    private final SettableFuture f276128e;

    /* renamed from: f */
    private final C68214a f276129f;

    /* renamed from: g */
    private final long f276130g;

    /* renamed from: h */
    private final C119053i f276131h;

    /* renamed from: i */
    private final b f276132i;

    /* renamed from: j */
    private final boolean f276133j;

    /* renamed from: k */
    private final C86124t f276134k;

    /* renamed from: l */
    private boolean f276135l = false;

    /* renamed from: m */
    private C58833ax f276136m = C58836b.f156633a;

    /* renamed from: n */
    private boolean f276137n = false;

    /* renamed from: o */
    private boolean f276138o = false;

    /* renamed from: p */
    private boolean f276139p = false;

    /* renamed from: q */
    private String f276140q = BuildConfig.FLAVOR;

    /* renamed from: r */
    private String f276141r = BuildConfig.FLAVOR;

    /* renamed from: s */
    private String f276142s = BuildConfig.FLAVOR;

    /* renamed from: t */
    private boolean f276143t = false;

    /* renamed from: u */
    private final SettableFuture f276144u;

    public C98833aa(C118960a aVar, C119067w wVar, SettableFuture settableFuture, SettableFuture settableFuture2, SettableFuture settableFuture3, C68214a aVar2, Query query, boolean z, b bVar, C86124t tVar) {
        super(aVar, wVar.mo91376a(), wVar);
        this.f276125a = settableFuture;
        this.f276128e = settableFuture2;
        this.f276144u = settableFuture3;
        this.f276129f = aVar2;
        this.f276130g = query.f252749G;
        this.f276126b = 1;
        this.f276127c = 1;
        this.f276131h = wVar.mo91376a();
        this.f276133j = z;
        this.f276132i = bVar;
        this.f276134k = tVar;
    }

    /* renamed from: l */
    private final void m163696l(C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f276130g));
        ((C89859i) this.f276129f.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: m */
    private final void m163697m(C118896b bVar) {
        this.f276131h.f332140a.f332136q.mo54591h(bVar);
        if (((C118895a) bVar).f331594c) {
            this.f276131h.f332140a.f332136q.mo54589f(true);
        }
    }

    /* renamed from: n */
    private static boolean m163698n(String str, String str2) {
        return !str2.toLowerCase(Locale.US).startsWith(str.toLowerCase(Locale.US));
    }

    /* renamed from: o */
    private final boolean m163699o() {
        if (this.f276134k.mo79746e(C90082eg.f249991cA) && !this.f276140q.isEmpty()) {
            return true;
        }
        if (this.f276134k.mo79746e(C90082eg.f250041cy)) {
            return m163698n(this.f276140q, this.f276142s);
        }
        if (this.f276134k.mo79746e(C90082eg.f250042cz)) {
            return m163698n(this.f276141r, this.f276142s);
        }
        return false;
    }

    /* renamed from: p */
    private final void m163700p(int i) {
        if (this.f276127c == 1) {
            if (i == 2) {
                m163696l(C89849ae.VOICE_SEARCH_EMBEDDED_DONE);
            } else {
                m163696l(C89849ae.VOICE_SEARCH_EMBEDDED_FAILED);
            }
        }
        this.f276127c = i;
    }

    /* renamed from: q */
    private final void m163701q(int i) {
        if (this.f276126b == 1) {
            if (i == 2) {
                m163696l(C89849ae.VOICE_SEARCH_NETWORK_DONE);
            } else {
                m163696l(C89849ae.VOICE_SEARCH_NETWORK_FAILED);
            }
        }
        this.f276126b = i;
    }

    /* renamed from: a */
    public final void mo91304a(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        super.mo91304a(oVar);
    }

    /* renamed from: b */
    public final void mo91305b(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276127c != 2 && i == 1) {
            m163701q(2);
            if (this.f276126b != 3) {
                this.f276132i.e = 2;
            }
            super.mo91305b(1);
        }
    }

    /* renamed from: c */
    public final void mo91306c(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276126b != 2 && oVar.f253280a == 7 && this.f276125a.mo57356n(C118826c.f331422a)) {
            C59104x b = f276124d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AnbuHybridFallback");
            ((C59052c) ((C59052c) b).mo56372aa(31177)).mo56386p("Signalled start of embedded session on end of speech");
        }
        this.f276143t = true;
        super.mo91306c(oVar);
    }

    /* renamed from: d */
    public final void mo91307d(int i, boolean z, C90528t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i2 = this.f276127c;
        if (i2 == 1) {
            if (tVar.f253082c != 524305) {
                i2 = 1;
            } else {
                m163701q(3);
                super.mo91307d(i, z, tVar);
                return;
            }
        }
        if (i == 2) {
            m163700p(3);
            if (this.f276126b == 3) {
                super.mo91307d(1, this.f276135l, tVar);
                return;
            }
            return;
        }
        if (i == 1) {
            if (i2 != 2) {
                m163701q(3);
                this.f276135l = z;
                this.f276136m = C58833ax.m90834k(tVar);
                if (this.f276127c == 3) {
                    i = 1;
                } else if (this.f276125a.mo57356n(C118826c.f331422a)) {
                    C59104x b = f276124d.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AnbuHybridFallback");
                    ((C59052c) ((C59052c) b).mo56372aa(31179)).mo56386p("Signalled start of embedded session on handle error");
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        super.mo91307d(i, z, tVar);
    }

    /* renamed from: e */
    public final void mo91308e(int i, C90606n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276127c != 2 && i == 1) {
            m163701q(2);
            super.mo91308e(1, nVar);
        }
    }

    /* renamed from: f */
    public final void mo91309f(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276127c != 2) {
            if (i == 2) {
                m163700p(3);
                if (this.f276126b == 3) {
                    super.mo91307d(1, this.f276135l, (C90528t) this.f276136m.mo56107c());
                    return;
                }
                return;
            }
            if (i == 1) {
                m163701q(2);
                i = 1;
            }
            super.mo91309f(i);
        }
    }

    /* renamed from: g */
    public final void mo91310g(long j, long j2) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276126b != 2) {
            long j3 = true != this.f276133j ? 3000 : 0;
            if (j2 - j >= j3 && this.f276125a.mo57356n(C118826c.f331422a)) {
                C59104x b = f276124d.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AnbuHybridFallback");
                ((C59052c) ((C59052c) b).mo56372aa(31183)).mo56359L("Signal start of embedded session, primary progress %d, secondary %d, cutoff %d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
            }
        }
    }

    /* renamed from: h */
    public final void mo91311h(int i, Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276127c != 2) {
            if (i == 2) {
                if (this.f276126b != 2) {
                    if (this.f276134k.mo79746e(C90082eg.f250012cV) && !this.f276143t) {
                        this.f276144u.mo57356n(C58833ax.m90834k(C118826c.f331422a));
                    }
                    if (boVar == null) {
                        this.f276128e.cancel(true);
                        return;
                    }
                    m163700p(2);
                    super.mo91312i(2, query, new C118895a(query.f252768g.toString(), BuildConfig.FLAVOR, true, query.f252754L));
                    super.mo91313j(2);
                    super.mo91311h(2, query, boVar);
                    this.f276132i.e = 3;
                    super.mo91305b(2);
                }
            } else if (i == 1) {
                m163701q(2);
                super.mo91311h(1, query, boVar);
            }
        }
    }

    /* renamed from: i */
    public final void mo91312i(int i, Query query, C118896b bVar) {
        int i2;
        if (this.f276137n || i != 2) {
            i2 = i;
        } else {
            this.f276137n = true;
            m163696l(C89849ae.VOICE_SEARCH_EMBEDDED_FIRST_RECOGNITION);
            i = 2;
            i2 = 2;
        }
        if (!this.f276138o && i == 1) {
            this.f276138o = true;
            m163696l(C89849ae.VOICE_SEARCH_NETWORK_FIRST_RECOGNITION);
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276127c != 2) {
            if (i2 == 2) {
                C118895a aVar = (C118895a) bVar;
                this.f276142s = aVar.f331592a.concat(aVar.f331593b);
                boolean z = this.f276139p;
                if (!z) {
                    z = m163699o();
                    this.f276139p = z;
                }
                if (this.f276133j && !z) {
                    m163697m(new C118895a(aVar.f331592a, aVar.f331593b, false, aVar.f331595d));
                }
            } else if (i2 == 1) {
                C118895a aVar2 = (C118895a) bVar;
                String str = aVar2.f331592a;
                this.f276140q = str.concat(aVar2.f331593b);
                this.f276141r = str;
                if (!this.f276139p) {
                    this.f276139p = m163699o();
                }
                if (aVar2.f331594c) {
                    m163701q(2);
                }
                if (this.f276139p) {
                    super.mo91312i(1, query, bVar);
                } else if (!this.f276133j) {
                    super.mo91312i(1, query, bVar);
                } else if (aVar2.f331594c) {
                    m163697m(bVar);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo91313j(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276127c != 2 && i == 1) {
            super.mo91313j(1);
        }
    }

    /* renamed from: k */
    public final boolean mo91314k(int i) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f276127c != 2 && i == 1;
    }
}
