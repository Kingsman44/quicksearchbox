package com.google.android.libraries.componentview.components.p1689c;

import android.text.Editable;
import android.text.TextWatcher;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20150bt;
import com.google.common.p4535g.C59203do;
import java.math.BigDecimal;

/* renamed from: com.google.android.libraries.componentview.components.c.eg */
/* compiled from: PG */
final class C20295eg implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C20297ei f57007a;

    public C20295eg(C20297ei eiVar) {
        this.f57007a = eiVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        double d;
        C20297ei eiVar = this.f57007a;
        if (!eiVar.f57023k) {
            C20150bt a = eiVar.f57013a.mo25345a(eiVar.f57014b.mo25171n(), eiVar.f57018f.mo25171n());
            C20150bt a2 = eiVar.f57013a.mo25345a(eiVar.f57014b.mo25171n(), eiVar.f57017e.mo25171n());
            if (!(a == null || a2 == null)) {
                double d2 = C59203do.f157270a;
                try {
                    d = new BigDecimal(eiVar.f57016d.mo25290m()).doubleValue();
                    try {
                        d2 = C20297ei.m38167B(C20297ei.m38168C(d, a), a2);
                        str = C20297ei.m38178i(d, d2);
                    } catch (NumberFormatException unused) {
                        str = BuildConfig.FLAVOR;
                        eiVar.f57021i = true;
                        eiVar.f57015c.mo25289A(str);
                        eiVar.mo25342A(a2, a, d2, d);
                        eiVar.f57021i = false;
                        this.f57007a.f57020h.removeCallbacksAndMessages((Object) null);
                        this.f57007a.f57020h.postDelayed(new C20294ef(this), 1000);
                    }
                } catch (NumberFormatException unused2) {
                    d = 0.0d;
                    str = BuildConfig.FLAVOR;
                    eiVar.f57021i = true;
                    eiVar.f57015c.mo25289A(str);
                    eiVar.mo25342A(a2, a, d2, d);
                    eiVar.f57021i = false;
                    this.f57007a.f57020h.removeCallbacksAndMessages((Object) null);
                    this.f57007a.f57020h.postDelayed(new C20294ef(this), 1000);
                }
                eiVar.f57021i = true;
                eiVar.f57015c.mo25289A(str);
                eiVar.mo25342A(a2, a, d2, d);
            }
            eiVar.f57021i = false;
            this.f57007a.f57020h.removeCallbacksAndMessages((Object) null);
            this.f57007a.f57020h.postDelayed(new C20294ef(this), 1000);
        }
    }
}
