package com.google.android.libraries.lens.view.session.p2163a;

import android.os.Environment;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.view.p2070an.C25367ae;
import com.google.android.libraries.lens.view.p2070an.C25372aj;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4707j.C62573go;
import com.google.p4017at.p4056g.p4057a.p4058a.C54008bp;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.session.a.d */
/* compiled from: PG */
public final class C27736d implements C25367ae {

    /* renamed from: a */
    public static final C58974d f75721a = C58974d.m91135i("SnapshotterQueryHandler");

    /* renamed from: b */
    final String f75722b = String.format("%s/request.pb", new Object[]{Environment.getExternalStorageDirectory().getPath()});

    /* renamed from: c */
    private final Executor f75723c;

    /* renamed from: d */
    private final C60888db f75724d;

    public C27736d(Executor executor, C60888db dbVar) {
        this.f75723c = executor;
        this.f75724d = dbVar;
    }

    /* renamed from: c */
    public static boolean m51591c(C54008bp bpVar) {
        if (bpVar.f141710e.size() > 0 || !bpVar.f141712g.mo59173M() || bpVar.f141711f != null) {
            return true;
        }
        if (!bpVar.f141707b) {
            return false;
        }
        C62573go goVar = bpVar.f141719n;
        if (goVar == null) {
            goVar = C62573go.f168932d;
        }
        return (goVar.f168934a & 4) != 0 && bpVar.f141715j == null;
    }

    /* renamed from: a */
    public final C60870cx mo30414a(C24201ad adVar, C24209al alVar) {
        Executor executor = this.f75723c;
        String valueOf = String.valueOf(adVar.mo29680c());
        C25762k a = C25372aj.m46734a(alVar, executor, "SnapshotterQueryHandler[" + valueOf + "]");
        C60870cx b = this.f75724d.mo19399b(C47810es.m84978r(new C27733a(this)));
        C27735c cVar = new C27735c(a, adVar);
        C60856cj.m92911t(b, C47810es.m84974n(cVar), this.f75723c);
        return a.f70026b;
    }

    /* renamed from: b */
    public final boolean mo30415b() {
        return true;
    }
}
