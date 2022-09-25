package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.C4378ab;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.p3631b.C46542ba;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public final class TikTokListenableWorker extends C4378ab {

    /* renamed from: a */
    private final C47770dh f121655a;

    /* renamed from: b */
    private final C69464a f121656b;

    /* renamed from: g */
    private final WorkerParameters f121657g;

    public TikTokListenableWorker(Context context, C47770dh dhVar, C69464a aVar, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f121656b = aVar;
        this.f121655a = dhVar;
        this.f121657g = workerParameters;
    }

    /* renamed from: b */
    public final C60870cx mo9297b() {
        C47558bi s;
        String c = C46542ba.m82977c(this.f121657g);
        C47573bx f = this.f121655a.mo51616f("WorkManager:TikTokListenableWorker startWork");
        try {
            C47558bi s2 = C47831fm.m85024s(c + " startWork()");
            try {
                s = C47831fm.m85024s(String.valueOf(C46542ba.m82977c(this.f121657g)).concat(" startWork()"));
                C60870cx b = ((C46587u) this.f121656b.mo17428b()).mo21393b(this.f121657g);
                s.mo51417a(b);
                s.close();
                s2.mo51417a(b);
                s2.close();
                if (f != null) {
                    f.close();
                }
                return b;
            } catch (Throwable th) {
                s2.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th3) {
                    C46576j.m83035a(th2, th3);
                }
            }
            throw th2;
        }
    }
}
