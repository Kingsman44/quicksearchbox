package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.p043a.p044a.C0782b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.FooterLayout */
/* compiled from: PG */
public class FooterLayout extends FrameLayout {

    /* renamed from: a */
    private final int f228716a;

    /* renamed from: b */
    private boolean f228717b;

    public FooterLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final Button mo77360a() {
        return (Button) findViewById(R.id.opa_error_action_button);
    }

    /* renamed from: b */
    public final Button mo77361b() {
        return (Button) findViewById(R.id.opa_error_cancel_button);
    }

    /* renamed from: c */
    public final void mo77362c(int i) {
        removeAllViews();
        this.f228717b = false;
        switch (i) {
            case 0:
                return;
            case 1:
                View.inflate(getContext(), this.f228716a, this);
                mo77360a().setVisibility(0);
                mo77361b().setVisibility(8);
                return;
            case 2:
                View.inflate(getContext(), this.f228716a, this);
                mo77360a().setVisibility(0);
                mo77361b().setVisibility(0);
                return;
            case 3:
                View.inflate(getContext(), R.layout.footer_progress_bar, this);
                return;
            case 4:
                View.inflate(getContext(), this.f228716a, this);
                mo77360a().setVisibility(8);
                mo77361b().setVisibility(0);
                return;
            case 5:
                View.inflate(new C0782b(getContext(), 2132148450), R.layout.footer_scroll_button, this);
                return;
            case 6:
                View.inflate(getContext(), this.f228716a == R.layout.footer_cancel_and_action_material_button ? R.layout.footer_cancel_and_action_material_button_stacked : R.layout.footer_cancel_and_action_button_stacked, this);
                mo77360a().setVisibility(0);
                mo77361b().setVisibility(0);
                return;
            default:
                throw new IllegalArgumentException("Unknown footer type: " + i);
        }
    }

    /* renamed from: d */
    public final void mo77363d(boolean z) {
        if (this.f228717b != z) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.opa_button_container);
            int indexOfChild = viewGroup.indexOfChild(mo77361b());
            viewGroup.removeViewAt(indexOfChild);
            int i = this.f228716a;
            if (i == R.layout.footer_cancel_and_action_material_button || i == R.layout.footer_cancel_and_action_material_button_stacked) {
                viewGroup.addView(LayoutInflater.from(getContext()).inflate(true != z ? R.layout.footer_flat_cancel_material_button : R.layout.footer_raised_cancel_material_button, this, false), indexOfChild);
            } else {
                viewGroup.addView(LayoutInflater.from(getContext()).inflate(true != z ? R.layout.footer_flat_cancel_button : R.layout.footer_raised_cancel_button, this, false), indexOfChild);
            }
            viewGroup.setPadding((int) getContext().getResources().getDimension(z ? R.dimen.opa_error_footer_margin_end : R.dimen.opa_error_footer_margin_start), viewGroup.getPaddingTop(), (int) getContext().getResources().getDimension(R.dimen.opa_error_footer_margin_end), viewGroup.getPaddingBottom());
            this.f228717b = z;
        }
    }

    public FooterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedValue typedValue = new TypedValue();
        this.f228716a = context.getTheme().resolveAttribute(R.attr.buttonFooterLayout, typedValue, true) ? typedValue.resourceId : R.layout.footer_cancel_and_action_button;
    }
}
