package com.google.android.gms.learning.dynamite.training;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.internal.training.C144810n;
import com.google.android.gms.learning.p10823d.C144586ab;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.libraries.micore.learning.base.C29711c;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
public class InAppTrainerImpl extends C144810n {

    /* renamed from: a */
    public static final C58485gu f391377a = C58485gu.m89848p("android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE");

    /* renamed from: b */
    public static final C58485gu f391378b = C58485gu.m89846n("android.permission.RECEIVE_BOOT_COMPLETED");

    /* renamed from: e */
    private static final C29719k f391379e = C29712d.m54802b("brella", "InAppTrainerImpl");

    /* renamed from: c */
    public Context f391380c;

    /* renamed from: d */
    public InAppTrainerOptions f391381d;

    /* renamed from: f */
    private Executor f391382f;

    /* renamed from: g */
    private String f391383g;

    /* renamed from: $r8$lambda$5HHqCQZXMi-PcfVT5zSZ_MIHgVo  reason: not valid java name */
    public static /* synthetic */ C60870cx m241176$r8$lambda$5HHqCQZXMiPcfVT5zSZ_MIHgVo(InAppTrainerImpl inAppTrainerImpl) {
        C29711c b;
        Context applicationContext = inAppTrainerImpl.f391380c.getApplicationContext();
        try {
            b = C29711c.m54796b(applicationContext);
            C144827n nVar = (C144827n) b.mo34852c(C144827n.class);
            C144573b bVar = (C144573b) b.mo34852c(C144573b.class);
            if (inAppTrainerImpl.mo120113a(nVar, bVar)) {
                C60870cx i = C60856cj.m92900i(new Status(1, 17, "InAppTraining API not enabled!", (PendingIntent) null, (ConnectionResult) null));
                if (b == null) {
                    return i;
                }
                b.close();
                return i;
            }
            nVar.mo120056h(200);
            C29711c b2 = bVar.mo120013au() ? C29711c.m54796b(applicationContext) : null;
            C144588ad adVar = (C144588ad) b.mo34852c(C144588ad.class);
            C60870cx g = C60846c.m92878g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(adVar.mo120069j(inAppTrainerImpl.f391383g)), new C144665ah(inAppTrainerImpl, adVar), C60826bg.f164896a), IOException.class, new C144727w(inAppTrainerImpl, adVar), C60826bg.f164896a), RuntimeException.class, new C144728x(inAppTrainerImpl, adVar, bVar, applicationContext), C60826bg.f164896a);
            ((C60838bs) g).mo4106b(new C144729y(b2), inAppTrainerImpl.f391382f);
            if (b != null) {
                b.close();
            }
            return g;
        } catch (Throwable th) {
            C144005e.m234184a(applicationContext, th);
            throw th;
        }
        throw th;
    }

    /* renamed from: $r8$lambda$U2P-TYx74xA0uwh_ZgdyuLN6f5c  reason: not valid java name */
    public static /* synthetic */ C60870cx m241177$r8$lambda$U2PTYx74xA0uwh_ZgdyuLN6f5c(InAppTrainerImpl inAppTrainerImpl) {
        C29711c b;
        C60870cx i;
        Context applicationContext = inAppTrainerImpl.f391380c.getApplicationContext();
        try {
            b = C29711c.m54796b(applicationContext);
            C144827n nVar = (C144827n) b.mo34852c(C144827n.class);
            C144573b bVar = (C144573b) b.mo34852c(C144573b.class);
            if (inAppTrainerImpl.mo120113a(nVar, bVar)) {
                i = C60856cj.m92900i(new Status(1, 17, "InAppTraining API not enabled!", (PendingIntent) null, (ConnectionResult) null));
                if (b == null) {
                    return i;
                }
            } else if (m235155b(nVar, bVar, inAppTrainerImpl.f391381d)) {
                i = C60856cj.m92900i(new Status(1, 17, "InApp Personalization is not enabled.", (PendingIntent) null, (ConnectionResult) null));
                if (b == null) {
                    return i;
                }
            } else {
                nVar.mo120056h(201);
                C29711c b2 = bVar.mo120013au() ? C29711c.m54796b(applicationContext) : null;
                C144588ad adVar = (C144588ad) b.mo34852c(C144588ad.class);
                C60870cx g = C60846c.m92878g(C60846c.m92878g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(adVar.mo120068i(inAppTrainerImpl.f391381d)), new C144660ac(inAppTrainerImpl, adVar), C60826bg.f164896a), C144586ab.class, new C144661ad(inAppTrainerImpl, adVar), C60826bg.f164896a), IOException.class, new C144662ae(inAppTrainerImpl, adVar), C60826bg.f164896a), RuntimeException.class, new C144663af(inAppTrainerImpl, adVar, bVar, applicationContext), C60826bg.f164896a);
                ((C60838bs) g).mo4106b(new C144664ag(b2), inAppTrainerImpl.f391382f);
                if (b != null) {
                    b.close();
                }
                return g;
            }
            b.close();
            return i;
        } catch (Throwable th) {
            C144005e.m234184a(applicationContext, th);
            throw th;
        }
        throw th;
    }

    /* renamed from: b */
    public static boolean m235155b(C144827n nVar, C144573b bVar, InAppTrainerOptions inAppTrainerOptions) {
        if (inAppTrainerOptions.f391075g == null || bVar.mo120005am()) {
            return false;
        }
        nVar.mo120056h(1151);
        return true;
    }

    /* renamed from: a */
    public final boolean mo120113a(C144827n nVar, C144573b bVar) {
        if (bVar.mo119969aC(this.f391380c.getApplicationContext().getPackageName())) {
            return false;
        }
        nVar.mo120056h(1169);
        return true;
    }

    public boolean initV26(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        return initW24(jVar, jVar2, inAppTrainerOptions, buVar);
    }

    public boolean initW24(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        return initY2020W18(jVar, jVar2, inAppTrainerOptions, buVar);
    }

    public boolean initY2020W18(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        return initY2020W30(jVar, jVar2, inAppTrainerOptions, buVar);
    }

    public boolean initY2020W30(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        return initY2020W36(jVar, jVar2, inAppTrainerOptions, buVar);
    }

    public boolean initY2020W36(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        return initY2021W30(jVar, jVar2, inAppTrainerOptions, buVar);
    }

    public boolean initY2021W30(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        return initY2022W24(jVar, jVar2, inAppTrainerOptions, buVar);
    }

    public boolean initY2022W24(C144165j jVar, C144165j jVar2, InAppTrainerOptions inAppTrainerOptions, C143773bu buVar) {
        this.f391380c = (Context) C144166k.m234388a(jVar);
        try {
            if (C58837ba.m90859h(inAppTrainerOptions.f391070a)) {
                C144696bl.m235202a(buVar, new Status(1, 10, "Invalid session name", (PendingIntent) null, (ConnectionResult) null), f391379e);
            } else if (inAppTrainerOptions.f391071b == 0) {
                C144696bl.m235202a(buVar, new Status(1, 10, "Invalid job ID", (PendingIntent) null, (ConnectionResult) null), f391379e);
            } else if (inAppTrainerOptions.f391075g != null || !C58837ba.m90859h(inAppTrainerOptions.f391073d)) {
                if (inAppTrainerOptions.f391075g != null) {
                    if (!C58837ba.m90859h(inAppTrainerOptions.f391073d)) {
                        C144696bl.m235202a(buVar, new Status(1, 10, "Cannot set options for both federation and local computation", (PendingIntent) null, (ConnectionResult) null), f391379e);
                    } else if (inAppTrainerOptions.f391081m == null) {
                        C144696bl.m235202a(buVar, new Status(1, 10, "Missing input directory", (PendingIntent) null, (ConnectionResult) null), f391379e);
                    } else if (inAppTrainerOptions.f391078j == null) {
                        C144696bl.m235202a(buVar, new Status(1, 10, "Missing output directory", (PendingIntent) null, (ConnectionResult) null), f391379e);
                    } else if (inAppTrainerOptions.f391079k == null) {
                        C144696bl.m235202a(buVar, new Status(1, 10, "Missing training interval", (PendingIntent) null, (ConnectionResult) null), f391379e);
                    }
                }
                this.f391382f = (Executor) C144166k.m234388a(jVar2);
                this.f391381d = inAppTrainerOptions;
                this.f391383g = inAppTrainerOptions.f391070a;
                C144696bl.m235203b(new C144659ab(this), buVar, this.f391382f, f391379e, this.f391380c);
                return true;
            } else {
                C144696bl.m235202a(buVar, new Status(1, 10, "Missing population name or plan URI", (PendingIntent) null, (ConnectionResult) null), f391379e);
            }
            return true;
        } catch (Error | RuntimeException e) {
            C144005e.m234184a(this.f391380c, e);
            throw e;
        }
    }

    public void start(int i, C143773bu buVar) {
        C144696bl.m235203b(new C144730z(this), buVar, this.f391382f, f391379e, this.f391380c);
    }

    public void stop(C143773bu buVar) {
        C144696bl.m235203b(new C144658aa(this), buVar, this.f391382f, f391379e, this.f391380c);
    }
}
