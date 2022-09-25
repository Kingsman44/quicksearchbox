package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.C4381ae;
import androidx.work.C4410f;
import androidx.work.C4412h;
import androidx.work.C4631l;
import androidx.work.C4634o;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.d */
/* compiled from: PG */
public class C134060d {

    /* renamed from: a */
    public static final C59071e f365161a = C59071e.m91331h();

    /* renamed from: b */
    public final String f365162b;

    /* renamed from: c */
    public final C46586t f365163c;

    /* renamed from: d */
    private final Instant f365164d;

    /* renamed from: e */
    private final Duration f365165e;

    /* renamed from: f */
    private final C4381ae f365166f;

    /* renamed from: g */
    private final boolean f365167g;

    /* renamed from: h */
    private final C134064h f365168h;

    /* renamed from: i */
    private final C4634o f365169i;

    /* renamed from: j */
    private final C4412h f365170j;

    /* renamed from: k */
    private final C134065i f365171k;

    public C134060d(Instant instant, Duration duration, C4381ae aeVar, boolean z, String str, C134064h hVar, C4634o oVar) {
        C46586t tVar;
        this.f365164d = instant;
        this.f365165e = duration;
        this.f365166f = aeVar;
        this.f365167g = z;
        this.f365162b = str;
        this.f365168h = hVar;
        this.f365169i = oVar;
        C4410f fVar = new C4410f();
        fVar.mo9351c(aeVar);
        C4412h a = fVar.mo9349a();
        this.f365170j = a;
        C134062f fVar2 = (C134062f) C134065i.f365197e.createBuilder();
        C69664n.m101060f(fVar2, "newBuilder()");
        C69664n.m101061g(fVar2, "builder");
        C69664n.m101061g(hVar, "value");
        fVar2.copyOnWrite();
        C134065i iVar = (C134065i) fVar2.instance;
        iVar.f365200b = hVar.f365196f;
        iVar.f365199a |= 1;
        C63042fg b = C62949a.m95467b(instant);
        C69664n.m101061g(b, "value");
        fVar2.copyOnWrite();
        C134065i iVar2 = (C134065i) fVar2.instance;
        b.getClass();
        iVar2.f365201c = b;
        iVar2.f365199a |= 2;
        C62910ar a2 = C62949a.m95466a(duration);
        C69664n.m101061g(a2, "value");
        fVar2.copyOnWrite();
        C134065i iVar3 = (C134065i) fVar2.instance;
        a2.getClass();
        iVar3.f365202d = a2;
        iVar3.f365199a |= 4;
        C62942bv build = fVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        C134065i iVar4 = (C134065i) build;
        this.f365171k = iVar4;
        C46582p j = C46586t.m83063j(C134053bs.class);
        C46570d dVar = (C46570d) j;
        dVar.f121753b = a;
        dVar.f121757f = C58833ax.m90834k(new C46574h(str, oVar));
        HashMap hashMap = new HashMap();
        C4631l.m13032c("params", iVar4.toByteArray(), hashMap);
        dVar.f121755d = C4631l.m13030a(hashMap);
        C46573g gVar = new C46573g(duration.getSeconds(), TimeUnit.SECONDS);
        dVar.f121754c = gVar;
        if (z) {
            dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(gVar));
            tVar = j.mo50561a();
        } else {
            tVar = j.mo50561a();
        }
        C69664n.m101060f(tVar, "builder(FeedSyncWorker::…build()\n        }\n      }");
        this.f365163c = tVar;
    }
}
