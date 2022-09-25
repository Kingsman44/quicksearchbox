package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93537ao;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ValyrianImmersiveActionsLabeledFooter extends ImmersiveActionsLabeledFooter {

    /* renamed from: i */
    private LinearLayout f285771i;

    public ValyrianImmersiveActionsLabeledFooter(Context context) {
        super(context);
        this.f261077g = 0;
        this.f261078h = 0;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        super.mo87842e(i, eVar);
        if (this.f285771i != null && this.f261071a.getVisibility() != 0) {
            this.f285771i.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C93537ao mo87893f() {
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        if (czVar.mo88042ak()) {
            return mo87894g();
        }
        C93537ao f = super.mo87893f();
        if (f != null) {
            f.f261181f = R.drawable.quantum_ic_contacts_product_grey600_24;
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (findViewById(R.id.labeled_confirm_bar_container) != null) {
            this.f285771i = (LinearLayout) findViewById(R.id.labeled_confirm_bar_container);
        }
    }

    public ValyrianImmersiveActionsLabeledFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f261077g = 0;
        this.f261078h = 0;
    }

    public ValyrianImmersiveActionsLabeledFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261077g = 0;
        this.f261078h = 0;
    }
}
