package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lr */
/* compiled from: PG */
public final class C14504lr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14504lr f43872b;

    /* renamed from: c */
    private static volatile C63010eb f43873c;

    /* renamed from: a */
    public int f43874a;

    static {
        C14504lr lrVar = new C14504lr();
        f43872b = lrVar;
        C62942bv.registerDefaultInstance(C14504lr.class, lrVar);
    }

    private C14504lr() {
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
                return newMessageInfo(f43872b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14504lr();
            case 4:
                return new C14503lq();
            case 5:
                return f43872b;
            case 6:
                C63010eb ebVar = f43873c;
                if (ebVar == null) {
                    synchronized (C14504lr.class) {
                        ebVar = f43873c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43872b);
                            f43873c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
