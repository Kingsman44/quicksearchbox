package com.google.p4242bp.p4243a.p4244a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.a.n */
/* compiled from: PG */
public final class C56140n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56140n f149564c;

    /* renamed from: d */
    private static volatile C63010eb f149565d;

    /* renamed from: a */
    public int f149566a;

    /* renamed from: b */
    public boolean f149567b;

    static {
        C56140n nVar = new C56140n();
        f149564c = nVar;
        C62942bv.registerDefaultInstance(C56140n.class, nVar);
    }

    private C56140n() {
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
                return newMessageInfo(f149564c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56140n();
            case 4:
                return new C56139m();
            case 5:
                return f149564c;
            case 6:
                C63010eb ebVar = f149565d;
                if (ebVar == null) {
                    synchronized (C56140n.class) {
                        ebVar = f149565d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149564c);
                            f149565d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
