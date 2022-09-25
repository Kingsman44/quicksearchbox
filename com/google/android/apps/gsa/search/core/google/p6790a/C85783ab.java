package com.google.android.apps.gsa.search.core.google.p6790a;

import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90016bv;
import com.google.assistant.p3897e.p3917i.p3918a.C51277bt;
import com.google.assistant.p3897e.p3917i.p3918a.C51278bu;
import com.google.assistant.p3897e.p3917i.p3918a.C51281bx;
import com.google.assistant.p3897e.p3917i.p3918a.C51283bz;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ab */
/* compiled from: PG */
public final class C85783ab {

    /* renamed from: a */
    private static final C52232kc f231938a = m137842b(BuildConfig.FLAVOR);

    /* renamed from: b */
    private final C86124t f231939b;

    public C85783ab(C86124t tVar) {
        this.f231939b = tVar;
    }

    /* renamed from: b */
    private static C52232kc m137842b(String str) {
        C51281bx bxVar = (C51281bx) C51283bz.f133511c.createBuilder();
        if (str.isEmpty()) {
            str = Build.MODEL;
        }
        C51277bt btVar = (C51277bt) C51278bu.f133499h.createBuilder();
        String str2 = Build.FINGERPRINT;
        btVar.copyOnWrite();
        C51278bu buVar = (C51278bu) btVar.instance;
        str2.getClass();
        buVar.f133501a |= 1;
        buVar.f133502b = str2;
        String str3 = Build.BRAND;
        btVar.copyOnWrite();
        C51278bu buVar2 = (C51278bu) btVar.instance;
        str3.getClass();
        buVar2.f133501a |= 2;
        buVar2.f133503c = str3;
        String str4 = Build.DEVICE;
        btVar.copyOnWrite();
        C51278bu buVar3 = (C51278bu) btVar.instance;
        str4.getClass();
        buVar3.f133501a |= 4;
        buVar3.f133504d = str4;
        btVar.copyOnWrite();
        C51278bu buVar4 = (C51278bu) btVar.instance;
        str.getClass();
        buVar4.f133501a |= 8;
        buVar4.f133505e = str;
        String str5 = Build.PRODUCT;
        btVar.copyOnWrite();
        C51278bu buVar5 = (C51278bu) btVar.instance;
        str5.getClass();
        buVar5.f133501a |= 16;
        buVar5.f133506f = str5;
        String str6 = Build.MANUFACTURER;
        btVar.copyOnWrite();
        C51278bu buVar6 = (C51278bu) btVar.instance;
        str6.getClass();
        buVar6.f133501a |= 32;
        buVar6.f133507g = str6;
        C51278bu buVar7 = (C51278bu) btVar.build();
        bxVar.copyOnWrite();
        C51283bz bzVar = (C51283bz) bxVar.instance;
        buVar7.getClass();
        bzVar.f133514b = buVar7;
        bzVar.f133513a = 1;
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.device.oem.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.DeviceOemParams";
        C63088z byteString = ((C51283bz) bxVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: a */
    public final C52232kc mo79441a() {
        if (this.f231939b.mo79758x(C90016bv.f247855b).isEmpty()) {
            return f231938a;
        }
        return m137842b(this.f231939b.mo79758x(C90016bv.f247855b));
    }
}
