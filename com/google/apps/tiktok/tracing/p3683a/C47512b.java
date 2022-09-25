package com.google.apps.tiktok.tracing.p3683a;

import android.util.SparseArray;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.C47541b;
import com.google.apps.tiktok.tracing.C47779do;
import com.google.apps.tiktok.tracing.C47814ew;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.tracing.a.b */
/* compiled from: PG */
final class C47512b implements C47779do, C46675m {

    /* renamed from: a */
    public final C47541b f123348a;

    /* renamed from: b */
    public final ArrayDeque f123349b = new ArrayDeque(20);

    /* renamed from: c */
    private final C60887da f123350c;

    public C47512b(C47541b bVar, C60887da daVar) {
        this.f123348a = bVar;
        this.f123350c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        Executor executor;
        C47511a aVar = new C47511a(this, oVar);
        if (oVar.mo50706f()) {
            executor = C60826bg.f164896a;
        } else {
            executor = this.f123350c;
        }
        return C60856cj.m92905n(aVar, executor);
    }

    /* renamed from: b */
    public final void mo51372b(C47814ew ewVar, SparseArray sparseArray) {
        synchronized (this.f123349b) {
            if (this.f123349b.size() == 20) {
                this.f123349b.removeFirst();
            }
            this.f123349b.addLast(ewVar);
        }
    }
}
