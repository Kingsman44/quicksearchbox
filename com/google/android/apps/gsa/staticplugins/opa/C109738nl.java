package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88116pt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88120px;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nl */
/* compiled from: PG */
public final class C109738nl implements C87682aj {

    /* renamed from: a */
    public final Activity f305729a;

    /* renamed from: b */
    C60870cx f305730b = null;

    /* renamed from: c */
    private final C22871g f305731c;

    /* renamed from: d */
    private final C21370a f305732d;

    /* renamed from: e */
    private long f305733e;

    /* renamed from: f */
    private long f305734f;

    public C109738nl(Activity activity, C22871g gVar, C21370a aVar) {
        this.f305729a = activity;
        this.f305731c = gVar;
        this.f305732d = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo98057a() {
        this.f305729a.getWindow().clearFlags(128);
        C60870cx cxVar = this.f305730b;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        this.f305733e = 0;
        this.f305734f = 0;
    }

    /* renamed from: b */
    public final void mo98058b(long j, long j2) {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (j2 > 0) {
            long b = this.f305732d.mo26870b();
            this.f305733e = Math.max(this.f305733e, j + b);
            long j3 = b + j2;
            if (j3 >= this.f305734f) {
                this.f305734f = j3;
                C60870cx cxVar = this.f305730b;
                if (cxVar != null) {
                    cxVar.cancel(false);
                }
                this.f305729a.getWindow().addFlags(128);
                this.f305730b = this.f305731c.mo28208h("Remove LayoutParams.FLAG_KEEP_SCREEN_ON", j2, new C109737nk(this));
            }
        }
    }

    /* renamed from: d */
    public final void mo98059d() {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (this.f305732d.mo26870b() >= this.f305733e) {
            mo98057a();
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.OPA_KEEP_SCREEN_ON) {
            C62940bt btVar = C88116pt.f238220a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                long j = (long) ((C88120px) serviceEventData.mo81918e(C88116pt.f238220a)).f238225b;
                mo98058b(j, j);
            }
        }
    }
}
