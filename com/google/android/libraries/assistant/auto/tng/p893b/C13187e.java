package com.google.android.libraries.assistant.auto.tng.p893b;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.b.e */
/* compiled from: PG */
public final class C13187e {

    /* renamed from: a */
    public static volatile C70716eu f40823a;

    /* renamed from: b */
    private static volatile C70338di f40824b;

    /* renamed from: c */
    private static volatile C70338di f40825c;

    /* renamed from: d */
    private static volatile C70338di f40826d;

    /* renamed from: e */
    private static volatile C70338di f40827e;

    private C13187e() {
    }

    /* renamed from: a */
    public static C70338di m29436a() {
        C70338di diVar = f40825c;
        if (diVar == null) {
            synchronized (C13187e.class) {
                diVar = f40825c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.auto.tng.assistantreadinesstest.ArtModelService", "IncreaseHotwordCounter");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C13191i.f40830a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f40825c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m29437b() {
        C70338di diVar = f40827e;
        if (diVar == null) {
            synchronized (C13187e.class) {
                diVar = f40827e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.auto.tng.assistantreadinesstest.ArtModelService", "RegisterSessionEnd");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C13191i.f40830a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f40827e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m29438c() {
        C70338di diVar = f40826d;
        if (diVar == null) {
            synchronized (C13187e.class) {
                diVar = f40826d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.auto.tng.assistantreadinesstest.ArtModelService", "RegisterSessionStart");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C13191i.f40830a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f40826d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m29439d() {
        C70338di diVar = f40824b;
        if (diVar == null) {
            synchronized (C13187e.class) {
                diVar = f40824b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.auto.tng.assistantreadinesstest.ArtModelService", "RegisterTranscript");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C13193k.f40832c);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f40824b = diVar;
                }
            }
        }
        return diVar;
    }
}
