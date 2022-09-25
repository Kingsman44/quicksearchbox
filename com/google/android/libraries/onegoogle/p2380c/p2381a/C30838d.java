package com.google.android.libraries.onegoogle.p2380c.p2381a;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.onegoogle.c.a.d */
/* compiled from: PG */
public final class C30838d extends C30836b {

    /* renamed from: a */
    public boolean f83179a = true;

    /* renamed from: c */
    private final ScheduledExecutorService f83180c;

    public C30838d(Context context, ScheduledExecutorService scheduledExecutorService) {
        super(context, scheduledExecutorService);
        this.f83180c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo36532a(Runnable runnable) {
        if (this.f83179a) {
            this.f83180c.schedule(new C30837c(this, runnable), 5, TimeUnit.SECONDS);
        } else {
            runnable.run();
        }
    }
}
