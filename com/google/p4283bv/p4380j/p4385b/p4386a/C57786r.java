package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.j.b.a.r */
/* compiled from: PG */
public final class C57786r extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57786r f154390a;

    /* renamed from: b */
    public static final C62940bt f154391b;

    /* renamed from: d */
    private static volatile C63010eb f154392d;

    /* renamed from: c */
    private byte f154393c = 2;

    static {
        C57786r rVar = new C57786r();
        f154390a = rVar;
        C62942bv.registerDefaultInstance(C57786r.class, rVar);
        f154391b = C62942bv.newRepeatedGeneratedExtension(C57784p.f154382f, rVar, (C62958ce) null, 7, C63066gd.MESSAGE, false, C57786r.class);
    }

    private C57786r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154393c);
            case 1:
                this.f154393c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f154390a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57786r();
            case 4:
                return new C57785q();
            case 5:
                return f154390a;
            case 6:
                C63010eb ebVar = f154392d;
                if (ebVar == null) {
                    synchronized (C57786r.class) {
                        ebVar = f154392d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154390a);
                            f154392d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
