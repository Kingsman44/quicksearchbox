package com.google.p4283bv.p4287b.p4288a.p4289a.p4314s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.s.f */
/* compiled from: PG */
public final class C56819f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56819f f151608a;

    /* renamed from: b */
    private static volatile C63010eb f151609b;

    static {
        C56819f fVar = new C56819f();
        f151608a = fVar;
        C62942bv.registerDefaultInstance(C56819f.class, fVar);
    }

    private C56819f() {
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
                return newMessageInfo(f151608a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56819f();
            case 4:
                return new C56818e();
            case 5:
                return f151608a;
            case 6:
                C63010eb ebVar = f151609b;
                if (ebVar == null) {
                    synchronized (C56819f.class) {
                        ebVar = f151609b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151608a);
                            f151609b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
