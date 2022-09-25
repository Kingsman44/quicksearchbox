package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.ah */
/* compiled from: PG */
final class C146012ah implements Executor {

    /* renamed from: a */
    private final Handler f394699a = new C144861c(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f394699a.post(runnable);
    }
}
