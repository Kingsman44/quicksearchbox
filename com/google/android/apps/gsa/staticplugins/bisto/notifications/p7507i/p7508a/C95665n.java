package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import android.content.Context;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.n */
/* compiled from: PG */
public final class C95665n {

    /* renamed from: a */
    public static final long f267783a = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: b */
    public final Context f267784b;

    /* renamed from: c */
    public final C95646a f267785c;

    /* renamed from: d */
    public final C95662k f267786d;

    /* renamed from: e */
    public final C95293ae f267787e;

    /* renamed from: f */
    public final C22871g f267788f;

    /* renamed from: g */
    public final C95307m f267789g;

    /* renamed from: h */
    public final C21370a f267790h;

    /* renamed from: i */
    public final Set f267791i = new HashSet();

    /* renamed from: j */
    public Future f267792j;

    public C95665n(Context context, C95646a aVar, C95662k kVar, C95293ae aeVar, C22871g gVar, C95307m mVar, C21370a aVar2) {
        this.f267784b = context;
        this.f267785c = aVar;
        this.f267786d = kVar;
        this.f267787e = aeVar;
        this.f267788f = gVar;
        this.f267789g = mVar;
        this.f267790h = aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89632a() {
        C22872h.m42742b(C0826b.class);
        Future future = this.f267792j;
        if (future != null) {
            C58976aa aaVar = C58975e.f156826a;
            future.cancel(false);
            this.f267792j = null;
        }
    }
}
