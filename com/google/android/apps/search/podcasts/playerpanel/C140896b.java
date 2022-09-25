package com.google.android.apps.search.podcasts.playerpanel;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.b */
/* compiled from: PG */
public final class C140896b implements C47388b {

    /* renamed from: a */
    public final Runnable f382584a;

    public C140896b() {
        this.f382584a = null;
    }

    public C140896b(Runnable runnable) {
        this.f382584a = runnable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140896b) && C69664n.m101066l(this.f382584a, ((C140896b) obj).f382584a);
    }

    public final int hashCode() {
        Runnable runnable = this.f382584a;
        if (runnable == null) {
            return 0;
        }
        return runnable.hashCode();
    }

    public final String toString() {
        Runnable runnable = this.f382584a;
        return "CollapsePlayerEvent(onCollapseAction=" + runnable + ")";
    }
}
