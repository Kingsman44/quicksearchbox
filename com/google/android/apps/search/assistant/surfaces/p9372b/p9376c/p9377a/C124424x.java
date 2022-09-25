package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.x */
/* compiled from: PG */
public final /* synthetic */ class C124424x implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C124424x f343405a = new C124424x();

    private /* synthetic */ C124424x() {
    }

    public final Object apply(Object obj) {
        C51450id idVar;
        Optional optional = (Optional) obj;
        ((C59052c) ((C59052c) C124426z.f343408a.mo56224b()).mo56372aa(37039)).mo56386p("Finish fetching media params");
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C33476a aVar = C124426z.f343409b;
        if (optional.isPresent()) {
            idVar = (C51450id) optional.get();
        } else {
            idVar = C51450id.f133992h;
        }
        C52230ka a = aVar.mo38879a(idVar);
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
