package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.f */
/* compiled from: PG */
public final /* synthetic */ class C117692f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C117692f f326668a = new C117692f();

    private /* synthetic */ C117692f() {
    }

    public final Object apply(Object obj) {
        try {
            C52230ka kaVar = ((C52232kc) obj).f137066c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            return (C51239ai) C62942bv.parseFrom((C62942bv) C51239ai.f133399g, kaVar.f137061c, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56382g(e)).mo56372aa(18591)).mo56386p("Can't read AssistantSdkDeviceParams proto.");
            return C51239ai.f133399g;
        }
    }
}
