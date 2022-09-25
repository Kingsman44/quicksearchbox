package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.DisambiguationContent;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* compiled from: PG */
public class ImmersiveActionsDisambiguationContent extends DisambiguationContent {

    /* renamed from: j */
    public boolean f285722j;

    public ImmersiveActionsDisambiguationContent(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo87866f() {
        this.f285722j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo87867g(ProviderArgument providerArgument) {
        this.f261019f.mo87720b(new C102425o(this, providerArgument));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo87869i(Argument argument) {
        return Argument.m141690A(argument, this.f261020g) && argument.getClass().equals(this.f261020g.getClass());
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        boolean z;
        boolean z2;
        List list;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(C102396ac.m169775a(getResources(), this, Integer.valueOf(R.id.contact_details)));
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
            z2 = i != 2 && (i2 == 1 || i2 == 9);
            if (!z || z2) {
                transitionSet.addTransition(C102396ac.m169776b(z2, 1, getResources().getDisplayMetrics(), this));
            } else {
                transitionSet.addTransition(C93632eb.m154488c(1, getResources().getDisplayMetrics(), this));
            }
            list = this.f261022i;
            if (list != null && z) {
                C102396ac.m169777c(list, transitionSet, getResources().getDisplayMetrics());
            }
            return new Pair(transitionSet, (Object) null);
        }
        z = false;
        if (i != 2) {
        }
        if (!z) {
        }
        transitionSet.addTransition(C102396ac.m169776b(z2, 1, getResources().getDisplayMetrics(), this));
        list = this.f261022i;
        C102396ac.m169777c(list, transitionSet, getResources().getDisplayMetrics());
        return new Pair(transitionSet, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo87870j(Disambiguation disambiguation) {
        C93602cz czVar = this.f261015b;
        czVar.getClass();
        return czVar.mo88040ai() && disambiguation.mo81540h();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f261017d.f260792e = true;
        this.f261016c.f260792e = true;
        this.f261019f.f260792e = true;
        this.f261018e.mo87882q(true);
    }

    public ImmersiveActionsDisambiguationContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImmersiveActionsDisambiguationContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
