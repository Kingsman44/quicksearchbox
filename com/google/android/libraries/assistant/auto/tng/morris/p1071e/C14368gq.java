package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gq */
/* compiled from: PG */
public final class C14368gq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14368gq f43485c;

    /* renamed from: d */
    private static volatile C63010eb f43486d;

    /* renamed from: a */
    public int f43487a;

    /* renamed from: b */
    public int f43488b;

    static {
        C14368gq gqVar = new C14368gq();
        f43485c = gqVar;
        C62942bv.registerDefaultInstance(C14368gq.class, gqVar);
    }

    private C14368gq() {
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
                return newMessageInfo(f43485c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C14368gq();
            case 4:
                return new C14367gp();
            case 5:
                return f43485c;
            case 6:
                C63010eb ebVar = f43486d;
                if (ebVar == null) {
                    synchronized (C14368gq.class) {
                        ebVar = f43486d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43485c);
                            f43486d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
