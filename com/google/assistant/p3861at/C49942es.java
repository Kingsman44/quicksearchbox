package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.es */
/* compiled from: PG */
public final class C49942es extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49942es f129805a;

    /* renamed from: c */
    private static volatile C63010eb f129806c;

    /* renamed from: b */
    private C62995dn f129807b = C62995dn.f170057a;

    static {
        C49942es esVar = new C49942es();
        f129805a = esVar;
        C62942bv.registerDefaultInstance(C49942es.class, esVar);
    }

    private C49942es() {
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
                return newMessageInfo(f129805a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C49941er.f129804a});
            case 3:
                return new C49942es();
            case 4:
                return new C49940eq();
            case 5:
                return f129805a;
            case 6:
                C63010eb ebVar = f129806c;
                if (ebVar == null) {
                    synchronized (C49942es.class) {
                        ebVar = f129806c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129805a);
                            f129806c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
