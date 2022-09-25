package com.google.lens.p4705i.p4706a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.f */
/* compiled from: PG */
public final class C62375f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62375f f168386d;

    /* renamed from: e */
    private static volatile C63010eb f168387e;

    /* renamed from: a */
    public int f168388a;

    /* renamed from: b */
    public C62371b f168389b;

    /* renamed from: c */
    public C62393x f168390c;

    static {
        C62375f fVar = new C62375f();
        f168386d = fVar;
        C62942bv.registerDefaultInstance(C62375f.class, fVar);
    }

    private C62375f() {
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
                return newMessageInfo(f168386d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62375f();
            case 4:
                return new C62374e();
            case 5:
                return f168386d;
            case 6:
                C63010eb ebVar = f168387e;
                if (ebVar == null) {
                    synchronized (C62375f.class) {
                        ebVar = f168387e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168386d);
                            f168387e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
