package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.p7074a.C90179d;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.a */
/* compiled from: PG */
final class C99992a extends C100002aj {

    /* renamed from: a */
    private final C90179d f279657a;

    /* renamed from: b */
    private final C100001ai f279658b;

    /* renamed from: c */
    private final C23251a f279659c;

    public C99992a(C90179d dVar, C23251a aVar, C100001ai aiVar) {
        if (dVar != null) {
            this.f279657a = dVar;
            if (aVar != null) {
                this.f279659c = aVar;
                this.f279658b = aiVar;
                return;
            }
            throw new NullPointerException("Null observedField");
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final C90179d mo91690a() {
        return this.f279657a;
    }

    /* renamed from: b */
    public final C100001ai mo91691b() {
        return this.f279658b;
    }

    /* renamed from: c */
    public final C23251a mo91692c() {
        return this.f279659c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f279658b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100002aj
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.apps.gsa.staticplugins.dr.b.aj r5 = (com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100002aj) r5
            com.google.android.apps.gsa.shared.monet.b.ab.a.d r1 = r4.f279657a
            com.google.android.apps.gsa.shared.monet.b.ab.a.d r3 = r5.mo91690a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r1 = r4.f279659c
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r3 = r5.mo91692c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.android.apps.gsa.staticplugins.dr.b.ai r1 = r4.f279658b
            if (r1 != 0) goto L_0x002e
            com.google.android.apps.gsa.staticplugins.dr.b.ai r5 = r5.mo91691b()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            com.google.android.apps.gsa.staticplugins.dr.b.ai r5 = r5.mo91691b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C99992a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f279657a.hashCode() ^ 1000003) * 1000003) ^ this.f279659c.hashCode()) * 1000003;
        C100001ai aiVar = this.f279658b;
        if (aiVar == null) {
            i = 0;
        } else {
            i = aiVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String num = Integer.toString(this.f279657a.f251947i);
        String obj = this.f279659c.toString();
        String valueOf = String.valueOf(this.f279658b);
        return "SwitchableFeature{type=" + num + ", observedField=" + obj + ", listener=" + valueOf + "}";
    }
}
