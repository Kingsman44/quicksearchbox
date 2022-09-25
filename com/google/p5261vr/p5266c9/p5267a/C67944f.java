package com.google.p5261vr.p5266c9.p5267a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.vr.c9.a.f */
/* compiled from: PG */
public final class C67944f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67944f f184141a;

    /* renamed from: b */
    private static volatile C63010eb f184142b;

    static {
        C67944f fVar = new C67944f();
        f184141a = fVar;
        C62942bv.registerDefaultInstance(C67944f.class, fVar);
    }

    private C67944f() {
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
                return newMessageInfo(f184141a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C67944f();
            case 4:
                return new C67943e();
            case 5:
                return f184141a;
            case 6:
                C63010eb ebVar = f184142b;
                if (ebVar == null) {
                    synchronized (C67944f.class) {
                        ebVar = f184142b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184141a);
                            f184142b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
