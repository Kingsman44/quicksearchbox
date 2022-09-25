package com.google.protos.p4841al.p4842a.p4844b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.al.a.b.b */
/* compiled from: PG */
public final class C63299b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63299b f171063c;

    /* renamed from: e */
    private static volatile C63010eb f171064e;

    /* renamed from: a */
    public C63301d f171065a;

    /* renamed from: b */
    public float f171066b;

    /* renamed from: d */
    private int f171067d;

    static {
        C63299b bVar = new C63299b();
        f171063c = bVar;
        C62942bv.registerDefaultInstance(C63299b.class, bVar);
    }

    private C63299b() {
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
                return newMessageInfo(f171063c, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ခ\u0004", new Object[]{"d", "a", "b"});
            case 3:
                return new C63299b();
            case 4:
                return new C63298a();
            case 5:
                return f171063c;
            case 6:
                C63010eb ebVar = f171064e;
                if (ebVar == null) {
                    synchronized (C63299b.class) {
                        ebVar = f171064e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171063c);
                            f171064e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
