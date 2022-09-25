package com.google.android.apps.search.assistant.verticals.p9880a.p9891g;

import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.g.g */
/* compiled from: PG */
public final /* synthetic */ class C130398g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C130398g f357340a = new C130398g();

    private /* synthetic */ C130398g() {
    }

    public final Object apply(Object obj) {
        if (((Exception) obj) instanceof TimeoutException) {
            ((C59052c) ((C59052c) C130406o.f357353a.mo56226d()).mo56372aa(39428)).mo56386p("Timeout while waiting activity");
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.DEADLINE_EXCEEDED;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            ecVar.f136654b = kgVar2;
            ecVar.f136653a |= 1;
            return (C52070ec) dzVar.build();
        }
        C51810dz dzVar2 = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar2 = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar2 = C52235kf.INTERNAL;
        kdVar2.copyOnWrite();
        C52236kg kgVar3 = (C52236kg) kdVar2.instance;
        kgVar3.f137092b = kfVar2.f137088t;
        kgVar3.f137091a |= 1;
        dzVar2.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar2.instance;
        C52236kg kgVar4 = (C52236kg) kdVar2.build();
        kgVar4.getClass();
        ecVar2.f136654b = kgVar4;
        ecVar2.f136653a |= 1;
        return (C52070ec) dzVar2.build();
    }
}
