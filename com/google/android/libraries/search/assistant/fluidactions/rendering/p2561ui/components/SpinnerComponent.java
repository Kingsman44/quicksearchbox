package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p033v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.SpinnerComponent */
/* compiled from: PG */
public final class SpinnerComponent extends AppCompatSpinner {

    /* renamed from: f */
    private static final C59071e f88972f = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.SpinnerComponent");

    /* renamed from: e */
    public C33266g f88973e;

    public SpinnerComponent(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final void mo38668c(View view, boolean z, boolean z2) {
        int i;
        if (view != null) {
            if (z) {
                i = C19391a.m36980a(getContext(), R.attr.colorError);
            } else if (z2) {
                i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
            } else {
                i = C19391a.m36980a(getContext(), R.attr.colorOnSurface);
            }
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            } else if (view instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) view;
                for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                    ((TextView) linearLayout.getChildAt(i2)).setTextColor(i);
                }
            } else {
                ((C59052c) ((C59052c) f88972f.mo56225c()).mo56372aa(50982)).mo56386p("updateSelectedItemViewColor: spinnerSelectedItemView is expected to be either TextView or LinearLayout.");
            }
            setBackgroundTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setSelection(int i) {
        super.setSelection(i);
        C33266g gVar = this.f88973e;
        if (gVar != null) {
            gVar.mo38673a(i);
        }
    }

    public SpinnerComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpinnerComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
