package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.is */
/* compiled from: PG */
public final class C7754is extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7754is f27157b;

    /* renamed from: c */
    private static volatile C63010eb f27158c;

    /* renamed from: a */
    public C62961ch f27159a = emptyIntList();

    static {
        C7754is isVar = new C7754is();
        f27157b = isVar;
        C62942bv.registerDefaultInstance(C7754is.class, isVar);
    }

    private C7754is() {
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
                return newMessageInfo(f27157b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C7754is();
            case 4:
                return new C7753ir();
            case 5:
                return f27157b;
            case 6:
                C63010eb ebVar = f27158c;
                if (ebVar == null) {
                    synchronized (C7754is.class) {
                        ebVar = f27158c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27157b);
                            f27158c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
