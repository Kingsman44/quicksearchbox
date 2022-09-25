package com.google.android.apps.p8928i.p8929a.p8930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.i.a.a.d */
/* compiled from: PG */
public final class C119148d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119148d f332313c;

    /* renamed from: d */
    private static volatile C63010eb f332314d;

    /* renamed from: a */
    public C62971cq f332315a = emptyProtobufList();

    /* renamed from: b */
    public C119147c f332316b;

    static {
        C119148d dVar = new C119148d();
        f332313c = dVar;
        C62942bv.registerDefaultInstance(C119148d.class, dVar);
    }

    private C119148d() {
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
                return newMessageInfo(f332313c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001c\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C119148d();
            case 4:
                return new C119145a();
            case 5:
                return f332313c;
            case 6:
                C63010eb ebVar = f332314d;
                if (ebVar == null) {
                    synchronized (C119148d.class) {
                        ebVar = f332314d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332313c);
                            f332314d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
