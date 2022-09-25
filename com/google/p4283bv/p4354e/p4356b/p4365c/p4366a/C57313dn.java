package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.c.a.dn */
/* compiled from: PG */
public final class C57313dn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57313dn f152981c;

    /* renamed from: d */
    public static final C62940bt f152982d;

    /* renamed from: e */
    private static volatile C63010eb f152983e;

    /* renamed from: a */
    public int f152984a;

    /* renamed from: b */
    public C57282cj f152985b;

    static {
        C57313dn dnVar = new C57313dn();
        f152981c = dnVar;
        C62942bv.registerDefaultInstance(C57313dn.class, dnVar);
        f152982d = C62942bv.newSingularGeneratedExtension(C57338u.f153181p, dnVar, dnVar, (C62958ce) null, 363213027, C63066gd.MESSAGE, C57313dn.class);
    }

    private C57313dn() {
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
                return newMessageInfo(f152981c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57313dn();
            case 4:
                return new C57312dm();
            case 5:
                return f152981c;
            case 6:
                C63010eb ebVar = f152983e;
                if (ebVar == null) {
                    synchronized (C57313dn.class) {
                        ebVar = f152983e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152981c);
                            f152983e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
