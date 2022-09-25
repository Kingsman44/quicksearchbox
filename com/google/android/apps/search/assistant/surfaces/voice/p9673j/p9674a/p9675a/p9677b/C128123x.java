package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.x */
/* compiled from: PG */
public final class C128123x {

    /* renamed from: a */
    public static volatile C70716eu f352501a;

    /* renamed from: b */
    private static volatile C70338di f352502b;

    /* renamed from: c */
    private static volatile C70338di f352503c;

    /* renamed from: d */
    private static volatile C70338di f352504d;

    /* renamed from: e */
    private static volatile C70338di f352505e;

    /* renamed from: f */
    private static volatile C70338di f352506f;

    private C128123x() {
    }

    /* renamed from: a */
    public static C128120u m209235a(C70888j jVar) {
        return (C128120u) C70864c.m103731e(new C128118s(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C128122w m209236b(C70888j jVar) {
        return (C128122w) C70852a.m103707c(new C128117r(), jVar, C70851i.f189015a);
    }

    /* renamed from: c */
    public static C70338di m209237c() {
        C70338di diVar = f352505e;
        if (diVar == null) {
            synchronized (C128123x.class) {
                diVar = f352505e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.surfaces.voice.input.classic.service.proto.VoicePlateClassicService", "GetEscapeHatch");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128103d.f352473c);
                    d.f187486b = C70850d.m103697c(C128105f.f352477c);
                    diVar = d.mo62040a();
                    f352505e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m209238d() {
        C70338di diVar = f352504d;
        if (diVar == null) {
            synchronized (C128123x.class) {
                diVar = f352504d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.surfaces.voice.input.classic.service.proto.VoicePlateClassicService", "GetOnboardingExperience");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128107h.f352482a);
                    d.f187486b = C70850d.m103697c(C128109j.f352484c);
                    diVar = d.mo62040a();
                    f352504d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m209239e() {
        C70338di diVar = f352506f;
        if (diVar == null) {
            synchronized (C128123x.class) {
                diVar = f352506f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.surfaces.voice.input.classic.service.proto.VoicePlateClassicService", "ObserveConnectedClients");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128111l.f352488a);
                    d.f187486b = C70850d.m103697c(C128114o.f352491c);
                    diVar = d.mo62040a();
                    f352506f = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m209240f() {
        C70338di diVar = f352502b;
        if (diVar == null) {
            synchronized (C128123x.class) {
                diVar = f352502b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.surfaces.voice.input.classic.service.proto.VoicePlateClassicService", "ObserveVoicePlateState");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128082bd.f352414c);
                    d.f187486b = C70850d.m103697c(C128101bw.f352467e);
                    diVar = d.mo62040a();
                    f352502b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: g */
    public static C70338di m209241g() {
        C70338di diVar = f352503c;
        if (diVar == null) {
            synchronized (C128123x.class) {
                diVar = f352503c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.surfaces.voice.input.classic.service.proto.VoicePlateClassicService", "SendVoicePlateEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128071at.f352396c);
                    d.f187486b = C70850d.m103697c(C128077az.f352403a);
                    diVar = d.mo62040a();
                    f352503c = diVar;
                }
            }
        }
        return diVar;
    }
}
