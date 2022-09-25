package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;
import p5535j.p5536a.p5545c.p5553d.C71163d;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.u */
/* compiled from: PG */
public final /* synthetic */ class C139021u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139025y f378074a;

    /* renamed from: b */
    public final /* synthetic */ String f378075b;

    /* renamed from: c */
    public final /* synthetic */ int f378076c;

    public /* synthetic */ C139021u(C139025y yVar, String str, int i) {
        this.f378074a = yVar;
        this.f378075b = str;
        this.f378076c = i;
    }

    public final Object apply(Object obj) {
        C139025y yVar = this.f378074a;
        String str = this.f378075b;
        int i = this.f378076c;
        C139012l lVar = (C139012l) obj;
        C139011k kVar = (C139011k) C139012l.f378057d.createBuilder();
        kVar.copyOnWrite();
        C139012l lVar2 = (C139012l) kVar.instance;
        lVar2.f378059a |= 2;
        lVar2.f378061c = str;
        C139012l lVar3 = (C139012l) kVar.build();
        C37215b bVar = yVar.f378085g;
        C37252a c = C37182a.f98238iy.mo40779c();
        ((C37253b) c).mo40792p(C71163d.f189849e, C139025y.m225808a(C139024x.m225807a(i)));
        c.mo40781e(C62722b.OK);
        bVar.mo19974a(c);
        return lVar3;
    }
}
