package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.content.SharedPreferences;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.q */
/* compiled from: PG */
public final class C93110q {

    /* renamed from: a */
    public static final C59071e f259736a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.g.q");

    /* renamed from: b */
    public final SharedPreferences f259737b;

    public C93110q(SharedPreferences sharedPreferences) {
        this.f259737b = sharedPreferences;
    }

    /* renamed from: a */
    public static C52070ec m153193a() {
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
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
}
