package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9361c;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48131a;
import com.google.assistant.p3741aa.p3742a.p3743a.C48154b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48163k;
import com.google.assistant.p3741aa.p3742a.p3743a.C48166n;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48136e;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48137f;
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.d */
/* compiled from: PG */
final class C124319d extends C48137f {

    /* renamed from: g */
    private static final C59071e f343186g = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.d");

    /* renamed from: h */
    private final C124271b f343187h;

    public C124319d(C124271b bVar) {
        this.f343187h = bVar;
    }

    /* renamed from: a */
    public final void mo106375a() {
        ((C59052c) ((C59052c) f343186g.mo56224b()).mo56372aa(36164)).mo56386p("Receives onPublisherNotReachable on CallStateTrait.");
        this.f343187h.mo106355a(this.f395018c.f394833c);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo106376b() {
        ((C59052c) ((C59052c) f343186g.mo56224b()).mo56372aa(36163)).mo56386p("Receives new CallState trait.");
        String str = this.f395018c.f394833c;
        C48163k kVar = (C48163k) C48166n.f124622e.createBuilder();
        kVar.copyOnWrite();
        C48166n nVar = (C48166n) kVar.instance;
        str.getClass();
        nVar.f124624a |= 1;
        nVar.f124625b = str;
        kVar.copyOnWrite();
        C48166n nVar2 = (C48166n) kVar.instance;
        nVar2.f124626c = 1;
        nVar2.f124624a |= 2;
        C48131a aVar = (C48131a) C48154b.f124594i.createBuilder();
        C51261bd bdVar = ((C48136e) this.f395021e).f124571a;
        if (bdVar == null) {
            bdVar = C51261bd.f133446d;
        }
        aVar.copyOnWrite();
        C48154b bVar = (C48154b) aVar.instance;
        bdVar.getClass();
        bVar.f124602g = bdVar;
        bVar.f124596a |= 32;
        kVar.copyOnWrite();
        C48166n nVar3 = (C48166n) kVar.instance;
        C48154b bVar2 = (C48154b) aVar.build();
        bVar2.getClass();
        nVar3.f124627d = bVar2;
        nVar3.f124624a |= 4;
        this.f343187h.mo106356b((C48166n) kVar.build(), false);
    }
}
