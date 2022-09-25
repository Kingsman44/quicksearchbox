package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.r */
/* compiled from: PG */
public final class C125169r {

    /* renamed from: a */
    private static volatile C70338di f345306a;

    /* renamed from: b */
    private static volatile C70338di f345307b;

    /* renamed from: c */
    private static volatile C70338di f345308c;

    /* renamed from: d */
    private static volatile C70338di f345309d;

    /* renamed from: e */
    private static volatile C70338di f345310e;

    /* renamed from: f */
    private static volatile C70338di f345311f;

    /* renamed from: g */
    private static volatile C70338di f345312g;

    /* renamed from: h */
    private static volatile C70716eu f345313h;

    private C125169r() {
    }

    /* renamed from: a */
    public static C70338di m205026a() {
        C70338di diVar = f345309d;
        if (diVar == null) {
            synchronized (C125169r.class) {
                diVar = f345309d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "GetAssistantFeedbackDebugData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C125070ay.f345047b);
                    diVar = d.mo62040a();
                    f345309d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m205027b() {
        C70338di diVar = f345311f;
        if (diVar == null) {
            synchronized (C125169r.class) {
                diVar = f345311f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "GetLearningCenterContentForConfiguration");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(af.w);
                    d.f187486b = C70850d.m103697c(C125075bc.f345065b);
                    diVar = d.mo62040a();
                    f345311f = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m205028c() {
        C70338di diVar = f345310e;
        if (diVar == null) {
            synchronized (C125169r.class) {
                diVar = f345310e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "GetLearningCenterContent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C125075bc.f345065b);
                    diVar = d.mo62040a();
                    f345310e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m205029d() {
        C70338di diVar = f345308c;
        if (diVar == null) {
            synchronized (C125169r.class) {
                diVar = f345308c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "HandleKeyboardEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125124cy.f345187a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f345308c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m205030e() {
        C70338di diVar = f345307b;
        if (diVar == null) {
            synchronized (C125169r.class) {
                diVar = f345307b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "KeyboardActiveSession");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125110ck.f345145d);
                    d.f187486b = C70850d.m103697c(C125171t.f345314c);
                    diVar = d.mo62040a();
                    f345307b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m205031f() {
        C70338di diVar = f345312g;
        if (diVar == null) {
            synchronized (C125169r.class) {
                diVar = f345312g;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "RequestLanguageDownload");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125114co.f345170b);
                    d.f187486b = C70850d.m103697c(C125116cq.f345173b);
                    diVar = d.mo62040a();
                    f345312g = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: g */
    public static C70338di m205032g() {
        C70338di diVar = f345306a;
        if (diVar == null) {
            synchronized (C125169r.class) {
                diVar = f345306a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "SetConnectionConfiguration");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125149dw.f345231c);
                    d.f187486b = C70850d.m103697c(C125151dy.f345235c);
                    diVar = d.mo62040a();
                    f345306a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: h */
    public static C70716eu m205033h() {
        C70716eu euVar = f345313h;
        if (euVar == null) {
            synchronized (C125169r.class) {
                euVar = f345313h;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService");
                    etVar.mo62433a(m205032g());
                    etVar.mo62433a(m205030e());
                    etVar.mo62433a(m205029d());
                    etVar.mo62433a(m205026a());
                    etVar.mo62433a(m205028c());
                    etVar.mo62433a(m205027b());
                    etVar.mo62433a(m205031f());
                    euVar = new C70716eu(etVar);
                    f345313h = euVar;
                }
            }
        }
        return euVar;
    }
}
