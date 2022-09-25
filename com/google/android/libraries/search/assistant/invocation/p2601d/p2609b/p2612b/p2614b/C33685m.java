package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.m */
/* compiled from: PG */
public final class C33685m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33685m f90002c;

    /* renamed from: d */
    private static volatile C63010eb f90003d;

    /* renamed from: a */
    public int f90004a = 0;

    /* renamed from: b */
    public Object f90005b;

    static {
        C33685m mVar = new C33685m();
        f90002c = mVar;
        C62942bv.registerDefaultInstance(C33685m.class, mVar);
    }

    private C33685m() {
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
                return newMessageInfo(f90002c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C121771at.class, C33675c.class});
            case 3:
                return new C33685m();
            case 4:
                return new C33684l();
            case 5:
                return f90002c;
            case 6:
                C63010eb ebVar = f90003d;
                if (ebVar == null) {
                    synchronized (C33685m.class) {
                        ebVar = f90003d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90002c);
                            f90003d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
