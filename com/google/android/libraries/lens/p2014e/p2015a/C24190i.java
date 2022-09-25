package com.google.android.libraries.lens.p2014e.p2015a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.i */
/* compiled from: PG */
public final class C24190i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C24190i f66117b;

    /* renamed from: c */
    private static volatile C63010eb f66118c;

    /* renamed from: a */
    public C24183b f66119a;

    static {
        C24190i iVar = new C24190i();
        f66117b = iVar;
        C62942bv.registerDefaultInstance(C24190i.class, iVar);
    }

    private C24190i() {
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
                return newMessageInfo(f66117b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C24190i();
            case 4:
                return new C24189h();
            case 5:
                return f66117b;
            case 6:
                C63010eb ebVar = f66118c;
                if (ebVar == null) {
                    synchronized (C24190i.class) {
                        ebVar = f66118c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66117b);
                            f66118c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
