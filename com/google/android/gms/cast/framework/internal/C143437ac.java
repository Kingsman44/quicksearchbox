package com.google.android.gms.cast.framework.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.p104d.p105a.C2164c;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.C143410ar;
import com.google.android.gms.cast.framework.C143415aw;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.internal.ac */
/* compiled from: PG */
public final class C143437ac {

    /* renamed from: a */
    public static final C143566ae f388967a = new C143566ae("SessionTransController");

    /* renamed from: b */
    public final Set f388968b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public final Handler f388969c = new C144861c(Looper.getMainLooper());

    /* renamed from: d */
    public final Runnable f388970d = new C143462z(this);

    /* renamed from: e */
    public int f388971e = 0;

    /* renamed from: f */
    public C143410ar f388972f;

    /* renamed from: g */
    public C2164c f388973g;

    /* renamed from: h */
    public SessionState f388974h;

    /* renamed from: a */
    public final void mo118640a() {
        if (this.f388972f == null) {
            f388967a.mo118884b("skip detaching as sessionManager is null", new Object[0]);
            return;
        }
        f388967a.mo118884b("detach from CastSession", new Object[0]);
        C143466m a = this.f388972f.mo118621a();
        if (a != null) {
            a.mo118721d((C143437ac) null);
        }
    }

    /* renamed from: b */
    public final void mo118641b(int i) {
        C2164c cVar = this.f388973g;
        if (cVar != null) {
            cVar.mo5438c();
        }
        f388967a.mo118884b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.f388971e), Integer.valueOf(i));
        for (C143415aw a : new HashSet(this.f388968b)) {
            a.mo118548a(this.f388971e, i);
        }
        mo118642c();
    }

    /* renamed from: c */
    public final void mo118642c() {
        Handler handler = this.f388969c;
        Runnable runnable = this.f388970d;
        C143919bh.m233958a(runnable);
        handler.removeCallbacks(runnable);
        this.f388971e = 0;
        this.f388974h = null;
        mo118640a();
    }
}
