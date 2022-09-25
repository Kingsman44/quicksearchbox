package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.uf */
/* compiled from: PG */
public final class C52505uf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52505uf f137834c;

    /* renamed from: d */
    private static volatile C63010eb f137835d;

    /* renamed from: a */
    public int f137836a;

    /* renamed from: b */
    public C52397qf f137837b;

    static {
        C52505uf ufVar = new C52505uf();
        f137834c = ufVar;
        C62942bv.registerDefaultInstance(C52505uf.class, ufVar);
    }

    private C52505uf() {
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
                return newMessageInfo(f137834c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52505uf();
            case 4:
                return new C52504ue();
            case 5:
                return f137834c;
            case 6:
                C63010eb ebVar = f137835d;
                if (ebVar == null) {
                    synchronized (C52505uf.class) {
                        ebVar = f137835d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137834c);
                            f137835d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
