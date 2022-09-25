package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bf */
/* compiled from: PG */
public final class C62054bf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62054bf f167641a;

    /* renamed from: c */
    private static volatile C63010eb f167642c;

    /* renamed from: b */
    private byte f167643b = 2;

    static {
        C62054bf bfVar = new C62054bf();
        f167641a = bfVar;
        C62942bv.registerDefaultInstance(C62054bf.class, bfVar);
    }

    private C62054bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167643b);
            case 1:
                this.f167643b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167641a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62054bf();
            case 4:
                return new C62053be();
            case 5:
                return f167641a;
            case 6:
                C63010eb ebVar = f167642c;
                if (ebVar == null) {
                    synchronized (C62054bf.class) {
                        ebVar = f167642c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167641a);
                            f167642c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
