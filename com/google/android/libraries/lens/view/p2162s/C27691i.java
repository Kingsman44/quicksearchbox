package com.google.android.libraries.lens.view.p2162s;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.lens.view.s.i */
/* compiled from: PG */
public final class C27691i {

    /* renamed from: a */
    public final C19576m f75613a;

    /* renamed from: b */
    public final C58881cr f75614b = C58886cw.m90973a(new C27686d(this));

    /* renamed from: c */
    public final C58881cr f75615c;

    /* renamed from: d */
    private final C19575l f75616d;

    /* renamed from: e */
    private final C58881cr f75617e = C58886cw.m90973a(new C27685c(this));

    public C27691i(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C27687e(this));
        this.f75615c = C58886cw.m90973a(new C27688f(this));
        C58886cw.m90973a(new C27689g(this));
        C58886cw.m90973a(new C27690h(this));
        C19576m e = C19576m.m37335e("lens_android");
        this.f75613a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f75616d = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f75616d = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }

    /* renamed from: a */
    public final void mo33177a(String str, String str2) {
        ((C19567d) this.f75617e.mo6453a()).mo24822a(1, str, str2);
    }
}
