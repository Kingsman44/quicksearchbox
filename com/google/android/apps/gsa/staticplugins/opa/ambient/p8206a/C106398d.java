package com.google.android.apps.gsa.staticplugins.opa.ambient.p8206a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6513aj.C84522ag;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106582i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.a.d */
/* compiled from: PG */
public final class C106398d implements C84522ag {

    /* renamed from: a */
    public static final C59071e f296755a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.a.d");

    /* renamed from: b */
    private final Context f296756b;

    /* renamed from: c */
    private final C106396b f296757c;

    /* renamed from: d */
    private final C106582i f296758d;

    /* renamed from: e */
    private final C86124t f296759e;

    public C106398d(Context context, C106396b bVar, C106582i iVar, C86124t tVar) {
        this.f296756b = context;
        this.f296757c = bVar;
        this.f296758d = iVar;
        this.f296759e = tVar;
    }

    /* renamed from: a */
    public final void mo78234a(C86117m mVar) {
        if (!this.f296759e.mo79746e(C90017bw.f247897aL)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C58800sl lA = this.f296757c.mo21395a().iterator();
        while (lA.hasNext()) {
            if (mVar.mo79735a(((Integer) lA.next()).intValue())) {
                C60870cx a = this.f296758d.mo95582a();
                C106397c cVar = new C106397c(this);
                C60856cj.m92911t(a, C47810es.m84974n(cVar), C60826bg.f164896a);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo95500b() {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH");
        intent.setPackage(this.f296756b.getPackageName());
        this.f296756b.sendBroadcast(intent);
        C58976aa aaVar = C58975e.f156826a;
    }
}
