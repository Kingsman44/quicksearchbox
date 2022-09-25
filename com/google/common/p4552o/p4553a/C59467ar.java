package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ar */
/* compiled from: PG */
public final class C59467ar extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59467ar f157757e;

    /* renamed from: f */
    private static volatile C63010eb f157758f;

    /* renamed from: a */
    public int f157759a;

    /* renamed from: b */
    public String f157760b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f157761c;

    /* renamed from: d */
    public int f157762d;

    static {
        C59467ar arVar = new C59467ar();
        f157757e = arVar;
        C62942bv.registerDefaultInstance(C59467ar.class, arVar);
    }

    private C59467ar() {
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
                return newMessageInfo(f157757e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59467ar();
            case 4:
                return new C59466aq();
            case 5:
                return f157757e;
            case 6:
                C63010eb ebVar = f157758f;
                if (ebVar == null) {
                    synchronized (C59467ar.class) {
                        ebVar = f157758f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157757e);
                            f157758f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
