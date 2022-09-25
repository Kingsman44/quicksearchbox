package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ji */
/* compiled from: PG */
public final class C52211ji extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52211ji f137015c;

    /* renamed from: d */
    private static volatile C63010eb f137016d;

    /* renamed from: a */
    public int f137017a;

    /* renamed from: b */
    public int f137018b;

    static {
        C52211ji jiVar = new C52211ji();
        f137015c = jiVar;
        C62942bv.registerDefaultInstance(C52211ji.class, jiVar);
    }

    private C52211ji() {
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
                return newMessageInfo(f137015c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52208jf.f137014a});
            case 3:
                return new C52211ji();
            case 4:
                return new C52210jh();
            case 5:
                return f137015c;
            case 6:
                C63010eb ebVar = f137016d;
                if (ebVar == null) {
                    synchronized (C52211ji.class) {
                        ebVar = f137016d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137015c);
                            f137016d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
