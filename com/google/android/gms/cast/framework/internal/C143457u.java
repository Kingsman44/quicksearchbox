package com.google.android.gms.cast.framework.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.mediarouter.p175a.C3680ap;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.cast.framework.internal.u */
/* compiled from: PG */
public final class C143457u implements C3680ap {

    /* renamed from: a */
    public static final C143566ae f389001a = new C143566ae("MediaRouterOPTListener");

    /* renamed from: b */
    public final C143437ac f389002b;

    /* renamed from: c */
    public final Handler f389003c = new C144861c(Looper.getMainLooper());

    public C143457u(C143437ac acVar) {
        this.f389002b = acVar;
    }
}
