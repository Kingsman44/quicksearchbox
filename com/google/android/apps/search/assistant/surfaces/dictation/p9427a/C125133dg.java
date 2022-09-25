package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.dg */
/* compiled from: PG */
public final class C125133dg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125133dg f345203c;

    /* renamed from: d */
    private static volatile C63010eb f345204d;

    /* renamed from: a */
    public int f345205a = 0;

    /* renamed from: b */
    public Object f345206b;

    static {
        C125133dg dgVar = new C125133dg();
        f345203c = dgVar;
        C62942bv.registerDefaultInstance(C125133dg.class, dgVar);
    }

    private C125133dg() {
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
                return newMessageInfo(f345203c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C125065at.class, C125084bl.class, C125177z.class, C125131de.class});
            case 3:
                return new C125133dg();
            case 4:
                return new C125132df();
            case 5:
                return f345203c;
            case 6:
                C63010eb ebVar = f345204d;
                if (ebVar == null) {
                    synchronized (C125133dg.class) {
                        ebVar = f345204d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345203c);
                            f345204d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
