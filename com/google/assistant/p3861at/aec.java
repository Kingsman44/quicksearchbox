package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aec */
/* compiled from: PG */
public final class aec extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aec f129093c;

    /* renamed from: d */
    private static volatile C63010eb f129094d;

    /* renamed from: a */
    public int f129095a;

    /* renamed from: b */
    public int f129096b;

    static {
        aec aec = new aec();
        f129093c = aec;
        C62942bv.registerDefaultInstance(aec.class, aec);
    }

    private aec() {
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
                return newMessageInfo(f129093c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aeb.f129092a});
            case 3:
                return new aec();
            case 4:
                return new aea();
            case 5:
                return f129093c;
            case 6:
                C63010eb ebVar = f129094d;
                if (ebVar == null) {
                    synchronized (aec.class) {
                        ebVar = f129094d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129093c);
                            f129094d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
