package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.ch */
/* compiled from: PG */
public final class C57618ch extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57618ch f153909b;

    /* renamed from: e */
    private static volatile C63010eb f153910e;

    /* renamed from: a */
    public C57569am f153911a;

    /* renamed from: c */
    private C57578av f153912c;

    /* renamed from: d */
    private byte f153913d = 2;

    static {
        C57618ch chVar = new C57618ch();
        f153909b = chVar;
        C62942bv.registerDefaultInstance(C57618ch.class, chVar);
    }

    private C57618ch() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153913d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153913d = b;
                return null;
            case 2:
                return newMessageInfo(f153909b, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001Љ\u0002Љ", new Object[]{"a", C45240c.f118157a});
            case 3:
                return new C57618ch();
            case 4:
                return new C57617cg();
            case 5:
                return f153909b;
            case 6:
                C63010eb ebVar = f153910e;
                if (ebVar == null) {
                    synchronized (C57618ch.class) {
                        ebVar = f153910e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153909b);
                            f153910e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
