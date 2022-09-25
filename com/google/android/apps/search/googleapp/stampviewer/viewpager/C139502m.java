package com.google.android.apps.search.googleapp.stampviewer.viewpager;

import androidx.viewpager.widget.C4277j;
import com.google.android.apps.search.googleapp.stampviewer.C139317ac;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139382a;
import com.google.common.p4552o.p4569o.C60315a;
import com.google.common.p4552o.p4569o.C60316b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.viewpager.m */
/* compiled from: PG */
public final class C139502m implements C4277j {

    /* renamed from: a */
    private final C139317ac f379307a;

    /* renamed from: b */
    private final C139382a f379308b;

    public C139502m(C139382a aVar, C139317ac acVar) {
        this.f379307a = acVar;
        this.f379308b = aVar;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
    }

    /* renamed from: b */
    public final void mo115012b(int i) {
        C56610b bVar = this.f379307a.mo114891b(i).f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        String str = bVar.f151143b;
        C139382a aVar = this.f379308b;
        if (!aVar.f379010a.f101930a) {
            C60315a aVar2 = (C60315a) C60316b.f163205e.createBuilder();
            aVar2.copyOnWrite();
            C60316b bVar2 = (C60316b) aVar2.instance;
            bVar2.f163210c = 1;
            bVar2.f163208a |= 2;
            aVar2.copyOnWrite();
            C60316b bVar3 = (C60316b) aVar2.instance;
            str.getClass();
            bVar3.f163208a = 1 | bVar3.f163208a;
            bVar3.f163209b = str;
            aVar.mo114940b((C60316b) aVar2.build());
        }
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        mo115012b(i);
    }
}
