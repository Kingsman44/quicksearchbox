package com.google.android.apps.search.googleapp.discover.p10179c;

import com.google.android.apps.search.googleapp.discover.streamui.p10231g.C134748a;
import com.google.android.libraries.silk.p3205a.p3206a.C41709a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56611c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56612d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56617i;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56618j;

/* renamed from: com.google.android.apps.search.googleapp.discover.c.a */
/* compiled from: PG */
public final class C134103a implements C134748a {

    /* renamed from: a */
    public String f365294a;

    /* renamed from: b */
    private final C41709a f365295b;

    /* renamed from: c */
    private boolean f365296c = false;

    /* renamed from: d */
    private final int f365297d;

    public C134103a(long j, C41709a aVar) {
        int i = 0;
        int i2 = (int) j;
        int i3 = 1;
        if (i2 == 0) {
            i = 1;
        } else if (i2 == 1) {
            i = 2;
        } else if (i2 == 2) {
            i = 3;
        } else if (i2 == 3) {
            i = 4;
        }
        this.f365297d = i != 0 ? i : i3;
        this.f365295b = aVar;
    }

    /* renamed from: a */
    public final void mo111560a(int i, int i2) {
        String str;
        if (this.f365297d - 1 == 2 && (str = this.f365294a) != null && !this.f365296c) {
            C41709a aVar = this.f365295b;
            C56617i iVar = (C56617i) C56618j.f151169c.createBuilder();
            C56611c cVar = (C56611c) C56612d.f151152f.createBuilder();
            C56609a aVar2 = (C56609a) C56610b.f151140k.createBuilder();
            aVar2.copyOnWrite();
            C56610b bVar = (C56610b) aVar2.instance;
            bVar.f151142a = 2 | bVar.f151142a;
            bVar.f151144c = str;
            C56610b bVar2 = (C56610b) aVar2.build();
            cVar.copyOnWrite();
            C56612d dVar = (C56612d) cVar.instance;
            bVar2.getClass();
            dVar.mo54429a();
            dVar.f151154a.add(bVar2);
            C56612d dVar2 = (C56612d) cVar.build();
            iVar.copyOnWrite();
            C56618j jVar = (C56618j) iVar.instance;
            dVar2.getClass();
            jVar.f151172b = dVar2;
            jVar.f151171a |= 1;
            aVar.mo44312b((C56618j) iVar.build());
            this.f365296c = true;
        }
    }
}
