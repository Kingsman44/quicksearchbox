package com.google.p5277z.p5281b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.b.j */
/* compiled from: PG */
public final class C67989j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67989j f184225b;

    /* renamed from: c */
    private static volatile C63010eb f184226c;

    /* renamed from: a */
    public int f184227a;

    static {
        C67989j jVar = new C67989j();
        f184225b = jVar;
        C62942bv.registerDefaultInstance(C67989j.class, jVar);
    }

    private C67989j() {
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
                return newMessageInfo(f184225b, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\f", new Object[]{"a"});
            case 3:
                return new C67989j();
            case 4:
                return new C67986g();
            case 5:
                return f184225b;
            case 6:
                C63010eb ebVar = f184226c;
                if (ebVar == null) {
                    synchronized (C67989j.class) {
                        ebVar = f184226c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184225b);
                            f184226c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
