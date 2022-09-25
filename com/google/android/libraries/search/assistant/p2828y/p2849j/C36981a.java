package com.google.android.libraries.search.assistant.p2828y.p2849j;

import android.os.Build;
import com.google.assistant.p3897e.p3917i.p3918a.C51277bt;
import com.google.assistant.p3897e.p3917i.p3918a.C51278bu;
import com.google.assistant.p3897e.p3917i.p3918a.C51281bx;
import com.google.assistant.p3897e.p3917i.p3918a.C51283bz;

/* renamed from: com.google.android.libraries.search.assistant.y.j.a */
/* compiled from: PG */
public final class C36981a {

    /* renamed from: a */
    public static final C51283bz f96293a;

    static {
        C51281bx bxVar = (C51281bx) C51283bz.f133511c.createBuilder();
        C51277bt btVar = (C51277bt) C51278bu.f133499h.createBuilder();
        String str = Build.FINGERPRINT;
        btVar.copyOnWrite();
        C51278bu buVar = (C51278bu) btVar.instance;
        str.getClass();
        buVar.f133501a |= 1;
        buVar.f133502b = str;
        String str2 = Build.BRAND;
        btVar.copyOnWrite();
        C51278bu buVar2 = (C51278bu) btVar.instance;
        str2.getClass();
        buVar2.f133501a |= 2;
        buVar2.f133503c = str2;
        String str3 = Build.DEVICE;
        btVar.copyOnWrite();
        C51278bu buVar3 = (C51278bu) btVar.instance;
        str3.getClass();
        buVar3.f133501a |= 4;
        buVar3.f133504d = str3;
        String str4 = Build.MODEL;
        btVar.copyOnWrite();
        C51278bu buVar4 = (C51278bu) btVar.instance;
        str4.getClass();
        buVar4.f133501a |= 8;
        buVar4.f133505e = str4;
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
        f96293a = (C51283bz) bxVar.build();
    }
}
