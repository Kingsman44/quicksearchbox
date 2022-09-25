package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.cn */
/* compiled from: PG */
public final class C57624cn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57624cn f153918a;

    /* renamed from: d */
    private static volatile C63010eb f153919d;

    /* renamed from: b */
    private C8242v f153920b;

    /* renamed from: c */
    private byte f153921c = 2;

    static {
        C57624cn cnVar = new C57624cn();
        f153918a = cnVar;
        C62942bv.registerDefaultInstance(C57624cn.class, cnVar);
    }

    private C57624cn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153921c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f153921c = b;
                return null;
            case 2:
                return newMessageInfo(f153918a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"b"});
            case 3:
                return new C57624cn();
            case 4:
                return new C57623cm();
            case 5:
                return f153918a;
            case 6:
                C63010eb ebVar = f153919d;
                if (ebVar == null) {
                    synchronized (C57624cn.class) {
                        ebVar = f153919d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153918a);
                            f153919d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
