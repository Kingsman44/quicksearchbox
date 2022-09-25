package com.google.android.apps.gsa.shared.p6970ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ab.b */
/* compiled from: PG */
public final class C89072b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C89072b f241388b;

    /* renamed from: c */
    private static volatile C63010eb f241389c;

    /* renamed from: a */
    public C62971cq f241390a = emptyProtobufList();

    static {
        C89072b bVar = new C89072b();
        f241388b = bVar;
        C62942bv.registerDefaultInstance(C89072b.class, bVar);
    }

    private C89072b() {
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
                return newMessageInfo(f241388b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C89074d.class});
            case 3:
                return new C89072b();
            case 4:
                return new C89071a();
            case 5:
                return f241388b;
            case 6:
                C63010eb ebVar = f241389c;
                if (ebVar == null) {
                    synchronized (C89072b.class) {
                        ebVar = f241389c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241388b);
                            f241389c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
