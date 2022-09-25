package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: com.google.android.material.timepicker.w */
/* compiled from: PG */
final class C44999w implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    public final ChipTextInputComboView f117595a;

    /* renamed from: b */
    public final ChipTextInputComboView f117596b;

    /* renamed from: c */
    private final TimeModel f117597c;

    /* renamed from: d */
    private boolean f117598d = false;

    public C44999w(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f117595a = chipTextInputComboView;
        this.f117596b = chipTextInputComboView2;
        this.f117597c = timeModel;
    }

    /* renamed from: a */
    private final void m79987a(int i) {
        boolean z = true;
        this.f117596b.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f117595a;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        this.f117597c.f117516f = i;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            m79987a(12);
        }
        return z;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f117598d) {
            return false;
        }
        boolean z = true;
        this.f117598d = true;
        EditText editText = (EditText) view;
        if (this.f117597c.f117516f != 12) {
            Editable text = editText.getText();
            if (text != null && i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                m79987a(12);
                this.f117598d = false;
                return z;
            }
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            m79987a(10);
            this.f117598d = false;
            return z;
        }
        z = false;
        this.f117598d = false;
        return z;
    }
}
