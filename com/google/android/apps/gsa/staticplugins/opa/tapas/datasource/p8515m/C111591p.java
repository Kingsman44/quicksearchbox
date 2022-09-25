package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113282bg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113503o;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.p */
/* compiled from: PG */
public final class C111591p {

    /* renamed from: a */
    public final C58495hd f310326a;

    /* renamed from: b */
    public final C58528ij f310327b;

    /* renamed from: c */
    private final C58495hd f310328c;

    public C111591p(C86124t tVar) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("ShowAirplaneModeSetting", C113282bg.f313731a);
        gzVar.mo55429h("ShowBluetoothSetting", C113282bg.f313733c);
        gzVar.mo55429h("TurnOnBluetooth", C113282bg.f313733c);
        gzVar.mo55429h("TurnOffBluetooth", C113282bg.f313733c);
        gzVar.mo55429h("ChangeDeviceSettingBluetoothQuickChange", C113282bg.f313733c);
        gzVar.mo55429h("TurnOnFlashlight", C113282bg.f313738h);
        gzVar.mo55429h("TurnOffFlashlight", C113282bg.f313738h);
        gzVar.mo55429h("TurnOnWifi", C113282bg.f313748r);
        gzVar.mo55429h("TurnOffWifi", C113282bg.f313748r);
        gzVar.mo55429h("ShowWifiSetting", C113282bg.f313748r);
        if (tVar.mo79746e(C90063do.f249353bt)) {
            gzVar.mo55429h("Create_alarm", C113503o.f314255a);
            gzVar.mo55429h("Get_alarm_info", C113503o.f314256b);
            gzVar.mo55429h("Create_timer", C113503o.f314257c);
            gzVar.mo55429h("Get_reminder_info", C113503o.f314258d);
            gzVar.mo55429h("CalendarAgenda", C113503o.f314259e);
            gzVar.mo55429h("Get_calendar_events", C113503o.f314259e);
            gzVar.mo55429h("Get_personal_event_info", C113503o.f314259e);
            gzVar.mo55429h("Get_schedule", C113503o.f314259e);
        }
        C58495hd f = gzVar.mo55427f(false);
        this.f310328c = f;
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("airplane_mode", C113282bg.f313731a);
        gzVar2.mo55429h("battery", C113282bg.f313732b);
        gzVar2.mo55429h("battery_saver", C113282bg.f313732b);
        gzVar2.mo55429h("bluetooth", C113282bg.f313733c);
        gzVar2.mo55429h("flashlight", C113282bg.f313738h);
        gzVar2.mo55429h("nfc", C113282bg.f313741k);
        gzVar2.mo55429h("wifi", C113282bg.f313748r);
        C58495hd f2 = gzVar2.mo55427f(false);
        this.f310326a = f2;
        this.f310327b = (C58528ij) Stream.CC.concat(Collection.EL.stream(f.values()), Collection.EL.stream(f2.values())).map(C111589n.f310324a).filter(C111590o.f310325a).collect(C58370cn.f155947b);
    }

    /* renamed from: a */
    public final String mo99187a(String str) {
        return (String) this.f310328c.get(str);
    }
}
