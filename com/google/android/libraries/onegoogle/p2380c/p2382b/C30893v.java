package com.google.android.libraries.onegoogle.p2380c.p2382b;

import com.google.common.p4552o.aij;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.onegoogle.c.b.v */
/* compiled from: PG */
public final class C30893v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C30893v f83297c;

    /* renamed from: d */
    private static volatile C63010eb f83298d;

    /* renamed from: a */
    public int f83299a;

    /* renamed from: b */
    public aij f83300b;

    static {
        C30893v vVar = new C30893v();
        f83297c = vVar;
        C62942bv.registerDefaultInstance(C30893v.class, vVar);
    }

    private C30893v() {
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
                return newMessageInfo(f83297c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C30893v();
            case 4:
                return new C30892u();
            case 5:
                return f83297c;
            case 6:
                C63010eb ebVar = f83298d;
                if (ebVar == null) {
                    synchronized (C30893v.class) {
                        ebVar = f83298d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f83297c);
                            f83298d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
