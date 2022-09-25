package com.google.lens.p4705i.p4706a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.b */
/* compiled from: PG */
public final class C62371b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62371b f168378c;

    /* renamed from: d */
    private static volatile C63010eb f168379d;

    /* renamed from: a */
    public int f168380a = 0;

    /* renamed from: b */
    public Object f168381b;

    static {
        C62371b bVar = new C62371b();
        f168378c = bVar;
        C62942bv.registerDefaultInstance(C62371b.class, bVar);
    }

    private C62371b() {
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
                return newMessageInfo(f168378c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C62373d.class, C62385p.class});
            case 3:
                return new C62371b();
            case 4:
                return new C62368a();
            case 5:
                return f168378c;
            case 6:
                C63010eb ebVar = f168379d;
                if (ebVar == null) {
                    synchronized (C62371b.class) {
                        ebVar = f168379d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168378c);
                            f168379d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
