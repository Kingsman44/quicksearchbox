package com.google.android.libraries.lens.view.p2113h.p2115b.p2119d;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import androidx.media3.exoplayer.C2759ad;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26736ae;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26738ag;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26739ah;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26742ak;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26743al;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26763o;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26778ac;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.lens.view.h.b.d.i */
/* compiled from: PG */
public final class C26715i implements C26739ah, C26743al {

    /* renamed from: a */
    public static final C58974d f72830a = C58974d.m91135i("LensTelecamera");

    /* renamed from: b */
    public static final Size f72831b = new Size(1080, 1920);

    /* renamed from: c */
    public final AtomicBoolean f72832c = new AtomicBoolean(false);

    /* renamed from: d */
    public final Context f72833d;

    /* renamed from: e */
    public C26763o f72834e;

    /* renamed from: f */
    public C26714h f72835f;

    /* renamed from: g */
    public C26736ae f72836g;

    /* renamed from: h */
    public Surface f72837h;

    /* renamed from: i */
    public C2759ad f72838i;

    /* renamed from: j */
    public Long f72839j = null;

    /* renamed from: k */
    public long f72840k = 0;

    /* renamed from: l */
    public final Set f72841l = new HashSet();

    /* renamed from: m */
    public C26778ac f72842m;

    /* renamed from: n */
    public int f72843n;

    /* renamed from: o */
    private final Handler f72844o;

    public C26715i(Context context) {
        this.f72833d = context;
        this.f72844o = new Handler(context.getMainLooper());
        this.f72835f = new C26714h(context, Uri.fromFile(new File(context.getFilesDir(), "telelens.mp4")));
    }

    /* renamed from: a */
    public final void mo32025a(C26742ak akVar) {
        this.f72841l.add(akVar);
    }

    /* renamed from: b */
    public final void mo32026b() {
        Surface surface = this.f72837h;
        if (surface != null) {
            surface.release();
            this.f72837h = null;
        }
        C26736ae aeVar = this.f72836g;
        if (aeVar != null) {
            aeVar.release();
            this.f72836g = null;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo30427c(C27658e eVar) {
        C26738ag.m49429a(this, eVar);
    }

    /* renamed from: d */
    public final String mo31974d() {
        return "LensTelecamera";
    }

    /* renamed from: e */
    public final void mo32027e() {
        C26763o oVar;
        C26778ac acVar = this.f72842m;
        if (acVar != null && (oVar = this.f72834e) != null) {
            acVar.f72961a.mo32153v(oVar);
        }
    }

    /* renamed from: f */
    public final void mo32028f() {
        this.f72844o.post(new C26709c(this));
    }

    /* renamed from: g */
    public final void mo32029g(C26742ak akVar) {
        this.f72841l.remove(akVar);
    }

    /* renamed from: h */
    public final void mo32030h() {
        this.f72844o.post(new C26712f(this));
    }

    /* renamed from: i */
    public final void mo31979i(boolean z) {
    }

    /* renamed from: j */
    public final void mo31980j(float f) {
    }

    /* renamed from: k */
    public final void mo32031k(Uri uri) {
        this.f72843n = 1;
        m49377p();
        this.f72835f = new C26714h(this.f72833d, uri);
        m49377p();
    }

    /* renamed from: l */
    public final void mo31982l(C26778ac acVar) {
        this.f72842m = acVar;
        mo32027e();
        m49377p();
    }

    /* renamed from: m */
    public final /* synthetic */ void mo31983m() {
    }

    /* renamed from: n */
    public final void mo31984n(PointF pointF) {
    }

    /* renamed from: o */
    public final void mo31985o(int i) {
        this.f72843n = i;
        m49377p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m49377p() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.libraries.lens.view.h.b.d.h r0 = r3.f72835f     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0023
            int r0 = r3.f72843n     // Catch:{ all -> 0x0039 }
            r1 = 1
            if (r0 != r1) goto L_0x0023
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f72832c     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            android.os.Handler r0 = r3.f72844o     // Catch:{ all -> 0x0039 }
            com.google.android.libraries.lens.view.h.b.d.a r2 = new com.google.android.libraries.lens.view.h.b.d.a     // Catch:{ all -> 0x0039 }
            r2.<init>(r3)     // Catch:{ all -> 0x0039 }
            r0.post(r2)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f72832c     // Catch:{ all -> 0x0039 }
            r0.set(r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f72832c     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.os.Handler r0 = r3.f72844o     // Catch:{ all -> 0x0039 }
            com.google.android.libraries.lens.view.h.b.d.b r1 = new com.google.android.libraries.lens.view.h.b.d.b     // Catch:{ all -> 0x0039 }
            r1.<init>(r3)     // Catch:{ all -> 0x0039 }
            r0.post(r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x0037:
            monitor-exit(r3)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2115b.p2119d.C26715i.m49377p():void");
    }
}
