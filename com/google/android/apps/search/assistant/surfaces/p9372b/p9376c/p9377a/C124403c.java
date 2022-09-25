package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2828y.p2835e.C36863a;
import com.google.android.libraries.search.assistant.p2828y.p2835e.C36870h;
import com.google.assistant.p3897e.p3917i.p3918a.C51265bh;
import com.google.assistant.p3897e.p3917i.p3918a.C51269bl;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C124403c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124406f f343347a;

    public /* synthetic */ C124403c(C124406f fVar) {
        this.f343347a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C124406f fVar = this.f343347a;
        if (!((Boolean) obj).booleanValue()) {
            C51265bh bhVar = (C51265bh) C51270bm.f133476f.createBuilder();
            C51269bl blVar = C51269bl.UDC_DI_OPTED_OUT;
            bhVar.copyOnWrite();
            C51270bm bmVar = (C51270bm) bhVar.instance;
            bmVar.f133480c = Integer.valueOf(blVar.f133475f);
            bmVar.f133479b = 3;
            return C60856cj.m92900i(C58833ax.m90834k((C51270bm) bhVar.build()));
        }
        C36870h hVar = fVar.f343353c;
        C36863a aVar = new C36863a();
        aVar.mo40424b();
        return hVar.mo40429a(aVar.mo40423a());
    }
}
