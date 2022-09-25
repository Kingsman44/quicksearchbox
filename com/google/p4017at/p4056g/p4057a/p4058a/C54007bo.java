package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.g.a.a.bo */
/* compiled from: PG */
public final class C54007bo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54007bo f141701b;

    /* renamed from: c */
    private static volatile C63010eb f141702c;

    /* renamed from: a */
    public C63088z f141703a = C63088z.f170246b;

    static {
        C54007bo boVar = new C54007bo();
        f141701b = boVar;
        C62942bv.registerDefaultInstance(C54007bo.class, boVar);
    }

    private C54007bo() {
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
                return newMessageInfo(f141701b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C54007bo();
            case 4:
                return new C54006bn();
            case 5:
                return f141701b;
            case 6:
                C63010eb ebVar = f141702c;
                if (ebVar == null) {
                    synchronized (C54007bo.class) {
                        ebVar = f141702c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141701b);
                            f141702c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
