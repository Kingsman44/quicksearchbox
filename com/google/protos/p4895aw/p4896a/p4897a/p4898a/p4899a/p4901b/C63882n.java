package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.protos.aw.a.a.a.a.b.n */
/* compiled from: PG */
public final class C63882n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63882n f172730c;

    /* renamed from: d */
    public static final C62940bt f172731d;

    /* renamed from: e */
    private static volatile C63010eb f172732e;

    /* renamed from: a */
    public int f172733a;

    /* renamed from: b */
    public int f172734b;

    static {
        C63882n nVar = new C63882n();
        f172730c = nVar;
        C62942bv.registerDefaultInstance(C63882n.class, nVar);
        f172731d = C62942bv.newSingularGeneratedExtension(C63955s.f172966b, nVar, nVar, (C62958ce) null, 1002, C63066gd.MESSAGE, C63882n.class);
    }

    private C63882n() {
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
                return newMessageInfo(f172730c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C63880l.f172729a});
            case 3:
                return new C63882n();
            case 4:
                return new C63879k();
            case 5:
                return f172730c;
            case 6:
                C63010eb ebVar = f172732e;
                if (ebVar == null) {
                    synchronized (C63882n.class) {
                        ebVar = f172732e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172730c);
                            f172732e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
