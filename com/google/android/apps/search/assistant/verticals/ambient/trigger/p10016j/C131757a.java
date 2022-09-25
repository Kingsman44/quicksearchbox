package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10016j;

import android.net.Uri;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.Slice;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8228o.C106592b;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131691a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131692b;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131695e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.j.a */
/* compiled from: PG */
public final class C131757a implements C131692b, C4113l {

    /* renamed from: a */
    private final C4114m f359926a;

    /* renamed from: b */
    private final boolean f359927b;

    /* renamed from: c */
    private C131713d f359928c;

    /* renamed from: d */
    private Uri f359929d;

    public C131757a(C130603a aVar, C4114m mVar, boolean z) {
        aVar.mo109740b(this);
        this.f359926a = mVar;
        this.f359927b = z;
    }

    /* renamed from: h */
    private final void m214245h() {
        C131713d dVar;
        if (this.f359927b && (dVar = this.f359928c) != null) {
            C46459k.m82829b(((C131695e) dVar).f359802a.mo110276d(C131701c.m214153c(C106592b.f297191a)), "Error calling trigger listener.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo8625a(Slice slice) {
        m214245h();
    }

    /* renamed from: b */
    public final synchronized C60870cx mo110268b(C131713d dVar) {
        if (!this.f359927b) {
            return C60866ct.f164955a;
        }
        this.f359928c = dVar;
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final synchronized C60870cx mo110269c() {
        Uri uri = this.f359929d;
        if (uri != null) {
            this.f359926a.mo8630e(uri, this);
            this.f359929d = null;
        }
        this.f359928c = null;
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo110270d(C53715bm bmVar, long j) {
        return C131691a.m214140a();
    }

    /* renamed from: e */
    public final synchronized void mo110299e(Uri uri) {
        if (this.f359927b) {
            if (!mo110301g(uri)) {
                Uri uri2 = this.f359929d;
                if (uri2 != null) {
                    this.f359926a.mo8630e(uri2, this);
                }
                this.f359926a.mo8628c(uri, this);
                this.f359929d = uri;
                m214245h();
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo110300f() {
        Uri uri = this.f359929d;
        if (uri != null) {
            this.f359926a.mo8630e(uri, this);
            this.f359929d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo110301g(android.net.Uri r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.net.Uri r0 = r1.f359929d     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x000e:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0011:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.trigger.p10016j.C131757a.mo110301g(android.net.Uri):boolean");
    }
}
