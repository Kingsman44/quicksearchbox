package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.databinding.C0118a;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C50980by;
import com.google.assistant.p3897e.p3921j.C52110fp;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52482tj;
import com.google.assistant.p3897e.p3921j.C52483tk;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C58979ad;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ao */
/* compiled from: PG */
public final /* synthetic */ class C33282ao implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33286as f89254a;

    /* renamed from: b */
    public final /* synthetic */ C50980by f89255b;

    public /* synthetic */ C33282ao(C33286as asVar, C50980by byVar) {
        this.f89254a = asVar;
        this.f89255b = byVar;
    }

    public final void onClick(View view) {
        C50980by byVar;
        C33286as asVar = this.f89254a;
        C50980by byVar2 = this.f89255b;
        if (asVar.f89276l == null || asVar.f89277m == null || asVar.f89278n == null) {
            C0118a.m96d(C33286as.f89265a.mo56226d(), "Failed to send toggle ClientInput due to invalid args", 51056, C58979ad.SMALL);
            return;
        }
        int i = true != asVar.f89275k.isChecked() ? 3 : 2;
        C52482tj tjVar = (C52482tj) C52483tk.f137766c.createBuilder();
        C52110fp fpVar = (C52110fp) C52115fu.f136753n.createBuilder();
        String str = byVar2.f132722a;
        fpVar.copyOnWrite();
        C52115fu fuVar = (C52115fu) fpVar.instance;
        str.getClass();
        fuVar.f136755a |= 16;
        fuVar.f136760f = str;
        String str2 = byVar2.f132723b;
        fpVar.copyOnWrite();
        C52115fu fuVar2 = (C52115fu) fpVar.instance;
        str2.getClass();
        fuVar2.f136755a |= 64;
        fuVar2.f136762h = str2;
        fpVar.copyOnWrite();
        C52115fu fuVar3 = (C52115fu) fpVar.instance;
        fuVar3.f136757c = i - 1;
        fuVar3.f136755a |= 2;
        tjVar.copyOnWrite();
        C52483tk tkVar = (C52483tk) tjVar.instance;
        C52115fu fuVar4 = (C52115fu) fpVar.build();
        fuVar4.getClass();
        tkVar.f137769b = fuVar4;
        tkVar.f137768a |= 1;
        asVar.f89278n.mo38366c("FA DeviceSetting toggle", C33286as.m61894h(asVar.f89276l, asVar.f89277m.mo38576a(), (C52483tk) tjVar.build()));
        if (asVar.f89276l != null) {
            int i2 = true != asVar.f89275k.isChecked() ? R.string.fa_device_setting_toggle_off_description : R.string.fa_device_setting_toggle_on_description;
            C51941eu euVar = asVar.f89276l;
            if (euVar.f136277e == 35) {
                byVar = (C50980by) euVar.f136278f;
            } else {
                byVar = C50980by.f132720e;
            }
            asVar.f89274j.setText(asVar.f89266b.getString(i2, new Object[]{byVar.f132724c}));
        }
    }
}
