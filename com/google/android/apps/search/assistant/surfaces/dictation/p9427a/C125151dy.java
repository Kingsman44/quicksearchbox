package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.dy */
/* compiled from: PG */
public final class C125151dy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125151dy f345235c;

    /* renamed from: d */
    private static volatile C63010eb f345236d;

    /* renamed from: a */
    public int f345237a = 0;

    /* renamed from: b */
    public Object f345238b;

    static {
        C125151dy dyVar = new C125151dy();
        f345235c = dyVar;
        C62942bv.registerDefaultInstance(C125151dy.class, dyVar);
    }

    private C125151dy() {
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
                return newMessageInfo(f345235c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C125161j.class, C125166o.class});
            case 3:
                return new C125151dy();
            case 4:
                return new C125150dx();
            case 5:
                return f345235c;
            case 6:
                C63010eb ebVar = f345236d;
                if (ebVar == null) {
                    synchronized (C125151dy.class) {
                        ebVar = f345236d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345235c);
                            f345236d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
