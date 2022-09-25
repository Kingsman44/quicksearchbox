package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mh */
/* compiled from: PG */
public final class C50147mh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50147mh f130367a;

    /* renamed from: c */
    private static volatile C63010eb f130368c;

    /* renamed from: b */
    private C62995dn f130369b = C62995dn.f170057a;

    static {
        C50147mh mhVar = new C50147mh();
        f130367a = mhVar;
        C62942bv.registerDefaultInstance(C50147mh.class, mhVar);
    }

    private C50147mh() {
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
                return newMessageInfo(f130367a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C50145mf.f130366a});
            case 3:
                return new C50147mh();
            case 4:
                return new C50146mg();
            case 5:
                return f130367a;
            case 6:
                C63010eb ebVar = f130368c;
                if (ebVar == null) {
                    synchronized (C50147mh.class) {
                        ebVar = f130368c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130367a);
                            f130368c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
