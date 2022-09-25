package com.google.android.libraries.surveys.internal.p3328e;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.surveys.internal.e.a */
/* compiled from: PG */
final class C43052a extends C2061c {

    /* renamed from: a */
    final /* synthetic */ EditText f112607a;

    /* renamed from: b */
    final /* synthetic */ TextView f112608b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43052a(EditText editText, TextView textView) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f112607a = editText;
        this.f112608b = textView;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        Editable text = this.f112607a.getText();
        String str = BuildConfig.FLAVOR;
        String obj = text != null ? this.f112607a.getText().toString() : str;
        EditText editText = this.f112607a;
        TextView textView = this.f112608b;
        String obj2 = editText.getHint() != null ? editText.getHint().toString() : str;
        if (textView.getText() != null) {
            str = textView.getText().toString();
        }
        String str2 = obj2 + " " + str;
        kVar.f5921a.setHintText(str2);
        kVar.f5921a.setShowingHintText(obj.isEmpty());
        if (obj.isEmpty()) {
            kVar.f5921a.setText(str2);
        } else {
            kVar.f5921a.setText(obj);
        }
    }
}
