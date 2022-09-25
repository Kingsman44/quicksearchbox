package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57299d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.az */
/* compiled from: PG */
public final class C57084az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57084az f152390b;

    /* renamed from: e */
    private static volatile C63010eb f152391e;

    /* renamed from: a */
    public C57299d f152392a;

    /* renamed from: c */
    private int f152393c;

    /* renamed from: d */
    private byte f152394d = 2;

    static {
        C57084az azVar = new C57084az();
        f152390b = azVar;
        C62942bv.registerDefaultInstance(C57084az.class, azVar);
    }

    private C57084az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152394d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152394d = b;
                return null;
            case 2:
                return newMessageInfo(f152390b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57084az();
            case 4:
                return new C57083ay();
            case 5:
                return f152390b;
            case 6:
                C63010eb ebVar = f152391e;
                if (ebVar == null) {
                    synchronized (C57084az.class) {
                        ebVar = f152391e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152390b);
                            f152391e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
