package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f */
/* compiled from: PG */
public final class C77280f {

    /* renamed from: a */
    public final t f213156a;

    public C77280f(t tVar) {
        this.f213156a = tVar;
    }

    /* renamed from: a */
    static C51098gh m124015a(y yVar) {
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String str = yVar.b().i;
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = str;
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        return (C51098gh) ggVar.build();
    }

    /* renamed from: b */
    static final C51809dy m124016b(C52289mf mfVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.CallArgs";
        C63088z byteString = mfVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return t.a("call.CALL", "call_client_op_args", (C52230ka) jzVar.build());
    }
}
