package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.co */
/* compiled from: PG */
public final class C55011co extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55011co f144730a;

    /* renamed from: b */
    public static final C62940bt f144731b;

    /* renamed from: c */
    private static volatile C63010eb f144732c;

    static {
        C55011co coVar = new C55011co();
        f144730a = coVar;
        C62942bv.registerDefaultInstance(C55011co.class, coVar);
        f144731b = C62942bv.newSingularGeneratedExtension(C55005ci.f144714d, coVar, coVar, (C62958ce) null, 95309692, C63066gd.MESSAGE, C55011co.class);
    }

    private C55011co() {
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
                return newMessageInfo(f144730a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55011co();
            case 4:
                return new C55010cn();
            case 5:
                return f144730a;
            case 6:
                C63010eb ebVar = f144732c;
                if (ebVar == null) {
                    synchronized (C55011co.class) {
                        ebVar = f144732c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144730a);
                            f144732c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
