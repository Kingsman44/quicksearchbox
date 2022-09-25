package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.n */
/* compiled from: PG */
public final class C13460n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C13460n f41305b;

    /* renamed from: c */
    private static volatile C63010eb f41306c;

    /* renamed from: a */
    public C62971cq f41307a = emptyProtobufList();

    static {
        C13460n nVar = new C13460n();
        f41305b = nVar;
        C62942bv.registerDefaultInstance(C13460n.class, nVar);
    }

    private C13460n() {
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
                return newMessageInfo(f41305b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C13458l.class});
            case 3:
                return new C13460n();
            case 4:
                return new C13459m();
            case 5:
                return f41305b;
            case 6:
                C63010eb ebVar = f41306c;
                if (ebVar == null) {
                    synchronized (C13460n.class) {
                        ebVar = f41306c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41305b);
                            f41306c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
