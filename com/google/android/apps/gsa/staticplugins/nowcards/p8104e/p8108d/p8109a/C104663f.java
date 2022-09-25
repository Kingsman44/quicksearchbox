package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import androidx.core.p097i.C1970e;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.f */
/* compiled from: PG */
final class C104663f extends C104626dm {

    /* renamed from: a */
    private final C9270n f291480a;

    /* renamed from: b */
    private final C7718hj f291481b;

    /* renamed from: c */
    private final C1970e f291482c;

    /* renamed from: d */
    private final C7718hj f291483d;

    /* renamed from: e */
    private final int f291484e;

    public C104663f(C9270n nVar, C7718hj hjVar, C1970e eVar, C7718hj hjVar2, int i) {
        this.f291480a = nVar;
        this.f291481b = hjVar;
        this.f291482c = eVar;
        this.f291483d = hjVar2;
        this.f291484e = i;
    }

    /* renamed from: a */
    public final int mo94280a() {
        return this.f291484e;
    }

    /* renamed from: b */
    public final C1970e mo94281b() {
        return this.f291482c;
    }

    /* renamed from: c */
    public final C9270n mo94282c() {
        return this.f291480a;
    }

    /* renamed from: d */
    public final C7718hj mo94283d() {
        return this.f291483d;
    }

    /* renamed from: e */
    public final C7718hj mo94284e() {
        return this.f291481b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f291483d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f291482c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104626dm
            r2 = 0
            if (r1 == 0) goto L_0x0057
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.dm r5 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104626dm) r5
            com.google.android.apps.g.d.n r1 = r4.f291480a
            com.google.android.apps.g.d.n r3 = r5.mo94282c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0057
            com.google.ai.b.hj r1 = r4.f291481b
            com.google.ai.b.hj r3 = r5.mo94284e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0057
            androidx.core.i.e r1 = r4.f291482c
            if (r1 != 0) goto L_0x002e
            androidx.core.i.e r1 = r5.mo94281b()
            if (r1 != 0) goto L_0x0057
            goto L_0x0038
        L_0x002e:
            androidx.core.i.e r3 = r5.mo94281b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0057
        L_0x0038:
            com.google.ai.b.hj r1 = r4.f291483d
            if (r1 != 0) goto L_0x0043
            com.google.ai.b.hj r1 = r5.mo94283d()
            if (r1 != 0) goto L_0x0057
            goto L_0x004e
        L_0x0043:
            com.google.ai.b.hj r3 = r5.mo94283d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x004e
            goto L_0x0057
        L_0x004e:
            int r1 = r4.f291484e
            int r5 = r5.mo94280a()
            if (r1 != r5) goto L_0x0057
            return r0
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104663f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f291480a.hashCode() ^ 1000003) * 1000003) ^ this.f291481b.hashCode()) * 1000003;
        C1970e eVar = this.f291482c;
        int i2 = 0;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C7718hj hjVar = this.f291483d;
        if (hjVar != null) {
            i2 = hjVar.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.f291484e;
    }

    public final String toString() {
        String obj = this.f291480a.toString();
        String obj2 = this.f291481b.toString();
        String valueOf = String.valueOf(this.f291482c);
        String valueOf2 = String.valueOf(this.f291483d);
        int i = this.f291484e;
        return "EntriesAndMore{cardData=" + obj + ", loggingEntry=" + obj2 + ", groupEntryPair=" + valueOf + ", clusterEntry=" + valueOf2 + ", groupIndex=" + i + "}";
    }
}
