package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bk */
/* compiled from: PG */
public final /* synthetic */ class C117137bk implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117140bn f325200a;

    public /* synthetic */ C117137bk(C117140bn bnVar) {
        this.f325200a = bnVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        int i;
        C117140bn bnVar = this.f325200a;
        RadioGroup radioGroup = bnVar.f325203a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            i = R.id.shape_2dp;
        } else if (intValue == 1) {
            i = R.id.shape_8dp;
        } else if (intValue == 2) {
            i = R.id.shape_24dp;
        } else {
            throw new IllegalArgumentException("Bar radius " + intValue + " is undefined");
        }
        bnVar.f325204b = true;
        ((RadioButton) radioGroup.findViewById(i)).setChecked(true);
        bnVar.f325204b = false;
    }
}
