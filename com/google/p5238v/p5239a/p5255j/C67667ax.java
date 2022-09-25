package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.ax */
/* compiled from: PG */
public final class C67667ax extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67667ax f183633a;

    /* renamed from: b */
    private static volatile C63010eb f183634b;

    static {
        C67667ax axVar = new C67667ax();
        f183633a = axVar;
        C62942bv.registerDefaultInstance(C67667ax.class, axVar);
    }

    private C67667ax() {
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
                return newMessageInfo(f183633a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C67667ax();
            case 4:
                return new C67666aw();
            case 5:
                return f183633a;
            case 6:
                C63010eb ebVar = f183634b;
                if (ebVar == null) {
                    synchronized (C67667ax.class) {
                        ebVar = f183634b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183633a);
                            f183634b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
