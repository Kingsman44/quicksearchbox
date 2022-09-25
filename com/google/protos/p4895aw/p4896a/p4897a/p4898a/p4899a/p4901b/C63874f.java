package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.protos.aw.a.a.a.a.b.f */
/* compiled from: PG */
public final class C63874f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63874f f172714b;

    /* renamed from: c */
    public static final C62940bt f172715c;

    /* renamed from: e */
    private static volatile C63010eb f172716e;

    /* renamed from: a */
    public int f172717a;

    /* renamed from: d */
    private int f172718d;

    static {
        C63874f fVar = new C63874f();
        f172714b = fVar;
        C62942bv.registerDefaultInstance(C63874f.class, fVar);
        f172715c = C62942bv.newSingularGeneratedExtension(C63955s.f172966b, fVar, fVar, (C62958ce) null, 1004, C63066gd.MESSAGE, C63874f.class);
    }

    private C63874f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f172714b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "a"});
            case 3:
                return new C63874f();
            case 4:
                return new C63873e();
            case 5:
                return f172714b;
            case 6:
                C63010eb ebVar = f172716e;
                if (ebVar == null) {
                    synchronized (C63874f.class) {
                        ebVar = f172716e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172714b);
                            f172716e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
