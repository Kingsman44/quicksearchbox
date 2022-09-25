package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.aj */
/* compiled from: PG */
public final class C53550aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53550aj f140536b;

    /* renamed from: c */
    private static volatile C63010eb f140537c;

    /* renamed from: a */
    public C62961ch f140538a = emptyIntList();

    static {
        C53550aj ajVar = new C53550aj();
        f140536b = ajVar;
        C62942bv.registerDefaultInstance(C53550aj.class, ajVar);
    }

    private C53550aj() {
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
                return newMessageInfo(f140536b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C53556ap.m86866c()});
            case 3:
                return new C53550aj();
            case 4:
                return new C53549ai();
            case 5:
                return f140536b;
            case 6:
                C63010eb ebVar = f140537c;
                if (ebVar == null) {
                    synchronized (C53550aj.class) {
                        ebVar = f140537c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140536b);
                            f140537c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
