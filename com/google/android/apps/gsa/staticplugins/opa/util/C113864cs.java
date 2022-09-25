package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cs */
/* compiled from: PG */
public final class C113864cs {

    /* renamed from: a */
    private static final C59071e f315281a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.cs");

    /* renamed from: a */
    public static MessageLite m188495a(C51809dy dyVar, String str, C63010eb ebVar) {
        try {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            for (C52232kc kcVar : dwVar.f135932a) {
                if (str.equals(kcVar.f137065b)) {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return (MessageLite) ebVar.mo59008g(kaVar.f137061c);
                }
            }
            return null;
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f315281a.mo56225c()).mo56382g(e)).mo56372aa(28453)).mo56389s("Failed to parse client op %s", dyVar.f135936b);
            return null;
        }
    }
}
