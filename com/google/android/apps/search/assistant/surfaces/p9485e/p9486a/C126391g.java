package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.g */
/* compiled from: PG */
public final class C126391g implements Closeable {

    /* renamed from: a */
    private final C37325aa f348123a;

    /* renamed from: b */
    private final AtomicBoolean f348124b = new AtomicBoolean(false);

    public C126391g(C37325aa aaVar) {
        C69664n.m101061g(aaVar, "session");
        this.f348123a = aaVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107582a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126390f
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.e.a.f r0 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126390f) r0
            int r1 = r0.f348122d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f348122d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.e.a.f r0 = new com.google.android.apps.search.assistant.surfaces.e.a.f
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f348120b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f348122d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f348119a
            p5462h.C69714l.m101134b(r5)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.c.aa r5 = r4.f348123a
            com.google.android.libraries.search.c.d.a.j r5 = (com.google.android.libraries.search.p2904c.p2913d.p2914a.C37488j) r5
            com.google.common.util.concurrent.cx r5 = r5.f99525e
            java.lang.String r2 = "session.releaseAudioFocusStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f348119a = r4
            r0.f348122d = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x008d
            r0 = r4
        L_0x004a:
            com.google.android.libraries.search.c.am r5 = (com.google.android.libraries.search.p2904c.C37348am) r5
            if (r5 == 0) goto L_0x0085
            int r1 = r5.f99208b
            com.google.android.libraries.search.c.ai r1 = com.google.android.libraries.search.p2904c.C37344ai.m66353a(r1)
            if (r1 != 0) goto L_0x0058
            com.google.android.libraries.search.c.ai r1 = com.google.android.libraries.search.p2904c.C37344ai.UNKNOWN_RELEASING_STATUS
        L_0x0058:
            com.google.android.libraries.search.c.ai r2 = com.google.android.libraries.search.p2904c.C37344ai.RELEASED
            if (r1 != r2) goto L_0x006d
            com.google.android.apps.search.assistant.surfaces.e.a.g r0 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126391g) r0
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f348124b
            r0 = 0
            boolean r5 = r5.compareAndSet(r0, r3)
            if (r5 != 0) goto L_0x006a
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x006a:
            com.google.android.apps.search.assistant.surfaces.e.a.c r5 = com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126387c.f348116a
            throw r5
        L_0x006d:
            com.google.android.apps.search.assistant.surfaces.e.a.d r0 = new com.google.android.apps.search.assistant.surfaces.e.a.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Focus Release Failed: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r5.toString()
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r5, r1)
            throw r0
        L_0x0085:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "ReleaseAudioFocusStatus was null"
            r5.<init>(r0)
            throw r5
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126391g.mo107582a(h.c.g):java.lang.Object");
    }

    public final void close() {
        C59052c cVar = (C59052c) C126394j.f348130a.mo56224b();
        cVar.mo56379ah(new C59094n(38888));
        cVar.mo56386p("Session#close");
        if (this.f348124b.compareAndSet(false, true)) {
            this.f348123a.mo40883b();
        }
    }
}
