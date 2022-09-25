package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78521ad;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78536as;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78805g;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78806h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80716cr;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83344ae;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.dc */
/* compiled from: PG */
public final /* synthetic */ class C78434dc implements C83344ae {

    /* renamed from: a */
    public final /* synthetic */ C78438dg f215954a;

    /* renamed from: b */
    public final /* synthetic */ C81515c f215955b;

    public /* synthetic */ C78434dc(C78438dg dgVar, C81515c cVar) {
        this.f215954a = dgVar;
        this.f215955b = cVar;
    }

    /* renamed from: a */
    public final Object mo73140a(Object obj, Object obj2, Object obj3, Object obj4) {
        C78806h hVar;
        C78438dg dgVar = this.f215954a;
        C81515c cVar = this.f215955b;
        C78245d dVar = (C78245d) obj2;
        Locale locale = (Locale) obj3;
        C78815q qVar = (C78815q) obj4;
        if (((C78224b) obj).mo73148k(C89160q.DEMAND_STATE)) {
            return C78540aw.f216294a;
        }
        C78356af c = C78356af.m125854c(dgVar.mo73372a().mo73348f());
        if (dVar.mo73188k()) {
            C78536as b = C78537at.m126170b();
            ((C78521ad) b).f216265a = 4;
            c.f215720c = Optional.m71637of(b.mo73446a());
            return c.mo73311a();
        }
        C78393bp b2 = dgVar.mo73372a().mo73344b();
        C78392bo a = b2.mo73354a();
        if (qVar.f216929a == 5) {
            hVar = (C78806h) qVar.f216930b;
        } else {
            hVar = C78806h.f216899c;
        }
        int a2 = C78805g.m126593a(hVar.f216902b);
        if (a2 != 0 && a2 == 8) {
            a.mo73352d(cVar.mo75121a(locale).getString(R.string.nga_static_text, new Object[0]));
            if (b2.mo73360h()) {
                if (b2.mo73356c().isPresent()) {
                    C80716cr b3 = ((C80722cx) b2.mo73356c().get()).mo74491b();
                    b3.mo74478b(cVar.mo75121a(locale).getString(R.string.nga_static_text, new Object[0]));
                    a.mo73350b(b3.mo74477a());
                } else {
                    C78536as b4 = C78537at.m126170b();
                    ((C78521ad) b4).f216265a = 13;
                    a.mo73353e(b4.mo73446a());
                }
            }
        }
        c.mo73313d(a.mo73349a());
        return c.mo73311a();
    }
}
