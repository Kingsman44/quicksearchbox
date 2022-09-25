package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7742e.p7743a;

import android.util.SparseArray;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.util.C90760bd;
import com.google.android.apps.gsa.shared.util.C90761be;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7718b.C98716b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a.C98909aa;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.e.a.a */
/* compiled from: PG */
public final class C99036a implements C98716b {

    /* renamed from: a */
    private static final C59071e f276894a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.b.e.a.a");

    /* renamed from: b */
    private static final String[] f276895b = {"INITIAL", "SPEECH_STARTED", "END_OF_SPEECH", "NO_SPEECH_DETECTED"};

    /* renamed from: c */
    private final int f276896c;

    /* renamed from: d */
    private final int f276897d;

    /* renamed from: e */
    private final C98909aa f276898e;

    /* renamed from: f */
    private final Query f276899f;

    /* renamed from: g */
    private final C89859i f276900g;

    /* renamed from: h */
    private final int f276901h;

    /* renamed from: i */
    private final C58833ax f276902i;

    /* renamed from: j */
    private final u f276903j;

    /* renamed from: k */
    private long f276904k = 8640000000L;

    /* renamed from: l */
    private long f276905l = 8640000000L;

    /* renamed from: m */
    private long f276906m;

    /* renamed from: n */
    private long f276907n;

    /* renamed from: o */
    private final int f276908o;

    /* renamed from: p */
    private final C90761be f276909p;

    public C99036a(int i, int i2, C98909aa aaVar, C89859i iVar, Query query, C8464ag agVar, C58833ax axVar, u uVar) {
        C58838bb.m90868c(i != 0);
        this.f276896c = i;
        this.f276897d = i2;
        this.f276898e = aaVar;
        this.f276900g = iVar;
        this.f276899f = query;
        this.f276902i = axVar;
        this.f276903j = uVar;
        this.f276908o = agVar != null ? agVar.f29394c : 0;
        this.f276901h = agVar != null ? agVar.f29393b : 0;
        String[] strArr = f276895b;
        SparseArray sparseArray = new SparseArray(4);
        C90760bd.m148253b(0, strArr);
        C90760bd.m148254c(0, new int[]{1}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{2}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{3}, strArr, sparseArray);
        C90760bd.m148254c(1, new int[]{2}, strArr, sparseArray);
        this.f276909p = C90760bd.m148252a(strArr, sparseArray, "APureEmbdEPEventP", false);
    }

    /* renamed from: c */
    private final void m164145c(C89849ae aeVar) {
        C89859i iVar = this.f276900g;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f276899f.f252749G));
        iVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: d */
    private final void m164146d(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f276903j.h("APureEmbdEPEventP", this.f276902i);
        C89949q.m146523g(6);
        m164145c(C89849ae.SPEECH_END_RECEIVED);
        this.f276898e.mo91325c(oVar);
    }

    /* renamed from: e */
    private final void m164147e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f276903j.g("APureEmbdEPEventP", this.f276902i, true);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 683;
        String b = C39191a.m68623b(this.f276899f.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        m164145c(C89849ae.VOICE_SEARCH_NO_SPEECH_DETECTED);
        this.f276898e.mo91328f(2);
        this.f276898e.mo91324b(2);
    }

    /* renamed from: f */
    private final synchronized void m164148f(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276909p.mo85100c(0)) {
            this.f276909p.mo85099b(3);
            m164147e();
            return;
        }
        this.f276909p.mo85099b(2);
        m164146d(oVar);
    }

    /* renamed from: g */
    private final synchronized void m164149g(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f276904k = ((long) this.f276908o) + j;
        } else {
            this.f276905l = ((long) this.f276908o) + j;
        }
        m164151i(j, z);
        m164152j(oVar);
    }

    /* renamed from: h */
    private final synchronized void m164150h(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f276904k = 8640000000L;
        } else {
            this.f276905l = 8640000000L;
        }
        m164151i(j, z);
        if (this.f276909p.mo85100c(0)) {
            m164145c(C89849ae.SPEECH_START_RECEIVED);
            this.f276898e.mo91323a(oVar);
            this.f276909p.mo85099b(1);
        } else if (this.f276909p.mo85100c(1)) {
            this.f276898e.mo91333k();
        }
    }

    /* renamed from: i */
    private final synchronized void m164151i(long j, boolean z) {
        if (z) {
            this.f276906m = Math.max(this.f276906m, j);
        } else {
            this.f276907n = Math.max(this.f276907n, j);
        }
    }

    /* renamed from: j */
    private final synchronized void m164152j(C90607o oVar) {
        C58838bb.m90883r(!m164153k());
        if (this.f276909p.mo85100c(0)) {
            if (Math.max(this.f276906m, this.f276907n) >= ((long) this.f276901h)) {
                this.f276909p.mo85099b(3);
                m164147e();
                return;
            }
        }
        long j = this.f276906m;
        if (j >= this.f276904k) {
            this.f276909p.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f276896c, (byte[]) null, this.f276906m);
            }
            m164146d(oVar);
            return;
        }
        long j2 = this.f276907n;
        if (j2 >= this.f276905l && j + 5000 <= j2) {
            this.f276909p.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f276897d, (byte[]) null, this.f276907n);
            }
            m164146d(oVar);
        } else if (this.f276909p.mo85100c(1)) {
            this.f276898e.mo91333k();
        }
    }

    /* renamed from: k */
    private final synchronized boolean m164153k() {
        if (this.f276909p.mo85100c(2)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (!this.f276909p.mo85100c(3)) {
            return false;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: l */
    private final boolean m164154l(int i) {
        if (i == this.f276896c || i == this.f276897d || i == 5) {
            return false;
        }
        C59104x d = f276894a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "APureEmbdEPEventP");
        ((C59052c) ((C59052c) d).mo56372aa(31472)).mo56387q("unrecognized engine: %d", i);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo91275a(int i, C90532c cVar) {
        C67464l lVar = cVar.f253085a;
        C58976aa aaVar = C58975e.f156826a;
        if (!m164153k()) {
            if (!m164154l(i)) {
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
                                m164148f(cVar.f253086b);
                                return;
                            } else if (ordinal != 3) {
                                C59104x d = f276894a.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "APureEmbdEPEventP");
                                C59052c cVar2 = (C59052c) ((C59052c) d).mo56372aa(31460);
                                C67463k a2 = C67463k.m97475a(lVar.f183359b);
                                if (a2 == null) {
                                    a2 = C67463k.START_OF_SPEECH;
                                }
                                cVar2.mo56389s("Unrecognized EndpointerEvent type. %s", a2);
                                return;
                            }
                        }
                        if (i != this.f276896c) {
                            z = false;
                        }
                        m164149g(z, cVar.f253086b);
                        return;
                    }
                    if (i != this.f276896c) {
                        z = false;
                    }
                    m164150h(z, cVar.f253086b);
                    return;
                }
                C59104x d2 = f276894a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "APureEmbdEPEventP");
                ((C59052c) ((C59052c) d2).mo56372aa(31464)).mo56386p("Received EndpointerEvent without type.");
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo91276b(int i, long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m164153k()) {
            if (!m164154l(i)) {
                m164151i(j, i == this.f276896c);
                m164152j((C90607o) null);
            }
        }
    }
}
