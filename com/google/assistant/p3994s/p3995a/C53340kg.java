package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.kg */
/* compiled from: PG */
public final class C53340kg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53340kg f139969b;

    /* renamed from: d */
    private static volatile C63010eb f139970d;

    /* renamed from: a */
    public String f139971a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f139972c;

    static {
        C53340kg kgVar = new C53340kg();
        f139969b = kgVar;
        C62942bv.registerDefaultInstance(C53340kg.class, kgVar);
    }

    private C53340kg() {
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
                return newMessageInfo(f139969b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53340kg();
            case 4:
                return new C53339kf();
            case 5:
                return f139969b;
            case 6:
                C63010eb ebVar = f139970d;
                if (ebVar == null) {
                    synchronized (C53340kg.class) {
                        ebVar = f139970d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139969b);
                            f139970d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
