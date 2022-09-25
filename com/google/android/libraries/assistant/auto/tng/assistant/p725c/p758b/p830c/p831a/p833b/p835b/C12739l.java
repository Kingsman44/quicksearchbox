package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.assistant.p3897e.p3921j.C52097fc;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.l */
/* compiled from: PG */
public final /* synthetic */ class C12739l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C52097fc f39855a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f39856b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f39857c;

    /* renamed from: d */
    public final /* synthetic */ C52098fd f39858d;

    public /* synthetic */ C12739l(C52097fc fcVar, C60870cx cxVar, C60870cx cxVar2, C52098fd fdVar) {
        this.f39855a = fcVar;
        this.f39856b = cxVar;
        this.f39857c = cxVar2;
        this.f39858d = fdVar;
    }

    public final Object call() {
        C52097fc fcVar = this.f39855a;
        C60870cx cxVar = this.f39856b;
        C60870cx cxVar2 = this.f39857c;
        C52098fd fdVar = this.f39858d;
        C59071e eVar = C12741n.f39860a;
        for (String str : fcVar.f136724c) {
            ((C59052c) ((C59052c) C12741n.f39860a.mo56224b()).mo56372aa(44422)).mo56389s("Get Setting ID for Test Drive: %s", str);
            C52099fe feVar = (C52099fe) C52103fi.f136729i.createBuilder();
            if (str.equals("test_drive_record_consent")) {
                String valueOf = String.valueOf(C60856cj.m92909r(cxVar));
                feVar.copyOnWrite();
                C52103fi fiVar = (C52103fi) feVar.instance;
                valueOf.getClass();
                fiVar.f136731a |= 1;
                fiVar.f136732b = valueOf;
            } else if (str.equals("test_drive_query_counter")) {
                String valueOf2 = String.valueOf(C60856cj.m92909r(cxVar2));
                feVar.copyOnWrite();
                C52103fi fiVar2 = (C52103fi) feVar.instance;
                valueOf2.getClass();
                fiVar2.f136731a |= 1;
                fiVar2.f136732b = valueOf2;
            }
            fdVar.mo53798b(str, (C52103fi) feVar.build());
        }
        return C12788a.m29054a("get_device_settings_result", "assistant.api.client_op.GetDeviceSettingsResult", fdVar.build());
    }
}
