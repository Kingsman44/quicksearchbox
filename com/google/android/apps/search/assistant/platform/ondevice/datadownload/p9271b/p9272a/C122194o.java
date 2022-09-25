package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.a.o */
/* compiled from: PG */
public final class C122194o {

    /* renamed from: a */
    public static volatile C70716eu f338890a;

    /* renamed from: b */
    private static volatile C70338di f338891b;

    /* renamed from: c */
    private static volatile C70338di f338892c;

    /* renamed from: d */
    private static volatile C70338di f338893d;

    /* renamed from: e */
    private static volatile C70338di f338894e;

    /* renamed from: f */
    private static volatile C70338di f338895f;

    /* renamed from: g */
    private static volatile C70338di f338896g;

    private C122194o() {
    }

    /* renamed from: a */
    public static C70338di m201733a() {
        C70338di diVar = f338893d;
        if (diVar == null) {
            synchronized (C122194o.class) {
                diVar = f338893d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.ondevice.datadownload.interim.api.InterimDataDownloadApi", "GetClientFileGroup");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C122183d.f338870d);
                    d.f187486b = C70850d.m103697c(C122181b.f338867b);
                    diVar = d.mo62040a();
                    f338893d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m201734b() {
        C70338di diVar = f338891b;
        if (diVar == null) {
            synchronized (C122194o.class) {
                diVar = f338891b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.ondevice.datadownload.interim.api.InterimDataDownloadApi", "GetClientFileGroups");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C122185f.f338875f);
                    d.f187486b = C70850d.m103697c(C122187h.f338882b);
                    diVar = d.mo62040a();
                    f338891b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m201735c() {
        C70338di diVar = f338894e;
        if (diVar == null) {
            synchronized (C122194o.class) {
                diVar = f338894e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.ondevice.datadownload.interim.api.InterimDataDownloadApi", "GetConfig");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C29690f.f80408m);
                    d.f187486b = C70850d.m103697c(C122198s.f338900b);
                    diVar = d.mo62040a();
                    f338894e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m201736d() {
        C70338di diVar = f338892c;
        if (diVar == null) {
            synchronized (C122194o.class) {
                diVar = f338892c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.ondevice.datadownload.interim.api.InterimDataDownloadApi", "GetExtendedFileGroups");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C122185f.f338875f);
                    d.f187486b = C70850d.m103697c(C122189j.f338885b);
                    diVar = d.mo62040a();
                    f338892c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m201737e() {
        C70338di diVar = f338896g;
        if (diVar == null) {
            synchronized (C122194o.class) {
                diVar = f338896g;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.ondevice.datadownload.interim.api.InterimDataDownloadApi", "RetainOnly");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C122196q.f338897b);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f338896g = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m201738f() {
        C70338di diVar = f338895f;
        if (diVar == null) {
            synchronized (C122194o.class) {
                diVar = f338895f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.ondevice.datadownload.interim.api.InterimDataDownloadApi", "WriteConfigAndReturnTransformedGroup");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C48773e.f126198g);
                    d.f187486b = C70850d.m103697c(C28708an.f77994l);
                    diVar = d.mo62040a();
                    f338895f = diVar;
                }
            }
        }
        return diVar;
    }
}
