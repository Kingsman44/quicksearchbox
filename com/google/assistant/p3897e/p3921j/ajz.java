package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ajz */
/* compiled from: PG */
public final class ajz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ajz f135251a;

    /* renamed from: c */
    private static volatile C63010eb f135252c;

    /* renamed from: b */
    private C62995dn f135253b = C62995dn.f170057a;

    static {
        ajz ajz = new ajz();
        f135251a = ajz;
        C62942bv.registerDefaultInstance(ajz.class, ajz);
    }

    private ajz() {
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
                return newMessageInfo(f135251a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ajy.f135250a});
            case 3:
                return new ajz();
            case 4:
                return new ajv();
            case 5:
                return f135251a;
            case 6:
                C63010eb ebVar = f135252c;
                if (ebVar == null) {
                    synchronized (ajz.class) {
                        ebVar = f135252c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135251a);
                            f135252c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
