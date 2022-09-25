package com.google.assistant.p3745ab.p3772x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.x.b */
/* compiled from: PG */
public final class C48425b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48425b f125143a;

    /* renamed from: b */
    private static volatile C63010eb f125144b;

    static {
        C48425b bVar = new C48425b();
        f125143a = bVar;
        C62942bv.registerDefaultInstance(C48425b.class, bVar);
    }

    private C48425b() {
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
                return newMessageInfo(f125143a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48425b();
            case 4:
                return new C48424a();
            case 5:
                return f125143a;
            case 6:
                C63010eb ebVar = f125144b;
                if (ebVar == null) {
                    synchronized (C48425b.class) {
                        ebVar = f125144b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125143a);
                            f125144b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
