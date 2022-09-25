package com.google.android.apps.search.podcasts.p10590o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.podcasts.o.y */
/* compiled from: PG */
public final class C140732y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C140732y f382164d;

    /* renamed from: e */
    private static volatile C63010eb f382165e;

    /* renamed from: a */
    public C140704ae f382166a;

    /* renamed from: b */
    public C140730w f382167b;

    /* renamed from: c */
    public C63042fg f382168c;

    static {
        C140732y yVar = new C140732y();
        f382164d = yVar;
        C62942bv.registerDefaultInstance(C140732y.class, yVar);
    }

    private C140732y() {
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
                return newMessageInfo(f382164d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C140732y();
            case 4:
                return new C140731x();
            case 5:
                return f382164d;
            case 6:
                C63010eb ebVar = f382165e;
                if (ebVar == null) {
                    synchronized (C140732y.class) {
                        ebVar = f382165e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382164d);
                            f382165e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
