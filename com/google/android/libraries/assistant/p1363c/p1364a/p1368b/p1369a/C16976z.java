package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import android.app.PendingIntent;
import androidx.media3.common.C2646bh;
import androidx.media3.p174ui.C3649m;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.z */
/* compiled from: PG */
public final class C16976z implements C3649m {

    /* renamed from: a */
    public static final C59071e f49593a = C59071e.m91332i("com.google.android.libraries.assistant.c.a.b.a.z");

    /* renamed from: b */
    public final ExecutorService f49594b;

    /* renamed from: c */
    public PendingIntent f49595c = null;

    /* renamed from: d */
    private final C16947a f49596d;

    /* renamed from: e */
    private final Executor f49597e;

    public C16976z(C16947a aVar, ExecutorService executorService, Executor executor) {
        this.f49596d = aVar;
        this.f49594b = executorService;
        this.f49597e = executor;
    }

    /* renamed from: f */
    public static C16980d m34077f(C2646bh bhVar) {
        int V = bhVar.mo6254V();
        if (V == -1 || bhVar.mo6255W() == 0) {
            return null;
        }
        ((C59052c) ((C59052c) f49593a.mo56224b()).mo56372aa(42600)).mo56387q("accessing media metadata at location: %d", V);
        return C16973w.m34074a(bhVar.mo6257ab(V));
    }

    /* renamed from: a */
    public final PendingIntent mo7691a(C2646bh bhVar) {
        return this.f49595c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo7692b(androidx.media3.common.C2646bh r6, androidx.media3.p174ui.C3647k r7) {
        /*
            r5 = this;
            com.google.android.libraries.assistant.c.a.c.d r0 = m34077f(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0057
            com.google.android.libraries.assistant.c.a.c.f r2 = r0.f49604b
            if (r2 == 0) goto L_0x0057
            com.google.android.libraries.assistant.c.a.b.a.a r3 = r5.f49596d
            com.google.assistant.e.c.c.dc r2 = r2.f49613d
            if (r2 != 0) goto L_0x0013
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0013:
            int r2 = r2.f132815a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0045
            com.google.android.libraries.assistant.c.a.c.f r2 = r0.f49604b
            if (r2 != 0) goto L_0x001f
            com.google.android.libraries.assistant.c.a.c.f r2 = com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f.f49608e
        L_0x001f:
            com.google.assistant.e.c.c.dc r2 = r2.f49613d
            if (r2 != 0) goto L_0x0025
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0025:
            java.lang.String r2 = r2.f132817c
            boolean r4 = com.google.common.base.C58837ba.m90859h(r2)
            if (r4 == 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            com.google.apps.tiktok.media.e r3 = r3.f49524a
            com.bumptech.glide.ad r3 = r3.mo51286a()
            com.bumptech.glide.z r3 = r3.mo11864b()
            com.bumptech.glide.z r2 = r3.mo12448j(r2)
            com.google.common.util.concurrent.cx r2 = com.bumptech.glide.p282c.p283a.C5528f.m14299a(r2)
            com.google.common.util.concurrent.cx r2 = com.bumptech.glide.p282c.p283a.C5528f.m14300b(r2)
            goto L_0x0046
        L_0x0045:
            r2 = r1
        L_0x0046:
            if (r2 != 0) goto L_0x0049
            return r1
        L_0x0049:
            com.google.android.libraries.assistant.c.a.b.a.y r3 = new com.google.android.libraries.assistant.c.a.b.a.y
            r3.<init>(r5, r0, r6, r7)
            java.util.concurrent.Executor r6 = r5.f49597e
            com.google.common.util.concurrent.bz r7 = com.google.apps.tiktok.tracing.C47810es.m84974n(r3)
            com.google.common.util.concurrent.C60856cj.m92911t(r2, r7, r6)
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a.C16976z.mo7692b(androidx.media3.common.bh, androidx.media3.ui.k):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public final CharSequence mo7693c(C2646bh bhVar) {
        C16982f fVar;
        C16980d f = m34077f(bhVar);
        if (f == null || (fVar = f.f49604b) == null) {
            return null;
        }
        return fVar.f49611b;
    }

    /* renamed from: d */
    public final CharSequence mo7694d(C2646bh bhVar) {
        C16982f fVar;
        C16980d f = m34077f(bhVar);
        if (f == null || (fVar = f.f49604b) == null) {
            return null;
        }
        return fVar.f49610a;
    }

    /* renamed from: e */
    public final /* synthetic */ CharSequence mo7695e() {
        return null;
    }
}
