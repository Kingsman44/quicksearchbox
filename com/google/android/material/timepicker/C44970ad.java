package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* renamed from: com.google.android.material.timepicker.ad */
/* compiled from: PG */
final class C44970ad implements C44977ak, C44998v {

    /* renamed from: a */
    public final TimeModel f117531a;

    /* renamed from: b */
    public final ChipTextInputComboView f117532b;

    /* renamed from: c */
    public final ChipTextInputComboView f117533c;

    /* renamed from: d */
    private final LinearLayout f117534d;

    /* renamed from: e */
    private final TextWatcher f117535e = new C45001y(this);

    /* renamed from: f */
    private final TextWatcher f117536f = new C45002z(this);

    /* renamed from: g */
    private final C44999w f117537g;

    /* renamed from: h */
    private final EditText f117538h;

    /* renamed from: i */
    private final EditText f117539i;

    /* renamed from: j */
    private MaterialButtonToggleGroup f117540j;

    public C44970ad(LinearLayout linearLayout, TimeModel timeModel) {
        this.f117534d = linearLayout;
        this.f117531a = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f117532b = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f117533c = chipTextInputComboView2;
        ((TextView) chipTextInputComboView.findViewById(R.id.material_label)).setText(resources.getString(R.string.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(R.id.material_label)).setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.f117470a.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.f117470a.setTag(R.id.selection_type, 10);
        if (timeModel.f117513c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.f117540j = materialButtonToggleGroup;
            materialButtonToggleGroup.f115983a.add(new C45000x(this));
            this.f117540j.setVisibility(0);
            m79959g();
        }
        C44967aa aaVar = new C44967aa(this);
        chipTextInputComboView2.f117470a.setOnClickListener(aaVar);
        chipTextInputComboView.f117470a.setOnClickListener(aaVar);
        chipTextInputComboView2.mo48611a(timeModel.f117512b);
        chipTextInputComboView.mo48611a(timeModel.f117511a);
        this.f117538h = chipTextInputComboView2.f117471b.f117309c;
        this.f117539i = chipTextInputComboView.f117471b.f117309c;
        C44999w wVar = new C44999w(chipTextInputComboView2, chipTextInputComboView, timeModel);
        this.f117537g = wVar;
        C2043bi.m5526T(chipTextInputComboView2.f117470a, new C44968ab(linearLayout.getContext(), timeModel));
        C2043bi.m5526T(chipTextInputComboView.f117470a, new C44969ac(linearLayout.getContext(), timeModel));
        m79957d();
        m79958e(timeModel);
        TextInputLayout textInputLayout = wVar.f117595a.f117471b;
        TextInputLayout textInputLayout2 = wVar.f117596b.f117471b;
        EditText editText = textInputLayout.f117309c;
        EditText editText2 = textInputLayout2.f117309c;
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(wVar);
        editText.setOnKeyListener(wVar);
        editText2.setOnKeyListener(wVar);
    }

    /* renamed from: d */
    private final void m79957d() {
        this.f117538h.addTextChangedListener(this.f117536f);
        this.f117539i.addTextChangedListener(this.f117535e);
    }

    /* renamed from: e */
    private final void m79958e(TimeModel timeModel) {
        this.f117538h.removeTextChangedListener(this.f117536f);
        this.f117539i.removeTextChangedListener(this.f117535e);
        Locale locale = this.f117534d.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.f117515e)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.mo48629b())});
        this.f117532b.mo48612b(format);
        this.f117533c.mo48612b(format2);
        m79957d();
        m79959g();
    }

    /* renamed from: g */
    private final void m79959g() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f117540j;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.mo47572a(1 != this.f117531a.f117517g ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
        }
    }

    /* renamed from: a */
    public final void mo48639a(int i) {
        this.f117531a.f117516f = i;
        boolean z = true;
        this.f117532b.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f117533c;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        m79959g();
    }

    /* renamed from: b */
    public final void mo48640b() {
        View focusedChild = this.f117534d.getFocusedChild();
        if (focusedChild != null) {
            C44741bm.m79314g(focusedChild, true);
        }
        this.f117534d.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo48641c() {
        m79958e(this.f117531a);
    }

    /* renamed from: f */
    public final void mo48642f() {
        this.f117534d.setVisibility(0);
        mo48639a(this.f117531a.f117516f);
    }
}
