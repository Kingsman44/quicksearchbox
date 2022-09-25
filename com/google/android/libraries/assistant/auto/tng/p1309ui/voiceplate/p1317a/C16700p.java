package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.p */
/* compiled from: PG */
public final /* synthetic */ class C16700p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C63010eb f48871a;

    public /* synthetic */ C16700p(C63010eb ebVar) {
        this.f48871a = ebVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63010eb ebVar = this.f48871a;
        try {
            C52230ka kaVar = ((C52232kc) obj).f137066c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            return (MessageLite) ebVar.mo59008g(kaVar.f137061c);
        } catch (C62974ct unused) {
            return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
