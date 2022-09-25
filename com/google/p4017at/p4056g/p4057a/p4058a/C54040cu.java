package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4695b.C62158d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.cu */
/* compiled from: PG */
public final class C54040cu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54040cu f141789d;

    /* renamed from: e */
    private static volatile C63010eb f141790e;

    /* renamed from: a */
    public int f141791a;

    /* renamed from: b */
    public C56244ay f141792b;

    /* renamed from: c */
    public C62971cq f141793c = emptyProtobufList();

    static {
        C54040cu cuVar = new C54040cu();
        f141789d = cuVar;
        C62942bv.registerDefaultInstance(C54040cu.class, cuVar);
    }

    private C54040cu() {
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
                return newMessageInfo(f141789d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", C45240c.f118157a, C62158d.class, "b"});
            case 3:
                return new C54040cu();
            case 4:
                return new C54039ct();
            case 5:
                return f141789d;
            case 6:
                C63010eb ebVar = f141790e;
                if (ebVar == null) {
                    synchronized (C54040cu.class) {
                        ebVar = f141790e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141789d);
                            f141790e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
