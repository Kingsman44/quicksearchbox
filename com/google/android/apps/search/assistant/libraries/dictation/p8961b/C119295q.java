package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.q */
/* compiled from: PG */
public final class C119295q {

    /* renamed from: a */
    private static volatile C70338di f332648a;

    /* renamed from: b */
    private static volatile C70338di f332649b;

    /* renamed from: c */
    private static volatile C70338di f332650c;

    /* renamed from: d */
    private static volatile C70338di f332651d;

    /* renamed from: e */
    private static volatile C70338di f332652e;

    /* renamed from: f */
    private static volatile C70338di f332653f;

    /* renamed from: g */
    private static volatile C70338di f332654g;

    /* renamed from: h */
    private static volatile C70716eu f332655h;

    private C119295q() {
    }

    /* renamed from: a */
    public static C70338di m197985a() {
        C70338di diVar = f332648a;
        if (diVar == null) {
            synchronized (C119295q.class) {
                diVar = f332648a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", "CanStartDictation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119280b.f332629a);
                    d.f187486b = C70850d.m103697c(C119282d.f332631e);
                    diVar = d.mo62040a();
                    f332648a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m197986b() {
        C70338di diVar = f332652e;
        if (diVar == null) {
            synchronized (C119295q.class) {
                diVar = f332652e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", "ControlDictation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119286h.f332638c);
                    d.f187486b = C70850d.m103697c(C119288j.f332642c);
                    diVar = d.mo62040a();
                    f332652e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m197987c() {
        C70338di diVar = f332653f;
        if (diVar == null) {
            synchronized (C119295q.class) {
                diVar = f332653f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", "GetDictationUsageStats");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119303y.f332680b);
                    d.f187486b = C70850d.m103697c(C119265aa.f332604c);
                    diVar = d.mo62040a();
                    f332653f = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m197988d() {
        C70338di diVar = f332654g;
        if (diVar == null) {
            synchronized (C119295q.class) {
                diVar = f332654g;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", "GetLocalesForDataDownload");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119267ac.f332608a);
                    d.f187486b = C70850d.m103697c(C119269ae.f332610b);
                    diVar = d.mo62040a();
                    f332654g = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m197989e() {
        C70338di diVar = f332649b;
        if (diVar == null) {
            synchronized (C119295q.class) {
                diVar = f332649b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", "MonitorCanStartDictation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119280b.f332629a);
                    d.f187486b = C70850d.m103697c(C119282d.f332631e);
                    diVar = d.mo62040a();
                    f332649b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m197990f() {
        C70338di diVar = f332650c;
        if (diVar == null) {
            synchronized (C119295q.class) {
                diVar = f332650c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", "StartDictation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119271ag.f332613d);
                    d.f187486b = C70850d.m103697c(C119273ai.f332618b);
                    diVar = d.mo62040a();
                    f332650c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: g */
    public static C70338di m197991g() {
        C70338di diVar = f332651d;
        if (diVar == null) {
            synchronized (C119295q.class) {
                diVar = f332651d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", "StopDictation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119277am.f332624b);
                    d.f187486b = C70850d.m103697c(C119279ao.f332627a);
                    diVar = d.mo62040a();
                    f332651d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: h */
    public static C70716eu m197992h() {
        C70716eu euVar = f332655h;
        if (euVar == null) {
            synchronized (C119295q.class) {
                euVar = f332655h;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService");
                    etVar.mo62433a(m197985a());
                    etVar.mo62433a(m197989e());
                    etVar.mo62433a(m197990f());
                    etVar.mo62433a(m197991g());
                    etVar.mo62433a(m197986b());
                    etVar.mo62433a(m197987c());
                    etVar.mo62433a(m197988d());
                    euVar = new C70716eu(etVar);
                    f332655h = euVar;
                }
            }
        }
        return euVar;
    }
}
