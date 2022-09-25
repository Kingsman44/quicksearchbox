package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cn */
/* compiled from: PG */
public final class C62089cn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62089cn f167693a;

    /* renamed from: c */
    private static volatile C63010eb f167694c;

    /* renamed from: b */
    private byte f167695b = 2;

    static {
        C62089cn cnVar = new C62089cn();
        f167693a = cnVar;
        C62942bv.registerDefaultInstance(C62089cn.class, cnVar);
    }

    private C62089cn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167695b);
            case 1:
                this.f167695b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167693a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62089cn();
            case 4:
                return new C62088cm();
            case 5:
                return f167693a;
            case 6:
                C63010eb ebVar = f167694c;
                if (ebVar == null) {
                    synchronized (C62089cn.class) {
                        ebVar = f167694c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167693a);
                            f167694c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
