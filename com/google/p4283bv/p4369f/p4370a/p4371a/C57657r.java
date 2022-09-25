package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.r */
/* compiled from: PG */
public final class C57657r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57657r f153971a;

    /* renamed from: d */
    private static volatile C63010eb f153972d;

    /* renamed from: b */
    private C57590bg f153973b;

    /* renamed from: c */
    private byte f153974c = 2;

    static {
        C57657r rVar = new C57657r();
        f153971a = rVar;
        C62942bv.registerDefaultInstance(C57657r.class, rVar);
    }

    private C57657r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153974c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f153974c = b;
                return null;
            case 2:
                return newMessageInfo(f153971a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"b"});
            case 3:
                return new C57657r();
            case 4:
                return new C57656q();
            case 5:
                return f153971a;
            case 6:
                C63010eb ebVar = f153972d;
                if (ebVar == null) {
                    synchronized (C57657r.class) {
                        ebVar = f153972d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153971a);
                            f153972d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
