package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p033v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.SpinnerComponent */
/* compiled from: PG */
public class SpinnerComponent extends AppCompatSpinner {

    /* renamed from: f */
    private static final C59071e f36870f = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.components.SpinnerComponent");

    /* renamed from: e */
    public C11339f f36871e;

    public SpinnerComponent(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final void mo19803c(View view, boolean z, boolean z2) {
        int i;
        if (view != null) {
            if (z) {
                i = C11307e.m26908a(getContext(), R.attr.fluid_actions_error_color);
            } else if (z2) {
                i = C11307e.m26908a(getContext(), R.attr.fluid_actions_highlight_field_color);
            } else {
                i = C11307e.m26908a(getContext(), R.attr.fluid_actions_nonhighlight_field_color);
            }
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            } else if (view instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) view;
                for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                    ((TextView) linearLayout.getChildAt(i2)).setTextColor(i);
                }
            } else {
                ((C59052c) ((C59052c) f36870f.mo56225c()).mo56372aa(43185)).mo56386p("updateSelectedItemViewColor: spinnerSelectedItemView is expected to be either TextView or LinearLayout.");
            }
            setBackgroundTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setSelection(int i) {
        super.setSelection(i);
        C11339f fVar = this.f36871e;
        if (fVar != null) {
            fVar.mo19808a(i);
        }
    }

    public SpinnerComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpinnerComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
