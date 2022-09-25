package com.google.p4242bp.p4267h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.f */
/* compiled from: PG */
public final class C56399f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56399f f150412a;

    /* renamed from: b */
    private static volatile C63010eb f150413b;

    static {
        C56399f fVar = new C56399f();
        f150412a = fVar;
        C62942bv.registerDefaultInstance(C56399f.class, fVar);
    }

    private C56399f() {
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
                return newMessageInfo(f150412a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56399f();
            case 4:
                return new C56398e();
            case 5:
                return f150412a;
            case 6:
                C63010eb ebVar = f150413b;
                if (ebVar == null) {
                    synchronized (C56399f.class) {
                        ebVar = f150413b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150412a);
                            f150413b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
