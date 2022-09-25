package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b;

import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14049k;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.l */
/* compiled from: PG */
public final class C14027l {

    /* renamed from: a */
    public static final C59071e f42639a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.l");

    /* renamed from: b */
    public final C46578l f42640b;

    /* renamed from: c */
    public final C42876ab f42641c;

    /* renamed from: d */
    public final C69464a f42642d;

    /* renamed from: e */
    private final C69464a f42643e;

    public C14027l(C46578l lVar, C42876ab abVar, C69464a aVar, C69464a aVar2) {
        this.f42640b = lVar;
        this.f42641c = abVar;
        this.f42643e = aVar;
        this.f42642d = aVar2;
    }

    /* renamed from: a */
    public static void m30312a(C60870cx cxVar, C60887da daVar, Throwable th, long j) {
        C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(new C14018c(th, j)), daVar), "Failed to add appflow log", new Object[0]);
    }

    /* renamed from: b */
    public final void mo21388b() {
        C46459k.m82829b(this.f42640b.mo50546b(C14049k.m30340a(2, ((Long) this.f42643e.mo17428b()).intValue())), "Failed to schedule next NewsContentSyncWorker", new Object[0]);
    }
}
