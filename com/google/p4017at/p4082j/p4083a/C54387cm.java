package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.cm */
/* compiled from: PG */
public final class C54387cm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54387cm f142850b;

    /* renamed from: c */
    private static volatile C63010eb f142851c;

    /* renamed from: a */
    public int f142852a;

    static {
        C54387cm cmVar = new C54387cm();
        f142850b = cmVar;
        C62942bv.registerDefaultInstance(C54387cm.class, cmVar);
    }

    private C54387cm() {
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
                return newMessageInfo(f142850b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0004", new Object[]{"a"});
            case 3:
                return new C54387cm();
            case 4:
                return new C54386cl();
            case 5:
                return f142850b;
            case 6:
                C63010eb ebVar = f142851c;
                if (ebVar == null) {
                    synchronized (C54387cm.class) {
                        ebVar = f142851c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142850b);
                            f142851c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
