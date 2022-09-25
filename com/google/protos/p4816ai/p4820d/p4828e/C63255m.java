package com.google.protos.p4816ai.p4820d.p4828e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.e.m */
/* compiled from: PG */
public final class C63255m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63255m f170914c;

    /* renamed from: d */
    private static volatile C63010eb f170915d;

    /* renamed from: a */
    public int f170916a;

    /* renamed from: b */
    public C63254l f170917b;

    static {
        C63255m mVar = new C63255m();
        f170914c = mVar;
        C62942bv.registerDefaultInstance(C63255m.class, mVar);
    }

    private C63255m() {
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
                return newMessageInfo(f170914c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63255m();
            case 4:
                return new C63252j();
            case 5:
                return f170914c;
            case 6:
                C63010eb ebVar = f170915d;
                if (ebVar == null) {
                    synchronized (C63255m.class) {
                        ebVar = f170915d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170914c);
                            f170915d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
