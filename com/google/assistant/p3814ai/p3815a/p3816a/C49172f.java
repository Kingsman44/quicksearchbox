package com.google.assistant.p3814ai.p3815a.p3816a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.f */
/* compiled from: PG */
public final class C49172f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49172f f127147c;

    /* renamed from: d */
    private static volatile C63010eb f127148d;

    /* renamed from: a */
    public C49175i f127149a;

    /* renamed from: b */
    public boolean f127150b;

    static {
        C49172f fVar = new C49172f();
        f127147c = fVar;
        C62942bv.registerDefaultInstance(C49172f.class, fVar);
    }

    private C49172f() {
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
                return newMessageInfo(f127147c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C49172f();
            case 4:
                return new C49171e();
            case 5:
                return f127147c;
            case 6:
                C63010eb ebVar = f127148d;
                if (ebVar == null) {
                    synchronized (C49172f.class) {
                        ebVar = f127148d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127147c);
                            f127148d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
