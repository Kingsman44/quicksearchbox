package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.common.util.concurrent.C60856cj;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.player.a.c */
/* compiled from: PG */
final class C140755c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140787e f382216a;

    /* renamed from: b */
    final /* synthetic */ C140770r f382217b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140755c(C140787e eVar, C140770r rVar) {
        super(1);
        this.f382216a = eVar;
        this.f382217b = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C140753a aVar = (C140753a) obj;
        C69664n.m101061g(aVar, "nextEpisode");
        C140641b bVar = aVar.f382213a;
        boolean z = true;
        if (bVar != null && C140976e.m228931d(bVar, this.f382216a.f382282c)) {
            return C140989k.m228944b(this.f382217b.f382247b.mo115816a(), C140754b.f382215a);
        }
        if (aVar.f382213a == null) {
            z = false;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }
}
