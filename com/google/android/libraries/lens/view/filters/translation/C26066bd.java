package com.google.android.libraries.lens.view.filters.translation;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.widget.RadioGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bd */
/* compiled from: PG */
public final /* synthetic */ class C26066bd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26070bh f70858a;

    public /* synthetic */ C26066bd(C26070bh bhVar) {
        this.f70858a = bhVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        C26070bh bhVar = this.f70858a;
        C0392m mVar = (C0392m) dialogInterface;
        bhVar.f70865e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(mVar.f1349a.mo1106a(i)));
        if (bhVar.f70869i.mo56113h()) {
            C26069bg bgVar = (C26069bg) bhVar.f70869i.mo56107c();
            RadioGroup radioGroup = (RadioGroup) mVar.mo1197b().mo1177e(R.id.lens_translate_dialog_radiogroup);
            if (radioGroup == null) {
                i2 = -1;
            } else {
                i2 = radioGroup.getCheckedRadioButtonId();
            }
            bgVar.mo31276a(i2);
        }
    }
}
