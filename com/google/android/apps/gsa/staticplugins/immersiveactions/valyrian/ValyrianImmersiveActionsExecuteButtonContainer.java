package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ValyrianImmersiveActionsExecuteButtonContainer extends FrameLayout {

    /* renamed from: a */
    private TextView f285868a;

    public ValyrianImmersiveActionsExecuteButtonContainer(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo93232a(int i, C93602cz czVar) {
        if (i != 1 ? i != 9 : !((ModularAction) czVar.f239226b).mo81133M()) {
            this.f285868a.setEnabled(false);
            this.f285868a.setFocusable(false);
            return;
        }
        this.f285868a.setAlpha(1.0f);
        this.f285868a.setEnabled(true);
        this.f285868a.setFocusable(true);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.valyrian_immersive_actions_confirm_text_button);
        textView.getClass();
        this.f285868a = textView;
        textView.requestFocus();
        C89941l.m146512c(this.f285868a, 21991);
    }

    public ValyrianImmersiveActionsExecuteButtonContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ValyrianImmersiveActionsExecuteButtonContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
