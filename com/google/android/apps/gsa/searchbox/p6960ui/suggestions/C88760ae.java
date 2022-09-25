package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88706g;
import com.google.android.apps.gsa.searchbox.p6960ui.C88708i;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7187ui.C91110i;
import com.google.android.apps.gsa.shared.util.p7187ui.C91111j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41705e;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.ae */
/* compiled from: PG */
public final class C88760ae implements C89200e, C89199d, C89204i, C89203h, C89196a, C41705e, C91111j {

    /* renamed from: z */
    private static final C59071e f240115z = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.ae");

    /* renamed from: A */
    private final C21370a f240116A;

    /* renamed from: B */
    private C88708i f240117B;

    /* renamed from: C */
    private SparseArray f240118C;

    /* renamed from: D */
    private C88715p f240119D;

    /* renamed from: E */
    private C88709j f240120E;

    /* renamed from: a */
    public C88701b f240121a;

    /* renamed from: b */
    public C88706g f240122b;

    /* renamed from: c */
    public C88698g f240123c;

    /* renamed from: d */
    public List f240124d;

    /* renamed from: e */
    public List f240125e;

    /* renamed from: f */
    public C41704d f240126f;

    /* renamed from: g */
    public final C90476a f240127g;

    /* renamed from: h */
    public C89205j f240128h;

    /* renamed from: i */
    public boolean f240129i;

    /* renamed from: j */
    public C91110i f240130j = C91110i.f254419a;

    /* renamed from: k */
    public final SparseArray f240131k = new SparseArray();

    /* renamed from: l */
    public final SparseArray f240132l = new SparseArray();

    /* renamed from: m */
    public final List f240133m = new ArrayList();

    /* renamed from: n */
    public final SparseIntArray f240134n = new SparseIntArray();

    /* renamed from: o */
    public ViewGroup f240135o;

    /* renamed from: p */
    public boolean f240136p;

    /* renamed from: q */
    C88761af f240137q;

    /* renamed from: r */
    public boolean f240138r = false;

    /* renamed from: s */
    public Response f240139s;

    /* renamed from: t */
    public final C88758ac f240140t = new C88758ac(this);

    /* renamed from: u */
    public final C88756aa f240141u = new C88756aa(this);

    /* renamed from: v */
    public C60870cx f240142v = C60866ct.f164955a;

    /* renamed from: w */
    public long f240143w;

    /* renamed from: x */
    public final SparseIntArray f240144x = new SparseIntArray();

    /* renamed from: y */
    public C22871g f240145y;

    public C88760ae(C21370a aVar, C90476a aVar2) {
        this.f240116A = aVar;
        this.f240127g = aVar2;
    }

    /* renamed from: w */
    private final void m143903w() {
        this.f240128h.mo83174n("displayedResponse", (Parcelable) null);
    }

    /* renamed from: x */
    private final void m143904x(C88786t tVar, Suggestion suggestion) {
        C88728ak akVar;
        boolean z;
        if (tVar.mo82524n()) {
            if (C88767al.m143952n(suggestion)) {
                akVar = (C88728ak) this.f240118C.get(-2);
            } else {
                akVar = (C88728ak) this.f240118C.get(suggestion.f108910k);
            }
            if (akVar == null) {
                C58976aa aaVar = C58975e.f156826a;
                suggestion.f108914o = 4;
                return;
            }
            int c = akVar.mo82328c(suggestion);
            C88803an e = tVar.mo82514e(c);
            if (e == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                suggestion.f108914o = 5;
                return;
            }
            e.mo82574u(suggestion, akVar);
            try {
                z = akVar.mo82331hI(suggestion, e);
            } catch (Exception e2) {
                C59104x d = f240115z.mo56226d();
                d.mo56378ag(C58975e.f156826a, "sb.u.SugBoxCon");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(9995)).mo56387q("Failed to render a view for suggestion of type: %d", c);
                int i = C90755l.f253831a;
                z = false;
            }
            suggestion.f108914o = true != z ? 6 : 2;
            if (!z) {
                tVar.mo82523l();
                return;
            }
            return;
        }
        suggestion.f108914o = 3;
    }

    /* renamed from: a */
    public final int mo44295a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo82487b(int i) {
        C88786t tVar;
        C88786t tVar2;
        int i2 = 0;
        while (true) {
            tVar = null;
            if (i2 >= this.f240131k.size()) {
                tVar2 = null;
                break;
            }
            tVar2 = (C88786t) this.f240131k.valueAt(i2);
            if (((ViewGroup) tVar2).getVisibility() == 0) {
                break;
            }
            i2++;
        }
        int size = this.f240131k.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            C88786t tVar3 = (C88786t) this.f240131k.valueAt(size);
            if (((ViewGroup) tVar3).getVisibility() == 0) {
                tVar = tVar3;
                break;
            }
            size--;
        }
        if (tVar2 == null) {
            return -1;
        }
        if (i == 2) {
            return tVar2.mo82487b(2);
        }
        if (i != 17) {
            if (i == 33) {
                return tVar.mo82487b(33);
            }
            if (i != 66) {
                if (i == 130) {
                    return tVar2.mo82487b(130);
                }
                throw new IllegalArgumentException("Unknown focus direction " + i);
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f240119D = pVar;
        this.f240121a = pVar.f239935g;
        this.f240117B = pVar.f239936h;
        this.f240122b = pVar.f239940l;
        this.f240123c = pVar.f239937i;
        this.f240124d = pVar.f239932d;
        this.f240125e = pVar.f239933e;
        this.f240118C = pVar.f239934f;
        this.f240126f = pVar.f239941m;
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final void mo82223g(C22871g gVar) {
        this.f240145y = gVar;
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f240128h = jVar;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        C88709j jVar = (C88709j) obj;
        this.f240120E = jVar;
        this.f240129i = jVar.f239880f;
        this.f240143w = jVar.f239870a;
        List list = jVar.f239893s;
        for (int i = 0; i < list.size(); i++) {
            this.f240144x.put(((Integer) list.get(i)).intValue(), i);
        }
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        mo82490l();
        m143903w();
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: hM */
    public final void mo44296hM(Response response) {
        mo82495q(response);
    }

    /* renamed from: i */
    public final void mo82227i() {
        mo82490l();
    }

    /* renamed from: j */
    public final C88786t mo82488j(int i) {
        return (C88786t) this.f240131k.get(i);
    }

    /* renamed from: k */
    public final Response mo82489k() {
        return (Response) this.f240128h.mo83164d("displayedResponse");
    }

    /* renamed from: l */
    public final void mo82490l() {
        this.f240142v.cancel(false);
    }

    /* renamed from: m */
    public final void mo82491m(C91110i iVar) {
        throw null;
    }

    /* renamed from: n */
    public final void mo82492n(ViewGroup viewGroup) {
        C58976aa aaVar = C58975e.f156826a;
        this.f240135o = viewGroup;
        C28295m.m52919e(viewGroup, new C28292j(20367));
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f240141u);
        Response k = mo82489k();
        if (k != null) {
            m143903w();
            this.f240117B.mo44284c(new Response(k, this.f240116A.mo26871c()));
        }
    }

    /* renamed from: o */
    public final void mo82493o() {
        for (int i = 0; i < this.f240131k.size(); i++) {
            C88786t tVar = (C88786t) this.f240131k.valueAt(i);
            tVar.mo82522k();
            tVar.mo82520i();
        }
        this.f240132l.clear();
        this.f240128h.mo83174n("displayedResponse", (Parcelable) null);
    }

    /* renamed from: p */
    public final void mo82494p() {
        if (this.f240136p) {
            this.f240135o.setBackgroundColor(this.f240135o.getContext().getResources().getColor(17170445));
            C88761af afVar = this.f240137q;
            if (afVar != null) {
                ViewGroup viewGroup = this.f240135o;
                if (afVar.mo82502b() && afVar.f240148b.containsKey(afVar.f240151e)) {
                    viewGroup.removeView((View) afVar.f240148b.get(afVar.f240151e));
                }
                afVar.f240152f = 1;
                afVar.f240151e = null;
            }
            this.f240136p = false;
        }
    }

    /* renamed from: q */
    public final void mo82495q(Response response) {
        this.f240139s = response;
        if (!this.f240138r) {
            this.f240138r = true;
            C88758ac acVar = this.f240140t;
            if (acVar.f240107a == null) {
                C88760ae aeVar = acVar.f240112f;
                acVar.f240107a = aeVar.f240139s;
                aeVar.f240139s = null;
            }
            C88760ae aeVar2 = acVar.f240112f;
            if (!aeVar2.mo82499u() || acVar.f240107a == null) {
                acVar.mo82485a();
            } else {
                if (aeVar2.f240144x.size() != 0) {
                    TreeSet<Integer> treeSet = new TreeSet<>(new C88757ab(acVar, acVar.f240107a.f108861a.isEmpty()));
                    TreeSet<Integer> treeSet2 = new TreeSet<>(Collections.reverseOrder());
                    for (Suggestion suggestion : acVar.f240107a.f108862b) {
                        int intValue = suggestion.f108915p.intValue();
                        List list = (List) acVar.f240108b.get(intValue);
                        if (list == null) {
                            list = new ArrayList();
                            acVar.f240108b.put(intValue, list);
                            treeSet.add(Integer.valueOf(intValue));
                        }
                        list.add(suggestion);
                    }
                    int i = 0;
                    for (Integer intValue2 : treeSet) {
                        int intValue3 = intValue2.intValue();
                        List list2 = acVar.f240109c;
                        Integer valueOf = Integer.valueOf(intValue3);
                        list2.add(valueOf);
                        int indexOf = acVar.f240112f.f240133m.indexOf(valueOf);
                        if (!(indexOf == -1 || i == indexOf)) {
                            treeSet2.add(Integer.valueOf(indexOf));
                        }
                        i++;
                    }
                    for (int size = acVar.f240112f.f240132l.size() - 1; size >= 0; size--) {
                        int keyAt = acVar.f240112f.f240132l.keyAt(size);
                        if (acVar.f240108b.get(keyAt) == null) {
                            treeSet2.add(Integer.valueOf(acVar.f240112f.f240133m.indexOf(Integer.valueOf(keyAt))));
                        }
                    }
                    for (Integer intValue4 : treeSet2) {
                        acVar.f240110d.add((Integer) acVar.f240112f.f240133m.get(intValue4.intValue()));
                    }
                    acVar.f240112f.f240133m.clear();
                    acVar.f240112f.f240133m.addAll(acVar.f240109c);
                    if (acVar.f240112f.f240135o.getLayoutTransition() != null) {
                        C88760ae aeVar3 = acVar.f240112f;
                        aeVar3.f240141u.f240103b = aeVar3.f240135o.getLayoutTransition();
                        acVar.f240112f.f240135o.setLayoutTransition((LayoutTransition) null);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Suggestion suggestion2 : acVar.f240107a.f108862b) {
                        int intValue5 = suggestion2.f108915p.intValue();
                        List list3 = (List) acVar.f240108b.get(intValue5);
                        if (list3 == null) {
                            list3 = new ArrayList();
                            acVar.f240108b.put(intValue5, list3);
                            arrayList.add(Integer.valueOf(intValue5));
                            if (acVar.f240112f.f240134n.get(intValue5, -2) == -2) {
                                int i2 = suggestion2.f108916q;
                                acVar.f240112f.f240134n.put(intValue5, i2);
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= acVar.f240112f.f240133m.size()) {
                                        i3 = -1;
                                        break;
                                    }
                                    int intValue6 = ((Integer) acVar.f240112f.f240133m.get(i3)).intValue();
                                    int i4 = acVar.f240112f.f240134n.get(intValue6);
                                    if (intValue5 == C41669ai.f108970s.intValue()) {
                                        break;
                                    }
                                    if (intValue6 != C41669ai.f108970s.intValue()) {
                                        if (i2 == i4) {
                                            if (intValue5 < intValue6) {
                                                break;
                                            }
                                        } else if (i2 < i4) {
                                            break;
                                        }
                                    }
                                    i3++;
                                }
                                if (i3 != -1) {
                                    acVar.f240112f.f240133m.add(i3, Integer.valueOf(intValue5));
                                } else {
                                    acVar.f240112f.f240133m.add(Integer.valueOf(intValue5));
                                }
                            }
                        }
                        list3.add(suggestion2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        int intValue7 = ((Integer) arrayList.get(i5)).intValue();
                        if (acVar.f240112f.f240132l.get(intValue7) != null) {
                            arrayList3.add(Integer.valueOf(intValue7));
                        } else {
                            arrayList4.add(Integer.valueOf(intValue7));
                        }
                    }
                    C88760ae aeVar4 = acVar.f240112f;
                    for (int i6 = 0; i6 < acVar.f240112f.f240132l.size(); i6++) {
                        int keyAt2 = acVar.f240112f.f240132l.keyAt(i6);
                        if (acVar.f240108b.get(keyAt2) == null) {
                            arrayList2.add(Integer.valueOf(keyAt2));
                        }
                    }
                    LayoutTransition layoutTransition = acVar.f240112f.f240135o.getLayoutTransition();
                    if (layoutTransition != null && layoutTransition.isTransitionTypeEnabled(1) && !arrayList2.isEmpty() && arrayList4.contains(C41669ai.f108954c)) {
                        layoutTransition.disableTransitionType(1);
                        acVar.f240111e = true;
                    }
                    acVar.f240109c.addAll(arrayList2);
                    if (!acVar.f240109c.isEmpty() && !arrayList3.isEmpty()) {
                        acVar.f240109c.add(-1);
                    }
                    acVar.f240109c.addAll(arrayList3);
                    if (!acVar.f240109c.isEmpty() && !arrayList4.isEmpty()) {
                        acVar.f240109c.add(-1);
                    }
                    acVar.f240109c.addAll(arrayList4);
                }
                C58976aa aaVar = C58975e.f156826a;
                List list4 = acVar.f240109c;
                List list5 = acVar.f240110d;
                while (!acVar.f240110d.isEmpty()) {
                    int intValue8 = ((Integer) acVar.f240110d.remove(0)).intValue();
                    acVar.f240112f.mo82496r(intValue8);
                    acVar.f240112f.mo82497s(intValue8, (List) null, acVar.f240107a, false);
                    if (acVar.f240108b.get(intValue8) != null) {
                        acVar.f240112f.mo82496r(intValue8);
                    }
                }
                while (!acVar.f240109c.isEmpty()) {
                    int intValue9 = ((Integer) acVar.f240109c.remove(0)).intValue();
                    if (intValue9 != -1) {
                        acVar.f240112f.mo82496r(intValue9);
                        acVar.f240112f.mo82497s(intValue9, (List) acVar.f240108b.get(intValue9), acVar.f240107a, false);
                    }
                }
                if (acVar.f240111e && acVar.f240112f.f240135o.getLayoutTransition() != null) {
                    acVar.f240112f.f240135o.getLayoutTransition().enableTransitionType(1);
                    acVar.f240111e = false;
                }
                C88756aa aaVar2 = acVar.f240112f.f240141u;
                Response response2 = acVar.f240107a;
                aaVar2.f240102a = response2;
                if (response2 == null || response2.f108862b.isEmpty()) {
                    aaVar2.mo82481a();
                }
                acVar.mo82485a();
                C88760ae aeVar5 = acVar.f240112f;
                aeVar5.f240138r = false;
                Response response3 = aeVar5.f240139s;
                if (response3 != null) {
                    aeVar5.mo82495q(response3);
                }
            }
            C58976aa aaVar3 = C58975e.f156826a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo82496r(int i) {
        C88786t tVar;
        C88786t j = mo82488j(i);
        if (j == null) {
            Context context = this.f240135o.getContext();
            if (this.f240120E.mo82433a(i).f240287M) {
                tVar = new C88773g(i, context);
            } else {
                tVar = new C88771e(i, context);
            }
            j = tVar;
            j.mo82185d(this.f240119D);
            j.mo82217hD(this.f240120E);
            if (j instanceof View) {
                C28295m.m52919e((View) j, new C28292j(20368));
            }
            this.f240131k.put(i, j);
        }
        j.mo82522k();
    }

    /* renamed from: s */
    public final void mo82497s(int i, List list, Response response, boolean z) {
        C88761af afVar;
        C58838bb.m90883r(i >= 0);
        String str = response.f108865e;
        C58976aa aaVar = C58975e.f156826a;
        Integer valueOf = Integer.valueOf(i);
        if (this.f240127g.mo84225b()) {
            C91030n.m148695a("SuggestionsBoxController.renderSuggestions", this.f240127g);
        }
        C88786t j = mo82488j(i);
        j.getClass();
        if (this.f240136p && (afVar = this.f240137q) != null) {
            afVar.mo82501a(this.f240135o, str);
        }
        ViewGroup viewGroup = (ViewGroup) j;
        if (viewGroup.getParent() == null) {
            int indexOf = this.f240133m.indexOf(valueOf);
            if (this.f240120E.f239879e) {
                indexOf = this.f240135o.getChildCount() - indexOf;
            }
            this.f240135o.addView(viewGroup, indexOf);
        }
        if (list == null || list.isEmpty()) {
            this.f240132l.remove(i);
            if (!(this.f240144x.size() == 0 || viewGroup.getParent() == null)) {
                ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Suggestion suggestion = (Suggestion) it.next();
                if (!z) {
                    m143904x(j, suggestion);
                } else {
                    if (suggestion.f108914o == 3) {
                        m143904x(j, suggestion);
                    }
                    if (suggestion.f108914o == 3) {
                        break;
                    }
                }
            }
            this.f240132l.put(i, list);
        }
        int c = j.mo82513c();
        if (list != null && !list.isEmpty()) {
            C58801sm G = ((C58485gu) this.f240124d).listIterator(0);
            while (G.hasNext()) {
                C88843w wVar = (C88843w) G.next();
                if (wVar.mo82340b(c)) {
                    j.mo82516g(wVar.mo82628c(c, list, response, this.f240120E).mo82337a());
                }
            }
            C58801sm G2 = ((C58485gu) this.f240125e).listIterator(0);
            while (G2.hasNext()) {
                C88843w wVar2 = (C88843w) G2.next();
                if (wVar2.mo82340b(c)) {
                    j.mo82515f(wVar2.mo82628c(c, list, response, this.f240120E).mo82337a());
                }
            }
        }
        j.mo82520i();
        mo82498t();
        if (this.f240127g.mo84225b()) {
            C91030n.m148696b(this.f240127g);
        }
    }

    /* renamed from: t */
    public final void mo82498t() {
        C91110i iVar = this.f240130j;
        int i = iVar.f254420b;
        int i2 = iVar.f254422d;
        int i3 = iVar.f254423e;
        C88786t tVar = null;
        for (int i4 = 0; i4 < this.f240133m.size(); i4++) {
            C88786t tVar2 = (C88786t) this.f240131k.get(((Integer) this.f240133m.get(i4)).intValue());
            if (tVar2 != null && ((ViewGroup) tVar2).getVisibility() == 0) {
                if (tVar != null) {
                    tVar.mo82491m(new C91110i(i, tVar2.mo82487b(130), tVar2.mo82487b(2)));
                    i = tVar.mo82487b(33);
                }
                tVar = tVar2;
            }
        }
        if (tVar != null) {
            C91110i iVar2 = this.f240130j;
            tVar.mo82491m(new C91110i(i, iVar2.f254421c, iVar2.f254424f));
        }
    }

    /* renamed from: u */
    public final boolean mo82499u() {
        return this.f240135o != null;
    }

    /* renamed from: v */
    public final boolean mo82500v(ViewParent viewParent) {
        return this.f240135o != null && (viewParent instanceof LinearLayout);
    }
}
