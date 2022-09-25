package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.databinding.C0118a;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32973f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33179d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33226d;
import com.google.assistant.p3897e.p3902c.p3907c.C50980by;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.aq */
/* compiled from: PG */
public final class C33284aq implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        C50980by byVar;
        DeviceSettingField deviceSettingField = (DeviceSettingField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_device_setting_field, (ViewGroup) null);
        C33286as a = deviceSettingField.mo17754z();
        a.f89276l = dVar.f88740c;
        a.f89277m = dVar.f88739b;
        a.f89278n = dVar.f88745h;
        C51941eu euVar = a.f89276l;
        if (euVar == null || a.f89277m == null) {
            ((C59052c) ((C59052c) C33286as.f89265a.mo56226d()).mo56372aa(51053)).mo56386p("Unable to update FormField UI due to invalid args");
        } else {
            if (euVar.f136277e == 35) {
                byVar = (C50980by) euVar.f136278f;
            } else {
                byVar = C50980by.f132720e;
            }
            if (byVar.f132722a.isEmpty()) {
                C0118a.m96d(C33286as.f89265a.mo56225c(), "Failed to render DeviceSettingField, setting id missing.", 51055, C58979ad.SMALL);
            } else {
                int i = byVar.f132725d;
                if (i == 4) {
                    a.f89269e.setEnabled(false);
                    a.f89271g.setVisibility(8);
                    a.f89268d.setVisibility(0);
                    a.f89272h.setVisibility(8);
                    if (C33226d.f88854a.containsKey(byVar.f132722a)) {
                        Context context = a.f89266b;
                        Integer num = (Integer) C33226d.f88854a.get(byVar.f132722a);
                        num.getClass();
                        Drawable drawable = context.getDrawable(num.intValue());
                        drawable.getClass();
                        drawable.setTint(C19391a.m36980a(a.f89266b, R.attr.colorOnPrimary));
                        a.f89270f.setDrawableByLayerId(R.id.fa_device_setting_slider_icon, drawable);
                    } else {
                        ((C59052c) ((C59052c) C33286as.f89265a.mo56226d()).mo56372aa(51051)).mo56389s("No icon is found for setting: %s", byVar.f132722a);
                    }
                    a.mo38748j(C32973f.m61046g(new C32954a(byVar.f132722a, Optional.empty()), 0, 10, 0));
                    a.f89269e.setOnSeekBarChangeListener(new C33283ap(a, byVar));
                } else if (i == 2) {
                    a.f89268d.setVisibility(8);
                    a.f89272h.setVisibility(0);
                    a.f89275k.setVisibility(8);
                    if (C33226d.f88854a.containsKey(byVar.f132722a)) {
                        a.f89273i.setImageDrawable(a.f89266b.getDrawable(((Integer) C33226d.f88854a.get(byVar.f132722a)).intValue()));
                    } else {
                        ((C59052c) ((C59052c) C33286as.f89265a.mo56226d()).mo56372aa(51052)).mo56389s("No icon is found for setting: %s", byVar.f132722a);
                    }
                    a.f89274j.setText(byVar.f132724c);
                    a.f89275k.setOnClickListener(new C33282ao(a, byVar));
                } else {
                    ((C59052c) ((C59052c) C33286as.f89265a.mo56225c()).mo56372aa(51054)).mo56387q("Failed to render UI due to unsupported setting type: %s", byVar.f132725d);
                }
                a.mo38747i(byVar);
            }
        }
        return deviceSettingField;
    }
}
