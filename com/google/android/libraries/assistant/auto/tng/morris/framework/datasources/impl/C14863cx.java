package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.provider.CallLog;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14530mq;
import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cx */
/* compiled from: PG */
public final class C14863cx implements C14781a {

    /* renamed from: a */
    public static final C59071e f44739a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cx");

    /* renamed from: f */
    private static final String[] f44740f = {"number", "type", "date", "name", "presentation"};

    /* renamed from: b */
    final C46783d f44741b;

    /* renamed from: c */
    public final Object f44742c = new Object();

    /* renamed from: d */
    public volatile C58485gu f44743d = null;

    /* renamed from: e */
    public C60870cx f44744e = null;

    /* renamed from: g */
    private final C46877q f44745g;

    /* renamed from: h */
    private final C60888db f44746h;

    public C14863cx(C60888db dbVar, C14986h hVar, C46877q qVar, C47770dh dhVar) {
        this.f44746h = dbVar;
        this.f44745g = qVar;
        this.f44741b = new C14862cw(this, dhVar, dbVar, hVar, dbVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final void mo21502b() {
        synchronized (this.f44742c) {
            this.f44744e = this.f44746h.mo29165e(new C14858cs(this), 1000, TimeUnit.MILLISECONDS);
        }
        this.f44745g.mo50875e(CallLog.Calls.CONTENT_URI, false, this.f44741b);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        synchronized (this.f44742c) {
            C60870cx cxVar = this.f44744e;
            if (cxVar != null) {
                cxVar.cancel(true);
                this.f44744e = null;
            }
        }
        this.f44743d = null;
        this.f44745g.mo50876f(this.f44741b);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final C60870cx mo21782f() {
        return this.f44745g.mo50872b(CallLog.Calls.CONTENT_URI, f44740f, "presentation=1", (String[]) null, "date DESC").f121591a.mo57272e(C47810es.m84970j(new C14859ct(this)), this.f44746h).mo57271c(RuntimeException.class, C14860cu.f44734a, this.f44746h).mo57275g();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C14530mq mqVar;
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.RECENT_CALLS_REQUEST) {
            if (this.f44743d != null) {
                C58485gu guVar = this.f44743d;
                if (bcVar.f43038a == 15) {
                    mqVar = (C14530mq) bcVar.f43039b;
                } else {
                    mqVar = C14530mq.f43916b;
                }
                int max = Math.max(0, mqVar.f43918a);
                if (max >= ((C58724pq) guVar).f156474d) {
                    return C14783c.m31119c(guVar);
                }
                return C14783c.m31119c(guVar.subList(0, max));
            }
            C59104x c = f44739a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.RcntCallsDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45655)).mo56386p("Error getting recent calls: cache miss");
        }
        return C14221be.f43041c;
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.RECENT_CALLS_REQUEST) {
            return mo21783j();
        }
        return C60856cj.m92900i(C14782b.FAILED);
    }

    /* renamed from: j */
    public final C60870cx mo21783j() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f44742c) {
            C60870cx cxVar = this.f44744e;
            if (cxVar == null) {
                this.f44744e = mo21782f();
            } else if (cxVar.isDone()) {
                C60870cx i = C60856cj.m92900i(C14782b.SUCCESS);
                return i;
            }
            C60870cx cxVar2 = this.f44744e;
            return cxVar2;
        }
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
    }
}
