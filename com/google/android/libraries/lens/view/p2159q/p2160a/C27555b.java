package com.google.android.libraries.lens.view.p2159q.p2160a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.q.a.b */
/* compiled from: PG */
public final class C27555b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C27555b f75341b;

    /* renamed from: c */
    private static volatile C63010eb f75342c;

    /* renamed from: a */
    public C62971cq f75343a = C62942bv.emptyProtobufList();

    static {
        C27555b bVar = new C27555b();
        f75341b = bVar;
        C62942bv.registerDefaultInstance(C27555b.class, bVar);
    }

    private C27555b() {
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
                return newMessageInfo(f75341b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C27555b();
            case 4:
                return new C27550a();
            case 5:
                return f75341b;
            case 6:
                C63010eb ebVar = f75342c;
                if (ebVar == null) {
                    synchronized (C27555b.class) {
                        ebVar = f75342c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f75341b);
                            f75342c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
