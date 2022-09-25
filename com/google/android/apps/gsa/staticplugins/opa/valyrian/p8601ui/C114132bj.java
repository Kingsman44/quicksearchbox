package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.C4268a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113716d;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj */
/* compiled from: PG */
public final class C114132bj extends C4268a {

    /* renamed from: r */
    private static final C59071e f316340r = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj");

    /* renamed from: c */
    public final ValyrianViewPager f316341c;

    /* renamed from: d */
    public final LinearLayoutManager f316342d;

    /* renamed from: e */
    public final LinearLayoutManager f316343e;

    /* renamed from: f */
    public final C86124t f316344f;

    /* renamed from: g */
    public final C114120ay f316345g;

    /* renamed from: h */
    public final boolean f316346h;

    /* renamed from: i */
    public final C113716d f316347i;

    /* renamed from: j */
    public final boolean f316348j;

    /* renamed from: k */
    public final C58833ax f316349k;

    /* renamed from: l */
    public final ViewGroup f316350l;

    /* renamed from: m */
    public final ValyrianRecyclerView f316351m;

    /* renamed from: n */
    public RecyclerView f316352n;

    /* renamed from: o */
    public ViewGroup f316353o;

    /* renamed from: p */
    public AnimatorSet f316354p;

    /* renamed from: q */
    public int f316355q = 1;

    /* renamed from: s */
    private final List f316356s = new ArrayList();

    /* renamed from: t */
    private final Context f316357t;

    /* renamed from: u */
    private final boolean f316358u;

    /* renamed from: v */
    private final C68214a f316359v;

    public C114132bj(Context context, ValyrianViewPager valyrianViewPager, C114095a aVar, C114109an anVar, C58833ax axVar, C68214a aVar2, C86124t tVar, boolean z, boolean z2, boolean z3, C113716d dVar) {
        this.f316357t = context;
        this.f316341c = valyrianViewPager;
        this.f316344f = tVar;
        this.f316358u = z3;
        C114120ay ayVar = new C114120ay();
        this.f316345g = ayVar;
        this.f316346h = z;
        this.f316347i = dVar;
        this.f316359v = aVar2;
        this.f316348j = z2;
        this.f316349k = axVar;
        valyrianViewPager.mo101109p(ayVar);
        valyrianViewPager.f316169p = aVar2;
        if (tVar.mo79746e(C90014bt.f247327f) || tVar.mo79746e(C90014bt.f247289eO)) {
            valyrianViewPager.f316164k = true;
        }
        LayoutInflater from = LayoutInflater.from(context);
        ValyrianRecyclerView valyrianRecyclerView = (ValyrianRecyclerView) from.inflate(R.layout.demand_state_container, (ViewGroup) null);
        this.f316351m = valyrianRecyclerView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f316350l = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(valyrianRecyclerView);
        if (tVar.mo79746e(C90014bt.f247774nW) && !z2) {
            valyrianRecyclerView.getClass();
            valyrianRecyclerView.setItemAnimator(new C114116au(context, tVar));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f316343e = linearLayoutManager;
        linearLayoutManager.setStackFromEnd(false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        valyrianRecyclerView.setLayoutManager(linearLayoutManager);
        valyrianRecyclerView.setAdapter(aVar.mo101126i());
        C28292j jVar = new C28292j(50602);
        jVar.mo33794h(1);
        C28295m.m52919e(frameLayout, jVar);
        C28292j jVar2 = new C28292j(57773);
        jVar2.mo33794h(1);
        C28295m.m52919e(valyrianRecyclerView, jVar2);
        RecyclerView recyclerView = (RecyclerView) from.inflate(R.layout.history_view, (ViewGroup) null);
        this.f316352n = recyclerView;
        recyclerView.getClass();
        recyclerView.setAdapter(anVar);
        this.f316352n.setItemAnimator((C0646fh) null);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, 1, false);
        this.f316342d = linearLayoutManager2;
        linearLayoutManager2.setStackFromEnd(false);
        this.f316352n.setLayoutManager(linearLayoutManager2);
        RecyclerView recyclerView2 = this.f316352n;
        C28292j jVar3 = new C28292j(50601);
        jVar3.mo33794h(1);
        C28295m.m52919e(recyclerView2, jVar3);
        mo101169o();
    }

    /* renamed from: p */
    public static void m189293p(View view) {
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: b */
    public final ViewGroup mo101168b(int i) {
        if (i >= 0 && i < this.f316356s.size()) {
            return (ViewGroup) this.f316356s.get(i);
        }
        C59104x b = f316340r.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaViewPagerAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(28757)).mo56393w("#getViewForPosition -> Page index out of bound %d, %d", this.f316356s.size(), i);
        return null;
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        ViewGroup b = mo101168b(i);
        if (b == null) {
            C59104x d = f316340r.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaViewPagerAdapter");
            ((C59052c) ((C59052c) d).mo56372aa(28758)).mo56387q("Cannot find view for position %d", i);
            return new View(this.f316357t);
        }
        viewGroup.addView(b);
        return b;
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f316356s.size();
    }

    /* renamed from: l */
    public final int mo9176l(Object obj) {
        if (this.f316356s.contains(obj)) {
            return this.f316356s.indexOf(obj);
        }
        C58976aa aaVar = C58975e.f156826a;
        return -2;
    }

    /* renamed from: m */
    public final CharSequence mo9177m(int i) {
        return null;
    }

    /* renamed from: o */
    public final void mo101169o() {
        ViewGroup viewGroup;
        this.f316356s.clear();
        int i = this.f316355q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 == 1) {
                this.f316356s.add(this.f316352n);
            } else if (i2 == 2) {
                this.f316356s.add(this.f316350l);
            } else if (i2 == 3) {
                this.f316356s.add(this.f316352n);
                this.f316356s.add(this.f316350l);
            } else if (i2 == 4) {
                this.f316356s.add(this.f316352n);
                ViewGroup viewGroup2 = this.f316353o;
                if (viewGroup2 != null) {
                    this.f316356s.add(viewGroup2);
                }
            } else if (i2 == 5) {
                this.f316356s.add(this.f316352n);
                this.f316356s.add(this.f316350l);
                ViewGroup viewGroup3 = this.f316353o;
                if (viewGroup3 != null) {
                    this.f316356s.add(viewGroup3);
                }
            }
        } else if (!this.f316344f.mo79746e(C90014bt.f247775nX) || (viewGroup = this.f316353o) == null) {
            this.f316356s.add(this.f316350l);
        } else {
            this.f316356s.add(viewGroup);
        }
    }

    /* renamed from: q */
    public final void mo101170q() {
        int l;
        C58976aa aaVar = C58975e.f156826a;
        this.f316354p = mo101171r(mo101172s(), 4);
        int i = this.f316355q;
        if (i != 0) {
            if (i == 2 || i == 1) {
                mo101173t(5);
            } else if (i == 4 || i == 3) {
                mo101173t(6);
            }
            ViewGroup viewGroup = this.f316353o;
            if (viewGroup != null && (l = mo9176l(viewGroup)) >= 0) {
                this.f316341c.mo101086g(l);
                this.f316341c.f316156c = false;
                ((C113798bn) this.f316359v.mo27525b()).mo24921c(new C19623a(3), (C19628b) null);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: r */
    public final AnimatorSet mo101171r(int i, int i2) {
        AnimatorSet animatorSet;
        float f;
        AnimatorSet animatorSet2 = null;
        if (i == i2) {
            return null;
        }
        if (i == 4) {
            ViewGroup viewGroup = this.f316353o;
            animatorSet = viewGroup != null ? C114034q.m188808d(viewGroup, C91115n.m148870b(80.0f, this.f316357t), false) : null;
        } else if (i == 3) {
            animatorSet = C114034q.m188808d(this.f316350l, C91115n.m148870b(80.0f, this.f316357t), i2 == 4);
        } else {
            animatorSet = C114034q.m188808d(this.f316352n, C91115n.m148870b(80.0f, this.f316357t), true);
        }
        if (i2 == 4) {
            ViewGroup viewGroup2 = this.f316353o;
            if (viewGroup2 != null) {
                animatorSet2 = C114034q.m188807c(viewGroup2, C91115n.m148870b(100.0f, this.f316357t), true);
            }
        } else {
            ViewGroup viewGroup3 = this.f316350l;
            if (this.f316358u) {
                f = 0.0f;
            } else {
                f = C91115n.m148870b(100.0f, this.f316357t);
            }
            animatorSet2 = C114034q.m188807c(viewGroup3, f, i == 2);
            i2 = 3;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (animatorSet2 != null) {
            animatorSet3.playTogether(new Animator[]{animatorSet, animatorSet2});
        } else {
            animatorSet3.playTogether(new Animator[]{animatorSet});
        }
        animatorSet3.addListener(new C114131bi(this, i2, i));
        return animatorSet3;
    }

    /* renamed from: t */
    public final void mo101173t(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f316355q != i) {
            this.f316355q = i;
            mo101169o();
            mo9178n();
        }
    }

    /* renamed from: s */
    public final int mo101172s() {
        int i = this.f316355q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return this.f316344f.mo79746e(C90014bt.f247775nX) ? 4 : 3;
        } else {
            if (i2 == 1) {
                return 2;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return this.f316341c.f316159f == 0 ? 2 : 4;
                    }
                    if (i2 != 5) {
                        return 1;
                    }
                    int i3 = this.f316341c.f316159f;
                    if (i3 == 0) {
                        return 2;
                    }
                    if (i3 != 1) {
                        return i3 != 2 ? 1 : 4;
                    }
                    return 3;
                } else if (this.f316341c.f316159f == 0) {
                    return 2;
                }
            }
            return 3;
        }
    }
}
