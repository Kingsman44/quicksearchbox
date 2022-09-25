package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89631b;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95701g;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.y */
/* compiled from: PG */
public final class C95550y implements C89631b {

    /* renamed from: a */
    final /* synthetic */ C95551z f267402a;

    /* renamed from: b */
    private final Runnable f267403b;

    public C95550y(C95551z zVar, Runnable runnable) {
        this.f267402a = zVar;
        this.f267403b = runnable;
    }

    /* renamed from: a */
    public final void mo76701a() {
        C58976aa aaVar = C58975e.f156826a;
        mo89437d();
    }

    /* renamed from: b */
    public final void mo76702b() {
        C58976aa aaVar = C58975e.f156826a;
        mo89437d();
    }

    /* renamed from: c */
    public final void mo76703c() {
        C58976aa aaVar = C58975e.f156826a;
        C95551z zVar = this.f267402a;
        C95706l lVar = zVar.f267405c;
        lVar.f267948f.mo89592o(new C95701g(lVar, zVar.f267407e));
        C60237lk lkVar = this.f267402a.f267277k;
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= C89885b.NOW_VALUE;
        loVar.f162998q = true;
        int min = Math.min(this.f267402a.f267409g.size(), this.f267402a.f267410h + 1);
        if (min <= 0) {
            C89655j.m145957a("Bad end index " + min);
            this.f267402a.f267408f.mo89545i(Collections.emptyList());
            mo89437d();
            return;
        }
        C95551z zVar2 = this.f267402a;
        zVar2.f267408f.mo89545i(zVar2.f267409g.subList(0, min));
        mo89437d();
    }

    /* renamed from: d */
    public final void mo89437d() {
        this.f267402a.mo89407V();
        this.f267403b.run();
    }
}
