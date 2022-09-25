package com.google.android.apps.gsa.staticplugins.p7714cv.p7718b;

import android.util.SparseArray;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.util.C90760bd;
import com.google.android.apps.gsa.shared.util.C90761be;
import com.google.android.apps.gsa.speech.p7294j.C92435e;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8464ag;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.b.a */
/* compiled from: PG */
public final class C98715a implements C98716b {

    /* renamed from: a */
    private static final C59071e f275720a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.b.a");

    /* renamed from: b */
    private static final String[] f275721b = {"INITIAL", "SPEECH_STARTED", "END_OF_SPEECH", "NO_SPEECH_DETECTED"};

    /* renamed from: c */
    private final int f275722c;

    /* renamed from: d */
    private final int f275723d;

    /* renamed from: e */
    private final long f275724e;

    /* renamed from: f */
    private final C92435e f275725f;

    /* renamed from: g */
    private final int f275726g;

    /* renamed from: h */
    private long f275727h = 8640000000L;

    /* renamed from: i */
    private long f275728i = 8640000000L;

    /* renamed from: j */
    private long f275729j;

    /* renamed from: k */
    private long f275730k;

    /* renamed from: l */
    private final int f275731l;

    /* renamed from: m */
    private final C90761be f275732m;

    public C98715a(int i, int i2, C92435e eVar, C8464ag agVar, C90021c cVar) {
        C58838bb.m90868c(i != 0);
        this.f275722c = i;
        this.f275723d = i2;
        eVar.getClass();
        this.f275725f = eVar;
        this.f275724e = cVar.mo79743a(C90082eg.f250013cW);
        this.f275731l = agVar != null ? agVar.f29394c : 0;
        this.f275726g = agVar != null ? agVar.f29393b : 0;
        String[] strArr = f275721b;
        SparseArray sparseArray = new SparseArray(4);
        C90760bd.m148253b(0, strArr);
        C90760bd.m148254c(0, new int[]{1}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{2}, strArr, sparseArray);
        C90760bd.m148254c(0, new int[]{3}, strArr, sparseArray);
        C90760bd.m148254c(1, new int[]{2}, strArr, sparseArray);
        this.f275732m = C90760bd.m148252a(strArr, sparseArray, "DefaultEndpointerEventP", false);
    }

    /* renamed from: c */
    private final synchronized void m163504c(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f275732m.mo85100c(0)) {
            this.f275732m.mo85099b(3);
            this.f275725f.mo87109o();
            return;
        }
        this.f275732m.mo85099b(2);
        this.f275725f.mo87105k(oVar);
    }

    /* renamed from: d */
    private final synchronized void m163505d(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f275727h = ((long) this.f275731l) + j;
        } else {
            this.f275728i = ((long) this.f275731l) + j;
        }
        m163507f(j, z);
        m163508g(oVar);
    }

    /* renamed from: e */
    private final synchronized void m163506e(boolean z, C90607o oVar) {
        long j = oVar.f253281b;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f275727h = 8640000000L;
        } else {
            this.f275728i = 8640000000L;
        }
        m163507f(j, z);
        if (this.f275732m.mo85100c(0)) {
            this.f275725f.mo87101g(oVar);
            this.f275732m.mo85099b(1);
        } else if (this.f275732m.mo85100c(1)) {
            this.f275725f.mo87111q(this.f275729j, this.f275730k);
        }
    }

    /* renamed from: f */
    private final synchronized void m163507f(long j, boolean z) {
        if (z) {
            this.f275729j = Math.max(this.f275729j, j);
        } else {
            this.f275730k = Math.max(this.f275730k, j);
        }
    }

    /* renamed from: g */
    private final synchronized void m163508g(C90607o oVar) {
        C58838bb.m90883r(!m163509h());
        if (this.f275732m.mo85100c(0)) {
            if (Math.max(this.f275729j, this.f275730k) >= ((long) this.f275726g)) {
                this.f275732m.mo85099b(3);
                this.f275725f.mo87109o();
                return;
            }
        }
        long j = this.f275729j;
        if (j >= this.f275727h) {
            this.f275732m.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f275722c, (byte[]) null, this.f275729j);
            }
            this.f275725f.mo87105k(oVar);
            return;
        }
        long j2 = this.f275730k;
        if (j2 >= this.f275728i && j + this.f275724e <= j2) {
            this.f275732m.mo85099b(2);
            if (oVar == null) {
                oVar = new C90607o(this.f275723d, (byte[]) null, this.f275730k);
            }
            this.f275725f.mo87105k(oVar);
        } else if (this.f275732m.mo85100c(1)) {
            this.f275725f.mo87111q(this.f275729j, this.f275730k);
        }
    }

    /* renamed from: h */
    private final synchronized boolean m163509h() {
        if (this.f275732m.mo85100c(2)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (!this.f275732m.mo85100c(3)) {
            return false;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: i */
    private final boolean m163510i(int i) {
        if (i == this.f275722c || i == this.f275723d || i == 5) {
            return false;
        }
        C59104x d = f275720a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DefaultEndpointerEventP");
        ((C59052c) ((C59052c) d).mo56372aa(30999)).mo56387q("unrecognized engine: %d", i);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo91275a(int i, C90532c cVar) {
        C67464l lVar = cVar.f253085a;
        C58976aa aaVar = C58975e.f156826a;
        if (!m163509h()) {
            if (!m163510i(i)) {
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
                                m163504c(cVar.f253086b);
                                return;
                            } else if (ordinal != 3) {
                                C59104x d = f275720a.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "DefaultEndpointerEventP");
                                C59052c cVar2 = (C59052c) ((C59052c) d).mo56372aa(30987);
                                C67463k a2 = C67463k.m97475a(lVar.f183359b);
                                if (a2 == null) {
                                    a2 = C67463k.START_OF_SPEECH;
                                }
                                cVar2.mo56389s("Unrecognized EndpointerEvent type. %s", a2);
                                return;
                            }
                        }
                        if (i != this.f275722c) {
                            z = false;
                        }
                        m163505d(z, cVar.f253086b);
                        return;
                    }
                    if (i != this.f275722c) {
                        z = false;
                    }
                    m163506e(z, cVar.f253086b);
                    return;
                }
                C59104x d2 = f275720a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "DefaultEndpointerEventP");
                ((C59052c) ((C59052c) d2).mo56372aa(30991)).mo56386p("Received EndpointerEvent without type.");
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo91276b(int i, long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m163509h()) {
            if (!m163510i(i)) {
                m163507f(j, i == this.f275722c);
                m163508g((C90607o) null);
            }
        }
    }
}
