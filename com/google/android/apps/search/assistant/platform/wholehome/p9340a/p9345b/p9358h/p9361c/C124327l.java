package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9361c;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48131a;
import com.google.assistant.p3741aa.p3742a.p3743a.C48154b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48163k;
import com.google.assistant.p3741aa.p3742a.p3743a.C48166n;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48149r;
import com.google.assistant.p3741aa.p3742a.p3743a.p3744a.C48150s;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.l */
/* compiled from: PG */
final class C124327l extends C48150s {

    /* renamed from: g */
    private static final C59071e f343202g = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.l");

    /* renamed from: h */
    private final C124271b f343203h;

    public C124327l(C124271b bVar) {
        this.f343203h = bVar;
    }

    /* renamed from: a */
    public final void mo106375a() {
        ((C59052c) ((C59052c) f343202g.mo56224b()).mo56372aa(36176)).mo56386p("Receives onPublisherNotReachable on MediaTrait.");
        this.f343203h.mo106355a(this.f395018c.f394833c);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo106376b() {
        ((C59052c) ((C59052c) f343202g.mo56224b()).mo56372aa(36175)).mo56386p("Receives new Media trait.");
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
        C51450id idVar = ((C48149r) this.f395021e).f124587a;
        if (idVar == null) {
            idVar = C51450id.f133992h;
        }
        aVar.copyOnWrite();
        C48154b bVar = (C48154b) aVar.instance;
        idVar.getClass();
        bVar.f124599d = idVar;
        bVar.f124596a |= 4;
        kVar.copyOnWrite();
        C48166n nVar3 = (C48166n) kVar.instance;
        C48154b bVar2 = (C48154b) aVar.build();
        bVar2.getClass();
        nVar3.f124627d = bVar2;
        nVar3.f124624a |= 4;
        this.f343203h.mo106356b((C48166n) kVar.build(), false);
    }
}
