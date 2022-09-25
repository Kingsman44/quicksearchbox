package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.di */
/* compiled from: PG */
public final class C67733di extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67733di f183770c;

    /* renamed from: d */
    private static volatile C63010eb f183771d;

    /* renamed from: a */
    public int f183772a;

    /* renamed from: b */
    public C62971cq f183773b = emptyProtobufList();

    static {
        C67733di diVar = new C67733di();
        f183770c = diVar;
        C62942bv.registerDefaultInstance(C67733di.class, diVar);
    }

    private C67733di() {
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
                return newMessageInfo(f183770c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", C67732dh.class});
            case 3:
                return new C67733di();
            case 4:
                return new C67730df();
            case 5:
                return f183770c;
            case 6:
                C63010eb ebVar = f183771d;
                if (ebVar == null) {
                    synchronized (C67733di.class) {
                        ebVar = f183771d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183770c);
                            f183771d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
