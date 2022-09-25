package com.google.android.libraries.search.p3055n.p3058b.p3059a;

import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.Queue;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.n.b.a.a */
/* compiled from: PG */
public final class C39278a implements C46675m {

    /* renamed from: a */
    private final Queue f103465a = new C58781rt(new C58425eo(20));

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.TEXT);
        aVar.mo50684b(false);
        StringBuilder sb = new StringBuilder();
        synchronized (this.f103465a) {
            for (String append : this.f103465a) {
                sb.append(append);
            }
        }
        aVar.f121916a = C63088z.m96143E(sb.toString());
        return C60856cj.m92900i(aVar.mo50683a());
    }

    /* renamed from: b */
    public final void mo41755b(String str, String str2) {
        C60948g gVar = C60948g.f165068a;
        String instant = Instant.now().toString();
        Queue queue = this.f103465a;
        queue.add(instant + " " + str + ":\n" + str2 + "\n");
    }
}
