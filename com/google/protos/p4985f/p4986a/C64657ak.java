package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.ak */
/* compiled from: PG */
public final class C64657ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64657ak f175259b;

    /* renamed from: d */
    private static volatile C63010eb f175260d;

    /* renamed from: a */
    public int f175261a;

    /* renamed from: c */
    private int f175262c;

    static {
        C64657ak akVar = new C64657ak();
        f175259b = akVar;
        C62942bv.registerDefaultInstance(C64657ak.class, akVar);
    }

    private C64657ak() {
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
                return newMessageInfo(f175259b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဌ\u0005", new Object[]{C45240c.f118157a, "a", C64658al.f175263a});
            case 3:
                return new C64657ak();
            case 4:
                return new C64656aj();
            case 5:
                return f175259b;
            case 6:
                C63010eb ebVar = f175260d;
                if (ebVar == null) {
                    synchronized (C64657ak.class) {
                        ebVar = f175260d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175259b);
                            f175260d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
