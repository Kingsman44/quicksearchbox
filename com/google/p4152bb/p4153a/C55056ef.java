package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ef */
/* compiled from: PG */
public final class C55056ef extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55056ef f144845a;

    /* renamed from: b */
    public static final C62940bt f144846b;

    /* renamed from: c */
    private static volatile C63010eb f144847c;

    static {
        C55056ef efVar = new C55056ef();
        f144845a = efVar;
        C62942bv.registerDefaultInstance(C55056ef.class, efVar);
        f144846b = C62942bv.newSingularGeneratedExtension(C55029df.f144771d, efVar, efVar, (C62958ce) null, 91799776, C63066gd.MESSAGE, C55056ef.class);
    }

    private C55056ef() {
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
                return newMessageInfo(f144845a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55056ef();
            case 4:
                return new C55055ee();
            case 5:
                return f144845a;
            case 6:
                C63010eb ebVar = f144847c;
                if (ebVar == null) {
                    synchronized (C55056ef.class) {
                        ebVar = f144847c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144845a);
                            f144847c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
