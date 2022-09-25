package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lv */
/* compiled from: PG */
public final class C67121lv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67121lv f182461b;

    /* renamed from: c */
    private static volatile C63010eb f182462c;

    /* renamed from: a */
    public C62971cq f182463a = emptyProtobufList();

    static {
        C67121lv lvVar = new C67121lv();
        f182461b = lvVar;
        C62942bv.registerDefaultInstance(C67121lv.class, lvVar);
    }

    private C67121lv() {
        emptyProtobufList();
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
                return newMessageInfo(f182461b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C67128mb.class});
            case 3:
                return new C67121lv();
            case 4:
                return new C67120lu();
            case 5:
                return f182461b;
            case 6:
                C63010eb ebVar = f182462c;
                if (ebVar == null) {
                    synchronized (C67121lv.class) {
                        ebVar = f182462c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182461b);
                            f182462c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
