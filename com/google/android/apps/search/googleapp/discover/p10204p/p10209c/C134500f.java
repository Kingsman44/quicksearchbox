package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.f */
/* compiled from: PG */
public final class C134500f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C134500f f366284b;

    /* renamed from: c */
    private static volatile C63010eb f366285c;

    /* renamed from: a */
    public C62971cq f366286a = emptyProtobufList();

    static {
        C134500f fVar = new C134500f();
        f366284b = fVar;
        C62942bv.registerDefaultInstance(C134500f.class, fVar);
    }

    private C134500f() {
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
                return newMessageInfo(f366284b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C134508n.class});
            case 3:
                return new C134500f();
            case 4:
                return new C134499e();
            case 5:
                return f366284b;
            case 6:
                C63010eb ebVar = f366285c;
                if (ebVar == null) {
                    synchronized (C134500f.class) {
                        ebVar = f366285c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366284b);
                            f366285c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
