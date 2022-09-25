package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.material.textfield.aq */
/* compiled from: PG */
public final class C44936aq extends C2061c {

    /* renamed from: a */
    private final TextInputLayout f117396a;

    public C44936aq(TextInputLayout textInputLayout) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f117396a = textInputLayout;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        TextView textView;
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        EditText editText = this.f117396a.f117309c;
        CharSequence charSequence = null;
        Editable text = editText != null ? editText.getText() : null;
        CharSequence c = this.f117396a.mo48464c();
        CharSequence b = this.f117396a.mo48463b();
        TextInputLayout textInputLayout = this.f117396a;
        CharSequence charSequence2 = textInputLayout.f117316j ? textInputLayout.f117315i : null;
        int i = textInputLayout.f117312f;
        if (textInputLayout.f117311e && textInputLayout.f117313g && (textView = textInputLayout.f117314h) != null) {
            charSequence = textView.getContentDescription();
        }
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(c);
        boolean z3 = !this.f117396a.f117322p;
        boolean z4 = !TextUtils.isEmpty(b);
        boolean z5 = z4 || !TextUtils.isEmpty(charSequence);
        String obj = z2 ? c.toString() : BuildConfig.FLAVOR;
        C44931al alVar = this.f117396a.f117283a;
        if (alVar.f117384a.getVisibility() == 0) {
            kVar.f5921a.setLabelFor(alVar.f117384a);
            kVar.f5921a.setTraversalAfter(alVar.f117384a);
        } else {
            kVar.f5921a.setTraversalAfter(alVar.f117386c);
        }
        if (z) {
            kVar.f5921a.setText(text);
        } else if (!TextUtils.isEmpty(obj)) {
            kVar.f5921a.setText(obj);
            if (z3 && charSequence2 != null) {
                kVar.f5921a.setText(obj + ", " + charSequence2.toString());
            }
        } else if (charSequence2 != null) {
            kVar.f5921a.setText(charSequence2);
        }
        if (!TextUtils.isEmpty(obj)) {
            kVar.f5921a.setHintText(obj);
            kVar.f5921a.setShowingHintText(!z);
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        kVar.f5921a.setMaxTextLength(i);
        if (z5) {
            if (true != z4) {
                b = charSequence;
            }
            kVar.f5921a.setError(b);
        }
        TextView textView2 = this.f117396a.f117310d.f117349j;
        if (textView2 != null) {
            kVar.f5921a.setLabelFor(textView2);
        }
        this.f117396a.f117308b.mo48591a().mo48586v(kVar);
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        TextInputLayout textInputLayout = this.f117396a;
        int i = TextInputLayout.f117258t;
        textInputLayout.f117308b.mo48591a().mo48587w(accessibilityEvent);
    }
}
