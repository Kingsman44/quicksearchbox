package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67171p;

/* renamed from: com.google.android.libraries.search.n.bj */
/* compiled from: PG */
public final class C39361bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39361bj f103654c;

    /* renamed from: d */
    public static final C62940bt f103655d;

    /* renamed from: e */
    private static volatile C63010eb f103656e;

    /* renamed from: a */
    public int f103657a = 0;

    /* renamed from: b */
    public Object f103658b;

    static {
        C39361bj bjVar = new C39361bj();
        f103654c = bjVar;
        C62942bv.registerDefaultInstance(C39361bj.class, bjVar);
        f103655d = C62942bv.newSingularGeneratedExtension(C39670cx.f104424a, bjVar, bjVar, (C62958ce) null, 413019267, C63066gd.MESSAGE, C39361bj.class);
    }

    private C39361bj() {
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
                return newMessageInfo(f103654c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C67171p.class, C39359bh.m68764b()});
            case 3:
                return new C39361bj();
            case 4:
                return new C39360bi();
            case 5:
                return f103654c;
            case 6:
                C63010eb ebVar = f103656e;
                if (ebVar == null) {
                    synchronized (C39361bj.class) {
                        ebVar = f103656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103654c);
                            f103656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
