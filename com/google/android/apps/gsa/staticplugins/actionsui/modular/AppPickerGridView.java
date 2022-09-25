package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.staticplugins.actionsui.C93443aj;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class AppPickerGridView extends C93443aj implements C93584ch {

    /* renamed from: a */
    public C93602cz f260979a;

    /* renamed from: b */
    public List f260980b = new ArrayList();

    /* renamed from: c */
    public C93653j f260981c = new C93653j(this);

    /* renamed from: d */
    private C93533ak f260982d;

    public AppPickerGridView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        if (i2 == 3 && getVisibility() != 0) {
            setVisibility(4);
        }
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f260979a = czVar;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        if (i == 3) {
            if (this.f260982d == null) {
                C93533ak akVar = new C93533ak(getContext(), this.f260980b, eVar);
                this.f260982d = akVar;
                setAdapter(akVar);
                setChoiceMode(1);
                setVerticalScrollBarEnabled(false);
                setOnItemClickListener(new C93654k(this));
            }
            setVisibility(0);
            this.f260980b.clear();
            List list = this.f260980b;
            C93602cz czVar = this.f260979a;
            czVar.getClass();
            list.addAll(((ModularActionMatchingProviderInfo) ((ModularAction) czVar.f239226b).f235986b).f236270h.f236312a);
            this.f260982d.notifyDataSetChanged();
            List list2 = this.f260980b;
            C93602cz czVar2 = this.f260979a;
            czVar2.getClass();
            setItemChecked(list2.indexOf(czVar2.mo88014I()), true);
            return;
        }
        setVisibility(8);
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        TransitionSet transitionSet = new TransitionSet();
        C93617dn c = C93632eb.m154488c(-1, getResources().getDisplayMetrics(), this);
        Object[] objArr = {this};
        TransitionSet a = C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), objArr);
        transitionSet.addTransition(c);
        transitionSet.addTransition(a);
        return new Pair(transitionSet, (Object) null);
    }

    public AppPickerGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppPickerGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
