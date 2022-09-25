package com.google.android.apps.search.googleapp.discover.p10200l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.l.b */
/* compiled from: PG */
public final class C134458b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134458b f366195c;

    /* renamed from: d */
    private static volatile C63010eb f366196d;

    /* renamed from: a */
    public int f366197a;

    /* renamed from: b */
    public C63042fg f366198b;

    static {
        C134458b bVar = new C134458b();
        f366195c = bVar;
        C62942bv.registerDefaultInstance(C134458b.class, bVar);
    }

    private C134458b() {
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
                return newMessageInfo(f366195c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134458b();
            case 4:
                return new C134457a();
            case 5:
                return f366195c;
            case 6:
                C63010eb ebVar = f366196d;
                if (ebVar == null) {
                    synchronized (C134458b.class) {
                        ebVar = f366196d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366195c);
                            f366196d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
