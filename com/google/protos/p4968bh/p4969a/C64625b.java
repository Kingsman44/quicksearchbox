package com.google.protos.p4968bh.p4969a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bh.a.b */
/* compiled from: PG */
public final class C64625b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64625b f175177b;

    /* renamed from: d */
    private static volatile C63010eb f175178d;

    /* renamed from: a */
    public int f175179a;

    /* renamed from: c */
    private int f175180c;

    static {
        C64625b bVar = new C64625b();
        f175177b = bVar;
        C62942bv.registerDefaultInstance(C64625b.class, bVar);
    }

    private C64625b() {
        emptyIntList();
        emptyLongList();
        emptyLongList();
        emptyLongList();
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
                return newMessageInfo(f175177b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", C45240c.f118157a});
            case 3:
                return new C64625b();
            case 4:
                return new C64624a();
            case 5:
                return f175177b;
            case 6:
                C63010eb ebVar = f175178d;
                if (ebVar == null) {
                    synchronized (C64625b.class) {
                        ebVar = f175178d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175177b);
                            f175178d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
