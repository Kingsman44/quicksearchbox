package com.google.android.apps.gsa.shared.monet.p7070b.p7077ae;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.ae.f */
/* compiled from: PG */
public final class C90193f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C90193f f251961b;

    /* renamed from: c */
    private static volatile C63010eb f251962c;

    /* renamed from: a */
    public C62971cq f251963a = emptyProtobufList();

    static {
        C90193f fVar = new C90193f();
        f251961b = fVar;
        C62942bv.registerDefaultInstance(C90193f.class, fVar);
    }

    private C90193f() {
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
                return newMessageInfo(f251961b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C90192e.class});
            case 3:
                return new C90193f();
            case 4:
                return new C90190c();
            case 5:
                return f251961b;
            case 6:
                C63010eb ebVar = f251962c;
                if (ebVar == null) {
                    synchronized (C90193f.class) {
                        ebVar = f251962c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f251961b);
                            f251962c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
