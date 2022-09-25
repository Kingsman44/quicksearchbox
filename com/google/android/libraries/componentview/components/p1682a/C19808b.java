package com.google.android.libraries.componentview.components.p1682a;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.componentview.p1699f.C20520h;

/* renamed from: com.google.android.libraries.componentview.components.a.b */
/* compiled from: PG */
final class C19808b implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C19817c f55356a;

    public C19808b(C19817c cVar) {
        this.f55356a = cVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19817c cVar = this.f55356a;
        if (!cVar.f55398d) {
            cVar.f55398d = true;
            String obj = cVar.f55397c.getText().toString();
            if (obj.isEmpty()) {
                cVar.mo25131i();
            } else {
                try {
                    double parseDouble = Double.parseDouble(obj);
                    cVar.f55395a.mo25273m(parseDouble);
                    double b = parseDouble / cVar.f55395a.mo25262b();
                    cVar.f55395a.mo25272l(b);
                    C19817c.m37669j(b, cVar.f55395a.mo25264d(), cVar.f55396b);
                } catch (NumberFormatException unused) {
                    C20520h.m38497b(5, "AssistantCurrencyWidget", (Throwable) null, "Invalid currency value input: %s", obj);
                }
            }
            cVar.f55398d = false;
        }
    }
}
