package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.gc */
/* compiled from: PG */
public final class C52124gc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52124gc f136780c;

    /* renamed from: d */
    private static volatile C63010eb f136781d;

    /* renamed from: a */
    public int f136782a;

    /* renamed from: b */
    public int f136783b;

    static {
        C52124gc gcVar = new C52124gc();
        f136780c = gcVar;
        C62942bv.registerDefaultInstance(C52124gc.class, gcVar);
    }

    private C52124gc() {
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
                return newMessageInfo(f136780c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52122ga.f136779a});
            case 3:
                return new C52124gc();
            case 4:
                return new C52120fz();
            case 5:
                return f136780c;
            case 6:
                C63010eb ebVar = f136781d;
                if (ebVar == null) {
                    synchronized (C52124gc.class) {
                        ebVar = f136781d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136780c);
                            f136781d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
