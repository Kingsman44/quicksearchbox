package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18710b;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18711c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18714f;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18848bu;
import com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18849bv;
import com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18850bw;
import com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18867cm;
import com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18868cn;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.android.libraries.assistant.pcp.p1579n.C19004c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C49051eq;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3980n.p3985c.C53019j;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.k */
/* compiled from: PG */
public final class C19015k implements C19004c {

    /* renamed from: a */
    public static final C58485gu f53389a = C58485gu.m89833C(new C19005a(C52567wn.MUSIC_GENRE, 2), new C19005a(C52567wn.NEWS, 1), new C19005a(C52567wn.MUSIC_GENRE, 1), new C19005a(C52567wn.PODCAST_EPISODE, 1), new C19005a(C52567wn.MUSIC_GENRE, 2), new C19005a(C52567wn.PODCAST_EPISODE, 1), new C19005a(C52567wn.MUSIC_GENRE, 3), new C19005a(C52567wn.PODCAST_EPISODE, 1), new C19005a(C52567wn.MUSIC_GENRE, 1), new C19005a(C52567wn.PODCAST_EPISODE, 2), new C19005a(C52567wn.MUSIC_GENRE, 1));

    /* renamed from: b */
    public final C69464a f53390b;

    /* renamed from: c */
    public final C58485gu f53391c;

    /* renamed from: d */
    public final Context f53392d;

    /* renamed from: e */
    private final C18868cn f53393e;

    /* renamed from: f */
    private final Executor f53394f;

    /* renamed from: g */
    private final C69464a f53395g;

    public C19015k(C18868cn cnVar, Executor executor, C69464a aVar, C69464a aVar2, C65599b bVar, Context context) {
        this.f53393e = cnVar;
        this.f53394f = executor;
        this.f53395g = aVar;
        this.f53390b = aVar2;
        this.f53391c = C58485gu.m89842j(bVar.f178301a);
        this.f53392d = context;
    }

    /* renamed from: d */
    public static Queue m36444d(Optional optional) {
        ArrayDeque arrayDeque = new ArrayDeque();
        if (optional.isEmpty()) {
            return arrayDeque;
        }
        for (C123728av avVar : ((C123730ax) optional.get()).f341769a) {
            arrayDeque.addAll(avVar.f341758d);
            String str = avVar.f341756b;
            String str2 = avVar.f341757c;
            avVar.f341758d.size();
        }
        return arrayDeque;
    }

    /* renamed from: e */
    public static void m36445e(C53019j jVar, int i, Queue queue) {
        for (int i2 = 0; i2 < Math.min(i, queue.size()); i2++) {
            C52560wg wgVar = (C52560wg) queue.poll();
            if (wgVar != null) {
                jVar.mo53956a(wgVar);
            }
        }
    }

    /* renamed from: a */
    public final C18579g mo24245a() {
        return C18579g.m36038b(C49051eq.POTTER_MEDIA);
    }

    /* renamed from: b */
    public final C18981k mo24246b() {
        return C18981k.POTTER_MEDIA;
    }

    /* renamed from: c */
    public final C60870cx mo24247c(C53306j jVar, C18718c cVar) {
        C60870cx cxVar;
        if (((Boolean) this.f53395g.mo17428b()).booleanValue()) {
            C60870cx p = C60856cj.m92907p(cVar.mo24114a(C18714f.f52791a), cVar.mo24114a(C18711c.f52782b), cVar.mo24114a(C18711c.f52783c));
            C19011g gVar = new C19011g(this, jVar);
            cxVar = C60922j.m93044g(p, C47810es.m84963c(gVar), this.f53394f);
        } else {
            C18868cn cnVar = this.f53393e;
            C60870cx a = cVar.mo24114a(C18710b.f52780b);
            C60870cx a2 = cVar.mo24114a(C18711c.f52782b);
            C60870cx a3 = cVar.mo24114a(C18717i.f52795a);
            C60870cx a4 = cVar.mo24114a(C18711c.f52781a);
            C18867cm cmVar = C18867cm.f53114a;
            C60870cx g = C60922j.m93044g(a, C47810es.m84963c(cmVar), cnVar.f53121g);
            C18848bu buVar = C18848bu.f53086a;
            C60870cx g2 = C60922j.m93044g(a2, C47810es.m84963c(buVar), cnVar.f53121g);
            C60870cx b = C47638k.m84751b(a3, a4).mo51521b(new C18849bv(cnVar, a3, a4, g, g2), cnVar.f53121g);
            C18850bw bwVar = C18850bw.f53092a;
            cxVar = C60922j.m93044g(b, C47810es.m84963c(bwVar), cnVar.f53121g);
        }
        C19012h hVar = new C19012h();
        return C60922j.m93044g(cxVar, C47810es.m84963c(hVar), this.f53394f);
    }
}
