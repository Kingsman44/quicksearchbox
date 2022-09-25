package com.google.android.libraries.notifications.p2268e.p2275d.p2276a;

import android.os.Bundle;
import com.google.android.libraries.notifications.C29992g;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.impl.C29805j;
import com.google.android.libraries.notifications.data.impl.C29806k;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2289f.C29987a;
import com.google.android.libraries.notifications.p2298k.C30042b;
import com.google.android.libraries.notifications.p2298k.C30043c;
import com.google.android.libraries.notifications.p2298k.C30044d;
import com.google.android.libraries.notifications.platform.p2307a.C30060d;
import com.google.android.libraries.p11027an.p11028a.C147767c;
import com.google.common.p4522b.C58485gu;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68801j;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68961y;

/* renamed from: com.google.android.libraries.notifications.e.d.a.a */
/* compiled from: PG */
public final class C29841a implements C30044d {

    /* renamed from: a */
    static final long f80902a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b */
    private final C29823n f80903b;

    /* renamed from: c */
    private final C30060d f80904c;

    /* renamed from: d */
    private final Set f80905d;

    /* renamed from: e */
    private final C29806k f80906e;

    /* renamed from: f */
    private final C29835a f80907f;

    public C29841a(C29823n nVar, C29806k kVar, C30060d dVar, C29835a aVar, Set set) {
        this.f80903b = nVar;
        this.f80906e = kVar;
        this.f80904c = dVar;
        this.f80907f = aVar;
        this.f80905d = set;
    }

    /* renamed from: h */
    private final void m55240h(C29820k kVar) {
        C29834a a = this.f80907f.mo35159a(C55489bz.PERIODIC_LOG);
        if (kVar != null) {
            a.mo35145j(kVar);
        }
        a.mo35136a();
    }

    /* renamed from: a */
    public final long mo35166a() {
        return f80902a;
    }

    /* renamed from: b */
    public final C29992g mo35167b(Bundle bundle) {
        List<C29820k> c = this.f80903b.mo35089c();
        if (!c.isEmpty()) {
            for (C29820k kVar : c) {
                m55240h(kVar);
                m55239g(kVar);
            }
        } else {
            m55240h((C29820k) null);
        }
        m55239g((C29820k) null);
        return C29992g.f81202a;
    }

    /* renamed from: c */
    public final /* synthetic */ C30042b mo35168c() {
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ C30043c mo35169d() {
        return C30043c.ANY;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "PERIODIC_TASK";
    }

    /* renamed from: f */
    public final boolean mo35171f() {
        return true;
    }

    /* renamed from: g */
    private final void m55239g(C29820k kVar) {
        String h = kVar == null ? null : kVar.mo35009h();
        long b = C68801j.f184873a.mo6453a().mo60487b();
        if (C68801j.f184873a.mo6453a().mo60488c() && b > 0) {
            C29806k kVar2 = this.f80906e;
            C147767c cVar = new C147767c();
            cVar.f398712a.append("thread_stored_timestamp");
            cVar.mo124446b("<= ?", Long.valueOf(kVar2.f80822b.mo26870b() - b));
            kVar2.f80821a.mo35110e(kVar, C58485gu.m89846n(cVar.mo124445a()));
            for (C29987a d : this.f80905d) {
                d.mo35293d();
            }
        }
        long a = C68801j.f184873a.mo6453a().mo60486a();
        if (a > 0) {
            C29806k kVar3 = this.f80906e;
            C147767c cVar2 = new C147767c();
            cVar2.f398712a.append("_id");
            cVar2.f398712a.append(" NOT IN (SELECT ");
            cVar2.f398712a.append("_id");
            cVar2.f398712a.append(" FROM ");
            cVar2.f398712a.append("threads");
            cVar2.f398712a.append(" ORDER BY ");
            cVar2.f398712a.append("last_notification_version");
            cVar2.f398712a.append(" DESC");
            cVar2.mo124446b(" LIMIT ?)", Long.valueOf(a));
            kVar3.f80821a.mo35110e(kVar, C58485gu.m89846n(cVar2.mo124445a()));
        }
        ((C29805j) this.f80904c.mo35400a(h)).mo35104a(C68961y.f185256a.mo6453a().mo60796a());
    }
}
