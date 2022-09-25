package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ab */
/* compiled from: PG */
public final class C53967ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53967ab f141600b;

    /* renamed from: c */
    private static volatile C63010eb f141601c;

    /* renamed from: a */
    public boolean f141602a;

    static {
        C53967ab abVar = new C53967ab();
        f141600b = abVar;
        C62942bv.registerDefaultInstance(C53967ab.class, abVar);
    }

    private C53967ab() {
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
                return newMessageInfo(f141600b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C53967ab();
            case 4:
                return new C53966aa();
            case 5:
                return f141600b;
            case 6:
                C63010eb ebVar = f141601c;
                if (ebVar == null) {
                    synchronized (C53967ab.class) {
                        ebVar = f141601c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141600b);
                            f141601c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
