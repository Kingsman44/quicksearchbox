package com.google.lens.p4705i.p4706a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.r */
/* compiled from: PG */
public final class C62387r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62387r f168411b;

    /* renamed from: c */
    private static volatile C63010eb f168412c;

    /* renamed from: a */
    public int f168413a;

    static {
        C62387r rVar = new C62387r();
        f168411b = rVar;
        C62942bv.registerDefaultInstance(C62387r.class, rVar);
    }

    private C62387r() {
        emptyProtobufList();
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
                return newMessageInfo(f168411b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C62387r();
            case 4:
                return new C62386q();
            case 5:
                return f168411b;
            case 6:
                C63010eb ebVar = f168412c;
                if (ebVar == null) {
                    synchronized (C62387r.class) {
                        ebVar = f168412c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168411b);
                            f168412c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
