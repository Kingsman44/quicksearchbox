package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.c */
/* compiled from: PG */
public final /* synthetic */ class C16687c {
    /* renamed from: a */
    public static MessageLite m33753a(C51809dy dyVar, String str, C63010eb ebVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C58833ax c = C58557jl.m90122c(dwVar.f135932a, new C16686b(str));
        if (!c.mo56113h()) {
            C59052c cVar = (C59052c) ((C59052c) C16688d.f48851a.mo56226d()).mo56372aa(46771);
            C51807dw dwVar2 = dyVar.f135938d;
            if (dwVar2 == null) {
                dwVar2 = C51807dw.f135930b;
            }
            cVar.mo56354G("key %s not present, clientOp args: %s", str, dwVar2.f135932a);
            return null;
        }
        try {
            C52230ka kaVar = ((C52232kc) c.mo56107c()).f137066c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            return (MessageLite) ebVar.mo59011j(kaVar.f137061c, C62921ba.m95368a());
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) C16688d.f48851a.mo56226d()).mo56372aa(46770)).mo56386p("InvalidProtocolBufferException");
            return null;
        }
    }
}
