package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.libraries.gsa.conversation.p1838b.C22348b;
import com.google.android.libraries.gsa.conversation.p1838b.C22350d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ad */
/* compiled from: PG */
public final class C22617ad implements C22348b {

    /* renamed from: b */
    private static final C59071e f62312b = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g.ad");

    /* renamed from: a */
    public final C22654bn f62313a;

    /* renamed from: c */
    private C60870cx f62314c;

    /* renamed from: d */
    private C63088z f62315d = null;

    public C22617ad(C22654bn bnVar) {
        this.f62313a = bnVar;
    }

    /* renamed from: f */
    private final void m42140f() {
        this.f62315d = null;
        C60870cx cxVar = this.f62314c;
        if (cxVar != null && !cxVar.isDone() && !this.f62314c.cancel(false)) {
            ((C59052c) ((C59052c) f62312b.mo56225c()).mo56372aa(48347)).mo56386p("Failed to cancel processing delta");
        }
    }

    /* renamed from: a */
    public final void mo27576a(C22350d dVar) {
        dVar.mo27580c("Processor");
        dVar.mo27578a(this.f62313a);
    }

    /* renamed from: b */
    public final synchronized C60870cx mo27736b(C52078ek ekVar, C58833ax axVar, C22618ae aeVar, boolean z) {
        C22654bn bnVar;
        if (z) {
            mo27739e(aeVar, 1);
        }
        bnVar = this.f62313a;
        return C60856cj.m92905n(C47810es.m84965e(new C22637ax(bnVar, ekVar, axVar, aeVar)), bnVar.f62405c);
    }

    /* renamed from: c */
    public final synchronized void mo27737c(C52081en enVar, C22618ae aeVar) {
        C63088z zVar;
        boolean z = false;
        if (enVar.f136684d.size() > 0 && (zVar = this.f62315d) != null && !zVar.equals(enVar.f136682b)) {
            z = true;
        }
        if (z) {
            m42140f();
        }
        this.f62315d = enVar.f136682b;
        this.f62314c = this.f62313a.mo27768i(enVar, aeVar, z);
    }

    /* renamed from: d */
    public final synchronized void mo27738d(C57981b bVar, C22618ae aeVar) {
        m42140f();
        C22654bn bnVar = this.f62313a;
        this.f62314c = C60856cj.m92905n(C47810es.m84965e(new C22638ay(bnVar, aeVar, bVar)), bnVar.f62405c);
    }

    /* renamed from: e */
    public final synchronized void mo27739e(C22618ae aeVar, int i) {
        if (i != 3) {
            m42140f();
        }
        C22654bn bnVar = this.f62313a;
        bnVar.f62405c.execute(C47810es.m84977q(new C22628ao(bnVar, i, aeVar)));
    }
}
