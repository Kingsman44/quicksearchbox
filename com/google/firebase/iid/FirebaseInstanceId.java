package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.p10784a.C143999b;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.firebase.C61204g;
import com.google.firebase.installations.C61256h;
import com.google.firebase.p4611d.C61174a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

@Deprecated
/* compiled from: PG */
public class FirebaseInstanceId {

    /* renamed from: a */
    public static C61228t f165566a;

    /* renamed from: b */
    static ScheduledExecutorService f165567b;

    /* renamed from: i */
    private static final long f165568i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static final Pattern f165569j = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c */
    final Executor f165570c;

    /* renamed from: d */
    public final C61204g f165571d;

    /* renamed from: e */
    public final C61220l f165572e;

    /* renamed from: f */
    public final C61218j f165573f;

    /* renamed from: g */
    public final C61225q f165574g;

    /* renamed from: h */
    public final List f165575h = new ArrayList();

    /* renamed from: k */
    private final C61256h f165576k;

    /* renamed from: l */
    private boolean f165577l = false;

    public FirebaseInstanceId(C61204g gVar, C61174a aVar, C61174a aVar2, C61256h hVar) {
        gVar.mo57770f();
        C61220l lVar = new C61220l(gVar.f165555c);
        ExecutorService a = C61210b.m93602a();
        ExecutorService a2 = C61210b.m93602a();
        if (C61220l.m93609e(gVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f165566a == null) {
                    gVar.mo57770f();
                    f165566a = new C61228t(gVar.f165555c);
                }
            }
            this.f165571d = gVar;
            this.f165572e = lVar;
            this.f165573f = new C61218j(gVar, lVar, aVar, aVar2, hVar);
            this.f165570c = a2;
            this.f165574g = new C61225q(a);
            this.f165576k = hVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: f */
    public static void m93587f(C61204g gVar) {
        gVar.mo57770f();
        C143919bh.m233970m(gVar.f165557e.f165716d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        gVar.mo57770f();
        C143919bh.m233970m(gVar.f165557e.f165714b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        gVar.mo57770f();
        C143919bh.m233970m(gVar.f165557e.f165713a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        gVar.mo57770f();
        C143919bh.m233960c(gVar.f165557e.f165714b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.mo57770f();
        C143919bh.m233960c(f165569j.matcher(gVar.f165557e.f165713a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static FirebaseInstanceId getInstance(C61204g gVar) {
        m93587f(gVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) gVar.mo57767d(FirebaseInstanceId.class);
        C143919bh.m233971n(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* renamed from: k */
    static boolean m93588k() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    /* renamed from: m */
    static final void m93589m(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f165567b == null) {
                f165567b = new ScheduledThreadPoolExecutor(1, new C143999b("FirebaseInstanceId"));
            }
            f165567b.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: n */
    private final Object m93590n(C146006ab abVar) {
        try {
            return C146021aq.m237853g(abVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo57780g();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    public final C61227s mo57775a() {
        return mo57776b(C61220l.m93609e(this.f165571d), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C61227s mo57776b(String str, String str2) {
        return f165566a.mo57795a(mo57778d(), str, str2);
    }

    /* renamed from: c */
    public final String mo57777c() {
        try {
            f165566a.mo57799e(this.f165571d.mo57768e());
            C146006ab a = this.f165576k.mo57863a();
            C143919bh.m233971n(a, "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a.mo122493l(C61214f.f165591a, new C61216h(countDownLatch));
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (a.mo122491j()) {
                return (String) a.mo122488g();
            }
            if (a.mo122489h()) {
                throw new CancellationException("Task is already canceled");
            } else if (a.mo122490i()) {
                throw new IllegalStateException(a.mo122487f());
            } else {
                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public final String mo57778d() {
        C61204g gVar = this.f165571d;
        gVar.mo57770f();
        if ("[DEFAULT]".equals(gVar.f165556d)) {
            return BuildConfig.FLAVOR;
        }
        return this.f165571d.mo57768e();
    }

    @Deprecated
    /* renamed from: e */
    public final String mo57779e(String str, String str2) {
        m93587f(this.f165571d);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            return ((C61219k) m93590n(C146021aq.m237850d((Object) null).mo122484c(this.f165570c, new C61211c(this, str, str2)))).f165601a;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo57780g() {
        f165566a.mo57796b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo57781h(boolean z) {
        this.f165577l = z;
    }

    /* renamed from: i */
    public final synchronized void mo57782i() {
        if (!this.f165577l) {
            mo57783j(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final synchronized void mo57783j(long j) {
        m93589m(new C61230v(this, Math.min(Math.max(30, j + j), f165568i)), j);
        this.f165577l = true;
    }

    /* renamed from: l */
    public final boolean mo57784l(C61227s sVar) {
        if (sVar == null) {
            return true;
        }
        return System.currentTimeMillis() > sVar.f165619d + C61227s.f165616a || !this.f165572e.mo57791c().equals(sVar.f165618c);
    }
}
