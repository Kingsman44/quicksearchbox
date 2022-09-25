package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87439c;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class ArgumentContainerView extends LinearLayout implements C93584ch, C93665v {

    /* renamed from: a */
    protected C93524ab f260983a;

    /* renamed from: b */
    protected boolean f260984b = false;

    /* renamed from: c */
    protected List f260985c;

    /* renamed from: d */
    public C93602cz f260986d;

    /* renamed from: e */
    public C93545aw f260987e;

    /* renamed from: f */
    public C93666w f260988f;

    /* renamed from: g */
    private LayoutInflater f260989g;

    /* renamed from: h */
    private final List f260990h = new ArrayList();

    /* renamed from: i */
    private final C87439c f260991i = new C93655l(this);

    public ArgumentContainerView(Context context) {
        super(context);
    }

    /* renamed from: n */
    private final List m154052n(List list, C88511e eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Argument argument = (Argument) it.next();
            C93666w o = mo87847h(eVar).mo87938o(argument);
            o.f261445k = this;
            o.f261451q = this.f260987e;
            m154055q(o, argument);
            arrayList.add(o);
        }
        return arrayList;
    }

    /* renamed from: o */
    private final List m154053o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C93666w) {
                arrayList.add((C93666w) childAt);
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    private final void m154054p(TransitionSet transitionSet, int i, Interpolator interpolator) {
        C93617dn c = C93632eb.m154488c(i, getResources().getDisplayMetrics(), this);
        if (interpolator != null) {
            c.setInterpolator(interpolator);
        }
        Object[] objArr = {this};
        TransitionSet a = C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), objArr);
        transitionSet.addTransition(c);
        transitionSet.addTransition(a);
    }

    /* renamed from: q */
    private final void m154055q(C93666w wVar, Argument argument) {
        argument.mo81270J(this.f260991i);
        C93602cz czVar = this.f260986d;
        czVar.getClass();
        wVar.f261450p = czVar.mo82062y();
        C93602cz czVar2 = this.f260986d;
        czVar2.getClass();
        wVar.f261453s = czVar2.mo88043al();
        C93602cz czVar3 = this.f260986d;
        czVar3.getClass();
        boolean z = false;
        wVar.mo87731e(!(((ModularAction) czVar3.f239226b).f235985a.mo81118g() || ((ModularAction) czVar3.f239226b).f235985a.mo81121i()));
        C93602cz czVar4 = this.f260986d;
        czVar4.getClass();
        wVar.f261455u = czVar4.mo82039ao().f236265s;
        C93602cz czVar5 = this.f260986d;
        czVar5.getClass();
        CardDecision ao = czVar5.mo82039ao();
        boolean z2 = ao.f236261o.contains(Integer.valueOf(wVar.f261447m.f236140a)) && ao.f236254h;
        wVar.f261452r = z2;
        if (z2 && !ao.mo81422g()) {
            z = true;
        }
        wVar.f261446l = z ? ao.f236249c : null;
        if (z) {
            this.f260988f = wVar;
        }
        wVar.mo87732f();
    }

    public final void addView(View view) {
        super.addView(view);
        if (view instanceof C93666w) {
            this.f260990h.addAll(((C93666w) view).mo87858n());
        }
    }

    /* renamed from: b */
    public final List mo87839b() {
        return this.f260990h;
    }

    /* renamed from: c */
    public void mo87840c(int i, int i2, C88511e eVar) {
        if (!this.f260984b && i == 2 && i2 == 1) {
            this.f260985c = mo87848i(eVar);
        }
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f260986d = czVar;
    }

    /* renamed from: e */
    public void mo87842e(int i, C88511e eVar) {
        if (mo87852m(i)) {
            setVisibility(0);
            C93602cz czVar = this.f260986d;
            czVar.getClass();
            mo87851l(((ModularAction) czVar.f239226b).mo81222ab(), eVar);
            return;
        }
        setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final LayoutInflater mo87845f() {
        if (this.f260989g == null) {
            this.f260989g = (LayoutInflater) getContext().getSystemService("layout_inflater");
        }
        return this.f260989g;
    }

    /* renamed from: g */
    public final C93666w mo87846g(Argument argument) {
        for (C93666w wVar : m154053o()) {
            if (wVar.f261447m.f236140a == argument.f236140a) {
                return wVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C93524ab mo87847h(C88511e eVar) {
        if (this.f260983a == null) {
            Context context = getContext();
            LayoutInflater f = mo87845f();
            C93602cz czVar = this.f260986d;
            czVar.getClass();
            this.f260983a = new C93606dc(context, f, this, eVar, czVar, this.f260987e);
        }
        return this.f260983a;
    }

    /* renamed from: iM */
    public Pair mo87843iM(int i, int i2) {
        List list;
        TransitionSet transitionSet = new TransitionSet();
        TransitionSet transitionSet2 = new TransitionSet();
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.addTarget(childAt);
            changeBounds.setDuration(500);
            changeBounds.setInterpolator(C91107f.f254408d);
            transitionSet.addTransition(changeBounds);
            if (childAt instanceof C93666w) {
                C93666w wVar = (C93666w) childAt;
                if (!wVar.mo87916t() && i2 == i) {
                    C93662s sVar = new C93662s(getResources().getDimensionPixelSize(R.dimen.modular_action_contact_image_small_size));
                    sVar.addTarget(wVar);
                    transitionSet2.addTransition(sVar);
                    z = true;
                }
            }
        }
        if (z) {
            transitionSet.addTransition(transitionSet2);
        }
        if (i2 == 1) {
            if (i == 2) {
                if (this.f260984b || (list = this.f260985c) == null) {
                    m154054p(transitionSet, -1, C91107f.f254409e);
                } else {
                    C93632eb.m154490e(Collections.unmodifiableList(list), transitionSet, getResources().getDisplayMetrics());
                }
                return new Pair(transitionSet, (Object) null);
            }
        } else if (i2 == 4) {
            m154054p(transitionSet, -1, (Interpolator) null);
            return new Pair(transitionSet, (Object) null);
        }
        m154054p(transitionSet, 1, (Interpolator) null);
        return new Pair(transitionSet, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo87851l(List list, C88511e eVar) {
        List<C93666w> list2;
        this.f260988f = null;
        int childCount = getChildCount();
        if (list.size() == childCount) {
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                if (!(childAt instanceof C93666w)) {
                    break;
                }
                C93666w wVar = (C93666w) childAt;
                Argument argument = wVar.f261447m;
                Argument argument2 = (Argument) list.get(i);
                if (argument == null || argument2.getClass() != argument.getClass() || argument2.f236140a != argument.f236140a) {
                    break;
                }
                wVar.mo88129p(argument2);
                m154055q(wVar, argument2);
                i++;
            }
            this.f260984b = true;
        }
        removeAllViews();
        if (this.f260984b || (list2 = this.f260985c) == null) {
            list2 = m154052n(list, eVar);
        }
        for (C93666w addView : list2) {
            addView(addView);
        }
        this.f260984b = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo87852m(int i) {
        return i == 1 || i == 5;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (C93666w wVar : m154053o()) {
            Argument argument = wVar.f261447m;
            if (argument != null) {
                argument.mo81271K(this.f260991i);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        this.f260990h.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final List mo87848i(C88511e eVar) {
        C93602cz czVar = this.f260986d;
        czVar.getClass();
        return m154052n(((ModularAction) czVar.f239226b).mo81222ab(), eVar);
    }

    /* renamed from: j */
    public final void mo87849j() {
        C93602cz czVar = this.f260986d;
        czVar.getClass();
        czVar.mo82050m(1, 3);
    }

    /* renamed from: k */
    public final void mo87850k() {
        C93602cz czVar = this.f260986d;
        czVar.getClass();
        czVar.mo82050m(1, 3);
    }

    public ArgumentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ArgumentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
