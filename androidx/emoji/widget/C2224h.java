package androidx.emoji.widget;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji.p108a.C2196f;
import androidx.emoji.p108a.C2200j;

/* renamed from: androidx.emoji.widget.h */
/* compiled from: PG */
final class C2224h implements TextWatcher {

    /* renamed from: a */
    public int f6280a = Integer.MAX_VALUE;

    /* renamed from: b */
    private final EditText f6281b;

    /* renamed from: c */
    private C2196f f6282c;

    public C2224h(EditText editText) {
        this.f6281b = editText;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f6281b.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int a = C2200j.m6088b().mo5512a();
            if (a != 0) {
                if (a == 1) {
                    C2200j.m6088b().mo5516f((Spannable) charSequence, i, i3 + i, this.f6280a);
                    return;
                } else if (a != 3) {
                    return;
                }
            }
            C2200j b = C2200j.m6088b();
            if (this.f6282c == null) {
                this.f6282c = new C2223g(this.f6281b);
            }
            b.mo5513c(this.f6282c);
        }
    }
}
