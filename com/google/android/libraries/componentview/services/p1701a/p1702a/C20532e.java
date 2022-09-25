package com.google.android.libraries.componentview.services.p1701a.p1702a;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5751ac;
import com.google.android.libraries.componentview.services.application.C20579bf;
import com.google.android.libraries.componentview.services.application.C20601ca;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.services.a.a.e */
/* compiled from: PG */
public final class C20532e implements C5955n {

    /* renamed from: b */
    public final String f57679b;

    /* renamed from: c */
    public final C5750ab f57680c;

    /* renamed from: d */
    public final C20579bf f57681d;

    /* renamed from: e */
    public final ExecutorService f57682e;

    /* renamed from: f */
    public final C20601ca f57683f;

    public C20532e(String str, C20579bf bfVar, ExecutorService executorService, C20601ca caVar) {
        this.f57679b = str;
        this.f57680c = new C5750ab(str, C5751ac.f17327a);
        this.f57681d = bfVar;
        this.f57682e = executorService;
        this.f57683f = caVar;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(this.f57680c.mo12252e());
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20532e)) {
            return false;
        }
        return this.f57680c.equals(((C20532e) obj).f57680c);
    }

    public final int hashCode() {
        return this.f57680c.hashCode();
    }

    public final String toString() {
        return this.f57680c.mo12249b();
    }
}
