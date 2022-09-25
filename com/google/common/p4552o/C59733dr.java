package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.dr */
/* compiled from: PG */
public final class C59733dr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59733dr f160330d;

    /* renamed from: e */
    private static volatile C63010eb f160331e;

    /* renamed from: a */
    public int f160332a;

    /* renamed from: b */
    public boolean f160333b;

    /* renamed from: c */
    public boolean f160334c;

    static {
        C59733dr drVar = new C59733dr();
        f160330d = drVar;
        C62942bv.registerDefaultInstance(C59733dr.class, drVar);
    }

    private C59733dr() {
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
                return newMessageInfo(f160330d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59733dr();
            case 4:
                return new C59732dq();
            case 5:
                return f160330d;
            case 6:
                C63010eb ebVar = f160331e;
                if (ebVar == null) {
                    synchronized (C59733dr.class) {
                        ebVar = f160331e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160330d);
                            f160331e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
