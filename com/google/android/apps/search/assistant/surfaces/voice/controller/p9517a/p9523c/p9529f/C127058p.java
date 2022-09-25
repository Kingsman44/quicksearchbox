package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.p */
/* compiled from: PG */
public final class C127058p {

    /* renamed from: a */
    private static volatile C70338di f349878a;

    /* renamed from: b */
    private static volatile C70338di f349879b;

    /* renamed from: c */
    private static volatile C70338di f349880c;

    /* renamed from: d */
    private static volatile C70716eu f349881d;

    private C127058p() {
    }

    /* renamed from: a */
    public static C70338di m207805a() {
        C70338di diVar = f349880c;
        if (diVar == null) {
            synchronized (C127058p.class) {
                diVar = f349880c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.proto.ConversationControllerService", "ShowError");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C126988i.f349669h);
                    d.f187486b = C70850d.m103697c(C127066x.f349885a);
                    diVar = d.mo62040a();
                    f349880c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m207806b() {
        C70338di diVar = f349878a;
        if (diVar == null) {
            synchronized (C127058p.class) {
                diVar = f349878a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.proto.ConversationControllerService", "StartConversation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127046d.f349837e);
                    d.f187486b = C70850d.m103697c(C127048f.f349844c);
                    diVar = d.mo62040a();
                    f349878a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m207807c() {
        C70338di diVar = f349879b;
        if (diVar == null) {
            synchronized (C127058p.class) {
                diVar = f349879b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.proto.ConversationControllerService", "StopConversation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127051i.f349864d);
                    d.f187486b = C70850d.m103697c(C127053k.f349869e);
                    diVar = d.mo62040a();
                    f349879b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70716eu m207808d() {
        C70716eu euVar = f349881d;
        if (euVar == null) {
            synchronized (C127058p.class) {
                euVar = f349881d;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.proto.ConversationControllerService");
                    etVar.mo62433a(m207806b());
                    etVar.mo62433a(m207807c());
                    etVar.mo62433a(m207805a());
                    euVar = new C70716eu(etVar);
                    f349881d = euVar;
                }
            }
        }
        return euVar;
    }
}
