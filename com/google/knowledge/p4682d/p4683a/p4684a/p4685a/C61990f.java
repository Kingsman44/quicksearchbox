package com.google.knowledge.p4682d.p4683a.p4684a.p4685a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.d.a.a.a.f */
/* compiled from: PG */
public final class C61990f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61990f f167528b;

    /* renamed from: c */
    private static volatile C63010eb f167529c;

    /* renamed from: a */
    public C61986b f167530a;

    static {
        C61990f fVar = new C61990f();
        f167528b = fVar;
        C62942bv.registerDefaultInstance(C61990f.class, fVar);
    }

    private C61990f() {
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
                return newMessageInfo(f167528b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C61990f();
            case 4:
                return new C61989e();
            case 5:
                return f167528b;
            case 6:
                C63010eb ebVar = f167529c;
                if (ebVar == null) {
                    synchronized (C61990f.class) {
                        ebVar = f167529c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167528b);
                            f167529c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
