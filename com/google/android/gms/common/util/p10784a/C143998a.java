package com.google.android.gms.common.util.p10784a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.a.a */
/* compiled from: PG */
public final class C143998a implements Executor {

    /* renamed from: a */
    private final Handler f390237a;

    public C143998a(Looper looper) {
        this.f390237a = new C144861c(looper);
    }

    public final void execute(Runnable runnable) {
        this.f390237a.post(runnable);
    }
}
