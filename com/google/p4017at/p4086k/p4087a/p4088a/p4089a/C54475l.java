package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.l */
/* compiled from: PG */
public final class C54475l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54475l f143032b;

    /* renamed from: d */
    private static volatile C63010eb f143033d;

    /* renamed from: a */
    public C57578av f143034a;

    /* renamed from: c */
    private byte f143035c = 2;

    static {
        C54475l lVar = new C54475l();
        f143032b = lVar;
        C62942bv.registerDefaultInstance(C54475l.class, lVar);
    }

    private C54475l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143035c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f143035c = b;
                return null;
            case 2:
                return newMessageInfo(f143032b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C54475l();
            case 4:
                return new C54474k();
            case 5:
                return f143032b;
            case 6:
                C63010eb ebVar = f143033d;
                if (ebVar == null) {
                    synchronized (C54475l.class) {
                        ebVar = f143033d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143032b);
                            f143033d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
