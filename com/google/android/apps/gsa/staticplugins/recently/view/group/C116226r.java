package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.r */
/* compiled from: PG */
public final class C116226r {

    /* renamed from: a */
    public static final C59071e f322280a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.view.group.r");

    /* renamed from: b */
    public int f322281b;

    /* renamed from: c */
    public C58485gu f322282c;

    /* renamed from: d */
    public C58485gu f322283d;

    /* renamed from: e */
    public int f322284e = 0;

    /* renamed from: f */
    public int f322285f = -1;

    /* renamed from: g */
    public C116214f f322286g;

    /* renamed from: h */
    public final int f322287h;

    /* renamed from: i */
    public final float f322288i;

    /* renamed from: j */
    public final boolean f322289j;

    /* renamed from: k */
    public final C147446j f322290k;

    /* renamed from: l */
    public int f322291l;

    /* renamed from: m */
    public int f322292m;

    /* renamed from: n */
    public float f322293n;

    /* renamed from: o */
    public final C147446j f322294o;

    /* renamed from: p */
    public C147446j f322295p;

    /* renamed from: q */
    public boolean f322296q;

    /* renamed from: r */
    public C116214f f322297r;

    /* renamed from: s */
    public final C116207ad f322298s;

    /* renamed from: t */
    private final int f322299t;

    /* renamed from: u */
    private final int f322300u;

    /* renamed from: v */
    private final C147446j f322301v;

    public C116226r(int i, int i2, C58485gu guVar, int i3, int i4, float f, int i5, boolean z, boolean z2, C116207ad adVar) {
        float f2 = 0.0f;
        C147446j jVar = new C147446j(0.0f);
        jVar.f397996b = new C147454r(200.0f, 0.8f);
        this.f322290k = jVar;
        C147446j jVar2 = new C147446j(0.0f);
        jVar2.f397996b = new C147454r(200.0f, 0.8f);
        this.f322294o = jVar2;
        C147446j jVar3 = new C147446j(0.0f);
        jVar3.f397996b = new C147454r(200.0f, 0.8f);
        this.f322301v = jVar3;
        C147446j jVar4 = new C147446j(0.0f);
        jVar4.f397996b = new C147454r(200.0f, 0.8f);
        this.f322295p = jVar4;
        this.f322281b = i;
        this.f322291l = i2;
        this.f322282c = guVar;
        this.f322287h = i3;
        this.f322299t = i4;
        this.f322288i = f;
        this.f322300u = i5;
        this.f322289j = z;
        this.f322298s = adVar;
        jVar4.mo124188n(new C116222n(this));
        C116214f fVar = (C116214f) this.f322282c.get(0);
        this.f322286g = new C116214f(-1, -1, fVar.f322253b, C116223o.f322276a, fVar.f322255d);
        C116224p pVar = new C116224p(this);
        C58485gu guVar2 = this.f322282c;
        int size = guVar2.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C116214f) guVar2.get(i6)).f322257f = pVar;
        }
        this.f322290k.mo124186l(true == z2 ? 1.0f : f2);
        this.f322283d = C58485gu.m89845m();
    }

    /* renamed from: s */
    private final void m192743s(int i, int i2) {
        C58838bb.m90868c(this.f322283d.isEmpty());
        C58485gu guVar = this.f322282c;
        int size = guVar.size();
        int i3 = 0;
        while (i3 < size) {
            C116214f fVar = (C116214f) guVar.get(i3);
            i3++;
            if (!m192746v(fVar, i, i2)) {
                int i4 = fVar.f322256e;
                this.f322284e = i4;
                this.f322285f = i4;
                mo102623n();
                mo102626q(fVar, 2);
                return;
            }
        }
    }

    /* renamed from: t */
    private final void m192744t() {
        C58485gu guVar = this.f322283d;
        this.f322285f--;
        mo102623n();
        mo102617h((C116214f) guVar.get(guVar.size() - 1));
    }

    /* renamed from: u */
    private final boolean m192745u() {
        return this.f322283d.size() == this.f322282c.size();
    }

    /* renamed from: v */
    private final boolean m192746v(C116214f fVar, int i, int i2) {
        int i3 = this.f322291l + fVar.f322261j + fVar.f322262k;
        return i3 > i2 || this.f322287h + i3 < i;
    }

    /* renamed from: a */
    public final int mo102610a(int i) {
        return Math.min(i, 4) * this.f322300u;
    }

    /* renamed from: b */
    public final int mo102611b(int i) {
        return i * (this.f322287h + this.f322299t);
    }

    /* renamed from: c */
    public final int mo102612c() {
        return this.f322292m + ((int) this.f322294o.mo124175a());
    }

    /* renamed from: d */
    public final int mo102613d() {
        return (int) (((float) this.f322291l) + (this.f322293n * ((float) mo102614e())));
    }

    /* renamed from: e */
    public final int mo102614e() {
        C58485gu guVar = this.f322282c;
        C116214f fVar = (C116214f) guVar.get(guVar.size() - 1);
        return fVar.f322261j + fVar.f322262k + this.f322287h + ((int) this.f322301v.mo124175a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo102615f() {
        while (!this.f322283d.isEmpty()) {
            m192744t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo102616g(int i, int i2) {
        int i3;
        if (this.f322283d.isEmpty()) {
            m192743s(i, i2);
        }
        while (!this.f322283d.isEmpty() && m192746v((C116214f) this.f322283d.get(0), i, i2)) {
            this.f322284e++;
            mo102623n();
            mo102617h((C116214f) this.f322283d.get(0));
        }
        while (!this.f322283d.isEmpty()) {
            C58485gu guVar = this.f322283d;
            if (!m192746v((C116214f) guVar.get(guVar.size() - 1), i, i2)) {
                break;
            }
            m192744t();
        }
        if (this.f322283d.isEmpty()) {
            m192743s(i, i2);
        }
        while (true) {
            if ((this.f322284e == 0 && !this.f322283d.isEmpty()) || m192745u()) {
                break;
            }
            C58485gu guVar2 = this.f322282c;
            int i4 = this.f322284e;
            if (i4 != 0) {
                i4--;
            }
            if (m192746v((C116214f) guVar2.get(i4), i, i2)) {
                break;
            }
            int i5 = this.f322284e;
            if (i5 == 0) {
                this.f322285f++;
            } else {
                this.f322284e = i5 - 1;
            }
            mo102623n();
            C116214f fVar = (C116214f) this.f322283d.get(0);
            while (this.f322283d.size() > 5) {
                m192744t();
            }
            mo102626q(fVar, 1);
        }
        while (true) {
            if ((this.f322285f != this.f322282c.size() - 1 || this.f322283d.isEmpty()) && !m192745u() && this.f322283d.size() != 5) {
                C58485gu guVar3 = this.f322282c;
                if (this.f322285f == guVar3.size() - 1) {
                    i3 = this.f322285f;
                } else {
                    i3 = this.f322285f + 1;
                }
                if (!m192746v((C116214f) guVar3.get(i3), i, i2)) {
                    if (this.f322285f == this.f322282c.size() - 1) {
                        this.f322284e--;
                    } else {
                        this.f322285f++;
                    }
                    mo102623n();
                    C58485gu guVar4 = this.f322283d;
                    mo102626q((C116214f) guVar4.get(guVar4.size() - 1), 2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo102618i() {
        C58838bb.m90883r(this.f322283d.isEmpty());
        C116207ad adVar = this.f322298s;
        C116214f fVar = this.f322286g;
        RecentlyView recentlyView = adVar.f322245a;
        View view = fVar.f322258g;
        recentlyView.removeViewInLayout(view);
        recentlyView.invalidate();
        recentlyView.f322223k.add(view);
        this.f322286g.mo102605b((View) null);
    }

    /* renamed from: j */
    public final void mo102619j() {
        C58485gu guVar = this.f322283d;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            View view = ((C116214f) guVar.get(i)).f322258g;
            if (view != null) {
                view.invalidateOutline();
            }
        }
    }

    /* renamed from: k */
    public final void mo102620k() {
        C58485gu guVar = this.f322282c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C116214f fVar = (C116214f) guVar.get(i);
            int i2 = fVar.f322256e;
            fVar.f322259h.mo124186l((float) mo102610a(i2));
            fVar.f322260i.mo124186l((float) mo102611b(i2));
        }
        mo102624o();
        mo102623n();
        this.f322290k.mo124188n(new C116216h(this));
        this.f322294o.mo124188n(new C116217i(this));
        this.f322301v.mo124188n(new C116218j(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo102621l(int i) {
        int i2;
        int i3;
        this.f322292m = i;
        C58485gu guVar = this.f322283d;
        int size = guVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            C116214f fVar = (C116214f) guVar.get(i4);
            View view = fVar.f322258g;
            view.getClass();
            int i5 = this.f322292m;
            if (this.f322289j) {
                i3 = (-this.f322287h) - (fVar.f322261j + fVar.f322262k);
            } else {
                i3 = fVar.f322261j + fVar.f322262k;
            }
            view.offsetLeftAndRight((i5 + i3) - view.getLeft());
        }
        View view2 = this.f322286g.f322258g;
        view2.getClass();
        if (this.f322283d.isEmpty()) {
            view2.setVisibility(8);
            return;
        }
        C58485gu guVar2 = this.f322283d;
        View view3 = ((C116214f) this.f322283d.get(0)).f322258g;
        view3.getClass();
        View view4 = ((C116214f) guVar2.get(guVar2.size() - 1)).f322258g;
        view4.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        if (this.f322289j) {
            i2 = view4.getLeft() + marginLayoutParams.leftMargin;
        } else {
            i2 = (view4.getRight() - view2.getWidth()) - marginLayoutParams.rightMargin;
        }
        int bottom = view3.getBottom();
        int height = view2.getHeight();
        int i6 = marginLayoutParams.bottomMargin;
        view2.setVisibility(0);
        view2.offsetLeftAndRight(i2 - view2.getLeft());
        view2.offsetTopAndBottom(((bottom - height) - i6) - view2.getTop());
    }

    /* renamed from: m */
    public final void mo102622m(long j) {
        C58485gu guVar = this.f322282c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C116214f fVar = (C116214f) guVar.get(i);
            int i2 = fVar.f322256e;
            fVar.f322259h.mo124182h(j).mo124172b((float) mo102610a(i2));
            fVar.f322260i.mo124182h(j).mo124172b((float) mo102611b(i2));
        }
    }

    /* renamed from: n */
    public final void mo102623n() {
        this.f322283d = this.f322282c.subList(this.f322284e, this.f322285f + 1);
    }

    /* renamed from: o */
    public final void mo102624o() {
        C58485gu guVar = this.f322282c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C116214f fVar = (C116214f) guVar.get(i);
            fVar.f322263l = this.f322290k.mo124175a();
            fVar.mo102606c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo102625p(int i, int i2) {
        C58485gu guVar = this.f322282c;
        int size = guVar.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            if (!m192746v((C116214f) guVar.get(i3), i, i2)) {
                return true;
            }
            i3 = i4;
        }
        return false;
    }

    /* renamed from: q */
    public final void mo102626q(C116214f fVar, int i) {
        View s = this.f322298s.f322245a.mo102596s(this, fVar, i);
        fVar.mo102605b(s);
        s.setOutlineProvider(new C116225q(this, s));
    }

    /* renamed from: r */
    public final void mo102627r(int i, long j) {
        this.f322301v.mo124186l((float) i);
        this.f322301v.mo124182h(j).mo124172b(0.0f);
    }

    /* renamed from: h */
    public final void mo102617h(C116214f fVar) {
        RecentlyView recentlyView = this.f322298s.f322245a;
        View view = fVar.f322258g;
        view.getClass();
        recentlyView.removeViewInLayout(view);
        recentlyView.invalidate();
        recentlyView.mo102569g(fVar.f322252a).add(view);
        fVar.mo102605b((View) null);
    }
}
