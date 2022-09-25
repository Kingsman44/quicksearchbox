package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.am.d.a.cr */
/* compiled from: PG */
public final class C8771cr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8771cr f30135c;

    /* renamed from: d */
    private static volatile C63010eb f30136d;

    /* renamed from: a */
    public int f30137a;

    /* renamed from: b */
    public C63088z f30138b = C63088z.f170246b;

    static {
        C8771cr crVar = new C8771cr();
        f30135c = crVar;
        C62942bv.registerDefaultInstance(C8771cr.class, crVar);
    }

    private C8771cr() {
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
                return newMessageInfo(f30135c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C8771cr();
            case 4:
                return new C8770cq();
            case 5:
                return f30135c;
            case 6:
                C63010eb ebVar = f30136d;
                if (ebVar == null) {
                    synchronized (C8771cr.class) {
                        ebVar = f30136d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30135c);
                            f30136d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
