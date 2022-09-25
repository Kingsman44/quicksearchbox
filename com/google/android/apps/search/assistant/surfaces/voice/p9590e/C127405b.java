package com.google.android.apps.search.assistant.surfaces.voice.p9590e;

import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.e.b */
/* compiled from: PG */
public final /* synthetic */ class C127405b {
    /* renamed from: a */
    public static C52070ec m208357a(C51809dy dyVar, String str, C63010eb ebVar, Function function) {
        try {
            return (C52070ec) m208358b(dyVar, str, ebVar).map(function).orElse(C127406c.f350821b);
        } catch (C62974ct unused) {
            return C127406c.m208359a(C52235kf.INVALID_ARGUMENT);
        }
    }

    /* renamed from: b */
    public static Optional m208358b(C51809dy dyVar, String str, C63010eb ebVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        for (C52232kc kcVar : dwVar.f135932a) {
            if (kcVar.f137065b.equals(str)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                return Optional.m71637of((MessageLite) ebVar.mo59008g(kaVar.f137061c));
            }
        }
        return Optional.empty();
    }
}
