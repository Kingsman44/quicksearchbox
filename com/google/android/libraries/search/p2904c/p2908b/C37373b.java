package com.google.android.libraries.search.p2904c.p2908b;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.protobuf.C62934bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.b.b */
/* compiled from: PG */
public final class C37373b {
    /* renamed from: a */
    public static final C37386j m66389a(C37500dg dgVar, C37360ay ayVar) {
        C69664n.m101061g(dgVar, "<this>");
        C69664n.m101061g(ayVar, "audioLibInputParams");
        C37385i iVar = (C37385i) C37386j.f99302d.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C37380d a = C69664n.m101061g(iVar, "builder");
        C37387k kVar = (C37387k) C37388l.f99307e.createBuilder();
        C69664n.m101060f(kVar, "newBuilder()");
        C37392p a2 = C69664n.m101061g(kVar, "builder");
        a2.mo40923b(ayVar);
        a2.mo40924c(dgVar);
        a.mo40918c(a2.mo40922a());
        return a.mo40916a();
    }

    /* renamed from: b */
    public static final C37386j m66390b(C37500dg dgVar, C37410bo boVar) {
        C39226b bVar;
        C69664n.m101061g(dgVar, "<this>");
        C69664n.m101061g(boVar, "audioRequestMicInputParams");
        C37360ay ayVar = boVar.f99337f;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        C69664n.m101060f(ayVar, "audioRequestMicInputParams.audioLibInputParams");
        C62934bn builder = m66389a(dgVar, ayVar).toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C37380d a = C69664n.m101061g((C37385i) builder, "builder");
        if (boVar.f99335d == 14) {
            bVar = C39226b.m68655a(((Integer) boVar.f99336e).intValue());
            if (bVar == null) {
                bVar = C39226b.TAG_DO_NOT_USE;
            }
        } else {
            bVar = C39226b.TAG_DO_NOT_USE;
        }
        C69664n.m101060f(bVar, "audioRequestMicInputParams.attributionId");
        a.mo40917b(bVar);
        return a.mo40916a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0045, code lost:
        if (r4 == null) goto L_0x0047;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.libraries.search.p2904c.p2908b.C37386j m66391c(com.google.common.base.C58833ax r4, com.google.android.libraries.search.p2904c.C37360ay r5) {
        /*
            java.lang.String r0 = "audioLibInputParams"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            com.google.android.libraries.search.c.b.j r0 = com.google.android.libraries.search.p2904c.p2908b.C37386j.f99302d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.c.b.i r0 = (com.google.android.libraries.search.p2904c.p2908b.C37385i) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.libraries.search.c.b.d r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            java.lang.Object r4 = r4.mo56111f()
            com.google.android.libraries.search.c.hs r4 = (com.google.android.libraries.search.p2904c.C37672hs) r4
            if (r4 == 0) goto L_0x0047
            com.google.android.libraries.search.c.b.l r2 = com.google.android.libraries.search.p2904c.p2908b.C37388l.f99307e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.c.b.k r2 = (com.google.android.libraries.search.p2904c.p2908b.C37387k) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)
            com.google.android.libraries.search.c.b.p r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.libraries.search.c.b.k r3 = r2.f99318a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.android.libraries.search.c.b.l r3 = (com.google.android.libraries.search.p2904c.p2908b.C37388l) r3
            r3.f99310b = r4
            int r4 = r3.f99309a
            r4 = r4 | 1
            r3.f99309a = r4
            r2.mo40923b(r5)
            com.google.android.libraries.search.c.b.l r4 = r2.mo40922a()
            if (r4 != 0) goto L_0x005d
        L_0x0047:
            com.google.android.libraries.search.c.b.l r4 = com.google.android.libraries.search.p2904c.p2908b.C37388l.f99307e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.c.b.k r4 = (com.google.android.libraries.search.p2904c.p2908b.C37387k) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)
            com.google.android.libraries.search.c.b.p r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            r4.mo40923b(r5)
            com.google.android.libraries.search.c.b.l r4 = r4.mo40922a()
        L_0x005d:
            r0.mo40918c(r4)
            com.google.android.libraries.search.c.b.j r4 = r0.mo40916a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2908b.C37373b.m66391c(com.google.common.base.ax, com.google.android.libraries.search.c.ay):com.google.android.libraries.search.c.b.j");
    }

    /* renamed from: d */
    public static final String m66392d(C37384h hVar) {
        C69664n.m101061g(hVar, "<this>");
        return "audio_adapter:".concat(String.valueOf(hVar.name()));
    }
}
