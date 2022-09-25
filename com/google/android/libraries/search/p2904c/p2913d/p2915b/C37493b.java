package com.google.android.libraries.search.p2904c.p2913d.p2915b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.d.b.b */
/* compiled from: PG */
public final class C37493b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37493b f99541c;

    /* renamed from: d */
    private static volatile C63010eb f99542d;

    /* renamed from: a */
    public int f99543a;

    /* renamed from: b */
    public int f99544b;

    static {
        C37493b bVar = new C37493b();
        f99541c = bVar;
        C62942bv.registerDefaultInstance(C37493b.class, bVar);
    }

    private C37493b() {
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
                return newMessageInfo(f99541c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37493b();
            case 4:
                return new C37492a();
            case 5:
                return f99541c;
            case 6:
                C63010eb ebVar = f99542d;
                if (ebVar == null) {
                    synchronized (C37493b.class) {
                        ebVar = f99542d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99541c);
                            f99542d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
