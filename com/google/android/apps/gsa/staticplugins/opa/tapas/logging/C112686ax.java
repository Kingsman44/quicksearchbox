package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ax */
/* compiled from: PG */
public final class C112686ax {

    /* renamed from: A */
    public final C118831d f312359A = m186498b(C118569b.TAPAS_SERVER_SOURCE_ZERO_PREFIX_LATENCY_MILLIS);

    /* renamed from: B */
    public final C118831d f312360B = m186498b(C118569b.TAPAS_SERVER_SOURCE_N_PREFIX_LATENCY_MILLIS);

    /* renamed from: C */
    public final C118831d f312361C = m186498b(C118569b.TAPAS_SERVER_SOURCE_SUCCESS_N_PREFIX_LATENCY_MILLIS);

    /* renamed from: D */
    public final C118831d f312362D = m186498b(C118569b.TAPAS_SERVER_SOURCE_TIMEOUT_N_PREFIX_LATENCY_MILLIS);

    /* renamed from: E */
    private final C118827a f312363E;

    /* renamed from: F */
    private final C118831d f312364F = m186498b(C118569b.TAPAS_SUGGESTION_RENDER_LATENCY_MILLIS);

    /* renamed from: G */
    private final C118831d f312365G = m186498b(C118569b.TAPAS_SUGGESTION_RENDER_0_PREFIX_LATENCY_MILLIS);

    /* renamed from: H */
    private final C118831d f312366H = m186498b(C118569b.TAPAS_SUGGESTION_RENDER_N_PREFIX_LATENCY_MILLIS);

    /* renamed from: a */
    public final C68214a f312367a;

    /* renamed from: b */
    public final C118831d f312368b = m186498b(C118569b.TAPAS_APP_ACTION_SOURCE_LATENCY_MILLIS);

    /* renamed from: c */
    public final C118831d f312369c = m186498b(C118569b.TAPAS_APP_ACTIONS_SHORTCUT_SOURCE_LATENCY_MILLIS);

    /* renamed from: d */
    public final C118831d f312370d = m186498b(C118569b.TAPAS_APP_SOURCE_LATENCY_MILLIS);

    /* renamed from: e */
    public final C118831d f312371e = m186498b(C118569b.TAPAS_COMMS_SOURCE_LATENCY_MILLIS);

    /* renamed from: f */
    public final C118831d f312372f = m186498b(C118569b.TAPAS_COMPLETE_SERVER_SOURCE_LATENCY_MILLIS);

    /* renamed from: g */
    public final C118831d f312373g = m186498b(C118569b.TAPAS_GEO_SOURCE_LATENCY_MILLIS);

    /* renamed from: h */
    public final C118831d f312374h = m186498b(C118569b.TAPAS_ICING_SOURCE_LATENCY_MILLIS);

    /* renamed from: i */
    public final C118831d f312375i = m186498b(C118569b.TAPAS_MEDIA_SOURCE_LATENCY_MILLIS);

    /* renamed from: j */
    public final C118831d f312376j = m186498b(C118569b.TAPAS_MESSAGE_SOURCE_LATENCY_MILLIS);

    /* renamed from: k */
    public final C118831d f312377k = m186498b(C118569b.TAPAS_NOTIFICATION_SOURCE_LATENCY_MILLIS);

    /* renamed from: l */
    public final C118831d f312378l = m186498b(C118569b.TAPAS_SHORTCUT_SOURCE_LATENCY_MILLIS);

    /* renamed from: m */
    public final C118831d f312379m = m186498b(C118569b.TAPAS_SUGGESTION_FETCH_LATENCY_MILLIS);

    /* renamed from: n */
    public final C118831d f312380n = m186498b(C118569b.TAPAS_SUGGESTION_FETCH_0_PREFIX_LATENCY_MILLIS);

    /* renamed from: o */
    public final C118831d f312381o = m186498b(C118569b.TAPAS_SUGGESTION_FETCH_SUCCESS_COUNT);

    /* renamed from: p */
    public final C118831d f312382p = m186498b(C118569b.TAPAS_SUGGESTION_FETCH_0_PREFIX_SUCCESS_COUNT);

    /* renamed from: q */
    public final C118831d f312383q = m186498b(C118569b.TAPAS_SUGGESTION_FETCH_N_PREFIX_LATENCY_MILLIS);

    /* renamed from: r */
    public final C118831d f312384r = m186498b(C118569b.TAPAS_SUGGESTION_FETCH_N_PREFIX_SUCCESS_COUNT);

    /* renamed from: s */
    public final C118831d f312385s = m186498b(C118569b.TAPAS_MIX_RESPONSE_LATENCY_MILLIS);

    /* renamed from: t */
    public final C118831d f312386t = m186498b(C118569b.TAPAS_MIX_RESPONSE_0_PREFIX_LATENCY_MILLIS);

    /* renamed from: u */
    public final C118831d f312387u = m186498b(C118569b.TAPAS_MIX_RESPONSE_N_PREFIX_LATENCY_MILLIS);

    /* renamed from: v */
    public final C118831d f312388v = m186498b(C118569b.TAPAS_SERVER_SOURCE_SUCCESS_COUNT);

    /* renamed from: w */
    public final C118831d f312389w = m186498b(C118569b.TAPAS_SERVER_SOURCE_TIMEOUT_COUNT);

    /* renamed from: x */
    public final C118831d f312390x = m186498b(C118569b.TAPAS_SERVER_SOURCE_FAILURE_COUNT);

    /* renamed from: y */
    public final C118831d f312391y = m186498b(C118569b.TAPAS_SERVER_SOURCE_ZERO_PREFIX_SUCCESS_COUNT);

    /* renamed from: z */
    public final C118831d f312392z = m186498b(C118569b.TAPAS_SERVER_SOURCE_N_PREFIX_SUCCESS_COUNT);

    public C112686ax(C118827a aVar, C68214a aVar2) {
        this.f312363E = aVar;
        this.f312367a = aVar2;
    }

    /* renamed from: a */
    public final void mo99642a(long j, int i) {
        if (i == 0) {
            this.f312365G.mo104025g(j);
        } else {
            this.f312366H.mo104025g(j);
        }
        this.f312364F.mo104025g(j);
    }

    /* renamed from: b */
    private final C118831d m186498b(C118569b bVar) {
        C118827a aVar = this.f312363E;
        aVar.getClass();
        return aVar.mo77944g(bVar, C118575h.GRAPH_TAPAS_SUGGESTION_FETCH);
    }
}
