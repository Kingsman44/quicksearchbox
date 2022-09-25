package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ad */
/* compiled from: PG */
public final class C125049ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125049ad f345018c;

    /* renamed from: d */
    private static volatile C63010eb f345019d;

    /* renamed from: a */
    public int f345020a = 0;

    /* renamed from: b */
    public Object f345021b;

    static {
        C125049ad adVar = new C125049ad();
        f345018c = adVar;
        C62942bv.registerDefaultInstance(C125049ad.class, adVar);
    }

    private C125049ad() {
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
                return newMessageInfo(f345018c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C125048ac.class, C62912at.class, C125048ac.class});
            case 3:
                return new C125049ad();
            case 4:
                return new C125046aa();
            case 5:
                return f345018c;
            case 6:
                C63010eb ebVar = f345019d;
                if (ebVar == null) {
                    synchronized (C125049ad.class) {
                        ebVar = f345019d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345018c);
                            f345019d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
