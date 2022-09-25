package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.bn */
/* compiled from: PG */
public final class C57597bn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57597bn f153871b;

    /* renamed from: d */
    private static volatile C63010eb f153872d;

    /* renamed from: a */
    public C57569am f153873a;

    /* renamed from: c */
    private byte f153874c = 2;

    static {
        C57597bn bnVar = new C57597bn();
        f153871b = bnVar;
        C62942bv.registerDefaultInstance(C57597bn.class, bnVar);
    }

    private C57597bn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153874c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f153874c = b;
                return null;
            case 2:
                return newMessageInfo(f153871b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C57597bn();
            case 4:
                return new C57596bm();
            case 5:
                return f153871b;
            case 6:
                C63010eb ebVar = f153872d;
                if (ebVar == null) {
                    synchronized (C57597bn.class) {
                        ebVar = f153872d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153871b);
                            f153872d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
