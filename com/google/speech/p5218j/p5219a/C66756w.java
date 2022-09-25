package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.w */
/* compiled from: PG */
public final class C66756w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66756w f181566b;

    /* renamed from: c */
    private static volatile C63010eb f181567c;

    /* renamed from: a */
    public C62971cq f181568a = C62942bv.emptyProtobufList();

    static {
        C66756w wVar = new C66756w();
        f181566b = wVar;
        C62942bv.registerDefaultInstance(C66756w.class, wVar);
    }

    private C66756w() {
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
                return newMessageInfo(f181566b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C66756w();
            case 4:
                return new C66755v();
            case 5:
                return f181566b;
            case 6:
                C63010eb ebVar = f181567c;
                if (ebVar == null) {
                    synchronized (C66756w.class) {
                        ebVar = f181567c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181566b);
                            f181567c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
