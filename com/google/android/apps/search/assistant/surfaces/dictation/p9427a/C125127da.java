package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.da */
/* compiled from: PG */
public final class C125127da extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125127da f345192b;

    /* renamed from: c */
    private static volatile C63010eb f345193c;

    /* renamed from: a */
    public int f345194a;

    static {
        C125127da daVar = new C125127da();
        f345192b = daVar;
        C62942bv.registerDefaultInstance(C125127da.class, daVar);
    }

    private C125127da() {
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
                return newMessageInfo(f345192b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
            case 3:
                return new C125127da();
            case 4:
                return new C125125cz();
            case 5:
                return f345192b;
            case 6:
                C63010eb ebVar = f345193c;
                if (ebVar == null) {
                    synchronized (C125127da.class) {
                        ebVar = f345193c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345192b);
                            f345193c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
