package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cr */
/* compiled from: PG */
public final class C56291cr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56291cr f150010c;

    /* renamed from: e */
    private static volatile C63010eb f150011e;

    /* renamed from: a */
    public int f150012a;

    /* renamed from: b */
    public C62971cq f150013b = emptyProtobufList();

    /* renamed from: d */
    private int f150014d;

    static {
        C56291cr crVar = new C56291cr();
        f150010c = crVar;
        C62942bv.registerDefaultInstance(C56291cr.class, crVar);
    }

    private C56291cr() {
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
                return newMessageInfo(f150010c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", C56289cp.f150009a, "b", C56287cn.class});
            case 3:
                return new C56291cr();
            case 4:
                return new C56288co();
            case 5:
                return f150010c;
            case 6:
                C63010eb ebVar = f150011e;
                if (ebVar == null) {
                    synchronized (C56291cr.class) {
                        ebVar = f150011e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150010c);
                            f150011e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
