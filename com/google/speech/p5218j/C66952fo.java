package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.fo */
/* compiled from: PG */
public final class C66952fo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66952fo f181998c;

    /* renamed from: d */
    private static volatile C63010eb f181999d;

    /* renamed from: a */
    public C62971cq f182000a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f182001b = emptyProtobufList();

    static {
        C66952fo foVar = new C66952fo();
        f181998c = foVar;
        C62942bv.registerDefaultInstance(C66952fo.class, foVar);
    }

    private C66952fo() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f181998c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", C66844bv.class, "b", C66946fi.class});
            case 3:
                return new C66952fo();
            case 4:
                return new C66951fn();
            case 5:
                return f181998c;
            case 6:
                C63010eb ebVar = f181999d;
                if (ebVar == null) {
                    synchronized (C66952fo.class) {
                        ebVar = f181999d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181998c);
                            f181999d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
