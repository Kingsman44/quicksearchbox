package com.google.android.libraries.p11016ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.d */
/* compiled from: PG */
public final class C147702d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C147702d f398613c;

    /* renamed from: d */
    private static volatile C63010eb f398614d;

    /* renamed from: a */
    public boolean f398615a;

    /* renamed from: b */
    public int f398616b;

    static {
        C147702d dVar = new C147702d();
        f398613c = dVar;
        C62942bv.registerDefaultInstance(C147702d.class, dVar);
    }

    private C147702d() {
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
                return newMessageInfo(f398613c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C147702d();
            case 4:
                return new C147635c();
            case 5:
                return f398613c;
            case 6:
                C63010eb ebVar = f398614d;
                if (ebVar == null) {
                    synchronized (C147702d.class) {
                        ebVar = f398614d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398613c);
                            f398614d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
