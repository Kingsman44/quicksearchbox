package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52276lt;
import com.google.assistant.p3897e.p3921j.C52277lu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.i */
/* compiled from: PG */
public final class C35955i implements C35472h {

    /* renamed from: a */
    private static final C59071e f94128a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.i");

    /* renamed from: b */
    private final Context f94129b;

    public C35955i(Context context) {
        this.f94129b = context;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        ((C59052c) ((C59052c) f94128a.mo56224b()).mo56372aa(51782)).mo56386p("TNG BatteryLevelPerformer");
        boolean z = false;
        if (dyVar.f135936b.equals("battery.LEVEL_LOOKUP")) {
            Intent registerReceiver = this.f94129b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Battery status is null"));
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.OUT_OF_RANGE, "battery level values are out of range"));
            }
            int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
            if (intExtra3 == 1 || intExtra3 == 2 || intExtra3 == 4) {
                z = true;
            }
            C52276lt ltVar = (C52276lt) C52277lu.f137223e.createBuilder();
            ltVar.copyOnWrite();
            C52277lu luVar = (C52277lu) ltVar.instance;
            luVar.f137225a |= 1;
            luVar.f137226b = intExtra;
            ltVar.copyOnWrite();
            C52277lu luVar2 = (C52277lu) ltVar.instance;
            luVar2.f137225a |= 2;
            luVar2.f137227c = intExtra2;
            ltVar.copyOnWrite();
            C52277lu luVar3 = (C52277lu) ltVar.instance;
            luVar3.f137225a = 4 | luVar3.f137225a;
            luVar3.f137228d = z;
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "battery_level_result";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            C63088z byteString = ((C52277lu) ltVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar.f137059a |= 2;
            kaVar.f137061c = byteString;
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            kaVar2.f137059a |= 1;
            kaVar2.f137060b = "assistant.api.client_op.BatteryLevelResult";
            C52230ka kaVar3 = (C52230ka) jzVar.build();
            kbVar.copyOnWrite();
            C52232kc kcVar2 = (C52232kc) kbVar.instance;
            kaVar3.getClass();
            kcVar2.f137066c = kaVar3;
            kcVar2.f137064a |= 2;
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.OK;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            ecVar.f136654b = kgVar2;
            ecVar.f136653a |= 1;
            C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
            eaVar.mo53780b((C52232kc) kbVar.build());
            C52069eb ebVar = (C52069eb) eaVar.build();
            dzVar.copyOnWrite();
            C52070ec ecVar2 = (C52070ec) dzVar.instance;
            ebVar.getClass();
            ecVar2.f136655c = ebVar;
            ecVar2.f136653a |= 2;
            return C60856cj.m92900i((C52070ec) dzVar.build());
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"battery.LEVEL_LOOKUP", dyVar.f135936b}));
    }
}
