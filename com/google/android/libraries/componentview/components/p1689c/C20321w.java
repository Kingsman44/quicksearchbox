package com.google.android.libraries.componentview.components.p1689c;

import android.text.Editable;
import android.text.TextWatcher;
import com.evernote.android.state.BuildConfig;
import java.math.BigDecimal;

/* renamed from: com.google.android.libraries.componentview.components.c.w */
/* compiled from: PG */
final class C20321w implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C20324z f57109a;

    public C20321w(C20324z zVar) {
        this.f57109a = zVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        int i4;
        C20324z zVar = this.f57109a;
        if (!zVar.f57117f) {
            try {
                double parseDouble = Double.parseDouble(zVar.f57114c.mo25290m());
                double b = parseDouble / zVar.f57112a.mo25262b();
                BigDecimal bigDecimal = new BigDecimal(Double.toString(b));
                if (zVar.f57112a.mo25264d() == 0) {
                    i4 = 2;
                } else {
                    i4 = zVar.f57112a.mo25264d();
                }
                str = bigDecimal.setScale(i4, 4).stripTrailingZeros().toPlainString();
                zVar.f57112a.mo25272l(b);
                zVar.f57112a.mo25273m(parseDouble);
            } catch (NumberFormatException unused) {
                str = BuildConfig.FLAVOR;
            }
            zVar.f57116e = true;
            zVar.f57113b.mo25289A(str);
            zVar.f57116e = false;
        }
    }
}
