package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62485dh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cn */
/* compiled from: PG */
public final class C56287cn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56287cn f150005b;

    /* renamed from: d */
    private static volatile C63010eb f150006d;

    /* renamed from: a */
    public C62485dh f150007a;

    /* renamed from: c */
    private int f150008c;

    static {
        C56287cn cnVar = new C56287cn();
        f150005b = cnVar;
        C62942bv.registerDefaultInstance(C56287cn.class, cnVar);
    }

    private C56287cn() {
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
                return newMessageInfo(f150005b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56287cn();
            case 4:
                return new C56286cm();
            case 5:
                return f150005b;
            case 6:
                C63010eb ebVar = f150006d;
                if (ebVar == null) {
                    synchronized (C56287cn.class) {
                        ebVar = f150006d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150005b);
                            f150006d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
