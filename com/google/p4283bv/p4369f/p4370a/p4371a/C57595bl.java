package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.bl */
/* compiled from: PG */
public final class C57595bl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57595bl f153864e;

    /* renamed from: g */
    private static volatile C63010eb f153865g;

    /* renamed from: a */
    public C57601br f153866a;

    /* renamed from: b */
    public C57663x f153867b;

    /* renamed from: c */
    public boolean f153868c;

    /* renamed from: d */
    public int f153869d;

    /* renamed from: f */
    private byte f153870f = 2;

    static {
        C57595bl blVar = new C57595bl();
        f153864e = blVar;
        C62942bv.registerDefaultInstance(C57595bl.class, blVar);
    }

    private C57595bl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153870f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153870f = b;
                return null;
            case 2:
                return newMessageInfo(f153864e, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0001\u0002Љ\u0003\f\u0004\t\u0005\u0007", new Object[]{"b", "d", "a", C45240c.f118157a});
            case 3:
                return new C57595bl();
            case 4:
                return new C57594bk();
            case 5:
                return f153864e;
            case 6:
                C63010eb ebVar = f153865g;
                if (ebVar == null) {
                    synchronized (C57595bl.class) {
                        ebVar = f153865g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153864e);
                            f153865g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
