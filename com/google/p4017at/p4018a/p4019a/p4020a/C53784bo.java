package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.bo */
/* compiled from: PG */
public final class C53784bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53784bo f141169c;

    /* renamed from: d */
    private static volatile C63010eb f141170d;

    /* renamed from: a */
    public int f141171a;

    /* renamed from: b */
    public C53789bt f141172b;

    static {
        C53784bo boVar = new C53784bo();
        f141169c = boVar;
        C62942bv.registerDefaultInstance(C53784bo.class, boVar);
    }

    private C53784bo() {
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
                return newMessageInfo(f141169c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53784bo();
            case 4:
                return new C53783bn();
            case 5:
                return f141169c;
            case 6:
                C63010eb ebVar = f141170d;
                if (ebVar == null) {
                    synchronized (C53784bo.class) {
                        ebVar = f141170d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141169c);
                            f141170d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
