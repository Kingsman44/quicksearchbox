package com.google.android.libraries.search.assistant.performer.p2754f.p2756b;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.performer.f.b.d */
/* compiled from: PG */
public final class C36004d {

    /* renamed from: a */
    private static volatile C70338di f94202a;

    /* renamed from: b */
    private static volatile C70716eu f94203b;

    private C36004d() {
    }

    /* renamed from: a */
    public static C70338di m64396a() {
        C70338di diVar = f94202a;
        if (diVar == null) {
            synchronized (C36004d.class) {
                diVar = f94202a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.performer.intentplate.grpc.IntentPlateClientOpService", "ObserveClientOpData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C51809dy.f135933f);
                    diVar = d.mo62040a();
                    f94202a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m64397b() {
        C70716eu euVar = f94203b;
        if (euVar == null) {
            synchronized (C36004d.class) {
                euVar = f94203b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.performer.intentplate.grpc.IntentPlateClientOpService");
                    etVar.mo62433a(m64396a());
                    euVar = new C70716eu(etVar);
                    f94203b = euVar;
                }
            }
        }
        return euVar;
    }
}
