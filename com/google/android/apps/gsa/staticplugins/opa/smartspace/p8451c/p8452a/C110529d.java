package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.p8452a;

import androidx.work.C4634o;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C110529d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110531f f308141a;

    /* renamed from: b */
    public final /* synthetic */ int f308142b;

    public /* synthetic */ C110529d(C110531f fVar, int i) {
        this.f308141a = fVar;
        this.f308142b = i;
    }

    public final C60870cx apply(Object obj) {
        C110531f fVar = this.f308141a;
        int i = this.f308142b;
        if (((Boolean) obj).booleanValue()) {
            C46578l lVar = fVar.f308144a;
            C46582p j = C46586t.m83063j(C110528c.class);
            C46570d dVar = (C46570d) j;
            dVar.f121757f = C58833ax.m90834k(new C46574h("CALENDAR_REFRESH_TASK_STATUS_WORKER", C4634o.REPLACE));
            dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g((long) i, TimeUnit.MINUTES)));
            C60856cj.m92911t(lVar.mo50546b(j.mo50561a()), new C110530e(fVar), C60826bg.f164896a);
        }
        return C60866ct.f164955a;
    }
}
