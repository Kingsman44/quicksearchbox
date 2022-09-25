package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bj */
/* compiled from: PG */
public final class C14226bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14226bj f43052c;

    /* renamed from: d */
    private static volatile C63010eb f43053d;

    /* renamed from: a */
    public int f43054a;

    /* renamed from: b */
    public boolean f43055b;

    static {
        C14226bj bjVar = new C14226bj();
        f43052c = bjVar;
        C62942bv.registerDefaultInstance(C14226bj.class, bjVar);
    }

    private C14226bj() {
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
                return newMessageInfo(f43052c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14226bj();
            case 4:
                return new C14224bh();
            case 5:
                return f43052c;
            case 6:
                C63010eb ebVar = f43053d;
                if (ebVar == null) {
                    synchronized (C14226bj.class) {
                        ebVar = f43053d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43052c);
                            f43053d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
