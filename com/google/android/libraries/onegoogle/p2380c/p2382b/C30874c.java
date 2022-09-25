package com.google.android.libraries.onegoogle.p2380c.p2382b;

import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.c.b.c */
/* compiled from: PG */
public final class C30874c extends C30870ac {

    /* renamed from: a */
    private final C28421h f83256a;

    /* renamed from: b */
    private final C30158c f83257b;

    /* renamed from: c */
    private final C30253a f83258c;

    /* renamed from: d */
    private final C30313v f83259d;

    /* renamed from: e */
    private final C58833ax f83260e;

    public C30874c(C28421h hVar, C30158c cVar, C30253a aVar, C30313v vVar, C58833ax axVar) {
        this.f83256a = hVar;
        this.f83257b = cVar;
        this.f83258c = aVar;
        this.f83259d = vVar;
        this.f83260e = axVar;
    }

    /* renamed from: a */
    public final C28421h mo36555a() {
        return this.f83256a;
    }

    /* renamed from: b */
    public final C30158c mo36556b() {
        return this.f83257b;
    }

    /* renamed from: c */
    public final C30253a mo36557c() {
        return this.f83258c;
    }

    /* renamed from: d */
    public final C30313v mo36558d() {
        return this.f83259d;
    }

    /* renamed from: e */
    public final C58833ax mo36559e() {
        return this.f83260e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f83258c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f83259d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.p2380c.p2382b.C30870ac
            r2 = 0
            if (r1 == 0) goto L_0x0064
            com.google.android.libraries.onegoogle.c.b.ac r5 = (com.google.android.libraries.onegoogle.p2380c.p2382b.C30870ac) r5
            com.google.android.libraries.logging.ve.f.h r1 = r4.f83256a
            if (r1 != 0) goto L_0x0016
            com.google.android.libraries.logging.ve.f.h r1 = r5.mo36555a()
            if (r1 != 0) goto L_0x0064
            goto L_0x0020
        L_0x0016:
            com.google.android.libraries.logging.ve.f.h r3 = r5.mo36555a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
        L_0x0020:
            com.google.android.libraries.onegoogle.account.a.c r1 = r4.f83257b
            com.google.android.libraries.onegoogle.account.a.c r3 = r5.mo36556b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            com.google.android.libraries.onegoogle.accountmanagement.a r1 = r4.f83258c
            if (r1 != 0) goto L_0x0037
            com.google.android.libraries.onegoogle.accountmanagement.a r1 = r5.mo36557c()
            if (r1 != 0) goto L_0x0064
            goto L_0x0041
        L_0x0037:
            com.google.android.libraries.onegoogle.accountmanagement.a r3 = r5.mo36557c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
        L_0x0041:
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.v r1 = r4.f83259d
            if (r1 != 0) goto L_0x004c
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.v r1 = r5.mo36558d()
            if (r1 != 0) goto L_0x0064
            goto L_0x0057
        L_0x004c:
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.v r3 = r5.mo36558d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            com.google.common.base.ax r1 = r4.f83260e
            com.google.common.base.ax r5 = r5.mo36559e()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0064
            return r0
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.p2380c.p2382b.C30874c.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f83256a);
        String obj = this.f83257b.toString();
        String valueOf2 = String.valueOf(this.f83258c);
        String valueOf3 = String.valueOf(this.f83259d);
        String obj2 = this.f83260e.toString();
        return "SimpleVeLogger{vePrimitives=" + valueOf + ", accountConverter=" + obj + ", accountsModel=" + valueOf2 + ", incognitoModel=" + valueOf3 + ", appIdentifier=" + obj2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        C28421h hVar = this.f83256a;
        int i3 = 0;
        if (hVar == null) {
            i = 0;
        } else {
            i = hVar.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f83257b.hashCode()) * 1000003;
        C30253a aVar = this.f83258c;
        if (aVar == null) {
            i2 = 0;
        } else {
            i2 = aVar.hashCode();
        }
        int i4 = (hashCode ^ i2) * 1000003;
        C30313v vVar = this.f83259d;
        if (vVar != null) {
            i3 = vVar.hashCode();
        }
        return ((i4 ^ i3) * 1000003) ^ this.f83260e.hashCode();
    }
}
