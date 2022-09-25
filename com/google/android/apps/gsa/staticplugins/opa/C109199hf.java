package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import android.os.ParcelUuid;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.libraries.gcoreclient.p1770i.p1771a.C21564c;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21673c;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21674d;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21687q;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52306mw;
import com.google.assistant.p3897e.p3921j.C52307mx;
import com.google.assistant.p3897e.p3921j.C52518us;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hf */
/* compiled from: PG */
public final /* synthetic */ class C109199hf implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f304046a;

    /* renamed from: b */
    public final /* synthetic */ C52522uw f304047b;

    public /* synthetic */ C109199hf(C109258hw hwVar, C52522uw uwVar) {
        this.f304046a = hwVar;
        this.f304047b = uwVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C60870cx cxVar;
        C109258hw hwVar = this.f304046a;
        C52522uw uwVar = this.f304047b;
        boolean z = i == -1;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "device.CARRIER_INFO";
        C52518us usVar = (C52518us) C52522uw.f137864j.createBuilder();
        long j = uwVar.f137869d;
        usVar.copyOnWrite();
        C52522uw uwVar2 = (C52522uw) usVar.instance;
        uwVar2.f137866a |= 4;
        uwVar2.f137869d = j;
        int i2 = 2;
        if (z) {
            usVar.copyOnWrite();
            C52522uw uwVar3 = (C52522uw) usVar.instance;
            uwVar3.f137874i = 1;
            uwVar3.f137866a |= 128;
            String str = uwVar.f137871f;
            usVar.copyOnWrite();
            C52522uw uwVar4 = (C52522uw) usVar.instance;
            str.getClass();
            uwVar4.f137866a |= 16;
            uwVar4.f137871f = str;
            String str2 = uwVar.f137870e;
            usVar.copyOnWrite();
            C52522uw uwVar5 = (C52522uw) usVar.instance;
            str2.getClass();
            uwVar5.f137866a |= 8;
            uwVar5.f137870e = str2;
        } else {
            usVar.copyOnWrite();
            C52522uw uwVar6 = (C52522uw) usVar.instance;
            uwVar6.f137874i = 2;
            uwVar6.f137866a |= 128;
        }
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.CarrierInfoInput";
        C52306mw mwVar = (C52306mw) C52307mx.f137308c.createBuilder();
        mwVar.copyOnWrite();
        C52307mx mxVar = (C52307mx) mwVar.instance;
        C52522uw uwVar7 = (C52522uw) usVar.build();
        uwVar7.getClass();
        mxVar.f137311b = uwVar7;
        mxVar.f137310a |= 2;
        C63088z byteString = ((C52307mx) mwVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("carrier_info_input", (C52230ka) jzVar.build());
        C51805du duVar2 = (C51805du) dsVar.build();
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar2.getClass();
        ekVar.f136675c = duVar2;
        ekVar.f136674b = 5;
        hwVar.mo97717g((C52078ek) ejVar.build());
        if (true == z) {
            i2 = 1;
        }
        C21673c a = hwVar.f304230C.mo27063a();
        a.mo27064a(i2);
        C21674d b = a.mo27065b();
        C21687q a2 = hwVar.f304231D.mo27056a();
        a2.mo27057a(uwVar.f137871f);
        a2.mo27062f(b);
        a2.mo27059c(new ParcelUuid(UUID.randomUUID()));
        a2.mo27058b(Long.valueOf(hwVar.f304294q.mo26870b()));
        a2.mo27060d(uwVar.f137873h);
        try {
            cxVar = C21564c.m40696a(hwVar.f304228A.mo27053a(hwVar.f304279b, hwVar.f304229B.mo27054a().mo27055a()).mo27052c(a2.mo27061e()));
        } catch (Exception e) {
            cxVar = C60856cj.m92899h(e);
        }
        hwVar.f304290m.mo28211k(cxVar, "Set consent status to GmsCore Mobile Data Plan module", new C109203hj(z));
        return true;
    }
}
