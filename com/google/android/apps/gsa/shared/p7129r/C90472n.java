package com.google.android.apps.gsa.shared.p7129r;

import android.content.DialogInterface;
import android.widget.RadioButton;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.shared.r.n */
/* compiled from: PG */
final class C90472n implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C90474p f252726a;

    /* renamed from: b */
    private final boolean f252727b;

    public C90472n(C90474p pVar, boolean z) {
        this.f252726a = pVar;
        this.f252727b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f252727b) {
            C90474p pVar = this.f252726a;
            if (pVar.f252732d != null) {
                if (pVar.f252733e.isChecked()) {
                    C90474p pVar2 = this.f252726a;
                    pVar2.f252731c.mo84212b(pVar2.f252734f.isChecked());
                    C90474p pVar3 = this.f252726a;
                    pVar3.f252731c.mo84213c(pVar3.f252732d);
                } else {
                    this.f252726a.f252731c.mo84213c(BuildConfig.FLAVOR);
                }
            }
            RadioButton radioButton = this.f252726a.f252735g;
            int i2 = 0;
            if (radioButton != null && radioButton.isChecked()) {
                i2 = 1;
            }
            C90474p pVar4 = this.f252726a;
            pVar4.f252729a.mo84222a(pVar4.f252734f.isChecked(), i2);
        }
    }
}
