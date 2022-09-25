package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.h */
/* compiled from: PG */
public final class C126331h extends C126293ab {

    /* renamed from: a */
    private final C63122a f348011a;

    /* renamed from: b */
    private final C125422z f348012b;

    public C126331h(C63122a aVar, C125422z zVar) {
        if (aVar != null) {
            this.f348011a = aVar;
            this.f348012b = zVar;
            return;
        }
        throw new NullPointerException("Null startStatus");
    }

    /* renamed from: a */
    public final C63122a mo107515a() {
        return this.f348011a;
    }

    /* renamed from: b */
    public final C125422z mo107516b() {
        return this.f348012b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f348012b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126293ab
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.ab r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126293ab) r5
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r1 = r4.f348011a
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r3 = r5.mo107515a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.z r1 = r4.f348012b
            if (r1 != 0) goto L_0x0022
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.z r5 = r5.mo107516b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.z r5 = r5.mo107516b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126331h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f348011a.hashCode() ^ 1000003) * 1000003;
        C125422z zVar = this.f348012b;
        if (zVar == null) {
            i = 0;
        } else {
            i = zVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String num = Integer.toString(this.f348011a.getNumber());
        String valueOf = String.valueOf(this.f348012b);
        return "DictationStartResult{startStatus=" + num + ", getController=" + valueOf + "}";
    }
}
