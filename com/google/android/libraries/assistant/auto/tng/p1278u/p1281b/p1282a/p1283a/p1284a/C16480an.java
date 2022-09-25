package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.os.Build;
import com.google.assistant.p3897e.p3917i.p3918a.C51277bt;
import com.google.assistant.p3897e.p3917i.p3918a.C51278bu;
import com.google.assistant.p3897e.p3917i.p3918a.C51281bx;
import com.google.assistant.p3897e.p3917i.p3918a.C51283bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.an */
/* compiled from: PG */
public final class C16480an extends C68247h {
    public C16480an(C69464a aVar, C69464a aVar2) {
        super(aVar2, new C68277d(C16480an.class), aVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Void voidR = (Void) obj;
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
        return C60856cj.m92900i((C51283bz) bxVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60866ct.f164955a;
    }
}
