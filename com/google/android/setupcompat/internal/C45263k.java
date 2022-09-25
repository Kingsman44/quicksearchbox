package com.google.android.setupcompat.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import com.google.android.setupcompat.C45237a;
import com.google.android.setupcompat.p3550b.C45245b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.setupcompat.internal.k */
/* compiled from: PG */
public final class C45263k {

    /* renamed from: a */
    private static final C45245b f118231a = new C45245b("SetupCompatServiceInvoker");

    /* renamed from: b */
    private static C45263k f118232b;

    /* renamed from: c */
    private static final long f118233c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    private final Context f118234d;

    /* renamed from: e */
    private final ExecutorService f118235e = C45254b.f118201a.f118202b;

    /* renamed from: f */
    private final long f118236f = f118233c;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    private C45263k(Context context) {
        this.f118234d = context;
    }

    /* renamed from: a */
    public static synchronized C45263k m80635a(Context context) {
        C45263k kVar;
        synchronized (C45263k.class) {
            if (f118232b == null) {
                f118232b = new C45263k(context.getApplicationContext());
            }
            kVar = f118232b;
        }
        return kVar;
    }

    /* renamed from: b */
    public final void mo49142b(String str, Bundle bundle) {
        try {
            this.f118235e.execute(new C45262j(this, str, bundle));
        } catch (RejectedExecutionException e) {
            f118231a.mo49114d(String.format("Screen %s bind back fail.", new Object[]{str}), e);
        }
    }

    /* renamed from: c */
    public final void mo49143c(String str, Bundle bundle) {
        try {
            Context context = this.f118234d;
            C45237a c = C45267o.m80643a(context).mo49153c(this.f118236f, TimeUnit.MILLISECONDS);
            if (c != null) {
                Parcel gA = c.mo17260gA();
                gA.writeString(str);
                C8850c.m23497f(gA, bundle);
                c.mo17263hf(1, gA);
                return;
            }
            f118231a.mo49115e("BindBack failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | InterruptedException | TimeoutException e) {
            f118231a.mo49114d(String.format("Exception occurred while %s trying bind back to SetupWizard.", new Object[]{str}), e);
        }
    }

    /* renamed from: d */
    public final void mo49144d(int i, Bundle bundle) {
        try {
            Context context = this.f118234d;
            C45237a c = C45267o.m80643a(context).mo49153c(this.f118236f, TimeUnit.MILLISECONDS);
            if (c != null) {
                Bundle bundle2 = Bundle.EMPTY;
                Parcel gA = c.mo17260gA();
                gA.writeInt(i);
                C8850c.m23497f(gA, bundle);
                C8850c.m23497f(gA, bundle2);
                c.mo17263hf(2, gA);
                return;
            }
            f118231a.mo49115e("logMetric failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | IllegalStateException | InterruptedException | TimeoutException e) {
            f118231a.mo49114d(String.format("Exception occurred while trying to log metric = [%s]", new Object[]{bundle}), e);
        }
    }

    /* renamed from: e */
    public final void mo49145e(String str, Bundle bundle) {
        try {
            Context context = this.f118234d;
            C45237a c = C45267o.m80643a(context).mo49153c(this.f118236f, TimeUnit.MILLISECONDS);
            if (c != null) {
                Parcel gA = c.mo17260gA();
                C8850c.m23497f(gA, bundle);
                c.mo17263hf(3, gA);
                return;
            }
            f118231a.mo49115e("Report focusChange failed since service reference is null. Are the permission valid?");
        } catch (RemoteException | InterruptedException | UnsupportedOperationException | TimeoutException e) {
            f118231a.mo49114d(String.format("Exception occurred while %s trying report windowFocusChange to SetupWizard.", new Object[]{str}), e);
        }
    }

    /* renamed from: f */
    public final void mo49146f(int i, Bundle bundle) {
        try {
            this.f118235e.execute(new C45261i(this, i, bundle));
        } catch (RejectedExecutionException e) {
            f118231a.mo49114d(String.format("Metric of type %d dropped since queue is full.", new Object[]{Integer.valueOf(i)}), e);
        }
    }

    /* renamed from: g */
    public final void mo49147g(String str, Bundle bundle) {
        try {
            this.f118235e.execute(new C45260h(this, str, bundle));
        } catch (RejectedExecutionException e) {
            f118231a.mo49114d(String.format("Screen %s report focus changed failed.", new Object[]{str}), e);
        }
    }
}
