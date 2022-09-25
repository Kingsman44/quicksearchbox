package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ez */
/* compiled from: PG */
public final class C49949ez extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49949ez f129843c;

    /* renamed from: d */
    private static volatile C63010eb f129844d;

    /* renamed from: a */
    public int f129845a;

    /* renamed from: b */
    public int f129846b;

    static {
        C49949ez ezVar = new C49949ez();
        f129843c = ezVar;
        C62942bv.registerDefaultInstance(C49949ez.class, ezVar);
    }

    private C49949ez() {
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
                return newMessageInfo(f129843c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C49948ey.f129842a});
            case 3:
                return new C49949ez();
            case 4:
                return new C49947ex();
            case 5:
                return f129843c;
            case 6:
                C63010eb ebVar = f129844d;
                if (ebVar == null) {
                    synchronized (C49949ez.class) {
                        ebVar = f129844d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129843c);
                            f129844d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
