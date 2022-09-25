package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.util.concurrent.C60843bx;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.c */
/* compiled from: PG */
final class C90835c extends C60843bx implements RunnableFuture {

    /* renamed from: a */
    final /* synthetic */ C90844d f254004a;

    /* renamed from: b */
    private final C90805ax f254005b;

    /* renamed from: c */
    private final C90804aw f254006c;

    public C90835c(C90844d dVar, C90805ax axVar, C90804aw awVar) {
        this.f254004a = dVar;
        this.f254005b = axVar;
        this.f254006c = awVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C60870cx mo57326c() {
        return this.f254005b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ Future mo57321d() {
        return this.f254005b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f254005b;
    }

    public final void run() {
        this.f254004a.f254018a.mo85158c(this.f254006c);
        try {
            this.f254005b.run();
        } finally {
            this.f254004a.f254018a.mo85157b(this.f254006c);
        }
    }
}
