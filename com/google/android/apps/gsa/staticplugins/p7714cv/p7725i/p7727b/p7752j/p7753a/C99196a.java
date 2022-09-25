package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7752j.p7753a;

import android.util.SparseArray;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118979t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.util.C90760bd;
import com.google.android.apps.gsa.shared.util.C90761be;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7718b.C98716b;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p395al.p408c.p414c.p416b.C8464ag;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.j.a.a */
/* compiled from: PG */
public final class C99196a implements C98716b {

    /* renamed from: a */
    private static final C59071e f277478a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.j.a.a");

    /* renamed from: b */
    private static final String[] f277479b = {"INITIAL", "SPEECH_STARTED", "END_OF_SPEECH", "NO_SPEECH_DETECTED"};

    /* renamed from: c */
    private final int f277480c;

    /* renamed from: d */
    private final int f277481d;

    /* renamed from: e */
    private final C118979t f277482e;

    /* renamed from: f */
    private final Query f277483f;

    /* renamed from: g */
    private final C89859i f277484g;

    /* renamed from: h */
    private final int f277485h;

    /* renamed from: i */
    private final C58833ax f277486i;

    /* renamed from: j */
    private final u f277487j;

    /* renamed from: k */
    private long f277488k = 8640000000L;

    /* renamed from: l */
    private long f277489l = 8640000000L;

    /* renamed from: m */
    private long f277490m;

    /* renamed from: n */
    private long f277491n;

    /* renamed from: o */
    private final int f277492o;

    /* renamed from: p */
    private final C90761be f277493p;

    public C99196a(int i, int i2, C118979t tVar, C89859i iVar, Query query, C8464ag agVar, C58833ax axVar, u uVar) {
        C58838bb.m90868c(i != 0);
        this.f277480c = i;
        this.f277481d = i2;
        this.f277482e = tVar;
        this.f277484g = iVar;
        this.f277483f = query;
        this.f277486i = axVar;
        this.f277487j = uVar;
        this.f277492o = agVar != null ? agVar.f29394c : 0;
        this.f277485h = agVar != null ? agVar.f29393b : 0;
        String[] strArr = f277479b;
        SparseArray sparseArray = new SparseArray(4);
        C90760bd.m148253b(0, strArr);
        C90760bd.m148254c(0, new int[]{1}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{2}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{3}, strArr, sparseArray);
        C90760bd.m148254c(1, new int[]{2}, strArr, sparseArray);
        this.f277493p = C90760bd.m148252a(strArr, sparseArray, "PureEmbdEPEventP", false);
    }

    /* renamed from: c */
    private final void m164467c(C89849ae aeVar) {
        C89859i iVar = this.f277484g;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f277483f.f252749G));
        iVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: d */
    private final void m164468d(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f277487j.h("PureEmbdEPEventP", this.f277486i);
        C89949q.m146523g(6);
        m164467c(C89849ae.SPEECH_END_RECEIVED);
        this.f277482e.mo91306c(oVar);
    }

    /* renamed from: e */
    private final void m164469e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f277487j.g("PureEmbdEPEventP", this.f277486i, true);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 683;
        String b = C39191a.m68623b(this.f277483f.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        m164467c(C89849ae.VOICE_SEARCH_NO_SPEECH_DETECTED);
        this.f277482e.mo91309f(2);
        this.f277482e.mo91305b(2);
    }

    /* renamed from: f */
    private final synchronized void m164470f(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f277493p.mo85100c(0)) {
            this.f277493p.mo85099b(3);
            m164469e();
            return;
        }
        this.f277493p.mo85099b(2);
        m164468d(oVar);
    }

    /* renamed from: g */
    private final synchronized void m164471g(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f277488k = ((long) this.f277492o) + j;
        } else {
            this.f277489l = ((long) this.f277492o) + j;
        }
        m164473i(j, z);
        m164474j(oVar);
    }

    /* renamed from: h */
    private final synchronized void m164472h(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f277488k = 8640000000L;
        } else {
            this.f277489l = 8640000000L;
        }
        m164473i(j, z);
        if (this.f277493p.mo85100c(0)) {
            m164467c(C89849ae.SPEECH_START_RECEIVED);
            this.f277482e.mo91304a(oVar);
            this.f277493p.mo85099b(1);
        } else if (this.f277493p.mo85100c(1)) {
            this.f277482e.mo91310g(this.f277490m, this.f277491n);
        }
    }

    /* renamed from: i */
    private final synchronized void m164473i(long j, boolean z) {
        if (z) {
            this.f277490m = Math.max(this.f277490m, j);
        } else {
            this.f277491n = Math.max(this.f277491n, j);
        }
    }

    /* renamed from: j */
    private final synchronized void m164474j(C90607o oVar) {
        C58838bb.m90883r(!m164475k());
        if (this.f277493p.mo85100c(0)) {
            if (Math.max(this.f277490m, this.f277491n) >= ((long) this.f277485h)) {
                this.f277493p.mo85099b(3);
                m164469e();
                return;
            }
        }
        long j = this.f277490m;
        if (j >= this.f277488k) {
            this.f277493p.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f277480c, (byte[]) null, this.f277490m);
            }
            m164468d(oVar);
            return;
        }
        long j2 = this.f277491n;
        if (j2 >= this.f277489l && j + 5000 <= j2) {
            this.f277493p.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f277481d, (byte[]) null, this.f277491n);
            }
            m164468d(oVar);
        } else if (this.f277493p.mo85100c(1)) {
            this.f277482e.mo91310g(this.f277490m, this.f277491n);
        }
    }

    /* renamed from: k */
    private final synchronized boolean m164475k() {
        if (this.f277493p.mo85100c(2)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (!this.f277493p.mo85100c(3)) {
            return false;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: l */
    private final boolean m164476l(int i) {
        if (i == this.f277480c || i == this.f277481d || i == 5) {
            return false;
        }
        C59104x d = f277478a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PureEmbdEPEventP");
        ((C59052c) ((C59052c) d).mo56372aa(31650)).mo56387q("unrecognized engine: %d", i);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo91275a(int i, C90532c cVar) {
        C67464l lVar = cVar.f253085a;
        C58976aa aaVar = C58975e.f156826a;
        if (!m164475k()) {
            if (!m164476l(i)) {
                boolean z = true;
                if ((lVar.f183358a & 1) != 0) {
                    C67463k kVar = C67463k.START_OF_SPEECH;
                    C67463k a = C67463k.m97475a(lVar.f183359b);
                    if (a == null) {
                        a = C67463k.START_OF_SPEECH;
                    }
                    int ordinal = a.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                m164470f(cVar.f253086b);
                                return;
                            } else if (ordinal != 3) {
                                C59104x d = f277478a.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "PureEmbdEPEventP");
                                C59052c cVar2 = (C59052c) ((C59052c) d).mo56372aa(31638);
                                C67463k a2 = C67463k.m97475a(lVar.f183359b);
                                if (a2 == null) {
                                    a2 = C67463k.START_OF_SPEECH;
                                }
                                cVar2.mo56389s("Unrecognized EndpointerEvent type. %s", a2);
                                return;
                            }
                        }
                        if (i != this.f277480c) {
                            z = false;
                        }
                        m164471g(z, cVar.f253086b);
                        return;
                    }
                    if (i != this.f277480c) {
                        z = false;
                    }
                    m164472h(z, cVar.f253086b);
                    return;
                }
                C59104x d2 = f277478a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PureEmbdEPEventP");
                ((C59052c) ((C59052c) d2).mo56372aa(31642)).mo56386p("Received EndpointerEvent without type.");
                int i2 = C90755l.f253831a;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo91276b(int i, long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m164475k()) {
            if (!m164476l(i)) {
                m164473i(j, i == this.f277480c);
                m164474j((C90607o) null);
            }
        }
    }
}
