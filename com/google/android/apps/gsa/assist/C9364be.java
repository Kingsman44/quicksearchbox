package com.google.android.apps.gsa.assist;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.be */
/* compiled from: PG */
public final class C9364be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9364be f32516c;

    /* renamed from: d */
    private static volatile C63010eb f32517d;

    /* renamed from: a */
    public int f32518a;

    /* renamed from: b */
    public C9363bd f32519b;

    static {
        C9364be beVar = new C9364be();
        f32516c = beVar;
        C62942bv.registerDefaultInstance(C9364be.class, beVar);
    }

    private C9364be() {
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
                return newMessageInfo(f32516c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9364be();
            case 4:
                return new C9361bb();
            case 5:
                return f32516c;
            case 6:
                C63010eb ebVar = f32517d;
                if (ebVar == null) {
                    synchronized (C9364be.class) {
                        ebVar = f32517d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32516c);
                            f32517d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
