package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a;

import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.n.c.a.a.c */
/* compiled from: PG */
public final class C39383c implements C46675m {

    /* renamed from: a */
    public final List f103696a = new ArrayList();

    /* renamed from: b */
    private final Executor f103697b;

    /* renamed from: c */
    private final C47632e f103698c;

    public C39383c(Executor executor) {
        this.f103697b = executor;
        this.f103698c = new C47632e();
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C60856cj.m92900i(f121943k);
        }
        if (oVar.mo50706f()) {
            return C60856cj.m92900i(mo41794b());
        }
        C39381a aVar = new C39381a(this);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f103697b);
    }

    /* renamed from: b */
    public final C46669g mo41794b() {
        C46663a aVar = new C46663a();
        aVar.mo50684b(false);
        aVar.mo50686d(C46667e.TEXT);
        StringBuilder sb = new StringBuilder("HDM Dump\n");
        for (C39384d u : this.f103696a) {
            sb.append(u.mo41796u());
        }
        aVar.f121916a = C63088z.m96143E(sb.toString());
        return aVar.mo50683a();
    }

    /* renamed from: c */
    public final void mo41795c(C39384d dVar) {
        this.f103698c.mo51511a(new C39382b(this, dVar), this.f103697b);
    }
}
