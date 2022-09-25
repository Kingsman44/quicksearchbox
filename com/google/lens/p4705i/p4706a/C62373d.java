package com.google.lens.p4705i.p4706a;

import com.google.android.libraries.p1657ba.p1664c.p1666b.p1667a.C19648b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.d */
/* compiled from: PG */
public final class C62373d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62373d f168382c;

    /* renamed from: d */
    private static volatile C63010eb f168383d;

    /* renamed from: a */
    public int f168384a = 0;

    /* renamed from: b */
    public Object f168385b;

    static {
        C62373d dVar = new C62373d();
        f168382c = dVar;
        C62942bv.registerDefaultInstance(C62373d.class, dVar);
    }

    private C62373d() {
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
                return newMessageInfo(f168382c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C19668f.class, C19648b.class});
            case 3:
                return new C62373d();
            case 4:
                return new C62372c();
            case 5:
                return f168382c;
            case 6:
                C63010eb ebVar = f168383d;
                if (ebVar == null) {
                    synchronized (C62373d.class) {
                        ebVar = f168383d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168382c);
                            f168383d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
