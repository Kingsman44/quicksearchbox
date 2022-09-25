package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.h */
/* compiled from: PG */
public final class C123060h {

    /* renamed from: a */
    private static final C59071e f340622a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.h");

    /* renamed from: a */
    public static Optional m202402a(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.device.properties".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.DeviceProperties".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return Optional.m71637of((C51334dw) C62942bv.parseFrom((C62942bv) C51334dw.f133658ab, kaVar2.f137061c));
                    } catch (C62974ct e) {
                        ((C59052c) ((C59052c) ((C59052c) f340622a.mo56226d()).mo56382g(e)).mo56372aa(35115)).mo56386p("Could not parse device properties");
                        return Optional.empty();
                    }
                }
            }
        }
        return Optional.empty();
    }
}
