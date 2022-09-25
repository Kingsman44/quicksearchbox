package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113323t;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.p4553a.C59527cx;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.e */
/* compiled from: PG */
public final class C113386e extends C113414ey {

    /* renamed from: A */
    private Optional f313941A = Optional.empty();

    /* renamed from: B */
    private C41679e f313942B;

    /* renamed from: C */
    private OptionalInt f313943C = OptionalInt.empty();

    /* renamed from: D */
    private Optional f313944D = Optional.empty();

    /* renamed from: E */
    private Optional f313945E = Optional.empty();

    /* renamed from: F */
    private Optional f313946F = Optional.empty();

    /* renamed from: G */
    private Optional f313947G = Optional.empty();

    /* renamed from: H */
    private Optional f313948H = Optional.empty();

    /* renamed from: I */
    private C59527cx f313949I;

    /* renamed from: J */
    private C113397eh f313950J;

    /* renamed from: K */
    private float f313951K;

    /* renamed from: L */
    private byte f313952L;

    /* renamed from: a */
    public String f313953a;

    /* renamed from: b */
    public Optional f313954b = Optional.empty();

    /* renamed from: c */
    public Optional f313955c = Optional.empty();

    /* renamed from: d */
    public Optional f313956d = Optional.empty();

    /* renamed from: e */
    public Optional f313957e = Optional.empty();

    /* renamed from: f */
    public Optional f313958f = Optional.empty();

    /* renamed from: g */
    public Optional f313959g = Optional.empty();

    /* renamed from: h */
    public Optional f313960h = Optional.empty();

    /* renamed from: i */
    public Optional f313961i = Optional.empty();

    /* renamed from: j */
    public Optional f313962j = Optional.empty();

    /* renamed from: k */
    public C58495hd f313963k;

    /* renamed from: l */
    public Optional f313964l = Optional.empty();

    /* renamed from: m */
    public Optional f313965m = Optional.empty();

    /* renamed from: n */
    public Optional f313966n = Optional.empty();

    /* renamed from: o */
    public Optional f313967o = Optional.empty();

    /* renamed from: p */
    public C58485gu f313968p;

    /* renamed from: q */
    public Optional f313969q = Optional.empty();

    /* renamed from: r */
    public Optional f313970r = Optional.empty();

    /* renamed from: s */
    public Optional f313971s = Optional.empty();

    /* renamed from: t */
    private int f313972t;

    /* renamed from: u */
    private C48580an f313973u;

    /* renamed from: v */
    private int f313974v;

    /* renamed from: w */
    private int f313975w;

    /* renamed from: x */
    private double f313976x;

    /* renamed from: y */
    private double f313977y;

    /* renamed from: z */
    private C48672ag f313978z;

    public C113386e() {
    }

    /* renamed from: a */
    public final C113415ez mo100156a() {
        if (this.f313952L != 63 || this.f313953a == null || this.f313973u == null || this.f313978z == null || this.f313942B == null || this.f313963k == null || this.f313949I == null || this.f313950J == null || this.f313968p == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f313953a == null) {
                sb.append(" displayText");
            }
            if ((this.f313952L & 1) == 0) {
                sb.append(" type");
            }
            if (this.f313973u == null) {
                sb.append(" suggestionType");
            }
            if ((this.f313952L & 2) == 0) {
                sb.append(" subtype");
            }
            if ((this.f313952L & 4) == 0) {
                sb.append(" group");
            }
            if ((this.f313952L & 8) == 0) {
                sb.append(" currentScore");
            }
            if ((this.f313952L & 16) == 0) {
                sb.append(" sourceScore");
            }
            if (this.f313978z == null) {
                sb.append(" sourceType");
            }
            if (this.f313942B == null) {
                sb.append(" clientParameters");
            }
            if (this.f313963k == null) {
                sb.append(" similarityKeysByType");
            }
            if (this.f313949I == null) {
                sb.append(" clientLog");
            }
            if (this.f313950J == null) {
                sb.append(" features");
            }
            if (this.f313968p == null) {
                sb.append(" primaryIconCandidates");
            }
            if ((this.f313952L & 32) == 0) {
                sb.append(" cortexScoreAdjustment");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C113277bb bbVar = r2;
        C113277bb bbVar2 = new C113277bb(this.f313953a, this.f313972t, this.f313973u, this.f313974v, this.f313975w, this.f313976x, this.f313977y, this.f313978z, this.f313941A, this.f313942B, this.f313954b, this.f313955c, this.f313943C, this.f313956d, this.f313944D, this.f313957e, this.f313958f, this.f313959g, this.f313960h, this.f313961i, this.f313962j, this.f313945E, this.f313963k, this.f313946F, this.f313947G, this.f313964l, this.f313948H, this.f313965m, this.f313949I, this.f313950J, this.f313966n, this.f313967o, this.f313968p, this.f313969q, this.f313970r, this.f313951K, this.f313971s);
        return bbVar;
    }

    /* renamed from: b */
    public final void mo100157b(C113323t tVar) {
        this.f313946F = Optional.m71637of(tVar);
    }

    /* renamed from: c */
    public final void mo100158c(C113496i iVar) {
        this.f313961i = Optional.m71637of(iVar);
    }

    /* renamed from: d */
    public final void mo100159d(C113502n nVar) {
        this.f313962j = Optional.m71637of(nVar);
    }

    /* renamed from: e */
    public final void mo100160e(C59527cx cxVar) {
        if (cxVar != null) {
            this.f313949I = cxVar;
            return;
        }
        throw new NullPointerException("Null clientLog");
    }

    /* renamed from: f */
    public final void mo100161f(C41679e eVar) {
        if (eVar != null) {
            this.f313942B = eVar;
            return;
        }
        throw new NullPointerException("Null clientParameters");
    }

    /* renamed from: g */
    public final void mo100162g(float f) {
        this.f313951K = f;
        this.f313952L = (byte) (this.f313952L | 32);
    }

    /* renamed from: h */
    public final void mo100163h(double d) {
        this.f313976x = d;
        this.f313952L = (byte) (this.f313952L | 8);
    }

    /* renamed from: i */
    public final void mo100164i(String str) {
        if (str != null) {
            this.f313953a = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    /* renamed from: j */
    public final void mo100165j(C48672ag agVar) {
        this.f313941A = Optional.m71637of(agVar);
    }

    /* renamed from: k */
    public final void mo100166k(C113397eh ehVar) {
        if (ehVar != null) {
            this.f313950J = ehVar;
            return;
        }
        throw new NullPointerException("Null features");
    }

    /* renamed from: l */
    public final void mo100167l(int i) {
        this.f313975w = i;
        this.f313952L = (byte) (this.f313952L | 4);
    }

    /* renamed from: m */
    public final void mo100168m(C113284bi biVar) {
        this.f313957e = Optional.m71637of(biVar);
    }

    /* renamed from: n */
    public final void mo100169n(C54813af afVar) {
        this.f313966n = Optional.m71637of(afVar);
    }

    /* renamed from: o */
    public final void mo100170o(int i) {
        this.f313943C = OptionalInt.m71640of(i);
    }

    /* renamed from: p */
    public final void mo100171p(C113341cl... clVarArr) {
        this.f313968p = C58485gu.m89844l(clVarArr);
    }

    /* renamed from: q */
    public final void mo100172q(C113300by byVar) {
        this.f313967o = Optional.m71637of(byVar);
    }

    /* renamed from: r */
    public final void mo100173r(C58495hd hdVar) {
        this.f313963k = hdVar;
    }

    /* renamed from: s */
    public final void mo100174s(double d) {
        this.f313977y = d;
        this.f313952L = (byte) (this.f313952L | 16);
    }

    /* renamed from: t */
    public final void mo100175t(C48672ag agVar) {
        if (agVar != null) {
            this.f313978z = agVar;
            return;
        }
        throw new NullPointerException("Null sourceType");
    }

    /* renamed from: u */
    public final void mo100176u(int i) {
        this.f313974v = i;
        this.f313952L = (byte) (this.f313952L | 2);
    }

    /* renamed from: v */
    public final void mo100177v(C48580an anVar) {
        if (anVar != null) {
            this.f313973u = anVar;
            return;
        }
        throw new NullPointerException("Null suggestionType");
    }

    /* renamed from: w */
    public final void mo100178w(C48578al alVar) {
        this.f313956d = Optional.m71637of(alVar);
    }

    /* renamed from: x */
    public final void mo100179x(C113421fb fbVar) {
        this.f313958f = Optional.m71637of(fbVar);
    }

    /* renamed from: y */
    public final void mo100180y(int i) {
        this.f313972t = i;
        this.f313952L = (byte) (this.f313952L | 1);
    }

    public C113386e(C113415ez ezVar) {
        this.f313953a = ezVar.mo100199L();
        this.f313972t = ezVar.mo100206f();
        this.f313973u = ezVar.mo100210j();
        this.f313974v = ezVar.mo100205e();
        this.f313975w = ezVar.mo100204d();
        this.f313976x = ezVar.mo100201a();
        this.f313977y = ezVar.mo100202b();
        this.f313978z = ezVar.mo100211k();
        this.f313941A = ezVar.mo100222v();
        this.f313942B = ezVar.mo100209i();
        this.f313954b = ezVar.mo100226z();
        this.f313955c = ezVar.mo100191D();
        this.f313943C = ezVar.mo100198K();
        this.f313956d = ezVar.mo100195H();
        this.f313944D = ezVar.mo100189B();
        this.f313957e = ezVar.mo100224x();
        this.f313958f = ezVar.mo100196I();
        this.f313959g = ezVar.mo100223w();
        this.f313960h = ezVar.mo100190C();
        this.f313961i = ezVar.mo100216p();
        this.f313962j = ezVar.mo100218r();
        this.f313945E = ezVar.mo100193F();
        this.f313963k = ezVar.mo100213m();
        this.f313946F = ezVar.mo100215o();
        this.f313947G = ezVar.mo100220t();
        this.f313964l = ezVar.mo100197J();
        this.f313948H = ezVar.mo100194G();
        this.f313965m = ezVar.mo100217q();
        this.f313949I = ezVar.mo100214n();
        this.f313950J = ezVar.mo100207g();
        this.f313966n = ezVar.mo100225y();
        this.f313967o = ezVar.mo100188A();
        this.f313968p = ezVar.mo100212l();
        this.f313969q = ezVar.mo100192E();
        this.f313970r = ezVar.mo100219s();
        this.f313951K = ezVar.mo100203c();
        this.f313971s = ezVar.mo100221u();
        this.f313952L = 63;
    }
}
