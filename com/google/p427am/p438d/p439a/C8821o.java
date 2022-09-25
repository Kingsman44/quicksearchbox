package com.google.p427am.p438d.p439a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.am.d.a.o */
/* compiled from: PG */
public final class C8821o {

    /* renamed from: a */
    public static volatile C70716eu f30206a;

    /* renamed from: b */
    private static volatile C70338di f30207b;

    /* renamed from: c */
    private static volatile C70338di f30208c;

    /* renamed from: d */
    private static volatile C70338di f30209d;

    /* renamed from: e */
    private static volatile C70338di f30210e;

    /* renamed from: f */
    private static volatile C70338di f30211f;

    /* renamed from: g */
    private static volatile C70338di f30212g;

    private C8821o() {
    }

    /* renamed from: a */
    public static C70338di m23431a() {
        C70338di diVar = f30207b;
        if (diVar == null) {
            synchronized (C8821o.class) {
                diVar = f30207b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DirectoryService", "LocalDeviceInfo");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8740bn.f30080a);
                    d.f187486b = C70850d.m103697c(C8742bp.f30082a);
                    diVar = d.mo62040a();
                    f30207b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m23432b() {
        C70338di diVar = f30208c;
        if (diVar == null) {
            synchronized (C8821o.class) {
                diVar = f30208c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DirectoryService", "ObserveCommonTime");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8744br.f30084a);
                    d.f187486b = C70850d.m103697c(C8746bt.f30086a);
                    diVar = d.mo62040a();
                    f30208c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m23433c() {
        C70338di diVar = f30212g;
        if (diVar == null) {
            synchronized (C8821o.class) {
                diVar = f30212g;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DirectoryService", "SendMessage");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8759cf.f30115a);
                    d.f187486b = C70850d.m103697c(C8761ch.f30117a);
                    diVar = d.mo62040a();
                    f30212g = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m23434d() {
        C70338di diVar = f30210e;
        if (diVar == null) {
            synchronized (C8821o.class) {
                diVar = f30210e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DirectoryService", "SetState");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8765cl.f30124d);
                    d.f187486b = C70850d.m103697c(C8767cn.f30129a);
                    diVar = d.mo62040a();
                    f30210e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m23435e() {
        C70338di diVar = f30211f;
        if (diVar == null) {
            synchronized (C8821o.class) {
                diVar = f30211f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DirectoryService", "UpdateMessageObservers");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8781da.f30152a);
                    d.f187486b = C70850d.m103697c(C8783dc.f30155a);
                    diVar = d.mo62040a();
                    f30211f = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m23436f() {
        C70338di diVar = f30209d;
        if (diVar == null) {
            synchronized (C8821o.class) {
                diVar = f30209d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DirectoryService", "UpdateStateObservers");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8798dr.f30173c);
                    d.f187486b = C70850d.m103697c(C8800dt.f30177b);
                    diVar = d.mo62040a();
                    f30209d = diVar;
                }
            }
        }
        return diVar;
    }
}
