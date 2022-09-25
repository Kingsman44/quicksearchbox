package com.google.android.apps.search.fedora.p10107j.p10108a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.apps.search.fedora.j.a.q */
/* compiled from: PG */
public final class C132970q {

    /* renamed from: a */
    private static volatile C70338di f362658a;

    /* renamed from: b */
    private static volatile C70338di f362659b;

    /* renamed from: c */
    private static volatile C70338di f362660c;

    /* renamed from: d */
    private static volatile C70338di f362661d;

    /* renamed from: e */
    private static volatile C70716eu f362662e;

    private C132970q() {
    }

    /* renamed from: a */
    public static C132967n m215927a(C70888j jVar) {
        return (C132967n) C70864c.m103731e(new C132966m(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m215928b() {
        C70338di diVar = f362658a;
        if (diVar == null) {
            synchronized (C132970q.class) {
                diVar = f362658a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.fedora.trainingcacheservice.proto.FedoraTrainingCacheService", "CacheEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132955b.f362639f);
                    d.f187486b = C70850d.m103697c(C132957d.f362646a);
                    diVar = d.mo62040a();
                    f362658a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m215929c() {
        C70338di diVar = f362661d;
        if (diVar == null) {
            synchronized (C132970q.class) {
                diVar = f362661d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.fedora.trainingcacheservice.proto.FedoraTrainingCacheService", "ClearTrainingCache");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132963j.f362652a);
                    d.f187486b = C70850d.m103697c(C132965l.f362654a);
                    diVar = d.mo62040a();
                    f362661d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m215930d() {
        C70338di diVar = f362660c;
        if (diVar == null) {
            synchronized (C132970q.class) {
                diVar = f362660c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.fedora.trainingcacheservice.proto.FedoraTrainingCacheService", "LogTrainingCacheStats");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132972s.f362663a);
                    d.f187486b = C70850d.m103697c(C132974u.f362665a);
                    diVar = d.mo62040a();
                    f362660c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m215931e() {
        C70338di diVar = f362659b;
        if (diVar == null) {
            synchronized (C132970q.class) {
                diVar = f362659b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.fedora.trainingcacheservice.proto.FedoraTrainingCacheService", "PerformCacheMaintenance");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132959f.f362648a);
                    d.f187486b = C70850d.m103697c(C132961h.f362650a);
                    diVar = d.mo62040a();
                    f362659b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70716eu m215932f() {
        C70716eu euVar = f362662e;
        if (euVar == null) {
            synchronized (C132970q.class) {
                euVar = f362662e;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.fedora.trainingcacheservice.proto.FedoraTrainingCacheService");
                    etVar.mo62433a(m215928b());
                    etVar.mo62433a(m215931e());
                    etVar.mo62433a(m215930d());
                    etVar.mo62433a(m215929c());
                    euVar = new C70716eu(etVar);
                    f362662e = euVar;
                }
            }
        }
        return euVar;
    }
}
