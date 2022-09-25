package com.google.android.libraries.notifications.entrypoints;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.libraries.notifications.C29781c;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.p2266c.C29783b;
import com.google.android.libraries.notifications.p2267d.C29785a;
import com.google.android.libraries.notifications.p2267d.C29786b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2334b.C30140a;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;
import com.google.apps.tiktok.tracing.C47538ax;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68792a;

/* renamed from: com.google.android.libraries.notifications.entrypoints.c */
/* compiled from: PG */
public abstract class C29964c extends BroadcastReceiver {

    /* renamed from: a */
    static final AtomicBoolean f81123a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final /* synthetic */ int f81124b = 0;

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static void m55537b(C29965d dVar, Intent intent, C30007h hVar, long j) {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(dVar.mo35260a(intent));
            dVar.mo35261b(intent, hVar, j);
            Process.setThreadPriority(threadPriority);
        } catch (Throwable th) {
            Process.setThreadPriority(threadPriority);
            throw th;
        }
    }

    /* renamed from: a */
    public abstract C29965d mo35258a(Context context);

    /* renamed from: c */
    public abstract boolean mo35259c();

    public final void onReceive(Context context, Intent intent) {
        Throwable th;
        Intent intent2 = intent;
        if (intent2 == null) {
            C30058b.m55792d("ChimeBroadcastReceiver", new IllegalArgumentException(), "Null Intent received.", new Object[0]);
            return;
        }
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        long j = (intent.getFlags() & 268435456) > 0 ? 8500 : 58500;
        C29781c cVar = new C29781c();
        cVar.f80703a = Long.valueOf(j);
        cVar.mo34976b(SystemClock.uptimeMillis());
        C30007h a = cVar.mo34975a();
        C30058b.m55793e("ChimeBroadcastReceiver", "Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        C30058b.m55793e("ChimeBroadcastReceiver", "Phenotype initialized.", new Object[0]);
        try {
            C29786b a2 = C29785a.m54946a(context);
            a2.mo34988BS();
            C30144a.m56002a(context);
            C47538ax c = a2.mo34994rW().f81524a.mo51613c("ChimeBroadcastReceiver");
            try {
                if (!mo35259c() || !a2.mo34991ct().mo35431n()) {
                    C29965d a3 = mo35258a(context);
                    if (a3.mo35262c(intent2)) {
                        C30058b.m55793e("ChimeBroadcastReceiver", "Validation OK for action [%s].", intent.getAction());
                        C29783b cs = C29785a.m54946a(context).mo34990cs();
                        if (!C30140a.m55989b(context)) {
                            cs.mo34982d(new C29960a(intent2, a3, micros));
                        } else {
                            boolean compareAndSet = f81123a.compareAndSet(false, true);
                            if (C68792a.f184859a.mo6453a().mo60477c() && compareAndSet) {
                                long elapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
                                if (elapsedRealtime <= C68792a.f184859a.mo6453a().mo60475a()) {
                                    a = a.mo35311e(elapsedRealtime);
                                }
                            }
                            C30007h hVar = a;
                            BroadcastReceiver.PendingResult goAsync = goAsync();
                            boolean isOrderedBroadcast = isOrderedBroadcast();
                            C29963b bVar = new C29963b(intent, a3, hVar, micros);
                            if (!C68792a.m99309c()) {
                                hVar = C30007h.m55637d();
                            }
                            cs.mo34981c(goAsync, isOrderedBroadcast, bVar, hVar);
                        }
                    } else {
                        C30058b.m55793e("ChimeBroadcastReceiver", "Validation failed for action [%s].", intent.getAction());
                    }
                    if (c != null) {
                        c.close();
                    }
                    if (isOrderedBroadcast()) {
                        setResultCode(-1);
                        return;
                    }
                    return;
                }
                C30058b.m55793e("ChimeBroadcastReceiver", "BroadcastReceiver disabled by host app in ChimeConfig", new Object[0]);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
        } catch (IllegalStateException e) {
            C30058b.m55797i("ChimeBroadcastReceiver", e, "BroadcastReceiver stopped", new Object[0]);
            return;
        }
        throw th;
    }
}
