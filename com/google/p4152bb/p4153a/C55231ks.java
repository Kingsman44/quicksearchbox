package com.google.p4152bb.p4153a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ks */
/* compiled from: PG */
public final class C55231ks extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C55231ks f145410h;

    /* renamed from: i */
    public static final C62940bt f145411i;

    /* renamed from: k */
    private static volatile C63010eb f145412k;

    /* renamed from: a */
    public int f145413a;

    /* renamed from: b */
    public int f145414b;

    /* renamed from: c */
    public boolean f145415c;

    /* renamed from: d */
    public int f145416d;

    /* renamed from: e */
    public int f145417e;

    /* renamed from: f */
    public int f145418f;

    /* renamed from: g */
    public C55175iq f145419g;

    /* renamed from: j */
    private byte f145420j = 2;

    static {
        C55231ks ksVar = new C55231ks();
        f145410h = ksVar;
        C62942bv.registerDefaultInstance(C55231ks.class, ksVar);
        f145411i = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, ksVar, ksVar, (C62958ce) null, 68007661, C63066gd.MESSAGE, C55231ks.class);
    }

    private C55231ks() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145420j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145420j = b;
                return null;
            case 2:
                return newMessageInfo(f145410h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C55227ko.f145408a, C45240c.f118157a, "d", C55229kq.f145409a, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C55231ks();
            case 4:
                return new C55226kn();
            case 5:
                return f145410h;
            case 6:
                C63010eb ebVar = f145412k;
                if (ebVar == null) {
                    synchronized (C55231ks.class) {
                        ebVar = f145412k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145410h);
                            f145412k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
