package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.w */
/* compiled from: PG */
public final /* synthetic */ class C102600w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C102550al f286359a;

    /* renamed from: b */
    public final /* synthetic */ long f286360b;

    public /* synthetic */ C102600w(C102550al alVar, long j) {
        this.f286359a = alVar;
        this.f286360b = j;
    }

    public final Object apply(Object obj) {
        C102550al alVar = this.f286359a;
        long j = this.f286360b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C118837d.m197250d(alVar.f286212l, j);
        alVar.f286213m.mo104025g((long) ((C51715bm) axVar.mo56107c()).getSerializedSize());
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.device.capabilities";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.DeviceCapabilities";
        C63088z byteString = ((C51715bm) axVar.mo56107c()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }
}
