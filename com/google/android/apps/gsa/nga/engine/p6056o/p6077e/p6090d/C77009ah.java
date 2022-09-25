package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.s.o;
import com.google.android.apps.gsa.nga.engine.am.s.p;
import com.google.android.apps.gsa.nga.engine.am.s.q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ah */
/* compiled from: PG */
public final class C77009ah {

    /* renamed from: a */
    private final C22871g f212554a;

    /* renamed from: b */
    private final C77089dg f212555b;

    /* renamed from: c */
    private final q f212556c;

    public C77009ah(C22871g gVar, C77089dg dgVar, q qVar) {
        this.f212554a = gVar;
        this.f212555b = dgVar;
        this.f212556c = qVar;
    }

    /* renamed from: a */
    public final C60870cx mo72382a(C77140u uVar) {
        if (uVar.mo72410f().isPresent()) {
            q qVar = this.f212556c;
            C58485gu<StatusBarNotification> i = uVar.mo72413i();
            C58485gu a = ((df) uVar.mo72410f().get()).a();
            C58485gu<af> a2 = this.f212555b.mo72415a(false);
            C58480gp e = C58485gu.m89837e();
            for (StatusBarNotification statusBarNotification : i) {
                for (af afVar : a2) {
                    Optional o = afVar.o(statusBarNotification);
                    if (!o.isEmpty()) {
                        C22871g gVar = qVar.c;
                        e.mo55395g(gVar.mo28209i(q.a(gVar, afVar, a, (String) o.get()), "[NGA] NotificationsHelper.getNotificationsForContactIds.makePair", new o(statusBarNotification)));
                    }
                }
            }
            return this.f212554a.mo28209i(qVar.c.mo28209i(C60856cj.m92896e(e.mo55394f()), "[NGA] NotificationsHelper.getNotificationsForContactIds.mergePairs", p.a), "[NGA] get single notification if possible", new C77004ac(uVar));
        }
        C58485gu i2 = uVar.mo72413i();
        if (i2.isEmpty()) {
            uVar.mo72409e().ifPresent(new C77005ad(uVar));
            return C60856cj.m92900i(Optional.empty());
        } else if (i2.size() == 1) {
            return C60856cj.m92900i(Optional.m71637of(C77126g.m123804a((StatusBarNotification) i2.get(0))));
        } else {
            uVar.mo72409e().ifPresent(new C77006ae(uVar));
            return C60856cj.m92900i(Optional.m71637of(C77028b.f212611a));
        }
    }
}
