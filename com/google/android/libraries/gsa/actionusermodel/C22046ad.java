package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ad */
/* compiled from: PG */
public final class C22046ad {

    /* renamed from: a */
    public static volatile C70716eu f60768a;

    /* renamed from: b */
    private static volatile C70338di f60769b;

    /* renamed from: c */
    private static volatile C70338di f60770c;

    /* renamed from: d */
    private static volatile C70338di f60771d;

    /* renamed from: e */
    private static volatile C70338di f60772e;

    /* renamed from: f */
    private static volatile C70338di f60773f;

    private C22046ad() {
    }

    /* renamed from: a */
    public static C70338di m41293a() {
        C70338di diVar = f60773f;
        if (diVar == null) {
            synchronized (C22046ad.class) {
                diVar = f60773f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.action_user_model.gsa.Aum", "LogAction");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C22065aw.f60793g);
                    d.f187486b = C70850d.m103697c(C22067ay.f60801d);
                    diVar = d.mo62040a();
                    f60773f = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m41294b() {
        C70338di diVar = f60769b;
        if (diVar == null) {
            synchronized (C22046ad.class) {
                diVar = f60769b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.action_user_model.gsa.Aum", "ResolveContact");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C22073bc.f60820k);
                    d.f187486b = C70850d.m103697c(C22104g.f60920i);
                    diVar = d.mo62040a();
                    f60769b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m41295c() {
        C70338di diVar = f60771d;
        if (diVar == null) {
            synchronized (C22046ad.class) {
                diVar = f60771d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.action_user_model.gsa.Aum", "ResolveInstanceLabel");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C22075be.f60833n);
                    d.f187486b = C70850d.m103697c(C22104g.f60920i);
                    diVar = d.mo62040a();
                    f60771d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m41296d() {
        C70338di diVar = f60772e;
        if (diVar == null) {
            synchronized (C22046ad.class) {
                diVar = f60772e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.action_user_model.gsa.Aum", "ResolveInstance");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C22077bg.f60849o);
                    d.f187486b = C70850d.m103697c(C22104g.f60920i);
                    diVar = d.mo62040a();
                    f60772e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m41297e() {
        C70338di diVar = f60770c;
        if (diVar == null) {
            synchronized (C22046ad.class) {
                diVar = f60770c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.action_user_model.gsa.Aum", "ResolveProvider");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C22079bi.f60866l);
                    d.f187486b = C70850d.m103697c(C22104g.f60920i);
                    diVar = d.mo62040a();
                    f60770c = diVar;
                }
            }
        }
        return diVar;
    }
}
