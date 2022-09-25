package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.ab */
/* compiled from: PG */
public final class C54658ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54658ab f143490d;

    /* renamed from: e */
    private static volatile C63010eb f143491e;

    /* renamed from: a */
    public int f143492a = 0;

    /* renamed from: b */
    public Object f143493b;

    /* renamed from: c */
    public C54693bj f143494c;

    static {
        C54658ab abVar = new C54658ab();
        f143490d = abVar;
        C62942bv.registerDefaultInstance(C54658ab.class, abVar);
    }

    private C54658ab() {
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
                return newMessageInfo(f143490d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C45240c.f118157a, C54682az.class, C54662af.class});
            case 3:
                return new C54658ab();
            case 4:
                return new C54657aa();
            case 5:
                return f143490d;
            case 6:
                C63010eb ebVar = f143491e;
                if (ebVar == null) {
                    synchronized (C54658ab.class) {
                        ebVar = f143491e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143490d);
                            f143491e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
