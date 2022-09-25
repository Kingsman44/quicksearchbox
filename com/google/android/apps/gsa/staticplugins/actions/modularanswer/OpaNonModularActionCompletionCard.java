package com.google.android.apps.gsa.staticplugins.actions.modularanswer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.shared.util.p7159c.C90879am;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60870cx;

/* compiled from: PG */
public class OpaNonModularActionCompletionCard extends LinearLayout implements C73867g {

    /* renamed from: a */
    public TextView f260523a;

    /* renamed from: b */
    public ImageView f260524b;

    /* renamed from: c */
    public String f260525c;

    public OpaNonModularActionCompletionCard(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        return caVar.mo85138c(new C90879am("OpaNonModularActionCompletionCard#ActionCardHistoryProtoTask", 1, 8, new C93410d(this)));
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f260523a = (TextView) findViewById(R.id.opa_non_modular_action_confirmation_card_primary_text);
        this.f260524b = (ImageView) findViewById(R.id.opa_non_modular_action_confirmation_card_image_view);
    }

    public OpaNonModularActionCompletionCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OpaNonModularActionCompletionCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
