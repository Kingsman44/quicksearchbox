package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.op */
/* compiled from: PG */
public final class C7179op implements C7171oh {

    /* renamed from: a */
    private final C7196pf f23326a;

    /* renamed from: b */
    private final boolean f23327b;

    /* renamed from: c */
    private final boolean f23328c;

    /* renamed from: d */
    private final C7185ov f23329d = new C7185ov(7);

    /* renamed from: e */
    private final C7185ov f23330e = new C7185ov(8);

    /* renamed from: f */
    private final C7185ov f23331f = new C7185ov(6);

    /* renamed from: g */
    private long f23332g;

    /* renamed from: h */
    private final boolean[] f23333h = new boolean[3];

    /* renamed from: i */
    private String f23334i;

    /* renamed from: j */
    private C7073kr f23335j;

    /* renamed from: k */
    private C7178oo f23336k;

    /* renamed from: l */
    private boolean f23337l;

    /* renamed from: m */
    private long f23338m;

    /* renamed from: n */
    private boolean f23339n;

    /* renamed from: o */
    private final aee f23340o = new aee();

    public C7179op(C7196pf pfVar, boolean z, boolean z2) {
        this.f23326a = pfVar;
        this.f23327b = z;
        this.f23328c = z2;
    }

    /* renamed from: f */
    private final void m21388f(byte[] bArr, int i, int i2) {
        if (!this.f23337l || this.f23336k.mo16239a()) {
            this.f23329d.mo16253d(bArr, i, i2);
            this.f23330e.mo16253d(bArr, i, i2);
        }
        this.f23331f.mo16253d(bArr, i, i2);
        this.f23336k.mo16244f(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23332g = 0;
        this.f23339n = false;
        aec.m18366d(this.f23333h);
        this.f23329d.mo16250a();
        this.f23330e.mo16250a();
        this.f23331f.mo16250a();
        C7178oo ooVar = this.f23336k;
        if (ooVar != null) {
            ooVar.mo16242d();
        }
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23334i = pqVar.mo16280c();
        this.f23335j = kaVar.mo16113ak(pqVar.mo16279b(), 2);
        this.f23336k = new C7178oo(this.f23335j, this.f23327b, this.f23328c);
        this.f23326a.mo16272a(kaVar, pqVar);
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23338m = j;
        this.f23339n |= (i & 2) != 0;
    }

    /* renamed from: d */
    public final void mo16218d(aee aee) {
        ary.m19466s(this.f23335j);
        int i = aeu.f20466a;
        int g = aee.mo14553g();
        int e = aee.mo14551e();
        byte[] i2 = aee.mo14555i();
        this.f23332g += (long) aee.mo14550d();
        this.f23335j.mo16105d(aee, aee.mo14550d());
        while (true) {
            int c = aec.m18365c(i2, g, e, this.f23333h);
            if (c != e) {
                int i3 = c + 3;
                byte b = i2[i3] & 31;
                int i4 = c - g;
                if (i4 > 0) {
                    m21388f(i2, g, c);
                }
                int i5 = e - c;
                long j = this.f23332g - ((long) i5);
                int i6 = i4 < 0 ? -i4 : 0;
                long j2 = this.f23338m;
                if (!this.f23337l || this.f23336k.mo16239a()) {
                    this.f23329d.mo16254e(i6);
                    this.f23330e.mo16254e(i6);
                    if (!this.f23337l) {
                        if (this.f23329d.mo16251b() && this.f23330e.mo16251b()) {
                            ArrayList arrayList = new ArrayList();
                            C7185ov ovVar = this.f23329d;
                            arrayList.add(Arrays.copyOf(ovVar.f23407a, ovVar.f23408b));
                            C7185ov ovVar2 = this.f23330e;
                            arrayList.add(Arrays.copyOf(ovVar2.f23407a, ovVar2.f23408b));
                            C7185ov ovVar3 = this.f23329d;
                            aeb b2 = aec.m18364b(ovVar3.f23407a, 3, ovVar3.f23408b);
                            C7185ov ovVar4 = this.f23330e;
                            aea e2 = aec.m18367e(ovVar4.f23407a, ovVar4.f23408b);
                            int i7 = b2.f20404a;
                            int i8 = b2.f20405b;
                            int i9 = b2.f20406c;
                            int i10 = adl.f20371a;
                            String format = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
                            C7073kr krVar = this.f23335j;
                            C6863cx cxVar = new C6863cx();
                            cxVar.mo15617S(this.f23334i);
                            cxVar.mo15630ae("video/avc");
                            cxVar.mo15607I(format);
                            cxVar.mo15635aj(b2.f20408e);
                            cxVar.mo15615Q(b2.f20409f);
                            cxVar.mo15626aa(b2.f20410g);
                            cxVar.mo15618T(arrayList);
                            krVar.mo16102a(cxVar.mo15625a());
                            this.f23337l = true;
                            this.f23336k.mo16240b(b2);
                            this.f23336k.mo16241c(e2);
                            this.f23329d.mo16250a();
                            this.f23330e.mo16250a();
                        }
                    } else if (this.f23329d.mo16251b()) {
                        C7185ov ovVar5 = this.f23329d;
                        this.f23336k.mo16240b(aec.m18364b(ovVar5.f23407a, 3, ovVar5.f23408b));
                        this.f23329d.mo16250a();
                    } else if (this.f23330e.mo16251b()) {
                        C7185ov ovVar6 = this.f23330e;
                        this.f23336k.mo16241c(aec.m18367e(ovVar6.f23407a, ovVar6.f23408b));
                        this.f23330e.mo16250a();
                    }
                }
                if (this.f23331f.mo16254e(i6)) {
                    C7185ov ovVar7 = this.f23331f;
                    this.f23340o.mo14549c(this.f23331f.f23407a, aec.m18363a(ovVar7.f23407a, ovVar7.f23408b));
                    this.f23340o.mo14554h(4);
                    this.f23326a.mo16273b(j2, this.f23340o);
                }
                if (this.f23336k.mo16245g(j, i5, this.f23337l, this.f23339n)) {
                    this.f23339n = false;
                }
                long j3 = this.f23338m;
                if (!this.f23337l || this.f23336k.mo16239a()) {
                    this.f23329d.mo16252c(b);
                    this.f23330e.mo16252c(b);
                }
                this.f23331f.mo16252c(b);
                this.f23336k.mo16243e(j, b, j3);
                g = i3;
            } else {
                m21388f(i2, g, e);
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo16219e() {
    }
}
