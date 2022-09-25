package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.s3.producers.x */
/* compiled from: PG */
final class C84325x extends C90888av {

    /* renamed from: a */
    private final C60870cx f229488a;

    /* renamed from: b */
    private final C86159h f229489b;

    /* renamed from: c */
    private final Queue f229490c;

    /* renamed from: d */
    private C61818k f229491d = null;

    /* renamed from: e */
    private boolean f229492e = false;

    public C84325x(C60870cx cxVar, C86159h hVar, Queue queue) {
        super("discourseContext", 2, 0);
        this.f229488a = cxVar;
        this.f229489b = hVar;
        this.f229490c = queue;
    }

    public final synchronized void run() {
        boolean z;
        C61817j jVar;
        C58976aa aaVar = C58975e.f156826a;
        SettableFuture settableFuture = (SettableFuture) this.f229490c.poll();
        if (this.f229488a.isCancelled()) {
            settableFuture.cancel(false);
            return;
        }
        C61818k kVar = this.f229491d;
        boolean z2 = true;
        if (kVar != null) {
            jVar = (C61817j) kVar.toBuilder();
            z = false;
        } else {
            jVar = (C61817j) this.f229489b.mo79795e(false).toBuilder();
            if ((((C61818k) jVar.instance).f167001a & 2048) != 0) {
                C59104x d = C84327z.f229493a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "S3RequestUpdatesSchdlr");
                ((C59052c) ((C59052c) d).mo56372aa(7256)).mo56386p("AssistData not expected here. Check b/29939851.");
                jVar.copyOnWrite();
                C61818k kVar2 = (C61818k) jVar.instance;
                kVar2.f167012l = null;
                kVar2.f167001a &= -2049;
            }
            z = true;
        }
        if (this.f229492e || !this.f229489b.mo79803q(jVar, this.f229488a)) {
            z2 = z;
        } else {
            this.f229492e = true;
        }
        C61818k kVar3 = (C61818k) jVar.build();
        this.f229491d = kVar3;
        if (!z2 || kVar3.getSerializedSize() == 0) {
            settableFuture.cancel(false);
        } else {
            settableFuture.mo57356n(kVar3);
        }
    }
}
