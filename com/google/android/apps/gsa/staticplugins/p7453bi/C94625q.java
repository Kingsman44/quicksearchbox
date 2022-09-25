package com.google.android.apps.gsa.staticplugins.p7453bi;

import android.os.Bundle;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89046bq;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7066m.C90008bn;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1833c.p1834a.C22254f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.io.File;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.q */
/* compiled from: PG */
public final class C94625q extends C22254f implements C87682aj {

    /* renamed from: a */
    public static final /* synthetic */ int f264635a = 0;

    /* renamed from: e */
    private static final C59071e f264636e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bi.q");

    /* renamed from: f */
    private static final ClientConfig f264637f;

    /* renamed from: g */
    private final C22871g f264638g;

    /* renamed from: h */
    private final C22871g f264639h;

    /* renamed from: i */
    private final C86124t f264640i;

    /* renamed from: j */
    private final C87673aa f264641j;

    /* renamed from: k */
    private final AtomicInteger f264642k = new AtomicInteger(0);

    /* renamed from: l */
    private final ConcurrentHashMap f264643l = new ConcurrentHashMap();

    /* renamed from: m */
    private C60870cx f264644m;

    /* renamed from: n */
    private int f264645n;

    static {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.HTTP;
        gVar.f239204f = "legacy_http_engine";
        f264637f = new ClientConfig(gVar);
    }

    public C94625q(C58881cr crVar, C68214a aVar, C89052h hVar, C22871g gVar, C22871g gVar2, C86124t tVar, C87677ae aeVar) {
        super(C58833ax.m90834k(crVar), aVar, hVar);
        this.f264638g = gVar;
        this.f264639h = gVar2;
        this.f264640i = tVar;
        this.f264641j = aeVar.mo81958a(this, (C90757ba) null, f264637f);
    }

    /* renamed from: s */
    private final C60870cx m156035s(C87739bu buVar, Object obj, C58817ah ahVar) {
        SettableFuture settableFuture = new SettableFuture();
        int andIncrement = this.f264642k.getAndIncrement();
        C88489j jVar = new C88489j(buVar);
        jVar.mo82015c(new DummyParcelable(new C94611c(andIncrement, obj, C58833ax.m90834k(settableFuture))));
        ClientEventData a = jVar.mo82013a();
        C60870cx h = C60922j.m93045h(settableFuture, C94617i.f264624a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        C60870cx e = C90877ak.m148471e(h, this.f264640i.mo79743a(C90008bn.f246897k), TimeUnit.MILLISECONDS, this.f264639h);
        this.f264639h.mo28211k(settableFuture, "onResponseFutureDone", new C94624p(this, andIncrement));
        this.f264643l.put(Integer.valueOf(andIncrement), settableFuture);
        if (C22872h.m42744d(C0826b.class)) {
            mo88548n(a);
        } else {
            this.f264638g.mo28212l("connectToSearchServiceAndSendClientEvent", new C94618j(this, a));
        }
        return C60846c.m92878g(e, TimeoutException.class, ahVar, C60826bg.f164896a);
    }

    /* renamed from: W */
    public final String mo27493W() {
        return "ProcessHttpEngine";
    }

    /* renamed from: e */
    public final C60870cx mo27494e(String str, int i, int i2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /* renamed from: f */
    public final C60870cx mo27495f(C89020ar arVar, C89068x xVar, C89061q qVar) {
        C58976aa aaVar = C58975e.f156826a;
        URL url = arVar.f241257f;
        return m156035s(C87739bu.HTTP_EXECUTE_REQUEST, new C94599b(arVar, xVar, qVar), C94616h.f264623a);
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.HTTP_SESSION_SERVICE_EVENT) {
            C94614f fVar = (C94614f) ((DummyParcelable) serviceEventData.mo81912b(DummyParcelable.class)).f253766a;
            SettableFuture settableFuture = (SettableFuture) this.f264643l.get(Integer.valueOf(fVar.mo88542a()));
            if (settableFuture != null) {
                settableFuture.mo57356n(fVar.mo88544c());
            }
        }
    }

    /* renamed from: g */
    public final C60870cx mo27496g(C89020ar arVar, C89068x xVar, C89061q qVar) {
        C58976aa aaVar = C58975e.f156826a;
        URL url = arVar.f241257f;
        return m156035s(C87739bu.HTTP_EXECUTE_REQUEST_UNBUFFERED, new C94599b(arVar, xVar, qVar), C94622n.f264630a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ProcessHttpEngine");
    }

    /* renamed from: h */
    public final C60870cx mo27497h(int i) {
        return m156035s(C87739bu.HTTP_GET_STATISTICS, Integer.valueOf(i), C94619k.f264627a);
    }

    /* renamed from: i */
    public final void mo27498i(File file) {
        mo88551q(C87739bu.HTTP_CAPTURE_NETLOG, file);
    }

    /* renamed from: j */
    public final void mo27499j() {
        mo88551q(C87739bu.HTTP_FORCE_START_NETLOG, C58836b.f156633a);
    }

    /* renamed from: k */
    public final void mo27500k(C89046bq bqVar) {
        mo88551q(C87739bu.HTTP_SET_TESTING_URL_REWRITER, C58833ax.m90833j(bqVar));
    }

    /* renamed from: m */
    public final C60870cx mo27501m(String str, int i, C70334de deVar, String str2, int i2) {
        return m156035s(C87739bu.HTTP_CREATE_GRPC_CHANNEL, new C94597a(str, i, deVar, str2, i2), C94620l.f264628a);
    }

    /* renamed from: n */
    public final void mo88548n(ClientEventData clientEventData) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f264641j.mo81951w()) {
            this.f264641j.mo81932c();
            this.f264641j.mo81947s((Bundle) null);
        }
        this.f264641j.mo81937i(clientEventData);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo88549o(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo88552r()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            int r0 = r1.f264645n     // Catch:{ all -> 0x0019 }
            if (r2 != r0) goto L_0x0017
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.search.shared.service.aa r2 = r1.f264641j     // Catch:{ all -> 0x0019 }
            r2.mo81933e()     // Catch:{ all -> 0x0019 }
            r2 = 0
            r1.f264644m = r2     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7453bi.C94625q.mo88549o(int):void");
    }

    /* renamed from: p */
    public final synchronized void mo88550p(int i) {
        this.f264643l.remove(Integer.valueOf(i));
        this.f264645n = i;
        if (!mo88552r()) {
            C60870cx cxVar = this.f264644m;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            this.f264644m = this.f264638g.mo28208h("maybeDisconnectFromSearchService", 60000, new C94623o(this, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo88551q(C87739bu buVar, Object obj) {
        try {
            C90877ak.m148472f(m156035s(buVar, obj, C94621m.f264629a));
        } catch (InterruptedException | ExecutionException e) {
            C59104x d = f264636e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProcessHttpEngine");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(20734)).mo56386p("Failed to process client event");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo88552r() {
        return !this.f264643l.isEmpty();
    }
}
