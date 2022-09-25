package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7733d.p7734a;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.d.a.a */
/* compiled from: PG */
public final class C98889a implements C98716b {

    /* renamed from: a */
    private static final C59071e f276318a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.a.d.a.a");

    /* renamed from: b */
    private static final String[] f276319b = {"INITIAL", "SPEECH_STARTED", "END_OF_SPEECH", "NO_SPEECH_DETECTED"};

    /* renamed from: c */
    private final int f276320c;

    /* renamed from: d */
    private final int f276321d;

    /* renamed from: e */
    private final C118979t f276322e;

    /* renamed from: f */
    private final Query f276323f;

    /* renamed from: g */
    private final C89859i f276324g;

    /* renamed from: h */
    private final int f276325h;

    /* renamed from: i */
    private final C58833ax f276326i;

    /* renamed from: j */
    private final u f276327j;

    /* renamed from: k */
    private long f276328k = 8640000000L;

    /* renamed from: l */
    private long f276329l = 8640000000L;

    /* renamed from: m */
    private long f276330m;

    /* renamed from: n */
    private long f276331n;

    /* renamed from: o */
    private final int f276332o;

    /* renamed from: p */
    private final C90761be f276333p;

    public C98889a(int i, int i2, C118979t tVar, C89859i iVar, Query query, C8464ag agVar, C58833ax axVar, u uVar) {
        C58838bb.m90868c(i != 0);
        this.f276320c = i;
        this.f276321d = i2;
        this.f276322e = tVar;
        this.f276324g = iVar;
        this.f276323f = query;
        this.f276326i = axVar;
        this.f276327j = uVar;
        this.f276332o = agVar != null ? agVar.f29394c : 0;
        this.f276325h = agVar != null ? agVar.f29393b : 0;
        String[] strArr = f276319b;
        SparseArray sparseArray = new SparseArray(4);
        C90760bd.m148253b(0, strArr);
        C90760bd.m148254c(0, new int[]{1}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{2}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{3}, strArr, sparseArray);
        C90760bd.m148254c(1, new int[]{2}, strArr, sparseArray);
        this.f276333p = C90760bd.m148252a(strArr, sparseArray, "PureEmbdEPEventP", false);
    }

    /* renamed from: c */
    private final void m163815c(C89849ae aeVar) {
        C89859i iVar = this.f276324g;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f276323f.f252749G));
        iVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: d */
    private final void m163816d(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f276327j.h("PureEmbdEPEventP", this.f276326i);
        C89949q.m146523g(6);
        m163815c(C89849ae.SPEECH_END_RECEIVED);
        this.f276322e.mo91306c(oVar);
    }

    /* renamed from: e */
    private final void m163817e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f276327j.g("PureEmbdEPEventP", this.f276326i, true);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 683;
        String b = C39191a.m68623b(this.f276323f.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        m163815c(C89849ae.VOICE_SEARCH_NO_SPEECH_DETECTED);
        this.f276322e.mo91309f(2);
        this.f276322e.mo91305b(2);
    }

    /* renamed from: f */
    private final synchronized void m163818f(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276333p.mo85100c(0)) {
            this.f276333p.mo85099b(3);
            m163817e();
            return;
        }
        this.f276333p.mo85099b(2);
        m163816d(oVar);
    }

    /* renamed from: g */
    private final synchronized void m163819g(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f276328k = ((long) this.f276332o) + j;
        } else {
            this.f276329l = ((long) this.f276332o) + j;
        }
        m163821i(j, z);
        m163822j(oVar);
    }

    /* renamed from: h */
    private final synchronized void m163820h(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f276328k = 8640000000L;
        } else {
            this.f276329l = 8640000000L;
        }
        m163821i(j, z);
        if (this.f276333p.mo85100c(0)) {
            m163815c(C89849ae.SPEECH_START_RECEIVED);
            this.f276322e.mo91304a(oVar);
            this.f276333p.mo85099b(1);
        } else if (this.f276333p.mo85100c(1)) {
            this.f276322e.mo91310g(this.f276330m, this.f276331n);
        }
    }

    /* renamed from: i */
    private final synchronized void m163821i(long j, boolean z) {
        if (z) {
            this.f276330m = Math.max(this.f276330m, j);
        } else {
            this.f276331n = Math.max(this.f276331n, j);
        }
    }

    /* renamed from: j */
    private final synchronized void m163822j(C90607o oVar) {
        C58838bb.m90883r(!m163823k());
        if (this.f276333p.mo85100c(0)) {
            if (Math.max(this.f276330m, this.f276331n) >= ((long) this.f276325h)) {
                this.f276333p.mo85099b(3);
                m163817e();
                return;
            }
        }
        long j = this.f276330m;
        if (j >= this.f276328k) {
            this.f276333p.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f276320c, (byte[]) null, this.f276330m);
            }
            m163816d(oVar);
            return;
        }
        long j2 = this.f276331n;
        if (j2 >= this.f276329l && j + 5000 <= j2) {
            this.f276333p.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f276321d, (byte[]) null, this.f276331n);
            }
            m163816d(oVar);
        } else if (this.f276333p.mo85100c(1)) {
            this.f276322e.mo91310g(this.f276330m, this.f276331n);
        }
    }

    /* renamed from: k */
    private final synchronized boolean m163823k() {
        if (this.f276333p.mo85100c(2)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (!this.f276333p.mo85100c(3)) {
            return false;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: l */
    private final boolean m163824l(int i) {
        if (i == this.f276320c || i == this.f276321d || i == 5) {
            return false;
        }
        C59104x d = f276318a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PureEmbdEPEventP");
        ((C59052c) ((C59052c) d).mo56372aa(31267)).mo56387q("unrecognized engine: %d", i);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo91275a(int i, C90532c cVar) {
        C67464l lVar = cVar.f253085a;
        C58976aa aaVar = C58975e.f156826a;
        if (!m163823k()) {
            if (!m163824l(i)) {
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
                                m163818f(cVar.f253086b);
                                return;
                            } else if (ordinal != 3) {
                                C59104x d = f276318a.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "PureEmbdEPEventP");
                                C59052c cVar2 = (C59052c) ((C59052c) d).mo56372aa(31255);
                                C67463k a2 = C67463k.m97475a(lVar.f183359b);
                                if (a2 == null) {
                                    a2 = C67463k.START_OF_SPEECH;
                                }
                                cVar2.mo56389s("Unrecognized EndpointerEvent type. %s", a2);
                                return;
                            }
                        }
                        if (i != this.f276320c) {
                            z = false;
                        }
                        m163819g(z, cVar.f253086b);
                        return;
                    }
                    if (i != this.f276320c) {
                        z = false;
                    }
                    m163820h(z, cVar.f253086b);
                    return;
                }
                C59104x d2 = f276318a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PureEmbdEPEventP");
                ((C59052c) ((C59052c) d2).mo56372aa(31259)).mo56386p("Received EndpointerEvent without type.");
                int i2 = C90755l.f253831a;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo91276b(int i, long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m163823k()) {
            if (!m163824l(i)) {
                m163821i(j, i == this.f276320c);
                m163822j((C90607o) null);
            }
        }
    }
}
