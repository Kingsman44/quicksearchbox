package com.google.android.libraries.assistant.p1533o;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;

/* renamed from: com.google.android.libraries.assistant.o.bg */
/* compiled from: PG */
public final class C18471bg {

    /* renamed from: a */
    private static volatile C70338di f52406a;

    /* renamed from: b */
    private static volatile C70716eu f52407b;

    private C18471bg() {
    }

    /* renamed from: a */
    public static C18470bf m35939a(C70888j jVar) {
        return (C18470bf) C70852a.m103707c(new C18467bc(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m35940b() {
        C70338di diVar = f52406a;
        if (diVar == null) {
            synchronized (C18471bg.class) {
                diVar = f52406a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.searchhandover.proto.VoiceSearch", "DoVoiceQuery");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C18482br.f52415c);
                    d.f187486b = C70850d.m103697c(C18484bt.f52419c);
                    diVar = d.mo62040a();
                    f52406a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m35941c() {
        C70716eu euVar = f52407b;
        if (euVar == null) {
            synchronized (C18471bg.class) {
                euVar = f52407b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.assistant.searchhandover.proto.VoiceSearch");
                    etVar.mo62433a(m35940b());
                    euVar = new C70716eu(etVar);
                    f52407b = euVar;
                }
            }
        }
        return euVar;
    }
}
