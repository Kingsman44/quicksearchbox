package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;
import p5535j.p5536a.p5545c.p5553d.C71163d;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.t */
/* compiled from: PG */
public final /* synthetic */ class C139020t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139025y f378071a;

    /* renamed from: b */
    public final /* synthetic */ String f378072b;

    /* renamed from: c */
    public final /* synthetic */ int f378073c;

    public /* synthetic */ C139020t(C139025y yVar, String str, int i) {
        this.f378071a = yVar;
        this.f378072b = str;
        this.f378073c = i;
    }

    public final Object apply(Object obj) {
        C139025y yVar = this.f378071a;
        String str = this.f378072b;
        int i = this.f378073c;
        C139010j jVar = (C139010j) obj;
        C139009i iVar = (C139009i) C139010j.f378052d.createBuilder();
        iVar.copyOnWrite();
        C139010j jVar2 = (C139010j) iVar.instance;
        jVar2.f378054a |= 2;
        jVar2.f378056c = str;
        C139010j jVar3 = (C139010j) iVar.build();
        C37215b bVar = yVar.f378085g;
        C37252a c = C37182a.f98238iy.mo40779c();
        ((C37253b) c).mo40792p(C71163d.f189849e, C139025y.m225808a(C139024x.m225807a(i)));
        c.mo40781e(C62722b.OK);
        bVar.mo19974a(c);
        return jVar3;
    }
}
