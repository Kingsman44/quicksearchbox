package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C143824m;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: com.google.android.gms.common.api.w */
/* compiled from: PG */
public abstract class C143851w {

    /* renamed from: a */
    public static final Set f389948a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public Looper mo119158a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract ConnectionResult mo119129b();

    /* renamed from: c */
    public abstract ConnectionResult mo119130c(long j, TimeUnit timeUnit);

    /* renamed from: d */
    public C143824m mo119159d(C143824m mVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C143824m mo119160e(C143824m mVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public abstract void mo119131f();

    /* renamed from: g */
    public abstract void mo119132g();

    /* renamed from: h */
    public abstract boolean mo119133h();

    /* renamed from: i */
    public abstract boolean mo119134i();
}
