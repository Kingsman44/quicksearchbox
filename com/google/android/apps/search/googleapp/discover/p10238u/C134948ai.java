package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ai */
/* compiled from: PG */
public final class C134948ai implements C61485f {

    /* renamed from: a */
    public static final C70297cz f367414a = new C70290cs("X-Client-Data", C70334de.f187481c);

    /* renamed from: b */
    public static final C70297cz f367415b = new C70290cs("User-Agent", C70334de.f187481c);

    /* renamed from: c */
    public static final C70297cz f367416c = new C70290cs("Cookie", C70334de.f187481c);

    /* renamed from: d */
    public static final C70297cz f367417d = new C70290cs("Accept-Language", C70334de.f187481c);

    /* renamed from: e */
    public static final C70297cz f367418e = new C70290cs("X-Geo", C70334de.f187481c);

    /* renamed from: f */
    private static final C59071e f367419f = C59071e.m91331h();

    /* renamed from: g */
    private static final C70297cz f367420g = new C70290cs("Set-Cookie", C70334de.f187481c);

    /* renamed from: h */
    private final C32221c f367421h;

    /* renamed from: i */
    private final C135101fu f367422i;

    /* renamed from: j */
    private C47633f f367423j;

    public C134948ai(C32221c cVar, C135101fu fuVar) {
        C69664n.m101061g(cVar, "zwiebackCookieProvider");
        C69664n.m101061g(fuVar, "requestProperties");
        this.f367421h = cVar;
        this.f367422i = fuVar;
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        try {
            C47633f fVar = this.f367423j;
            if (fVar != null) {
                Object r = C60856cj.m92909r(fVar);
                C69664n.m101060f(r, "getDone(requireNotNull(requestPropertiesFuture))");
                C134954ao aoVar = (C134954ao) r;
                C70334de deVar = bVar.f166235a;
                deVar.mo62033h(f367414a, aoVar.f367436e);
                deVar.mo62033h(C134953an.f367431a, aoVar.f367439h.toByteArray());
                deVar.mo62033h(f367415b, aoVar.f367435d);
                aoVar.f367437f.ifPresent(new C134945af(deVar));
                aoVar.f367433b.ifPresent(new C134946ag(deVar));
                aoVar.f367438g.ifPresent(new C134947ah(deVar));
                return C61479al.f166225a;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) f367419f.mo56225c()).mo56382g(e);
            cVar.mo56379ah(new C59094n(40388));
            cVar.mo56386p("Error adding request properties to GRPC");
            return C61479al.m94189b(Status.m102100d(e), new C70334de());
        }
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C135101fu fuVar = this.f367422i;
        C47633f g = C47633f.m84733g(C71663i.m104688a(C71803m.m105042c(fuVar.f367960a, (C69585o) null, (C71424ay) null, new C135092fl(fuVar, (C69577g) null), 3)));
        C69664n.m101060f(g, "fun getRequestProperties…tenableFuture()\n    )\n  }");
        this.f367423j = g;
        return C61479al.m94190c(g);
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final C61480am mo39486d(C61483d dVar) {
        Iterable a = dVar.f166239a.mo62026a(f367420g);
        if (a != null) {
            C69664n.m101060f(this.f367421h.mo38008h(a), "zwiebackCookieProvider.u…ackFromSetCookie(headers)");
        }
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
