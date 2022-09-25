package com.google.assistant.p3821al.p3822a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.al.a.f */
/* compiled from: PG */
public final class C49223f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49223f f127265c;

    /* renamed from: d */
    private static volatile C63010eb f127266d;

    /* renamed from: a */
    public int f127267a;

    /* renamed from: b */
    public C49229l f127268b;

    static {
        C49223f fVar = new C49223f();
        f127265c = fVar;
        C62942bv.registerDefaultInstance(C49223f.class, fVar);
    }

    private C49223f() {
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
                return newMessageInfo(f127265c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49223f();
            case 4:
                return new C49222e();
            case 5:
                return f127265c;
            case 6:
                C63010eb ebVar = f127266d;
                if (ebVar == null) {
                    synchronized (C49223f.class) {
                        ebVar = f127266d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127265c);
                            f127266d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
