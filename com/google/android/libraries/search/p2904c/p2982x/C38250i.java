package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37414bs;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37645gx;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.C37679hz;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.c.x.i */
/* compiled from: PG */
public final class C38250i {

    /* renamed from: a */
    public static volatile C70716eu f101344a;

    /* renamed from: b */
    private static volatile C70338di f101345b;

    /* renamed from: c */
    private static volatile C70338di f101346c;

    /* renamed from: d */
    private static volatile C70338di f101347d;

    /* renamed from: e */
    private static volatile C70338di f101348e;

    /* renamed from: f */
    private static volatile C70338di f101349f;

    /* renamed from: g */
    private static volatile C70338di f101350g;

    /* renamed from: h */
    private static volatile C70338di f101351h;

    /* renamed from: i */
    private static volatile C70338di f101352i;

    /* renamed from: j */
    private static volatile C70338di f101353j;

    /* renamed from: k */
    private static volatile C70338di f101354k;

    /* renamed from: l */
    private static volatile C70338di f101355l;

    /* renamed from: m */
    private static volatile C70338di f101356m;

    /* renamed from: n */
    private static volatile C70338di f101357n;

    private C38250i() {
    }

    /* renamed from: a */
    public static C70338di m67533a() {
        C70338di diVar = f101347d;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101347d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "ActivateAudioRequestClient");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C37407bl.f99325c);
                    d.f187486b = C70850d.m103697c(C38240b.f101338c);
                    diVar = d.mo62040a();
                    f101347d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m67534b() {
        C70338di diVar = f101357n;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101357n;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "Connect");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38255n.f101362a);
                    d.f187486b = C70850d.m103697c(C38257p.f101364a);
                    diVar = d.mo62040a();
                    f101357n = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m67535c() {
        C70338di diVar = f101349f;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101349f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "DeactivateClient");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38253l.f101358c);
                    d.f187486b = C70850d.m103697c(C38259r.f101366a);
                    diVar = d.mo62040a();
                    f101349f = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m67536d() {
        C70338di diVar = f101356m;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101356m;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "GetAudioRequestReadOnlyListeningSession");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C37454cc.f99428c);
                    d.f187486b = C70850d.m103697c(C38237at.f101333c);
                    diVar = d.mo62040a();
                    f101356m = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m67537e() {
        C70338di diVar = f101348e;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101348e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "GetClientDeactivatedStatus");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38253l.f101358c);
                    d.f187486b = C70850d.m103697c(C37414bs.f99343c);
                    diVar = d.mo62040a();
                    f101348e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m67538f() {
        C70338di diVar = f101355l;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101355l;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "GetExternalAdapterStopListeningTriggeredStatus");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38261t.f101368c);
                    d.f187486b = C70850d.m103697c(C38263v.f101372a);
                    diVar = d.mo62040a();
                    f101355l = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: g */
    public static C70338di m67539g() {
        C70338di diVar = f101353j;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101353j;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "NotifyStartListening");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C37645gx.f100013a);
                    d.f187486b = C70850d.m103697c(C38221ad.f101300d);
                    diVar = d.mo62040a();
                    f101353j = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: h */
    public static C70338di m67540h() {
        C70338di diVar = f101354k;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101354k;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "NotifyStopListening");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38223af.f101305a);
                    d.f187486b = C70850d.m103697c(C38225ah.f101307a);
                    diVar = d.mo62040a();
                    f101354k = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: i */
    public static C70338di m67541i() {
        C70338di diVar = f101350g;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101350g;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "StartListeningForHotword");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38265x.f101374c);
                    d.f187486b = C70850d.m103697c(C38235ar.f101329c);
                    diVar = d.mo62040a();
                    f101350g = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: j */
    public static C70338di m67542j() {
        C70338di diVar = f101345b;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101345b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "StartListening");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38227aj.f101309e);
                    d.f187486b = C70850d.m103697c(C38237at.f101333c);
                    diVar = d.mo62040a();
                    f101345b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: k */
    public static C70338di m67543k() {
        C70338di diVar = f101351h;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101351h;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "StopListeningForHotword");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C37679hz.f100067c);
                    d.f187486b = C70850d.m103697c(C37666hm.f100042d);
                    diVar = d.mo62040a();
                    f101351h = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: l */
    public static C70338di m67544l() {
        C70338di diVar = f101352i;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101352i;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "StopListeningForSeamlessMode");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C37679hz.f100067c);
                    d.f187486b = C70850d.m103697c(C38219ab.f101295d);
                    diVar = d.mo62040a();
                    f101352i = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: m */
    public static C70338di m67545m() {
        C70338di diVar = f101346c;
        if (diVar == null) {
            synchronized (C38250i.class) {
                diVar = f101346c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.audio.service.AudioService", "StopListening");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C38233ap.f101324d);
                    d.f187486b = C70850d.m103697c(C37418bw.f99351d);
                    diVar = d.mo62040a();
                    f101346c = diVar;
                }
            }
        }
        return diVar;
    }
}
