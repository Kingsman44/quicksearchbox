package com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d;

import com.google.assistant.p3897e.p3921j.p3926e.C51952fe;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.d.c */
/* compiled from: PG */
final class C33214c extends C33222k {

    /* renamed from: a */
    private final C33221j f88823a;

    /* renamed from: b */
    private final C51952fe f88824b;

    /* renamed from: c */
    private final C33218g f88825c;

    public C33214c(C33221j jVar, C51952fe feVar, C33218g gVar) {
        this.f88823a = jVar;
        this.f88824b = feVar;
        this.f88825c = gVar;
    }

    /* renamed from: a */
    public final C33218g mo38597a() {
        return this.f88825c;
    }

    /* renamed from: b */
    public final C33221j mo38598b() {
        return this.f88823a;
    }

    /* renamed from: c */
    public final C51952fe mo38599c() {
        return this.f88824b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f88825c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33222k
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.k r5 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33222k) r5
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r1 = r4.f88823a
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r3 = r5.mo38598b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.assistant.e.j.e.fe r1 = r4.f88824b
            com.google.assistant.e.j.e.fe r3 = r5.mo38599c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.g r1 = r4.f88825c
            if (r1 != 0) goto L_0x002e
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.g r5 = r5.mo38597a()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.g r5 = r5.mo38597a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33214c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f88823a.hashCode() ^ 1000003) * 1000003) ^ this.f88824b.hashCode()) * 1000003;
        C33218g gVar = this.f88825c;
        if (gVar == null) {
            i = 0;
        } else {
            i = gVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f88823a.toString();
        String num = Integer.toString(this.f88824b.f136314c);
        String valueOf = String.valueOf(this.f88825c);
        return "RenderingResult{renderingStatus=" + obj + ", renderingStrategy=" + num + ", formViewData=" + valueOf + "}";
    }
}
