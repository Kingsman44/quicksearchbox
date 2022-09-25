package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7749g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118895a;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119067w;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118960a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118977r;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.g.v */
/* compiled from: PG */
public final class C99166v extends C118977r {

    /* renamed from: d */
    private static final C59071e f277359d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.g.v");

    /* renamed from: a */
    final SettableFuture f277360a;

    /* renamed from: b */
    int f277361b;

    /* renamed from: c */
    int f277362c;

    /* renamed from: e */
    private final SettableFuture f277363e;

    /* renamed from: f */
    private final C68214a f277364f;

    /* renamed from: g */
    private final long f277365g;

    /* renamed from: h */
    private final C119053i f277366h;

    /* renamed from: i */
    private final boolean f277367i;

    /* renamed from: j */
    private final b f277368j;

    /* renamed from: k */
    private boolean f277369k;

    /* renamed from: l */
    private C90528t f277370l;

    /* renamed from: m */
    private boolean f277371m = false;

    /* renamed from: n */
    private boolean f277372n = false;

    public C99166v(C118960a aVar, C119067w wVar, SettableFuture settableFuture, SettableFuture settableFuture2, C68214a aVar2, Query query, boolean z, b bVar) {
        super(aVar, wVar.mo91376a(), wVar);
        this.f277360a = settableFuture;
        this.f277363e = settableFuture2;
        this.f277364f = aVar2;
        this.f277365g = query.f252749G;
        this.f277361b = 1;
        this.f277362c = 1;
        this.f277366h = wVar.mo91376a();
        this.f277367i = z;
        this.f277368j = bVar;
    }

    /* renamed from: l */
    private final void m164390l(C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f277365g));
        ((C89859i) this.f277364f.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: m */
    private final void m164391m(C118896b bVar) {
        this.f277366h.f332140a.f332136q.mo54591h(bVar);
        if (((C118895a) bVar).f331594c) {
            this.f277366h.f332140a.f332136q.mo54589f(true);
        }
    }

    /* renamed from: n */
    private final void m164392n(int i) {
        if (this.f277362c == 1) {
            if (i == 2) {
                m164390l(C89849ae.VOICE_SEARCH_EMBEDDED_DONE);
            } else {
                m164390l(C89849ae.VOICE_SEARCH_EMBEDDED_FAILED);
            }
        }
        this.f277362c = i;
    }

    /* renamed from: o */
    private final void m164393o(int i) {
        if (this.f277361b == 1) {
            if (i == 2) {
                m164390l(C89849ae.VOICE_SEARCH_NETWORK_DONE);
            } else {
                m164390l(C89849ae.VOICE_SEARCH_NETWORK_FAILED);
            }
        }
        this.f277361b = i;
    }

    /* renamed from: a */
    public final void mo91304a(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        super.mo91304a(oVar);
    }

    /* renamed from: b */
    public final void mo91305b(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277362c != 2 && i == 1) {
            m164393o(2);
            if (this.f277361b != 3) {
                this.f277368j.e = 2;
            }
            super.mo91305b(1);
        }
    }

    /* renamed from: c */
    public final void mo91306c(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277361b != 2 && oVar.f253280a == 7 && this.f277360a.mo57356n(C118826c.f331422a)) {
            C59104x b = f277359d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HybridFallbackEventM");
            ((C59052c) ((C59052c) b).mo56372aa(31564)).mo56386p("Signalled start of embedded session on end of speech");
        }
        super.mo91306c(oVar);
    }

    /* renamed from: d */
    public final void mo91307d(int i, boolean z, C90528t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i2 = this.f277362c;
        if (i2 == 1) {
            if (tVar.f253082c != 524305) {
                i2 = 1;
            } else {
                m164393o(3);
                super.mo91307d(i, z, tVar);
                return;
            }
        }
        if (i == 2) {
            m164392n(3);
            if (this.f277361b == 3) {
                super.mo91307d(1, this.f277369k, this.f277370l);
                return;
            }
            return;
        }
        if (i == 1) {
            if (i2 != 2) {
                m164393o(3);
                this.f277369k = z;
                this.f277370l = tVar;
                if (this.f277362c == 3) {
                    i = 1;
                } else if (this.f277360a.mo57356n(C118826c.f331422a)) {
                    C59104x b = f277359d.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "HybridFallbackEventM");
                    ((C59052c) ((C59052c) b).mo56372aa(31566)).mo56386p("Signalled start of embedded session on handle error");
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
        if (this.f277362c != 2 && i == 1) {
            m164393o(2);
            super.mo91308e(1, nVar);
        }
    }

    /* renamed from: f */
    public final void mo91309f(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277362c != 2) {
            if (i == 2) {
                m164392n(3);
                if (this.f277361b == 3) {
                    super.mo91307d(1, this.f277369k, this.f277370l);
                    return;
                }
                return;
            }
            if (i == 1) {
                m164393o(2);
                i = 1;
            }
            super.mo91309f(i);
        }
    }

    /* renamed from: g */
    public final void mo91310g(long j, long j2) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277361b != 2) {
            long j3 = true != this.f277367i ? 3000 : 0;
            if (j2 - j >= j3 && this.f277360a.mo57356n(C118826c.f331422a)) {
                C59104x b = f277359d.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HybridFallbackEventM");
                ((C59052c) ((C59052c) b).mo56372aa(31570)).mo56359L("Signal start of embedded session, primary progress %d, secondary %d, cutoff %d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
            }
        }
    }

    /* renamed from: h */
    public final void mo91311h(int i, Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277362c != 2) {
            if (i == 2) {
                if (this.f277361b != 2) {
                    if (boVar == null) {
                        this.f277363e.mo57356n(query);
                        return;
                    }
                    m164392n(2);
                    super.mo91312i(2, query, new C118895a(query.f252768g.toString(), BuildConfig.FLAVOR, true, query.f252754L));
                    super.mo91313j(2);
                    super.mo91311h(2, query, boVar);
                    this.f277368j.e = 3;
                    super.mo91305b(2);
                }
            } else if (i == 1) {
                m164393o(2);
                super.mo91311h(1, query, boVar);
            }
        }
    }

    /* renamed from: i */
    public final void mo91312i(int i, Query query, C118896b bVar) {
        int i2;
        if (this.f277371m || i != 2) {
            i2 = i;
        } else {
            this.f277371m = true;
            m164390l(C89849ae.VOICE_SEARCH_EMBEDDED_FIRST_RECOGNITION);
            i = 2;
            i2 = 2;
        }
        if (!this.f277372n && i == 1) {
            this.f277372n = true;
            m164390l(C89849ae.VOICE_SEARCH_NETWORK_FIRST_RECOGNITION);
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277362c != 2) {
            if (i2 == 2) {
                if (this.f277367i) {
                    C118895a aVar = (C118895a) bVar;
                    m164391m(new C118895a(aVar.f331592a, aVar.f331593b, false, aVar.f331595d));
                }
            } else if (i2 == 1) {
                C118895a aVar2 = (C118895a) bVar;
                if (aVar2.f331594c) {
                    m164393o(2);
                }
                if (!this.f277367i) {
                    super.mo91312i(1, query, bVar);
                } else if (aVar2.f331594c) {
                    m164391m(bVar);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo91313j(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277362c != 2 && i == 1) {
            super.mo91313j(1);
        }
    }

    /* renamed from: k */
    public final boolean mo91314k(int i) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f277362c != 2 && i == 1;
    }
}
