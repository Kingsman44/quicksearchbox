package com.google.android.libraries.assistant.p1363c.p1364a.p1370c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.a.c.b */
/* compiled from: PG */
public final class C16978b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16978b f49598b;

    /* renamed from: c */
    private static volatile C63010eb f49599c;

    /* renamed from: a */
    public int f49600a;

    static {
        C16978b bVar = new C16978b();
        f49598b = bVar;
        C62942bv.registerDefaultInstance(C16978b.class, bVar);
    }

    private C16978b() {
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
                return newMessageInfo(f49598b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C16978b();
            case 4:
                return new C16977a();
            case 5:
                return f49598b;
            case 6:
                C63010eb ebVar = f49599c;
                if (ebVar == null) {
                    synchronized (C16978b.class) {
                        ebVar = f49599c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49598b);
                            f49599c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
