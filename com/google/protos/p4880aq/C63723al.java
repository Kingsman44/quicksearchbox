package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.al */
/* compiled from: PG */
public final class C63723al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63723al f172284c;

    /* renamed from: d */
    private static volatile C63010eb f172285d;

    /* renamed from: a */
    public C62961ch f172286a = emptyIntList();

    /* renamed from: b */
    public C62961ch f172287b = emptyIntList();

    static {
        C63723al alVar = new C63723al();
        f172284c = alVar;
        C62942bv.registerDefaultInstance(C63723al.class, alVar);
    }

    private C63723al() {
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
                return newMessageInfo(f172284c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
            case 3:
                return new C63723al();
            case 4:
                return new C63722ak();
            case 5:
                return f172284c;
            case 6:
                C63010eb ebVar = f172285d;
                if (ebVar == null) {
                    synchronized (C63723al.class) {
                        ebVar = f172285d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172284c);
                            f172285d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
