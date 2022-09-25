package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.f */
/* compiled from: PG */
public final class C67766f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67766f f183855b;

    /* renamed from: c */
    private static volatile C63010eb f183856c;

    /* renamed from: a */
    public int f183857a;

    static {
        C67766f fVar = new C67766f();
        f183855b = fVar;
        C62942bv.registerDefaultInstance(C67766f.class, fVar);
    }

    private C67766f() {
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
                return newMessageInfo(f183855b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            case 3:
                return new C67766f();
            case 4:
                return new C67751e();
            case 5:
                return f183855b;
            case 6:
                C63010eb ebVar = f183856c;
                if (ebVar == null) {
                    synchronized (C67766f.class) {
                        ebVar = f183856c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183855b);
                            f183856c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
