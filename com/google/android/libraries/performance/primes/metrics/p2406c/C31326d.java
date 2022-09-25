package com.google.android.libraries.performance.primes.metrics.p2406c;

import android.content.Context;
import android.os.Process;
import com.google.android.libraries.performance.primes.p2399d.C31230a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import java.io.File;

/* renamed from: com.google.android.libraries.performance.primes.metrics.c.d */
/* compiled from: PG */
public final /* synthetic */ class C31326d implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C31331i f84343a;

    /* renamed from: b */
    public final /* synthetic */ Context f84344b;

    public /* synthetic */ C31326d(C31331i iVar, Context context) {
        this.f84343a = iVar;
        this.f84344b = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Object obj;
        C31331i iVar = this.f84343a;
        Context context = this.f84344b;
        synchronized (iVar) {
            String b = C31230a.m58230b(Process.myPid());
            String str = b + ".trace";
            File file = new File(context.getFilesDir(), "primes_profiling_" + b);
            if (file.exists() || file.mkdir()) {
                File file2 = new File(file, str);
                file2.deleteOnExit();
                C31331i.m58411c(file2);
                obj = C58833ax.m90834k(file2);
            } else {
                obj = C58836b.f156633a;
            }
        }
        return obj;
    }
}
