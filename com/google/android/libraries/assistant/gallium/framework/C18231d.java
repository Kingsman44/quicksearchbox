package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18297q;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65679e;
import com.google.protos.p5127o.C65680f;
import com.google.protos.p5127o.C65682h;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.d */
/* compiled from: PG */
public interface C18231d {

    /* renamed from: a */
    public static final C65680f f51786a;

    static {
        C65679e eVar = (C65679e) C65680f.f178455c.createBuilder();
        eVar.copyOnWrite();
        C65680f fVar = (C65680f) eVar.instance;
        fVar.f178457a |= 1;
        fVar.f178458b = "outsideGalliumJava";
        f51786a = (C65680f) eVar.build();
    }

    /* renamed from: a */
    C60870cx mo23657a(C65680f fVar, C65682h hVar, String str, MessageLite messageLite, String str2, C63010eb ebVar, C18238f fVar2);

    /* renamed from: b */
    C65682h mo23658b(C65682h hVar, C18297q qVar);

    /* renamed from: c */
    Executor mo23659c();

    /* renamed from: d */
    void mo23660d(C65682h hVar);
}
