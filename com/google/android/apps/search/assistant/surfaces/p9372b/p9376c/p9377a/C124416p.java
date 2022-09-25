package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C124416p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51334dw f343376a;

    public /* synthetic */ C124416p(C51334dw dwVar) {
        this.f343376a = dwVar;
    }

    public final Object apply(Object obj) {
        C51334dw dwVar = this.f343376a;
        C59071e eVar = C124419s.f343384a;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C33476a aVar = C124419s.f343385b;
        C51303cs csVar = (C51303cs) dwVar.toBuilder();
        csVar.copyOnWrite();
        C51334dw dwVar2 = (C51334dw) csVar.instance;
        dwVar2.f133703q = ((C51333dv) obj).f133656g;
        dwVar2.f133685a |= C89885b.S3REQUEST_VALUE;
        C52230ka a = aVar.mo38879a((C51334dw) csVar.build());
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        a.getClass();
        baVar.f87991b = a;
        baVar.f87990a |= 1;
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32806ba baVar2 = (C32806ba) azVar.build();
        baVar2.getClass();
        awVar.f87981b = baVar2;
        awVar.f87980a = 1;
        return (C32801aw) auVar.build();
    }
}
