package com.google.android.apps.gsa.smartspace.p7258b;

import android.content.Context;
import android.content.LocusId;
import android.os.Build;
import android.view.contentcapture.DataShareRequest;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.p6454c.C83751g;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92110f;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.smartspace.p7257a.C92030l;
import com.google.android.apps.search.assistant.libraries.p8942a.C119206c;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.C50838j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.smartspace.b.m */
/* compiled from: PG */
public final class C92070m implements C92110f {

    /* renamed from: a */
    public final C58974d f256684a;

    /* renamed from: b */
    public boolean f256685b = false;

    /* renamed from: c */
    public final Context f256686c;

    /* renamed from: d */
    public final C60888db f256687d;

    /* renamed from: e */
    public final C83793i f256688e;

    /* renamed from: f */
    public final C83751g f256689f;

    /* renamed from: g */
    public final C92030l f256690g;

    /* renamed from: h */
    private final C92125t f256691h;

    /* renamed from: i */
    private final C130895ag f256692i;

    /* renamed from: j */
    private final C47632e f256693j = new C47632e();

    /* renamed from: k */
    private final C86124t f256694k;

    /* renamed from: l */
    private final C119206c f256695l;

    public C92070m(Context context, C90851k kVar, C92125t tVar, C130895ag agVar, C83564a aVar, C83793i iVar, C83751g gVar, C86124t tVar2, C92030l lVar, C119206c cVar) {
        this.f256686c = context;
        this.f256687d = kVar.mo85208a("backgroundExecutor");
        this.f256691h = tVar;
        this.f256692i = agVar;
        this.f256688e = iVar;
        this.f256684a = aVar.mo76901b(this);
        this.f256689f = gVar;
        this.f256694k = tVar2;
        this.f256690g = lVar;
        this.f256695l = cVar;
    }

    /* renamed from: e */
    public static Optional m151109e(MessageLite messageLite) {
        if (!(messageLite instanceof C50819dp)) {
            return Optional.empty();
        }
        for (C50818do doVar : ((C50819dp) messageLite).f132332a) {
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (a.equals(C50794cr.MEDIA)) {
                return Optional.m71637of(doVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: j */
    private final C60870cx m151110j(MessageLite messageLite, String str) {
        if (!this.f256694k.mo79746e(C90017bw.f247965ba)) {
            return this.f256693j.mo51512b(new C92060c(this, messageLite, str), this.f256687d);
        }
        if (Build.VERSION.SDK_INT < 30) {
            ((C58970a) ((C58970a) this.f256684a.mo56224b()).mo56372aa(11999)).mo56386p("skipping aiaiConnect because OS version < R");
            return C118826c.f331423b;
        }
        C31520m c = C31167ax.m58112a().mo36912c();
        C92064g gVar = new C92064g(this, str, messageLite);
        if (messageLite instanceof C50819dp) {
            mo86733f((C50819dp) messageLite, str);
        }
        C47633f h = C47633f.m84733g(this.f256695l.mo104239a(new DataShareRequest(new LocusId(str), "application/x-binary"), messageLite)).mo51515h(new C92065h(this, str, gVar, messageLite), this.f256687d);
        h.mo4106b(new C92066i(this, messageLite, c), this.f256687d);
        return h;
    }

    /* renamed from: a */
    public final C60870cx mo86729a(C50819dp dpVar) {
        mo86735h(C131177b.TOTAL_REQUEST_SEND, "aa_update");
        return m151110j(dpVar, "aa_update");
    }

    /* renamed from: b */
    public final C60870cx mo86730b(C50838j jVar) {
        mo86735h(C131177b.TOTAL_REQUEST_SEND, "app_suggestions_update");
        return m151110j(jVar, "app_suggestions_update");
    }

    /* renamed from: c */
    public final C60870cx mo86731c(C50838j jVar) {
        mo86735h(C131177b.TOTAL_REQUEST_SEND, "app_suggestions_server_update");
        return m151110j(jVar, "app_suggestions_server_update");
    }

    /* renamed from: d */
    public final C60870cx mo86732d(C50819dp dpVar) {
        mo86735h(C131177b.TOTAL_REQUEST_SEND, "smartspace_update");
        return m151110j(dpVar, "smartspace_update");
    }

    /* renamed from: f */
    public final void mo86733f(C50819dp dpVar, String str) {
        this.f256692i.mo109915am(dpVar, str);
        this.f256691h.mo86697b(dpVar);
    }

    /* renamed from: g */
    public final void mo86734g(C50819dp dpVar) {
        for (C50818do doVar : dpVar.f132332a) {
            C58970a aVar = (C58970a) ((C58970a) this.f256684a.mo56224b()).mo56372aa(12009);
            Integer valueOf = Integer.valueOf(doVar.f132307d);
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            String name = a.name();
            Long valueOf2 = Long.valueOf(doVar.f132317n);
            C50796ct ctVar = doVar.f132320q;
            if (ctVar == null) {
                ctVar = C50796ct.f132223c;
            }
            aVar.mo56360M("cardId: %d, card type: %s, update time: %s, expireTime: %s", valueOf, name, valueOf2, Long.valueOf(ctVar.f132226b));
        }
    }

    /* renamed from: h */
    public final void mo86735h(C131177b bVar, String str) {
        this.f256692i.mo109916an("Classic", bVar, str);
    }

    /* renamed from: i */
    public final void mo86736i(C131177b bVar, String str, int i) {
        this.f256692i.mo109895aD(bVar, str, i);
    }
}
