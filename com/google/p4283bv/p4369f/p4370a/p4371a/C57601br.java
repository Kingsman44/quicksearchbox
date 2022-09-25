package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.br */
/* compiled from: PG */
public final class C57601br extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57601br f153881b;

    /* renamed from: c */
    private static volatile C63010eb f153882c;

    /* renamed from: a */
    public C57648i f153883a;

    static {
        C57601br brVar = new C57601br();
        f153881b = brVar;
        C62942bv.registerDefaultInstance(C57601br.class, brVar);
    }

    private C57601br() {
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
                return newMessageInfo(f153881b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C57601br();
            case 4:
                return new C57600bq();
            case 5:
                return f153881b;
            case 6:
                C63010eb ebVar = f153882c;
                if (ebVar == null) {
                    synchronized (C57601br.class) {
                        ebVar = f153882c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153881b);
                            f153882c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
