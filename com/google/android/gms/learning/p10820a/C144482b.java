package com.google.android.gms.learning.p10820a;

import android.content.Context;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.internal.p10828b.C144766b;
import com.google.android.gms.learning.internal.p10828b.C144768d;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.base.C29722n;
import com.google.android.libraries.micore.learning.base.C29723o;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60827bh;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60916ec;
import com.google.common.util.concurrent.C60919g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.learning.a.b */
/* compiled from: PG */
public final class C144482b implements C29723o {

    /* renamed from: a */
    private final Context f391117a;

    /* renamed from: b */
    private final C144827n f391118b;

    /* renamed from: c */
    private final C29719k f391119c;

    /* renamed from: d */
    private Future f391120d;

    /* renamed from: e */
    private boolean f391121e;

    public C144482b(Context context, C144827n nVar, C29719k kVar) {
        this.f391117a = context;
        this.f391118b = nVar;
        this.f391119c = kVar;
    }

    /* renamed from: d */
    private final boolean m234743d() {
        synchronized (this) {
            if (!this.f391120d.isDone()) {
                return false;
            }
            try {
                C60856cj.m92909r(this.f391120d);
                return false;
            } catch (CancellationException | ExecutionException unused) {
                return true;
            }
        }
    }

    /* renamed from: e */
    private final void m234744e(Exception exc) {
        this.f391119c.mo34864f(exc, "Error loading native library");
        if (!this.f391121e) {
            this.f391118b.mo120056h(89);
            this.f391121e = true;
        }
    }

    /* renamed from: a */
    public final void mo34870a(ExecutorService executorService) {
        C144455a aVar = new C144455a(this);
        synchronized (this) {
            if (this.f391120d == null || m234743d()) {
                this.f391120d = ((C60919g) executorService).submit(aVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo34871c() {
        synchronized (this) {
            C58838bb.m90884s(this.f391120d != null, "finishLoadNativeLibrary called but library loading future is null");
            try {
                this.f391120d.get();
            } catch (InterruptedException e) {
                this.f391119c.mo34868j(e, "Interrupted while waiting for library loading");
                Thread.currentThread().interrupt();
                throw e;
            } catch (CancellationException e2) {
                m234744e(e2);
                throw e2;
            } catch (ExecutionException e3) {
                m234744e(e3);
                if (e3.getCause() instanceof C29722n) {
                    throw new C29722n(e3.getCause());
                } else if (e3.getCause() instanceof Error) {
                    throw new C60827bh((Error) e3.getCause());
                } else {
                    throw new C60916ec(e3.getCause());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo119939b() {
        try {
            Context context = this.f391117a;
            C144768d.m235290b(context).mo120200a(context);
        } catch (C144766b | UnsatisfiedLinkError e) {
            throw new C29722n(e);
        }
    }
}
