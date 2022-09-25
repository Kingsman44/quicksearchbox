package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.cg */
/* compiled from: PG */
public final class C51291cg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51291cg f133521c;

    /* renamed from: d */
    private static volatile C63010eb f133522d;

    /* renamed from: a */
    public int f133523a;

    /* renamed from: b */
    public int f133524b;

    static {
        C51291cg cgVar = new C51291cg();
        f133521c = cgVar;
        C62942bv.registerDefaultInstance(C51291cg.class, cgVar);
    }

    private C51291cg() {
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
                return newMessageInfo(f133521c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
            case 3:
                return new C51291cg();
            case 4:
                return new C51290cf();
            case 5:
                return f133521c;
            case 6:
                C63010eb ebVar = f133522d;
                if (ebVar == null) {
                    synchronized (C51291cg.class) {
                        ebVar = f133522d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133521c);
                            f133522d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
