package com.google.protos.p4985f.p5030q;

import com.google.p4280bt.C56488d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.dr */
/* compiled from: PG */
public final class C65157dr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65157dr f176335c;

    /* renamed from: d */
    private static volatile C63010eb f176336d;

    /* renamed from: a */
    public int f176337a = 0;

    /* renamed from: b */
    public Object f176338b;

    static {
        C65157dr drVar = new C65157dr();
        f176335c = drVar;
        C62942bv.registerDefaultInstance(C65157dr.class, drVar);
    }

    private C65157dr() {
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
                return newMessageInfo(f176335c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဵ\u0000", new Object[]{"b", "a", C56488d.class});
            case 3:
                return new C65157dr();
            case 4:
                return new C65156dq();
            case 5:
                return f176335c;
            case 6:
                C63010eb ebVar = f176336d;
                if (ebVar == null) {
                    synchronized (C65157dr.class) {
                        ebVar = f176336d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176335c);
                            f176336d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
