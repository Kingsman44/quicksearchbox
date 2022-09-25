package com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2223a;

import com.google.android.libraries.mdi.p2208a.p2209a.C28594a;
import com.google.android.libraries.mdi.p2213d.C28612a;
import com.google.android.libraries.mdi.p2213d.C28619b;
import com.google.android.libraries.mdi.p2213d.C28621c;
import com.google.android.libraries.mdi.p2213d.C28683d;
import com.google.android.libraries.mdi.p2213d.C28688i;
import com.google.android.libraries.mdi.p2213d.C28689j;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28613a;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28614b;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28616d;
import com.google.android.libraries.mdi.p2213d.p2219c.p2221b.C28625a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;

/* renamed from: com.google.android.libraries.mdi.d.c.c.a.a */
/* compiled from: PG */
public final class C28628a {

    /* renamed from: a */
    private final C58881cr f77853a;

    /* renamed from: b */
    private final C28625a f77854b;

    /* renamed from: c */
    private final C28613a f77855c;

    /* renamed from: d */
    private final C28594a f77856d;

    /* renamed from: c */
    private final C28621c m53522c() {
        C28619b bVar = (C28619b) C28621c.f77844e.createBuilder();
        String str = ((C28614b) this.f77855c).f77837b;
        bVar.copyOnWrite();
        C28621c cVar = (C28621c) bVar.instance;
        cVar.f77846a |= 16;
        cVar.f77849d = str;
        bVar.copyOnWrite();
        C28621c cVar2 = (C28621c) bVar.instance;
        cVar2.f77846a |= 2;
        cVar2.f77847b = 1;
        String str2 = ((C28614b) this.f77855c).f77836a;
        bVar.copyOnWrite();
        C28621c cVar3 = (C28621c) bVar.instance;
        cVar3.f77846a |= 4;
        cVar3.f77848c = str2;
        return (C28621c) bVar.build();
    }

    /* renamed from: a */
    public final void mo34303a(int i, boolean z) {
        long b = this.f77854b.mo34300b();
        if (this.f77856d.mo34272a(b)) {
            C28612a aVar = (C28612a) C28683d.f77943f.createBuilder();
            aVar.copyOnWrite();
            C28683d dVar = (C28683d) aVar.instance;
            dVar.f77945a |= 32;
            dVar.f77948d = (int) b;
            C28621c c = m53522c();
            aVar.copyOnWrite();
            C28683d dVar2 = (C28683d) aVar.instance;
            c.getClass();
            dVar2.f77949e = c;
            dVar2.f77945a |= 64;
            C28688i iVar = (C28688i) C28689j.f77956d.createBuilder();
            iVar.copyOnWrite();
            C28689j jVar = (C28689j) iVar.instance;
            jVar.f77958a |= 1;
            jVar.f77959b = z;
            aVar.copyOnWrite();
            C28683d dVar3 = (C28683d) aVar.instance;
            C28689j jVar2 = (C28689j) iVar.build();
            jVar2.getClass();
            dVar3.f77947c = jVar2;
            dVar3.f77946b = 1;
            ((C28616d) this.f77853a.mo6453a()).mo34292a(i, (C28683d) aVar.build());
        }
    }

    /* renamed from: b */
    public final void mo34304b(int i, boolean z) {
        long b = this.f77854b.mo34300b();
        if (this.f77856d.mo34272a(b)) {
            C28612a aVar = (C28612a) C28683d.f77943f.createBuilder();
            aVar.copyOnWrite();
            C28683d dVar = (C28683d) aVar.instance;
            dVar.f77945a |= 32;
            dVar.f77948d = (int) b;
            C28621c c = m53522c();
            aVar.copyOnWrite();
            C28683d dVar2 = (C28683d) aVar.instance;
            c.getClass();
            dVar2.f77949e = c;
            dVar2.f77945a |= 64;
            C28688i iVar = (C28688i) C28689j.f77956d.createBuilder();
            iVar.copyOnWrite();
            C28689j jVar = (C28689j) iVar.instance;
            jVar.f77958a |= 1;
            jVar.f77959b = true;
            iVar.copyOnWrite();
            C28689j jVar2 = (C28689j) iVar.instance;
            jVar2.f77958a |= 2;
            jVar2.f77960c = z;
            aVar.copyOnWrite();
            C28683d dVar3 = (C28683d) aVar.instance;
            C28689j jVar3 = (C28689j) iVar.build();
            jVar3.getClass();
            dVar3.f77947c = jVar3;
            dVar3.f77946b = 1;
            ((C28616d) this.f77853a.mo6453a()).mo34292a(i, (C28683d) aVar.build());
        }
    }

    public C28628a(C58881cr crVar, C28594a aVar, C28625a aVar2, C28613a aVar3) {
        aVar2.getClass();
        this.f77853a = C58886cw.m90973a(crVar);
        this.f77856d = aVar;
        this.f77854b = aVar2;
        this.f77855c = aVar3;
    }
}
