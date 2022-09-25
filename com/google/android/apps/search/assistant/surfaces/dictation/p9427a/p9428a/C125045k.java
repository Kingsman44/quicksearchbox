package com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.a.k */
/* compiled from: PG */
public final class C125045k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125045k f345012c;

    /* renamed from: d */
    private static volatile C63010eb f345013d;

    /* renamed from: a */
    public int f345014a;

    /* renamed from: b */
    public C125040f f345015b;

    static {
        C125045k kVar = new C125045k();
        f345012c = kVar;
        C62942bv.registerDefaultInstance(C125045k.class, kVar);
    }

    private C125045k() {
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
                return newMessageInfo(f345012c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C125045k();
            case 4:
                return new C125043i();
            case 5:
                return f345012c;
            case 6:
                C63010eb ebVar = f345013d;
                if (ebVar == null) {
                    synchronized (C125045k.class) {
                        ebVar = f345013d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345012c);
                            f345013d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
