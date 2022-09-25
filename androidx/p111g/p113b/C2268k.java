package androidx.p111g.p113b;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.p111g.p112a.C2253a;

/* renamed from: androidx.g.b.k */
/* compiled from: PG */
public final class C2268k implements TextWatcher {

    /* renamed from: a */
    public boolean f6360a = true;

    /* renamed from: b */
    private final EditText f6361b;

    public C2268k(EditText editText) {
        this.f6361b = editText;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f6361b.isInEditMode() && this.f6360a) {
            C2253a aVar = C2253a.f6344b;
        }
    }
}
