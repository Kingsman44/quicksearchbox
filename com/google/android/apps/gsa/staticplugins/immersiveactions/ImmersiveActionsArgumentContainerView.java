package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.ArgumentContainerView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93524ab;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93545aw;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93666w;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.StringArgumentView;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;

/* compiled from: PG */
public class ImmersiveActionsArgumentContainerView extends ArgumentContainerView {
    public ImmersiveActionsArgumentContainerView(Context context) {
        super(context);
    }

    /* renamed from: o */
    private final void m169717o(Argument argument, C88511e eVar) {
        if (argument == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        mo87851l(C58485gu.m89846n(argument), eVar);
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        if (!this.f260984b && i == 2) {
            if (i2 == 1 || i2 == 9) {
                this.f260985c = mo87848i(eVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        Argument argument;
        super.mo87842e(i, eVar);
        if (i == 9) {
            C93602cz czVar = this.f260986d;
            czVar.getClass();
            m169717o(czVar.mo88013H(), eVar);
        } else if (i == 7) {
            C93602cz czVar2 = this.f260986d;
            czVar2.getClass();
            if (!czVar2.mo82039ao().mo81425i()) {
                C93602cz czVar3 = this.f260986d;
                czVar3.getClass();
                Iterator it = ((ModularAction) czVar3.f239226b).mo81222ab().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        argument = null;
                        break;
                    }
                    argument = (Argument) it.next();
                    C93602cz czVar4 = this.f260986d;
                    czVar4.getClass();
                    if (czVar4.mo82039ao().mo81417a() == argument.f236140a) {
                        break;
                    }
                }
                m169717o(argument, eVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C93524ab mo87847h(C88511e eVar) {
        if (this.f260983a == null) {
            Context context = getContext();
            LayoutInflater f = mo87845f();
            C93602cz czVar = this.f260986d;
            czVar.getClass();
            C93545aw awVar = this.f260987e;
            awVar.getClass();
            this.f260983a = new C102419i(context, f, this, eVar, czVar, awVar);
        }
        return this.f260983a;
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        boolean z;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(C102396ac.m169775a(getResources(), this));
        if (i2 == 2) {
            if (i != 1) {
                if (i == 9) {
                    i = 9;
                } else {
                    i2 = 2;
                }
            }
            i2 = 2;
            z = true;
            boolean z2 = i != 2 && (i2 == 1 || i2 == 9);
            if (!z || z2) {
                transitionSet.addTransition(C102396ac.m169776b(z, -1, getResources().getDisplayMetrics(), this));
            } else {
                transitionSet.addTransition(C93632eb.m154488c(-1, getResources().getDisplayMetrics(), this));
            }
            return new Pair(transitionSet, (Object) null);
        }
        z = false;
        if (i != 2) {
        }
        if (!z) {
        }
        transitionSet.addTransition(C102396ac.m169776b(z, -1, getResources().getDisplayMetrics(), this));
        return new Pair(transitionSet, (Object) null);
    }

    /* renamed from: n */
    public final void mo93184n(String str) {
        C93666w wVar = this.f260988f;
        if (wVar instanceof StringArgumentView) {
            StringArgumentView stringArgumentView = (StringArgumentView) wVar;
            ((StringArgument) stringArgumentView.f261447m).mo81334P(str);
            stringArgumentView.mo87732f();
        }
    }

    public ImmersiveActionsArgumentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImmersiveActionsArgumentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
