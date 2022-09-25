package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.android.apps.gsa.search.shared.overlay.C87663l;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87625ad;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87641o;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87644r;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87846ft;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87847fu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87848fv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88328xp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88330xr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88331xs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88332xt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88333xu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88334xv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88335xw;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88704e;
import com.google.android.apps.gsa.searchbox.p6960ui.C88706g;
import com.google.android.apps.gsa.searchbox.p6960ui.C88707h;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88694c;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88771e;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88843w;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.shared.C88688a;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89202g;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.header.C90693f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7187ui.C91110i;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7870c.C100232a;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7871d.C100244i;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59744ea;
import com.google.common.p4552o.C59745eb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.aod;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4184bj.C56034j;
import com.google.p4184bj.C56036l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.a */
/* compiled from: PG */
public final class C88645a extends C88701b implements C88686i, C89200e, C89196a {

    /* renamed from: a */
    public final Context f239643a;

    /* renamed from: b */
    public final C88649e f239644b;

    /* renamed from: c */
    public final C88688a f239645c;

    /* renamed from: d */
    public final C88650f f239646d;

    /* renamed from: e */
    public final C90476a f239647e;

    /* renamed from: f */
    public final C22871g f239648f;

    /* renamed from: g */
    public final C22871g f239649g;

    /* renamed from: h */
    public final C22871g f239650h;

    /* renamed from: i */
    public final C90931ca f239651i;

    /* renamed from: j */
    public int f239652j;

    /* renamed from: k */
    public C41704d f239653k;

    /* renamed from: l */
    public C88685h f239654l;

    /* renamed from: m */
    public C88687j f239655m;

    /* renamed from: n */
    public C89202g f239656n;

    /* renamed from: o */
    public boolean f239657o = false;

    /* renamed from: p */
    C88707h f239658p;

    /* renamed from: q */
    public final SparseArray f239659q = new SparseArray();

    /* renamed from: r */
    private final AtomicInteger f239660r = new AtomicInteger(0);

    /* renamed from: s */
    private C88727aj f239661s;

    /* renamed from: t */
    private ViewGroup f239662t;

    /* renamed from: u */
    private int f239663u = 0;

    /* renamed from: v */
    private C88698g f239664v;

    /* renamed from: w */
    private C88760ae f239665w;

    /* renamed from: x */
    private C58833ax f239666x;

    /* renamed from: y */
    private boolean f239667y = false;

    public C88645a(Context context, C88649e eVar, C88688a aVar, C88650f fVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C90931ca caVar, C90476a aVar2) {
        this.f239643a = context;
        this.f239644b = eVar;
        this.f239645c = aVar;
        this.f239646d = fVar;
        this.f239648f = gVar;
        this.f239649g = gVar2;
        this.f239650h = gVar3;
        this.f239651i = caVar;
        this.f239647e = aVar2;
    }

    /* renamed from: J */
    private final boolean m143301J() {
        return mo82303E() && this.f239662t != null;
    }

    /* renamed from: A */
    public final void mo82300A(C87848fv fvVar, C88704e eVar) {
        C88489j jVar = new C88489j(C87739bu.GENERIC_SUGGEST_EVENT);
        C87847fu fuVar = (C87847fu) fvVar.toBuilder();
        int incrementAndGet = this.f239660r.incrementAndGet();
        fuVar.copyOnWrite();
        C87848fv fvVar2 = (C87848fv) fuVar.instance;
        fvVar2.f237683a |= 1;
        fvVar2.f237684b = incrementAndGet;
        this.f239659q.put(incrementAndGet, eVar);
        jVar.mo82014b(C87846ft.f237680a, (C87848fv) fuVar.build());
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91811h(jVar.mo82013a());
        }
    }

    /* renamed from: B */
    public final void mo82301B() {
        Response response;
        if (m143301J() && this.f239653k.mo44287a().length() == 0) {
            C88649e eVar = this.f239644b;
            if (eVar.f239680d == 1 && (response = (Response) eVar.f239681e.mo83164d("cachedZeroPrefixResponse")) != null && eVar.mo82322g(response)) {
                C58976aa aaVar = C58975e.f156826a;
                eVar.f239679c.mo82432a(new Response(response, eVar.f239677a.mo26871c()));
            }
        }
    }

    /* renamed from: C */
    public final void mo44274C() {
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91820q(mo82308a(aod.ABANDONMENT), this.f239664v.mo82398c());
        }
    }

    /* renamed from: D */
    public final boolean mo82302D(Suggestion suggestion, View view) {
        C88685h hVar = this.f239654l;
        if (hVar == null) {
            return false;
        }
        C87644r rVar = ((C100244i) hVar).f280335h;
        rVar.getClass();
        return rVar.f236903a.mo76809f(suggestion, view);
    }

    /* renamed from: E */
    public final boolean mo82303E() {
        return this.f239656n != null;
    }

    /* renamed from: F */
    public final void mo82304F(int i, boolean z) {
        int i2;
        C88760ae aeVar = this.f239665w;
        ViewGroup viewGroup = aeVar.f240135o;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            if (aeVar.mo82500v(parent)) {
                C88771e eVar = (C88771e) aeVar.mo82488j(C41669ai.f108954c.intValue());
                C88771e eVar2 = (C88771e) aeVar.mo82488j(C41669ai.f108958g.intValue());
                C88771e eVar3 = (C88771e) aeVar.mo82488j(C41669ai.f108960i.intValue());
                ArrayList arrayList = new ArrayList();
                Response k = aeVar.mo82489k();
                if (k == null || !k.f108861a.isEmpty()) {
                    arrayList.add(ObjectAnimator.ofFloat((LinearLayout) parent, "y", new float[]{(float) (i - aeVar.f240135o.getMeasuredHeight())}));
                } else {
                    int paddingTop = i - aeVar.f240135o.getPaddingTop();
                    if (eVar != null) {
                        int measuredHeight = paddingTop - eVar.getMeasuredHeight();
                        if (!z) {
                            if (eVar2 != null) {
                                measuredHeight -= eVar2.getMeasuredHeight();
                            }
                            if (eVar3 != null) {
                                i2 = eVar3.getPaddingTop();
                            }
                            arrayList.add(ObjectAnimator.ofFloat((LinearLayout) parent, "y", new float[]{(float) measuredHeight}));
                        } else {
                            if (eVar2 != null) {
                                i2 = eVar2.getPaddingTop();
                            }
                            arrayList.add(ObjectAnimator.ofFloat((LinearLayout) parent, "y", new float[]{(float) measuredHeight}));
                        }
                        measuredHeight -= i2;
                        arrayList.add(ObjectAnimator.ofFloat((LinearLayout) parent, "y", new float[]{(float) measuredHeight}));
                    } else {
                        C58976aa aaVar = C58975e.f156826a;
                    }
                }
                if (eVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(eVar, View.ALPHA, new float[]{0.0f}));
                }
                if (k == null || !k.f108861a.isEmpty() || eVar3 == null) {
                    View findViewById = ((ViewGroup) parent).findViewById(R.id.pixel_bitmap_container);
                    if (findViewById != null) {
                        findViewById.setTranslationY(0.0f);
                    }
                } else if (z) {
                    arrayList.add(ObjectAnimator.ofFloat(eVar3, View.ALPHA, new float[]{0.0f}));
                } else {
                    int childCount = eVar3.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        arrayList.add(ObjectAnimator.ofFloat(eVar3.getChildAt(i3), View.ALPHA, new float[]{0.0f}));
                    }
                }
                if (!arrayList.isEmpty()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether((ObjectAnimator[]) arrayList.toArray(new ObjectAnimator[arrayList.size()]));
                    animatorSet.setDuration(250);
                    animatorSet.start();
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo82305G(int i) {
        C88727aj ajVar;
        boolean z = i != this.f239663u;
        if (z) {
            C88649e eVar = this.f239644b;
            eVar.f239680d = i;
            eVar.mo82320b();
        }
        this.f239663u = i;
        C88760ae aeVar = this.f239665w;
        if (aeVar != null) {
            if (!aeVar.f240129i || !C90693f.f253685a.contains(Integer.valueOf(i))) {
                aeVar.mo82494p();
            } else if (aeVar.mo82499u() && !aeVar.f240136p) {
                aeVar.f240141u.f240103b = aeVar.f240135o.getLayoutTransition();
                aeVar.f240135o.setLayoutTransition((LayoutTransition) null);
                aeVar.f240135o.setBackgroundColor(aeVar.f240135o.getContext().getResources().getColor(R.color.modes_in_suggest_suggestion_background_color));
                aeVar.f240136p = true;
            }
        }
        if (z && (ajVar = this.f239661s) != null) {
            ajVar.mo82463s();
        }
    }

    /* renamed from: H */
    public final void mo82306H(int i, boolean z) {
        int i2;
        C88760ae aeVar = this.f239665w;
        ViewGroup viewGroup = aeVar.f240135o;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            if (aeVar.mo82500v(parent)) {
                C88771e eVar = (C88771e) aeVar.mo82488j(C41669ai.f108954c.intValue());
                C88771e eVar2 = (C88771e) aeVar.mo82488j(C41669ai.f108958g.intValue());
                C88771e eVar3 = (C88771e) aeVar.mo82488j(C41669ai.f108960i.intValue());
                ArrayList arrayList = new ArrayList();
                if (eVar != null) {
                    int paddingTop = (i - aeVar.f240135o.getPaddingTop()) - eVar.getMeasuredHeight();
                    if (!z) {
                        if (eVar2 != null) {
                            paddingTop -= eVar2.getMeasuredHeight();
                        }
                        if (eVar3 != null) {
                            i2 = eVar3.getPaddingTop();
                        }
                        ((LinearLayout) parent).setTranslationY((float) paddingTop);
                    } else {
                        if (eVar2 != null) {
                            i2 = eVar2.getPaddingTop();
                        }
                        ((LinearLayout) parent).setTranslationY((float) paddingTop);
                    }
                    paddingTop -= i2;
                    ((LinearLayout) parent).setTranslationY((float) paddingTop);
                } else {
                    C58976aa aaVar = C58975e.f156826a;
                }
                int i3 = 0;
                arrayList.add(ObjectAnimator.ofFloat((LinearLayout) parent, "y", new float[]{0.0f}));
                if (eVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(eVar, View.ALPHA, new float[]{0.0f, 1.0f}));
                }
                if (eVar3 != null) {
                    if (z) {
                        arrayList.add(ObjectAnimator.ofFloat(eVar3, View.ALPHA, new float[]{0.0f, 1.0f}));
                    } else {
                        int childCount = eVar3.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            arrayList.add(ObjectAnimator.ofFloat(eVar3.getChildAt(i4), View.ALPHA, new float[]{0.0f, 1.0f}));
                        }
                    }
                    int i5 = -eVar3.getMeasuredHeight();
                    if (!z) {
                        i3 = eVar3.getPaddingTop();
                    }
                    int i6 = i5 + i3;
                    View findViewById = ((ViewGroup) parent).findViewById(R.id.pixel_bitmap_container);
                    if (findViewById != null) {
                        findViewById.setTranslationY((float) i6);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether((ObjectAnimator[]) arrayList.toArray(new ObjectAnimator[arrayList.size()]));
                    animatorSet.setDuration(250);
                    animatorSet.start();
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo82307I(ViewGroup viewGroup) {
        if (mo82303E()) {
            if (this.f239662t == viewGroup) {
                C58976aa aaVar = C58975e.f156826a;
                mo82305G(1);
                return;
            }
            this.f239655m.mo82381a();
            mo82312m();
            if (!this.f239645c.mo82389d()) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f239645c.mo82388c();
            }
            if (this.f239667y) {
                C58976aa aaVar3 = C58975e.f156826a;
                this.f239656n.mo83157c();
                this.f239667y = false;
            }
            if (this.f239654l != null) {
                int width = viewGroup.getWidth();
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingRight = viewGroup.getPaddingRight();
                int dimensionPixelSize = this.f239643a.getResources().getDimensionPixelSize(R.dimen.web_suggestion_list_left_right_padding);
                int i = ((width - paddingLeft) - paddingRight) - (dimensionPixelSize + dimensionPixelSize);
                if (i > 0) {
                    ((C100244i) this.f239654l).f280331d.mo91812i(i);
                }
            }
            this.f239656n.mo83159e();
            this.f239662t = viewGroup;
            this.f239665w.mo82492n(viewGroup);
            C88760ae aeVar = this.f239665w;
            int i2 = this.f239652j;
            aeVar.f240130j = new C91110i(i2, i2, i2);
            aeVar.mo82498t();
            C58976aa aaVar4 = C58975e.f156826a;
            mo82305G(1);
            this.f239655m.mo82383g();
        }
    }

    /* renamed from: a */
    public final C60456qs mo82308a(aod aod) {
        Response response = null;
        if (!mo82303E()) {
            return null;
        }
        this.f239664v.mo82415v(aod);
        this.f239664v.mo82418y(this.f239657o);
        CharSequence a = ((C88706g) ((C58847bk) this.f239666x).f156646a).mo82429a();
        C88760ae aeVar = this.f239665w;
        if (aeVar != null) {
            response = aeVar.mo82489k();
        }
        return C88694c.m143537a(a, response, this.f239664v.mo82399f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C56036l mo82309b() {
        if (!mo82303E()) {
            return null;
        }
        return this.f239664v.mo82400g();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f239664v = pVar.f239937i;
        this.f239666x = C58833ax.m90834k(pVar.f239940l);
        this.f239665w = pVar.f239943o;
        this.f239661s = pVar.f239945q;
        this.f239658p = pVar.f239942n;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }

    /* renamed from: j */
    public final void mo82310j(C87681ai aiVar) {
        C88649e eVar = this.f239644b;
        C58976aa aaVar = C58975e.f156826a;
        eVar.f239678b = aiVar;
    }

    /* renamed from: k */
    public final void mo82311k() {
        if (m143301J()) {
            this.f239665w.mo82493o();
        }
    }

    /* renamed from: l */
    public final void mo44275l() {
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91809e();
        }
    }

    /* renamed from: m */
    public final void mo82312m() {
        if (mo82303E() && m143301J()) {
            C58976aa aaVar = C58975e.f156826a;
            mo82305G(0);
            C88760ae aeVar = this.f239665w;
            if (aeVar.mo82499u()) {
                for (int i = 0; i < aeVar.f240131k.size(); i++) {
                    aeVar.f240135o.removeView((ViewGroup) aeVar.f240131k.valueAt(i));
                }
                if (aeVar.f240136p) {
                    aeVar.mo82494p();
                }
                aeVar.f240141u.mo82482b();
                aeVar.f240135o.getViewTreeObserver().removeOnGlobalLayoutListener(aeVar.f240141u);
                aeVar.f240135o = null;
                aeVar.f240132l.clear();
                aeVar.f240133m.clear();
                aeVar.f240134n.clear();
                C58801sm G = ((C58485gu) aeVar.f240124d).listIterator(0);
                while (G.hasNext()) {
                    ((C88843w) G.next()).f240539a.clear();
                }
                C58801sm G2 = ((C58485gu) aeVar.f240125e).listIterator(0);
                while (G2.hasNext()) {
                    ((C88843w) G2.next()).f240539a.clear();
                }
                aeVar.f240131k.clear();
                aeVar.f240138r = false;
                aeVar.f240140t.mo82485a();
                aeVar.f240139s = null;
            }
            this.f239662t = null;
            this.f239656n.mo83160f();
        }
    }

    /* renamed from: n */
    public final void mo44276n(Suggestion suggestion) {
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91810f(suggestion);
        }
    }

    /* renamed from: o */
    public final void mo44277o(Response response) {
        if (response.f108861a.isEmpty()) {
            this.f239655m.mo82385i(response.f108866f);
        }
        C41704d dVar = this.f239653k;
        boolean isEmpty = response.f108861a.isEmpty();
        boolean z = response.f108863c.getBoolean("gsa:ap");
        C87641o oVar = (C87641o) dVar;
        C87663l lVar = oVar.f236900a.f236837an;
        if (lVar != null) {
            lVar.mo81868c(z, isEmpty);
        }
        if (oVar.f236900a.f236844au.mo84402ci()) {
            C87625ad adVar = oVar.f236900a;
            if (!adVar.f236811aN) {
                C139701a aVar = adVar.f236782L;
                if (aVar.f379695b && !aVar.f379696c) {
                    aVar.f379694a.mo19974a(C37182a.f97927d.mo40805c(C62722b.OK));
                    aVar.f379697d.mo41724m("CLASSIC");
                    aVar.f379696c = true;
                }
                oVar.f236900a.f236811aN = true;
            }
        }
        C87662k kVar = oVar.f236900a.f236854bd;
        if (kVar != null && isEmpty) {
            kVar.mo76791e();
        }
        C41704d dVar2 = this.f239653k;
        int b = this.f239665w.mo82487b(130);
        int b2 = this.f239665w.mo82487b(2);
        SearchPlate searchPlate = ((C87641o) dVar2).f236900a.f236778H;
        searchPlate.f240691K = b;
        searchPlate.f240692L = b2;
        searchPlate.mo82694u();
        C88328xp xpVar = (C88328xp) C88329xq.f238867j.createBuilder();
        boolean isEmpty2 = response.f108861a.isEmpty();
        xpVar.copyOnWrite();
        C88329xq xqVar = (C88329xq) xpVar.instance;
        xqVar.f238869a |= 4;
        xqVar.f238872d = isEmpty2;
        boolean z2 = response.f108863c.getBoolean("gsa::aa");
        xpVar.copyOnWrite();
        C88329xq xqVar2 = (C88329xq) xpVar.instance;
        xqVar2.f238869a |= 8;
        xqVar2.f238873e = z2;
        int i = response.f108864d;
        xpVar.copyOnWrite();
        C88329xq xqVar3 = (C88329xq) xpVar.instance;
        xqVar3.f238869a |= 16;
        xqVar3.f238874f = i;
        boolean z3 = response.f108863c.getBoolean("gsa:ah");
        xpVar.copyOnWrite();
        C88329xq xqVar4 = (C88329xq) xpVar.instance;
        xqVar4.f238869a |= 32;
        xqVar4.f238875g = z3;
        boolean z4 = response.f108863c.getBoolean("gsa::ai");
        xpVar.copyOnWrite();
        C88329xq xqVar5 = (C88329xq) xpVar.instance;
        xqVar5.f238869a |= 64;
        xqVar5.f238876h = z4;
        long c = this.f239664v.mo82398c();
        xpVar.copyOnWrite();
        C88329xq xqVar6 = (C88329xq) xpVar.instance;
        xqVar6.f238869a = 1 | xqVar6.f238869a;
        xqVar6.f238870b = c;
        C60456qs a = mo82308a(aod.ABANDONMENT);
        if (a != null) {
            xpVar.copyOnWrite();
            C88329xq xqVar7 = (C88329xq) xpVar.instance;
            xqVar7.f238871c = a;
            xqVar7.f238869a |= 2;
        }
        C56036l b3 = mo82309b();
        if (b3 != null) {
            xpVar.copyOnWrite();
            C88329xq xqVar8 = (C88329xq) xpVar.instance;
            xqVar8.f238877i = b3;
            xqVar8.f238869a |= 256;
        }
        C58976aa aaVar = C58975e.f156826a;
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91814k((C88329xq) xpVar.build(), response);
        }
    }

    /* renamed from: p */
    public final void mo82313p() {
        if (m143301J()) {
            this.f239644b.mo82320b();
        }
    }

    /* renamed from: q */
    public final void mo44278q(Suggestion suggestion) {
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91813j(suggestion);
        }
    }

    /* renamed from: r */
    public final void mo82314r(Response response) {
        this.f239644b.mo44284c(response);
    }

    /* renamed from: s */
    public final void mo44279s(Suggestion suggestion, View view, String str) {
        C60321oe i;
        C60456qs a = mo82308a(aod.CLICKED_SUGGESTION);
        C88331xs xsVar = (C88331xs) C88332xt.f238881e.createBuilder();
        xsVar.copyOnWrite();
        C88332xt xtVar = (C88332xt) xsVar.instance;
        str.getClass();
        xtVar.f238883a |= 1;
        xtVar.f238884b = str;
        a.getClass();
        xsVar.copyOnWrite();
        C88332xt xtVar2 = (C88332xt) xsVar.instance;
        xtVar2.f238885c = a;
        xtVar2.f238883a |= 2;
        if (!(view == null || (i = C28285c.m52882i(view, 5, (Integer) null)) == null)) {
            xsVar.copyOnWrite();
            C88332xt xtVar3 = (C88332xt) xsVar.instance;
            xtVar3.f238886d = i;
            xtVar3.f238883a |= 4;
        }
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            C88332xt xtVar4 = (C88332xt) xsVar.build();
            C88331xs xsVar2 = (C88331xs) xtVar4.toBuilder();
            C60456qs qsVar = xtVar4.f238885c;
            if (qsVar == null) {
                qsVar = C60456qs.f163602g;
            }
            C60455qr qrVar = (C60455qr) qsVar.toBuilder();
            C59744ea eaVar = (C59744ea) C59745eb.f161422d.createBuilder();
            C100244i iVar = (C100244i) hVar;
            C87644r rVar = iVar.f280335h;
            rVar.getClass();
            int hashCode = rVar.f236903a.f236804aG.hashCode();
            eaVar.copyOnWrite();
            C59745eb ebVar = (C59745eb) eaVar.instance;
            ebVar.f161424a |= 1;
            ebVar.f161425b = hashCode;
            qrVar.copyOnWrite();
            C60456qs qsVar2 = (C60456qs) qrVar.instance;
            C59745eb ebVar2 = (C59745eb) eaVar.build();
            ebVar2.getClass();
            qsVar2.f163609f = ebVar2;
            qsVar2.f163604a |= 256;
            xsVar2.copyOnWrite();
            C88332xt xtVar5 = (C88332xt) xsVar2.instance;
            C60456qs qsVar3 = (C60456qs) qrVar.build();
            qsVar3.getClass();
            xtVar5.f238885c = qsVar3;
            xtVar5.f238883a |= 2;
            C100232a aVar = iVar.f280331d;
            C88489j jVar = new C88489j(C87739bu.SUGGESTION_ACTION_BUTTON_CLICKED);
            jVar.mo82014b(C88330xr.f238880a, (C88332xt) xsVar2.build());
            jVar.mo82015c(suggestion);
            aVar.mo91815l(jVar.mo82013a());
        }
        this.f239664v.mo82413t();
    }

    /* renamed from: t */
    public final void mo44280t(Suggestion suggestion, View view, CharSequence charSequence) {
        String str;
        C60456qs a = mo82308a(aod.CLICKED_SUGGESTION);
        C56036l b = mo82309b();
        String str2 = this.f239665w.mo82489k() != null ? this.f239665w.mo82489k().f108861a : null;
        C88334xv xvVar = (C88334xv) C88335xw.f238889j.createBuilder();
        String g = C58837ba.m90858g(str2);
        xvVar.copyOnWrite();
        C88335xw xwVar = (C88335xw) xvVar.instance;
        xwVar.f238891a |= 4;
        xwVar.f238894d = g;
        if (charSequence == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = charSequence.toString();
        }
        xvVar.copyOnWrite();
        C88335xw xwVar2 = (C88335xw) xvVar.instance;
        str.getClass();
        xwVar2.f238891a |= 8;
        xwVar2.f238895e = str;
        long b2 = this.f239664v.f239815b.mo83162b("SUGGESTION_CLICK_TIME_MS");
        xvVar.copyOnWrite();
        C88335xw xwVar3 = (C88335xw) xvVar.instance;
        xwVar3.f238891a |= 128;
        xwVar3.f238899i = b2;
        if (a != null) {
            xvVar.copyOnWrite();
            C88335xw xwVar4 = (C88335xw) xvVar.instance;
            xwVar4.f238893c = a;
            xwVar4.f238891a |= 2;
        }
        if (b != null) {
            xvVar.copyOnWrite();
            C88335xw xwVar5 = (C88335xw) xvVar.instance;
            xwVar5.f238897g = b;
            xwVar5.f238891a |= 32;
            if ((b.f149230a & 1) != 0) {
                C56034j jVar = b.f149232c;
                if (jVar == null) {
                    jVar = C56034j.f149219g;
                }
                xvVar.copyOnWrite();
                C88335xw xwVar6 = (C88335xw) xvVar.instance;
                jVar.getClass();
                xwVar6.f238898h = jVar;
                xwVar6.f238891a |= 64;
            }
        }
        C60321oe i = C28285c.m52882i(view, 5, (Integer) null);
        if (i != null) {
            xvVar.copyOnWrite();
            C88335xw xwVar7 = (C88335xw) xvVar.instance;
            xwVar7.f238896f = i;
            xwVar7.f238891a |= 16;
        }
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            C88335xw xwVar8 = (C88335xw) xvVar.build();
            if (!((C22939d) hVar).f63126Q.mo28316z()) {
                ((C59052c) ((C59052c) C100244i.f280328a.mo56226d()).mo56372aa(33277)).mo56386p("handleSuggestionClick called after onUnbind. Shouldn't happen outside tests.");
            } else {
                C100244i iVar = (C100244i) hVar;
                C87644r rVar = iVar.f280335h;
                rVar.getClass();
                C87625ad adVar = rVar.f236903a;
                adVar.f236844au = adVar.f236844au.mo84487p().mo84489r();
                if (charSequence != null) {
                    rVar.f236903a.mo81797ad(4, 0, false);
                    C87625ad adVar2 = rVar.f236903a;
                    adVar2.f236844au = adVar2.f236844au.mo84268aE(charSequence, false);
                    C87625ad adVar3 = rVar.f236903a;
                    adVar3.mo81798ae(adVar3.f236844au.mo84268aE(charSequence, false), true);
                }
                rVar.f236903a.f236854bd.mo81865p();
                rVar.f236903a.f236771A.mo44293h();
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle(Suggestion.class.getClassLoader());
                bundle2.putParcelable("a", suggestion);
                bundle.putBundle("extra_suggestion", bundle2);
                if (suggestion.f108909j == 19) {
                    View findViewById = view.findViewById(16908294);
                    if (findViewById != null) {
                        view = findViewById;
                    }
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    Rect rect = new Rect(iArr[0] + view.getPaddingLeft(), iArr[1] + view.getPaddingTop(), (iArr[0] + view.getMeasuredWidth()) - view.getPaddingRight(), (iArr[1] + view.getMeasuredHeight()) - view.getPaddingBottom());
                    Bundle bundle3 = ActivityOptions.makeClipRevealAnimation(view, rect.left - iArr[0], rect.top - iArr[1], rect.width(), rect.height()).toBundle();
                    bundle.putParcelable("extra_suggestion_bounds", rect);
                    bundle.putBundle("extra_activity_options", bundle3);
                }
                C87644r rVar2 = iVar.f280335h;
                rVar2.getClass();
                String str3 = rVar2.f236903a.f236804aG;
                C88334xv xvVar2 = (C88334xv) xwVar8.toBuilder();
                xvVar2.copyOnWrite();
                C88335xw xwVar9 = (C88335xw) xvVar2.instance;
                str3.getClass();
                xwVar9.f238891a |= 1;
                xwVar9.f238892b = str3;
                C60456qs qsVar = xwVar8.f238893c;
                if (qsVar == null) {
                    qsVar = C60456qs.f163602g;
                }
                C60455qr qrVar = (C60455qr) qsVar.toBuilder();
                C59744ea eaVar = (C59744ea) C59745eb.f161422d.createBuilder();
                int hashCode = str3.hashCode();
                eaVar.copyOnWrite();
                C59745eb ebVar = (C59745eb) eaVar.instance;
                ebVar.f161424a = 1 | ebVar.f161424a;
                ebVar.f161425b = hashCode;
                qrVar.copyOnWrite();
                C60456qs qsVar2 = (C60456qs) qrVar.instance;
                C59745eb ebVar2 = (C59745eb) eaVar.build();
                ebVar2.getClass();
                qsVar2.f163609f = ebVar2;
                qsVar2.f163604a |= 256;
                xvVar2.copyOnWrite();
                C88335xw xwVar10 = (C88335xw) xvVar2.instance;
                C60456qs qsVar3 = (C60456qs) qrVar.build();
                qsVar3.getClass();
                xwVar10.f238893c = qsVar3;
                xwVar10.f238891a |= 2;
                C100232a aVar = iVar.f280331d;
                C88489j jVar2 = new C88489j(C87739bu.SUGGESTION_CLICK);
                jVar2.mo82014b(C88333xu.f238888a, (C88335xw) xvVar2.build());
                jVar2.mo82015c(bundle);
                aVar.mo91816m(jVar2.mo82013a());
            }
        }
        this.f239664v.mo82413t();
    }

    /* renamed from: u */
    public final void mo44281u(Suggestion suggestion) {
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91817n(suggestion);
        }
    }

    /* renamed from: v */
    public final void mo44282v(String str) {
        C88685h hVar = this.f239654l;
        if (hVar != null) {
            ((C100244i) hVar).f280331d.mo91818o(str);
        }
    }

    /* renamed from: w */
    public final void mo82315w(C88709j jVar) {
        C89202g gVar = this.f239656n;
        if (gVar != null) {
            gVar.mo83156b(jVar);
        }
    }

    /* renamed from: x */
    public final void mo44283x(Suggestion suggestion) {
        C88707h hVar = this.f239658p;
        if (hVar != null) {
            hVar.f239839a = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        C88685h hVar2 = this.f239654l;
        if (hVar2 != null) {
            ((C100244i) hVar2).f280331d.mo91819p(suggestion);
        }
    }

    /* renamed from: y */
    public final void mo82316y() {
        Response k;
        C88760ae aeVar = this.f239665w;
        C88771e eVar = (C88771e) aeVar.mo82488j(C41669ai.f108954c.intValue());
        if (eVar != null) {
            eVar.setAlpha(1.0f);
        }
        C88771e eVar2 = (C88771e) aeVar.mo82488j(C41669ai.f108960i.intValue());
        if (eVar2 != null && (k = aeVar.mo82489k()) != null && k.f108861a.isEmpty()) {
            int childCount = eVar2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                eVar2.getChildAt(i).setAlpha(1.0f);
            }
            eVar2.setAlpha(1.0f);
        }
    }

    /* renamed from: z */
    public final void mo82317z() {
        if (mo82303E()) {
            C58976aa aaVar = C58975e.f156826a;
            if (m143301J()) {
                this.f239656n.mo83157c();
            } else {
                this.f239667y = true;
            }
        }
    }
}
