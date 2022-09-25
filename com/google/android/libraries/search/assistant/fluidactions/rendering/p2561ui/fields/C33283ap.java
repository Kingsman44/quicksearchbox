package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.databinding.C0118a;
import android.widget.SeekBar;
import com.google.assistant.p3897e.p3902c.p3907c.C50980by;
import com.google.assistant.p3897e.p3921j.C52110fp;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52482tj;
import com.google.assistant.p3897e.p3921j.C52483tk;
import com.google.common.p4526f.C58979ad;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ap */
/* compiled from: PG */
final class C33283ap implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C50980by f89256a;

    /* renamed from: b */
    final /* synthetic */ C33286as f89257b;

    public C33283ap(C33286as asVar, C50980by byVar) {
        this.f89257b = asVar;
        this.f89256a = byVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f89257b.mo38749k();
        C33286as asVar = this.f89257b;
        asVar.f89271g.setText(asVar.f89267c.mo38745a(i));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C33286as asVar = this.f89257b;
        if (asVar.f89276l == null || asVar.f89277m == null || asVar.f89278n == null) {
            C0118a.m96d(C33286as.f89265a.mo56225c(), "Failed to send slider ClientInput due to invalid args", 51050, C58979ad.SMALL);
            return;
        }
        C52482tj tjVar = (C52482tj) C52483tk.f137766c.createBuilder();
        C52110fp fpVar = (C52110fp) C52115fu.f136753n.createBuilder();
        String str = this.f89256a.f132722a;
        fpVar.copyOnWrite();
        C52115fu fuVar = (C52115fu) fpVar.instance;
        str.getClass();
        fuVar.f136755a |= 16;
        fuVar.f136760f = str;
        String str2 = this.f89256a.f132723b;
        fpVar.copyOnWrite();
        C52115fu fuVar2 = (C52115fu) fpVar.instance;
        str2.getClass();
        fuVar2.f136755a |= 64;
        fuVar2.f136762h = str2;
        fpVar.copyOnWrite();
        C52115fu fuVar3 = (C52115fu) fpVar.instance;
        fuVar3.f136757c = 6;
        fuVar3.f136755a |= 2;
        fpVar.copyOnWrite();
        C52115fu fuVar4 = (C52115fu) fpVar.instance;
        fuVar4.f136759e = 4;
        fuVar4.f136755a |= 8;
        C33285ar arVar = this.f89257b.f89267c;
        int progress = seekBar.getProgress();
        int i = arVar.f89258a;
        int i2 = arVar.f89260c;
        if (!(i == i2 && arVar.f89259b == arVar.f89261d)) {
            progress = Math.round(((float) i) + ((((float) (progress - i2)) / arVar.f89263f) * arVar.f89262e));
        }
        fpVar.copyOnWrite();
        C52115fu fuVar5 = (C52115fu) fpVar.instance;
        fuVar5.f136755a = 4 | fuVar5.f136755a;
        fuVar5.f136758d = (double) progress;
        tjVar.copyOnWrite();
        C52483tk tkVar = (C52483tk) tjVar.instance;
        C52115fu fuVar6 = (C52115fu) fpVar.build();
        fuVar6.getClass();
        tkVar.f137769b = fuVar6;
        tkVar.f137768a |= 1;
        C33286as asVar2 = this.f89257b;
        asVar2.f89278n.mo38366c("FA DeviceSetting slide", C33286as.m61894h(asVar2.f89276l, asVar2.f89277m.mo38576a(), (C52483tk) tjVar.build()));
    }
}
