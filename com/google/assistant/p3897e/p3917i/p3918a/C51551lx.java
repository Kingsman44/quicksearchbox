package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.lx */
/* compiled from: PG */
public final class C51551lx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51551lx f134363d;

    /* renamed from: e */
    private static volatile C63010eb f134364e;

    /* renamed from: a */
    public int f134365a;

    /* renamed from: b */
    public boolean f134366b;

    /* renamed from: c */
    public int f134367c;

    static {
        C51551lx lxVar = new C51551lx();
        f134363d = lxVar;
        C62942bv.registerDefaultInstance(C51551lx.class, lxVar);
    }

    private C51551lx() {
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
                return newMessageInfo(f134363d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C51550lw.f134362a});
            case 3:
                return new C51551lx();
            case 4:
                return new C51549lv();
            case 5:
                return f134363d;
            case 6:
                C63010eb ebVar = f134364e;
                if (ebVar == null) {
                    synchronized (C51551lx.class) {
                        ebVar = f134364e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134363d);
                            f134364e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
