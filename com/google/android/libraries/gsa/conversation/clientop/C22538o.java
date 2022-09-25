package com.google.android.libraries.gsa.conversation.clientop;

import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.o */
/* compiled from: PG */
public abstract class C22538o {

    /* renamed from: n */
    public static final C60870cx f62144n = C60856cj.m92900i(C22402a.f61894b);

    /* renamed from: m */
    public static MessageLite m41992m(C51807dw dwVar, String str, C63010eb ebVar) {
        for (C52232kc kcVar : dwVar.f135932a) {
            if (str.equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                return (MessageLite) ebVar.mo59011j(kaVar.f137061c, C62921ba.m95368a());
            }
        }
        throw new C22371a(str);
    }

    /* renamed from: a */
    public abstract C60870cx mo20765a(C51809dy dyVar, C22434e eVar);
}
