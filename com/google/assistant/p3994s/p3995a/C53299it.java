package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.it */
/* compiled from: PG */
public final class C53299it extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53299it f139731a;

    /* renamed from: c */
    private static volatile C63010eb f139732c;

    /* renamed from: b */
    private C62995dn f139733b = C62995dn.f170057a;

    static {
        C53299it itVar = new C53299it();
        f139731a = itVar;
        C62942bv.registerDefaultInstance(C53299it.class, itVar);
    }

    private C53299it() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f139731a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u0004࠲", new Object[]{"b", C53297ir.f139729a, C53298is.f139730a});
            case 3:
                return new C53299it();
            case 4:
                return new C53296iq();
            case 5:
                return f139731a;
            case 6:
                C63010eb ebVar = f139732c;
                if (ebVar == null) {
                    synchronized (C53299it.class) {
                        ebVar = f139732c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139731a);
                            f139732c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
