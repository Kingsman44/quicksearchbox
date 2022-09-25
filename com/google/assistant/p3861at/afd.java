package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.afd */
/* compiled from: PG */
public final class afd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final afd f129146a;

    /* renamed from: c */
    private static volatile C63010eb f129147c;

    /* renamed from: b */
    private C62995dn f129148b = C62995dn.f170057a;

    static {
        afd afd = new afd();
        f129146a = afd;
        C62942bv.registerDefaultInstance(afd.class, afd);
    }

    private afd() {
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
                return newMessageInfo(f129146a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", afa.f129143a});
            case 3:
                return new afd();
            case 4:
                return new aez();
            case 5:
                return f129146a;
            case 6:
                C63010eb ebVar = f129147c;
                if (ebVar == null) {
                    synchronized (afd.class) {
                        ebVar = f129147c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129146a);
                            f129147c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
