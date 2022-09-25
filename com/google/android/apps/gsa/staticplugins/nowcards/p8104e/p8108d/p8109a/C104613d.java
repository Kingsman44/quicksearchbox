package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.sidekick.main.p7205h.p7209d.C91418a;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.d */
/* compiled from: PG */
final class C104613d extends C104605cs {

    /* renamed from: a */
    private final C23056g f291236a;

    /* renamed from: b */
    private final C7718hj f291237b;

    /* renamed from: c */
    private final boolean f291238c;

    /* renamed from: d */
    private final boolean f291239d;

    /* renamed from: e */
    private final boolean f291240e;

    /* renamed from: f */
    private final String f291241f;

    /* renamed from: g */
    private final C91418a f291242g;

    public C104613d(C23056g gVar, C7718hj hjVar, boolean z, boolean z2, boolean z3, String str, C91418a aVar) {
        if (gVar != null) {
            this.f291236a = gVar;
            if (hjVar != null) {
                this.f291237b = hjVar;
                this.f291238c = z;
                this.f291239d = z2;
                this.f291240e = z3;
                this.f291241f = str;
                this.f291242g = aVar;
                return;
            }
            throw new NullPointerException("Null entry");
        }
        throw new NullPointerException("Null featureController");
    }

    /* renamed from: a */
    public final C91418a mo94265a() {
        return this.f291242g;
    }

    /* renamed from: b */
    public final C23056g mo94266b() {
        return this.f291236a;
    }

    /* renamed from: c */
    public final C7718hj mo94267c() {
        return this.f291237b;
    }

    /* renamed from: d */
    public final String mo94268d() {
        return this.f291241f;
    }

    /* renamed from: e */
    public final boolean mo94269e() {
        return this.f291238c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1 = r4.f291241f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r1 = r4.f291242g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs
            r2 = 0
            if (r1 == 0) goto L_0x0067
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r5 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r5
            com.google.android.libraries.gsa.monet.service.g r1 = r4.f291236a
            com.google.android.libraries.gsa.monet.service.g r3 = r5.mo94266b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0067
            com.google.ai.b.hj r1 = r4.f291237b
            com.google.ai.b.hj r3 = r5.mo94267c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0067
            boolean r1 = r4.f291238c
            boolean r3 = r5.mo94269e()
            if (r1 != r3) goto L_0x0067
            boolean r1 = r4.f291239d
            boolean r3 = r5.mo94271g()
            if (r1 != r3) goto L_0x0067
            boolean r1 = r4.f291240e
            boolean r3 = r5.mo94270f()
            if (r1 != r3) goto L_0x0067
            java.lang.String r1 = r4.f291241f
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = r5.mo94268d()
            if (r1 != 0) goto L_0x0067
            goto L_0x0050
        L_0x0046:
            java.lang.String r3 = r5.mo94268d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0067
        L_0x0050:
            com.google.android.apps.gsa.sidekick.main.h.d.a r1 = r4.f291242g
            if (r1 != 0) goto L_0x005b
            com.google.android.apps.gsa.sidekick.main.h.d.a r5 = r5.mo94265a()
            if (r5 != 0) goto L_0x0067
            goto L_0x0066
        L_0x005b:
            com.google.android.apps.gsa.sidekick.main.h.d.a r5 = r5.mo94265a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            return r0
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104613d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo94270f() {
        return this.f291240e;
    }

    /* renamed from: g */
    public final boolean mo94271g() {
        return this.f291239d;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((((((this.f291236a.hashCode() ^ 1000003) * 1000003) ^ this.f291237b.hashCode()) * 1000003) ^ (true != this.f291238c ? 1237 : 1231)) * 1000003) ^ (true != this.f291239d ? 1237 : 1231)) * 1000003;
        if (true == this.f291240e) {
            i2 = 1231;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        String str = this.f291241f;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (i3 ^ i) * 1000003;
        C91418a aVar = this.f291242g;
        if (aVar != null) {
            i4 = aVar.hashCode();
        }
        return i5 ^ i4;
    }

    public final String toString() {
        String obj = this.f291236a.toString();
        String obj2 = this.f291237b.toString();
        boolean z = this.f291238c;
        boolean z2 = this.f291239d;
        boolean z3 = this.f291240e;
        String str = this.f291241f;
        String valueOf = String.valueOf(this.f291242g);
        return "DismissParams{featureController=" + obj + ", entry=" + obj2 + ", shouldRecord=" + z + ", showSnackbar=" + z2 + ", showActionButton=" + z3 + ", actionTakenMessage=" + str + ", snackbarCallback=" + valueOf + "}";
    }
}
