package com.google.android.apps.gsa.staticplugins.recently.p8678a;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116204aa;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116205ab;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116208ae;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116215g;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116219k;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116221m;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116229u;
import com.google.android.apps.gsa.staticplugins.recently.view.group.RecentlyView;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.a.e */
/* compiled from: PG */
public final class C116022e {

    /* renamed from: a */
    final /* synthetic */ C116023f f321702a;

    public C116022e(C116023f fVar) {
        this.f321702a = fVar;
    }

    /* renamed from: a */
    public final void mo102414a(int i, int i2) {
        C116208ae aeVar = this.f321702a.f321710h;
        if (aeVar != null) {
            RecentlyView recentlyView = aeVar.f322246a;
            C116226r rVar = (C116226r) recentlyView.f322215c.get(i);
            C116214f c = recentlyView.mo102564c(i, i2);
            int e = rVar.mo102614e();
            int i3 = c.f322256e;
            C58480gp e2 = C58485gu.m89837e();
            C58485gu guVar = rVar.f322282c;
            int size = guVar.size();
            boolean z = false;
            for (int i4 = 0; i4 < size; i4++) {
                C116214f fVar = (C116214f) guVar.get(i4);
                if (fVar.f322256e == i3) {
                    e2.mo55395g(c);
                }
                int i5 = fVar.f322256e;
                if (i5 >= i3) {
                    fVar.f322256e = i5 + 1;
                }
                e2.mo55395g(fVar);
            }
            if (i3 == rVar.f322282c.size()) {
                e2.mo55395g(c);
            }
            rVar.f322282c = e2.mo55394f();
            View view = rVar.f322286g.f322258g;
            if (view != null) {
                if (rVar.f322282c.size() > 1) {
                    z = true;
                }
                view.setClickable(z);
            }
            int i6 = rVar.f322284e;
            if (i3 < i6) {
                rVar.f322284e = i6 + 1;
                rVar.f322285f++;
            } else {
                int i7 = rVar.f322285f;
                if (i3 <= i7) {
                    rVar.f322285f = i7 + 1;
                }
            }
            rVar.mo102623n();
            c.f322263l = rVar.f322290k.mo124175a();
            c.mo102606c();
            C116219k kVar = new C116219k(rVar);
            int i8 = c.f322256e;
            c.f322259h.mo124186l((float) rVar.mo102610a(i8));
            c.f322260i.mo124186l((float) rVar.mo102611b(i8));
            c.f322257f = kVar;
            int i9 = rVar.f322285f + 1;
            if (i8 == i9) {
                rVar.f322285f = i9;
                rVar.mo102623n();
            }
            if (rVar.f322283d.contains(c)) {
                rVar.mo102626q(c, 3);
                rVar.f322297r = c;
                rVar.mo102619j();
                C147446j jVar = new C147446j(0.0f);
                jVar.f397996b = new C147454r(400.0f, 1.0f);
                jVar.mo124188n(new C116221m(rVar, c, jVar));
                jVar.mo124182h(150).mo124172b(1.0f);
            }
            int e3 = rVar.mo102614e();
            if (i8 == rVar.f322282c.size() - 1) {
                rVar.mo102627r(e - e3, 0);
            }
            rVar.mo102622m(0);
            recentlyView.mo102580m(rVar);
        }
    }

    /* renamed from: b */
    public final void mo102415b(int i, int i2) {
        C116208ae aeVar = this.f321702a.f321710h;
        if (aeVar != null) {
            RecentlyView recentlyView = aeVar.f322246a;
            C116226r rVar = (C116226r) recentlyView.f322215c.get(i);
            int e = rVar.mo102614e();
            C116214f fVar = (C116214f) rVar.f322282c.get(i2);
            C58480gp e2 = C58485gu.m89837e();
            C58485gu guVar = rVar.f322282c;
            int size = guVar.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                C116214f fVar2 = (C116214f) guVar.get(i3);
                if (fVar2 != fVar) {
                    e2.mo55395g(fVar2);
                    int i4 = fVar2.f322256e;
                    if (i4 > fVar.f322256e) {
                        fVar2.f322256e = i4 - 1;
                    }
                }
            }
            rVar.f322282c = e2.mo55394f();
            View view = rVar.f322286g.f322258g;
            if (view != null) {
                if (rVar.f322282c.size() > 1) {
                    z = true;
                }
                view.setClickable(z);
            }
            int i5 = rVar.f322284e;
            if (i2 < i5) {
                rVar.f322284e = i5 - 1;
                rVar.f322285f--;
            } else {
                int i6 = rVar.f322285f;
                if (i2 <= i6) {
                    rVar.f322285f = i6 - 1;
                }
            }
            rVar.mo102623n();
            int e3 = rVar.mo102614e();
            if (i2 < rVar.f322282c.size()) {
                rVar.mo102622m(200);
            } else {
                rVar.mo102627r(e - e3, 200);
            }
            View view2 = fVar.f322258g;
            if (view2 != null) {
                view2.postDelayed(new C116215g(rVar, fVar), 500);
            }
            recentlyView.mo102580m(rVar);
        }
    }

    /* renamed from: c */
    public final void mo102416c(int i) {
        int i2;
        C116208ae aeVar = this.f321702a.f321710h;
        if (aeVar != null) {
            RecentlyView recentlyView = aeVar.f322246a;
            C58485gu guVar = recentlyView.f322215c;
            if (i < ((C58724pq) guVar).f156474d) {
                i2 = ((C116226r) guVar.get(i)).f322291l;
            } else if (!guVar.isEmpty()) {
                C116226r f = recentlyView.mo102568f();
                i2 = recentlyView.f322221i + f.f322291l + f.mo102614e();
            } else {
                i2 = (int) (recentlyView.f322225m.mo124175a() + ((float) recentlyView.f322221i));
            }
            C116226r d = recentlyView.mo102566d(i2, i);
            recentlyView.f322233u.add(d);
            C58480gp e = C58485gu.m89837e();
            C58485gu guVar2 = recentlyView.f322215c;
            int i3 = ((C58724pq) guVar2).f156474d;
            for (int i4 = 0; i4 < i3; i4++) {
                C116226r rVar = (C116226r) guVar2.get(i4);
                if (rVar.f322281b == i) {
                    e.mo55395g(d);
                }
                int i5 = rVar.f322281b;
                if (i5 >= i) {
                    rVar.f322281b = i5 + 1;
                }
                e.mo55395g(rVar);
            }
            if (i == ((C58724pq) recentlyView.f322215c).f156474d) {
                e.mo55395g(d);
            }
            recentlyView.f322215c = e.mo55394f();
            int i6 = recentlyView.f322217e;
            if (i < i6) {
                recentlyView.f322217e = i6 + 1;
                recentlyView.f322218f++;
            } else {
                int i7 = recentlyView.f322218f;
                if (i <= i7) {
                    recentlyView.f322218f = i7 + 1;
                }
            }
            recentlyView.mo102594q();
            if (recentlyView.f322216d.contains(d)) {
                recentlyView.mo102575h(d);
                View view = d.f322286g.f322258g;
                view.getClass();
                float alpha = view.getAlpha();
                C147446j jVar = new C147446j(0.0f);
                jVar.f397996b = new C147454r(400.0f, 1.0f);
                jVar.mo124188n(new C116204aa(recentlyView, d, jVar, alpha));
                jVar.mo124182h(150).mo124172b(1.0f);
            }
            d.mo102627r((-d.mo102614e()) - recentlyView.f322221i, 0);
        }
    }

    /* renamed from: d */
    public final void mo102417d(int i) {
        C116208ae aeVar = this.f321702a.f321710h;
        if (aeVar != null) {
            RecentlyView recentlyView = aeVar.f322246a;
            C116226r rVar = (C116226r) recentlyView.f322215c.get(i);
            boolean contains = recentlyView.f322216d.contains(rVar);
            C58480gp e = C58485gu.m89837e();
            C58485gu guVar = recentlyView.f322215c;
            int i2 = ((C58724pq) guVar).f156474d;
            for (int i3 = 0; i3 < i2; i3++) {
                C116226r rVar2 = (C116226r) guVar.get(i3);
                if (rVar2 != rVar) {
                    e.mo55395g(rVar2);
                    int i4 = rVar2.f322281b;
                    if (i4 > i) {
                        rVar2.f322281b = i4 - 1;
                    }
                }
            }
            recentlyView.f322215c = e.mo55394f();
            int i5 = recentlyView.f322217e;
            if (i < i5) {
                recentlyView.f322217e = i5 - 1;
                recentlyView.f322218f--;
            } else {
                int i6 = recentlyView.f322218f;
                if (i <= i6) {
                    recentlyView.f322218f = i6 - 1;
                }
            }
            recentlyView.mo102594q();
            int e2 = rVar.mo102614e();
            int i7 = rVar.f322281b;
            C58485gu guVar2 = recentlyView.f322215c;
            if (i7 < ((C58724pq) guVar2).f156474d) {
                C116226r rVar3 = (C116226r) guVar2.get(i7);
                rVar3.f322291l = rVar.f322291l;
                rVar3.f322294o.mo124186l((float) (e2 + recentlyView.f322221i));
                rVar3.f322294o.mo124182h(200).mo124172b(0.0f);
            } else if (!guVar2.isEmpty()) {
                recentlyView.mo102568f().mo102627r(e2 + recentlyView.f322221i, 200);
            }
            if (contains) {
                View view = rVar.f322286g.f322258g;
                view.getClass();
                float alpha = view.getAlpha();
                C147446j jVar = new C147446j(0.0f);
                jVar.f397996b = new C147454r(400.0f, 1.0f);
                jVar.mo124186l(1.0f);
                jVar.mo124188n(new C116229u(rVar, jVar, alpha));
                jVar.mo124179e(0.0f);
                recentlyView.postDelayed(new C116205ab(rVar), 500);
            }
        }
    }

    /* renamed from: e */
    public final void mo102418e() {
        C116208ae aeVar = this.f321702a.f321710h;
        if (aeVar != null) {
            RecentlyView recentlyView = aeVar.f322246a;
            recentlyView.f322237y = false;
            ArrayList arrayList = new ArrayList(recentlyView.f322233u);
            recentlyView.f322233u.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C116226r) arrayList.get(i)).mo102620k();
            }
            recentlyView.mo102595r();
        }
    }
}
