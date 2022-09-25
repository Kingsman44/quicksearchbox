package com.google.assistant.p3863av.p3864a.p3865a.p3866a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.a.a.a.b */
/* compiled from: PG */
public final class C50524b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50524b f131506a;

    /* renamed from: b */
    private static volatile C63010eb f131507b;

    static {
        C50524b bVar = new C50524b();
        f131506a = bVar;
        C62942bv.registerDefaultInstance(C50524b.class, bVar);
    }

    private C50524b() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f131506a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50524b();
            case 4:
                return new C50523a();
            case 5:
                return f131506a;
            case 6:
                C63010eb ebVar = f131507b;
                if (ebVar == null) {
                    synchronized (C50524b.class) {
                        ebVar = f131507b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131506a);
                            f131507b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
