package com.google.android.libraries.p11016ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.ak */
/* compiled from: PG */
public final class C147630ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C147630ak f398459e;

    /* renamed from: f */
    private static volatile C63010eb f398460f;

    /* renamed from: a */
    public C62910ar f398461a;

    /* renamed from: b */
    public C62910ar f398462b;

    /* renamed from: c */
    public C62910ar f398463c;

    /* renamed from: d */
    public C62910ar f398464d;

    static {
        C147630ak akVar = new C147630ak();
        f398459e = akVar;
        C62942bv.registerDefaultInstance(C147630ak.class, akVar);
    }

    private C147630ak() {
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
                return newMessageInfo(f398459e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C147630ak();
            case 4:
                return new C147629aj();
            case 5:
                return f398459e;
            case 6:
                C63010eb ebVar = f398460f;
                if (ebVar == null) {
                    synchronized (C147630ak.class) {
                        ebVar = f398460f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398459e);
                            f398460f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
