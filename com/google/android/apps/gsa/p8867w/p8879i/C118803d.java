package com.google.android.apps.gsa.p8867w.p8879i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.search.googleapp.customtabs.p10150b.C133673a;
import com.google.android.apps.search.googleapp.customtabs.p10150b.C133674b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.w.i.d */
/* compiled from: PG */
public final class C118803d {

    /* renamed from: a */
    public final C86338r f331370a;

    /* renamed from: b */
    private final C68214a f331371b;

    public C118803d(C68214a aVar, C86338r rVar) {
        this.f331371b = aVar;
        this.f331370a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo103972a() {
        C86124t tVar = (C86124t) this.f331371b.mo27525b();
        C133673a aVar = (C133673a) C133674b.f364097o.createBuilder();
        boolean e = tVar.mo79746e(C90110fh.f250590O);
        aVar.copyOnWrite();
        C133674b bVar = (C133674b) aVar.instance;
        bVar.f364099a |= 1;
        bVar.f364100b = e;
        boolean e2 = tVar.mo79746e(C90110fh.f250591P);
        aVar.copyOnWrite();
        C133674b bVar2 = (C133674b) aVar.instance;
        bVar2.f364099a |= 2;
        bVar2.f364101c = e2;
        boolean e3 = tVar.mo79746e(C90110fh.f250720z);
        aVar.copyOnWrite();
        C133674b bVar3 = (C133674b) aVar.instance;
        bVar3.f364099a |= 4;
        bVar3.f364102d = e3;
        boolean e4 = tVar.mo79746e(C90110fh.f250588M);
        aVar.copyOnWrite();
        C133674b bVar4 = (C133674b) aVar.instance;
        bVar4.f364099a |= 8;
        bVar4.f364103e = e4;
        boolean e5 = tVar.mo79746e(C90110fh.f250589N);
        aVar.copyOnWrite();
        C133674b bVar5 = (C133674b) aVar.instance;
        bVar5.f364099a |= 16;
        bVar5.f364104f = e5;
        boolean e6 = tVar.mo79746e(C90110fh.f250596U);
        aVar.copyOnWrite();
        C133674b bVar6 = (C133674b) aVar.instance;
        bVar6.f364099a |= 32;
        bVar6.f364105g = e6;
        boolean e7 = tVar.mo79746e(C90110fh.f250587L);
        aVar.copyOnWrite();
        C133674b bVar7 = (C133674b) aVar.instance;
        bVar7.f364099a |= 64;
        bVar7.f364106h = e7;
        long a = tVar.mo79743a(C90110fh.f250629aa);
        aVar.copyOnWrite();
        C133674b bVar8 = (C133674b) aVar.instance;
        bVar8.f364099a |= 128;
        bVar8.f364107i = (int) a;
        boolean e8 = tVar.mo79746e(C90110fh.f250716v);
        aVar.copyOnWrite();
        C133674b bVar9 = (C133674b) aVar.instance;
        bVar9.f364099a |= 256;
        bVar9.f364108j = e8;
        boolean e9 = tVar.mo79746e(C90110fh.f250576A);
        aVar.copyOnWrite();
        C133674b bVar10 = (C133674b) aVar.instance;
        bVar10.f364099a |= 512;
        bVar10.f364109k = e9;
        boolean e10 = tVar.mo79746e(C90110fh.f250600Y);
        aVar.copyOnWrite();
        C133674b bVar11 = (C133674b) aVar.instance;
        bVar11.f364099a |= 1024;
        bVar11.f364110l = e10;
        boolean e11 = tVar.mo79746e(C90110fh.f250653ay);
        aVar.copyOnWrite();
        C133674b bVar12 = (C133674b) aVar.instance;
        bVar12.f364099a |= 2048;
        bVar12.f364111m = e11;
        boolean e12 = tVar.mo79746e(C90110fh.f250652ax);
        aVar.copyOnWrite();
        C133674b bVar13 = (C133674b) aVar.instance;
        bVar13.f364099a |= 4096;
        bVar13.f364112n = e12;
        return C60856cj.m92900i((C133674b) aVar.build());
    }

    /* renamed from: b */
    public final C60870cx mo103973b() {
        return C60856cj.m92900i(Boolean.valueOf(!this.f331370a.getBoolean("use_custom_tabs", true)));
    }
}
