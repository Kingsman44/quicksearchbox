package com.google.p335a.p336a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.a.a.b */
/* compiled from: PG */
public final class C6580b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C6580b f19567c;

    /* renamed from: d */
    private static volatile C63010eb f19568d;

    /* renamed from: a */
    public int f19569a;

    /* renamed from: b */
    public int f19570b;

    static {
        C6580b bVar = new C6580b();
        f19567c = bVar;
        C62942bv.registerDefaultInstance(C6580b.class, bVar);
    }

    private C6580b() {
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
                return newMessageInfo(f19567c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C6580b();
            case 4:
                return new C6579a();
            case 5:
                return f19567c;
            case 6:
                C63010eb ebVar = f19568d;
                if (ebVar == null) {
                    synchronized (C6580b.class) {
                        ebVar = f19568d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19567c);
                            f19568d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
