package com.google.p4017at.p4027c.p4028a.p4029a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.ae */
/* compiled from: PG */
public final class C53839ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53839ae f141304d;

    /* renamed from: e */
    private static volatile C63010eb f141305e;

    /* renamed from: a */
    public C58070b f141306a;

    /* renamed from: b */
    public C58070b f141307b;

    /* renamed from: c */
    public C53861u f141308c;

    static {
        C53839ae aeVar = new C53839ae();
        f141304d = aeVar;
        C62942bv.registerDefaultInstance(C53839ae.class, aeVar);
    }

    private C53839ae() {
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
                return newMessageInfo(f141304d, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\t\u0004\t\u0005\t", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C53839ae();
            case 4:
                return new C53838ad();
            case 5:
                return f141304d;
            case 6:
                C63010eb ebVar = f141305e;
                if (ebVar == null) {
                    synchronized (C53839ae.class) {
                        ebVar = f141305e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141304d);
                            f141305e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
