package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.b */
/* compiled from: PG */
final class C91926b extends C91935k {

    /* renamed from: a */
    private final C7718hj f256373a;

    /* renamed from: b */
    private final C9141ad f256374b;

    /* renamed from: c */
    private final C7681g f256375c;

    /* renamed from: d */
    private final boolean f256376d;

    /* renamed from: e */
    private final C7526an f256377e;

    /* renamed from: f */
    private final C9277u f256378f;

    /* renamed from: g */
    private final C91647a f256379g;

    /* renamed from: h */
    private final C91667f f256380h;

    /* renamed from: i */
    private final C91857e f256381i;

    public C91926b(C7718hj hjVar, C9141ad adVar, C7681g gVar, boolean z, C7526an anVar, C9277u uVar, C91647a aVar, C91667f fVar, C91857e eVar) {
        this.f256373a = hjVar;
        this.f256374b = adVar;
        this.f256375c = gVar;
        this.f256376d = z;
        this.f256377e = anVar;
        this.f256378f = uVar;
        this.f256379g = aVar;
        this.f256380h = fVar;
        this.f256381i = eVar;
    }

    /* renamed from: a */
    public final C91647a mo86618a() {
        return this.f256379g;
    }

    /* renamed from: b */
    public final C91667f mo86619b() {
        return this.f256380h;
    }

    /* renamed from: c */
    public final C91857e mo86620c() {
        return this.f256381i;
    }

    /* renamed from: d */
    public final C9277u mo86621d() {
        return this.f256378f;
    }

    /* renamed from: e */
    public final C9141ad mo86622e() {
        return this.f256374b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r1 = r4.f256377e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r1 = r4.f256378f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r1 = r4.f256380h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r1 = r4.f256381i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f256374b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.sidekick.shared.p7256ui.C91935k
            r2 = 0
            if (r1 == 0) goto L_0x00a2
            com.google.android.apps.gsa.sidekick.shared.ui.k r5 = (com.google.android.apps.gsa.sidekick.shared.p7256ui.C91935k) r5
            com.google.ai.b.hj r1 = r4.f256373a
            com.google.ai.b.hj r3 = r5.mo86626h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
            com.google.android.apps.g.d.ad r1 = r4.f256374b
            if (r1 != 0) goto L_0x0022
            com.google.android.apps.g.d.ad r1 = r5.mo86622e()
            if (r1 != 0) goto L_0x00a2
            goto L_0x002c
        L_0x0022:
            com.google.android.apps.g.d.ad r3 = r5.mo86622e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x002c:
            com.google.ai.b.g r1 = r4.f256375c
            com.google.ai.b.g r3 = r5.mo86624f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
            boolean r1 = r4.f256376d
            boolean r3 = r5.mo86628i()
            if (r1 != r3) goto L_0x00a2
            com.google.ai.b.an r1 = r4.f256377e
            if (r1 != 0) goto L_0x004b
            com.google.ai.b.an r1 = r5.mo86625g()
            if (r1 != 0) goto L_0x00a2
            goto L_0x0055
        L_0x004b:
            com.google.ai.b.an r3 = r5.mo86625g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x0055:
            com.google.android.apps.g.d.u r1 = r4.f256378f
            if (r1 != 0) goto L_0x0060
            com.google.android.apps.g.d.u r1 = r5.mo86621d()
            if (r1 != 0) goto L_0x00a2
            goto L_0x006a
        L_0x0060:
            com.google.android.apps.g.d.u r3 = r5.mo86621d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x006a:
            com.google.android.apps.gsa.sidekick.shared.b.a r1 = r4.f256379g
            com.google.android.apps.gsa.sidekick.shared.b.a r3 = r5.mo86618a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
            com.google.android.apps.gsa.sidekick.shared.cards.a.f r1 = r4.f256380h
            if (r1 != 0) goto L_0x0081
            com.google.android.apps.gsa.sidekick.shared.cards.a.f r1 = r5.mo86619b()
            if (r1 != 0) goto L_0x00a2
            goto L_0x008b
        L_0x0081:
            com.google.android.apps.gsa.sidekick.shared.cards.a.f r3 = r5.mo86619b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a2
        L_0x008b:
            com.google.android.apps.gsa.sidekick.shared.monet.util.e r1 = r4.f256381i
            if (r1 != 0) goto L_0x0096
            com.google.android.apps.gsa.sidekick.shared.monet.util.e r5 = r5.mo86620c()
            if (r5 != 0) goto L_0x00a2
            goto L_0x00a1
        L_0x0096:
            com.google.android.apps.gsa.sidekick.shared.monet.util.e r5 = r5.mo86620c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            return r0
        L_0x00a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.p7256ui.C91926b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C7681g mo86624f() {
        return this.f256375c;
    }

    /* renamed from: g */
    public final C7526an mo86625g() {
        return this.f256377e;
    }

    /* renamed from: h */
    public final C7718hj mo86626h() {
        return this.f256373a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.f256373a.hashCode() ^ 1000003) * 1000003;
        C9141ad adVar = this.f256374b;
        int i5 = 0;
        if (adVar == null) {
            i = 0;
        } else {
            i = adVar.hashCode();
        }
        int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.f256375c.hashCode()) * 1000003) ^ (true != this.f256376d ? 1237 : 1231)) * 1000003;
        C7526an anVar = this.f256377e;
        if (anVar == null) {
            i2 = 0;
        } else {
            i2 = anVar.hashCode();
        }
        int i6 = (hashCode2 ^ i2) * 1000003;
        C9277u uVar = this.f256378f;
        if (uVar == null) {
            i3 = 0;
        } else {
            i3 = uVar.hashCode();
        }
        int hashCode3 = (((i6 ^ i3) * 1000003) ^ this.f256379g.hashCode()) * 1000003;
        C91667f fVar = this.f256380h;
        if (fVar == null) {
            i4 = 0;
        } else {
            i4 = fVar.hashCode();
        }
        int i7 = (hashCode3 ^ i4) * 1000003;
        C91857e eVar = this.f256381i;
        if (eVar != null) {
            i5 = eVar.hashCode();
        }
        return i7 ^ i5;
    }

    /* renamed from: i */
    public final boolean mo86628i() {
        return this.f256376d;
    }

    public final String toString() {
        String obj = this.f256373a.toString();
        String valueOf = String.valueOf(this.f256374b);
        String num = Integer.toString(this.f256375c.f26835cv);
        boolean z = this.f256376d;
        String valueOf2 = String.valueOf(this.f256377e);
        String valueOf3 = String.valueOf(this.f256378f);
        String obj2 = this.f256379g.toString();
        String valueOf4 = String.valueOf(this.f256380h);
        String valueOf5 = String.valueOf(this.f256381i);
        return "EntryClickListenerParameters{entry=" + obj + ", clientAction=" + valueOf + ", actionType=" + num + ", logAction=" + z + ", clickAction=" + valueOf2 + ", moduleType=" + valueOf3 + ", actionLogger=" + obj2 + ", adapter=" + valueOf4 + ", monetEventDispatcher=" + valueOf5 + "}";
    }
}
