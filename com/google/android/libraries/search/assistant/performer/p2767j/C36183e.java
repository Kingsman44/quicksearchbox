package com.google.android.libraries.search.assistant.performer.p2767j;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.assistant.p3897e.p3921j.C51671ads;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.assistant.p3897e.p3921j.apr;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.e */
/* compiled from: PG */
public final class C36183e {
    static {
        C58495hd.m89903q(C52321nk.f137326j, new C36179a("chat_args", "assistant.api.client_op.ChatMessageArgs"), C51671ads.f134906c, new C36179a("presence_manager_args", "assistant.api.client_op.PresenceManagerArgs"), aos.f135519e, new C36179a("speech_output_args", "assistant.api.client_op.SpeechOutputArgs"), apr.f135577d, new C36179a("wait_args", "assistant.api.client_op.WaitArgs"));
    }

    /* renamed from: a */
    public static C60870cx m64583a(C51809dy dyVar, String str, C63010eb ebVar, Function function) {
        try {
            return (C60870cx) m64585c(dyVar, str, ebVar).map(function).orElse(C60856cj.m92900i(C36180b.f94545b));
        } catch (C62974ct unused) {
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
        }
    }

    /* renamed from: b */
    public static MessageLite m64584b(C51809dy dyVar, String str, C63010eb ebVar) {
        try {
            return (MessageLite) m64585c(dyVar, str, ebVar).orElseThrow(new C36181c(str));
        } catch (C62974ct e) {
            throw new C35471g((Throwable) e);
        }
    }

    /* renamed from: c */
    public static Optional m64585c(C51809dy dyVar, String str, C63010eb ebVar) {
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
                return Optional.m71637of((MessageLite) ebVar.mo59011j(kaVar.f137061c, C62921ba.m95368a()));
            }
        }
        return Optional.empty();
    }

    /* renamed from: d */
    public static void m64586d(C51809dy dyVar, String str) {
        if (!dyVar.f135936b.equals(str)) {
            throw new C35471g(String.format("Unexpected ClientOpName. Expected %1$s, but got %2$s", new Object[]{str, dyVar.f135936b}));
        }
    }
}
