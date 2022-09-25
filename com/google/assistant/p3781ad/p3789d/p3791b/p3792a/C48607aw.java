package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.aw */
/* compiled from: PG */
public final class C48607aw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48607aw f125619a;

    /* renamed from: b */
    private static volatile C63010eb f125620b;

    static {
        C48607aw awVar = new C48607aw();
        f125619a = awVar;
        C62942bv.registerDefaultInstance(C48607aw.class, awVar);
    }

    private C48607aw() {
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
                return newMessageInfo(f125619a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48607aw();
            case 4:
                return new C48606av();
            case 5:
                return f125619a;
            case 6:
                C63010eb ebVar = f125620b;
                if (ebVar == null) {
                    synchronized (C48607aw.class) {
                        ebVar = f125620b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125619a);
                            f125620b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
