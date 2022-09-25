package com.google.android.libraries.search.p2871b.p2900n.p2901a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.b.n.a.b */
/* compiled from: PG */
public final class C37301b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37301b f99117c;

    /* renamed from: d */
    private static volatile C63010eb f99118d;

    /* renamed from: a */
    public int f99119a = 0;

    /* renamed from: b */
    public Object f99120b;

    static {
        C37301b bVar = new C37301b();
        f99117c = bVar;
        C62942bv.registerDefaultInstance(C37301b.class, bVar);
    }

    private C37301b() {
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
                return newMessageInfo(f99117c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ဵ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C37301b();
            case 4:
                return new C37300a();
            case 5:
                return f99117c;
            case 6:
                C63010eb ebVar = f99118d;
                if (ebVar == null) {
                    synchronized (C37301b.class) {
                        ebVar = f99118d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99117c);
                            f99118d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
