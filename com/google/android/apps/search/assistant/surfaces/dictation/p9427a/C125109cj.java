package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cj */
/* compiled from: PG */
public final class C125109cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125109cj f345141c;

    /* renamed from: d */
    private static volatile C63010eb f345142d;

    /* renamed from: a */
    public int f345143a = 0;

    /* renamed from: b */
    public Object f345144b;

    static {
        C125109cj cjVar = new C125109cj();
        f345141c = cjVar;
        C62942bv.registerDefaultInstance(C125109cj.class, cjVar);
    }

    private C125109cj() {
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
                return newMessageInfo(f345141c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C125105cf.class, C62912at.class});
            case 3:
                return new C125109cj();
            case 4:
                return new C125107ch();
            case 5:
                return f345141c;
            case 6:
                C63010eb ebVar = f345142d;
                if (ebVar == null) {
                    synchronized (C125109cj.class) {
                        ebVar = f345142d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345141c);
                            f345142d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
