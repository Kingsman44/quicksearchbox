package com.google.android.apps.gsa.shared.monet.p7070b.p7103t;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.t.b */
/* compiled from: PG */
public final class C90283b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C90283b f252156c;

    /* renamed from: d */
    private static volatile C63010eb f252157d;

    /* renamed from: a */
    public int f252158a;

    /* renamed from: b */
    public int f252159b;

    static {
        C90283b bVar = new C90283b();
        f252156c = bVar;
        C62942bv.registerDefaultInstance(C90283b.class, bVar);
    }

    private C90283b() {
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
                return newMessageInfo(f252156c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C90283b();
            case 4:
                return new C90282a();
            case 5:
                return f252156c;
            case 6:
                C63010eb ebVar = f252157d;
                if (ebVar == null) {
                    synchronized (C90283b.class) {
                        ebVar = f252157d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252156c);
                            f252157d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
