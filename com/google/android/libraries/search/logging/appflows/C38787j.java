package com.google.android.libraries.search.logging.appflows;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.android.libraries.search.p2871b.p2902o.C37310c;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.apq;
import com.google.common.p4552o.apr;
import com.google.common.p4552o.aps;
import com.google.common.p4552o.apt;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.logging.appflows.j */
/* compiled from: PG */
final class C38787j implements C37310c {

    /* renamed from: a */
    private final C38828b f102364a;

    /* renamed from: b */
    private final String f102365b;

    /* renamed from: c */
    private final C143658k f102366c;

    public C38787j(C38828b bVar, String str, C143658k kVar) {
        this.f102364a = bVar;
        this.f102366c = kVar;
        this.f102365b = str;
    }

    /* renamed from: a */
    public final C60870cx mo40859a(C37309b bVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        apq apq = (apq) apr.f159695c.createBuilder();
        aps aps = (aps) apt.f159700c.createBuilder();
        C38828b bVar2 = this.f102364a;
        aps.copyOnWrite();
        apt apt = (apt) aps.instance;
        apt.f159703b = bVar2.getNumber();
        apt.f159702a |= 1;
        apq.copyOnWrite();
        apr apr = (apr) apq.instance;
        apt apt2 = (apt) aps.build();
        apt2.getClass();
        apr.f159698b = apt2;
        apr.f159697a |= 1;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        apr apr2 = (apr) apq.build();
        apr2.getClass();
        ufVar.f164245cw = apr2;
        ufVar.f164255j |= 32768;
        C71189f d = bVar.mo40862d();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        d.getClass();
        ufVar2.f164244cv = d;
        ufVar2.f164255j |= 16384;
        C60555uf ufVar3 = (C60555uf) tzVar.build();
        C58191h hVar = (C58191h) C58192i.f155603j.createBuilder();
        hVar.copyOnWrite();
        C58192i iVar = (C58192i) hVar.instance;
        ufVar3.getClass();
        iVar.f155607c = ufVar3;
        iVar.f155605a |= 4;
        String str = this.f102365b;
        hVar.copyOnWrite();
        C58192i iVar2 = (C58192i) hVar.instance;
        str.getClass();
        iVar2.f155605a |= 128;
        iVar2.f155610f = str;
        C143657j d2 = this.f102366c.mo118999d((C58192i) hVar.build());
        C58149a aVar = d2.f389461c;
        aVar.copyOnWrite();
        C58150b bVar3 = (C58150b) aVar.instance;
        C58150b bVar4 = C58150b.f155459k;
        bVar3.f155461a |= 16;
        bVar3.f155464d = 1412;
        d2.mo118992a();
        return C60866ct.f164955a;
    }
}
