package com.google.android.apps.gsa.nga.engine.p6026f.p6028b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.b.n */
/* compiled from: PG */
public final class C76019n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76019n f210857b;

    /* renamed from: c */
    private static volatile C63010eb f210858c;

    /* renamed from: a */
    public int f210859a;

    static {
        C76019n nVar = new C76019n();
        f210857b = nVar;
        C62942bv.registerDefaultInstance(C76019n.class, nVar);
    }

    private C76019n() {
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
                return newMessageInfo(f210857b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C76019n();
            case 4:
                return new C76018m();
            case 5:
                return f210857b;
            case 6:
                C63010eb ebVar = f210858c;
                if (ebVar == null) {
                    synchronized (C76019n.class) {
                        ebVar = f210858c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210857b);
                            f210858c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
