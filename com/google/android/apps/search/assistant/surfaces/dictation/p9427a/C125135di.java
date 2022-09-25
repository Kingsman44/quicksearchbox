package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.di */
/* compiled from: PG */
public final class C125135di extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125135di f345207c;

    /* renamed from: d */
    private static volatile C63010eb f345208d;

    /* renamed from: a */
    public int f345209a = 0;

    /* renamed from: b */
    public Object f345210b;

    static {
        C125135di diVar = new C125135di();
        f345207c = diVar;
        C62942bv.registerDefaultInstance(C125135di.class, diVar);
    }

    private C125135di() {
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
                return newMessageInfo(f345207c, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C125129dc.class, C125127da.class, C125063ar.class});
            case 3:
                return new C125135di();
            case 4:
                return new C125134dh();
            case 5:
                return f345207c;
            case 6:
                C63010eb ebVar = f345208d;
                if (ebVar == null) {
                    synchronized (C125135di.class) {
                        ebVar = f345208d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345207c);
                            f345208d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
