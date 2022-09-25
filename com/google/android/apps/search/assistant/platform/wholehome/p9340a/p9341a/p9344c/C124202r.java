package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.google.assistant.p3741aa.C48169d;
import com.google.assistant.p3741aa.C48173h;
import com.google.assistant.p3741aa.p3742a.p3743a.C48156d;
import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.r */
/* compiled from: PG */
public final class C124202r {

    /* renamed from: a */
    private static volatile C70338di f342957a;

    /* renamed from: b */
    private static volatile C70338di f342958b;

    /* renamed from: c */
    private static volatile C70716eu f342959c;

    private C124202r() {
    }

    /* renamed from: a */
    public static C70338di m203650a() {
        C70338di diVar = f342957a;
        if (diVar == null) {
            synchronized (C124202r.class) {
                diVar = f342957a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.wholehome.crossdevice.api.proto.PlatformCrossDeviceService", "ExecuteRemoteInteraction");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C48169d.f124635g);
                    d.f187486b = C70850d.m103697c(C48173h.f124650e);
                    diVar = d.mo62040a();
                    f342957a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m203651b() {
        C70338di diVar = f342958b;
        if (diVar == null) {
            synchronized (C124202r.class) {
                diVar = f342958b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.wholehome.crossdevice.api.proto.PlatformCrossDeviceService", "GetAllRemoteDeviceStates");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C48156d.f124605a);
                    d.f187486b = C70850d.m103697c(C48160h.f124608d);
                    diVar = d.mo62040a();
                    f342958b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m203652c() {
        C70716eu euVar = f342959c;
        if (euVar == null) {
            synchronized (C124202r.class) {
                euVar = f342959c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.wholehome.crossdevice.api.proto.PlatformCrossDeviceService");
                    etVar.mo62433a(m203650a());
                    etVar.mo62433a(m203651b());
                    euVar = new C70716eu(etVar);
                    f342959c = euVar;
                }
            }
        }
        return euVar;
    }
}
