package com.google.p4283bv.p4380j.p4381a.p4382a.p4384b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.a.a.b.d */
/* compiled from: PG */
public final class C57680d extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57680d f154068b;

    /* renamed from: d */
    private static volatile C63010eb f154069d;

    /* renamed from: a */
    public C62971cq f154070a = emptyProtobufList();

    /* renamed from: c */
    private byte f154071c = 2;

    static {
        C57680d dVar = new C57680d();
        f154068b = dVar;
        C62942bv.registerDefaultInstance(C57680d.class, dVar);
    }

    private C57680d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154071c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154071c = b;
                return null;
            case 2:
                return newMessageInfo(f154068b, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0001\bЛ", new Object[]{"a", C57678b.class});
            case 3:
                return new C57680d();
            case 4:
                return new C57679c();
            case 5:
                return f154068b;
            case 6:
                C63010eb ebVar = f154069d;
                if (ebVar == null) {
                    synchronized (C57680d.class) {
                        ebVar = f154069d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154068b);
                            f154069d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
