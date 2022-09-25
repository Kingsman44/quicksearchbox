package com.google.protos.p4892au;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.au.m */
/* compiled from: PG */
public final class C63835m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63835m f172629a;

    /* renamed from: c */
    private static volatile C63010eb f172630c;

    /* renamed from: b */
    private C62995dn f172631b = C62995dn.f170057a;

    static {
        C63835m mVar = new C63835m();
        f172629a = mVar;
        C62942bv.registerDefaultInstance(C63835m.class, mVar);
    }

    private C63835m() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f172629a, "\u0000\u0001\u0000\u0000\u0018\u0018\u0001\u0001\u0000\u0000\u00182", new Object[]{"b", C63834l.f172628a});
            case 3:
                return new C63835m();
            case 4:
                return new C63831i();
            case 5:
                return f172629a;
            case 6:
                C63010eb ebVar = f172630c;
                if (ebVar == null) {
                    synchronized (C63835m.class) {
                        ebVar = f172630c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172629a);
                            f172630c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
