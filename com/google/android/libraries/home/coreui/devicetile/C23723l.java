package com.google.android.libraries.home.coreui.devicetile;

import android.app.Dialog;
import android.content.res.Resources;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.view.Window;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.C69685i;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.l */
/* compiled from: PG */
public final class C23723l {

    /* renamed from: a */
    public static final C59071e f64882a = C59071e.m91331h();

    /* renamed from: a */
    public static /* synthetic */ Dialog m44215a(C23656ab abVar, boolean z, boolean z2, boolean z3, C69615a aVar, int i) {
        C69685i iVar;
        boolean z4 = z & ((i & 2) == 0);
        boolean z5 = z2 & ((i & 4) == 0);
        boolean z6 = z3 & ((i & 8) == 0);
        C69664n.m101061g(aVar, "onCancel");
        C23674at atVar = (C23674at) abVar;
        C23739n nVar = atVar.f64763n;
        if (nVar == null) {
            C59052c cVar = (C59052c) f64882a.mo56225c();
            cVar.mo56379ah(new C59094n(48667));
            cVar.mo56386p("PIN Dialog attempted but no last action is set. Will not show");
            return null;
        }
        Resources resources = atVar.f64764o.getResources();
        if (z5) {
            iVar = new C69685i(resources.getString(R.string.controls_pin_wrong), Integer.valueOf(R.string.controls_pin_instructions_retry));
        } else {
            iVar = new C69685i(resources.getString(R.string.controls_pin_verify, new Object[]{atVar.f64766q.getText()}), Integer.valueOf(R.string.controls_pin_instructions));
        }
        int intValue = ((Number) iVar.f186053b).intValue();
        C0391l lVar = (C0391l) atVar.f64759j.mo5672a();
        lVar.setTitle((String) iVar.f186052a);
        lVar.mo1296c(R.layout.controls_dialog_pin);
        lVar.setPositiveButton(R.string.controls_dialog_button_ok, new C23721j(abVar, nVar));
        lVar.setNegativeButton(R.string.controls_dialog_button_cancel, C23722k.f64881a);
        C0392m create = lVar.create();
        Window window = create.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        create.setOnShowListener(new C23719h(create, intValue, z6, z4));
        create.setOnCancelListener(new C23720i(aVar, abVar));
        return create;
    }

    /* renamed from: b */
    public static final void m44216b(EditText editText, boolean z) {
        if (z) {
            editText.setInputType(129);
        } else {
            editText.setInputType(18);
        }
    }
}
