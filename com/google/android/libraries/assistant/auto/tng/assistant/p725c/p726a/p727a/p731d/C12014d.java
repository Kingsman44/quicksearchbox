package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.d */
/* compiled from: PG */
public class C12014d implements C70298d {
    /* renamed from: b */
    public void mo20363b(C11989b bVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo20364c(C11989b bVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C12017g.f38543a;
        if (euVar == null) {
            synchronized (C12017g.class) {
                euVar = C12017g.f38543a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.assistant.auto.tng.assistant.service.audio.concurrentlistening.service.ConcurrentListeningService");
                    etVar.mo62433a(C12017g.m27909a());
                    etVar.mo62433a(C12017g.m27910b());
                    euVar = new C70716eu(etVar);
                    C12017g.f38543a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C12017g.m27909a(), C70861ai.m103724c(new C12016f(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C12017g.m27910b(), C70861ai.m103725d(new C12016f(this, 1)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}
