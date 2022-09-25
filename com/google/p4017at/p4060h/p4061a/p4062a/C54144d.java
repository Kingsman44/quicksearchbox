package com.google.p4017at.p4060h.p4061a.p4062a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.C8577d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d */
/* compiled from: PG */
public final class C54144d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54144d f142090b;

    /* renamed from: e */
    private static volatile C63010eb f142091e;

    /* renamed from: a */
    public C8577d f142092a;

    /* renamed from: c */
    private int f142093c;

    /* renamed from: d */
    private byte f142094d = 2;

    static {
        C54144d dVar = new C54144d();
        f142090b = dVar;
        C62942bv.registerDefaultInstance(C54144d.class, dVar);
    }

    private C54144d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142094d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142094d = b;
                return null;
            case 2:
                return newMessageInfo(f142090b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54144d();
            case 4:
                return new C54133c();
            case 5:
                return f142090b;
            case 6:
                C63010eb ebVar = f142091e;
                if (ebVar == null) {
                    synchronized (C54144d.class) {
                        ebVar = f142091e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142090b);
                            f142091e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
