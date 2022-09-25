package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.ab */
/* compiled from: PG */
public final class C67645ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67645ab f183591b;

    /* renamed from: c */
    private static volatile C63010eb f183592c;

    /* renamed from: a */
    public int f183593a;

    static {
        C67645ab abVar = new C67645ab();
        f183591b = abVar;
        C62942bv.registerDefaultInstance(C67645ab.class, abVar);
    }

    private C67645ab() {
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
                return newMessageInfo(f183591b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            case 3:
                return new C67645ab();
            case 4:
                return new C67644aa();
            case 5:
                return f183591b;
            case 6:
                C63010eb ebVar = f183592c;
                if (ebVar == null) {
                    synchronized (C67645ab.class) {
                        ebVar = f183592c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183591b);
                            f183592c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
