package com.google.android.apps.gsa.staticplugins.chime.p7661f;

import androidx.work.C4634o;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.staticplugins.chime.p7661f.p7662a.p7663a.C97702a;
import com.google.android.apps.gsa.staticplugins.chime.p7661f.p7662a.p7663a.C97704c;
import com.google.android.apps.gsa.staticplugins.chime.p7661f.p7662a.p7663a.C97705d;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58844bh;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.f.e */
/* compiled from: PG */
public final class C97715e implements C86091a {

    /* renamed from: a */
    private final C97705d f272836a;

    /* renamed from: b */
    private final C86124t f272837b;

    public C97715e(C86124t tVar, C97705d dVar) {
        this.f272837b = tVar;
        this.f272836a = dVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (this.f272837b.mo79746e(C89985ax.f246736s)) {
            C97705d dVar = this.f272836a;
            long a = dVar.f272820b.mo79743a(C89985ax.f246668V);
            C46582p j = C46586t.m83063j(C97705d.class);
            C46570d dVar2 = (C46570d) j;
            dVar2.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g((long) ((int) a), TimeUnit.HOURS)));
            dVar2.f121757f = C58833ax.m90834k(new C46574h("PeriodChimeRgstTask", C4634o.KEEP));
            C60856cj.m92911t(C59417y.m92319e(new C97702a(dVar, j.mo50561a()), new C59401i(C59407o.m92308d(Duration.ofMillis(1000)), 2.0d, 5), C58844bh.ALWAYS_TRUE, dVar.f272821c), C47810es.m84974n(new C97704c(dVar)), C60826bg.f164896a);
        }
    }
}
