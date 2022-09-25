package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.p10784a.C143998a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.ce */
/* compiled from: PG */
public final class C143784ce {

    /* renamed from: a */
    public volatile Object f389805a;

    /* renamed from: b */
    public volatile C143782cc f389806b;

    /* renamed from: c */
    private final Executor f389807c;

    public C143784ce(Looper looper, Object obj, String str) {
        this.f389807c = new C143998a(looper);
        C143919bh.m233971n(obj, "Listener must not be null");
        this.f389805a = obj;
        C143919bh.m233969l(str);
        this.f389806b = new C143782cc(obj, str);
    }

    /* renamed from: a */
    public final void mo119235a(C143783cd cdVar) {
        C143919bh.m233971n(cdVar, "Notifier must not be null");
        this.f389807c.execute(new C143781cb(this, cdVar));
    }

    /* renamed from: b */
    public final boolean mo119236b() {
        return this.f389805a != null;
    }

    public C143784ce(Executor executor, Object obj, String str) {
        C143919bh.m233971n(executor, "Executor must not be null");
        this.f389807c = executor;
        this.f389805a = obj;
        C143919bh.m233969l(str);
        this.f389806b = new C143782cc(obj, str);
    }
}
