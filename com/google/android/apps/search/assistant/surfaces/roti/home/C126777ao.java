package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ao */
/* compiled from: PG */
final class C126777ao implements C119908e {

    /* renamed from: a */
    final /* synthetic */ C51809dy f349119a;

    /* renamed from: b */
    final /* synthetic */ C126778ap f349120b;

    public C126777ao(C126778ap apVar, C51809dy dyVar) {
        this.f349120b = apVar;
        this.f349119a = dyVar;
    }

    /* renamed from: a */
    public final C60870cx mo104299a() {
        C52235kf kfVar;
        C52235kf kfVar2;
        if (this.f349120b.f349121a.f349133l.isEmpty()) {
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar3 = C52235kf.IGNORE;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar3.f137088t;
            kgVar.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            ecVar.f136654b = kgVar2;
            ecVar.f136653a |= 1;
            return C60856cj.m92900i((C52070ec) dzVar.build());
        }
        kfVar = C52235kf.OK;
        try {
            ((C2164c) this.f349120b.f349121a.f349133l.get()).mo5437b(C126780ar.m207388h(this.f349119a));
        } catch (C126849j e) {
            kfVar2 = e.f349326a;
            ((C2164c) this.f349120b.f349121a.f349133l.get()).mo5439d(e);
        } catch (C126852m e2) {
            kfVar2 = C52235kf.IGNORE;
            ((C2164c) this.f349120b.f349121a.f349133l.get()).mo5439d(e2);
        }
        this.f349120b.f349121a.f349133l = Optional.empty();
        C51810dz dzVar2 = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar2 = (C52233kd) C52236kg.f137089d.createBuilder();
        kdVar2.copyOnWrite();
        C52236kg kgVar3 = (C52236kg) kdVar2.instance;
        kgVar3.f137092b = kfVar.f137088t;
        kgVar3.f137091a |= 1;
        dzVar2.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar2.instance;
        C52236kg kgVar4 = (C52236kg) kdVar2.build();
        kgVar4.getClass();
        ecVar2.f136654b = kgVar4;
        ecVar2.f136653a |= 1;
        return C60856cj.m92900i((C52070ec) dzVar2.build());
        kfVar = kfVar2;
        this.f349120b.f349121a.f349133l = Optional.empty();
        C51810dz dzVar22 = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar22 = (C52233kd) C52236kg.f137089d.createBuilder();
        kdVar22.copyOnWrite();
        C52236kg kgVar32 = (C52236kg) kdVar22.instance;
        kgVar32.f137092b = kfVar.f137088t;
        kgVar32.f137091a |= 1;
        dzVar22.copyOnWrite();
        C52070ec ecVar22 = (C52070ec) dzVar22.instance;
        C52236kg kgVar42 = (C52236kg) kdVar22.build();
        kgVar42.getClass();
        ecVar22.f136654b = kgVar42;
        ecVar22.f136653a |= 1;
        return C60856cj.m92900i((C52070ec) dzVar22.build());
    }

    /* renamed from: b */
    public final void mo104300b() {
    }
}
