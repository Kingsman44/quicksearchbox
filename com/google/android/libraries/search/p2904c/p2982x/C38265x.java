package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.x */
/* compiled from: PG */
public final class C38265x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38265x f101374c;

    /* renamed from: d */
    private static volatile C63010eb f101375d;

    /* renamed from: a */
    public int f101376a;

    /* renamed from: b */
    public C37662hi f101377b;

    static {
        C38265x xVar = new C38265x();
        f101374c = xVar;
        C62942bv.registerDefaultInstance(C38265x.class, xVar);
    }

    private C38265x() {
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
                return newMessageInfo(f101374c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C38265x();
            case 4:
                return new C38264w();
            case 5:
                return f101374c;
            case 6:
                C63010eb ebVar = f101375d;
                if (ebVar == null) {
                    synchronized (C38265x.class) {
                        ebVar = f101375d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101374c);
                            f101375d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
