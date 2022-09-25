package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* compiled from: PG */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public final Chip f117470a;

    /* renamed from: b */
    public final TextInputLayout f117471b;

    /* renamed from: c */
    private final EditText f117472c;

    /* renamed from: d */
    private TextWatcher f117473d;

    /* renamed from: e */
    private TextView f117474e;

    public ChipTextInputComboView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private final void m79937c() {
        this.f117472c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    /* renamed from: a */
    public final void mo48611a(InputFilter inputFilter) {
        InputFilter[] filters = this.f117472c.getFilters();
        int length = filters.length;
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, length + 1);
        inputFilterArr[length] = inputFilter;
        this.f117472c.setFilters(inputFilterArr);
    }

    /* renamed from: b */
    public final void mo48612b(CharSequence charSequence) {
        this.f117470a.setText(TimeModel.m79949c(getResources(), charSequence, "%02d"));
        if (!TextUtils.isEmpty(this.f117472c.getText())) {
            this.f117472c.removeTextChangedListener(this.f117473d);
            this.f117472c.setText((CharSequence) null);
            this.f117472c.addTextChangedListener(this.f117473d);
        }
    }

    public final boolean isChecked() {
        return this.f117470a.isChecked();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m79937c();
    }

    public final void setChecked(boolean z) {
        this.f117470a.setChecked(z);
        int i = 0;
        this.f117472c.setVisibility(true != z ? 4 : 0);
        Chip chip = this.f117470a;
        if (true == z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (this.f117470a.isChecked()) {
            C44741bm.m79316i(this.f117472c);
            if (!TextUtils.isEmpty(this.f117472c.getText())) {
                EditText editText = this.f117472c;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f117470a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.f117470a.setTag(i, obj);
    }

    public final void toggle() {
        this.f117470a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f117470a = chip;
        chip.f116097h = "android.view.View";
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        this.f117471b = textInputLayout;
        EditText editText = textInputLayout.f117309c;
        this.f117472c = editText;
        editText.setVisibility(4);
        C44966a aVar = new C44966a(this);
        this.f117473d = aVar;
        editText.addTextChangedListener(aVar);
        m79937c();
        addView(chip);
        addView(textInputLayout);
        this.f117474e = (TextView) findViewById(R.id.material_label);
        editText.setId(C2043bi.m5574c());
        C2043bi.m5553ag(this.f117474e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
