package com.google.android.apps.gsa.shared.p7021be;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.search.p2476a.C32239m;
import com.google.apps.tiktok.p3633d.p3634a.C46674l;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60917ed;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.shared.be.i */
/* compiled from: PG */
public final class C89421i implements C90991b {

    /* renamed from: a */
    public final C46674l f242406a;

    /* renamed from: b */
    public final Context f242407b;

    /* renamed from: c */
    private final Executor f242408c;

    /* renamed from: d */
    private final C32239m f242409d;

    /* renamed from: com.google.android.apps.gsa.shared.be.i$a */
    /* compiled from: PG */
    public interface C89422a {
        /* renamed from: iV */
        Map mo83329iV();

        /* renamed from: iX */
        Map mo83330iX();
    }

    public C89421i(C46674l lVar, C32239m mVar, Executor executor, Context context) {
        this.f242406a = lVar;
        this.f242409d = mVar;
        this.f242408c = executor;
        this.f242407b = context;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C47633f i = C47633f.m84733g(C47633f.m84733g(this.f242409d.mo38012a()).mo51515h(new C89413a(this), this.f242408c)).mo51516i(new C89414b(this), this.f242408c).mo51516i(new C89415c(fVar), this.f242408c);
        C91018d.m148680c();
        try {
            C60917ed.m93035b(i, 3, TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            fVar.mo85292s(C90752i.m148231e(e.getStackTrace()));
        }
    }
}
