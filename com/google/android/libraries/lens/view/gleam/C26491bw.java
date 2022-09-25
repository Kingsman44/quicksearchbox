package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import com.google.android.libraries.lens.common.text.C24137m;
import com.google.android.libraries.lens.common.text.p2004a.C24125d;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2069am.C25293aa;
import com.google.android.libraries.lens.view.p2069am.C25302aj;
import com.google.android.libraries.lens.view.p2069am.C25303ak;
import com.google.android.libraries.lens.view.p2069am.C25305am;
import com.google.android.libraries.lens.view.p2069am.C25307ao;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25314av;
import com.google.android.libraries.lens.view.p2069am.C25317ay;
import com.google.android.libraries.lens.view.p2069am.C25318az;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4707j.C62475cy;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.gleam.bw */
/* compiled from: PG */
public final class C26491bw extends C26447af {

    /* renamed from: A */
    private static final C58485gu f72155A = C58485gu.m89848p(C26481bm.ACTIONABLE_TEXT, C26481bm.DINING_ITEM, C26481bm.SALIENT_TEXT);

    /* renamed from: y */
    public static final /* synthetic */ int f72156y = 0;

    /* renamed from: z */
    private static final C26595fo f72157z = new C26480bl();

    /* renamed from: B */
    private final Map f72158B = new EnumMap(C26481bm.class);

    /* renamed from: C */
    private C58528ij f72159C = C58733pz.f156496a;

    /* renamed from: D */
    private final C24125d f72160D;

    /* renamed from: E */
    private final Matrix f72161E;

    /* renamed from: F */
    private final Matrix f72162F;

    /* renamed from: G */
    private final C25989d f72163G;

    /* renamed from: H */
    private final C26483bo f72164H = new C26483bo();

    /* renamed from: I */
    private final C26482bn f72165I = new C26482bn();

    /* renamed from: g */
    final C26594fn f72166g;

    /* renamed from: t */
    public final C26478bj f72167t;

    /* renamed from: u */
    public final float f72168u;

    /* renamed from: v */
    public final float f72169v;

    /* renamed from: w */
    public boolean f72170w;

    /* renamed from: x */
    public boolean f72171x;

    static {
        C58974d.m91135i("DrawableTextGleam");
        new PointF(0.0f, 0.0f);
    }

    public C26491bw(Context context, C26553ed edVar, C21370a aVar, C25308ap apVar, int i, int i2, C26244b bVar, Matrix matrix, Matrix matrix2, C25989d dVar, boolean z, float f, float f2) {
        super(context, edVar, aVar, apVar, i, i2, bVar);
        this.f72171x = false;
        C25349y a = C25349y.m46667a(apVar.f68848i);
        C58838bb.m90868c((a == null ? C25349y.UNRECOGNIZED : a).equals(C25349y.TEXT_GLEAM));
        for (C26481bm put : C26481bm.values()) {
            this.f72158B.put(put, f72157z);
        }
        C26594fn fnVar = new C26594fn(context, bVar);
        this.f72166g = fnVar;
        this.f72168u = f;
        this.f72169v = f2;
        this.f72167t = new C26478bj(fnVar);
        this.f72161E = matrix;
        this.f72162F = matrix2;
        this.f72163G = dVar;
        this.f72170w = z;
        this.f72160D = new C24125d();
    }

    /* renamed from: P */
    private final C26595fo m48894P(C26481bm bmVar) {
        C26595fo foVar = (C26595fo) this.f72158B.get(bmVar);
        foVar.getClass();
        return foVar;
    }

    /* renamed from: Q */
    private final C58833ax m48895Q() {
        C25307ao aoVar;
        if (this.f72170w) {
            return C58836b.f156633a;
        }
        C25308ap apVar = this.f71963a;
        if (apVar.f68841b == 16) {
            aoVar = (C25307ao) apVar.f68842c;
        } else {
            aoVar = C25307ao.f68833c;
        }
        return C58833ax.m90834k(aoVar);
    }

    /* renamed from: R */
    private final void m48896R(C26481bm bmVar, C26595fo foVar) {
        if (!C58832aw.m90831a(this.f72158B.get(bmVar), foVar)) {
            this.f72158B.put(bmVar, foVar);
            this.f72159C = C58733pz.f156496a;
        }
    }

    /* renamed from: S */
    private static void m48897S(C26595fo foVar, Canvas canvas, C26493by byVar) {
        if (foVar.mo31736d().contains(byVar)) {
            foVar.mo31733c(canvas, byVar);
        }
    }

    /* renamed from: T */
    private final void m48898T() {
        C25303ak akVar;
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 12) {
            akVar = (C25303ak) apVar.f68844e;
        } else {
            akVar = C25303ak.f68821f;
        }
        int size = akVar.f68825c.size();
        float height = this.f71968f.getHeight();
        C26478bj bjVar = this.f72167t;
        if (height < bjVar.f72124a) {
            bjVar.f72126c = 2;
        } else {
            bjVar.f72126c = 3;
        }
        bjVar.f72125b = bjVar.mo31734a(height / ((float) size));
    }

    /* renamed from: A */
    public final boolean mo31671A() {
        if (((C26559ej) this.f71997h).f72382A) {
            return true;
        }
        return !mo31751N() && this.f72167t.f72126c != 2;
    }

    /* renamed from: C */
    public final Path mo31740C(Iterable iterable, boolean z) {
        float width = (float) this.f71966d.getWidth();
        float height = (float) this.f71966d.getHeight();
        this.f72165I.mo31735a();
        C58485gu i = C58485gu.m89841i(iterable);
        int i2 = 0;
        while (i2 < i.size()) {
            C24195n nVar = (C24195n) i.get(i2);
            C26594fn fnVar = this.f72166g;
            float f = (float) fnVar.f72497b;
            float f2 = f / 2.0f;
            float max = Math.max(f2, (float) fnVar.f72498c);
            float max2 = Math.max(f2, (float) this.f72166g.f72499d);
            float max3 = (!z || i2 >= i.size() + -1) ? max : ((Math.max(((C24195n) i.get(i2 + 1)).f66129a - nVar.f66131c, 0.0f) * width) / 2.0f) + f;
            if (z && i2 > 0) {
                max = ((Math.max(nVar.f66129a - ((C24195n) i.get(i2 - 1)).f66131c, 0.0f) * width) / 2.0f) + f;
            }
            RectF rectF = this.f72165I.f72137b;
            rectF.set((nVar.f66129a * width) - max, (nVar.f66130b * height) - max2, (nVar.f66131c * width) + max3, (nVar.f66132d * height) + max2);
            Path path = this.f72165I.f72139d;
            path.reset();
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            Matrix matrix = this.f72165I.f72136a;
            matrix.reset();
            matrix.postRotate(nVar.f66133e, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            this.f72165I.f72138c.op(path, Path.Op.UNION);
            i2++;
        }
        return this.f72165I.f72138c;
    }

    /* renamed from: D */
    public final C58833ax mo31741D() {
        C25293aa aaVar = this.f71963a.f68855p;
        return aaVar != null ? C58833ax.m90834k(Long.valueOf(aaVar.f68803b)) : C58836b.f156633a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C58833ax mo31742E(PointF pointF) {
        C26483bo boVar = this.f72164H;
        int i = 0;
        boVar.f72141a[0] = pointF.x;
        boVar.f72141a[1] = pointF.y;
        this.f72162F.mapPoints(this.f72164H.f72141a);
        float[] fArr = this.f72164H.f72141a;
        Point point = new Point((int) fArr[0], (int) fArr[1]);
        C58485gu guVar = f72155A;
        int i2 = ((C58724pq) guVar).f156474d;
        while (i < i2) {
            C58833ax b = m48894P((C26481bm) guVar.get(i)).mo31732b(point);
            i++;
            if (b.mo56113h()) {
                return b;
            }
        }
        C58833ax b2 = m48894P(C26481bm.PLAIN_TEXT).mo31732b(point);
        return b2.mo56113h() ? b2 : C58836b.f156633a;
    }

    /* renamed from: F */
    public final void mo31743F(Canvas canvas, C26493by byVar) {
        if (!this.f72171x) {
            canvas.save();
            canvas.concat(this.f72161E);
            mo31665m(canvas, byVar);
            canvas.restore();
        }
    }

    /* renamed from: G */
    public final void mo31744G() {
        C25303ak akVar;
        C25303ak akVar2;
        C58833ax Q = m48895Q();
        if (Q.mo56113h()) {
            C25307ao aoVar = (C25307ao) Q.mo56107c();
            C25308ap apVar = this.f71963a;
            if (apVar.f68843d == 12) {
                akVar = (C25303ak) apVar.f68844e;
            } else {
                akVar = C25303ak.f68821f;
            }
            int i = 1;
            C58838bb.m90875j(aoVar.f68836b.size() <= akVar.f68825c.size(), "Impossible text distribution: %s lines of text over %s bounding boxes", aoVar.f68836b.size(), akVar.f68825c.size());
            C26595fo P = m48894P(C26481bm.PLAIN_TEXT);
            if (P instanceof C26484bp) {
                C62219be beVar = ((C26484bp) P).f72142a;
                C62219be beVar2 = aoVar.f68835a;
                if (beVar2 == null) {
                    beVar2 = C62219be.f167986j;
                }
                if (C58832aw.m90831a(beVar, beVar2)) {
                    return;
                }
            }
            int i2 = this.f71963a.f68845f;
            C58485gu j = C58485gu.m89842j(C58597ky.m90217h(akVar.f68825c, C26470bb.f72108a));
            C62219be beVar3 = aoVar.f68835a;
            if (beVar3 == null) {
                beVar3 = C62219be.f167986j;
            }
            if ((beVar3.f167988a & 32) != 0) {
                C62219be beVar4 = aoVar.f68835a;
                if (beVar4 == null) {
                    beVar4 = C62219be.f167986j;
                }
                i = C62475cy.m94782b(beVar4.f167995h);
                if (i == 0) {
                    i = 2;
                }
            } else {
                C25308ap apVar2 = this.f71963a;
                if (apVar2.f68843d == 12) {
                    akVar2 = (C25303ak) apVar2.f68844e;
                } else {
                    akVar2 = C25303ak.f68821f;
                }
                C25302aj ajVar = akVar2.f68827e;
                if (ajVar == null) {
                    ajVar = C25302aj.f68817c;
                }
                int b = C62475cy.m94782b(ajVar.f68820b);
                if (b != 0) {
                    i = b;
                }
            }
            C24125d dVar = this.f72160D;
            C62219be beVar5 = aoVar.f68835a;
            if (beVar5 == null) {
                beVar5 = C62219be.f167986j;
            }
            C24137m a = dVar.mo29540a(i, j, beVar5, this.f71966d);
            C25293aa aaVar = this.f71963a.f68855p;
            if (aaVar == null) {
                aaVar = C25293aa.f68800c;
            }
            C26489bu buVar = new C26489bu(this, new C26599h(aaVar.f68802a, mo31740C(C58557jl.m90127h(C58557jl.m90124e(a.f65900a, C26471bc.f72109a), new C26472bd(this)), false)), this.f72166g.mo31855b(), this.f72166g.f72504i);
            C62219be beVar6 = aoVar.f68835a;
            if (beVar6 == null) {
                beVar6 = C62219be.f167986j;
            }
            m48896R(C26481bm.PLAIN_TEXT, new C26484bp(this, beVar6, a, this.f71966d, buVar));
            C58485gu guVar = f72155A;
            int i3 = ((C58724pq) guVar).f156474d;
            for (int i4 = 0; i4 < i3; i4++) {
                m48896R((C26481bm) guVar.get(i4), f72157z);
            }
        }
    }

    /* renamed from: H */
    public final void mo31745H() {
        C25303ak akVar;
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 12) {
            akVar = (C25303ak) apVar.f68844e;
        } else {
            akVar = C25303ak.f68821f;
        }
        int size = akVar.f68825c.size();
        float height = this.f71968f.getHeight();
        C26478bj bjVar = this.f72167t;
        if (bjVar.f72126c == 3) {
            C58838bb.m90868c(size > 0);
            bjVar.f72125b = bjVar.mo31734a(height / ((float) size));
        }
    }

    /* renamed from: I */
    public final void mo31746I() {
        C25303ak akVar;
        C26489bu buVar;
        C26595fo foVar = f72157z;
        for (C26481bm R : C26481bm.values()) {
            m48896R(R, foVar);
        }
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 12) {
            akVar = (C25303ak) apVar.f68844e;
        } else {
            akVar = C25303ak.f68821f;
        }
        C25293aa aaVar = this.f71963a.f68855p;
        if (aaVar == null) {
            aaVar = C25293aa.f68800c;
        }
        String str = aaVar.f68802a;
        Path C = mo31740C(C58557jl.m90127h(akVar.f68825c, C26474bf.f72112a), false);
        if (mo31751N()) {
            buVar = new C26489bu(this, new C26599h(str, C), this.f72166g.mo31855b(), this.f72166g.f72504i);
        } else {
            C26599h hVar = new C26599h(str, C);
            C26594fn fnVar = this.f72166g;
            if (fnVar.f72507l == null) {
                fnVar.f72507l = C26594fn.m49092a(fnVar.f72503h);
            }
            buVar = new C26489bu(this, hVar, fnVar.f72507l, this.f72166g.f72503h);
        }
        C25308ap apVar2 = this.f71963a;
        if (apVar2.f68843d == 12) {
            C25303ak akVar2 = (C25303ak) apVar2.f68844e;
        }
        mo31747J();
        mo31748K();
        m48896R(C26481bm.PLAIN_TEXT, buVar);
    }

    /* renamed from: J */
    public final void mo31747J() {
        C25303ak akVar;
        C26595fo foVar;
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 12) {
            akVar = (C25303ak) apVar.f68844e;
        } else {
            akVar = C25303ak.f68821f;
        }
        if (akVar.f68826d.size() > 0 && !(m48894P(C26481bm.ACTIONABLE_TEXT) instanceof C26486br)) {
            Iterable e = C58557jl.m90124e(akVar.f68826d, C26473be.f72111a);
            if (e.iterator().hasNext()) {
                foVar = new C26486br(this, e);
            } else {
                foVar = f72157z;
            }
            m48896R(C26481bm.ACTIONABLE_TEXT, foVar);
        }
    }

    /* renamed from: K */
    public final void mo31748K() {
        C25303ak akVar;
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 12) {
            akVar = (C25303ak) apVar.f68844e;
        } else {
            akVar = C25303ak.f68821f;
        }
        if (akVar.f68826d.size() > 0 && !(m48894P(C26481bm.DINING_ITEM) instanceof C26488bt)) {
            m48896R(C26481bm.DINING_ITEM, new C26488bt(this, akVar, this.f72166g.f72505j.length));
        }
    }

    /* renamed from: L */
    public final void mo31749L() {
        C25305am amVar = this.f71963a.f68854o;
        if (amVar == null) {
            amVar = C25305am.f68828d;
        }
        C25318az azVar = amVar.f68830a;
        if (azVar == null) {
            azVar = C25318az.f68885b;
        }
        this.f72161E.reset();
        this.f72162F.reset();
        C25317ay ayVar = azVar.f68887a;
        if (ayVar != null) {
            C25314av avVar = ayVar.f68881a;
            if (avVar == null) {
                avVar = C25314av.f68875c;
            }
            float width = avVar.f68877a * ((float) this.f71966d.getWidth());
            C25314av avVar2 = ayVar.f68881a;
            if (avVar2 == null) {
                avVar2 = C25314av.f68875c;
            }
            float height = avVar2.f68878b * ((float) this.f71966d.getHeight());
            C25314av avVar3 = ayVar.f68882b;
            if (avVar3 == null) {
                avVar3 = C25314av.f68875c;
            }
            float f = avVar3.f68877a;
            C25314av avVar4 = ayVar.f68881a;
            if (avVar4 == null) {
                avVar4 = C25314av.f68875c;
            }
            float width2 = (f - avVar4.f68877a) * ((float) this.f71966d.getWidth());
            C25314av avVar5 = ayVar.f68882b;
            if (avVar5 == null) {
                avVar5 = C25314av.f68875c;
            }
            float f2 = avVar5.f68878b;
            C25314av avVar6 = ayVar.f68881a;
            if (avVar6 == null) {
                avVar6 = C25314av.f68875c;
            }
            float f3 = avVar6.f68878b;
            int height2 = this.f71966d.getHeight();
            float f4 = ayVar.f68884d;
            this.f72161E.preTranslate(width2, (f2 - f3) * ((float) height2));
            this.f72161E.preRotate(ayVar.f68883c, width, height);
            this.f72161E.preScale(f4, f4, width, height);
            this.f72161E.invert(this.f72162F);
        }
    }

    /* renamed from: M */
    public final boolean mo31750M() {
        C58833ax Q = m48895Q();
        if (!Q.mo56113h()) {
            return false;
        }
        C25307ao aoVar = (C25307ao) Q.mo56107c();
        if (aoVar.f68836b.size() <= 0) {
            C62219be beVar = aoVar.f68835a;
            if (beVar == null) {
                beVar = C62219be.f167986j;
            }
            if ((beVar.f167988a & 8) == 0) {
                return false;
            }
            C62219be beVar2 = aoVar.f68835a;
            if (beVar2 == null) {
                beVar2 = C62219be.f167986j;
            }
            if (beVar2.f167993f.size() > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public final boolean mo31751N() {
        C25989d dVar = this.f72163G;
        return dVar != null && dVar.f70642a.f70649b == C25980d.TRANSLATE;
    }

    /* renamed from: O */
    public final boolean mo31752O() {
        C25303ak akVar;
        C25303ak akVar2;
        C25349y a = C25349y.m46667a(this.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (a != C25349y.TEXT_GLEAM) {
            return false;
        }
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 12) {
            akVar = (C25303ak) apVar.f68844e;
        } else {
            akVar = C25303ak.f68821f;
        }
        if (akVar.f68824b == null) {
            return false;
        }
        C25308ap apVar2 = this.f71963a;
        if (apVar2.f68843d == 12) {
            akVar2 = (C25303ak) apVar2.f68844e;
        } else {
            akVar2 = C25303ak.f68821f;
        }
        if (akVar2.f68823a == null) {
            return false;
        }
        C25305am amVar = apVar2.f68854o;
        if (amVar == null) {
            amVar = C25305am.f68828d;
        }
        return amVar.f68832c;
    }

    /* renamed from: U */
    public final float mo31663U(PointF pointF) {
        return mo31675s(mo31677u(pointF), this.f71967e);
    }

    /* renamed from: V */
    public final C26464aw mo31664V() {
        if (this.f71963a.f68843d != 12) {
            return null;
        }
        C26595fo P = m48894P(C26481bm.PLAIN_TEXT);
        if (!P.mo31731a().mo56113h()) {
            return null;
        }
        Path path = new Path((Path) P.mo31731a().mo56107c());
        path.transform(this.f72161E);
        return new C26522d(path, P.mo31737e());
    }

    /* renamed from: j */
    public final void mo31660j() {
        super.mo31660j();
        if (!mo31750M()) {
            mo31746I();
            m48898T();
        }
        mo31749L();
    }

    /* renamed from: m */
    public final void mo31665m(Canvas canvas, C26493by byVar) {
        if (this.f71963a.f68843d == 12) {
            canvas.save();
            canvas.save();
            this.f72165I.mo31735a();
            Path path = this.f72165I.f72140e;
            C58485gu guVar = f72155A;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C58833ax a = m48894P((C26481bm) guVar.get(i2)).mo31731a();
                if (a.mo56113h() && !((Path) a.mo56107c()).isEmpty()) {
                    path.op((Path) a.mo56107c(), Path.Op.UNION);
                }
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            m48897S(m48894P(C26481bm.PLAIN_TEXT), canvas, byVar);
            canvas.restore();
            C58485gu guVar2 = f72155A;
            int i3 = ((C58724pq) guVar2).f156474d;
            for (int i4 = 0; i4 < i3; i4++) {
                m48897S(m48894P((C26481bm) guVar2.get(i4)), canvas, byVar);
            }
            canvas.restore();
        }
    }

    /* renamed from: n */
    public final void mo31666n(C25308ap apVar) {
        mo31749L();
        if (mo31750M()) {
            mo31744G();
            return;
        }
        mo31745H();
        C25308ap apVar2 = this.f71963a;
        if (apVar2.f68843d == 12) {
            C25303ak akVar = (C25303ak) apVar2.f68844e;
        } else {
            C25303ak akVar2 = C25303ak.f68821f;
        }
        mo31747J();
        mo31748K();
    }

    /* renamed from: o */
    public final boolean mo31667o(PointF pointF) {
        return mo31742E(pointF).mo56113h();
    }

    /* renamed from: p */
    public final boolean mo31668p(PointF pointF) {
        return mo31742E(pointF).mo56113h();
    }

    /* renamed from: v */
    public final C58528ij mo31678v() {
        if (this.f72159C.isEmpty()) {
            C58526ih ihVar = new C58526ih();
            for (C26595fo d : this.f72158B.values()) {
                ihVar.mo55489i(d.mo31736d());
            }
            this.f72159C = ihVar.mo55486f();
        }
        return this.f72159C;
    }

    /* renamed from: y */
    public final void mo31681y(int i, int i2) {
        super.mo31681y(i, i2);
        mo31746I();
        mo31749L();
        if (mo31750M()) {
            mo31744G();
        } else {
            m48898T();
        }
    }
}
