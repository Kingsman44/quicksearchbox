package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.f */
/* compiled from: PG */
public final class C56308f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56308f f150069b;

    /* renamed from: c */
    private static volatile C63010eb f150070c;

    /* renamed from: a */
    public C62971cq f150071a = C62942bv.emptyProtobufList();

    static {
        C56308f fVar = new C56308f();
        f150069b = fVar;
        C62942bv.registerDefaultInstance(C56308f.class, fVar);
    }

    private C56308f() {
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
                return newMessageInfo(f150069b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C56308f();
            case 4:
                return new C56307e();
            case 5:
                return f150069b;
            case 6:
                C63010eb ebVar = f150070c;
                if (ebVar == null) {
                    synchronized (C56308f.class) {
                        ebVar = f150070c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150069b);
                            f150070c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
