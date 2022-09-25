package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.common.o.aph */
/* compiled from: PG */
public final class aph extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final aph f159640a;

    /* renamed from: e */
    private static volatile C63010eb f159641e;

    /* renamed from: b */
    private int f159642b;

    /* renamed from: c */
    private C63771b f159643c;

    /* renamed from: d */
    private byte f159644d = 2;

    static {
        aph aph = new aph();
        f159640a = aph;
        C62942bv.registerDefaultInstance(aph.class, aph);
    }

    private aph() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159644d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159644d = b;
                return null;
            case 2:
                return newMessageInfo(f159640a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0001\tᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new aph();
            case 4:
                return new apg();
            case 5:
                return f159640a;
            case 6:
                C63010eb ebVar = f159641e;
                if (ebVar == null) {
                    synchronized (aph.class) {
                        ebVar = f159641e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159640a);
                            f159641e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
