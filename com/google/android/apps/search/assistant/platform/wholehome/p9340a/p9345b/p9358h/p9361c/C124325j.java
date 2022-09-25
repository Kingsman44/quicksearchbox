package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9361c;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.android.gms.usonia.p10881d.C146198b;
import com.google.android.gms.usonia.p10881d.C146199c;
import com.google.assistant.p3741aa.p3742a.p3743a.C48131a;
import com.google.assistant.p3741aa.p3742a.p3743a.C48154b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48163k;
import com.google.assistant.p3741aa.p3742a.p3743a.C48166n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.j */
/* compiled from: PG */
final class C124325j extends C146199c {

    /* renamed from: g */
    private static final C59071e f343198g = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.c.j");

    /* renamed from: h */
    private final C124271b f343199h;

    public C124325j(C124271b bVar) {
        this.f343199h = bVar;
    }

    /* renamed from: a */
    public final void mo106375a() {
        ((C59052c) ((C59052c) f343198g.mo56224b()).mo56372aa(36173)).mo56386p("Receives onPublisherNotReachable on DeviceInfoTrait.");
        this.f343199h.mo106355a(this.f395018c.f394833c);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo106376b() {
        ((C59052c) ((C59052c) f343198g.mo56224b()).mo56372aa(36172)).mo56386p("Receives new DeviceInfo trait.");
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
        String str2 = ((C146198b) this.f395021e).f395014b;
        aVar.copyOnWrite();
        C48154b bVar = (C48154b) aVar.instance;
        str2.getClass();
        bVar.f124596a |= 16;
        bVar.f124601f = str2;
        String str3 = ((C146198b) this.f395021e).f395013a;
        aVar.copyOnWrite();
        C48154b bVar2 = (C48154b) aVar.instance;
        str3.getClass();
        bVar2.f124596a |= 64;
        bVar2.f124603h = str3;
        kVar.copyOnWrite();
        C48166n nVar3 = (C48166n) kVar.instance;
        C48154b bVar3 = (C48154b) aVar.build();
        bVar3.getClass();
        nVar3.f124627d = bVar3;
        nVar3.f124624a |= 4;
        this.f343199h.mo106356b((C48166n) kVar.build(), false);
    }
}
