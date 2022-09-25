package com.google.android.libraries.componentview.components.p1682a;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.componentview.p1699f.C20520h;

/* renamed from: com.google.android.libraries.componentview.components.a.a */
/* compiled from: PG */
final class C19753a implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C19817c f55175a;

    public C19753a(C19817c cVar) {
        this.f55175a = cVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19817c cVar = this.f55175a;
        if (!cVar.f55398d) {
            cVar.f55398d = true;
            String obj = cVar.f55396b.getText().toString();
            if (obj.isEmpty()) {
                cVar.mo25131i();
            } else {
                try {
                    double parseDouble = Double.parseDouble(obj);
                    cVar.f55395a.mo25272l(parseDouble);
                    double b = parseDouble * cVar.f55395a.mo25262b();
                    cVar.f55395a.mo25273m(b);
                    C19817c.m37669j(b, cVar.f55395a.mo25265e(), cVar.f55397c);
                } catch (NumberFormatException unused) {
                    C20520h.m38497b(5, "AssistantCurrencyWidget", (Throwable) null, "Invalid currency value input: %s", obj);
                }
            }
            cVar.f55398d = false;
        }
    }
}
