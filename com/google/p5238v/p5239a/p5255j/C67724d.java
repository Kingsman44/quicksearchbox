package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.d */
/* compiled from: PG */
public final class C67724d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67724d f183745c;

    /* renamed from: d */
    private static volatile C63010eb f183746d;

    /* renamed from: a */
    public int f183747a;

    /* renamed from: b */
    public C67766f f183748b;

    static {
        C67724d dVar = new C67724d();
        f183745c = dVar;
        C62942bv.registerDefaultInstance(C67724d.class, dVar);
    }

    private C67724d() {
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
                return newMessageInfo(f183745c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C67724d();
            case 4:
                return new C67697c();
            case 5:
                return f183745c;
            case 6:
                C63010eb ebVar = f183746d;
                if (ebVar == null) {
                    synchronized (C67724d.class) {
                        ebVar = f183746d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183745c);
                            f183746d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
