package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57653n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.j */
/* compiled from: PG */
public final class C54473j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54473j f143029b;

    /* renamed from: c */
    private static volatile C63010eb f143030c;

    /* renamed from: a */
    public C57653n f143031a;

    static {
        C54473j jVar = new C54473j();
        f143029b = jVar;
        C62942bv.registerDefaultInstance(C54473j.class, jVar);
    }

    private C54473j() {
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
                return newMessageInfo(f143029b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54473j();
            case 4:
                return new C54472i();
            case 5:
                return f143029b;
            case 6:
                C63010eb ebVar = f143030c;
                if (ebVar == null) {
                    synchronized (C54473j.class) {
                        ebVar = f143030c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143029b);
                            f143030c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
