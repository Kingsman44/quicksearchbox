package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.textfield.aj */
/* compiled from: PG */
final class C44929aj extends C44963z {

    /* renamed from: a */
    public EditText f117378a;

    /* renamed from: b */
    private int f117379b = R.drawable.design_password_eye;

    /* renamed from: c */
    private final View.OnClickListener f117380c = new C44928ai(this);

    public C44929aj(C44962y yVar, int i) {
        super(yVar);
        if (i != 0) {
            this.f117379b = i;
        }
    }

    /* renamed from: a */
    public final int mo48530a() {
        return R.string.password_toggle_content_description;
    }

    /* renamed from: b */
    public final int mo48531b() {
        return this.f117379b;
    }

    /* renamed from: c */
    public final View.OnClickListener mo48532c() {
        return this.f117380c;
    }

    /* renamed from: g */
    public final void mo48533g(EditText editText) {
        this.f117378a = editText;
        mo48610x();
    }

    /* renamed from: i */
    public final void mo48534i() {
        EditText editText = this.f117378a;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f117378a.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: j */
    public final void mo48535j() {
        EditText editText = this.f117378a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: k */
    public final boolean mo48536k() {
        EditText editText = this.f117378a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: s */
    public final boolean mo48537s() {
        return true;
    }

    /* renamed from: t */
    public final boolean mo48538t() {
        return !mo48536k();
    }

    /* renamed from: y */
    public final void mo48539y() {
        mo48610x();
    }
}
