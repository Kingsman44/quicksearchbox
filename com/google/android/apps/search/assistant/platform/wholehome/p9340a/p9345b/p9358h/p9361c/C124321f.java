package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9361c;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48131a;
import com.google.assistant.p3741aa.p3742a.p3743a.C48154b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48163k;
import com.google.assistant.p3741aa.p3742a.p3743a.C48166n;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48139h;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48140i;
import com.google.assistant.p3897e.p3921j.C52366pb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.f */
/* compiled from: PG */
final class C124321f extends C48140i {

    /* renamed from: g */
    private static final C59071e f343190g = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.f");

    /* renamed from: h */
    private final C124271b f343191h;

    public C124321f(C124271b bVar) {
        this.f343191h = bVar;
    }

    /* renamed from: a */
    public final void mo106375a() {
        ((C59052c) ((C59052c) f343190g.mo56224b()).mo56372aa(36167)).mo56386p("Receives onPublisherNotReachable on ConfigSettings Trait.");
        this.f343191h.mo106355a(this.f395018c.f394833c);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo106376b() {
        ((C59052c) ((C59052c) f343190g.mo56224b()).mo56372aa(36166)).mo56386p("Receives new ConfigSettings trait.");
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
        C52366pb pbVar = ((C48139h) this.f395021e).f124575a;
        if (pbVar == null) {
            pbVar = C52366pb.f137417b;
        }
        aVar.copyOnWrite();
        C48154b bVar = (C48154b) aVar.instance;
        pbVar.getClass();
        bVar.f124600e = pbVar;
        bVar.f124596a |= 8;
        kVar.copyOnWrite();
        C48166n nVar3 = (C48166n) kVar.instance;
        C48154b bVar2 = (C48154b) aVar.build();
        bVar2.getClass();
        nVar3.f124627d = bVar2;
        nVar3.f124624a |= 4;
        this.f343191h.mo106356b((C48166n) kVar.build(), false);
    }
}
