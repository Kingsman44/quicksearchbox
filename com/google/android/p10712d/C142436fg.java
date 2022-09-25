package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fg */
/* compiled from: PG */
public final class C142436fg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142436fg f386506c;

    /* renamed from: d */
    private static volatile C63010eb f386507d;

    /* renamed from: a */
    public int f386508a;

    /* renamed from: b */
    public boolean f386509b;

    static {
        C142436fg fgVar = new C142436fg();
        f386506c = fgVar;
        C62942bv.registerDefaultInstance(C142436fg.class, fgVar);
    }

    private C142436fg() {
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
                return newMessageInfo(f386506c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142436fg();
            case 4:
                return new C142435ff();
            case 5:
                return f386506c;
            case 6:
                C63010eb ebVar = f386507d;
                if (ebVar == null) {
                    synchronized (C142436fg.class) {
                        ebVar = f386507d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386506c);
                            f386507d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
