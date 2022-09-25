package com.google.p4222bl.p4223a.p4224a;

import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.n */
/* compiled from: PG */
public final class C56075n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56075n f149409c;

    /* renamed from: d */
    private static volatile C63010eb f149410d;

    /* renamed from: a */
    public C62971cq f149411a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C58072d f149412b;

    static {
        C56075n nVar = new C56075n();
        f149409c = nVar;
        C62942bv.registerDefaultInstance(C56075n.class, nVar);
    }

    private C56075n() {
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
                return newMessageInfo(f149409c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C56075n();
            case 4:
                return new C56074m();
            case 5:
                return f149409c;
            case 6:
                C63010eb ebVar = f149410d;
                if (ebVar == null) {
                    synchronized (C56075n.class) {
                        ebVar = f149410d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149409c);
                            f149410d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
