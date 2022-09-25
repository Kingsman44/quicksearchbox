package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gr */
/* compiled from: PG */
public final class C142474gr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142474gr f386644c;

    /* renamed from: d */
    private static volatile C63010eb f386645d;

    /* renamed from: a */
    public int f386646a = 0;

    /* renamed from: b */
    public Object f386647b;

    static {
        C142474gr grVar = new C142474gr();
        f386644c = grVar;
        C62942bv.registerDefaultInstance(C142474gr.class, grVar);
    }

    private C142474gr() {
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
                return newMessageInfo(f386644c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C142487hd.class, C142470gn.class});
            case 3:
                return new C142474gr();
            case 4:
                return new C142473gq();
            case 5:
                return f386644c;
            case 6:
                C63010eb ebVar = f386645d;
                if (ebVar == null) {
                    synchronized (C142474gr.class) {
                        ebVar = f386645d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386644c);
                            f386645d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
