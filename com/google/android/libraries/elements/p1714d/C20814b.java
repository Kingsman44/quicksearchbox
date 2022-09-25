package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.p1727f.C21166o;
import com.youtube.p5283a.p5284a.C68039ab;

/* renamed from: com.google.android.libraries.elements.d.b */
/* compiled from: PG */
final class C20814b extends C20920dp {

    /* renamed from: a */
    private final C68039ab f58287a;

    /* renamed from: b */
    private final C21166o f58288b;

    public C20814b(C68039ab abVar, C21166o oVar) {
        if (abVar != null) {
            this.f58287a = abVar;
            this.f58288b = oVar;
            return;
        }
        throw new NullPointerException("Null element");
    }

    /* renamed from: a */
    public final C21166o mo25903a() {
        return this.f58288b;
    }

    /* renamed from: b */
    public final C68039ab mo25904b() {
        return this.f58287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f58288b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.elements.p1714d.C20920dp
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.libraries.elements.d.dp r5 = (com.google.android.libraries.elements.p1714d.C20920dp) r5
            com.youtube.a.a.ab r1 = r4.f58287a
            com.youtube.a.a.ab r3 = r5.mo25904b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.android.libraries.elements.f.o r1 = r4.f58288b
            if (r1 != 0) goto L_0x0022
            com.google.android.libraries.elements.f.o r5 = r5.mo25903a()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.libraries.elements.f.o r5 = r5.mo25903a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20814b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f58287a.hashCode() ^ 1000003) * 1000003;
        C21166o oVar = this.f58288b;
        if (oVar == null) {
            i = 0;
        } else {
            i = oVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f58287a.toString();
        String valueOf = String.valueOf(this.f58288b);
        return "ResolvedElement{element=" + obj + ", debuggerInfo=" + valueOf + "}";
    }
}
