package com.google.assistant.p3745ab.p3770v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.ab.v.d */
/* compiled from: PG */
public final class C48410d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48410d f125110a;

    /* renamed from: b */
    private static volatile C63010eb f125111b;

    static {
        C48410d dVar = new C48410d();
        f125110a = dVar;
        C62942bv.registerDefaultInstance(C48410d.class, dVar);
    }

    private C48410d() {
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
                return newMessageInfo(f125110a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48410d();
            case 4:
                return new C48409c();
            case 5:
                return f125110a;
            case 6:
                C63010eb ebVar = f125111b;
                if (ebVar == null) {
                    synchronized (C48410d.class) {
                        ebVar = f125111b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125110a);
                            f125111b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
