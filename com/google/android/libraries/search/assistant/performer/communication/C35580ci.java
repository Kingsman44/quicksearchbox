package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ci */
/* compiled from: PG */
public final class C35580ci {

    /* renamed from: a */
    public static volatile C70716eu f93403a;

    /* renamed from: b */
    private static volatile C70338di f93404b;

    private C35580ci() {
    }

    /* renamed from: a */
    public static C70338di m63961a() {
        C70338di diVar = f93404b;
        if (diVar == null) {
            synchronized (C35580ci.class) {
                diVar = f93404b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.performer.communication.IncomingCallExecutionService", "Perform");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C51809dy.f135933f);
                    d.f187486b = C70850d.m103697c(C52070ec.f136651d);
                    diVar = d.mo62040a();
                    f93404b = diVar;
                }
            }
        }
        return diVar;
    }
}
