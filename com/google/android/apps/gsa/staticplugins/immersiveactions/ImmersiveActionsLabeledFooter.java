package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93537ao;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.ModularActionCardLabeledFooter;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ImmersiveActionsLabeledFooter extends ModularActionCardLabeledFooter {
    public ImmersiveActionsLabeledFooter(Context context) {
        super(context);
        this.f261077g = R.drawable.ic_exit_to_app_immersive_actions_medium_grey;
        this.f261078h = R.drawable.ic_exit_to_app_immersive_actions_medium_grey;
    }

    /* renamed from: e */
    public void mo87842e(int i, C88511e eVar) {
        super.mo87842e(i, eVar);
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        if (((ModularAction) czVar.f239226b).f235985a.mo81115e()) {
            this.f261073c.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C93537ao mo87893f() {
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        if (czVar.mo88042ak()) {
            return mo87894g();
        }
        return super.mo87893f();
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        TransitionSet transitionSet = new TransitionSet();
        mo87895h(i, i2, transitionSet);
        transitionSet.addTransition(C102396ac.m169775a(getResources(), this, this.f261073c, this.f261071a, this.f261072b));
        return new Pair(transitionSet, (Object) null);
    }

    public ImmersiveActionsLabeledFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f261077g = R.drawable.ic_exit_to_app_immersive_actions_medium_grey;
        this.f261078h = R.drawable.ic_exit_to_app_immersive_actions_medium_grey;
    }

    public ImmersiveActionsLabeledFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261077g = R.drawable.ic_exit_to_app_immersive_actions_medium_grey;
        this.f261078h = R.drawable.ic_exit_to_app_immersive_actions_medium_grey;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0020 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016 A[ADDED_TO_REGION] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87895h(int r6, int r7, android.transition.TransitionSet r8) {
        /*
            r5 = this;
            r0 = 9
            r1 = 0
            r2 = 1
            r3 = 2
            if (r7 != r3) goto L_0x0013
            if (r6 == r2) goto L_0x0010
            if (r6 != r0) goto L_0x000e
            r6 = 9
            goto L_0x0010
        L_0x000e:
            r7 = 2
            goto L_0x0013
        L_0x0010:
            r7 = 2
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r6 != r3) goto L_0x001c
            if (r7 == r2) goto L_0x001a
            if (r7 != r0) goto L_0x001d
        L_0x001a:
            r6 = 1
            goto L_0x001e
        L_0x001c:
            r3 = r6
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r4 != 0) goto L_0x0027
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            super.mo87895h(r7, r3, r8)
            return
        L_0x0027:
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r5
            com.google.android.apps.gsa.staticplugins.actionsui.modular.dn r6 = com.google.android.apps.gsa.staticplugins.immersiveactions.C102396ac.m169776b(r6, r2, r7, r0)
            r8.addTransition(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsLabeledFooter.mo87895h(int, int, android.transition.TransitionSet):void");
    }
}
