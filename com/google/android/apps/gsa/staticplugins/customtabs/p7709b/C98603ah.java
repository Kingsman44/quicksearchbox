package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.net.Uri;
import com.google.android.apps.gsa.h.h.b;
import com.google.android.apps.gsa.h.h.c;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.ah */
/* compiled from: PG */
public final /* synthetic */ class C98603ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C98610ao f275390a;

    /* renamed from: b */
    public final /* synthetic */ Uri f275391b;

    /* renamed from: c */
    public final /* synthetic */ long f275392c;

    public /* synthetic */ C98603ah(C98610ao aoVar, Uri uri, long j) {
        this.f275390a = aoVar;
        this.f275391b = uri;
        this.f275392c = j;
    }

    public final void run() {
        C98610ao aoVar = this.f275390a;
        Uri uri = this.f275391b;
        long j = this.f275392c;
        C58976aa aaVar = C58975e.f156826a;
        C22871g gVar = aoVar.f275407f;
        long j2 = 0;
        if (!aoVar.mo91221d()) {
            long millis = TimeUnit.SECONDS.toMillis(aoVar.f275403b.mo79743a(C90110fh.f250582G));
            j2 = millis > 0 ? Math.max(0, millis - (aoVar.f275411j.mo26870b() - j)) : millis;
        }
        C60870cx c = aoVar.f275406e.mo28203c("Fetch related documents", j2, new C98600ae(aoVar, uri));
        b createBuilder = c.e.createBuilder();
        String uri2 = uri.toString();
        createBuilder.copyOnWrite();
        c cVar = createBuilder.instance;
        uri2.getClass();
        cVar.a |= 1;
        cVar.b = uri2;
        long j3 = aoVar.f275412k;
        createBuilder.copyOnWrite();
        c cVar2 = createBuilder.instance;
        cVar2.a |= 2;
        cVar2.c = j3;
        C60494rz rzVar = aoVar.f275410i;
        createBuilder.copyOnWrite();
        c cVar3 = createBuilder.instance;
        cVar3.d = rzVar.f163762v;
        cVar3.a |= 4;
        C60870cx e = aoVar.f275407f.mo28205e(gVar.mo28209i(C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(c), new C98601af(aoVar, j), C60826bg.f164896a), new C98602ag(aoVar, createBuilder.build()), C60826bg.f164896a), "Update bottom bar", new C98607al(aoVar)), "Bottom bar load failure", Throwable.class, new C98598ac(aoVar));
        aoVar.f275415n = new C98604ai(aoVar, e);
        if (aoVar.f275403b.mo79746e(C90110fh.f250651aw)) {
            aoVar.f275414m = new C98605aj(aoVar, e);
        }
    }
}
