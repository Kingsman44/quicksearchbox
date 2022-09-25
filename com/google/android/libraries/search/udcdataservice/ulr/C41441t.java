package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.t */
/* compiled from: PG */
public final class C41441t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C41441t f108229c;

    /* renamed from: d */
    private static volatile C63010eb f108230d;

    /* renamed from: a */
    public int f108231a;

    /* renamed from: b */
    public C41389e f108232b;

    static {
        C41441t tVar = new C41441t();
        f108229c = tVar;
        C62942bv.registerDefaultInstance(C41441t.class, tVar);
    }

    private C41441t() {
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
                return newMessageInfo(f108229c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C41441t();
            case 4:
                return new C41440s();
            case 5:
                return f108229c;
            case 6:
                C63010eb ebVar = f108230d;
                if (ebVar == null) {
                    synchronized (C41441t.class) {
                        ebVar = f108230d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108229c);
                            f108230d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
