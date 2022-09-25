package com.google.android.libraries.p1638aw.p1639a.p1640a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.aw.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C19585d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C19589h f54513a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f54514b;

    public /* synthetic */ C19585d(C19589h hVar, C60870cx cxVar) {
        this.f54513a = hVar;
        this.f54514b = cxVar;
    }

    public final void run() {
        try {
            this.f54513a.f54521d.set((C19588g) C60856cj.m92909r(this.f54514b));
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
