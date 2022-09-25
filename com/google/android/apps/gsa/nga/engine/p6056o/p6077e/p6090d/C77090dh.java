package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dh */
/* compiled from: PG */
public final /* synthetic */ class C77090dh implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C77090dh f212756a = new C77090dh();

    private /* synthetic */ C77090dh() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58974d dVar = C77123en.f212843a;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.ChatMessageArgs";
        C63088z byteString = ((C52321nk) obj).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return t.a("chat_message.SEND", "chat_args", (C52230ka) jzVar.build());
    }
}
