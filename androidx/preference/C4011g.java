package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: androidx.preference.g */
/* compiled from: PG */
public class C4011g extends C4030z {

    /* renamed from: a */
    private EditText f12869a;

    /* renamed from: b */
    private CharSequence f12870b;

    /* renamed from: c */
    private final Runnable f12871c = new C4010f(this);

    /* renamed from: d */
    private long f12872d = -1;

    /* renamed from: g */
    private final void m11525g(boolean z) {
        this.f12872d = z ? SystemClock.currentThreadTimeMillis() : -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8452a(View view) {
        super.mo8452a(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f12869a = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f12869a.setText(this.f12870b);
            EditText editText2 = this.f12869a;
            editText2.setSelection(editText2.getText().length());
            EditTextPreference editTextPreference = (EditTextPreference) mo8475f();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* renamed from: b */
    public void mo8453b(boolean z) {
        if (z) {
            String obj = this.f12869a.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) mo8475f();
            if (editTextPreference.mo8351R(obj)) {
                editTextPreference.mo8323j(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8454c() {
        m11525g(true);
        mo8455d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8455d() {
        long j = this.f12872d;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.f12869a;
            if (editText == null || !editText.isFocused()) {
                m11525g(false);
            } else if (((InputMethodManager) this.f12869a.getContext().getSystemService("input_method")).showSoftInput(this.f12869a, 0)) {
                m11525g(false);
            } else {
                this.f12869a.removeCallbacks(this.f12871c);
                this.f12869a.postDelayed(this.f12871c, 50);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo8456e() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f12870b = ((EditTextPreference) mo8475f()).f12703g;
        } else {
            this.f12870b = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f12870b);
    }
}
