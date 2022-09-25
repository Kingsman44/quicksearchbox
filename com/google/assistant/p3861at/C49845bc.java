package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bc */
/* compiled from: PG */
public final class C49845bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49845bc f129538c;

    /* renamed from: d */
    private static volatile C63010eb f129539d;

    /* renamed from: a */
    public int f129540a = 0;

    /* renamed from: b */
    public Object f129541b;

    static {
        C49845bc bcVar = new C49845bc();
        f129538c = bcVar;
        C62942bv.registerDefaultInstance(C49845bc.class, bcVar);
    }

    private C49845bc() {
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
                return newMessageInfo(f129538c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C49845bc();
            case 4:
                return new C49844bb();
            case 5:
                return f129538c;
            case 6:
                C63010eb ebVar = f129539d;
                if (ebVar == null) {
                    synchronized (C49845bc.class) {
                        ebVar = f129539d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129538c);
                            f129539d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
