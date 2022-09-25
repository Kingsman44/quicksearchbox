package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.af */
/* compiled from: PG */
public final class C67649af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67649af f183599c;

    /* renamed from: d */
    private static volatile C63010eb f183600d;

    /* renamed from: a */
    public C67651ah f183601a;

    /* renamed from: b */
    public int f183602b;

    static {
        C67649af afVar = new C67649af();
        f183599c = afVar;
        C62942bv.registerDefaultInstance(C67649af.class, afVar);
    }

    private C67649af() {
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
                return newMessageInfo(f183599c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "b"});
            case 3:
                return new C67649af();
            case 4:
                return new C67648ae();
            case 5:
                return f183599c;
            case 6:
                C63010eb ebVar = f183600d;
                if (ebVar == null) {
                    synchronized (C67649af.class) {
                        ebVar = f183600d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183599c);
                            f183600d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
