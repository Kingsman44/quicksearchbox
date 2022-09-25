package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gs */
/* compiled from: PG */
public final class C14370gs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14370gs f43489c;

    /* renamed from: d */
    private static volatile C63010eb f43490d;

    /* renamed from: a */
    public int f43491a;

    /* renamed from: b */
    public C14368gq f43492b;

    static {
        C14370gs gsVar = new C14370gs();
        f43489c = gsVar;
        C62942bv.registerDefaultInstance(C14370gs.class, gsVar);
    }

    private C14370gs() {
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
                return newMessageInfo(f43489c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C14370gs();
            case 4:
                return new C14369gr();
            case 5:
                return f43489c;
            case 6:
                C63010eb ebVar = f43490d;
                if (ebVar == null) {
                    synchronized (C14370gs.class) {
                        ebVar = f43490d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43489c);
                            f43490d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
