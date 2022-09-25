package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4061a.p4062a.C54144d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.s */
/* compiled from: PG */
public final class C54120s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54120s f142008d;

    /* renamed from: f */
    private static volatile C63010eb f142009f;

    /* renamed from: a */
    public int f142010a;

    /* renamed from: b */
    public C54144d f142011b;

    /* renamed from: c */
    public C54098av f142012c;

    /* renamed from: e */
    private byte f142013e = 2;

    static {
        C54120s sVar = new C54120s();
        f142008d = sVar;
        C62942bv.registerDefaultInstance(C54120s.class, sVar);
    }

    private C54120s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142013e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142013e = b;
                return null;
            case 2:
                return newMessageInfo(f142008d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54120s();
            case 4:
                return new C54119r();
            case 5:
                return f142008d;
            case 6:
                C63010eb ebVar = f142009f;
                if (ebVar == null) {
                    synchronized (C54120s.class) {
                        ebVar = f142009f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142008d);
                            f142009f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
