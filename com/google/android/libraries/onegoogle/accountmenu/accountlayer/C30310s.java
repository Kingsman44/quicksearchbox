package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.s */
/* compiled from: PG */
final class C30310s extends C30305n {

    /* renamed from: a */
    public final C30306o f81957a;

    /* renamed from: b */
    public final C30158c f81958b;

    /* renamed from: c */
    public final C30294c f81959c;

    /* renamed from: d */
    public final C30518b f81960d;

    /* renamed from: e */
    public final C30830g f81961e;

    /* renamed from: f */
    public final C30860b f81962f;

    /* renamed from: g */
    public final C30474o f81963g;

    /* renamed from: h */
    public final C58833ax f81964h;

    /* renamed from: i */
    public final C30213m f81965i;

    /* renamed from: j */
    public final C30213m f81966j;

    /* renamed from: k */
    public final Class f81967k;

    /* renamed from: l */
    public final ExecutorService f81968l;

    /* renamed from: m */
    public final C28421h f81969m;

    /* renamed from: n */
    public final C30897z f81970n;

    /* renamed from: o */
    public final C30847m f81971o;

    /* renamed from: p */
    public final C58833ax f81972p;

    public C30310s(C30306o oVar, C30158c cVar, C30294c cVar2, C30518b bVar, C30830g gVar, C30860b bVar2, C30474o oVar2, C58833ax axVar, C30213m mVar, C30213m mVar2, Class cls, ExecutorService executorService, C28421h hVar, C30897z zVar, C30847m mVar3, C58833ax axVar2) {
        this.f81957a = oVar;
        this.f81958b = cVar;
        this.f81959c = cVar2;
        this.f81960d = bVar;
        this.f81961e = gVar;
        this.f81962f = bVar2;
        this.f81963g = oVar2;
        this.f81964h = axVar;
        this.f81965i = mVar;
        this.f81966j = mVar2;
        this.f81967k = cls;
        this.f81968l = executorService;
        this.f81969m = hVar;
        this.f81970n = zVar;
        this.f81971o = mVar3;
        this.f81972p = axVar2;
    }

    /* renamed from: a */
    public final C28421h mo35851a() {
        return this.f81969m;
    }

    /* renamed from: b */
    public final C30158c mo35852b() {
        return this.f81958b;
    }

    /* renamed from: c */
    public final C30213m mo35853c() {
        return this.f81966j;
    }

    /* renamed from: d */
    public final C30213m mo35854d() {
        return this.f81965i;
    }

    /* renamed from: e */
    public final C30294c mo35855e() {
        return this.f81959c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r1 = r4.f81961e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r1 = r4.f81965i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r1 = r4.f81971o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n
            r2 = 0
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r5 = (com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n) r5
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.o r1 = r4.f81957a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.o r3 = r5.mo35858i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.account.a.c r1 = r4.f81958b
            com.google.android.libraries.onegoogle.account.a.c r3 = r5.mo35852b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.c r1 = r4.f81959c
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.c r3 = r5.mo35855e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.accountmenu.features.b r1 = r4.f81960d
            com.google.android.libraries.onegoogle.accountmenu.features.b r3 = r5.mo35860k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.b.g r1 = r4.f81961e
            if (r1 != 0) goto L_0x0046
            com.google.android.libraries.onegoogle.b.g r1 = r5.mo35861l()
            if (r1 != 0) goto L_0x00e8
            goto L_0x0050
        L_0x0046:
            com.google.android.libraries.onegoogle.b.g r3 = r5.mo35861l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
        L_0x0050:
            com.google.android.libraries.onegoogle.c.b r1 = r4.f81962f
            com.google.android.libraries.onegoogle.c.b r3 = r5.mo35862m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.accountmenu.d.o r1 = r4.f81963g
            com.google.android.libraries.onegoogle.accountmenu.d.o r3 = r5.mo35859j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.common.base.ax r1 = r4.f81964h
            com.google.common.base.ax r3 = r5.mo35866q()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.account.disc.m r1 = r4.f81965i
            if (r1 != 0) goto L_0x007f
            com.google.android.libraries.onegoogle.account.disc.m r1 = r5.mo35854d()
            if (r1 != 0) goto L_0x00e8
            goto L_0x0089
        L_0x007f:
            com.google.android.libraries.onegoogle.account.disc.m r3 = r5.mo35854d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
        L_0x0089:
            com.google.android.libraries.onegoogle.account.disc.m r1 = r4.f81966j
            com.google.android.libraries.onegoogle.account.disc.m r3 = r5.mo35853c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            java.lang.Class r1 = r4.f81967k
            java.lang.Class r3 = r5.mo35867r()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            java.util.concurrent.ExecutorService r1 = r4.f81968l
            java.util.concurrent.ExecutorService r3 = r5.mo35868s()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.logging.ve.f.h r1 = r4.f81969m
            com.google.android.libraries.logging.ve.f.h r3 = r5.mo35851a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.c.b.z r1 = r4.f81970n
            com.google.android.libraries.onegoogle.c.b.z r3 = r5.mo35864o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.onegoogle.c.a.m r1 = r4.f81971o
            if (r1 != 0) goto L_0x00d0
            com.google.android.libraries.onegoogle.c.a.m r1 = r5.mo35863n()
            if (r1 != 0) goto L_0x00e8
            goto L_0x00db
        L_0x00d0:
            com.google.android.libraries.onegoogle.c.a.m r3 = r5.mo35863n()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00db
            goto L_0x00e8
        L_0x00db:
            com.google.common.base.ax r1 = r4.f81972p
            com.google.common.base.ax r5 = r5.mo35865p()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00e8
            return r0
        L_0x00e8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30310s.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public final C30304m mo35857h() {
        return new C30309r(this);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((((this.f81957a.hashCode() ^ 1000003) * 1000003) ^ this.f81958b.hashCode()) * 1000003) ^ this.f81959c.hashCode()) * 1000003) ^ this.f81960d.hashCode()) * 1000003;
        C30830g gVar = this.f81961e;
        int i3 = 0;
        if (gVar == null) {
            i = 0;
        } else {
            i = gVar.hashCode();
        }
        int hashCode2 = (((((((hashCode ^ i) * 1000003) ^ this.f81962f.hashCode()) * 1000003) ^ this.f81963g.hashCode()) * 1000003) ^ this.f81964h.hashCode()) * 1000003;
        C30213m mVar = this.f81965i;
        if (mVar == null) {
            i2 = 0;
        } else {
            i2 = mVar.hashCode();
        }
        int hashCode3 = (((((((((((hashCode2 ^ i2) * 1000003) ^ this.f81966j.hashCode()) * 1000003) ^ this.f81967k.hashCode()) * 1000003) ^ this.f81968l.hashCode()) * 1000003) ^ this.f81969m.hashCode()) * 1000003) ^ this.f81970n.hashCode()) * 1000003;
        C30847m mVar2 = this.f81971o;
        if (mVar2 != null) {
            i3 = mVar2.hashCode();
        }
        return ((hashCode3 ^ i3) * 1000003) ^ this.f81972p.hashCode();
    }

    /* renamed from: i */
    public final C30306o mo35858i() {
        return this.f81957a;
    }

    /* renamed from: j */
    public final C30474o mo35859j() {
        return this.f81963g;
    }

    /* renamed from: k */
    public final C30518b mo35860k() {
        return this.f81960d;
    }

    /* renamed from: l */
    public final C30830g mo35861l() {
        return this.f81961e;
    }

    /* renamed from: m */
    public final C30860b mo35862m() {
        return this.f81962f;
    }

    /* renamed from: n */
    public final C30847m mo35863n() {
        return this.f81971o;
    }

    /* renamed from: o */
    public final C30897z mo35864o() {
        return this.f81970n;
    }

    /* renamed from: p */
    public final C58833ax mo35865p() {
        return this.f81972p;
    }

    /* renamed from: q */
    public final C58833ax mo35866q() {
        return this.f81964h;
    }

    /* renamed from: r */
    public final Class mo35867r() {
        return this.f81967k;
    }

    /* renamed from: s */
    public final ExecutorService mo35868s() {
        return this.f81968l;
    }

    public final String toString() {
        String obj = this.f81957a.toString();
        String obj2 = this.f81958b.toString();
        String obj3 = this.f81959c.toString();
        String obj4 = this.f81960d.toString();
        String valueOf = String.valueOf(this.f81961e);
        String obj5 = this.f81962f.toString();
        String obj6 = this.f81963g.toString();
        String valueOf2 = String.valueOf(this.f81964h);
        String valueOf3 = String.valueOf(this.f81965i);
        String obj7 = this.f81966j.toString();
        String obj8 = this.f81967k.toString();
        String obj9 = this.f81968l.toString();
        String obj10 = this.f81969m.toString();
        String obj11 = this.f81970n.toString();
        String valueOf4 = String.valueOf(this.f81971o);
        return "AccountMenuManager{accountsModel=" + obj + ", accountConverter=" + obj2 + ", clickListeners=" + obj3 + ", features=" + obj4 + ", avatarRetriever=" + valueOf + ", oneGoogleEventLogger=" + obj5 + ", configuration=" + obj6 + ", incognitoModel=" + valueOf2 + ", customAvatarImageLoader=" + valueOf3 + ", avatarImageLoader=" + obj7 + ", accountClass=" + obj8 + ", backgroundExecutor=" + obj9 + ", vePrimitives=" + obj10 + ", visualElements=" + obj11 + ", oneGoogleStreamz=" + valueOf4 + ", appIdentifier=" + String.valueOf(this.f81972p) + "}";
    }
}
